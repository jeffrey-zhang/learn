package com.trendmicro.examamanda.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.trendmicro.examamanda.dao.ReportDao;
import com.trendmicro.examamanda.entity.Report;
import com.trendmicro.examamanda.service.ReportService;

import org.springframework.stereotype.Service;

@Service
public class ReportImpl implements ReportService {
    @Resource
    private ReportDao dao;

    @Override
    public List<Report> getreportSummary() {
        return dao.getreportSummary();
    }

    @Override
    public List<Report> getreportDetail() {
        return dao.getreportDetail();
    }
}
