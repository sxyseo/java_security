package com.leyiwo.com.leyiwo.cor.hadler;

/**
 * 价格代理人，负责处理客户折扣申请
 * Created by leyiwo on 2016/10/22.
 */
public abstract class PriceHandler {

    /***
     * 直接后继，用于传递请求
     */
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /***
     * 处理折扣申请
     */

    public abstract void processDiscount(float discount);


}
