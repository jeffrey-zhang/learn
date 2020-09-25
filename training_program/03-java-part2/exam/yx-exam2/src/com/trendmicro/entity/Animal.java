package com.trendmicro.entity;

/**
 * 动物共有信息
 */
public class Animal {
    private String name;
    private String feature;
    public Animal(){

    }
    public Animal(String name, String feature) {
        this.name = name;
        this.feature = feature;
    }

    public void introduce(){
        // 自我介绍
        System.out.println("我叫"+this.name+",我们的特征是："+this.feature);
        System.out.println("下面我为大家表演一下我的才艺");
    }
    public void eat(){
        // 吃饭
        System.out.println("小动物正在吃东西，想它打招呼吧");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
