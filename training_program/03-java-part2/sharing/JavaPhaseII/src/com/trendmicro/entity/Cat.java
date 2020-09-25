package com.trendmicro.entity;

/***
 * 小猫类继承自动物类
 * 储存猫相关的信息
 */
public class Cat extends Animal {
    /**
     * 爱好
     */
    private String favorite;

    /**
     * 无参构造；默认
     */
    public Cat() {
        super();
    }

    /**
     * 有参构造；
     *
     * @param name
     * @param age
     * @param kind
     */
    public Cat(String name, int age, String kind,String color) {
        super(name, age, kind,color);
    }

    /**
     * 有参构造；
     *
     * @param name
     * @param age
     * @param kind
     * @param favorite 方法的重载
     */
    public Cat(String name, int age, String kind, String color,String favorite) {
        super(name, age, kind,color);
        this.favorite = favorite;
    }

    /**
     * cat类重写自我介绍方法
     */
    @Override
    public void selfIntroduction() {
        // 引用父类的方法
        super.selfIntroduction();
        // 控制台输出小猫的爱好
        System.out.println("我的爱好是" + this.favorite + "。");
    }

    /**
     * 重写父类的发出声音方法
     */
    @Override
    public void outSound() {
        System.out.println("我的叫声是：喵喵喵");
    }
}
