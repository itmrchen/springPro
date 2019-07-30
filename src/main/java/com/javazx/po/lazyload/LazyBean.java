package com.javazx.po.lazyload;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/7/30 22:42
 */
public class LazyBean implements InitializingBean,DisposableBean {
    public LazyBean() {
        System.out.println("bean被创建");
    }

    public void onInit() {
        System.out.println("bean初始化");
    }

    public void onDestroy() {
        System.out.println("bean销毁");
    }

    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
