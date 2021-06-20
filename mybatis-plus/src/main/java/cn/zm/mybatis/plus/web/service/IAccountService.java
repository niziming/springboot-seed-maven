package cn.zm.mybatis.plus.web.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import cn.zm.mybatis.plus.web.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.zm.mybatis.plus.web.entity.dto.AccountDTO;
import cn.zm.mybatis.plus.web.entity.vo.AccountVO;

public interface IAccountService extends IService<Account> {
    /**
    * 分页查询
    *
    * @param page   分页信息
    * @param Account 用户表入参
    * @return 分页结果
    */
    IPage<AccountVO> selectByPage(IPage<Account> page, AccountDTO Account);
}
