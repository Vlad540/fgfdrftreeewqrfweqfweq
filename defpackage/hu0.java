package defpackage;

/* renamed from: hu0  reason: default package */
public enum hu0 {
    CALLBACK("CALLBACK"),
    LINK("LINK"),
    REQUEST_CONTACT("REQUEST_CONTACT"),
    REQUEST_GEO_LOCATION("REQUEST_GEO_LOCATION"),
    CHAT("CHAT"),
    OPEN_APP("OPEN_APP"),
    MESSAGE("MESSAGE"),
    UNKNOWN("UNKNOWN");
    
    public static final hu0[] y0 = null;
    public final String a;

    static {
        y0 = values();
    }

    /* access modifiers changed from: public */
    hu0(String str) {
        this.a = str;
    }
}
