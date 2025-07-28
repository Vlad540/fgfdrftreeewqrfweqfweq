package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sa  reason: default package */
public final class sa extends taf {
    public final t0c X;
    public final m54 b;
    public final t97 c;
    public final grd o;

    public sa(t97 t97, m54 m54) {
        this.b = m54;
        this.c = t97;
        grd a = hrd.a(qa.c);
        this.o = a;
        this.X = new t0c(a);
        ez3.N(new ck5(((py0) ((vx0) t97.getValue())).w0, new ra(this, (Continuation) null), 5), this.a);
    }

    public final void q(boolean z) {
        py0 py0 = (py0) ((vx0) this.c.getValue());
        fn6 fn6 = udd.e;
        if (fn6 != null) {
            py0.getClass();
            if (fn6.c()) {
                fn6.d(tn7.X, "CallAdminSettingsController", us8.k("Update users from waiting room for all with apply state=", z), (Throwable) null);
            }
        }
        py0.Y.updateAndGet(new ay0(z, py0));
        if (!z) {
            py0.j();
        }
    }
}
