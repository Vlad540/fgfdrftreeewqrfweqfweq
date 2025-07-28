package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b8c  reason: default package */
public final class b8c extends l5e implements i26 {
    public int X;
    public final /* synthetic */ jwc Y;
    public final /* synthetic */ c8c Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b8c(jwc jwc, c8c c8c, Continuation continuation) {
        super(2, continuation);
        this.Y = jwc;
        this.Z = c8c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b8c(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            r3 = 3
            pu3 r4 = pu3.a
            int r5 = r11.X
            jwc r6 = r11.Y
            c8c r7 = r11.Z
            if (r5 == 0) goto L_0x0023
            if (r5 == r2) goto L_0x001f
            if (r5 != r1) goto L_0x0017
            wx3.H(r12)
            goto L_0x009a
        L_0x0017:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001f:
            wx3.H(r12)
            goto L_0x0058
        L_0x0023:
            wx3.H(r12)
            boolean r12 = r6 instanceof defpackage.hwc
            if (r12 == 0) goto L_0x003d
            z7c r12 = r7.b
            r5 = r6
            hwc r5 = (defpackage.hwc) r5
            long r8 = r5.c
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r8)
            z7c r12 = defpackage.z7c.a(r12, r5)
            r7.b = r12
            goto L_0x0045
        L_0x003d:
            z7c r12 = r7.b
            z7c r12 = defpackage.z7c.a(r12, r0)
            r7.b = r12
        L_0x0045:
            t97 r12 = r7.Y
            java.lang.Object r12 = r12.getValue()
            a70 r12 = (defpackage.a70) r12
            z7c r5 = r7.b
            r11.X = r2
            java.lang.Object r12 = r12.a(r5, r11)
            if (r12 != r4) goto L_0x0058
            return r4
        L_0x0058:
            y60 r12 = (defpackage.y60) r12
            t97 r5 = r7.y0
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0066:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0083
            java.lang.Object r8 = r5.next()
            vw9 r8 = (defpackage.vw9) r8
            uj3 r9 = r12.Y
            long r9 = r9.a
            rf9 r8 = (rf9) r8
            r8.getClass()
            java.lang.String r8 = java.lang.String.valueOf(r9)
            com.my.tracker.MyTracker.trackRegistrationEvent(r8, r0)
            goto L_0x0066
        L_0x0083:
            t97 r5 = r7.Z
            java.lang.Object r5 = r5.getValue()
            gp7 r5 = (defpackage.gp7) r5
            java.lang.String r12 = r12.c
            z7c r8 = r7.b
            java.lang.String r8 = r8.b
            r11.X = r1
            java.lang.Object r11 = r5.a(r12, r8, r11)
            if (r11 != r4) goto L_0x009a
            return r4
        L_0x009a:
            boolean r11 = r6 instanceof defpackage.iwc
            if (r11 == 0) goto L_0x00b2
            t97 r11 = r7.w0
            java.lang.Object r11 = r11.getValue()
            pk r11 = (defpackage.pk) r11
            r12 = r6
            iwc r12 = (defpackage.iwc) r12
            java.lang.String r4 = r12.c
            d10 r12 = r12.d
            gy9 r11 = (defpackage.gy9) r11
            r11.G(r4, r12)
        L_0x00b2:
            k77[] r11 = defpackage.c8c.D0
            r7.getClass()
            if (r6 != 0) goto L_0x00bb
            goto L_0x0122
        L_0x00bb:
            boolean r11 = r6 instanceof defpackage.hwc
            if (r11 == 0) goto L_0x00c3
            r12 = r6
            hwc r12 = (defpackage.hwc) r12
            goto L_0x00c4
        L_0x00c3:
            r12 = r0
        L_0x00c4:
            if (r12 == 0) goto L_0x00c9
            long r4 = r12.c
            goto L_0x00cb
        L_0x00c9:
            r4 = 0
        L_0x00cb:
            if (r11 == 0) goto L_0x00cf
            r11 = r2
            goto L_0x00e8
        L_0x00cf:
            boolean r11 = r6 instanceof defpackage.iwc
            if (r11 == 0) goto L_0x012a
            iwc r6 = (defpackage.iwc) r6
            int r11 = r6.e
            int r11 = hr1.t(r11)
            if (r11 == 0) goto L_0x00e7
            if (r11 != r2) goto L_0x00e1
            r11 = r1
            goto L_0x00e8
        L_0x00e1:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x00e7:
            r11 = r3
        L_0x00e8:
            t97 r12 = r7.x0
            java.lang.Object r12 = r12.getValue()
            c70 r12 = (defpackage.c70) r12
            b70 r6 = new b70
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            wia r5 = new wia
            java.lang.String r8 = "value"
            r5.<init>(r8, r4)
            if (r11 == r2) goto L_0x0106
            if (r11 == r1) goto L_0x0107
            if (r11 != r3) goto L_0x0105
            r1 = r3
            goto L_0x0107
        L_0x0105:
            throw r0
        L_0x0106:
            r1 = r2
        L_0x0107:
            java.lang.Short r11 = java.lang.Short.valueOf(r1)
            wia r0 = new wia
            java.lang.String r1 = "source"
            r0.<init>(r1, r11)
            wia[] r11 = new wia[]{r5, r0}
            jc9 r11 = llc.b(r11)
            java.lang.String r0 = "choose_avatar"
            r6.<init>(r0, r3, r11)
            r12.a(r6)
        L_0x0122:
            s16 r11 = r7.o
            r11.invoke()
            jue r11 = jue.a
            return r11
        L_0x012a:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8c.o(java.lang.Object):java.lang.Object");
    }
}
