package cn.zm.tk.webbck.service.impl;

import cn.zm.tk.base.service.BaseServiceImpl;
import cn.zm.tk.utils.PageBean;
import cn.zm.tk.webbck.entity.Account;
import cn.zm.tk.webbck.service.IAccountService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Primary
@Service
@Transactional(rollbackFor = Exception.class)
public class AccountServiceImpl extends BaseServiceImpl<Account> implements IAccountService {

    @Override
    public PageBean page(Account account) {
        // return saveSelective(account);
        return null;
    }
}
