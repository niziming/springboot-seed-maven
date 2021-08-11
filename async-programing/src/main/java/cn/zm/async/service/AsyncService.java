package cn.zm.async.service;

import java.util.concurrent.Future;

public interface AsyncService {

    /**
     * 异步搜索
     */
    Future<String> searchAppInfo() throws Exception;
    /**
     * 待办搜索-异步
     */
    Future<String> searchPending() throws Exception;
    /**
     * 用户搜索-异步
     */
    Future<String> searchUser() throws Exception;
}
