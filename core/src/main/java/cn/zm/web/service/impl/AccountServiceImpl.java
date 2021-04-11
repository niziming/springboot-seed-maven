package cn.zm.web.service.impl;

import cn.zm.web.entity.Account;
import cn.zm.web.mapper.AccountMapper;
import cn.zm.web.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import cn.zm.common.ObjectConvert;
import java.util.stream.Collectors;
import cn.zm.web.entity.dto.AccountDTO;
import cn.zm.web.entity.vo.AccountVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {
    @Override
    public IPage<AccountVO> selectByPage(IPage<Account> page, AccountDTO account) {
        IPage<Account> accountPage = baseMapper.selectPage(page, new QueryWrapper<>());
        return buildPage(accountPage);
    }
    /**
    * 获取 vo 分页数据
    *
    * @param page do 分页数据
    * @return vo 分页数据
    */
    private IPage<AccountVO> buildPage(IPage<Account> page){
        IPage<AccountVO> pageViews = new Page<>();
            BeanUtil.copyProperties(page, pageViews);
            pageViews.setRecords(page.getRecords()
            .stream()
            .map(ObjectConvert::convert)
            .collect(Collectors.toList()));
        return pageViews;
    }
}
