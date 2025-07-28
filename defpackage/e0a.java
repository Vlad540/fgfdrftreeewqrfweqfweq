package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: e0a  reason: default package */
public final class e0a implements pf4 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final long e = System.nanoTime();
    public final long f = System.nanoTime();
    public final long g = System.nanoTime();
    public final long h = System.nanoTime();
    public final grd i = hrd.a(e());

    public e0a(w4 w4Var) {
        this.a = w4Var.d(Context.class);
        this.b = w4Var.d(b9e.class);
        this.c = w4Var.d(f03.class);
        this.d = w4Var.d(ezd.class);
    }

    public final zqd c() {
        return this.i;
    }

    public final void d(z14 z14) {
        long j = z14.a;
        if (j == this.e) {
            String d2 = ((b9e) this.b.getValue()).d();
            hhd.q((Context) this.a.getValue(), d2);
            udd.p("PushToken", "Current pushToken: \"" + d2 + "\"", new Object[0]);
        } else if (j == this.f) {
            try {
                xs7.E(ha6.a, (hu3) null, (ru3) null, new d0a(this, (Continuation) null), 3);
            } catch (Throwable th) {
                udd.S("PushToken", "Refresh current token failed", th);
            }
        } else if (j == this.g) {
            i03 f2 = f();
            f2.i("ok_push_disabled", !f().E());
            f2.m = null;
            this.i.m((Object) null, e());
        } else if (j == this.h) {
            f().i("server.useTls", !f().c("server.useTls", true));
            this.i.m((Object) null, e());
        }
    }

    public final List e() {
        String str;
        lge lge = new lge("Скопировать Push token");
        String d2 = ((b9e) this.b.getValue()).d();
        if (d2 == null || (str = "...".concat(h0e.z0(10, d2))) == null) {
            str = "null";
        }
        return p23.B(new z14(this.e, lge, 0, new lge(str), (n06) null, 20), new z14(this.f, new lge("Обновить Push token"), 0, new lge(((ezd) this.d.getValue()).f), (n06) null, 20), new z14(this.g, new lge("Показывать пуши из сокета"), 0, (mge) null, new y14(!f().E()), 12), new z14(this.h, new lge("Использовать ssl"), 0, (mge) null, new y14(f().c("server.useTls", true)), 12));
    }

    public final f03 f() {
        return (f03) this.c.getValue();
    }
}
