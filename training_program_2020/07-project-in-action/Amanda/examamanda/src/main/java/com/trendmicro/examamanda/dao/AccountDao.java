package com.trendmicro.examamanda.dao;

import java.util.List;

import com.trendmicro.examamanda.entity.Account;

public interface AccountDao {
    // 登录
    List<Account> findAll();

}
