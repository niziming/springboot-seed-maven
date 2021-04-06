package cn.zm.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanUtil {

    private static Application application;

    @Autowired
    public void setApplication(Application application) {
        SpringBeanUtil.application = application;
    }

    /**
     * 获取 YAML 配置
     * @return YAML 配置
     */
    public static Application getApplication() {
        return application;
    }

}
