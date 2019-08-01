package base.core.configuration;


import base.core.configuration.testProperties.PropertiesLoader;
import base.core.configuration.testProperties.Property;
import base.core.configuration.testProperties.PropertyFile;

/**
 * Class for base tests properties - urls for test, browser name and version
 */

@PropertyFile("config.properties")
public class TestsConfig {

    private static TestsConfig config;

    public static TestsConfig getConfig() {
        if (config == null) {
            config = new TestsConfig();
        }
        return config;
    }

    private TestsConfig() {
        PropertiesLoader.populate(this);
    }

    @Property("browser")
    private String browser = "";

    @Property("url")
    private String url = "";


    /**
     * getting browser version
     *
     * @return browser version
     */
    public String getBrowser() {
        return browser;
    }

    public String getUrl() {
        return url;
    }
}
