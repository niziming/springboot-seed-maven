package cn.zm.web.controller;

import cn.zm.netty.service.PushService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/netty")
@Api(tags = "netty测试")
public class PushController {
    @Resource
    private PushService pushService;

    /**
     * 推送给所有用户
     * @param msg
     */
    @PostMapping("/pushAll")
    public void pushToAll(@RequestParam("msg") String msg){
        pushService.pushMsgToAll(msg);
    }
    /**
     * 推送给指定用户
     * @param userId
     * @param msg
     */
    @PostMapping("/pushOne")
    public void pushMsgToOne(@RequestParam("userId") String userId,@RequestParam("msg") String msg){
        pushService.pushMsgToOne(userId,msg);
    }

}
