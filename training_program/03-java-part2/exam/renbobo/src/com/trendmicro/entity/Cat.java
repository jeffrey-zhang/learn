package com.trendmicro.entity;

/**
 * 猫类
 */
public class Cat extends Animal {
    /**
     * 品种
     */
    private String kind;
    /**
     * get方法
     */
    public String getKind() {
        return kind;
    }
    /**
     * set方法
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    public Cat(String name, String food, String kind) {
        super(name, food);
        this.kind = kind;
    }
    /**
     * 喵咪会抓老鼠的行为
     */
    public void  catchMouse(){
        System.out.println("我会抓老鼠哦");
    }
}
