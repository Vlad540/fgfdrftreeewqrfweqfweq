package defpackage;

import java.util.concurrent.Callable;

/* renamed from: rk7  reason: default package */
public final /* synthetic */ class rk7 implements Callable {
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ sk7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ rk7(sk7 sk7, long j, long j2, boolean z, long j3, long j4) {
        this.a = sk7;
        this.b = j;
        this.c = j2;
        this.o = z;
        this.X = j3;
        this.Y = j4;
    }

    public final Object call() {
        vo8 vo8;
        long j = this.c;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        xm8 xm8 = null;
        sk7 sk7 = this.a;
        long j2 = this.Y;
        if (i != 0) {
            vo8 = ((to8) sk7.a.getValue()).j(j2, j);
        } else {
            long j3 = this.X;
            if (j3 == 0) {
                vo8 = ((to8) sk7.a.getValue()).q(this.b);
            } else {
                nec nec = ((hz3) ((to8) sk7.a.getValue()).a).c;
                jp8 h = nec.d().h(j2, j3);
                vo8 = h != null ? nec.b(h) : null;
            }
        }
        if (vo8 != null && (this.o || vo8.z0 != ls8.DELETED)) {
            xm8 = rp8.a((rp8) sk7.b.getValue(), vo8);
        }
        if (xm8 != null) {
            return xm8;
        }
        throw new IllegalStateException("message not found or deleted");
    }
}
