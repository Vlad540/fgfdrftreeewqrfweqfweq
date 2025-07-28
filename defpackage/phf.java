package defpackage;

/* renamed from: phf  reason: default package */
public enum phf implements kkf {
    GET_INFO("WebAppBiometryGetInfo", "biometry_get_info", 8),
    REQUEST_ACCESS("WebAppBiometryRequestAccess", "biometry_request_access", 9),
    UPDATE_TOKEN("WebAppBiometryUpdateToken", "biometry_update_token", 10),
    REQUEST_AUTH("WebAppBiometryRequestAuth", "biometry_request_auth", 11),
    OPEN_SETTINGS("WebAppBiometryOpenSettings", "biometry_open_settings", 13);
    
    public final String a;
    public final String b;
    public final Integer c;

    static {
        phf[] phfArr;
        y0 = new pz4(phfArr);
    }

    /* access modifiers changed from: public */
    phf(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final Integer a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }
}
