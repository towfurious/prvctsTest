package base.core;


public class LogHelper {
    private static LogHelper instance;

    static {
        instance = new LogHelper();
    }

    private LogHelper() {
    }


    public static LogHelper getLogger() {
        return instance;
    }

    public void info(String comment) {
        System.out.println("STEP: " + comment);

    }

    public void debug(String comment) {
        System.out.println("STEP: " + comment);
    }
}
