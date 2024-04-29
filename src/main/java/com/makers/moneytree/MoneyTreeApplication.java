package com.makers.moneytree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"com.makers.moneytree"})
@EnableMongoRepositories("com.makers.moneytree.repository")
public class MoneyTreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyTreeApplication.class, args);
	}

}
