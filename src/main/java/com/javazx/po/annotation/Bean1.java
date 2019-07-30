package com.javazx.po.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/7/31 0:19
 */
@Component
@Scope("singleton")
public abstract class Bean1  {
    @Lookup
    protected abstract Bean2 getBean2();

    public void printBean2() {
        System.out.println("bean2 " + getBean2().toString());
    }

}
