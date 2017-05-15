package com.self.test.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloLog4J {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Logger logger = LoggerFactory.getLogger(HelloLog4J.class);
		System.out.println("Intitial output");
		while(true) {
			logger.info("This is how you configure Log4J with SLF4J");
			logger.debug("Sample debug message");
			logger.info("Sample info message");
			logger.warn("Sample warn message");
			logger.error("Sample error message");
			Thread.sleep(100);
		}
	}

}
