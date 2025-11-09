package com.csen160.J_JUL;

import static java.time.Instant.now;
import static java.time.temporal.ChronoUnit.MILLIS;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JULExample {
    private static final Logger log = Logger.getLogger(JULExample.class.getName());

    public void init() {
        System.out.println("INIT started!!!");

        try {
            // Load jul.properties from classpath (place jul.properties in src/main/resources)
            try (InputStream is = getClass().getClassLoader().getResourceAsStream("jul.properties")) {
                if (is != null) {
                    LogManager.getLogManager().readConfiguration(is);
                }
            }

            // Ensure logs directory exists
            Path logsDir = Path.of("logs");
            if (!Files.exists(logsDir)) {
                Files.createDirectories(logsDir);
            }

            // Explicitly set logger level so all messages are processed
            log.setLevel(Level.ALL);
            log.setUseParentHandlers(false); // control handlers explicitly

            // File handler (append = true)
            FileHandler fh = new FileHandler("logs/julApp.log", true);
            fh.setLevel(Level.ALL);
            fh.setFormatter(new SimpleFormatter());
            log.addHandler(fh);

            // Console handler
            ConsoleHandler con = new ConsoleHandler();
            con.setLevel(Level.ALL);
            con.setFormatter(new SimpleFormatter());
            log.addHandler(con);

        } catch (Exception e) {
            // If logging is not yet configured, print stack to console
            System.err.println("Failed to init logging: " + e);
            e.printStackTrace();
        }

        System.out.println("INIT END =================================================");
    }

    public static void main(String[] args) {
        JULExample myJULExample=new JULExample();
        myJULExample.init();

        Instant start = now();
        log.severe("severe");
        log.warning("warning");
        log.info("info");
        log.config("config");
        log.fine("fine");
        log.finer("finer");
        log.finest("finest");

        try {
            log.log(Level.INFO, "In {0} seconds it starts", 0);
            throw new IllegalArgumentException();
        }catch(Exception e) {
            log.log(Level.SEVERE, "Bad Exception: ", e);
        }

        log.log(Level.INFO,"Runtime in  {0} ms", start.until(now(), MILLIS));
    }
}