package cn.springboot.seed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.springboot.seed.mapper")
public class SeedApplication extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //SeedApplication.class为带有@SpringBootApplication注解的启动类
        return builder.sources(SeedApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SeedApplication.class, args);
    }
}
