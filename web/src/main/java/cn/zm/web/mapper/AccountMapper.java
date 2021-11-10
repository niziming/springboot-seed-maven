package cn.zm.web.mapper;

import cn.zm.tk.base.mapper.BaseMapper;
import cn.zm.web.entity.Account;

public interface AccountMapper extends BaseMapper<Account> {
    @Override
    default Class entityClass() {
        return Account.class;
    }
}