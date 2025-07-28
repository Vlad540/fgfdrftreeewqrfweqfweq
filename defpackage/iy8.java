package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: iy8  reason: default package */
public final class iy8 extends l5e implements i26 {
    public long X;
    public boolean Y;
    public boolean Z;
    public qhd w0;
    public int x0;
    public final /* synthetic */ zz8 y0;
    public final /* synthetic */ wv8 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iy8(zz8 zz8, wv8 wv8, Continuation continuation) {
        super(2, continuation);
        this.y0 = zz8;
        this.z0 = wv8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iy8(this.y0, this.z0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: rad} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: ag3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: ag3} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r0v34, types: [rz] */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x023c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bc  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            r22 = this;
            r7 = r22
            pu3 r8 = pu3.a
            int r0 = r7.x0
            g10 r6 = defpackage.g10.c
            jue r9 = jue.a
            r1 = 0
            r2 = 3
            r3 = 4
            r4 = 5
            r5 = 2
            r10 = 1
            wv8 r11 = r7.z0
            zz8 r12 = r7.y0
            if (r0 == 0) goto L_0x0052
            if (r0 == r10) goto L_0x004b
            if (r0 == r5) goto L_0x003d
            if (r0 == r2) goto L_0x0038
            if (r0 == r3) goto L_0x0029
            if (r0 != r4) goto L_0x0021
            goto L_0x0038
        L_0x0021:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0029:
            boolean r0 = r7.Z
            boolean r2 = r7.Y
            long r10 = r7.X
            qhd r3 = r7.w0
            wx3.H(r23)
            r1 = r23
            goto L_0x020f
        L_0x0038:
            wx3.H(r23)
            goto L_0x0270
        L_0x003d:
            boolean r0 = r7.Z
            boolean r3 = r7.Y
            long r4 = r7.X
            wx3.H(r23)
            r10 = r0
            r0 = r23
            goto L_0x0189
        L_0x004b:
            wx3.H(r23)
            r0 = r23
            goto L_0x00f0
        L_0x0052:
            wx3.H(r23)
            x99 r0 = r12.A()
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0071
            boolean r0 = r11.a()
            if (r0 == 0) goto L_0x0071
            x99 r0 = r12.A()
            long r1 = r11.j()
            r0.e(r1)
            return r9
        L_0x0071:
            boolean r0 = r11 instanceof defpackage.uv8
            sya r13 = r12.Z
            if (r0 == 0) goto L_0x00a9
            uv8 r11 = (defpackage.uv8) r11
            long r3 = r11.b
            r5 = 10
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            rma r3 = defpackage.rma.a
            l05 r4 = r12.y1
            if (r0 >= 0) goto L_0x0088
            defpackage.taf.o(r4, r3)
        L_0x0088:
            long r7 = r11.c
            long r14 = r11.b
            long r7 = r7 - r14
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0094
            defpackage.taf.o(r4, r3)
        L_0x0094:
            long r3 = r11.b
            va9 r0 = r13.a
            nb9 r0 = (defpackage.nb9) r0
            r0.getClass()
            jb9 r5 = new jb9
            r5.<init>(r3, r0, r1)
            kotlinx.coroutines.internal.ContextScope r0 = r0.h
            xs7.E(r0, r1, r1, r5, r2)
            goto L_0x0270
        L_0x00a9:
            boolean r0 = r11 instanceof defpackage.qv8
            if (r0 == 0) goto L_0x00cf
            qv8 r11 = (defpackage.qv8) r11
            m40 r0 = r11.b
            r13.getClass()
            long r14 = r0.a
            java.lang.String r1 = r0.e
            java.lang.String r2 = r0.d
            long r3 = r0.b
            java.lang.String r5 = r0.f
            java.lang.String r0 = r0.g
            r16 = r3
            r18 = r1
            r19 = r2
            r20 = r5
            r21 = r0
            r13.a(r14, r16, r18, r19, r20, r21)
            goto L_0x0270
        L_0x00cf:
            boolean r0 = r11 instanceof defpackage.rv8
            if (r0 == 0) goto L_0x0101
            rv8 r11 = (defpackage.rv8) r11
            rz r0 = r11.b
            boolean r2 = r0 instanceof defpackage.ag3
            if (r2 == 0) goto L_0x00de
            r1 = r0
            ag3 r1 = (defpackage.ag3) r1
        L_0x00de:
            if (r1 != 0) goto L_0x00e1
            return r9
        L_0x00e1:
            r7.x0 = r10
            bv2 r0 = r12.w0
            aw2 r0 = (defpackage.aw2) r0
            long r1 = r1.a
            java.lang.Object r0 = r0.u(r1, r7)
            if (r0 != r8) goto L_0x00f0
            return r8
        L_0x00f0:
            i22 r0 = (defpackage.i22) r0
            l05 r1 = r12.B1
            bx8 r2 = defpackage.bx8.c
            long r3 = r0.a
            a34 r0 = r2.a2(r3)
            defpackage.taf.o(r1, r0)
            goto L_0x0270
        L_0x0101:
            boolean r0 = r11 instanceof defpackage.sv8
            if (r0 == 0) goto L_0x012e
            sv8 r11 = (defpackage.sv8) r11
            rz r0 = r11.b
            boolean r2 = r0 instanceof defpackage.ag3
            if (r2 == 0) goto L_0x0110
            r1 = r0
            ag3 r1 = (defpackage.ag3) r1
        L_0x0110:
            if (r1 != 0) goto L_0x0113
            return r9
        L_0x0113:
            int r0 = r1.f
            long r4 = r1.a
            if (r0 != r3) goto L_0x0129
            sfa r0 = new sfa
            java.lang.String r2 = r1.b
            java.lang.String r1 = r1.c
            r0.<init>(r4, r2, r1)
            l05 r1 = r12.B1
            defpackage.taf.o(r1, r0)
            goto L_0x0270
        L_0x0129:
            r12.E(r4)
            goto L_0x0270
        L_0x012e:
            boolean r0 = r11 instanceof defpackage.vv8
            if (r0 == 0) goto L_0x0147
            vv8 r11 = (defpackage.vv8) r11
            rz r0 = r11.b
            boolean r2 = r0 instanceof defpackage.rad
            if (r2 == 0) goto L_0x013d
            r1 = r0
            rad r1 = (defpackage.rad) r1
        L_0x013d:
            if (r1 != 0) goto L_0x0140
            return r9
        L_0x0140:
            java.lang.String r0 = r1.b
            r12.C(r0)
            goto L_0x0270
        L_0x0147:
            boolean r0 = r11 instanceof defpackage.tv8
            if (r0 == 0) goto L_0x0271
            r0 = r11
            tv8 r0 = (defpackage.tv8) r0
            long r13 = r0.b
            t97 r15 = r12.e1
            java.lang.Object r16 = r15.getValue()
            hb2 r16 = (defpackage.hb2) r16
            boolean r4 = r16.d()
            java.lang.Object r15 = r15.getValue()
            hb2 r15 = (defpackage.hb2) r15
            boolean r10 = r15.b(r10)
            rz r0 = r0.a
            boolean r15 = r0 instanceof defpackage.w13
            t97 r1 = r12.U0
            if (r15 == 0) goto L_0x01e9
            java.lang.Object r0 = r1.getValue()
            sk7 r0 = (defpackage.sk7) r0
            mv9 r0 = defpackage.sk7.a(r0, r13)
            r7.X = r13
            r7.Y = r4
            r7.Z = r10
            r7.x0 = r5
            java.lang.Object r0 = e07.d(r0, r7)
            if (r0 != r8) goto L_0x0187
            return r8
        L_0x0187:
            r3 = r4
            r4 = r13
        L_0x0189:
            xm8 r0 = (defpackage.xm8) r0
            vo8 r0 = r0.a
            jj7 r0 = r0.D0
            if (r0 == 0) goto L_0x01e8
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01e8
            java.util.Iterator r0 = r0.iterator()
        L_0x019b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b6
            java.lang.Object r1 = r0.next()
            r13 = r1
            o10 r13 = (defpackage.o10) r13
            java.lang.String r13 = r13.q
            r14 = r11
            tv8 r14 = (defpackage.tv8) r14
            java.lang.String r14 = r14.c
            boolean r13 = hhd.f(r13, r14)
            if (r13 == 0) goto L_0x019b
            goto L_0x01b7
        L_0x01b6:
            r1 = 0
        L_0x01b7:
            o10 r1 = (defpackage.o10) r1
            if (r1 != 0) goto L_0x01bc
            goto L_0x01e8
        L_0x01bc:
            boolean r0 = r1.d()
            if (r0 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            r10 = r3
        L_0x01c4:
            g10 r0 = r1.n
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0270
            if (r10 == 0) goto L_0x0270
            k77[] r0 = defpackage.zz8.I1
            nve r0 = r12.z()
            f19 r3 = r12.b
            long r10 = r3.a
            r7.x0 = r2
            java.lang.String r12 = r1.q
            r1 = r10
            r3 = r4
            r5 = r12
            r7 = r22
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7)
            if (r0 != r8) goto L_0x0270
            return r8
        L_0x01e8:
            return r9
        L_0x01e9:
            boolean r2 = r0 instanceof defpackage.qhd
            if (r2 == 0) goto L_0x0270
            java.lang.Object r1 = r1.getValue()
            sk7 r1 = (defpackage.sk7) r1
            mv9 r1 = defpackage.sk7.a(r1, r13)
            r2 = r0
            qhd r2 = (defpackage.qhd) r2
            r7.w0 = r2
            r7.X = r13
            r7.Y = r4
            r7.Z = r10
            r7.x0 = r3
            java.lang.Object r1 = e07.d(r1, r7)
            if (r1 != r8) goto L_0x020b
            return r8
        L_0x020b:
            r3 = r0
            r2 = r4
            r0 = r10
            r10 = r13
        L_0x020f:
            xm8 r1 = (defpackage.xm8) r1
            vo8 r1 = r1.a
            jj7 r1 = r1.D0
            if (r1 == 0) goto L_0x0270
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0270
            java.util.Iterator r1 = r1.iterator()
        L_0x0221:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x023c
            java.lang.Object r4 = r1.next()
            r5 = r4
            o10 r5 = (defpackage.o10) r5
            java.lang.String r5 = r5.q
            r13 = r3
            qhd r13 = (defpackage.qhd) r13
            java.lang.String r13 = r13.b
            boolean r5 = hhd.f(r5, r13)
            if (r5 == 0) goto L_0x0221
            goto L_0x023d
        L_0x023c:
            r4 = 0
        L_0x023d:
            o10 r4 = (defpackage.o10) r4
            if (r4 != 0) goto L_0x0242
            goto L_0x0270
        L_0x0242:
            boolean r1 = r4.d()
            if (r1 == 0) goto L_0x0249
            goto L_0x024a
        L_0x0249:
            r0 = r2
        L_0x024a:
            g10 r1 = r4.n
            boolean r1 = r1.c()
            if (r1 != 0) goto L_0x0270
            if (r0 == 0) goto L_0x0270
            k77[] r0 = defpackage.zz8.I1
            nve r0 = r12.z()
            f19 r1 = r12.b
            long r1 = r1.a
            r3 = 0
            r7.w0 = r3
            r3 = 5
            r7.x0 = r3
            java.lang.String r5 = r4.q
            r3 = r10
            r7 = r22
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7)
            if (r0 != r8) goto L_0x0270
            return r8
        L_0x0270:
            return r9
        L_0x0271:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy8.o(java.lang.Object):java.lang.Object");
    }
}
