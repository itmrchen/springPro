package com.javazx.cor.handler;

/**
 * @author: itmrchen
 * @Description: 销售总监可以批准40%以内的折扣
 * @date 2019/8/1 1:26
 */
public class Director extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.4) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}