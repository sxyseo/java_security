package com.leyiwo.com.leyiwo.cor.hadler;

/**
 * 销售副总监，可以批准40%以内的折扣
 * Created by leyiwo on 2016/10/22.
 */
public class Director extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.4){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
