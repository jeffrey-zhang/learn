package com.trendmicro.entity;

public class Tiger extends Animal{
    private String Sign;//标志

    /**
     * 老虎类 储存老虎的信息
     */
    /**
     * @param name
     * @param age
     * @param kind
     * @param color
     * @param Sign
     */
    public Tiger(String name,int age,String kind,String color,String Sign){
        //继承父类的属性
        super(name, age, kind, color);
        // 新增的属于猫自己的喜欢的食物
        this.Sign=Sign;
    }


    /**
     * 重写猫的自我介绍方法
     */
    @Override
    public void selfIntroduction(){
        //继承父类的方法
        super.selfIntroduction();
        // 狗的技能
        System.out.println("我的特长是奔跑");
    }

    //Tree()方法
    public void Tree1(){
        System.out.println("我们猫科共有的特长是爬树");
    }


    //Sign()方法
    public void Sign(){
        System.out.println("认识我最明显的标志是我头上有一个"+this.Sign+"字");
    }


}
