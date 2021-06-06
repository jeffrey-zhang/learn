package com.trendmicro.service.impl;


import com.trendmicro.entity.Animal;
import com.trendmicro.service.AnimalService;

public class AnimalServiceImpl implements AnimalService {

    @Override
    public void showColor(Animal animal){
        System.out.println(animal.getName()+"是一只"+animal.getColor()+"色的"+animal.getKind());
    }
}
