package cn.zm.modules.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import cn.zm.modules.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.zm.modules.entity.dto.AccountDTO;
import cn.zm.modules.entity.vo.AccountVO;

public interface IAccountService extends IService<Account> {
    /**
    * 分页查询
    *
    * @param page   分页信息
    * @param Account 入参
    * @return 分页结果
    */
    IPage<AccountVO> selectByPage(IPage<Account> page, AccountDTO Account);
}
