package com.amsidh.mvc;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JavaCustomLogLevelApplication implements CommandLineRunner {

    final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        SpringApplication.run(JavaCustomLogLevelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.log(Level.getLevel("VERBOSE"), "a verbose message"); // use the custom VERBOSE level
        // Create and use a new custom level "DIAG".
        logger.log(Level.getLevel("DIAG"), "a diagnostic message");
        logger.log(Level.getLevel("DIAG"), "another diagnostic message");
    }
}
