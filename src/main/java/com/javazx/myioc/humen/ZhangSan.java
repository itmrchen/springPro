package com.javazx.myioc.humen;

import com.javazx.myioc.car.Car;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/9/3 0:02
 */
public class ZhangSan extends HumenWithCar {
    public ZhangSan(Car car) {
        super(car);
    }

    @Override
    public void gohome() {
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
