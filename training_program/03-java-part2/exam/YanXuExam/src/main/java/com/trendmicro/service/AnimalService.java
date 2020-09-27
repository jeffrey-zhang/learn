package com.trendmicro.service;

import com.trendmicro.entity.Frog;
import com.trendmicro.entity.Monkey;
import com.trendmicro.entity.Owl;

/**
 * 动物行为
 */
public interface AnimalService {
    // 青蛙行为
    void frogPlay(Frog frog);
    // 猫头鹰行为
    void owlPlay(Owl owl);
    // 猴子行为
    void monkeyPlay(Monkey monkey);

}
