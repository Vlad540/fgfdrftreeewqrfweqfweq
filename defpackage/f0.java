package defpackage;

/* renamed from: f0  reason: default package */
public final class f0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ zz3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ g0 o;

    public f0(g0 g0Var, boolean z, zz3 zz3, boolean z2) {
        this.o = g0Var;
        this.a = z;
        this.b = zz3;
        this.c = z2;
    }

    public final void run() {
        boolean z = this.a;
        g0 g0Var = this.o;
        zz3 zz3 = this.b;
        if (z) {
            zz3.c(g0Var);
        } else if (this.c) {
            zz3.d();
        } else {
            zz3.a(g0Var);
        }
    }
}
