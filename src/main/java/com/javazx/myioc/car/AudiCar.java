package com.javazx.myioc.car;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/9/2 23:56
 */
public class AudiCar implements Car {
    public void start() {
        System.out.println("AudiCar start!");
    }

    public void turnLeft() {
        System.out.println("AudiCar turnLeft!");
    }

    public void turnRight() {
        System.out.println("AudiCar turnRight!");
    }

    public void stop() {
        System.out.println("AudiCar stop!");
    }
}
