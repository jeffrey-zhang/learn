package com.trendmicro.entity;

/**
 * 继承动物类 储存狗的信息
 */

public class Dog extends Animal {
    private String type;

    /**
     * 无参构造
     */
    public Dog() {
        super();
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * 有参构造
     */
    public Dog(String name, int age, String kind, String type) {
        super(name, age, kind);
        this.type = type;
    }

    /**
     * 重写父类方法
     */

    public void selfIntroduction() {
        // 引用父类方法
        super.selfIntroduction();
        System.out.println("我是一直勇猛的" + this.type + "。");
    }

    /**
     * 重载吃的方法
     */
    @Override
    public void eat() {
        System.out.println("我爱吃肉。");

    }

    /**
     * 小狗技能
     */
    public void skill() {
        System.out.println("我可以抓坏人。");
    }

}
