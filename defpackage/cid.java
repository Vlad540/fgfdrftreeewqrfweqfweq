package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: cid  reason: default package */
public final class cid extends uje {
    public static final Object C0 = new Object();
    public final j68 A0;
    public final y58 B0;
    public final long X;
    public final long Y;
    public final long Z;
    public final long b;
    public final long c;
    public final long o;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final Object z0;

    static {
        r58 r58 = new r58();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        List emptyList = Collections.emptyList();
        e8c e8c2 = e8c.X;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new c68(uri, (jjd) null, emptyList, e8c2);
        }
        r58.b();
        y78 y78 = y78.W0;
    }

    public cid(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, kk9 kk9, j68 j68, y58 y58) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = j4;
        this.Y = j5;
        this.Z = j6;
        this.w0 = z;
        this.x0 = z2;
        this.y0 = z3;
        this.z0 = kk9;
        j68.getClass();
        this.A0 = j68;
        this.B0 = y58;
    }

    public final int b(Object obj) {
        return C0.equals(obj) ? 0 : -1;
    }

    public final pje g(int i, pje pje, boolean z) {
        swb.g(i, 1);
        Object obj = z ? C0 : null;
        long j = -this.Y;
        pje.getClass();
        pje.h((Object) null, obj, 0, this.o, j, v8.Y, false);
        return pje;
    }

    public final int i() {
        return 1;
    }

    public final Object m(int i) {
        swb.g(i, 1);
        return C0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1 > r3) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sje n(int r25, defpackage.sje r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            swb.g(r2, r1)
            long r1 = r0.Z
            boolean r14 = r0.x0
            if (r14 == 0) goto L_0x002d
            boolean r3 = r0.y0
            if (r3 != 0) goto L_0x002d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x002d
            long r3 = r0.X
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0026
        L_0x0023:
            r16 = r5
            goto L_0x002f
        L_0x0026:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x002d
            goto L_0x0023
        L_0x002d:
            r16 = r1
        L_0x002f:
            java.lang.Object r4 = defpackage.sje.G0
            long r1 = r0.X
            r18 = r1
            r20 = 0
            j68 r5 = r0.A0
            java.lang.Object r6 = r0.z0
            long r7 = r0.b
            long r9 = r0.c
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.w0
            y58 r15 = r0.B0
            r21 = 0
            long r0 = r0.Y
            r22 = r0
            r3 = r26
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cid.n(int, sje, long):sje");
    }

    public final int p() {
        return 1;
    }
}
