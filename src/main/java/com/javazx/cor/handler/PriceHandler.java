package com.javazx.cor.handler;

/**
 * @author: itmrchen
 * @Description: 价格处理人 负责处理客户的折扣请求
 * @date 2019/8/1 1:14
 */
public abstract class PriceHandler {
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣请求
     *
     * @param discount
     */
    public abstract void processDiscount(float discount);

    /**
     * 创建PriceHandler的工厂方法
     *
     * @return
     */
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler man = new Manager();
        PriceHandler dir = new Director();
        PriceHandler ceo = new Ceo();
        sales.setSuccessor(man);
        man.setSuccessor(dir);
        dir.setSuccessor(ceo);
        return sales;
    }
}
