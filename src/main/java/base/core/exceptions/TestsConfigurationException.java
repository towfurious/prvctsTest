package base.core.exceptions;


public class TestsConfigurationException extends RuntimeException {

    public TestsConfigurationException(String message) {
        super(message);
    }

    public TestsConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
