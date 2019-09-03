package com.javazx.test.scope;

import com.javazx.scope.Bean1;
import com.javazx.scope.Bean2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: chenbo
 * @Description:
 * @date 2019/9/4 1:19
 */
public class ScopeTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopeSpring.xml");
        Bean1 bean1_1 = (Bean1) applicationContext.getBean("bean1");
        System.out.println("bean1_1:" + bean1_1);
        Bean1 bean1_2 = (Bean1) applicationContext.getBean("bean1");
        System.out.println("bean1_2:" + bean1_2);
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        System.out.println("bean2:" + bean2);
        //spring的单例只限在同一个上下文
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("scopeSpring.xml");
        Bean1 bean1_11 = (Bean1) applicationContext1.getBean("bean1");
        System.out.println("bean1_11:" + bean1_11);
    }
}
