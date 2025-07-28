package defpackage;

/* renamed from: i0  reason: default package */
public final class i0 extends gh0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k0 c;

    public i0(k0 k0Var, String str, boolean z) {
        this.c = k0Var;
        this.a = str;
        this.b = z;
    }

    public final void b(g0 g0Var) {
        boolean h = g0Var.h();
        float d = g0Var.d();
        String str = this.a;
        k0 k0Var = this.c;
        if (!k0Var.h(str, g0Var)) {
            k0Var.i("ignore_old_datasource @ onProgress", (Throwable) null);
            g0Var.a();
        } else if (!h) {
            k0Var.h.m(d, false);
        }
    }

    public final void e(g0 g0Var) {
        this.c.l(this.a, g0Var, g0Var.c(), true);
    }

    public final void f(g0 g0Var) {
        boolean h = g0Var.h();
        boolean z = g0Var instanceof pcc;
        float d = g0Var.d();
        Object e = g0Var.e();
        if (e != null) {
            this.c.m(this.a, g0Var, e, d, h, this.b, z);
        } else if (h) {
            this.c.l(this.a, g0Var, new NullPointerException(), true);
        }
    }
}
