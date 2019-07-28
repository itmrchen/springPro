package com.javazx.po;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/7/28 20:45
 */
@Data
public class Bean {
    private AnotherBean anotherBean;
    private String string;
    private AnotherBean anotherBean1;
    private String string1;

    private List<String> stringList;
    private List<AnotherBean> anotherBeanList;

    private Map<String, String> stringMap;
    private Map<AnotherBean,AnotherBean> anotherBeanMap;

    private Set<String> stringSet;
    private Set<AnotherBean> anotherBeanSet;

    private Properties roperties;

    public Bean(AnotherBean anotherBean, String string) {
        this.anotherBean = anotherBean;
        this.string = string;
    }
}
