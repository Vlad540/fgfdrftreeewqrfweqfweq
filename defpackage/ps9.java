package defpackage;

/* renamed from: ps9  reason: default package */
public final class ps9 extends w2 {
    public final /* synthetic */ int b;
    public final v1b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps9(nv9 nv9, v1b v1b, int i) {
        super(nv9);
        this.b = i;
        this.c = v1b;
    }

    public final void q(bw9 bw9) {
        switch (this.b) {
            case 0:
                this.a.a(new os9(bw9, this.c, 0));
                return;
            case 1:
                this.a.a(new st9(bw9, this.c, 0));
                return;
            case 2:
                this.a.a(new os9(bw9, this.c, 1));
                return;
            default:
                this.a.a(new os9(bw9, this.c, 2));
                return;
        }
    }
}
