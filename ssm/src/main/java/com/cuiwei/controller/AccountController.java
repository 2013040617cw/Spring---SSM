package com.cuiwei.controller;

import com.cuiwei.domain.Account;
import com.cuiwei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    /*
        查询所有用户
     */
    @RequestMapping("/findAll")
    public  String findAll(Model model){

        //实现查询所有账户
        List<Account> list = accountService.findAll();

        // 把封装好的list存到model中
        model.addAttribute("list",list);

        return "list";

    }

    /**
     * 添加用户
     * @param account
     * @return
     */
    @RequestMapping("/save")
    public String save(Account account){
        accountService.save(account);
        //跳转到findAll方法重新查询一次数据库的遍历展示
        return "redirect:/account/findAll";
    }

    /**
     * 根据ID查询账户信息，完成账户信息的回显
     */

    @RequestMapping("/findById")
    public String findById(Integer id,Model model){
        Account account = accountService.findBiId(id);

        //存到Model中
        model.addAttribute("account",account);

        //视图跳转
        return "update";
    }

    /**
     * 更新账户
     */

    @RequestMapping("/update")
    public String update(Account account){

        accountService.update(account);

        return "redirect:/account/findAll";

    }

    /**
     * 批量删除
     */

    @RequestMapping("/deleteBatch")
    public String deleteBatch(Integer[] ids){
        accountService.deleteBatch(ids);
        return"redirect:/account/findAll";
    }
}
