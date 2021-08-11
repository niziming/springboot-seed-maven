package cn.zm.async.rest;

import cn.hutool.core.thread.ThreadUtil;
import cn.zm.async.service.AsyncService;
import cn.zm.async.service.CompositeService;
import cn.zm.common.common.ResponseResult;
import cn.zm.common.utils.ConcurrentUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.Response;
import java.util.*;
import java.util.concurrent.*;

@RequestMapping("async")
@RestController
@Api(tags = "异步编程")
public class AsycController {
    @Resource
    private CompositeService compositeService;
    @Resource
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;


    @GetMapping("search")
    @ApiOperation("搜索")
    public ResponseResult searchList() throws InterruptedException, ExecutionException, TimeoutException {
        HashMap<Object, Object> map = new HashMap<>();
        // CompletableFuture future = ConcurrentUtils.getFuture(() -> {
        //     System.out.println("1,System.currentTimeMillis() = " + System.currentTimeMillis());
        //     try {
        //         Thread.sleep(2000);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        //     return UUID.randomUUID();
        // }, threadPoolTaskExecutor);
        // CompletableFuture future1 = ConcurrentUtils.getFuture(() -> {
        //     System.out.println("2,System.currentTimeMillis() = " + System.currentTimeMillis());
        //     try {
        //         Thread.sleep(2000);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        //     return UUID.randomUUID();
        // }, threadPoolTaskExecutor);
        // CompletableFuture future2 = ConcurrentUtils.getFuture(() -> {
        //     System.out.println("3,System.currentTimeMillis() = " + System.currentTimeMillis());
        //     try {
        //         Thread.sleep(2000);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        //     return UUID.randomUUID();
        // }, threadPoolTaskExecutor);
        // // future.thenAccept(e ->{
        // // });

        // objectCompletionService.submit()
        // map.put(0, future);
        // map.put(1, future1);
        // map.put(2, future2);
        // map.put(0, future.get());
        // map.put(1, future1.get());
        // map.put(2, future2.get());

        CompletionService<Object> service = ThreadUtil.newCompletionService(threadPoolTaskExecutor.getThreadPoolExecutor());
        Future<Object> submit = service.submit(() -> {
            System.out.println("3,System.currentTimeMillis() = " + System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return UUID.randomUUID();
        });
        Future<Object> submit1 = service.submit(() -> {
            System.out.println("3,System.currentTimeMillis() = " + System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return UUID.randomUUID();
        });
        Future<Object> submit2 = service.submit(() -> {
            System.out.println("3,System.currentTimeMillis() = " + System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return UUID.randomUUID();
        });
        map.put(0, submit.get());
        map.put(1, submit1.get());
        map.put(2, submit2.get());
        return ResponseResult.succ(map);
    }
}
