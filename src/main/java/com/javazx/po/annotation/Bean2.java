package com.javazx.po.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/7/31 1:11
 */
@Component
//@Scope("prototype")
public class Bean2 implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("Bean2.destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean2.afterPropertiesSet");
    }

    /**
     * bean初始化顺序 Constructor >> @Autowired >> @PostConstruct @PostConstruct
     */
    @PostConstruct
    public void onInit(){
        System.out.println("Bean2.onInit");
    }
    @PreDestroy
    public void onDestroy(){
        System.out.println("Bean2.onDestroy");
    }
}
