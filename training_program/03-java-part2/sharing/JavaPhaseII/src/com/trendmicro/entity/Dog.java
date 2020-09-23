package com.trendmicro.model;

/***
 * 小狗类
 * 储存狗相关的信息
 */
public class Dog extends Animal{

    private String type;

    public Dog(){
        super();
    }
    public Dog(String name, int age, String kind,String color,String type){
        super(name,age,kind,color);
        this.type=type;
    }

    /**
     * 重写自我介绍方法
     */
    @Override
    public void selfIntroduction(){
        // 引用父类的方法
        super.selfIntroduction();
        // 输出小狗的品种
        System.out.println("我的品种是"+this.type+"。");
    }

    /**
     * 小狗的技能
     */
    public void skill(){
        System.out.println("我的技能是帮助盲人引路。");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
