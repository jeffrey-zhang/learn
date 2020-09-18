package com.nevstop;

import java.util.Scanner;

public class PrintTriangle {
    /**
     * 打印三角形
     * @param a 三角形的行数
     * @param b 三角形的个数
     */
    public static void triangle(int a, int b){
        for (int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
