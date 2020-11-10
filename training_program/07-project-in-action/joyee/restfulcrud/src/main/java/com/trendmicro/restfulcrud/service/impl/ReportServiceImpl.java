package com.trendmicro.restfulcrud.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.trendmicro.restfulcrud.dao.ReportDao;
import com.trendmicro.restfulcrud.entity.Report;
import com.trendmicro.restfulcrud.service.ReportService;

import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService {

    @Resource
    ReportDao reportDao;

    @Override
    public List<Report> getreportSum() {

        return reportDao.getreportSum();
    }

    @Override
    public List<Report> getreportDetail() {

        return reportDao.getreportDetail();
    }

}
