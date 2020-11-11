package com.trendmicro.entity;

public enum ColorEnum {
    RED("黑色", 1),
    COLORFUL("彩色", 2),
    WHITE("白色", 3);
    // 成员变量
    private String name;
    private int index;

    // 构造方法
    ColorEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 根据下标获取color name
    public static String getName(int index) {
        for (ColorEnum c : ColorEnum.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}