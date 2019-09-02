package com.javazx.myioc.humen;

import com.javazx.myioc.car.Car;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/9/3 0:00
 */
public abstract class HumenWithCar implements Humen {
    protected Car car;

    public HumenWithCar(Car car) {
        this.car = car;
    }

    public abstract void gohome();
}
