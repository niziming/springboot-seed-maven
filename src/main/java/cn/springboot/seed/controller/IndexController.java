package cn.springboot.seed.controller;

import cn.springboot.seed.model.User;
import cn.springboot.seed.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


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
