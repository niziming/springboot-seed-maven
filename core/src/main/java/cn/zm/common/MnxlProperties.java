package cn.zm.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "mnxl")
public class MnxlProperties {

    private Map<String, Object> mx;

    public Map<String, Object> getMx() {
        return mx;
    }

    public void setMx(Map<String, Object> mx) {
        this.mx = mx;
    }
}
