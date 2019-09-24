package cn.springboot.seed.controller;

import cn.springboot.seed.model.User;
import cn.springboot.seed.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "用户控制层", description = "App相关操作接口定义类")
@RestController
// @RequestMapping("/")
public class IndexController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    @ResponseBody
    public List<User> selectAll(){
        return userService.selectAllUsers();
    }
}
