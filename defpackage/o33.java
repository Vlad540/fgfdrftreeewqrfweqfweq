package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o33  reason: default package */
public final class o33 extends l5e implements i26 {
    public final /* synthetic */ s16 A0;
    public final /* synthetic */ k26 B0;
    public final /* synthetic */ rj5 C0;
    public i02 X;
    public byte[] Y;
    public int Z;
    public int w0;
    public int x0;
    public /* synthetic */ Object y0;
    public final /* synthetic */ pj5[] z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o33(rj5 rj5, s16 s16, k26 k26, Continuation continuation, pj5[] pj5Arr) {
        super(2, continuation);
        this.z0 = pj5Arr;
        this.A0 = s16;
        this.B0 = k26;
        this.C0 = rj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o33) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k26 k26 = this.B0;
        o33 o33 = new o33(this.C0, this.A0, k26, continuation, this.z0);
        o33.y0 = obj;
        return o33;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: us0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: uv6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: us0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: us0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: us0} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be A[LOOP:1: B:26:0x00be->B:35:0x00e0, LOOP_START, PHI: r9 r13 
      PHI: (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:24:0x00bb, B:35:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v3 uv6) = (r13v2 uv6), (r13v11 uv6) binds: [B:24:0x00bb, B:35:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.x0
            jue r3 = defpackage.jue.a
            r4 = 1
            r5 = 3
            r6 = 0
            r7 = 0
            r8 = 2
            if (r2 == 0) goto L_0x005e
            if (r2 == r4) goto L_0x0045
            if (r2 == r8) goto L_0x0032
            if (r2 != r5) goto L_0x002a
            int r2 = r0.w0
            int r9 = r0.Z
            byte[] r10 = r0.Y
            i02 r11 = r0.X
            java.lang.Object r12 = r0.y0
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            defpackage.wx3.H(r21)
            r4 = r7
            r7 = r2
            r2 = r10
            r10 = r12
            goto L_0x011e
        L_0x002a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0032:
            int r2 = r0.w0
            int r9 = r0.Z
            byte[] r10 = r0.Y
            i02 r11 = r0.X
            java.lang.Object r12 = r0.y0
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            defpackage.wx3.H(r21)
            r7 = r2
            r2 = r10
            r10 = r12
            goto L_0x009e
        L_0x0045:
            int r2 = r0.w0
            int r9 = r0.Z
            byte[] r10 = r0.Y
            i02 r11 = r0.X
            java.lang.Object r12 = r0.y0
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            defpackage.wx3.H(r21)
            r13 = r21
            m12 r13 = (defpackage.m12) r13
            java.lang.Object r13 = r13.a
            r7 = r2
            r2 = r10
            r10 = r12
            goto L_0x00b3
        L_0x005e:
            defpackage.wx3.H(r21)
            java.lang.Object r2 = r0.y0
            ou3 r2 = (defpackage.ou3) r2
            pj5[] r9 = r0.z0
            int r9 = r9.length
            if (r9 != 0) goto L_0x006b
            return r3
        L_0x006b:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            kotlinx.coroutines.internal.Symbol r11 = defpackage.wr9.b
            java.util.Arrays.fill(r10, r7, r9, r11)
            r11 = 6
            us0 r11 = defpackage.xs7.a(r9, r7, r11)
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r15.<init>(r9)
            r14 = r7
        L_0x007d:
            if (r14 >= r9) goto L_0x009b
            n33 r13 = new n33
            pj5[] r12 = r0.z0
            r17 = 0
            r16 = r12
            r12 = r13
            r7 = r13
            r13 = r16
            r18 = r14
            r19 = r15
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            defpackage.xs7.E(r2, r6, r6, r7, r5)
            int r14 = r18 + 1
            r7 = 0
            goto L_0x007d
        L_0x009b:
            byte[] r2 = new byte[r9]
            r7 = 0
        L_0x009e:
            int r7 = r7 + r4
            byte r7 = (byte) r7
            r0.y0 = r10
            r0.X = r11
            r0.Y = r2
            r0.Z = r9
            r0.w0 = r7
            r0.x0 = r4
            java.lang.Object r13 = r11.h(r0)
            if (r13 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            boolean r12 = r13 instanceof defpackage.l12
            if (r12 != 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r13 = r6
        L_0x00b9:
            uv6 r13 = (defpackage.uv6) r13
            if (r13 != 0) goto L_0x00be
            return r3
        L_0x00be:
            int r12 = r13.a
            r14 = r10[r12]
            java.lang.Object r13 = r13.b
            r10[r12] = r13
            kotlinx.coroutines.internal.Symbol r13 = defpackage.wr9.b
            if (r14 != r13) goto L_0x00cc
            int r9 = r9 + -1
        L_0x00cc:
            byte r13 = r2[r12]
            if (r13 == r7) goto L_0x00e2
            byte r13 = (byte) r7
            r2[r12] = r13
            java.lang.Object r12 = r11.f()
            boolean r13 = r12 instanceof defpackage.l12
            if (r13 != 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r12 = r6
        L_0x00dd:
            r13 = r12
            uv6 r13 = (defpackage.uv6) r13
            if (r13 != 0) goto L_0x00be
        L_0x00e2:
            if (r9 != 0) goto L_0x009e
            s16 r12 = r0.A0
            java.lang.Object r12 = r12.invoke()
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            rj5 r13 = r0.C0
            k26 r14 = r0.B0
            if (r12 != 0) goto L_0x0105
            r0.y0 = r10
            r0.X = r11
            r0.Y = r2
            r0.Z = r9
            r0.w0 = r7
            r0.x0 = r8
            java.lang.Object r12 = r14.invoke(r13, r10, r0)
            if (r12 != r1) goto L_0x009e
            return r1
        L_0x0105:
            r15 = 14
            r4 = 0
            defpackage.cs.R(r4, r4, r15, r10, r12)
            r0.y0 = r10
            r0.X = r11
            r0.Y = r2
            r0.Z = r9
            r0.w0 = r7
            r0.x0 = r5
            java.lang.Object r12 = r14.invoke(r13, r12, r0)
            if (r12 != r1) goto L_0x011e
            return r1
        L_0x011e:
            r4 = 1
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o33.o(java.lang.Object):java.lang.Object");
    }
}
