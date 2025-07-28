package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: pva  reason: default package */
public final class pva {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public volatile xi4 f;

    public pva(t97 t97, t97 t972, t97 t973, t97 t974, r7e r7e) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = r7e;
    }

    public final void a() {
        xi4 xi4;
        udd.q("pva", "schedulePing");
        xi4 xi42 = this.f;
        if (!(xi42 == null || xi42.h() || (xi4 = this.f) == null)) {
            xi4.f();
        }
        this.f = ((qmc) this.e.getValue()).a().c(new eq6(24, this), 29000, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        udd.q("pva", "startInteractivePings");
        if (((zy9) this.c.getValue()).d()) {
            ((gy9) ((pk) this.a.getValue())).H(true);
        }
        a();
    }
}
