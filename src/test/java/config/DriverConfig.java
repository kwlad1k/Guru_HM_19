package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "classpath:config/${env}.properties"})

public interface DriverConfig extends Config {

    @Key("is.remote")
    Boolean isRemote();

    @Key("browser.name")
    @DefaultValue("chrome")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("browser.size")
    String browserSize();

    @Key("remote.url")
    String remoteUrl();
}
