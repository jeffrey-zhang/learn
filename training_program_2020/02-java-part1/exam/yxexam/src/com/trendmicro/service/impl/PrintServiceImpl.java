package com.trendmicro.service.impl;

import com.trendmicro.bean.PrintParameter;
import com.trendmicro.service.IPrintService;

public class PrintServiceImpl implements IPrintService {
    /**
     * 打印三角形实现方法，默认每个三角形有5行
     * @param printParameter
     */
    @Override
    public void printGraphical(PrintParameter printParameter) {
        switch (printParameter.getType()){
            // 等腰
            case 0:
                printTypeZero(printParameter.getNumber());
                break;
            // 直角
            case 1:
                printTypeOne(printParameter.getNumber());
                break;
        }
    }

    /**
     * 等腰
     */
    public static void printTypeZero(int number){
        try{
            for (int k = 1; k <= number; k++) {
                System.out.println("第"+k+"个三角形：");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <5-i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("-----------------------");
            }
        }catch (Exception e){
            System.out.println("打印等腰三角行错误：");
            e.printStackTrace();
        }

    }

    /**
     * 直角
     */
    public static void printTypeOne(int number){
        try{
            for (int k = 1; k <= number; k++) {
                System.out.println("第"+k+"个三角形：");
                for (int i = 0; i < 5; i++) {
                    System.out.print("*");
                    for (int j = 0; j <i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            System.out.println("-----------------------");
        }catch (Exception e){
            System.out.println("打印直角三角行错误：");
            e.printStackTrace();
        }
    }
}
