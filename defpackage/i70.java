package defpackage;

import android.net.Uri;

/* renamed from: i70  reason: default package */
public final class i70 extends b0 {
    public final String a;
    public final String b;

    public i70(String str, String str2) {
        this.a = str2;
        this.b = str;
    }

    public final kl getScope() {
        return kl.b;
    }

    public final Uri getUri() {
        return sl.a("auth.anonymLogin");
    }

    public final void populateParams(el elVar) {
        elVar.b("referrer", (String) null);
        String str = this.a;
        elVar.b("deviceId", str);
        elVar.a(new uo0("verification_supported", true));
        elVar.b("verification_token", (String) null);
        elVar.b("verification_supported_v", "1");
        elVar.b("client", "test");
        elVar.a(new uo0("gen_token", true));
        if (str == null) {
            str = "test";
        }
        String str2 = this.b;
        elVar.b("session_data", str2 != null ? c3d.i("{\"auth_token\": \"", str2, "\", \"version\": 3, \"device_id\": \"", str, "\", \"client_version\": 1}") : wn6.i("{\"version\": 2, \"device_id\": \"", str, "\", \"client_version\": 1}"));
    }
}
