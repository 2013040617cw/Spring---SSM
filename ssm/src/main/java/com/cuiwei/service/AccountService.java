package com.cuiwei.service;

import com.cuiwei.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();
    public void save(Account account);
    public Account  findBiId(Integer id);
    public void update(Account account);
    public void deleteBatch(Integer[] ids);
}
