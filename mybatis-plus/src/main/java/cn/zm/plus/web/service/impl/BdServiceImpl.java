package cn.zm.plus.web.service.impl;

import cn.zm.plus.web.entity.Bd;
import cn.zm.plus.web.mapper.BdMapper;
import cn.zm.plus.web.service.IBdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;
import cn.zm.plus.web.entity.dto.BdDTO;
import cn.zm.plus.web.entity.vo.BdVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import cn.zm.plus.utils.ConvertUtil;


@Service
@Transactional(rollbackFor = Exception.class)
public class BdServiceImpl extends ServiceImpl<BdMapper, Bd> implements IBdService {
    @Override
    public IPage<BdVO> selectByPage(IPage<Bd> page, BdDTO bd) {
        IPage<Bd> bdPage = baseMapper.selectPage(page, new QueryWrapper<>());
        return ConvertUtil.buildPage(bdPage);
    }
}
