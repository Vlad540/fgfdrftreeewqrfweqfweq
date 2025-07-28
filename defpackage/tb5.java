package defpackage;

/* renamed from: tb5  reason: default package */
public final class tb5 implements zz3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tb5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    private final void f(g0 g0Var) {
    }

    public final void a(g0 g0Var) {
        switch (this.a) {
            case 0:
                yv1 yv1 = (yv1) this.b;
                if (!yv1.isCancelled() && g0Var.h()) {
                    yv1.resumeWith(g0Var.e());
                    return;
                }
                return;
            default:
                boolean f = g0Var.f();
                pcc pcc = (pcc) this.b;
                if (f) {
                    if (g0Var == pcc.h) {
                        pcc.l((Object) null, false, g0Var.a);
                        return;
                    }
                    return;
                } else if (g0Var.h()) {
                    pcc.getClass();
                    return;
                } else {
                    return;
                }
        }
    }

    public final void b(g0 g0Var) {
        switch (this.a) {
            case 0:
                return;
            default:
                pcc pcc = (pcc) this.b;
                if (g0Var == pcc.h) {
                    pcc.k(g0Var.d());
                    return;
                }
                return;
        }
    }

    public final void c(g0 g0Var) {
        switch (this.a) {
            case 0:
                yv1 yv1 = (yv1) this.b;
                if (yv1.isActive()) {
                    Throwable c = g0Var.c();
                    if (c == null) {
                        c = new IllegalStateException("fail");
                    }
                    yv1.resumeWith(new kcc(c));
                    return;
                }
                return;
            default:
                ((pcc) this.b).getClass();
                return;
        }
    }

    public final void d() {
        switch (this.a) {
            case 0:
                yv1 yv1 = (yv1) this.b;
                if (yv1.isActive()) {
                    yv1.cancel((Throwable) null);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
