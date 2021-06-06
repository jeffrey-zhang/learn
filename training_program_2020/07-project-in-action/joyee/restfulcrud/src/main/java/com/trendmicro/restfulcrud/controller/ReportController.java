package com.trendmicro.restfulcrud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.trendmicro.restfulcrud.entity.Report;
import com.trendmicro.restfulcrud.service.ReportService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReportController {

    @Resource
    ReportService reportService;

    @ResponseBody
    @RequestMapping("/report")
    public Map<String, List<Report>> getReport() {

        List<Report> reportsum = reportService.getreportSum();
        List<Report> reportdetail = reportService.getreportDetail();
        Map<String, List<Report>> map = new HashMap<String, List<Report>>();
        map.put("sum", reportsum);
        map.put("detail", reportdetail);

        return map;

    }

}
