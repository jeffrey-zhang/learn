package com.nevstop;

import java.util.Scanner;

/**
 * description
         现在我们一起来做一个项目，：首先大家是整体的一个团队，假设代码间存在依赖关系，相互存在调用关系。目前自己负责其中一个模块的开发，该模块的要求如下
         1. 核心业务逻辑是打印出一个三角形
         2. 存在跟用户（“外部接口调用”）交互，询问用户需要打印多少个三角形
         3. 根据用户的需求，打印出满足条件的三角形
 * @author renbobo
 * @data 2020.9.18
 */
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
