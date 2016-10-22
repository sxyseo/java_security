package com.leyiwo.com.leyiwo.cor.hadler;

/**
 * 销售人员可以批准5%的折扣
 * Created by leyiwo on 2016/10/22.
 */
public class Sales extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.05){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
