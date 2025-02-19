package com.mqw.mybatisdbshiftdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MybatisDbShiftDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDbShiftDemoApplication.class, args);


    }

}
