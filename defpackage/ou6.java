package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ou6  reason: default package */
public final class ou6 extends l5e implements i26 {
    public cu6 X;
    public int Y;
    public int Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ bv6 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ou6(bv6 bv6, Continuation continuation) {
        super(2, continuation);
        this.x0 = bv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ou6 ou6 = new ou6(this.x0, continuation);
        ou6.w0 = obj;
        return ou6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0117 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0125 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            bv6 r12 = r0.x0
            r13 = 1
            r14 = 3
            r15 = 2
            java.lang.String r11 = "prefetch "
            if (r2 == 0) goto L_0x0050
            if (r2 == r13) goto L_0x0044
            if (r2 == r15) goto L_0x0031
            if (r2 != r14) goto L_0x0029
            int r1 = r0.Y
            cu6 r2 = r0.X
            java.lang.Object r0 = r0.w0
            ou3 r0 = (ou3) r0
            wx3.H(r21)
            r4 = r2
            r15 = r11
            r2 = r0
            r0 = r21
            goto L_0x0119
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0031:
            cu6 r2 = r0.X
            java.lang.Object r4 = r0.w0
            ou3 r4 = (ou3) r4
            wx3.H(r21)
            r5 = r21
            r15 = r11
            r19 = r4
            r4 = r2
            r2 = r19
            goto L_0x0100
        L_0x0044:
            java.lang.Object r2 = r0.w0
            ou3 r2 = (ou3) r2
            wx3.H(r21)
            r4 = r21
            r15 = r11
            goto L_0x00cb
        L_0x0050:
            wx3.H(r21)
            java.lang.Object r2 = r0.w0
            ou3 r2 = (ou3) r2
            java.lang.String r4 = defpackage.bv6.I0
            java.util.concurrent.atomic.AtomicInteger r5 = r12.B0
            int r5 = r5.get()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r11)
            r6.append(r5)
            java.lang.String r5 = ": start to load virtual albums"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            udd.q(r4, r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r12.B0
            int r5 = r5.get()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r11)
            r6.append(r5)
            java.lang.String r5 = ": start fetch medias"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            udd.q(r4, r5)
            dde r6 = new dde
            java.util.concurrent.atomic.AtomicInteger r4 = r12.B0
            int r4 = r4.get()
            java.lang.String r5 = " virtual albums recent items"
            java.lang.String r4 = defpackage.rf0.f(r4, r11, r5)
            r6.<init>(r4)
            k46 r5 = defpackage.k46.a
            r0.w0 = r2
            r0.Z = r13
            pae r4 = r12.c
            n3a r4 = (n3a) r4
            ju3 r10 = r4.b()
            ku6 r9 = new ku6
            r16 = 0
            r8 = 40
            r17 = 0
            r18 = 0
            r4 = r9
            r7 = r12
            r13 = r9
            r9 = r17
            r14 = r10
            r10 = r18
            r15 = r11
            r11 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = xs7.U(r14, r13, r0)
            if (r4 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            cu6 r4 = (defpackage.cu6) r4
            boolean r5 = n1g.A(r2)
            if (r5 != 0) goto L_0x00d4
            return r3
        L_0x00d4:
            java.lang.String r5 = defpackage.bv6.I0
            java.util.concurrent.atomic.AtomicInteger r6 = r12.B0
            int r6 = r6.get()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r15)
            r7.append(r6)
            java.lang.String r6 = ": finish fetch medias"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            udd.q(r5, r6)
            j46 r5 = defpackage.j46.a
            r0.w0 = r2
            r0.X = r4
            r6 = 2
            r0.Z = r6
            java.lang.Object r5 = defpackage.bv6.a(r5, r12, r0)
            if (r5 != r1) goto L_0x0100
            return r1
        L_0x0100:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            l46 r6 = defpackage.l46.a
            r0.w0 = r2
            r0.X = r4
            r0.Y = r5
            r7 = 3
            r0.Z = r7
            java.lang.Object r0 = defpackage.bv6.a(r6, r12, r0)
            if (r0 != r1) goto L_0x0118
            return r1
        L_0x0118:
            r1 = r5
        L_0x0119:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r2 = n1g.A(r2)
            if (r2 != 0) goto L_0x0126
            return r3
        L_0x0126:
            java.util.concurrent.atomic.AtomicInteger r2 = r12.D0
            int r5 = r1 + r0
            r2.set(r5)
            java.util.concurrent.ConcurrentHashMap r2 = r12.E0
            r2.clear()
            grd r6 = r12.Y
            java.lang.Object r7 = r6.getValue()
            o46 r7 = (defpackage.o46) r7
            n46 r7 = r7.a
            java.util.List r8 = r4.a
            r2.put(r7, r8)
            java.util.List r7 = r4.a
            java.lang.Object r7 = o23.X(r7)
            yk7 r7 = (defpackage.yk7) r7
            java.util.concurrent.ConcurrentHashMap r8 = r12.F0
            if (r7 == 0) goto L_0x0158
            java.lang.Object r9 = r6.getValue()
            o46 r9 = (defpackage.o46) r9
            n46 r9 = r9.a
            r8.put(r9, r7)
        L_0x0158:
            grd r7 = r12.w0
            java.lang.Object r9 = r7.getValue()
            o46 r9 = (defpackage.o46) r9
            n46 r9 = r9.a
            java.util.List r10 = r4.b
            r2.put(r9, r10)
            java.lang.Object r9 = o23.X(r10)
            yk7 r9 = (defpackage.yk7) r9
            if (r9 == 0) goto L_0x017a
            java.lang.Object r10 = r7.getValue()
            o46 r10 = (defpackage.o46) r10
            n46 r10 = r10.a
            r8.put(r10, r9)
        L_0x017a:
            grd r9 = r12.x0
            java.lang.Object r10 = r9.getValue()
            o46 r10 = (defpackage.o46) r10
            n46 r10 = r10.a
            java.util.List r4 = r4.c
            r2.put(r10, r4)
            java.lang.Object r2 = o23.X(r4)
            yk7 r2 = (defpackage.yk7) r2
            if (r2 == 0) goto L_0x019c
            java.lang.Object r4 = r9.getValue()
            o46 r4 = (defpackage.o46) r4
            n46 r4 = r4.a
            r8.put(r4, r2)
        L_0x019c:
            java.lang.Object r2 = r6.getValue()
            o46 r2 = (defpackage.o46) r2
            r4 = 9
            r8 = 1
            o46 r2 = defpackage.o46.a(r2, r5, r8, r4)
            r5 = 0
            r6.m(r5, r2)
            java.lang.Object r2 = r7.getValue()
            o46 r2 = (defpackage.o46) r2
            o46 r0 = defpackage.o46.a(r2, r0, r8, r4)
            r7.m(r5, r0)
            java.lang.Object r0 = r9.getValue()
            o46 r0 = (defpackage.o46) r0
            o46 r0 = defpackage.o46.a(r0, r1, r8, r4)
            r9.m(r5, r0)
            grd r0 = r12.z0
            java.lang.Object r1 = r0.getValue()
            i05 r1 = (defpackage.i05) r1
            if (r1 == 0) goto L_0x01d7
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x01d9
        L_0x01d7:
            hw4 r1 = hw4.a
        L_0x01d9:
            i05 r2 = new i05
            r2.<init>(r1)
            r0.m(r5, r2)
            java.lang.String r0 = defpackage.bv6.I0
            java.util.concurrent.atomic.AtomicInteger r1 = r12.B0
            int r1 = r1.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r1)
            java.lang.String r1 = ": finish load virtual albums"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            udd.q(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou6.o(java.lang.Object):java.lang.Object");
    }
}
