package org.ron.c128;

import java.util.logging.Logger;

public class Logging {

    private static final Logger LOGGER = Logger.getLogger(Logging.class.getName());

    private final StringBuilder sb = new StringBuilder();

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%4$-7s] %5$s%n");
    }

    public void m1() {
        System.out.println("m1()");
        System.out.println("sb = " + sb);
        sb.append(123).append(" xyz ").append(3.14);
        System.out.println("sb = " + sb);
    }

    public void m2() {
        LOGGER.info("m2()");
        LOGGER.warning("sb = " + sb);
        sb.append(123).append(" xyz ").append(3.14);
        LOGGER.severe("sb = " + sb);
    }

    public static void main(String[] args) {
        Logging logging = new Logging();
        logging.m1();
        logging.m2();
    }
}
