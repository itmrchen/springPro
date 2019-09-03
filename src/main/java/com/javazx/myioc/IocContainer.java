package com.javazx.myioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: itmrchen
 * @Description:IOC容器
 * @date 2019/9/3 0:28
 * 1、实例化bean
 * 2、保存bean
 * 3、提供bean
 * 4、每个bean要产生唯一的一个ID与之对应
 */
public class IocContainer {
    private Map<String, Object> beans = new ConcurrentHashMap<String, Object>(16);

    /**
     * 根据beanId获取bean
     *
     * @param beanId
     * @return
     */
    public Object getBean(String beanId) {
        return beans.get(beanId);
    }

    /**
     * 委托IOC容器创建bean
     *
     * @param clazz        要创建bean的Class
     * @param beanId       beanId
     * @param paramBeanIds 要创建的bean的class构造方法所需要的beanId集合
     */
    public void setBeans(Class<?> clazz, String beanId, String... paramBeanIds) {
        //组装构造方法所需要的参数值
        Object[] paramValues = new Object[paramBeanIds.length];
        for (int i = 0; i < paramValues.length; i++) {
            paramValues[i] = beans.get(paramBeanIds[i]);
        }
        //调用构造方法实例化bean
        Object bean = null;
        for (Constructor<?> constructor : clazz.getConstructors()) {
            try {
                bean = constructor.newInstance(paramValues);
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        }
        if (bean == null) {
            throw new RuntimeException("找不到要实例化的bean");
        }
        //将实例放入到ioc容器
        beans.put(beanId, bean);
    }
}
