package com.trendmicro.entity;


/**
 * 规定了所有动物的基本行为和特征
 */
public class Animal {
    /**
     * 动物的姓名
     */
    private String name ;

    /**
     * 动物喜欢的食物
     */
    private String food;


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


    /**
     * get方法
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set方法
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * 无参构造器
      */
    public Animal(){}

    /**
     * 全参构造器
     * @param name
     * @param food
     */
    public Animal(String name,String food) {
       this.name= name;
       this.food = food;
    }

    /**
     * 每个动物都有吃的行为
     */
    public void eat(){
        System.out.println("正在吃饭中");
    }

    /**
     * 每个动物都有睡觉的行为
     */
    public void sleep(){
        System.out.println("玩累了，去休息了");
    }

    public void intro(Animal animal){
        System.out.println("我的名字是"+animal.getName()+",我最喜欢的食物是"+animal.getFood());
    }
}
