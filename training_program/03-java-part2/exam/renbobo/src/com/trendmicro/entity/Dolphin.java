package com.trendmicro.entity;

public class Dolphin extends Animal {

    public Dolphin() {
    }

    public Dolphin(String name, String food) {
        super(name, food);
    }

    public void swim(){
        System.out.println("看我快乐的游泳吧！");
    }
}
