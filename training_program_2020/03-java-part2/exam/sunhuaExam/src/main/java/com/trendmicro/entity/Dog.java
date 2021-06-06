package com.trendmicro.entity;

public class Dog extends Animal{
    private String Skill;

    /**
     * 小狗类 储存狗的信息
     */
    public Dog(String name,int age,String kind,String color,String Skill){
        //继承父类的属性
        super(name, age, kind, color);
        // 新增的属于狗自己的特有技能
        this.Skill=Skill;
    }


    /**
     * 重写狗的自我介绍方法
     */
    @Override
    public void selfIntroduction(){
        //继承父类的方法
        super.selfIntroduction();
        // 狗的技能
        System.out.println("我的技能是"+this.Skill);
    }


    





}
