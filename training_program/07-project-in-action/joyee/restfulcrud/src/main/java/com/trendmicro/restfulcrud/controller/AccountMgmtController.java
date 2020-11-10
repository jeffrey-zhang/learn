package com.trendmicro.restfulcrud.controller;

import java.util.List;

import javax.annotation.Resource;

import com.trendmicro.restfulcrud.entity.AccountMgmt;
import com.trendmicro.restfulcrud.service.AccountMgmtService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountMgmtController {

    @Resource
    AccountMgmtService accountMgmtService;

    @ResponseBody
    @RequestMapping("/accountMgmt")
    public List<AccountMgmt> getAccountMgmt() {

        List<AccountMgmt> accountMgmt = accountMgmtService.getAccountMgmt();
        return accountMgmt;

    }

}
