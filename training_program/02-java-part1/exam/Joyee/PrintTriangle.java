package com.trendmicro;

import java.util.Scanner;

/**
 * 根据用户需求 打印三角形
 */

public class PrintTriangle {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in); // 用户输入需求
        System.out.print("请输入需要打印几个三角形:");
        int num = userInput.nextInt();

        for (int m = 1; m <= num; m++) { //确定循环次数
            System.out.println("-----------------");
            print(); //调用print方法
        }

    }

    public static void print() {
        for (int i = 1; i <= 3; i++) { // 确定三角形行数
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
