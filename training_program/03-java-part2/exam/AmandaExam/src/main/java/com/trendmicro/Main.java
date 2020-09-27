package com.trendmicro;

import com.trendmicro.entity.*;
import com.trendmicro.service.AnimalService;
import com.trendmicro.service.impl.AnimalServiceImpl;

import java.io.*;
import java.util.Scanner;

/**
 * 程序的入口类
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请问需要了解什么动物：1,鹦鹉，2，海豚，3，变色龙");
        AnimalService animal = new AnimalServiceImpl();
        try{
            int answer = scanner.nextInt();
            switch (answer) {
                // 鹦鹉
                case 1:
                   
                    animal.generateParrot();
                    System.out.println();
                    break;
                // 海豚
                case 2:
                    animal.generateDolphin();
                    System.out.println();
                    break;
                // 变色龙
                case 3:
                    animal.generateChameleon();
                    System.out.println();
                break;
            }
        }catch(Exception e){
            e.printStackTrace();

        }
        
    
    }
}

