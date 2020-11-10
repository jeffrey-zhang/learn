package com.trendmicro.examamanda.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.trendmicro.examamanda.dao.AccountDao;
import com.trendmicro.examamanda.entity.Account;
import com.trendmicro.examamanda.service.AccountService;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao dao;

    @Override
    public List<Account> findAll() {
        return dao.findAll();
    }
}
