package defpackage;

/* renamed from: bq9  reason: default package */
public final class bq9 extends gh0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ bq9(zv1 zv1, int i) {
        this.a = i;
        this.b = zv1;
    }

    public final void d() {
        switch (this.a) {
            case 0:
                yv1 yv1 = this.b;
                if (yv1.isActive()) {
                    yv1.cancel(new Throwable("Cancelled with fresco pipeline"));
                    return;
                }
                return;
            default:
                yv1 yv12 = this.b;
                if (yv12.isActive()) {
                    yv12.cancel(new Throwable("Cancelled with fresco pipeline"));
                    return;
                }
                return;
        }
    }

    public final void e(g0 g0Var) {
        switch (this.a) {
            case 0:
                yv1 yv1 = this.b;
                if (yv1.isActive()) {
                    yv1.resumeWith(new kcc(new Throwable("Fetch failed", g0Var.c())));
                    return;
                }
                return;
            default:
                this.b.resumeWith((Object) null);
                return;
        }
    }

    public final void f(g0 g0Var) {
        switch (this.a) {
            case 0:
                yv1 yv1 = this.b;
                if (yv1.isActive()) {
                    yv1.resumeWith(jue.a);
                    return;
                }
                return;
            default:
                boolean h = g0Var.h();
                yv1 yv12 = this.b;
                if (!h) {
                    yv12.resumeWith((Object) null);
                    return;
                }
                e13 o = e13.o((e13) g0Var.e());
                if (o == null) {
                    yv12.resumeWith((Object) null);
                    return;
                } else {
                    yv12.resumeWith(o.e0());
                    return;
                }
        }
    }
}
