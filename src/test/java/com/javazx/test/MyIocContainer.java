package com.javazx.test;

import com.javazx.myioc.IocContainer;
import com.javazx.myioc.car.AudiCar;
import com.javazx.myioc.car.BuickCar;
import com.javazx.myioc.humen.Humen;
import com.javazx.myioc.humen.Lisi;
import com.javazx.myioc.humen.ZhangSan;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: chenbo
 * @Description: 自己实现的IOC容器测试类
 * @date 2019/9/3 1:41
 */
public class MyIocContainer {
    private IocContainer iocContainer = new IocContainer();

    @Before
    public void init() {
        iocContainer.setBeans(AudiCar.class, "audi");
        iocContainer.setBeans(BuickCar.class, "buick");
        iocContainer.setBeans(ZhangSan.class, "zhangsan", "buick");
        iocContainer.setBeans(Lisi.class, "lisi", "audi");
    }

    @Test
    public void testIoc() {
        Humen zhangsan = (Humen) iocContainer.getBean("zhangsan");
        zhangsan.gohome();
        System.out.println("-----------------------------------------");
        Humen lisi = (Humen) iocContainer.getBean("lisi");
        lisi.gohome();
    }
}
