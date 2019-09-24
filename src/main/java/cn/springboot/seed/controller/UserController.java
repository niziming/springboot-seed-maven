package cn.springboot.seed.controller;

import cn.springboot.seed.model.User;
import cn.springboot.seed.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/user")
@Controller
@Api(value = "用户控制层", description = "App相关操作接口定义类")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ResponseBody
    public List<User> selectAll(){
        return userService.selectAllUsers();
    }
}
