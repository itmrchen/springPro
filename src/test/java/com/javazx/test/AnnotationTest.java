package com.javazx.test;

import com.javazx.po.annotation.Bean1;
import com.javazx.po.annotation.MyConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author: itmrchen
 * @Description:注解测试类
 * @date 2019/7/31 0:22
 */
public class AnnotationTest {
    @Test
    public void test() {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
        /*for (int i = 0; i < 10; i++) {
            System.out.println("bean1 = " + ctx.getBean("bean1"));
            ctx.getBean("bean1", Bean1.class).printBean2();
        }*/
        ctx.getBean("bean2");
        ctx.close();

    }
}
