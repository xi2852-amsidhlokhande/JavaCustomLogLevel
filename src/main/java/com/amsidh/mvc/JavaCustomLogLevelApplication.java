package com.amsidh.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JavaCustomLogLevelApplication implements CommandLineRunner {

    public static final Marker DB_MSG = MarkerFactory.getMarker("LOGTODB");
    final Logger logger = LoggerFactory.getLogger(JavaCustomLogLevelApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JavaCustomLogLevelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Create and use a new custom level "DIAG".
        logger.info("This is sample info message will be displayed on console only");
        logger.info(DB_MSG, "This is sample log to database message will be logged inside db file only");
    }
}
