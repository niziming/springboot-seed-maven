package cn.zm.modules.controller;

import cn.zm.modules.service.IAccountService;
import org.springframework.web.bind.annotation.RestController;
import cn.zm.common.BaseController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import cn.zm.common.ResponseResult;
import cn.zm.modules.entity.dto.AccountDTO;
import cn.zm.modules.entity.vo.AccountVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Objects;

/**
 * <p>
 * a
 * </p>
 *
 * @author jermaine
 * @since 2021-04-09
 */
@RequestMapping("account")
@RestController
@Api(tags = "")
public class AccountController extends BaseController {

    @Resource
    private IAccountService accountService;

    @GetMapping
    @ApiOperation("查询")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "当前页数", defaultValue = "1"),
        @ApiImplicitParam(name = "size", value = "每页个数", defaultValue = "10"),
        @ApiImplicitParam(name = "orderByColumn", value = "排序字段"),
        @ApiImplicitParam(name = "isDesc", value = "是否降序")
    })
    public ResponseResult<IPage<AccountVO>> getByPage(@Validated AccountDTO account) {
        // TODO 分页查询
        IPage<AccountVO> page = accountService.selectByPage(getPage(), account);
        return ResponseResult.succ(page);
    }

    @GetMapping("{id}")
    @ApiOperation("查询(id)")
    public ResponseResult<AccountVO> get(@PathVariable String id) {
        // TODO 查询
        boolean aNull = Objects.isNull(accountService.getById(id));
        return ResponseResult.succ(aNull ? null : accountService.getById(id).convert());
    }

    @PostMapping
    @ApiOperation("新增")
    public ResponseResult add(@RequestBody @Validated AccountDTO account) {
        // TODO 新增
        accountService.save(account.convert());
        return ResponseResult.succ("新增成功");
    }

    @DeleteMapping("{id}")
    @ApiOperation("删除")
    public ResponseResult del(@PathVariable String id) {
        // TODO 删除
        accountService.removeById(id);
        return ResponseResult.succ("删除成功");
    }

    @PutMapping
    @ApiOperation("修改")
    public ResponseResult update(@RequestBody @Validated AccountDTO account) {
        // TODO 修改
        accountService.updateById(account.convert());
        return ResponseResult.succ("修改成功");
    }
}
