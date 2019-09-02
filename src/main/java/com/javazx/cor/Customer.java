package com.javazx.cor;

import com.javazx.cor.handler.PriceHandler;

/**
 * @author: itmrchen
 * @Description: 客户请求折扣
 * @date 2019/8/1 1:32
 */
public class Customer {
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandler.createPriceHandler());
        customer.requestDiscount(0.01f);
    }
}
