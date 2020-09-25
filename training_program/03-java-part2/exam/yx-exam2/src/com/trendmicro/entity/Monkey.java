package com.trendmicro.entity;

/**
 * 猴子信息
 */
public class Monkey extends Animal{

    public Monkey(){
        super();

    }

    public Monkey(String name, String feature) {
        super(name, feature);
    }

    @Override
    public void introduce(){
        // 自我介绍
        System.out.print("Hi，我是一只小猴子。");
        super.introduce();
    }

    @Override
    public void eat(){
        // 吃东西
        System.out.println("小猴子正在吃香蕉呢，向它打个招呼吧（输入Hi/hi）");
    }

    /**
     * 猴子捞月亮
     */
    public void fish(){
        System.out.println("小猴子和它的小伙伴一起倒挂着在水面捞月亮。");
    }

    /**
     * 猴子爬树
     */
    public void tree(){
        System.out.println("小猴子蹦跳着爬上了树");
    }

    /**
     * 猴子摘香蕉
     */
    public void down(){
        System.out.println("小猴子从树上拿下一根香蕉。");
    }
}
