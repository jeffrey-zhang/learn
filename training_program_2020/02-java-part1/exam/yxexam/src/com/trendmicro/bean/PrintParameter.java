package com.trendmicro.bean;

/***
 *
 * 打印三角形参数类
 */
public class PrintParameter {
    /**
     * 数量
     */
    private int number;
    /**
     * 类型，0：等腰，1：直角
     */
    private int type;

    public PrintParameter(int number, int type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
