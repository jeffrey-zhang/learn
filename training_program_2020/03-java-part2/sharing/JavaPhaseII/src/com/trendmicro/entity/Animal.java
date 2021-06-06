package com.trendmicro.model;

/***
 *  动物类；储存动物的基本信息；
 */
public class Animal {
    private String name;
    private int age;
    private String kind;
    private String color;

    /**
     * 无参构造
     */
    public Animal() {
    }

    /**
     * 有参构造
     *
     * @param name 动物名字
     * @param age  动物年龄
     * @param kind 动物种类
     */
    public Animal(String name, int age, String kind, String color) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.color = color;
    }

    /**
     * 动物发出叫声
     */
    public void outSound() {
        // 控制台输出动物的叫声
        System.out.println("我会：汪汪汪！");
    }

    /**
     * 动物自我介绍
     */
    public void selfIntroduction() {
        // 控制台输出动物的信息
        System.out.println("大家好，我叫" + this.name + "，今年" + this.age + "岁了，我是一只" + this.kind);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}