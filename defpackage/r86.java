package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r86  reason: default package */
public final class r86 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ s86 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r86(s86 s86, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = s86;
        this.Z = j;
        this.w0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new r86(this.Y, this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r6 = r21
            pu3 r7 = pu3.a
            int r0 = r6.X
            r8 = 0
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 == r12) goto L_0x0031
            if (r0 == r11) goto L_0x002b
            if (r0 == r10) goto L_0x0024
            if (r0 != r9) goto L_0x001c
            wx3.H(r22)
            r0 = r22
            goto L_0x00e3
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            wx3.H(r22)
            r0 = r22
            goto L_0x00aa
        L_0x002b:
            wx3.H(r22)
            r0 = r22
            goto L_0x0093
        L_0x0031:
            wx3.H(r22)
            r0 = r22
            goto L_0x0057
        L_0x0037:
            wx3.H(r22)
            s86 r0 = r6.Y
            java.lang.Object r0 = r0.X
            t97 r0 = (t97) r0
            java.lang.Object r0 = r0.getValue()
            b29 r0 = (defpackage.b29) r0
            long r1 = r6.Z
            long r3 = r6.w0
            r6.X = r12
            nec r0 = r0.a
            r5 = r21
            java.lang.Object r0 = r0.j(r1, r3, r5)
            if (r0 != r7) goto L_0x0057
            return r7
        L_0x0057:
            vo8 r0 = (defpackage.vo8) r0
            if (r0 == 0) goto L_0x007c
            s86 r1 = r6.Y
            java.lang.Object r1 = r1.b
            java.lang.String r1 = (java.lang.String) r1
            long r2 = r6.w0
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0068
            goto L_0x007b
        L_0x0068:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x007b
            tn7 r5 = defpackage.tn7.X
            java.lang.String r6 = "Found message="
            java.lang.String r7 = " in cache, return it"
            java.lang.String r2 = defpackage.us8.j(r2, r6, r7)
            r4.d(r5, r1, r2, r8)
        L_0x007b:
            return r0
        L_0x007c:
            s86 r0 = r6.Y
            java.lang.Object r0 = r0.o
            t97 r0 = (t97) r0
            java.lang.Object r0 = r0.getValue()
            bv2 r0 = (defpackage.bv2) r0
            long r1 = r6.Z
            r6.X = r11
            java.lang.Object r0 = r0.d(r1, r6)
            if (r0 != r7) goto L_0x0093
            return r7
        L_0x0093:
            i22 r0 = (defpackage.i22) r0
            o62 r0 = r0.b
            long r0 = r0.a
            s86 r2 = r6.Y
            long r3 = r6.w0
            java.util.List r3 = hr1.o(r3)
            r6.X = r10
            java.lang.Object r0 = defpackage.s86.e(r2, r0, r3, r6)
            if (r0 != r7) goto L_0x00aa
            return r7
        L_0x00aa:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = o23.W(r0)
            r17 = r0
            ym8 r17 = (defpackage.ym8) r17
            if (r17 != 0) goto L_0x00b7
            return r8
        L_0x00b7:
            s86 r0 = r6.Y
            java.lang.Object r0 = r0.X
            t97 r0 = (t97) r0
            java.lang.Object r0 = r0.getValue()
            b29 r0 = (defpackage.b29) r0
            long r1 = r6.Z
            r6.X = r9
            r0.getClass()
            z19 r3 = new z19
            r18 = 0
            r13 = r3
            r14 = r0
            r15 = r1
            r13.<init>(r14, r15, r17, r18)
            nec r0 = r0.a
            bec r0 = r0.a
            aec r0 = r0.m()
            java.lang.Object r0 = a24.m0(r0, r3, r6)
            if (r0 != r7) goto L_0x00e3
            return r7
        L_0x00e3:
            vo8 r0 = (defpackage.vo8) r0
            if (r0 == 0) goto L_0x013a
            s86 r1 = r6.Y
            long r14 = r6.Z
            long r2 = r6.w0
            java.lang.Object r4 = r1.b
            java.lang.String r4 = (java.lang.String) r4
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x00f6
            goto L_0x0109
        L_0x00f6:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0109
            tn7 r6 = defpackage.tn7.X
            java.lang.String r7 = "Fetched message="
            java.lang.String r9 = " from server"
            java.lang.String r2 = defpackage.us8.j(r2, r7, r9)
            r5.d(r6, r4, r2, r8)
        L_0x0109:
            java.lang.Object r1 = r1.o
            t97 r1 = (t97) r1
            java.lang.Object r1 = r1.getValue()
            bv2 r1 = (defpackage.bv2) r1
            aw2 r1 = (defpackage.aw2) r1
            t52 r13 = r1.l()
            t97 r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            aqc r1 = (defpackage.aqc) r1
            long r1 = r1.a()
            long r3 = r0.Y
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x012e
        L_0x012b:
            r16 = r12
            goto L_0x0130
        L_0x012e:
            r12 = 0
            goto L_0x012b
        L_0x0130:
            r18 = 0
            r19 = 0
            r17 = r0
            r13.T(r14, r16, r17, r18, r19)
            r8 = r0
        L_0x013a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r86.o(java.lang.Object):java.lang.Object");
    }
}
