package cn.zm.common.aspect;

import cn.zm.common.config.ThreadPoolConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Aspect
@Component
@Slf4j
public class UserOperationLogAspect {
  @Resource
  private ThreadPoolConfiguration threadPoolTaskExecutor;
  /**
   * request请求
   */
  @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
  public void request() {
  }

  /**
   * post请求
   */
  @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
  public void postRequest() {
  }

  /**
   * get请求
   */
  @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
  public void getRequest() {
  }

  /**
   * put请求
   */
  @Pointcut("@annotation(org.springframework.web.bind.annotation.PutMapping)")
  public void putRequest() {
  }

  /**
   * delete请求
   */
  @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
  public void deleteRequest() {
  }

  @Before("request() || postRequest() || getRequest() || putRequest() || deleteRequest()")
  public void doBefore(JoinPoint joinPoint) {
    Object[] args = joinPoint.getArgs();
    threadPoolTaskExecutor.threadPoolTaskExecutor().execute(() -> {
      log.info("请求参数-->{}", args);
    });
  }

  @AfterReturning(returning = "response", pointcut = "request() || postRequest() || getRequest() || putRequest() || deleteRequest()")
  public void doAfterReturning(Object response) throws Throwable {
    threadPoolTaskExecutor.threadPoolTaskExecutor().execute(() -> {
      log.info("响应参数<--{}", response);
    });

  }

  @AfterThrowing(pointcut = "request() || postRequest() || getRequest() || putRequest() || deleteRequest()", throwing = "ex")
  public void doAfterReturning(Throwable ex) throws Throwable {
    threadPoolTaskExecutor.threadPoolTaskExecutor().execute(() -> {
      log.info("错误参数-><-{}", ex.getMessage());
    });

  }

}
