package com.leyiwo.pattern.adapter;

/**
 * Created by leyiwo on 2016/10/22.
 */
public class NoteBook {

    private ThreePlugIf plug;

    public NoteBook(ThreePlugIf plug){
        this.plug = plug;
    }

    //使用插座充电
    public void charge(){
        plug.powerWithThree();
    }

    public static void main(String[] args){
        GBTwoPlug two = new GBTwoPlug();
        ThreePlugIf three = new TwoPlugAdapter(two);
        NoteBook nb = new NoteBook(three);
        nb.charge();

//        three = new TwoPlugAdapterExtends(two);
//        nb = new NoteBook(three);
//        nb.charge();
    }

}
