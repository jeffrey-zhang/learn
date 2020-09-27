package com.trendmicro.entity;
/**
 * 海豚类
 */
public class Dolphin extends Animal {

    public Dolphin() {
    }

    public Dolphin(String name, String food) {
        super(name, food);
    }
    /**
     * 海豚会游泳
     */
    public void swim(){
        System.out.println("看我快乐的游泳吧！");
    }
}
