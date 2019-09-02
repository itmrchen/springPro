package com.javazx.cor.handler;

/**
 * @author: itmrchen
 * @Description:CEO有权拒绝超过55%的折扣
 * @date 2019/8/1 1:28
 */
public class Ceo extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.55) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            System.out.format("%s拒绝了折扣：%.2f%n", this.getClass().getName(), discount);
        }
    }
}