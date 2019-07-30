package com.javazx.po.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/7/31 0:20
 */
@Configuration
@ComponentScan(value = "com.javazx.po.annotation")
public class MyConfiguration {
    /*@Bean
    public Bean1 bean1() {
        return new Bean1();
    }*/
}
