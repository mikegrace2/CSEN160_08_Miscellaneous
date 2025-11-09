package com.csen160.I_Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Algorithms {
	private static final Logger logger = LogManager.getLogger(Algorithms.class);
	
	public double divide(double a, double b) {
		logger.debug("divide("+a+", "+b+") executed! (debug)");
		return a/b;
	}
	
	public int multiply(int a, int b) {
		logger.debug("multiply("+a+", "+b+") executed! (debug)");
		return a * b;
	}
	
	public int subtract(int a, int b) {
		logger.debug("subtract("+a+", "+b+") executed! (debug)");
		return a - b;
	}
	
	public int sum(int a, int b) {
		logger.debug("sum("+a+", "+b+") executed! (debug)");
		return a + b;
	}
}
