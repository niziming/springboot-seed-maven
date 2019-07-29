package cn.springboot.demo.controller;

import cn.springboot.demo.model.Yh;
import cn.springboot.demo.service.YhService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "用户控制层", description = "App相关操作接口定义类")
@RestController
// @RequestMapping("/")
public class IndexController {
    @Autowired
    YhService yhService;

    @GetMapping("")
    @ResponseBody
    public List<Yh> Stringindex(){
        List<Yh> yhs = yhService.selectAll();
        return yhs;
    }
}
