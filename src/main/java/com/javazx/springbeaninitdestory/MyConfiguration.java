package com.javazx.springbeaninitdestory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author itmrchen
 * @date 2019/9/6 1:10
 */
@Configuration
@ComponentScan("com.javazx.springbeaninitdestory")
public class MyConfiguration {
    @Bean(initMethod = "onInit1", destroyMethod = "onDestory1")
    public TestBean testBean() {
        return new TestBean();
    }
}
