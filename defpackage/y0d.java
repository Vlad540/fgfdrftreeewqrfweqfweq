package defpackage;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: y0d  reason: default package */
public final class y0d extends f1d {
    public static final /* synthetic */ int H0 = 0;
    public final dm7 D0;
    public final float E0;
    public final boolean F0;
    public final long G0;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r0.b == 0.0d) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y0d(defpackage.x0d r6) {
        /*
            r5 = this;
            r5.<init>(r6)
            dm7 r0 = r6.m
            r5.D0 = r0
            float r1 = r6.n
            r5.E0 = r1
            long r1 = r6.o
            r5.G0 = r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0030
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x002c
            dm7 r0 = r6.m
            double r1 = r0.a
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            double r0 = r0.b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
        L_0x002c:
            r6 = 1
            r5.F0 = r6
            goto L_0x0034
        L_0x0030:
            boolean r6 = r6.l
            r5.F0 = r6
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0d.<init>(x0d):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, p10] */
    /* JADX WARNING: type inference failed for: r7v1, types: [w00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, m00] */
    public final uo8 y() {
        ? obj = new Object();
        long m = ((lqc) i()).m();
        long j = this.G0;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = TimeUnit.SECONDS.toMillis(j) + m;
        }
        ? obj2 = new Object();
        obj2.a = this.D0;
        obj2.g = this.E0;
        obj2.b = j;
        obj2.c = m;
        obj2.d = j2;
        d0d d0d = this.a;
        if (d0d == null) {
            d0d = null;
        }
        obj2.f = ((rf4) d0d.d.getValue()).a();
        x00 a = obj2.a();
        ? obj3 = new Object();
        obj3.v = a;
        obj3.a = j10.B0;
        if (this.F0) {
            obj3.i = g10.X;
        }
        obj.a = Collections.singletonList(obj3.a());
        jj7 c = obj.c();
        uo8 uo8 = new uo8();
        uo8.g = null;
        uo8.n = c;
        return uo8;
    }

    public final long z(long j, i22 i22) {
        long z = super.z(j, i22);
        if (this.F0) {
            udd.q("y0d", "specifyLocation, start TaskLocationRequest to define location");
            u().b(new r0d(((lqc) i()).n(), j, this.G0 != 0));
        }
        return z;
    }
}
