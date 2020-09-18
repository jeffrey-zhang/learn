package com.nevstop;

public class PrintTriangle {

    /**
     * print a common triangle
     * @param a 三角形的行数
     * @param b 打印出的三角形个数
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
