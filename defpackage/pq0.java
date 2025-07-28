package defpackage;

/* renamed from: pq0  reason: default package */
public final class pq0 extends rd4 {
    public final z4b c;
    public final /* synthetic */ bie d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pq0(bie bie, ah0 ah0, z4b z4b) {
        super(ah0);
        this.d = bie;
        this.c = z4b;
    }

    public final void f(Throwable th) {
        ((y4b) this.d.c).a(this.b, this.c);
    }

    public final void h(int i, Object obj) {
        ax4 ax4 = (ax4) obj;
        z4b z4b = this.c;
        tr6 tr6 = ((ji0) z4b).a;
        boolean a = ah0.a(i);
        boolean B = vx3.B(ax4, tr6.i);
        ah0 ah0 = this.b;
        if (ax4 != null && (B || tr6.f)) {
            if (!a || !B) {
                ah0.g(i & -2, ax4);
            } else {
                ah0.g(i, ax4);
            }
        }
        if (a && !B && !tr6.g) {
            ax4.d(ax4);
            ((y4b) this.d.c).a(ah0, z4b);
        }
    }
}
