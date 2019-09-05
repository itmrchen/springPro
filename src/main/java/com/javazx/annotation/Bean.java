package com.javazx.annotation;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author itmrchen
 * @date 2019/9/5 0:42
 */
@Component
@Lazy
public class Bean {
    public Bean() {
        System.out.println("bean init ");
    }
}
