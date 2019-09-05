package com.javazx.test.springbeaninitdestory;

import com.javazx.springbeaninitdestory.MyConfiguration;
import com.javazx.springbeaninitdestory.TestBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author itmrchen
 * @date 2019/9/6 1:14
 */
public class BeanTest {

    @Test
    public void test() {
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
        TestBean testBean = applicationContext.getBean("testBean", TestBean.class);
        System.out.println("TestBean.test:" + testBean);
        applicationContext.close();
    }
}
