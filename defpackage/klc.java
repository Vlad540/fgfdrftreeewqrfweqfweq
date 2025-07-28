package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: klc  reason: default package */
public final class klc extends icc implements i26 {
    public final /* synthetic */ jc9 A0;
    public int X;
    public int Y;
    public int Z;
    public Object[] c;
    public long[] o;
    public int w0;
    public long x0;
    public int y0;
    public /* synthetic */ Object z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public klc(jc9 jc9, Continuation continuation) {
        super(2, continuation);
        this.A0 = jc9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((klc) n((gyc) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        klc klc = new klc(this.A0, continuation);
        klc.z0 = obj;
        return klc;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.y0
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L_0x002c
            if (r2 != r3) goto L_0x0024
            int r2 = r0.w0
            int r6 = r0.Z
            long r7 = r0.x0
            int r9 = r0.Y
            int r10 = r0.X
            long[] r11 = r0.o
            java.lang.Object[] r12 = r0.c
            java.lang.Object r13 = r0.z0
            gyc r13 = (defpackage.gyc) r13
            defpackage.wx3.H(r21)
            goto L_0x0086
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002c:
            defpackage.wx3.H(r21)
            java.lang.Object r2 = r0.z0
            gyc r2 = (defpackage.gyc) r2
            jc9 r6 = r0.A0
            java.lang.Object[] r7 = r6.c
            long[] r6 = r6.a
            int r8 = r6.length
            int r8 = r8 + -2
            if (r8 < 0) goto L_0x0094
            r9 = r4
        L_0x003f:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x008f
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L_0x0060:
            if (r2 >= r6) goto L_0x0089
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0086
            int r4 = r9 << 3
            int r4 = r4 + r2
            r4 = r12[r4]
            r0.z0 = r13
            r0.c = r12
            r0.o = r11
            r0.X = r10
            r0.Y = r9
            r0.x0 = r7
            r0.Z = r6
            r0.w0 = r2
            r0.y0 = r3
            r13.b(r4, r0)
            return r1
        L_0x0086:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L_0x0060
        L_0x0089:
            if (r6 != r5) goto L_0x0094
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L_0x008f:
            if (r9 == r8) goto L_0x0094
            int r9 = r9 + 1
            goto L_0x003f
        L_0x0094:
            jue r0 = defpackage.jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.klc.o(java.lang.Object):java.lang.Object");
    }
}
