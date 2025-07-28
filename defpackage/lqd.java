package defpackage;

/* renamed from: lqd  reason: default package */
public final class lqd extends yw5 {
    public final /* synthetic */ vtc b;
    public final /* synthetic */ xw2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lqd(xw2 xw2, vtc vtc, vtc vtc2) {
        super(vtc);
        this.c = xw2;
        this.b = vtc2;
    }

    public final ttc e(long j) {
        ttc e = this.b.e(j);
        ztc ztc = e.a;
        long j2 = ztc.a;
        long j3 = ztc.b;
        long j4 = this.c.b;
        ztc ztc2 = new ztc(j2, j3 + j4);
        ztc ztc3 = e.b;
        return new ttc(ztc2, new ztc(ztc3.a, ztc3.b + j4));
    }
}
