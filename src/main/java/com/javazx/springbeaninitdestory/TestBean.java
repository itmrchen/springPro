package com.javazx.springbeaninitdestory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author itmrchen
 * @date 2019/9/6 1:11
 */

public class TestBean implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("TestBean.destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("TestBean.afterPropertiesSet");

    }

    /* @PostConstruct
     public void onInit() {
         System.out.println("TestBean.onInit");
     }

     @PreDestroy
     public void onDestory() {
         System.out.println("TestBean.onDestory");
     }*/
    public void onInit1() {
        System.out.println("TestBean.onInit1");
    }

    public void onDestory1() {
        System.out.println("TestBean.onDestory1");
    }
}
