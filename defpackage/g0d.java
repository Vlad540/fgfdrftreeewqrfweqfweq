package defpackage;

/* renamed from: g0d  reason: default package */
public final class g0d extends e1d {
    public final /* synthetic */ int l;
    public final Object m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0d(long j, Object obj, int i) {
        super(j);
        this.l = i;
        this.m = obj;
    }

    public final f1d a() {
        switch (this.l) {
            case 0:
                return new h0d(this);
            case 1:
                return new h0d(this, (byte) 0);
            default:
                return new g1d(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0d(xm8 xm8) {
        super(0);
        this.l = 0;
        this.m = xm8;
    }
}
