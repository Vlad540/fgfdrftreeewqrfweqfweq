package defpackage;

/* renamed from: vie  reason: default package */
public final class vie extends rd4 {
    public final z4b c;
    public final int d;
    public final hbc e;
    public final /* synthetic */ v9 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vie(v9 v9Var, ah0 ah0, z4b z4b, int i) {
        super(ah0);
        this.f = v9Var;
        this.c = z4b;
        this.d = i;
        this.e = ((ji0) z4b).a.i;
    }

    public final void f(Throwable th) {
        v9 v9Var = this.f;
        ah0 ah0 = this.b;
        if (!v9Var.c(this.d + 1, ah0, this.c)) {
            ah0.e(th);
        }
    }

    public final void h(int i, Object obj) {
        ax4 ax4 = (ax4) obj;
        ah0 ah0 = this.b;
        if (ax4 != null && (ah0.b(i) || vx3.B(ax4, this.e))) {
            ah0.g(i, ax4);
        } else if (ah0.a(i)) {
            ax4.d(ax4);
            if (!this.f.c(this.d + 1, ah0, this.c)) {
                ah0.g(1, (Object) null);
            }
        }
    }
}
