package com.leyiwo.com.leyiwo.cor.hadler;

/**
 * Created by leyiwo on 2016/10/22.
 */
public class CEO extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.55){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
//            successor.processDiscount(discount);
            System.out.format("%s拒绝了折扣：%.2f%n", this.getClass().getName(), discount);
        }
    }
}
