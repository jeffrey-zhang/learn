package com.trendmicro;

import com.trendmicro.entity.Cat;
import com.trendmicro.entity.ColorEnum;
import com.trendmicro.entity.Dog;
// import com.trendmicro.model.*;
import com.trendmicro.service.AnimalService;
import com.trendmicro.service.impl.AnimalServiceImpl;

import java.io.*;

/**
 * 程序的入口类
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // 实例猫对象
        generateCat();
        System.out.println();
        // 实例狗对象
        generateDog();
        System.out.println();
        // 异常处理
        exceptionTest();
    }

    /**
     * 实例猫对象
     */
    public static void generateCat() {
        Cat cat = new Cat("咪咪",2,"猫",ColorEnum.getName(1),"吃鱼");
        cat.selfIntroduction();
        cat.outSound();
    }

    /**
     * 实例狗对象
     */
    public static void generateDog(){
        Dog dog = new Dog("迪迪",1,"狗",ColorEnum.getName(2),"哈士奇");
        dog.setType("泰迪");
        dog.selfIntroduction();
        dog.outSound();
        AnimalService dogColor = new AnimalServiceImpl();
        dogColor.showColor(dog);

    }

    /**
     * 处理异常掩饰方法
     * @throws IOException
     */
    public static void exceptionTest() throws IOException {
        // 定义一个长度为2的数组
        int [] n= new int [2];
        // 定义文件路径
        String path = "test.txt";
        File file =new File(path);
        InputStream inputStream = null;
        try{
            // 如果有语句有异常，它之后的代码将不会被执行会进入final中
            System.out.println(n[2]);
            inputStream =new FileInputStream(file);
            System.out.println(inputStream.read());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("错误：数组越界了。");
            System.out.println("正确的执行n[0]，输出："+n[0]);
        }
        catch (IOException e){
            System.out.println("错误：文件不存在，读取失败。");
            // 指定存在本系统中的文件路径
            path="/Users/xuyan/ideaprojects/learning/README.md";
            file =new File(path);
            inputStream =new FileInputStream(file);
            System.out.println("正确的文件读取返回的结果："+inputStream.read());
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("---> 进入finally执行操作。");
            if(inputStream!=null){
                inputStream.close();
            }
        }

    }

}
