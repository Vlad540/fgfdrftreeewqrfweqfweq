package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: rh5  reason: default package */
public final class rh5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public rh5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = g0e.a;
        a24.q("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static rh5 a(Context context) {
        d4b d4b = new d4b(context);
        String m = d4b.m("google_app_id");
        if (TextUtils.isEmpty(m)) {
            return null;
        }
        return new rh5(m, d4b.m("google_api_key"), d4b.m("firebase_database_url"), d4b.m("ga_trackingId"), d4b.m("gcm_defaultSenderId"), d4b.m("google_storage_bucket"), d4b.m("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rh5)) {
            return false;
        }
        rh5 rh5 = (rh5) obj;
        return x87.F(this.b, rh5.b) && x87.F(this.a, rh5.a) && x87.F(this.c, rh5.c) && x87.F(this.d, rh5.d) && x87.F(this.e, rh5.e) && x87.F(this.f, rh5.f) && x87.F(this.g, rh5.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        mn mnVar = new mn((Object) this);
        mnVar.r(this.b, "applicationId");
        mnVar.r(this.a, "apiKey");
        mnVar.r(this.c, "databaseUrl");
        mnVar.r(this.e, "gcmSenderId");
        mnVar.r(this.f, "storageBucket");
        mnVar.r(this.g, "projectId");
        return mnVar.toString();
    }
}
