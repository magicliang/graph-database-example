package com.magicliang.dataintensiveapplication.graphdatabaseapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class GraphDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphDatabaseApplication.class, args);
	}

}
