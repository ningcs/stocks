package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@EnableSwagger2
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class StocksNewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksNewsApplication.class, args);
	}
}
