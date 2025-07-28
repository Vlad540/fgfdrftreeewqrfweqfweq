package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: uj8  reason: default package */
public final class uj8 extends taf {
    public final r7e A0 = new r7e(new gz3(29, this));
    public final t0c B0;
    public final bc C0;
    public final s16 X;
    public final xi8 Y;
    public final t97 Z;
    public final long b;
    public final ch2 c;
    public final Integer o;
    public final t97 w0;
    public final t97 x0;
    public Set y0 = qw4.a;
    public qod z0;

    public uj8(long j, ch2 ch2, r7e r7e, Integer num, vj8 vj8, s16 s16) {
        ej8 ej8 = ej8.a;
        r7e d = ej8.getAccessor().d(pae.class);
        r7e d2 = ej8.getAccessor().d(ap3.class);
        this.b = j;
        this.c = ch2;
        this.o = num;
        this.X = vj8;
        this.Y = (xi8) ej8.getAccessor().c(xi8.class);
        this.Z = d;
        this.w0 = r7e;
        this.x0 = d2;
        pj5 J = ez3.J(ez3.h0(new bc(((ck8) r7e.getValue()).d(), 29, this), new zl5((Continuation) null, this, 7)), ((pae) d.getValue()).a());
        hw4 hw4 = hw4.a;
        t0c d0 = ez3.d0(J, this.a, ucd.a, hw4);
        this.B0 = d0;
        this.C0 = ez3.s(d0, ((ck8) r7e.getValue()).b(), (pj5) s16.invoke(), new mi1(this, (Continuation) null, 2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r12 == r1) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ea, code lost:
        if (r12 == r1) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.si8 r9, defpackage.uj8 r10, java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.qj8
            if (r0 == 0) goto L_0x0016
            r0 = r12
            qj8 r0 = (defpackage.qj8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            qj8 r0 = new qj8
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            wx3.H(r12)
            goto L_0x00ee
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            java.util.List r11 = r0.o
            wx3.H(r12)
            goto L_0x006a
        L_0x003c:
            wx3.H(r12)
            boolean r12 = r9 instanceof defpackage.pi8
            ch2 r2 = r10.c
            long r5 = r10.b
            if (r12 == 0) goto L_0x0077
            pi8 r9 = (defpackage.pi8) r9
            long r7 = r9.a
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x00f1
            ch2 r12 = r9.b
            if (r12 != r2) goto L_0x00f1
            java.util.Collection r9 = r9.c
            boolean r12 = r9.isEmpty()
            if (r12 == 0) goto L_0x005d
            goto L_0x00f1
        L_0x005d:
            r0.o = r11
            r0.Z = r4
            java.lang.Object r12 = r10.r(r9, r0)
            if (r12 != r1) goto L_0x006a
        L_0x0067:
            r11 = r1
            goto L_0x00f1
        L_0x006a:
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r9 = o23.i0(r11, r12)
            java.util.Set r9 = o23.w0(r9)
        L_0x0074:
            r11 = r9
            goto L_0x00f1
        L_0x0077:
            boolean r12 = r9 instanceof defpackage.ri8
            if (r12 == 0) goto L_0x00c0
            ri8 r9 = (defpackage.ri8) r9
            long r0 = r9.a
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x00f1
            ch2 r10 = r9.b
            if (r10 != r2) goto L_0x00f1
            java.util.Collection r9 = r9.c
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0090
            goto L_0x00f1
        L_0x0090:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r11.iterator()
        L_0x0099:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r12.next()
            r1 = r0
            ei8 r1 = (defpackage.ei8) r1
            long r1 = r1.a
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            boolean r1 = r9.contains(r3)
            if (r1 == 0) goto L_0x0099
            r10.add(r0)
            goto L_0x0099
        L_0x00b7:
            java.util.Set r9 = o23.w0(r10)
            java.util.List r9 = o23.h0(r11, r9)
            goto L_0x0074
        L_0x00c0:
            boolean r12 = r9 instanceof defpackage.qi8
            if (r12 == 0) goto L_0x00f2
            r12 = r9
            qi8 r12 = (defpackage.qi8) r12
            java.util.List r12 = r12.a
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00d0
            goto L_0x00f1
        L_0x00d0:
            t97 r12 = r10.Z
            java.lang.Object r12 = r12.getValue()
            pae r12 = (defpackage.pae) r12
            n3a r12 = (n3a) r12
            ju3 r12 = r12.a()
            rj8 r2 = new rj8
            r4 = 0
            r2.<init>(r9, r10, r11, r4)
            r0.Z = r3
            java.lang.Object r12 = xs7.U(r12, r2, r0)
            if (r12 != r1) goto L_0x00ee
            goto L_0x0067
        L_0x00ee:
            java.util.Collection r12 = (java.util.Collection) r12
            r11 = r12
        L_0x00f1:
            return r11
        L_0x00f2:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj8.q(si8, uj8, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(java.util.Collection r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.oj8
            if (r0 == 0) goto L_0x0013
            r0 = r9
            oj8 r0 = (defpackage.oj8) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            oj8 r0 = new oj8
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r9)
            goto L_0x0079
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            wx3.H(r9)
            t97 r9 = r7.Z
            java.lang.Object r9 = r9.getValue()
            pae r9 = (defpackage.pae) r9
            n3a r9 = (n3a) r9
            ju3 r9 = r9.b()
            if (r9 != 0) goto L_0x0044
            hu3 r9 = r0.b
        L_0x0044:
            kotlinx.coroutines.internal.ContextScope r9 = n1g.a(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = q23.H(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L_0x0057:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0070
            java.lang.Object r4 = r8.next()
            nj8 r5 = new nj8
            r6 = 0
            r5.<init>(r4, r6, r7)
            r4 = 3
            zc4 r4 = xs7.d(r9, r6, r5, r4)
            r2.add(r4)
            goto L_0x0057
        L_0x0070:
            r0.Y = r3
            java.lang.Object r9 = lp.c(r2, r0)
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r7 = o23.T(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj8.r(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
