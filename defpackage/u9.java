package defpackage;

/* renamed from: u9  reason: default package */
public final class u9 extends rd4 {
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9(ah0 ah0, int i) {
        super(ah0);
        this.c = i;
    }

    public final void h(int i, Object obj) {
        switch (this.c) {
            case 0:
                ax4 ax4 = (ax4) obj;
                ah0 ah0 = this.b;
                if (ax4 == null) {
                    ah0.g(i, (Object) null);
                    return;
                }
                if (!ax4.U(ax4)) {
                    ax4.S();
                }
                ah0.g(i, ax4);
                return;
            case 1:
                e13 e13 = (e13) obj;
                if (!ah0.b(i)) {
                    this.b.g(i, e13);
                    return;
                }
                return;
            case 2:
                ax4 ax42 = (ax4) obj;
                e13 e132 = null;
                try {
                    if (ax4.m0(ax42) && ax42 != null) {
                        e132 = e13.o(ax42.a);
                    }
                    this.b.g(i, e132);
                    return;
                } finally {
                    e13.S(e132);
                }
            default:
                if (ah0.a(i)) {
                    this.b.g(i, (Object) null);
                    return;
                }
                return;
        }
    }
}
