package com.javazx.cor.handler;

/**
 * @author: itmrchen
 * @Description:销售经理可以批准30%以内的折扣
 * @date 2019/8/1 1:24
 */
public class Manager extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.3) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}