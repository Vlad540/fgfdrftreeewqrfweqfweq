package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: p82  reason: default package */
public final class p82 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ b92 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p82(List list, b92 b92, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
        this.w0 = b92;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p82 p82 = new p82(this.Z, this.w0, continuation);
        p82.Y = obj;
        return p82;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            pu3 r1 = pu3.a
            int r2 = r0.X
            jue r3 = jue.a
            java.util.List r4 = r0.Z
            r5 = 1
            b92 r6 = r0.w0
            if (r2 == 0) goto L_0x0024
            if (r2 != r5) goto L_0x001c
            java.lang.Object r0 = r0.Y
            ou3 r0 = (ou3) r0
            wx3.H(r23)
            r2 = r0
            r0 = r23
            goto L_0x0042
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            wx3.H(r23)
            java.lang.Object r2 = r0.Y
            ou3 r2 = (ou3) r2
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x004c
            java.lang.String r7 = defpackage.b92.O0
            udc r7 = r6.e()
            r0.Y = r2
            r0.X = r5
            java.lang.Object r0 = r7.d(r0)
            if (r0 != r1) goto L_0x0042
            return r1
        L_0x0042:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x004c
            return r3
        L_0x004c:
            t97 r0 = r6.a
            java.lang.Object r0 = r0.getValue()
            jee r0 = (defpackage.jee) r0
            una r1 = defpackage.una.TYPE_CONFIG
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.util.List r0 = r0.i(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r0.next()
            zde r1 = (defpackage.zde) r1
            tna r5 = r1.f
            boolean r7 = r5 instanceof defpackage.ja3
            if (r7 == 0) goto L_0x0062
            ja3 r5 = (defpackage.ja3) r5
            boolean r5 = r5.x0
            if (r5 == 0) goto L_0x0062
            t97 r5 = r6.a
            java.lang.Object r5 = r5.getValue()
            jee r5 = (defpackage.jee) r5
            long r7 = r1.a
            r5.d(r7)
            goto L_0x0062
        L_0x0088:
            boolean r0 = n1g.A(r2)
            if (r0 != 0) goto L_0x008f
            return r3
        L_0x008f:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00a1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0114
            java.lang.Object r5 = r4.next()
            ep5 r5 = (defpackage.ep5) r5
            s72 r15 = new s72
            java.lang.String r8 = r5.a
            java.lang.CharSequence r7 = r5.b
            java.lang.String r9 = r7.toString()
            java.util.List r7 = r5.x0
            java.util.Set r11 = o23.w0(r7)
            qw4 r12 = qw4.a
            java.util.List r7 = r5.C0
            java.util.ArrayList r7 = defpackage.fu7.v(r7)
            if (r7 != 0) goto L_0x00c9
            hw4 r7 = hw4.a
        L_0x00c9:
            r16 = r7
            java.lang.Long r7 = r5.D0
            if (r7 == 0) goto L_0x00d6
            long r13 = r7.longValue()
        L_0x00d3:
            r17 = r13
            goto L_0x00d9
        L_0x00d6:
            r13 = 0
            goto L_0x00d3
        L_0x00d9:
            java.util.List r14 = r5.F0
            java.util.Set r13 = r5.G0
            java.lang.String r10 = r5.c
            java.util.Set r7 = r5.Y
            r22 = r4
            boolean r4 = r5.y0
            r21 = r6
            java.util.Map r6 = r5.E0
            r19 = r7
            r7 = r15
            r20 = r13
            r13 = r19
            r19 = r14
            r14 = r4
            r4 = r15
            r15 = r16
            r16 = r17
            r18 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
            r0.add(r4)
            boolean r4 = r5.w0
            if (r4 == 0) goto L_0x010f
            boolean r4 = r5.b()
            if (r4 != 0) goto L_0x010f
            java.lang.String r4 = r5.a
            r1.add(r4)
        L_0x010f:
            r4 = r22
            r6 = r21
            goto L_0x00a1
        L_0x0114:
            r21 = r6
            boolean r2 = n1g.A(r2)
            if (r2 != 0) goto L_0x011d
            return r3
        L_0x011d:
            r2 = r21
            t97 r4 = r2.A0
            java.lang.Object r4 = r4.getValue()
            pk r4 = (defpackage.pk) r4
            gy9 r4 = (defpackage.gy9) r4
            r4.getClass()
            ja3 r5 = new ja3
            g2b r6 = r4.z()
            j2b r6 = (defpackage.j2b) r6
            i03 r6 = r6.a
            long r8 = r6.n()
            long[] r15 = defpackage.gy9.g
            r12 = 0
            r16 = 1
            r10 = 0
            r13 = 0
            r14 = 0
            r7 = r5
            r17 = r0
            r18 = r1
            r7.<init>(r8, r10, r12, r13, r14, r15, r16, r17, r18)
            defpackage.gy9.w(r4, r5)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.N0
            r1 = 0
            r0.set(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.o(java.lang.Object):java.lang.Object");
    }
}
