package cn.zm.plus.web.controller;

import cn.zm.plus.web.service.IBdService;
import org.springframework.web.bind.annotation.RestController;
import cn.zm.plus.config.BaseController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import cn.zm.common.common.ResponseResult;
import cn.zm.plus.web.entity.dto.BdDTO;
import cn.zm.plus.web.entity.vo.BdVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Objects;

/**
 * 
 * @author jermaine
 * @since 2021-06-21
 */
@RequestMapping("bd")
@RestController
@Api(tags = "BD")
public class BdController extends BaseController {

    @Resource
    private IBdService bdService;

    @GetMapping
    @ApiOperation("查询")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "当前页数", defaultValue = "1"),
        @ApiImplicitParam(name = "size", value = "每页个数", defaultValue = "10"),
        @ApiImplicitParam(name = "orderByColumn", value = "排序字段"),
        @ApiImplicitParam(name = "isDesc", value = "是否降序")
    })
    public ResponseResult<IPage<BdVO>> getByPage(@Validated BdDTO bd) {
        // TODO 分页查询
        IPage<BdVO> page = bdService.selectByPage(getPage(), bd);
        return ResponseResult.succ(page);
    }

    @GetMapping("{id}")
    @ApiOperation("查询(id)")
    public ResponseResult<BdVO> get(@PathVariable String id) {
        // TODO 查询
        boolean aNull = Objects.isNull(bdService.getById(id));
        return ResponseResult.succ(aNull ? null : bdService.getById(id).convert());
    }

    @PostMapping
    @ApiOperation("新增")
    public ResponseResult add(@RequestBody @Validated BdDTO bd) {
        // TODO 新增
        bdService.save(bd.convert());
        return ResponseResult.succ("新增成功");
    }

    @DeleteMapping("{id}")
    @ApiOperation("删除")
    public ResponseResult del(@PathVariable String id) {
        // TODO 删除
        bdService.removeById(id);
        return ResponseResult.succ("删除成功");
    }

    @PutMapping
    @ApiOperation("修改")
    public ResponseResult update(@RequestBody @Validated BdDTO bd) {
        // TODO 修改
        bdService.updateById(bd.convert());
        return ResponseResult.succ("修改成功");
    }
}
