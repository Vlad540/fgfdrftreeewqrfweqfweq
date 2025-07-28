package defpackage;

/* renamed from: sxc  reason: default package */
public final class sxc {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;

    public sxc(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r17, long r19, long r21, long r23, defpackage.ryb r25, defpackage.wr8 r26, kotlin.coroutines.Continuation r27) {
        /*
            r16 = this;
            r1 = r16
            r0 = r25
            r2 = r26
            r3 = r27
            boolean r4 = r3 instanceof defpackage.rxc
            if (r4 == 0) goto L_0x001b
            r4 = r3
            rxc r4 = (defpackage.rxc) r4
            int r5 = r4.B0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.B0 = r5
            goto L_0x0020
        L_0x001b:
            rxc r4 = new rxc
            r4.<init>(r1, r3)
        L_0x0020:
            java.lang.Object r3 = r4.z0
            pu3 r5 = pu3.a
            int r6 = r4.B0
            jue r7 = jue.a
            java.lang.String r8 = "sxc"
            r9 = 1
            if (r6 == 0) goto L_0x004d
            if (r6 != r9) goto L_0x0045
            long r0 = r4.y0
            long r5 = r4.x0
            long r9 = r4.w0
            long r11 = r4.Z
            wr8 r2 = r4.Y
            ryb r13 = r4.X
            sxc r4 = r4.o
            wx3.H(r3)     // Catch:{ all -> 0x0042 }
            goto L_0x00b3
        L_0x0042:
            r0 = move-exception
            goto L_0x00da
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            wx3.H(r3)
            t97 r3 = r1.b
            java.lang.Object r3 = r3.getValue()
            xzc r3 = (defpackage.xzc) r3
            r3.getClass()
            java.lang.String r3 = "reactions, sendReaction"
            udd.q(r8, r3)
            t97 r3 = r1.c     // Catch:{ all -> 0x00d8 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00d8 }
            r10 = r3
            bs8 r10 = (defpackage.bs8) r10     // Catch:{ all -> 0x00d8 }
            yyb r15 = new yyb     // Catch:{ all -> 0x00d8 }
            t97 r3 = r1.e     // Catch:{ all -> 0x00d8 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00d8 }
            zr8 r3 = (defpackage.zr8) r3     // Catch:{ all -> 0x00d8 }
            r3.getClass()     // Catch:{ all -> 0x00d8 }
            j06 r3 = defpackage.zyb.b     // Catch:{ all -> 0x00d8 }
            int r6 = r2.a     // Catch:{ all -> 0x00d8 }
            r3.getClass()     // Catch:{ all -> 0x00d8 }
            zyb r3 = j06.d(r6)     // Catch:{ all -> 0x00d8 }
            r15.<init>(r3, r0)     // Catch:{ all -> 0x00d8 }
            r4.o = r1     // Catch:{ all -> 0x00d8 }
            r4.X = r0     // Catch:{ all -> 0x00d8 }
            r4.Y = r2     // Catch:{ all -> 0x00d8 }
            r13 = r17
            r4.Z = r13     // Catch:{ all -> 0x00d8 }
            r11 = r19
            r4.w0 = r11     // Catch:{ all -> 0x00d8 }
            r3 = r10
            r9 = r21
            r4.x0 = r9     // Catch:{ all -> 0x00d8 }
            r0 = r23
            r4.y0 = r0     // Catch:{ all -> 0x00d8 }
            r6 = 1
            r4.B0 = r6     // Catch:{ all -> 0x00d8 }
            r10 = r3
            r11 = r17
            r13 = r19
            r10.e(r11, r13, r15)     // Catch:{ all -> 0x00d8 }
            if (r7 != r5) goto L_0x00a9
            return r5
        L_0x00a9:
            r4 = r16
            r11 = r17
            r9 = r19
            r5 = r21
            r13 = r25
        L_0x00b3:
            t97 r3 = r4.a     // Catch:{ all -> 0x0042 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0042 }
            pk r3 = (defpackage.pk) r3     // Catch:{ all -> 0x0042 }
            java.lang.CharSequence r13 = r13.a     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0042 }
            gy9 r3 = (defpackage.gy9) r3     // Catch:{ all -> 0x0042 }
            r16 = r3
            r17 = r11
            r19 = r9
            r21 = r5
            r23 = r0
            r25 = r13
            r26 = r2
            r16.F(r17, r19, r21, r23, r25, r26)     // Catch:{ all -> 0x0042 }
            goto L_0x00f2
        L_0x00d5:
            r4 = r16
            goto L_0x00da
        L_0x00d8:
            r0 = move-exception
            goto L_0x00d5
        L_0x00da:
            java.lang.String r1 = "reactions, sendReaction async query failed"
            udd.s(r8, r1, r0)
            t97 r1 = r4.d
            java.lang.Object r1 = r1.getValue()
            g15 r1 = (defpackage.g15) r1
            ru.ok.tamtam.util.HandledException r2 = new ru.ok.tamtam.util.HandledException
            r2.<init>(r0)
            r0 = 0
            r4a r1 = (r4a) r1
            r1.c(r2, r0)
        L_0x00f2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxc.a(long, long, long, long, ryb, wr8, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
