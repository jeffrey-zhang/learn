package com.trendmicro.service.impl;

import com.trendmicro.entity.Frog;
import com.trendmicro.entity.Monkey;
import com.trendmicro.entity.Owl;
import com.trendmicro.service.AnimalService;

/**
 * 动物实现类
 */
public class AnimalServiceImpl implements AnimalService {

    @Override
    public void frogPlay(Frog frog) {
        frog.jump();
        frog.food();
        frog.call();
    }

    @Override
    public void owlPlay(Owl owl) {
        owl.grab();
        owl.eye();
        owl.fly();
    }

    @Override
    public void monkeyPlay(Monkey monkey) {
        monkey.tree();
        monkey.fish();
        monkey.down();
    }
}
