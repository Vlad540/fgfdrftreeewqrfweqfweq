package ru.ok.android.externcalls.sdk;

public class SimpleConfigurationStore implements ya3 {
    private final String appKey;
    private final String baseEndpoint;
    private xa3 sessionInfo;

    public SimpleConfigurationStore(ya3 ya3) {
        this.appKey = ya3.getAppKey();
        this.baseEndpoint = ya3.getBaseEndpoint();
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getBaseEndpoint() {
        return this.baseEndpoint;
    }

    public xa3 getSessionInfo() {
        return this.sessionInfo;
    }

    public void setSessionInfo(xa3 xa3) {
        this.sessionInfo = xa3;
    }
}
