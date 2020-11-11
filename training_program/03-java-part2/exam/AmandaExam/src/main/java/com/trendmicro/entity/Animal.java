package com.trendmicro.entity;

/***
 *  动物类；储存动物的基本信息；
 */
public class Animal {
    private String name;
    private int age;
    private String kind;

    //构造动物名字，年龄，种类
    public Animal(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public void food() {
        // 控制台输出动物的喜欢的事物
        System.out.println("我喜欢吃多春鱼！");
    }

    /**
     * 动物自我介绍
     */
    public void selfIntroduction() {
        // 控制台输出动物的信息
        System.out.println("我是" + this.name + "，今年" + this.age + "岁了，我是" + this.kind);
    }

}