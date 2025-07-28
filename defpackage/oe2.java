package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oe2  reason: default package */
public final class oe2 extends l5e implements i26 {
    public xm8 X;
    public int Y;
    public final /* synthetic */ gf2 Z;
    public final /* synthetic */ rh8 w0;
    public final /* synthetic */ boolean x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oe2(gf2 gf2, rh8 rh8, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = gf2;
        this.w0 = rh8;
        this.x0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oe2(this.Z, this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r26) {
        /*
            r25 = this;
            r8 = r25
            pu3 r9 = pu3.a
            int r0 = r8.Y
            jue r10 = jue.a
            r2 = 3
            r3 = 4
            r4 = 2
            r5 = 1
            gf2 r6 = r8.Z
            if (r0 == 0) goto L_0x0035
            if (r0 == r5) goto L_0x002f
            if (r0 == r4) goto L_0x0026
            if (r0 == r2) goto L_0x0021
            if (r0 != r3) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0021:
            wx3.H(r26)
            goto L_0x0173
        L_0x0026:
            xm8 r0 = r8.X
            wx3.H(r26)
            r1 = r26
            goto L_0x00c2
        L_0x002f:
            wx3.H(r26)
            r0 = r26
            goto L_0x0049
        L_0x0035:
            wx3.H(r26)
            rh8 r0 = r8.w0
            long r11 = r0.j()
            r8.Y = r5
            k77[] r0 = defpackage.gf2.V0
            java.lang.Object r0 = r6.y(r11, r8)
            if (r0 != r9) goto L_0x0049
            return r9
        L_0x0049:
            xm8 r0 = (defpackage.xm8) r0
            if (r0 != 0) goto L_0x004e
            return r10
        L_0x004e:
            k77[] r7 = defpackage.gf2.V0
            i22 r7 = r6.v()
            if (r7 == 0) goto L_0x0173
            o62 r7 = r7.b
            long r14 = r7.a
            vo8 r7 = r0.a
            long r12 = r7.c
            jj7 r7 = r7.D0
            if (r7 == 0) goto L_0x00cc
            java.lang.Object r7 = r7.a
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x00cc
            hu3 r11 = r8.b
            kotlinx.coroutines.internal.ContextScope r11 = n1g.a(r11)
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = q23.H(r7, r5)
            r3.<init>(r5)
            java.util.Iterator r5 = r7.iterator()
        L_0x007d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00b6
            java.lang.Object r7 = r5.next()
            ne2 r4 = new ne2
            rh8 r1 = r8.w0
            gf2 r2 = r8.Z
            r16 = 0
            r20 = r11
            r11 = r4
            r21 = r12
            r12 = r7
            r13 = r16
            r23 = r14
            r14 = r1
            r15 = r23
            r17 = r21
            r19 = r2
            r11.<init>(r12, r13, r14, r15, r17, r19)
            r7 = r20
            r1 = 0
            r2 = 3
            zc4 r4 = xs7.d(r7, r1, r4, r2)
            r3.add(r4)
            r11 = r7
            r12 = r21
            r14 = r23
            r2 = 3
            r4 = 2
            goto L_0x007d
        L_0x00b6:
            r8.X = r0
            r1 = 2
            r8.Y = r1
            java.lang.Object r1 = lp.c(r3, r8)
            if (r1 != r9) goto L_0x00c2
            return r9
        L_0x00c2:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00cc
            java.util.List r1 = o23.T(r1)
            r7 = r1
            goto L_0x00cd
        L_0x00cc:
            r7 = 0
        L_0x00cd:
            if (r7 == 0) goto L_0x0173
            vo8 r1 = r0.a
            jj7 r1 = r1.D0
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00e7
            int r1 = r1.size()
            int r2 = r7.size()
            if (r1 != r2) goto L_0x00e7
            goto L_0x0173
        L_0x00e7:
            boolean r1 = r7.isEmpty()
            vo8 r2 = r0.a
            r3 = 1
            if (r1 != r3) goto L_0x00fb
            java.lang.String r1 = r2.w0
            if (r1 == 0) goto L_0x0101
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            ie2 r1 = r6.c
            ie2 r3 = defpackage.ie2.a
            if (r1 == r3) goto L_0x0140
        L_0x0101:
            k77[] r1 = defpackage.gf2.V0
            i22 r1 = r6.v()
            if (r1 != 0) goto L_0x010a
            return r10
        L_0x010a:
            tf3 r0 = r0.b
            boolean r0 = r0.Y
            kb5 r3 = r6.D0
            boolean r0 = defpackage.ir8.a(r1, r3, r0)
            if (r0 != 0) goto L_0x0117
            return r10
        L_0x0117:
            t97 r0 = r6.y0
            java.lang.Object r0 = r0.getValue()
            ap8 r0 = (defpackage.ap8) r0
            long r1 = r2.b
            r3 = 0
            r8.X = r3
            r3 = 3
            r8.Y = r3
            r0.getClass()
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            java.util.List r1 = java.util.Collections.singletonList(r3)
            boolean r2 = r8.x0
            java.lang.Object r0 = r0.a(r2, r1, r8)
            if (r0 != r9) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r0 = r10
        L_0x013d:
            if (r0 != r9) goto L_0x0173
            return r9
        L_0x0140:
            i22 r1 = r6.v()
            if (r1 != 0) goto L_0x0147
            return r10
        L_0x0147:
            ir8 r3 = r0.Y
            boolean r0 = r3.b(r1, r0)
            if (r0 != 0) goto L_0x0150
            return r10
        L_0x0150:
            t97 r0 = r6.x0
            java.lang.Object r0 = r0.getValue()
            yr4 r0 = (defpackage.yr4) r0
            long r3 = r2.b
            r1 = 0
            r8.X = r1
            r1 = 4
            r8.Y = r1
            r11 = 1
            long r5 = r2.x0
            java.lang.String r12 = r2.w0
            r1 = r3
            r3 = r5
            r5 = r12
            r6 = r7
            r7 = r11
            r8 = r25
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7, r8)
            if (r0 != r9) goto L_0x0173
            return r9
        L_0x0173:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe2.o(java.lang.Object):java.lang.Object");
    }
}
