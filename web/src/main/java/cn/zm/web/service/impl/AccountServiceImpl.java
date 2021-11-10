package cn.zm.web.service.impl;

import cn.zm.tk.base.service.BaseServiceImpl;
import cn.zm.web.entity.Account;
import cn.zm.web.service.IAccountService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Primary
@Service
@Transactional(rollbackFor = Exception.class)
public class AccountServiceImpl extends BaseServiceImpl<Account> implements IAccountService {

}
