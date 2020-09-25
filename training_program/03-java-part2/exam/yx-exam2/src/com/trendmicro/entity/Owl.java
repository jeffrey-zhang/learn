package com.trendmicro.entity;

public class Owl extends Animal{

    public Owl(){
        super();

    }
    public Owl(String name, String feature) {
        super(name, feature);
    }
    @Override
    public void introduce(){
        // 猫头鹰自我介绍
        System.out.print("Hi，我是一只猫头鹰。");
        super.introduce();
    }
    @Override
    public void eat(){
        System.out.println("猫头鹰正在吃小老鼠呢，向它打个招呼吧（输入Hi/hi）");
    }

    /**
     * 猫头鹰飞行
     */
    public void fly(){
        System.out.println("猫头鹰张开翅膀飞走了，你赢了");
    }

    /**
     * 猫头鹰对视
     */
    public void eye(){
        System.out.println("猫头鹰眼睛一直盯你。");
    }

    /**
     * 猫头鹰捕食
     */
    public void grab(){
        System.out.println("猫头鹰抓住一只小老鼠。");
    }
}
