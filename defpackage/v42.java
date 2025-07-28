package defpackage;

/* renamed from: v42  reason: default package */
public final /* synthetic */ class v42 implements of3 {
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ t52 a;
    public final /* synthetic */ vo8 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ v42(t52 t52, vo8 vo8, boolean z, boolean z2, long j, long j2) {
        this.a = t52;
        this.b = vo8;
        this.c = z;
        this.o = z2;
        this.X = j;
        this.Y = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0195, code lost:
        if (r13 == r10) goto L_0x0197;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            y52 r1 = (defpackage.y52) r1
            t52 r2 = r0.a
            r2.getClass()
            vo8 r3 = r0.b
            boolean r4 = r3.n()
            if (r4 == 0) goto L_0x0015
            goto L_0x01df
        L_0x0015:
            g2b r4 = r2.n
            j2b r4 = (defpackage.j2b) r4
            i03 r5 = r4.a
            long r5 = r5.o()
            long r7 = r3.o
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x002a
            i03 r4 = r4.a
            r4.v(r7)
        L_0x002a:
            long r4 = r1.k
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0032
            r1.k = r7
        L_0x0032:
            long r4 = r1.j
            r9 = 0
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            nj4 r5 = r2.s
            long r11 = r3.b
            if (r4 == 0) goto L_0x0055
            java.lang.Object r4 = r5.get()
            to8 r4 = (defpackage.to8) r4
            long r13 = r1.j
            vo8 r4 = r4.q(r13)
            if (r4 == 0) goto L_0x0057
            long r13 = r4.o
            int r4 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0057
            r1.j = r11
            goto L_0x0057
        L_0x0055:
            r1.j = r11
        L_0x0057:
            long r11 = r2.J()
            long r13 = r3.Y
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            vo8 r11 = r3.G0
            if (r4 == 0) goto L_0x00a1
            long r9 = r3.c
            java.util.List r4 = r3.V0
            if (r4 == 0) goto L_0x008b
            java.util.Iterator r4 = r4.iterator()
        L_0x006d:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x008b
            java.lang.Object r12 = r4.next()
            fp8 r12 = (defpackage.fp8) r12
            r17 = r7
            long r6 = r12.a
            long r19 = r2.J()
            int r6 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r6 != 0) goto L_0x0088
            r1.k0 = r9
            goto L_0x008d
        L_0x0088:
            r7 = r17
            goto L_0x006d
        L_0x008b:
            r17 = r7
        L_0x008d:
            if (r11 == 0) goto L_0x00a3
            int r4 = r3.E0
            r6 = 1
            if (r4 != r6) goto L_0x00a3
            long r6 = r11.Y
            long r19 = r2.J()
            int r4 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r4 != 0) goto L_0x00a3
            r1.k0 = r9
            goto L_0x00a3
        L_0x00a1:
            r17 = r7
        L_0x00a3:
            boolean r4 = r0.c
            long r6 = r0.X
            if (r4 != 0) goto L_0x011b
            boolean r8 = r0.o
            if (r8 == 0) goto L_0x011b
            java.util.Map r8 = r1.d()
            long r9 = r2.J()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            boolean r8 = r8.containsKey(r9)
            r9 = 0
            if (r8 == 0) goto L_0x00f7
            java.util.Map r8 = r1.d()
            long r19 = r2.J()
            java.lang.Long r10 = java.lang.Long.valueOf(r19)
            java.lang.Object r8 = r8.get(r10)
            java.lang.Long r8 = (java.lang.Long) r8
            long r19 = r8.longValue()
            int r8 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r8 >= 0) goto L_0x00f7
            int r8 = r1.m
            r10 = 1
            int r8 = r8 + r10
            r1.m = r8
            boolean r8 = r1.N
            boolean r10 = r3.q()
            if (r10 == 0) goto L_0x00f3
            long r10 = r11.Y
            long r19 = r2.J()
            int r10 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r10 != 0) goto L_0x00f3
            r9 = 1
        L_0x00f3:
            r8 = r8 | r9
            r1.N = r8
            goto L_0x011b
        L_0x00f7:
            i22 r8 = r2.B(r6)
            boolean r8 = r8.D()
            if (r8 == 0) goto L_0x011b
            int r8 = r1.m
            r10 = 1
            int r8 = r8 + r10
            r1.m = r8
            boolean r8 = r1.N
            boolean r12 = r3.q()
            if (r12 == 0) goto L_0x0118
            long r11 = r11.Y
            r15 = 0
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 != 0) goto L_0x0118
            r9 = r10
        L_0x0118:
            r8 = r8 | r9
            r1.N = r8
        L_0x011b:
            if (r4 != 0) goto L_0x0144
            java.util.Map r8 = r1.d()
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            java.lang.Object r8 = r8.get(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L_0x0144
            long r8 = r8.longValue()
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 >= 0) goto L_0x0144
            java.util.Map r8 = r1.d()
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            java.lang.Long r10 = java.lang.Long.valueOf(r17)
            r8.put(r9, r10)
        L_0x0144:
            boolean r8 = r3.v()
            if (r8 == 0) goto L_0x014d
            r2.R(r6, r1, r3)
        L_0x014d:
            long r8 = r0.Y
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r12 = "t52"
            if (r0 <= 0) goto L_0x017f
            java.lang.Object r0 = r5.get()
            to8 r0 = (defpackage.to8) r0
            vo8 r0 = r0.j(r6, r8)
            if (r0 == 0) goto L_0x017f
            i62 r5 = r1.n
            long r8 = r0.o
            long r13 = r3.o
            md4 r0 = r3.Y0
            r19 = r5
            r20 = r8
            r22 = r13
            r24 = r0
            boolean r0 = oyb.w(r19, r20, r22, r24)
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = "onNotifMessage: prevMesssage found, extend its chunk"
            udd.q(r12, r0)
            goto L_0x01d1
        L_0x017f:
            i62 r0 = r1.n
            md4 r5 = r3.Y0
            java.util.ArrayList r0 = r0.d(r5)
            r8 = r17
            h62 r0 = oyb.y(r8, r0)
            if (r0 == 0) goto L_0x0197
            long r13 = r0.a
            long r10 = r0.b
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0199
        L_0x0197:
            r10 = 0
        L_0x0199:
            i62 r0 = r1.n
            oyb.H(r0, r8, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "onNotifMessage: prevMesssage not found, load history to backwardTime="
            r0.<init>(r5)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            udd.q(r12, r0)
            nj4 r0 = r2.D
            java.lang.Object r0 = r0.get()
            r19 = r0
            j92 r19 = (defpackage.j92) r19
            long r8 = r1.a
            r19.getClass()
            r28 = 0
            md4 r0 = r3.Y0
            long r12 = r3.o
            r20 = r6
            r22 = r8
            r24 = r12
            r26 = r10
            r30 = r0
            defpackage.j92.c(r19, r20, r22, r24, r26, r28, r30)
        L_0x01d1:
            if (r4 == 0) goto L_0x01df
            long r2 = r3.h()
            long r4 = r1.Z
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01df
            r1.Z = r2
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v42.accept(java.lang.Object):void");
    }
}
