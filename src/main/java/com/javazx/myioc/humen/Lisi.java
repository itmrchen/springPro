package com.javazx.myioc.humen;

import com.javazx.myioc.car.Car;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/9/3 0:12
 */
public class Lisi extends HumenWithCar {
    public Lisi(Car car) {
        super(car);
    }

    @Override
    public void gohome() {
        car.start();
        car.stop();
    }
}
