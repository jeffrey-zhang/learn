package com.trendmicro.entity;

public class Cat extends Animal{
    private String food;

    /**
     * 小狗类 储存狗的信息
     */
    /**
     * 
     * @param name
     * @param age
     * @param kind
     * @param color
     * @param food
     */
    public Cat(String name,int age,String kind,String color,String food){
        //继承父类的属性
        super(name, age, kind, color);
        // 新增的属于猫自己的喜欢的食物
        this.food=food;
    }


    /**
     * 重写猫的自我介绍方法
     */
    @Override
    public void selfIntroduction(){
        //继承父类的方法
        super.selfIntroduction();
        // 狗的技能
        System.out.println("我的特长是捉老鼠，家里有老鼠的来找我哦");
    }

    //Tree()方法
    public void Tree(){
        System.out.println("我们猫科共有的特长是爬树");
    }


    //eat()方法
    public void eat(){
        System.out.println("我最喜欢吃的食物是"+this.food);
    }


}
