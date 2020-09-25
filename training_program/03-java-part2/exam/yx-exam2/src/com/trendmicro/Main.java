package com.trendmicro;

import com.trendmicro.entity.Frog;
import com.trendmicro.entity.Monkey;
import com.trendmicro.entity.Owl;
import com.trendmicro.service.AnimalService;
import com.trendmicro.service.impl.AnimalServiceImpl;

import java.util.Scanner;

/***
 * 程序入口类
 */
public class Main {
    private static Scanner in = new Scanner(System.in);
    private static AnimalService animalService = new AnimalServiceImpl();
    public static void main(String[] args) {
        System.out.println("欢迎来到迷你动物园，快来选择你喜欢的小动物吧.1：小猴子，2：青蛙，3：猫头鹰");
        int type = in.nextInt();
        switch (type){
            // 猴子
            case 1:
                Monkey monkey= new Monkey("小悟","哺乳动物，四肢有明确的分工。");
                monkey.eat();
                try{
                    String outMsg = in.next();
                    if("Hi".equalsIgnoreCase(outMsg)){
                        monkey.introduce();
                        // 猴子行为
                        animalService.monkeyPlay(monkey);
                    }else{
                        System.out.println("输入错误，请输入Hi来看小动物表演。");
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
                // 青蛙
            case 2:
                Frog frog = new Frog("小蛙","前脚上有四个趾，后脚上有五个趾，还有蹼。");
                frog.eat();
                try{
                    String outMsg = in.next();
                    if("Hi".equalsIgnoreCase(outMsg)){
                        frog.introduce();
                        // 青蛙行为
                        animalService.frogPlay(frog);
                    }else{
                        System.out.println("输入错误，请输入Hi来看小动物表演。");
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

                break;
                // 猫头鹰
            case 3:
                Owl owl = new Owl("小鹰","夜行性肉食性动物,食物以鼠类为主。");
                owl.eat();
                try{
                    String outMsg = in.next();
                    if("Hi".equalsIgnoreCase(outMsg)){
                        owl.introduce();
                        // 猫头鹰行为
                        animalService.owlPlay(owl);

                    }else{
                        System.out.println("输入错误，请输入Hi来看小动物表演。");
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

                break;
            default:
                System.out.println("选择小动物错误，请重新选择。");
                break;
        }


    }
}
