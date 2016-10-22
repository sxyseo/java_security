package com.leyiwo.com.leyiwo.cor.hadler;

/**
 * Created by leyiwo on 2016/10/22.
 */
public class PriceHandlerFactory {
    /***
     *创建PriceHandler的工厂方法
     * @return
     */
    public static PriceHandler createPriceHandler() {

        PriceHandler sales = new Sales();

        PriceHandler lead = new Lead();

        PriceHandler man = new Manager();

        PriceHandler dir = new Director();

        PriceHandler vp = new VicePresident();

        PriceHandler ceo = new CEO();

        sales.setSuccessor(man);
        lead.setSuccessor(lead);
        man.setSuccessor(dir);
        dir.setSuccessor(vp);
        vp.setSuccessor(ceo);

        return sales;
    }
}
