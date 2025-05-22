package org.lakdogan;

public class Logger {
    private static Logger instance = new Logger();

    private Logger() {

    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String msg) {
        System.out.println("log: "+ msg);
    }
}
