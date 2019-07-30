package com.javazx.po;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/7/30 0:26
 */
public abstract class Bean2 {
    protected abstract Bean3 createBean3();

    public void getBean3(){
        System.out.println(createBean3().toString());
    }
}
