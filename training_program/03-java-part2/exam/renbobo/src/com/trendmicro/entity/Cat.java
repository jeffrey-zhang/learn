package com.trendmicro.entity;

import javax.sound.midi.Soundbank;

/**
 * 猫类
 */
public class Cat extends Animal {
    /**
     * 品种
     */
    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Cat(String name, String food, String kind) {
        super(name, food);
        this.kind = kind;
    }

    public void  catchMouse(){
        System.out.println("我会抓老鼠哦");
    }
}
