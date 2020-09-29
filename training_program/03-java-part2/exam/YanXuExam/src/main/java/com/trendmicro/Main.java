package com.trendmicro;

import com.trendmicro.service.AnimalService;
import com.trendmicro.service.impl.AnimalServiceImpl;

/***
 * 程序入口类
 */
public class Main {
    public static void main(String[] args) {
        // 实例化动物接口
        AnimalService animalService = new AnimalServiceImpl();
        // 执行参观动物
        animalService.initAnimal();
    }
}
