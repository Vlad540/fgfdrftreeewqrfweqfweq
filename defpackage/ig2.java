package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ig2  reason: default package */
public final class ig2 extends l5e implements i26 {
    public k68 X;
    public int Y;
    public int Z;
    public int w0;
    public final /* synthetic */ ah2 x0;
    public final /* synthetic */ int y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ig2(ah2 ah2, int i, Continuation continuation) {
        super(2, continuation);
        this.x0 = ah2;
        this.y0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ig2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ig2(this.x0, this.y0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 5
            r1 = 1
            pu3 r2 = defpackage.pu3.a
            int r3 = r13.w0
            jue r4 = defpackage.jue.a
            r5 = 0
            r6 = 2
            if (r3 == 0) goto L_0x002f
            if (r3 == r1) goto L_0x0023
            if (r3 != r6) goto L_0x001b
            int r2 = r13.Z
            int r3 = r13.Y
            k68 r6 = r13.X
            defpackage.wx3.H(r14)
            goto L_0x00e3
        L_0x001b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0023:
            int r3 = r13.Z
            int r7 = r13.Y
            k68 r8 = r13.X
            defpackage.wx3.H(r14)
            r14 = r8
            goto L_0x00cd
        L_0x002f:
            defpackage.wx3.H(r14)
            ah2 r14 = r13.x0
            grd r14 = r14.T0
            java.lang.Object r14 = r14.getValue()
            ag2 r14 = (defpackage.ag2) r14
            java.util.List r14 = r14.a
            int r3 = r13.y0
            java.lang.Object r14 = r14.get(r3)
            k68 r14 = (defpackage.k68) r14
            ah2 r3 = r13.x0
            java.util.concurrent.atomic.AtomicReference r3 = r3.O0
            zx0 r7 = new zx0
            r7.<init>(r0, r14)
            java.lang.Object r3 = r3.getAndUpdate(r7)
            java.lang.String r3 = (java.lang.String) r3
            ah2 r7 = r13.x0
            grd r7 = r7.T0
            java.lang.Object r7 = r7.getValue()
            ag2 r7 = (defpackage.ag2) r7
            java.util.List r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L_0x0066:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x007f
            java.lang.Object r9 = r7.next()
            k68 r9 = (defpackage.k68) r9
            java.lang.String r9 = r9.x()
            boolean r9 = defpackage.hhd.f(r9, r3)
            if (r9 == 0) goto L_0x007d
            goto L_0x0080
        L_0x007d:
            int r8 = r8 + r1
            goto L_0x0066
        L_0x007f:
            r8 = -1
        L_0x0080:
            java.lang.String r7 = r14.x()
            boolean r3 = defpackage.hhd.f(r3, r7)
            if (r3 == 0) goto L_0x008b
            return r4
        L_0x008b:
            ah2 r3 = r13.x0
            java.lang.String r3 = r3.A0
            int r7 = r13.y0
            fn6 r9 = defpackage.udd.e
            if (r9 != 0) goto L_0x0096
            goto L_0x00a9
        L_0x0096:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x00a9
            tn7 r10 = tn7.X
            java.lang.String r11 = "Media viewer. On new page selected newPos:"
            java.lang.String r12 = ", prev:"
            java.lang.String r7 = me4.g(r11, r7, r8, r12)
            r9.d(r10, r3, r7, r5)
        L_0x00a9:
            ah2 r3 = r13.x0
            grd r3 = r3.T0
            java.lang.Object r3 = r3.getValue()
            ag2 r3 = (defpackage.ag2) r3
            java.util.List r3 = r3.a
            int r3 = r3.size()
            ah2 r7 = r13.x0
            int r9 = r13.y0
            r13.X = r14
            r13.Y = r8
            r13.Z = r3
            r13.w0 = r1
            java.lang.Object r7 = r7.D(r9, r14, r3, r13)
            if (r7 != r2) goto L_0x00cc
            return r2
        L_0x00cc:
            r7 = r8
        L_0x00cd:
            ah2 r8 = r13.x0
            r13.X = r14
            r13.Y = r7
            r13.Z = r3
            r13.w0 = r6
            k77[] r6 = defpackage.ah2.h1
            java.lang.Object r6 = r8.C(r14, r13)
            if (r6 != r2) goto L_0x00e0
            return r2
        L_0x00e0:
            r6 = r14
            r2 = r3
            r3 = r7
        L_0x00e3:
            ah2 r14 = r13.x0
            java.util.concurrent.atomic.AtomicReference r14 = r14.N0
            java.lang.Object r14 = r14.get()
            zf2 r14 = (defpackage.zf2) r14
            ah2 r7 = r13.x0
            boolean r8 = r7.X
            if (r8 == 0) goto L_0x012e
            boolean r8 = r14.b
            if (r8 == 0) goto L_0x0110
            int r8 = r13.y0
            if (r3 <= r8) goto L_0x0110
            if (r8 > r0) goto L_0x0110
            java.lang.String r14 = r7.A0
            java.lang.String r0 = "Media viewer. Call load next, desc order"
            defpackage.udd.p(r14, r0, new java.lang.Object[0])
            ah2 r14 = r13.x0
            ax8 r14 = r14.J0
            if (r14 == 0) goto L_0x0168
            fw r14 = (fw) r14
            r14.w()
            goto L_0x0168
        L_0x0110:
            boolean r14 = r14.a
            if (r14 == 0) goto L_0x0168
            int r14 = r13.y0
            if (r3 >= r14) goto L_0x0168
            int r2 = r2 - r14
            if (r2 > r0) goto L_0x0168
            java.lang.String r14 = r7.A0
            java.lang.String r0 = "Media viewer. Call load prev, desc order"
            defpackage.udd.p(r14, r0, new java.lang.Object[0])
            ah2 r14 = r13.x0
            ax8 r14 = r14.J0
            if (r14 == 0) goto L_0x0168
            fw r14 = (fw) r14
            r14.y()
            goto L_0x0168
        L_0x012e:
            boolean r8 = r14.b
            if (r8 == 0) goto L_0x014c
            int r8 = r13.y0
            if (r3 >= r8) goto L_0x014c
            int r2 = r2 - r8
            if (r2 > r0) goto L_0x014c
            java.lang.String r14 = r7.A0
            java.lang.String r0 = "Media viewer. Call load next"
            defpackage.udd.p(r14, r0, new java.lang.Object[0])
            ah2 r14 = r13.x0
            ax8 r14 = r14.J0
            if (r14 == 0) goto L_0x0168
            fw r14 = (fw) r14
            r14.w()
            goto L_0x0168
        L_0x014c:
            boolean r14 = r14.a
            if (r14 == 0) goto L_0x0168
            int r14 = r13.y0
            if (r3 <= r14) goto L_0x0168
            if (r14 > r0) goto L_0x0168
            java.lang.String r14 = r7.A0
            java.lang.String r0 = "Media viewer. Call load prev"
            defpackage.udd.p(r14, r0, new java.lang.Object[0])
            ah2 r14 = r13.x0
            ax8 r14 = r14.J0
            if (r14 == 0) goto L_0x0168
            fw r14 = (fw) r14
            r14.y()
        L_0x0168:
            ah2 r14 = r13.x0
            grd r14 = r14.T0
            java.lang.Object r14 = r14.getValue()
            ag2 r14 = (defpackage.ag2) r14
            java.util.List r14 = r14.a
            java.lang.Object r14 = defpackage.o23.Y(r3, r14)
            k68 r14 = (defpackage.k68) r14
            if (r14 == 0) goto L_0x0188
            ah2 r0 = r13.x0
            l05 r0 = r0.R0
            e05 r2 = new e05
            r2.<init>(r14)
            taf.o(r0, r2)
        L_0x0188:
            boolean r14 = r6 instanceof defpackage.i68
            if (r14 == 0) goto L_0x01a6
            ah2 r14 = r13.x0
            l05 r14 = r14.R0
            c05 r0 = new c05
            r2 = 4
            r0.<init>(r2, r1)
            taf.o(r14, r0)
            ah2 r14 = r13.x0
            r0 = r6
            i68 r0 = (defpackage.i68) r0
            long r1 = r0.a
            java.lang.String r0 = r0.X
            r14.v(r1, r0)
            goto L_0x01dc
        L_0x01a6:
            boolean r14 = r6 instanceof defpackage.b68
            if (r14 == 0) goto L_0x01cf
            r14 = r6
            b68 r14 = (defpackage.b68) r14
            boolean r0 = r14.X
            if (r0 == 0) goto L_0x01cf
            tp6 r14 = r14.o
            android.net.Uri r0 = r14.l
            if (r0 == 0) goto L_0x01c1
            e96 r1 = new e96
            int r2 = r14.c
            int r14 = r14.d
            r1.<init>(r0, r2, r14)
            goto L_0x01c2
        L_0x01c1:
            r1 = r5
        L_0x01c2:
            ah2 r14 = r13.x0
            grd r14 = r14.Z0
            cg2 r0 = new cg2
            r0.<init>((defpackage.k68) r6, (v2f) r1)
            r14.m(r5, r0)
            goto L_0x01dc
        L_0x01cf:
            ah2 r14 = r13.x0
            grd r14 = r14.Z0
            cg2 r0 = new cg2
            r1 = 3
            r0.<init>((defpackage.i68) r5, (int) r1)
            r14.m(r5, r0)
        L_0x01dc:
            ah2 r13 = r13.x0
            l05 r13 = r13.R0
            d05 r14 = new d05
            r14.<init>(r6)
            taf.o(r13, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig2.o(java.lang.Object):java.lang.Object");
    }
}
