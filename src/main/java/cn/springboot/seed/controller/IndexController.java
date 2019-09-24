package cn.springboot.seed.controller;

import cn.springboot.seed.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Api(value = "首页控制层", description = "App相关操作接口定义类")
public class IndexController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ModelAndView selectAll(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg", "这条语句是Thymeleaf测试语句");
        return modelAndView;
    }
}
