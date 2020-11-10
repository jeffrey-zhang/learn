package com.trendmicro.examamanda.service;

import java.util.List;

import com.trendmicro.examamanda.entity.Report;

public interface ReportService {
    List<Report> getreportSummary();

    List<Report> getreportDetail();
}
