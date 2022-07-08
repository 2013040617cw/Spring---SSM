package com.cuiwei.service.impl;

import com.cuiwei.dao.AccountDao;
import com.cuiwei.domain.Account;
import com.cuiwei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    /**
     * 测试Spring在SSM环境中的单独使用
     * @return
     */
    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        List<Account> all = accountDao.findAll();
        return all;
    }
}
