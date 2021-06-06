package com.trendmicro.restfulcrud.dao;

import java.util.List;

import com.trendmicro.restfulcrud.entity.Report;

public interface ReportDao {
    List<Report> getreportSum();

    List<Report> getreportDetail();

}
