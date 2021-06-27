package cn.zm.tk.webbck.service;


import cn.zm.tk.base.service.BaseService;
import cn.zm.tk.utils.PageBean;
import cn.zm.tk.webbck.entity.Account;

public interface IAccountService extends BaseService<Account> {
    /**
    * 分页查询
    *
    * @param account 用户表入参
    * @return 分页结果
    */
    PageBean page(Account account);
}
