package cn.springboot.seed.common;

import java.util.LinkedHashMap;

public class ResultMap extends LinkedHashMap<String, Object> {
    private static final int STATUS_SUCCESS = 200;
    private static final int STATUS_FAIL = 500;

    private static final long serialVersionUID = 1L;

    {
        set("status", STATUS_SUCCESS).set("msg", "Success");
    }

    public void err() {
        set("status", STATUS_FAIL).set("msg", "系统错误！");
    }

    // 失败
    public ResultMap fail(String msg) {
        set("status", STATUS_FAIL).set("msg", msg);
        return this;
    }

    public ResultMap success(String msg) {
        set("status", STATUS_SUCCESS).set("msg", msg);
        return this;
    }

    public void err(Exception e) {
        e.printStackTrace();
        set("status", STATUS_FAIL).set("msg", "系统错误！");
    }

    public ResultMap set(String key, Object value) {
        put(key, value);
        return this;
    }

    public ResultMap success(Object value) {
        put("data", value);
        return this;
    }
    // pagehelper分页插件
    // public ResultMap set(List<?> value) {
    //     Page<?> page = (Page<?>) value;
    //     set("data", value).set("pageNum", page.getPageNum()).set("pageSize", page.getPageSize()).set("total",
    //             page.getTotal());
    //     return this;
    // }
}
