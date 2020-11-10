package com.trendmicro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用来存储平均分
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvgDTO {
    private double math;
    private double english;
    private double chinese;
}
