package com.trendmicro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentAndScoreDTO {
    private String name;
    private double chinese;
    private double math;
    private double english;
}
