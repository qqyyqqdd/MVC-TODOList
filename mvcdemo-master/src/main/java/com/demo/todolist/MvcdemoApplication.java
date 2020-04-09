package com.demo.todolist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lfy.mvcdemo.dao")
public class MvcdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcdemoApplication.class, args);
    }

}
