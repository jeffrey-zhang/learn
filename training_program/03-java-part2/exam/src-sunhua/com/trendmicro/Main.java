package com.trendmicro;

import java.util.Scanner;

import com.trendmicro.entity.Cat;
import com.trendmicro.entity.ColorEnum;
import com.trendmicro.entity.Dog;
import com.trendmicro.entity.Tiger;

public class Main {
    public static void main(String[] args) {
            /** 异常处理
                 * @throws IOException
                 */
            try {
                int A;
                Scanner ip=new Scanner(System.in);
                System.out.println("1(狗) 2(猫) 3(老虎)");
                A=ip.nextInt();
           
                if(A==1){
                    newDog();
                }else if(A==2){
                    newCat();
                }else if(A==3){
                    newTiger();
                }     
            } catch (Exception e) {
                System.out.println("您输入的数字不正确，请输入正确的数字"+e);
               e.printStackTrace();     
            }

    }

    /**
     * new一个狗的实例
     */
    public static void newDog() {
        // dog1(露露)
        Dog dog = new Dog("露露", 2, "狗", ColorEnum.getName(1), "导盲");
        dog.selfIntroduction();
    }

    /**
     * new一个猫
     */
    public static void newCat() {
        // dog2(哆哆)
        Cat cat = new Cat("哆哆", 3, "猫", ColorEnum.getName(2), "鱼");
        cat.selfIntroduction();
        cat.Tree();
        cat.eat();
    }

    /**
     * new一个老虎
     */
    public static void newTiger() {
        // dog2(哆哆)
        Tiger tiger = new Tiger("哆哆", 3, "猫", ColorEnum.getName(3), "王");
        tiger.selfIntroduction();
        tiger.Tree1();
        tiger.Sign();
    }
}
