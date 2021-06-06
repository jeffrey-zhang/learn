package com.trendmicro.examamanda.controller;

import java.util.List;

import javax.annotation.Resource;

import com.trendmicro.examamanda.entity.Account;
import com.trendmicro.examamanda.service.AccountService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    @GetMapping(value = "/account")
    @CrossOrigin
    public List<Account> findAccounts() {
        return accountService.findAll();
    }
}
