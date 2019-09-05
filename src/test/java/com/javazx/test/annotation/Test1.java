package com.javazx.test.annotation;

import com.javazx.annotation.Bean;
import com.javazx.annotation.MyBean;
import org.junit.Test;
import com.javazx.annotation.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author itmrchen
 * @date 2019/9/5 0:44
 */
public class Test1 {

    @Test
    public void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
        //Bean bean = applicationContext.getBean("bean", Bean.class);
        //System.out.println(bean);

        //构造方法完成属性值的注入
        /*MyBean myBean = applicationContext.getBean("myBean", MyBean.class);
        System.out.println("myBean:" + myBean);*/
    }
}
