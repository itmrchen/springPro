package com.javazx.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author itmrchen
 * @date 2019/9/5 1:55
 */
@Data
@Component
@Lazy
public class MyBean {
    private AnotherBean anotherBean1;
    private AnotherBean anotherBean2;


    /**
     * 属性注入
     */
    @Autowired
    private AnotherBean anotherBean3;

    private List<String> stringList;

    @Autowired
    @Qualifier("stringList")
    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    /**
     * set方法注入
     *
     * @param anotherBean2
     */
    @Autowired
    public void setAnotherBean2(AnotherBean anotherBean2) {
        this.anotherBean2 = anotherBean2;
    }

    /**
     * 构造方法完成属性值的注入
     *
     * @param anotherBean1
     */
    @Autowired
    public MyBean(AnotherBean anotherBean1) {
        this.anotherBean1 = anotherBean1;
    }
}
