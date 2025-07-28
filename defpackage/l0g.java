package defpackage;

import android.content.Context;

/* renamed from: l0g  reason: default package */
public final class l0g extends la6 implements see {
    public static final qe4 A0 = new qe4("LocationServices.API", (n06) new wyf(4), (s59) new Object());
    public static final qe4 B0 = new qe4("SmsRetriever.API", (n06) new wyf(3), (s59) new Object());
    public static int C0 = 1;
    public static final qe4 z0 = new qe4("ClientTelemetry.API", (n06) new wyf(2), (s59) new Object());

    public n6g d(ree ree) {
        bq0 bq0 = new bq0();
        bq0.b = 0;
        bq0.e = new ib5[]{kjd.p};
        bq0.c = false;
        bq0.d = new qqe(ree);
        return c(2, bq0.a());
    }

    public synchronized int e() {
        try {
            if (C0 == 1) {
                Context context = this.a;
                ma6 ma6 = ma6.d;
                int b = ma6.b(context, 12451000);
                if (b == 0) {
                    C0 = 4;
                } else if (ma6.a(b, context, (String) null) != null || gr4.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    C0 = 2;
                } else {
                    C0 = 3;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return C0;
    }
}
