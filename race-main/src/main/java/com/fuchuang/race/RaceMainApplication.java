package com.fuchuang.race;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.fuchuang.race.mapper")
public class RaceMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(RaceMainApplication.class,args);
    }
}
