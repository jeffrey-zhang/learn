package com.trendmicro.entity;
/***
 * 鹦鹉继承自动物类
 * 储存鹦鹉相关的信息
 */
public class Parrot extends Animal {
    /**
     * 技能
     */
    private String skill;

    //构造鹦鹉
    public Parrot(String name, int age, String kind, String skill) {
        super(name, age, kind);
        this.skill= skill;
    }

    /**
     * 鹦鹉类重写自我介绍方法
     */
    @Override
    public void selfIntroduction() {
        // 引用父类的方法
        super.selfIntroduction();
        // 控制台输出鹦鹉的爱好
        System.out.println("我会" + this.skill + "。");
    }

    /**
     * 重写父类的food方法
     */
    @Override
    public void food() {
        System.out.println("我喜欢吃谷子！");
    }
}
