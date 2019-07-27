package com.javazx.beanfactory;

import com.javazx.po.JavazxwBean2;

/**
 * @author: itmrchen
 * @Description: Java自学网bean的工厂类
 * @date 2019/7/27 17:26
 */
public class JavazxwBeanFactory {
    private static JavazxwBean2 getJavazxwBean2() {
        return new JavazxwBean2();
    }
}
