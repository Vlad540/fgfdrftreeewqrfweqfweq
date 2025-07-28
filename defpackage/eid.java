package defpackage;

import android.app.Application;
import android.view.Surface;

/* renamed from: eid  reason: default package */
public final class eid implements yya {
    public final Application a;
    public final g15 b;
    public final g35 c;
    public final t97 d;
    public final gza e;
    public final String f = eid.class.getName();
    public final dbc g = new dbc(new u5b(22, this));

    public eid(Application application, g15 g15, g35 g35, t97 t97, gza gza) {
        this.a = application;
        this.b = g15;
        this.c = g35;
        this.d = t97;
        this.e = gza;
    }

    public final void a(k7f k7f) {
        udd.q(this.f, "Single player handler. Free player");
        k7f.M0();
        k7f.L0((Surface) null);
    }

    public final k7f get() {
        String str = this.f;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.k("Single player handler. Player exist: ", this.g.a()), (Throwable) null);
        }
        return (k7f) this.g.getValue();
    }
}
