package com.mr.wxsc.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = "com.mr.wxsc")
@MapperScan("com..mr.wxsc.dao.mapper")
public class WxscWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WxscWebApplication.class, args);
    }
}
