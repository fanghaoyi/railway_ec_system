package com.railway.railwayecsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.railway.railwayecsystem.mapper")
public class RailwayEcSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RailwayEcSystemApplication.class, args);
	}

}
