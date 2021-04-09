package ${package.ServiceImpl};

import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
import ${superServiceImplClassPackage};
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import cn.zm.common.ObjectConvert;
import java.util.stream.Collectors;
import cn.zm.modules.entity.dto.${entity? cap_first}DTO;
import cn.zm.modules.entity.vo.${entity? cap_first}VO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

@Service
@Transactional(rollbackFor = Exception.class)
<#if kotlin>
open class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>(), ${table.serviceName} {

}
<#else>
public class ${table.serviceImplName} extends ${superServiceImplClass}<${table.mapperName}, ${entity}> implements ${table.serviceName} {
    @Override
    public IPage<${entity? cap_first}VO> selectByPage(IPage<${entity}> page, ${entity? cap_first}DTO ${table.name}) {
        IPage<${entity}> ${table.name}Page = baseMapper.selectPage(page, new QueryWrapper<>());
        return buildPage(${table.name}Page);
    }
    /**
    * 获取 vo 分页数据
    *
    * @param page do 分页数据
    * @return vo 分页数据
    */
    private IPage<${entity? cap_first}VO> buildPage(IPage<${entity}> page){
        IPage<${entity? cap_first}VO> pageViews = new Page<>();
            BeanUtil.copyProperties(page, pageViews);
            pageViews.setRecords(page.getRecords()
            .stream()
            .map(ObjectConvert::convert)
            .collect(Collectors.toList()));
        return pageViews;
    }
}
</#if>
