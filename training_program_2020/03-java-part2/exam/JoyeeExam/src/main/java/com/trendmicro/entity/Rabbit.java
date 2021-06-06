package com.trendmicro.entity;

public class Rabbit extends Animal {
    private String character;

    public Rabbit() {
        super();
    }

    public Rabbit(String name, int age, String kind, String character) {
        super(name, age, kind);
        this.character = character;

    }

    /**
     * 重写父类方法
     */

    public void selfIntroduction() {
        // 引用父类方法
        super.selfIntroduction();
        System.out.println("我有" + this.character + "。");

    }

    /**
     * 重载吃的动作
     */
    @Override
    public void eat() {
        System.out.println("我爱吃胡萝卜。");

    }

    /**
     * 兔子技能
     */

    public void hobby() {
        System.out.println("喜欢蹦蹦跳跳。");
    }
}
