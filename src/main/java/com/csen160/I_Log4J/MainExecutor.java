package com.csen160.I_Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainExecutor {
    private static final Logger logger = LogManager.getLogger(MainExecutor.class);

    // example replacement of System.out.println
    public static double calculate_Mult() {
        long start = System.currentTimeMillis();
        double returnVal = 0;
        for (long i = 0; i < 500_000_000; i++) {
            returnVal = returnVal * i * (Math.sqrt(3456) * 3343454.7f);
        }
        long end = System.currentTimeMillis();
        logger.info("{} Multiplications: Time in ms: {}", Thread.currentThread().getName(), (end - start));
        logger.warn("{} Multiplications: Time in ms: {}", Thread.currentThread().getName(), (end - start));
        logger.trace("{} Multiplications: Time in ms: {}", Thread.currentThread().getName(), (end - start));
        logger.error("{} Multiplications: Time in ms: {}", Thread.currentThread().getName(), (end - start));
        logger.fatal("{} Multiplications: Time in ms: {}", Thread.currentThread().getName(), (end - start));
        return returnVal;
    }

    public static void main(String[] args) {
        System.out.println("Hello, Log4J!");
        MainExecutor.calculate_Mult();
    }
}
