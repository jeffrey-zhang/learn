package com.trendmicro.entity;

public class Animal {
    /**
     * 动物园，定义动物信息
     */
    private String name;
    private int age;
    private String kind;

    /**
     * 无参构造方法
     */
    public Animal() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    /**
     * 有参构造方法
     * 
     * @param name 定义名字
     * @param age  定义年龄
     * @param kind 定义种类
     */
    public Animal(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    /**
     * 动物自我介绍
     */
    public void selfIntroduction() {
        System.out.println("大家好，我叫" + this.name + ", 今年" + this.age + "岁了, 是一只" + this.kind + "。");
    }

    public void eat() {
        System.out.println("我爱吃虫子");
    }
}
