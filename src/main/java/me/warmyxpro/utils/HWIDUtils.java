package me.warmyxpro.utils;

public class HWIDUtils {
    public static String getHWID() {
        String hw =
                (System.getProperty("os.name") +
                        System.getProperty("os.version") +
                        System.getProperty("os.arch") +
                        System.getenv("PROCESSOR_ARCHITECTURE") +
                        System.getenv("PROCESSOR_ARCHITEW6432") +
                        System.getenv("PROCESSOR_IDENTIFIER") +
                        System.getenv("NUMBER_OF_PROCESSORS") +
                        Runtime.getRuntime().availableProcessors());
        return hw;
    }
}
