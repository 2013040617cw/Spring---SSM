package com.cuiwei.dao;

import com.cuiwei.domain.Account;

import java.util.List;

public interface AccountDao  {

    /**
     * 查询所有用户
     *
     */

    public List<Account> findAll();
}
