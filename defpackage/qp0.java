package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: qp0  reason: default package */
public final class qp0 {
    public final tr2 a;
    public final f03 b;
    public final ik5 c;

    public qp0(tr2 tr2, f03 f03, wp2 wp2, pae pae) {
        this.a = tr2;
        this.b = f03;
        ContextScope a2 = n1g.a(((n3a) pae).a().limitedParallelism(1, "bottom-bar-counters"));
        s0c s0c = new s0c(wp2.a);
        int i = zp4.o;
        this.c = new ik5(ez3.d0(new ck5(ez3.P(n1g.Z(s0c, mt0.P(1, eq4.o)), new np0(this, (Continuation) null)), new op0(this, (Continuation) null)), a2, ucd.b, (Object) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.qp0 r6, kotlin.coroutines.Continuation r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof defpackage.pp0
            if (r0 == 0) goto L_0x0016
            r0 = r7
            pp0 r0 = (defpackage.pp0) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            pp0 r0 = new pp0
            r0.<init>(r6, r7)
        L_0x001b:
            java.lang.Object r7 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            mr2 r6 = r0.X
            qp0 r0 = r0.o
            wx3.H(r7)
            r1 = r6
            r6 = r0
            goto L_0x0050
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            wx3.H(r7)
            mr2 r7 = defpackage.mr2.a
            r0.o = r6
            r0.X = r7
            r0.w0 = r3
            tr2 r0 = r6.a
            aw2 r0 = (defpackage.aw2) r0
            java.lang.Object r0 = r0.r(r7)
            if (r0 != r1) goto L_0x004e
            goto L_0x009d
        L_0x004e:
            r1 = r7
            r7 = r0
        L_0x0050:
            java.util.List r7 = (java.util.List) r7
            tr2 r0 = r6.a
            aw2 r0 = (defpackage.aw2) r0
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r0 = r0.s(r1, r2, r4, r5)
            java.util.ArrayList r7 = o23.i0(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x006f
            goto L_0x0097
        L_0x006f:
            java.util.Iterator r7 = r7.iterator()
        L_0x0073:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r7.next()
            i22 r0 = (defpackage.i22) r0
            o62 r2 = r0.b
            int r2 = r2.m
            if (r2 <= 0) goto L_0x0073
            f03 r2 = r6.b
            boolean r0 = r0.S(r2)
            if (r0 != 0) goto L_0x0073
            int r1 = r1 + 1
            if (r1 < 0) goto L_0x0092
            goto L_0x0073
        L_0x0092:
            p23.F()
            r6 = 0
            throw r6
        L_0x0097:
            dv3 r6 = new dv3
            r6.<init>(r1)
            r1 = r6
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp0.a(qp0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
