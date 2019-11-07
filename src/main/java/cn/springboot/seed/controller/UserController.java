package cn.springboot.seed.controller;

import cn.springboot.seed.common.ResultMap;
import cn.springboot.seed.model.User;
import cn.springboot.seed.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/user")
@Controller
@Api(value = "用户控制层", description = "App相关操作接口定义类")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ApiOperation(value = "用户列表请求", notes = "返回用户列表")
    @ResponseBody
    public List<User> selectAll() {
        return userService.selectAllUsers();
    }

    @ApiOperation(value = "跳转用户登录", notes = "登录界面")
    @GetMapping("/login")
    public String Login() {
        return "user/login";
    }

    @ApiOperation(value = "用户登录", notes = "用户名密码登录")
    @PostMapping("/login")
    public ModelAndView Login(User user){
        ModelAndView modelAndView = new ModelAndView();
        User loginUser = userService.login(user);
        if (loginUser != null){
            modelAndView.setViewName("user/info");
            modelAndView.addObject(loginUser);
            System.out.println(modelAndView);
            return modelAndView;
        } else {
            modelAndView.setViewName("404");
            return modelAndView;
        }
    }

}
