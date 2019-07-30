package com.javazx.test;

import com.javazx.po.*;
import com.javazx.po.lazyload.LazyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: chenbo
 * @Description: spring测试类
 * @date 2019/7/27 15:39
 */

public class SpringTest {
    @Test
    public void initSpringBean() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        /**
         * 获取构造方法实例化javazxwBean
         */
        JavazxwBean bean = ctx.getBean("javazxwBean", JavazxwBean.class);
        System.out.println(bean);
        /**
         * 通过静态方法实例化javazxwBean2
         */
        JavazxwBean2 bean2 = ctx.getBean("javazxwBean2", JavazxwBean2.class);
        System.out.println(bean2);

        /**
         * 通过实例方法实例化javazxwBean2
         */
        JavazxwBean3 bean3 = ctx.getBean("javazxwBean3", JavazxwBean3.class);
        System.out.println(bean3);

        /**
         * 通过构造方法、set方法 注入bean
         */
        Bean bean4 = ctx.getBean("bean", Bean.class);
        System.out.println(bean4);

        Bean bean5 = ctx.getBean("bean", Bean.class);
        System.out.println(bean5.getStringList());
        System.out.println(bean5.getStringMap());
        System.out.println(bean5.getStringSet());
        System.out.println(bean5.getRoperties());
        System.out.println(bean5.getAnotherBeanList());
        System.out.println(bean5.getAnotherBeanMap());
        System.out.println(bean5.getAnotherBeanSet());

        /**
         * 方法注入
         */
        Bean2 b2 = ctx.getBean("bean2", Bean2.class);
        b2.getBean3();
        Bean2 b21 = ctx.getBean("bean2", Bean2.class);
        b21.getBean3();
        System.out.println(b2 == b21);

        /**
         * 自定义作用域双例bena
         */
        final ApplicationContext ctxScope = new ClassPathXmlApplicationContext("spring.xml");
        for (int i = 0; i < 10; i++) {
            Bean3 bean33 = ctxScope.getBean("bean3", Bean3.class);
            System.out.println("bean3 = " + bean33);
        }
        System.out.println("----------------------- 分隔符 ---------------------");
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    Bean3 bean33 = ctxScope.getBean("bean3", Bean3.class);
                    System.out.println("bean3 = " + bean33);
                }
            }).start();
        }

        /**
         * 自定义作用域双例bena
         */
        /*System.out.println("ApplicationContext加载完毕！");
        ctx.getBean("lazyBean",LazyBean.class);*/

        /**
         * bean初始化与销毁
         */
        AbstractApplicationContext ctxDestroy = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("ApplicationContext加载完毕！");
        ctxDestroy.getBean("lazyBean",LazyBean.class);
        ctxDestroy.close();

    }
}
