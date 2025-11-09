package com.csen160.I_Log4J;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class MainExecutorOld {
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static void reverseString(String input) throws IllegalArgumentException{
		if (input == null)
			throw new IllegalArgumentException();
	}
	
	private static final Logger logger = LogManager.getLogger(MainExecutorOld.class);
	
	public static void main( String[] args ) {
		Configurator.setLevel(MainExecutor.class, Level.ALL);
		//Configurator.setRootLevel(Level.OFF);
		
		System.out.println("LogLevel: "+logger.getLevel());
		
		logger.trace("main() executed! (trace)");
		logger.debug("main() executed! (debug)");
		logger.info("main() executed! (info)");
		logger.warn("main() executed! (warn)");
		logger.error("main() executed! (error)");
		logger.fatal("main() executed! (fatal)");
	}
}
