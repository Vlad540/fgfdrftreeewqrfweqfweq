package defpackage;

import java.util.Map;

/* renamed from: wz6  reason: default package */
public final class wz6 implements sac, c5b {
    public final tac a;
    public final c5b b;
    public final tac c;
    public final sac d;

    public wz6(xw5 xw5, sac sac) {
        this.a = xw5;
        this.b = sac;
        this.c = xw5;
        this.d = sac;
    }

    public final void a(z4b z4b, String str, Map map) {
        tac tac = this.a;
        if (tac != null) {
            tac.i(((ji0) z4b).b, str, map);
        }
        c5b c5b = this.b;
        if (c5b != null) {
            c5b.a(z4b, str, map);
        }
    }

    public final void b(z4b z4b) {
        tac tac = this.a;
        if (tac != null) {
            tac.g(((ji0) z4b).b);
        }
        c5b c5b = this.b;
        if (c5b != null) {
            c5b.b(z4b);
        }
    }

    public final void c(z4b z4b) {
        tac tac = this.c;
        if (tac != null) {
            ji0 ji0 = (ji0) z4b;
            boolean g = ji0.g();
            tac.b(ji0.a, ji0.o, ji0.b, g);
        }
        sac sac = this.d;
        if (sac != null) {
            sac.c(z4b);
        }
    }

    public final void d(z4b z4b, String str, Throwable th, Map map) {
        tac tac = this.a;
        if (tac != null) {
            tac.j(((ji0) z4b).b, str, th, map);
        }
        c5b c5b = this.b;
        if (c5b != null) {
            c5b.d(z4b, str, th, map);
        }
    }

    public final void e(z4b z4b, String str, boolean z) {
        tac tac = this.a;
        if (tac != null) {
            tac.f(((ji0) z4b).b, str, z);
        }
        c5b c5b = this.b;
        if (c5b != null) {
            c5b.e(z4b, str, z);
        }
    }

    public final void f(z4b z4b, Throwable th) {
        tac tac = this.c;
        if (tac != null) {
            ji0 ji0 = (ji0) z4b;
            tac.c(ji0.a, ji0.b, th, ji0.g());
        }
        sac sac = this.d;
        if (sac != null) {
            sac.f(z4b, th);
        }
    }

    public final void g(z4b z4b) {
        tac tac = this.c;
        if (tac != null) {
            ji0 ji0 = (ji0) z4b;
            tac.a(ji0.a, ji0.b, ji0.g());
        }
        sac sac = this.d;
        if (sac != null) {
            sac.g(z4b);
        }
    }

    public final void h(z4b z4b) {
        tac tac = this.c;
        if (tac != null) {
            tac.k(((ji0) z4b).b);
        }
        sac sac = this.d;
        if (sac != null) {
            sac.h(z4b);
        }
    }

    public final boolean i(z4b z4b, String str) {
        Boolean bool = null;
        tac tac = this.a;
        Boolean valueOf = tac != null ? Boolean.valueOf(tac.h(((ji0) z4b).b)) : null;
        if (!hhd.f(valueOf, Boolean.TRUE)) {
            c5b c5b = this.b;
            if (c5b != null) {
                bool = Boolean.valueOf(c5b.i(z4b, str));
            }
            valueOf = bool;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    public final void j(z4b z4b, String str) {
        tac tac = this.a;
        if (tac != null) {
            tac.d(((ji0) z4b).b, str);
        }
        c5b c5b = this.b;
        if (c5b != null) {
            c5b.j(z4b, str);
        }
    }

    public final void k(z4b z4b, String str) {
        tac tac = this.a;
        if (tac != null) {
            tac.e(((ji0) z4b).b, str);
        }
        c5b c5b = this.b;
        if (c5b != null) {
            c5b.k(z4b, str);
        }
    }
}
