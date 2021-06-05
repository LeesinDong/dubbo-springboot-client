package com.leesin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.leesin.spring.mapper")
public class DubboSpringbootClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootClientApplication.class, args);
    }

}
