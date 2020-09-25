package com.trendmicro;

import com.trendmicro.entity.Animal;
import com.trendmicro.entity.Cat;
import com.trendmicro.entity.Dolphin;
import com.trendmicro.entity.Elephant;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main_App {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("你想看谁");
        System.out.println("1.猫咪 2.大象 3.海豚 0.退出");
        int type;
        Animal animal;
        while (true){
            try {
                type = input.nextInt();
                    switch (type){
                        case 1:
                            Cat cat =new Cat("小黑货","fish","英短");
                            cat.intro(cat);
                            cat.eat();
                            cat.sleep();
                            cat.catchMouse();
                            break;
                        case 2:
                            Elephant elephant=new Elephant("泰坦","青草");
                            elephant.intro(elephant);
                            elephant.eat();
                            elephant.sleep();
                            elephant.fight();
                            break;
                        case 3:
                            Dolphin dolphin =new Dolphin("海神","小鱼干");
                            System.out.println("想看我游泳吗  1.yes 2.no");
                            String is_swim = input.next();
                            if ("1".equals(is_swim)){
                                dolphin.swim();
                            }else {
                                dolphin.sleep();
                            }
                            break;
                        case 0: System.exit(0);
                        default:
                            System.out.println("动物园里只有这些动物哦,请选择其他的吧");

                    }
                    System.out.println("你想继续看谁 1.猫咪 2.大象 3.海豚 0.退出");

            } catch (Exception e){
                System.out.println("你输入有误");
                break;
            }
        }
    }
}
