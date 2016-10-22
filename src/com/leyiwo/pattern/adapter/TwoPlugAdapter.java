package com.leyiwo.pattern.adapter;

/**
 * 二相转三相的适配器
 * Created by leyiwo on 2016/10/22.
 */
public class TwoPlugAdapter extends ThreePlugIf {

    private GBTwoPlug plug;


    public TwoPlugAdapter(GBTwoPlug plug){
        this.plug = plug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转换");
        plug.powerWithTwo();
    }
}
