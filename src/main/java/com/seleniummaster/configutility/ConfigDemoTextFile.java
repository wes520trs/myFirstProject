package com.seleniummaster.configutility;

public class ConfigDemoTextFile {
    public static void main(String[] args) {
        String configFile="config.txt"; //.txt yerine herhangi bir dosya turu olsa da yine de icerigini okuyabiliyor
        ApplicationConfig.readConfigProperties(configFile, "produrl");
        ApplicationConfig.readConfigProperties(configFile,"qaurl");
        ApplicationConfig.readConfigProperties(configFile,"username");
        ApplicationConfig.readConfigProperties(configFile,"password");
        ApplicationConfig.readConfigProperties(configFile,"timeout");
    }
}
