package com.valmaraz.mvp;


public class Environment {

    public static long CACHE_MAX_LIFETIME_IN_MILLIS = 5 * 1000;

    // Default values (PRODUCTION)
    public static boolean showLog = false;
    public static boolean useSnackbar = true;
    public static String apiUrl = "http://api.openweathermap.org";
    public static String apiBaseUrl = "http://api.openweathermap.org/data/2.5/";
    public static String apiKey = "c9070d7432f57f4f67867f32347574e9";

    private static Type type = Type.DEVELOP;

    public static void configure() {
        switch (type) {
            case DEVELOP:
                showLog = true;
                useSnackbar = true;
                apiUrl = "http://api.openweathermap.org";
                apiBaseUrl = "http://api.openweathermap.org/data/2.5/";
                apiKey = "c9070d7432f57f4f67867f32347574e9";
                break;
            case PREPRODUCTION:
                showLog = true;
                useSnackbar = true;
                apiUrl = "http://api.openweathermap.org";
                apiBaseUrl = "http://api.openweathermap.org/data/2.5/";
                apiKey = "c9070d7432f57f4f67867f32347574e9";
                break;
            case PRODUCTION:
                showLog = false;
                useSnackbar = true;
                apiUrl = "http://api.openweathermap.org";
                apiBaseUrl = "http://api.openweathermap.org/data/2.5/";
                apiKey = "c9070d7432f57f4f67867f32347574e9";
                break;
        }
    }

    public enum Type {
        DEVELOP,
        PREPRODUCTION,
        PRODUCTION
    }
}
