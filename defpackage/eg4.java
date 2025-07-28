package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: eg4  reason: default package */
public final class eg4 implements s16 {
    public final Application a;
    public final Context b;
    public final String c = "https";
    public final String o = "max.ru";

    public eg4(Application application, wy9 wy9) {
        this.a = application;
        this.b = wy9;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [jk9, java.lang.Object] */
    public final Object invoke() {
        try {
            if (!at7.x0) {
                swb.i = true;
                at7.x0 = true;
                oyb.h = new Object();
            }
            gw2 gw2 = new gw2(7, this);
            bve bve = new bve("app-scope");
            gw2.invoke(bve);
            at7.w0 = bve.a();
        } catch (Throwable unused) {
        }
        return jue.a;
    }
}
