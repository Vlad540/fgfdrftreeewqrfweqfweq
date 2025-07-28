package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import java.util.HashMap;

/* renamed from: i03  reason: default package */
public final class i03 extends lqc {
    public final boolean l = false;
    public volatile Boolean m = null;

    public i03(Context context, cg4 cg4, we5 we5) {
        super(context, we5);
        this.j = cg4;
    }

    public final String B() {
        return f("server.host", this.l ? "api.oneme.ru" : null);
    }

    public final String C() {
        return f("server.port", this.l ? "443" : null);
    }

    public final long D() {
        return e("app.stats.session.id", 0);
    }

    public final boolean E() {
        if (this.m == null) {
            this.m = Boolean.valueOf(this.g.getBoolean("ok_push_disabled", false));
        }
        try {
            return this.m.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void b() {
        String B = B();
        String C = C();
        boolean c = c("server.useTls", true);
        x97 x97 = this.g;
        String string = x97.getString("server.loginError", (String) null);
        String string2 = x97.getString("device.id", (String) null);
        String string3 = x97.getString("user.Phone.Code", (String) null);
        String f = f("user.Phone", (String) null);
        String string4 = x97.getString("app.lastSuccessProxy", (String) null);
        String string5 = x97.getString("app.currentProxyList", (String) null);
        int i = x97.getInt("app.currentProxyListTtl", 299);
        String str = string5;
        boolean z = x97.getBoolean("app.debugHostRotation", false);
        boolean z2 = x97.getBoolean("app.debugUaDnsEmulation", false);
        String q = q();
        boolean z3 = z2;
        String string6 = x97.getString("user.systemLang", (String) null);
        String string7 = x97.getString("app.tenor.anon.id", "");
        boolean z4 = z;
        long j = x97.getLong("app.last.push.state.time", 0);
        this.j.getClass();
        y0f y0f = y0f.a;
        y0f.b().getClass();
        long D = D();
        y0f y0f2 = y0f;
        ArrayMap arrayMap = new ArrayMap(1);
        ((HashMap) x97.getAll()).forEach(new g03(0, arrayMap));
        super.b();
        l("server.host", B);
        l("server.port", C);
        i("server.useTls", c);
        l("server.loginError", string);
        l("device.id", string2);
        l("user.Phone.Code", string3);
        l("user.Phone", f);
        l("app.lastSuccessProxy", string4);
        l("app.currentProxyList", str);
        j(i, "app.currentProxyListTtl");
        i("app.debugHostRotation", z4);
        i("app.debugUaDnsEmulation", z3);
        l("user.lang", q);
        l("user.systemLang", string6);
        l("app.tenor.anon.id", string7);
        String str2 = "app.last.push.state.time";
        k(str2, Long.valueOf(j));
        this.j.getClass();
        y0f2.b().getClass();
        k("app.stats.session.id", Long.valueOf(D));
        arrayMap.forEach(new h03(0, this));
    }

    public final boolean c(String str, boolean z) {
        return this.g.getBoolean(str, z);
    }
}
