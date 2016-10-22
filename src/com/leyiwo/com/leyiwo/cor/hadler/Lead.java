package com.leyiwo.com.leyiwo.cor.hadler;

/**
 * 销售小组长，可以批准15%以内的折扣
 * Created by leyiwo on 2016/10/22.
 */
public class Lead extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.15){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
