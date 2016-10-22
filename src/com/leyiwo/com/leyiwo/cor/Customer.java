package com.leyiwo.com.leyiwo.cor;

import com.leyiwo.com.leyiwo.cor.hadler.PriceHandler;
import com.leyiwo.com.leyiwo.cor.hadler.PriceHandlerFactory;

import java.util.Random;

/**
 * 客户，请求折扣
 * Created by leyiwo on 2016/10/22.
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random rand = new Random();

        for (int i = 1; i < 100; i++){
            System.out.println(i + ":");
            customer.requestDiscount(rand.nextFloat());
        }

    }
}
