package com.trendmicro.restfulcrud.service;

import java.util.List;

import com.trendmicro.restfulcrud.entity.Report;

public interface ReportService {
    List<Report> getreportSum();

    List<Report> getreportDetail();

}
