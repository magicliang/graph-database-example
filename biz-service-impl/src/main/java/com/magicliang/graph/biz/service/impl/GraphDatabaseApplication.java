package com.magicliang.graph.biz.service.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

/**
 * 主程序类
 *
 * @author magicliang
 */
@EnableNeo4jRepositories
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GraphDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphDatabaseApplication.class, args);
	}

}
