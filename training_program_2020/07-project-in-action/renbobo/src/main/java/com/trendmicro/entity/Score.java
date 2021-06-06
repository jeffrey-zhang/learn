package com.trendmicro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 成绩实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score {
    private String id;
    private double chinese;
    private double math;
    private double english;
}
