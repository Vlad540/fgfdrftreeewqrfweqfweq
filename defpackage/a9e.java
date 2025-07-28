package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a9e  reason: default package */
public final class a9e extends l5e implements i26 {
    public long X;
    public int Y;
    public final /* synthetic */ b9e Z;
    public final /* synthetic */ boolean w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a9e(b9e b9e, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = b9e;
        this.w0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a9e(this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            pu3 r0 = pu3.a
            int r1 = r13.Y
            jue r2 = jue.a
            r3 = 1
            r4 = 2
            r5 = 3
            r6 = 0
            if (r1 == 0) goto L_0x002c
            if (r1 == r3) goto L_0x0026
            if (r1 == r4) goto L_0x001f
            if (r1 != r5) goto L_0x0017
            wx3.H(r14)
            goto L_0x0192
        L_0x0017:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x001f:
            long r3 = r13.X
            wx3.H(r14)
            goto L_0x0131
        L_0x0026:
            long r7 = r13.X
            wx3.H(r14)
            goto L_0x0050
        L_0x002c:
            wx3.H(r14)
            b9e r14 = r13.Z
            java.lang.String r14 = r14.a
            java.lang.String r1 = "start init vendor services"
            udd.q(r14, r1)
            long r7 = java.lang.System.nanoTime()
            b9e r14 = r13.Z
            r13.X = r7
            r13.Y = r3
            ezd r14 = r14.g()
            fb6 r14 = (defpackage.fb6) r14
            r7e r14 = r14.c
            r14.getValue()
            if (r2 != r0) goto L_0x0050
            return r0
        L_0x0050:
            android.content.res.Resources r14 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            int r14 = r14.densityDpi
            r1 = 4
            r9 = 5
            r10 = 6
            switch(r14) {
                case 120: goto L_0x006a;
                case 140: goto L_0x0068;
                case 160: goto L_0x0068;
                case 180: goto L_0x0066;
                case 200: goto L_0x0066;
                case 220: goto L_0x0066;
                case 240: goto L_0x0066;
                case 260: goto L_0x006b;
                case 280: goto L_0x006b;
                case 300: goto L_0x006b;
                case 320: goto L_0x006b;
                case 340: goto L_0x0064;
                case 360: goto L_0x0064;
                case 400: goto L_0x0064;
                case 420: goto L_0x0064;
                case 440: goto L_0x0064;
                case 480: goto L_0x0064;
                case 560: goto L_0x0062;
                case 600: goto L_0x0062;
                case 640: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            r1 = 0
            goto L_0x006b
        L_0x0062:
            r1 = r10
            goto L_0x006b
        L_0x0064:
            r1 = r9
            goto L_0x006b
        L_0x0066:
            r1 = r5
            goto L_0x006b
        L_0x0068:
            r1 = r4
            goto L_0x006b
        L_0x006a:
            r1 = r3
        L_0x006b:
            if (r1 == 0) goto L_0x00ba
            b9e r14 = r13.Z
            java.lang.String r14 = r14.a
            fn6 r9 = udd.e
            if (r9 != 0) goto L_0x0076
            goto L_0x008b
        L_0x0076:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x008b
            tn7 r10 = defpackage.tn7.X
            java.lang.String r11 = defpackage.me4.q(r1)
            java.lang.String r12 = "Density is "
            java.lang.String r11 = r12.concat(r11)
            r9.d(r10, r14, r11, r6)
        L_0x008b:
            b9e r14 = r13.Z
            pv3 r14 = r14.c()
            op r14 = (op) r14
            r14.getClass()
            r7e r14 = op.d
            java.lang.Object r14 = r14.getValue()
            nne r14 = (defpackage.nne) r14
            if (r14 == 0) goto L_0x00ba
            java.lang.String r14 = defpackage.me4.q(r1)
            nne r1 = defpackage.nne.a
            java.lang.String r1 = "density"
            java.util.Map r14 = java.util.Collections.singletonMap(r1, r14)
            boolean r1 = defpackage.nne.b
            if (r1 == 0) goto L_0x00b1
            goto L_0x00ba
        L_0x00b1:
            i3d r1 = defpackage.nne.e     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r1 = r6
        L_0x00b7:
            r1.f(r14)     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            b9e r14 = r13.Z
            pv3 r14 = r14.c()
            b9e r1 = r13.Z
            t97 r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            q0a r1 = (q0a) r1
            r1.getClass()
            r1 = 6386(0x18f2, float:8.949E-42)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r9 = "version_code"
            r14.b(r9, r1)
            b9e r14 = r13.Z
            pv3 r14 = r14.c()
            b9e r1 = r13.Z
            t97 r1 = r1.o
            java.lang.Object r1 = r1.getValue()
            q0a r1 = (q0a) r1
            r1.getClass()
            op r14 = (op) r14
            r14.getClass()
            java.lang.Class<ct0> r14 = defpackage.ct0.class
            xy2 r14 = m7c.a(r14)
            java.lang.String r1 = "LIMIT_MAX_NON_FATALS_PER_SESSION"
            r9 = 32
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Class r14 = r14.a()     // Catch:{ all -> 0x010c }
            java.lang.reflect.Field r14 = r14.getDeclaredField(r1)     // Catch:{ all -> 0x010c }
            r14.setAccessible(r3)     // Catch:{ all -> 0x010c }
            r14.set(r6, r9)     // Catch:{ all -> 0x010c }
        L_0x010c:
            b9e r14 = r13.Z
            f03 r14 = r14.b()
            lqc r14 = (defpackage.lqc) r14
            n73 r14 = r14.t()
            rn1 r14 = am7.c(r14)
            bw r1 = new bw
            b9e r3 = r13.Z
            r9 = 13
            r1.<init>((int) r9, (java.lang.Object) r3)
            r13.X = r7
            r13.Y = r4
            java.lang.Object r14 = r14.c(r1, r13)
            if (r14 != r0) goto L_0x0130
            return r0
        L_0x0130:
            r3 = r7
        L_0x0131:
            b9e r14 = r13.Z
            java.lang.String r14 = r14.a
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x013a
            goto L_0x015c
        L_0x013a:
            boolean r7 = r1.c()
            if (r7 == 0) goto L_0x015c
            tn7 r7 = defpackage.tn7.X
            int r8 = zp4.o
            long r8 = java.lang.System.nanoTime()
            long r8 = r8 - r3
            eq4 r3 = eq4.b
            long r3 = mt0.Q(r8, r3)
            java.lang.String r3 = zp4.j(r3)
            java.lang.String r4 = "init time "
            java.lang.String r3 = r4.concat(r3)
            r1.d(r7, r14, r3, r6)
        L_0x015c:
            boolean r14 = r13.w0
            if (r14 == 0) goto L_0x0192
            b9e r14 = r13.Z
            r13.Y = r5
            java.lang.String r1 = r14.a
            java.lang.String r3 = "checkTokenChanged"
            udd.q(r1, r3)
            f03 r1 = r14.b()
            lqc r1 = (defpackage.lqc) r1
            x97 r1 = r1.g
            java.lang.String r3 = "user.fcmToken"
            java.lang.String r1 = r1.getString(r3, r6)
            if (r1 == 0) goto L_0x018e
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0182
            goto L_0x018e
        L_0x0182:
            w8e r3 = new w8e
            r3.<init>(r1, r14)
            java.lang.Object r13 = r14.e(r3, r13)
            if (r13 != r0) goto L_0x018e
            goto L_0x018f
        L_0x018e:
            r13 = r2
        L_0x018f:
            if (r13 != r0) goto L_0x0192
            return r0
        L_0x0192:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a9e.o(java.lang.Object):java.lang.Object");
    }
}
