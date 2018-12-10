package com.nit.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLoggerWithLogbackApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootLoggerWithLogbackApplication.class);

	public static void main(String[] args) {
		logger.error("SpringBootLoggerWithLogbackApplication");
		logger.info("SpringBootLoggerWithLogbackApplication");
		logger.debug("SpringBootLoggerWithLogbackApplication");
		logger.warn("SpringBootLoggerWithLogbackApplication");
		logger.trace("SpringBootLoggerWithLogbackApplication");
		SpringApplication.run(SpringBootLoggerWithLogbackApplication.class, args);

	}
}
