package com.javazx.test;

import com.javazx.po.JavazxwBean;
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
        JavazxwBean bean = ctx.getBean("javazxwBean", JavazxwBean.class);
        System.out.println(bean);
    }
}
