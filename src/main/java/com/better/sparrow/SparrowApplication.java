package com.better.sparrow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.better.sparrow.repository") this code for Mybatis config , only add this the mybitis repository can be using
@MapperScan("com.better.sparrow.repository")
public class SparrowApplication {

	public static void main(String[] args) {
		SpringApplication.run(SparrowApplication.class, args);
	}
}
