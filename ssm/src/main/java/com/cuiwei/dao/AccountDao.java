package com.cuiwei.dao;

import com.cuiwei.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao  {

    /**
     * 查询所有用户
     *
     */

    public List<Account> findAll();

    /**
     * 账户的添加
     */

    public void save(Account account);

    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    public Account findById(Integer id);

    /**
     * 更新用户
     */
    public void update(Account account);

    /**
     * 批量删除
     * @param ids
     */
    public void deleteBatch(Integer[] ids);
}
