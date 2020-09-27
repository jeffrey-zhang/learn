package com.trendmicro.entity;

public class Bird extends Animal {
    private String action;

    public Bird() {
        super();
    }

    public Bird(String name, int age, String kind, String action) {
        super(name, age, kind);
        this.action = action;

    }

    /**
     * 重写父类方法
     */

    public void selfIntroduction() {
        // 引用父类方法
        super.selfIntroduction();
        System.out.println("我会" + this.action + "。");

    }

    /**
     * 重新吃的动作
     */
    @Override
    public void eat() {
        System.out.println("我爱吃虫子。");

    }

    /**
     * 小鸟技能
     */

    public void fly() {
        System.out.println("擅长自由翱翔。");
    }
}
