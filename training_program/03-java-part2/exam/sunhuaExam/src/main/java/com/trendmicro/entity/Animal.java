package com.trendmicro.entity;

public class Animal {
    /**
     * 球类：储存球类的基本信息
     */
    private String name;//名字
    private int age;//年龄
    private String kind;//种类
    private String color;//颜色
    


    /**
     * 
     * @param name
     * @param age
     * @param kind
     * @param color
     */
    public Animal(String name,int age,String kind,String color){
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.color = color;

    }

    /**
     * 动物的叫声
     */
    public void outSound(){
        System.out.println("我会：汪汪汪！");
    }


    /**
     * 自我介绍
     */
    public void selfIntroduction(){
         System.out.println("大家好，我叫"+this.name+"，我今年"+this.age+
         "岁了，我身上的颜色是"+this.color+"，我属于"+this.kind+"科动物");
    }
}
