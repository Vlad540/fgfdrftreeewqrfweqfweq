package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: did  reason: default package */
public final class did extends vje {
    public static final Object q = new Object();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final l68 o;
    public final z58 p;

    static {
        r58 r58 = new r58();
        q44 q44 = new q44();
        List emptyList = Collections.emptyList();
        e8c e8c = e8c.X;
        x58 x58 = new x58();
        d68 d68 = d68.d;
        Uri uri = Uri.EMPTY;
        oyb.k(((Uri) q44.e) == null || ((UUID) q44.d) != null);
        if (uri != null) {
            new a68(uri, (String) null, ((UUID) q44.d) != null ? new w58(q44) : null, (p58) null, emptyList, (String) null, e8c, (Object) null, -9223372036854775807L);
        }
        r58.c();
        x58.a();
        z78 z78 = z78.J;
    }

    public did(long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, lk9 lk9, l68 l68, z58 z58) {
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = lk9;
        l68.getClass();
        this.o = l68;
        this.p = z58;
    }

    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    public final qje g(int i2, qje qje, boolean z) {
        oyb.f(i2, 1);
        Object obj = z ? q : null;
        long j2 = -this.i;
        qje.getClass();
        qje.j((Object) null, obj, 0, this.g, j2, w8.g, false);
        return qje;
    }

    public final int i() {
        return 1;
    }

    public final Object m(int i2) {
        oyb.f(i2, 1);
        return q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1 > r3) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.tje n(int r25, defpackage.tje r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.oyb.f(r2, r1)
            long r1 = r0.j
            boolean r14 = r0.l
            if (r14 == 0) goto L_0x002d
            boolean r3 = r0.m
            if (r3 != 0) goto L_0x002d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x002d
            long r3 = r0.h
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
            java.lang.Object r4 = defpackage.tje.q
            long r1 = r0.h
            r18 = r1
            r20 = 0
            l68 r5 = r0.o
            java.lang.Object r6 = r0.n
            long r7 = r0.e
            long r9 = r0.f
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.k
            z58 r15 = r0.p
            r21 = 0
            long r0 = r0.i
            r22 = r0
            r3 = r26
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.did.n(int, tje, long):tje");
    }

    public final int p() {
        return 1;
    }
}
