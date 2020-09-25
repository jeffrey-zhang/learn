package com.trendmicro.entity;

public enum ColorEnum {
    RED("黑白相间",1),
    GREEN("橘黄色",2),
    BLUE("黄黑相间",3);
    private String name;
    private int index;

    /**
     * 构造方法
     */
    ColorEnum(String name,int index) {
        this.name = name;
        this.index = index;
    }



    public static String getName(int index) {
        for(ColorEnum c:ColorEnum.values()){
            if(c.getIndex()==index){
                return c.name;
            }
        }
        return null;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

