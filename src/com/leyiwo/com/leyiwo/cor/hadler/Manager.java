package com.leyiwo.com.leyiwo.cor.hadler;

/**
 * 销售经理，可以批准30%以内的折扣
 * Created by leyiwo on 2016/10/22.
 */
public class Manager extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.3){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
