package com.javazx.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author itmrchen
 * @date 2019/9/5 0:42
 */
@Configuration
@ComponentScan(value = "com.javazx.annotation")
public class MyConfiguration {

    /*@Bean
    public com.javazx.annotation.Bean bean() {
        return new com.javazx.annotation.Bean();
    }*/

    @Bean("stringList")
    public List<String> stringList(){
        List<String> list = new ArrayList<String>();
        list.add("111");
        return list;
    }

    /**
     * 这种会优先注入
     * @return
     */
    @Bean
    public String bean1(){
        return "333";
    }
}
