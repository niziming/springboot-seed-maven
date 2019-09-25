package cn.springboot.seed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.springboot.seed.mapper")
public class SeedApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SeedApplication.class, args);
    }

}
