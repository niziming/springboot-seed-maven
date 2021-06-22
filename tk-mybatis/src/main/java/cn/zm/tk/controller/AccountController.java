package cn.zm.tk.controller;

import cn.zm.common.common.ResponseResult;
import cn.zm.tk.entity.Account;
import cn.zm.tk.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 
 * @author jermaine
 * @since 2021-06-21
 */
@RequestMapping("tk/account")
@RestController
@Api(tags = "tk接口测试")
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("{id}")
    @ApiOperation("查询(id)")
    public ResponseResult<Account> get(@PathVariable String id) {
        // TODO 查询
        return ResponseResult.succ(accountService.selectById(id));
    }

}
