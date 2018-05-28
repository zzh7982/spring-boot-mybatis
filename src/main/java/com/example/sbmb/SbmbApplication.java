package com.example.sbmb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sbmb.mapper")
public class SbmbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmbApplication.class, args);
    }
}
