package com.javazx.scope;

import lombok.Data;

/**
 * @author: chenbo
 * @Description:
 * @date 2019/9/4 1:15
 */
@Data
public abstract class Bean2 {
    //private Bean1 bean1;

    //方法注入
    protected abstract Bean1 createBean1();

}
