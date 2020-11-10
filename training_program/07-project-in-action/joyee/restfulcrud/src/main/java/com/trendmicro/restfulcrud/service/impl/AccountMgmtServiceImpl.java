package com.trendmicro.restfulcrud.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.trendmicro.restfulcrud.dao.AccountMgmtDao;
import com.trendmicro.restfulcrud.entity.AccountMgmt;
import com.trendmicro.restfulcrud.service.AccountMgmtService;

import org.springframework.stereotype.Service;

@Service
public class AccountMgmtServiceImpl implements AccountMgmtService {

    @Resource
    AccountMgmtDao accountMgmtDao;

    @Override
    public List<AccountMgmt> getAccountMgmt() {
        return accountMgmtDao.getAccountMgmt();

    }

}
