package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ezc  reason: default package */
public final class ezc implements pf4, SharedPreferences.OnSharedPreferenceChangeListener {
    public final f03 a;
    public final t97 b;
    public final long c = System.nanoTime();
    public final long d = System.nanoTime();
    public final grd e;
    public final t0c f;

    public ezc(t97 t97, f03 f03) {
        this.a = f03;
        this.b = t97;
        grd a2 = hrd.a(e());
        this.e = a2;
        this.f = new t0c(a2);
        f3 f3Var = f03 instanceof f3 ? (f3) f03 : null;
        if (f3Var != null) {
            f3Var.g.registerOnSharedPreferenceChangeListener(this);
        }
    }

    public final void b() {
        f3 f3Var = this.a;
        f3 f3Var2 = f3Var instanceof f3 ? f3Var : null;
        if (f3Var2 != null) {
            f3Var2.g.unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    public final zqd c() {
        return this.f;
    }

    public final void d(z14 z14) {
        long j = z14.a;
        int i = (j > this.c ? 1 : (j == this.c ? 0 : -1));
        t97 t97 = this.b;
        if (i == 0) {
            gf4.b.getClass();
            ((d34) t97.getValue()).b(k34.a(gf4.h.a), (Bundle) null);
        } else if (j == this.d) {
            gf4.b.getClass();
            ((d34) t97.getValue()).b(k34.a(gf4.i.a), (Bundle) null);
        }
    }

    public final List e() {
        i03 i03 = this.a;
        String B = i03.B();
        String str = BuildConfig.FLAVOR;
        if (B == null) {
            B = str;
        }
        z14 z14 = new z14(this.c, new lge(B), 0, new lge("Адрес сервера"), (n06) null, 20);
        String C = i03.C();
        if (C != null) {
            str = C;
        }
        return p23.B(z14, new z14(this.d, new lge(str), 0, new lge("Порт сервера"), (n06) null, 20));
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.e.m((Object) null, e());
    }
}
