package com.trendmicro.examamanda.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.trendmicro.examamanda.entity.Report;
import com.trendmicro.examamanda.service.ReportService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {
    @Resource
    private ReportService reportService;

    @GetMapping(value = "/report")
    @CrossOrigin
    public Map<String, List<Report>> getReport() {

        List<Report> reportsum = reportService.getreportSummary();
        List<Report> reportdetail = reportService.getreportDetail();
        Map<String, List<Report>> map = new HashMap<String, List<Report>>();
        map.put("sum", reportsum);
        map.put("detail", reportdetail);

        return map;

    }
}
