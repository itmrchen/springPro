package com.javazx.myioc.car;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/9/2 23:56
 */
public class BuickCar implements Car {
    public void start() {
        System.out.println("BuickCar start!");
    }

    public void turnLeft() {
        System.out.println("BuickCar turnLeft!");
    }

    public void turnRight() {
        System.out.println("BuickCar turnRight!");
    }

    public void stop() {
        System.out.println("BuickCar stop!");
    }
}
