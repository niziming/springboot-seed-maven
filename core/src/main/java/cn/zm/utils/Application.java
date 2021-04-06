package cn.zm.utils;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

//@Data
@Component
//@ConfigurationProperties(prefix = "spring")
public class Application {
    @Value("${spring.datasource.url}")
    private String url;
    //@Value("${spring.generate}")
    private HashMap generate;
    //
    private static String url1;
    //private static HashMap generate1;
    //
    @PostConstruct
    public void setDatasource(){
        url1 = this.url;
    }

    public static String getDatasource(){
        return url1;
    }
}
