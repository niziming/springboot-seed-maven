package cn.zm.common.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Slf4j
public class WebLogAspect {

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

  @Before("request() || postRequest() || getRequest()")
  public void doBefore(JoinPoint joinPoint) {
    Object[] args = joinPoint.getArgs();
    log.info("请求参数-->{}", args);
  }

  @AfterReturning(returning = "response", pointcut = "request() || postRequest() || getRequest()")
  public void doAfterReturning(Object response) throws Throwable {
    log.info("响应参数<--{}", response);
  }

  @AfterThrowing(pointcut = "request() || postRequest() || getRequest()", throwing = "ex")
  public void doAfterReturning(Throwable ex) throws Throwable {
    log.info("错误参数---{}", ex.getMessage());
  }

}
