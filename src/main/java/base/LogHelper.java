package base;


public class LogHelper {

    protected void logInfo(String comment) {
        System.out.println("STEP: " + comment);
    }

    protected void logDebug(String comment) {
        System.out.println("DEBUG MESSAGE: " + comment);
    }
}