package com.trendmicro.entity;
/***
 * 海豚继承自动物类
 * 储存海豚相关的信息
 */
public class Dolphin extends Animal {
    /**
     * 技能
     */
    private String skill;

    //构造海豚
    public Dolphin(String name, int age, String kind, String skill) {
        super(name,age,kind);
        this.skill= skill;
    }

    /**
     * 海豚类重写自我介绍方法
     */
    @Override
    public void selfIntroduction() {
        // 引用父类的方法
        super.selfIntroduction();
        // 控制台输出海豚的爱好
        System.out.println("我会" + this.skill + "。");
    }

    /**
     * 重写父类food方法
     */
    @Override
    public void food() {
        System.out.println("我喜欢吃鱼！");
    }
}
