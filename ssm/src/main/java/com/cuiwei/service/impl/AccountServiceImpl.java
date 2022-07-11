package com.cuiwei.service.impl;

import com.cuiwei.dao.AccountDao;
import com.cuiwei.domain.Account;
import com.cuiwei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
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


    /**
     * 账户添加
     * @param account
     */
    @Override
    public void save(Account account) {
        accountDao.save(account);
    }


    @Override
    public Account findBiId(Integer id) {
        Account byId = accountDao.findById(id);
        return byId;
    }

    @Override
    public void update(Account account) {
          accountDao.update(account);

    }

    @Override
    public void deleteBatch(Integer[] ids) {
        accountDao.deleteBatch(ids);
    }


}
