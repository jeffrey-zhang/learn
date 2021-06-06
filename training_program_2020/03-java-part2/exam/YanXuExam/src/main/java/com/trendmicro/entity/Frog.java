package com.trendmicro.entity;

/**
 * 青蛙信息
 */
public class Frog extends Animal{

    public Frog(){
        super();

    }
    public Frog(String name, String feature) {
        super(name, feature);
    }
    @Override
    public void introduce(){
        // 青蛙自我介绍
        System.out.print("Hi，我是一只小青蛙。");
        super.introduce();
    }
    @Override
    public void eat(){
        System.out.println("小青蛙正在吃昆虫，向它打个招呼吧（输入Hi/hi）");
    }
    /**
     * 小青蛙唱歌
     */
    public void call(){
        System.out.println("小青蛙发出呱呱呱的叫声。");
    }
    /**
     * 小青蛙跳跃
     */
    public void jump(){
        System.out.println("小青蛙从一个荷叶跳到了另一个荷叶。");
    }
    /**
     * 小青蛙抓虫子
     */
    public void food(){
        System.out.println("小青蛙伸出舌头捕食了一个害虫。");
    }
}
