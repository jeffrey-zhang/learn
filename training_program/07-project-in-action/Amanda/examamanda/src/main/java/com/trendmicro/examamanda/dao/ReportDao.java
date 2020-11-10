package com.trendmicro.examamanda.dao;

import java.util.List;

import com.trendmicro.examamanda.entity.Report;

public interface ReportDao {
    List<Report> getreportSummary();

    List<Report> getreportDetail();
}
