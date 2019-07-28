package com.javazx.test;

import com.javazx.po.Bean;
import com.javazx.po.JavazxwBean;
import com.javazx.po.JavazxwBean2;
import com.javazx.po.JavazxwBean3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
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


    }
}
