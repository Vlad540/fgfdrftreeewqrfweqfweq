package defpackage;

import android.app.Application;
import android.view.Surface;

/* renamed from: rza  reason: default package */
public final class rza implements yya {
    public final Application a;
    public final g15 b;
    public final g35 c;
    public final t97 d;
    public final gza e;
    public final String f = rza.class.getName();
    public final bs g = new bs(0);

    public rza(Application application, g15 g15, g35 g35, t97 t97, gza gza) {
        this.a = application;
        this.b = g15;
        this.c = g35;
        this.d = t97;
        this.e = gza;
    }

    public final void a(k7f k7f) {
        String str = this.f;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Players pool. Free player, " + k7f, (Throwable) null);
        }
        k7f.M0();
        k7f.L0((Surface) null);
        this.g.add(k7f);
    }

    public final k7f get() {
        if (this.g.isEmpty()) {
            udd.q(this.f, "Players pool. Pool is empty create new player");
            return new k7f(this.a, this.b, this.c, this.d, this.e);
        }
        bs bsVar = this.g;
        k7f k7f = (k7f) bsVar.d(bsVar.c - 1);
        String str = this.f;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Players pool. Pool has player, " + k7f, (Throwable) null);
        }
        return k7f;
    }
}
