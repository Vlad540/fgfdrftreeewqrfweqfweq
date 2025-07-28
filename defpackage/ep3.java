package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ep3  reason: default package */
public final class ep3 extends l5e implements i26 {
    public Object X;
    public Object Y;
    public int Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ String x0;
    public final /* synthetic */ fp3 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ep3(fp3 fp3, String str, Continuation continuation) {
        super(2, continuation);
        this.x0 = str;
        this.y0 = fp3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ep3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ep3 ep3 = new ep3(this.y0, this.x0, continuation);
        ep3.w0 = obj;
        return ep3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r14.Z
            jue r2 = defpackage.jue.a
            r3 = 0
            r4 = 3
            r5 = 5
            r6 = 4
            r7 = 2
            r8 = 1
            fp3 r9 = r14.y0
            if (r1 == 0) goto L_0x0070
            if (r1 == r8) goto L_0x0060
            if (r1 == r7) goto L_0x0050
            if (r1 == r4) goto L_0x003f
            if (r1 == r6) goto L_0x002f
            if (r1 != r5) goto L_0x0027
            java.lang.Object r0 = r14.X
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r14 = r14.w0
            ou3 r14 = (defpackage.ou3) r14
            defpackage.wx3.H(r15)
            goto L_0x0104
        L_0x0027:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x002f:
            java.lang.Object r1 = r14.X
            yc4 r1 = (defpackage.yc4) r1
            java.lang.Object r4 = r14.w0
            ou3 r4 = (defpackage.ou3) r4
            defpackage.wx3.H(r15)
            r11 = r1
            r1 = r15
            r15 = r4
            goto L_0x00f1
        L_0x003f:
            java.lang.Object r0 = r14.Y
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r14.X
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r14 = r14.w0
            ou3 r14 = (defpackage.ou3) r14
            defpackage.wx3.H(r15)
            goto L_0x00dc
        L_0x0050:
            java.lang.Object r1 = r14.Y
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r14.X
            yc4 r5 = (defpackage.yc4) r5
            java.lang.Object r6 = r14.w0
            ou3 r6 = (defpackage.ou3) r6
            defpackage.wx3.H(r15)
            goto L_0x00c8
        L_0x0060:
            java.lang.Object r1 = r14.Y
            yc4 r1 = (defpackage.yc4) r1
            java.lang.Object r5 = r14.X
            yc4 r5 = (defpackage.yc4) r5
            java.lang.Object r6 = r14.w0
            ou3 r6 = (defpackage.ou3) r6
            defpackage.wx3.H(r15)
            goto L_0x00b4
        L_0x0070:
            defpackage.wx3.H(r15)
            java.lang.Object r15 = r14.w0
            ou3 r15 = (defpackage.ou3) r15
            java.lang.String r1 = r14.x0
            if (r1 == 0) goto L_0x0114
            int r10 = r1.length()
            if (r10 != 0) goto L_0x0083
            goto L_0x0114
        L_0x0083:
            cp3 r10 = new cp3
            r10.<init>(r9, r1, r3)
            zc4 r10 = defpackage.xs7.d(r15, r3, r10, r4)
            dp3 r11 = new dp3
            r11.<init>(r9, r1, r3)
            zc4 r11 = defpackage.xs7.d(r15, r3, r11, r4)
            ud r12 = r9.c
            if (r12 == 0) goto L_0x00e4
            bp3 r5 = new bp3
            r5.<init>(r9, r1, r3)
            zc4 r1 = defpackage.xs7.d(r15, r3, r5, r4)
            r14.w0 = r15
            r14.X = r11
            r14.Y = r1
            r14.Z = r8
            java.lang.Object r5 = r10.awaitInternal(r14)
            if (r5 != r0) goto L_0x00b1
            return r0
        L_0x00b1:
            r6 = r15
            r15 = r5
            r5 = r11
        L_0x00b4:
            java.util.List r15 = (java.util.List) r15
            r14.w0 = r6
            r14.X = r5
            r14.Y = r15
            r14.Z = r7
            java.lang.Object r1 = r1.a(r14)
            if (r1 != r0) goto L_0x00c5
            return r0
        L_0x00c5:
            r13 = r1
            r1 = r15
            r15 = r13
        L_0x00c8:
            java.util.List r15 = (java.util.List) r15
            r14.w0 = r6
            r14.X = r1
            r14.Y = r15
            r14.Z = r4
            java.lang.Object r14 = r5.a(r14)
            if (r14 != r0) goto L_0x00d9
            return r0
        L_0x00d9:
            r0 = r15
            r15 = r14
            r14 = r6
        L_0x00dc:
            java.util.List r15 = (java.util.List) r15
            bk3 r4 = new bk3
            r4.<init>(r1, r0, r15)
            goto L_0x010b
        L_0x00e4:
            r14.w0 = r15
            r14.X = r11
            r14.Z = r6
            java.lang.Object r1 = r10.awaitInternal(r14)
            if (r1 != r0) goto L_0x00f1
            return r0
        L_0x00f1:
            java.util.List r1 = (java.util.List) r1
            r14.w0 = r15
            r14.X = r1
            r14.Z = r5
            java.lang.Object r14 = r11.a(r14)
            if (r14 != r0) goto L_0x0100
            return r0
        L_0x0100:
            r0 = r1
            r13 = r15
            r15 = r14
            r14 = r13
        L_0x0104:
            java.util.List r15 = (java.util.List) r15
            bk3 r4 = new bk3
            r4.<init>(r0, r3, r15)
        L_0x010b:
            defpackage.n1g.k(r14)
            grd r14 = r9.h
            r14.m(r3, r4)
            return r2
        L_0x0114:
            grd r14 = r9.h
            zqd r15 = r9.b
            java.lang.Object r15 = r15.getValue()
            r14.setValue(r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep3.o(java.lang.Object):java.lang.Object");
    }
}
