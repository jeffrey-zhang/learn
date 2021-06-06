package com.nevstop;

import java.util.Scanner;

public class Main_App {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("请问你需要打印多少行的三角形:");
            int a = input.nextInt();
            System.out.println("你需要打印多少个三角形:");
            int b = input.nextInt();

            for (int i = 0; i < b; i++) {
                System.out.println("这是第"+(i+1)+"个三角形");
                PrintTriangle.triangle(a,b);
            }
        }catch (Exception e){
            System.out.println("你输入的参数有误");
        }

    }
}
