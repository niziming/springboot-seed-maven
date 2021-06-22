package cn.zm.plus.web.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import cn.zm.plus.web.entity.Bd;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.zm.plus.web.entity.dto.BdDTO;
import cn.zm.plus.web.entity.vo.BdVO;

public interface IBdService extends IService<Bd> {
    /**
    * 分页查询
    *
    * @param page   分页信息
    * @param Bd 入参
    * @return 分页结果
    */
    IPage<BdVO> selectByPage(IPage<Bd> page, BdDTO Bd);
}
