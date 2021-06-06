package com.trendmicro.entity;
/**
 * 大象类
 */
public class Elephant extends Animal {



    public Elephant() {
    }

    public Elephant(String name, String food) {
        super(name, food);
    }
    /**
     * 大象会搏斗
     */
    public void fight(){
        System.out.println("别搭理我，不然我会拿我的象牙顶你！");
    }

}
