package com.trendmicro;

import com.trendmicro.bean.PrintParameter;
import com.trendmicro.service.IPrintService;
import com.trendmicro.service.impl.PrintServiceImpl;

import java.util.Scanner;

/**
 * 主类
 */
public class Main {
    private static Scanner in = new Scanner(System.in);
    private static IPrintService printService;
    public static void main(String[] args) {
        printService = new PrintServiceImpl();
        System.out.println("请输入您想打印的三角行数量(阿拉伯数字)，Number：");
        int number,type;
        try{
            number = in.nextInt();
            System.out.println("请输入您想打印的三角行样式(0：等腰，1：直角)，Type：");
            type = in.nextInt();
            if(type<0||type>1){
                System.out.println("请输入正确的Type,0：等腰，1：直角");
                return;
            }
            PrintParameter printParameter = new PrintParameter(number,type);
            printService.printGraphical(printParameter);
        }catch (Exception e){
            System.out.println("输入有误，请输入正确内容（阿拉伯数字）！！！");
        }
    }
}
