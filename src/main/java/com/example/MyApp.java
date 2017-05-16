package com.example;

import com.jcabi.aspects.Loggable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class MyApp {
    private static Logger logger = LogManager.getLogger(MyApp.class);

//    @Loggable(limit = 200, value = 0, unit = TimeUnit.MILLISECONDS, prepend = true)
    @Loggable(prepend = true)
    public static void sayHi(Integer a, Integer b) {

        System.out.println("Hello World!");
        logger.debug("LOG4J logger ... hello World");
    }
    public static void main( String[] args ) {
        sayHi(5, 8);
    }
}
