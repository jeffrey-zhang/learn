package com.trendmicro;

import java.util.Scanner;

import com.trendmicro.entity.*;

/**
 * 程序的入口类
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("-------欢迎来到动物园-------");

        Scanner ip = new Scanner(System.in);
        System.out.print("请输入需要和哪个小动物打招呼（阿拉伯数字）");
        System.out.println("1(小鸟) 2(小狗) 3(小兔子):");
        try {
            int A = ip.nextInt();
            System.out.println("请打招呼(hello):");
            String b = ip.next();
            if ("hello".equals(b)) {
                switch (A) {
                    case 1:
                        generateBird();
                        break;

                    case 2:
                        generateDog();

                        break;

                    case 3:
                        generateRabbit();
                        break;
                    default:
                        System.out.println("请输入1-3");
                        break;
                }
            } else {
                System.out.println("请输入‘hello’");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 实例鸟对象
     */
    public static void generateBird() {
        Bird bird = new Bird("枝枝", 1, "小鸟", "模仿说话");
        bird.selfIntroduction();
        bird.eat();
        bird.fly();

    }

    /**
     * 实例狗对象
     */
    public static void generateDog() {
        Dog dog = new Dog("旺旺", 2, "小狗", "警犬");
        dog.selfIntroduction();
        dog.eat();
        dog.skill();
    }

    /**
     * 实例兔子对象
     */
    public static void generateRabbit() {
        Rabbit rabbit = new Rabbit("兔兔", 1, "小兔子", "长长的耳朵");
        rabbit.selfIntroduction();
        rabbit.eat();
        rabbit.hobby();

    }

}
