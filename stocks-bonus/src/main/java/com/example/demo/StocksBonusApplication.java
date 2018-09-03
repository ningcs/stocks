package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@EnableSwagger2
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class StocksBonusApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksBonusApplication.class, args);
	}
}
