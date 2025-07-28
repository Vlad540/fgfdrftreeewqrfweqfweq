package defpackage;

/* renamed from: gp7  reason: default package */
public final class gp7 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;

    public gp7(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t977;
        this.f = t975;
        this.g = t976;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9 A[Catch:{ TamErrorException -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016c A[Catch:{ TamErrorException -> 0x0196 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0171 A[Catch:{ TamErrorException -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0172 A[Catch:{ TamErrorException -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r21
            java.lang.String r3 = "login: onEnded by "
            boolean r4 = r2 instanceof defpackage.fp7
            if (r4 == 0) goto L_0x001c
            r4 = r2
            fp7 r4 = (defpackage.fp7) r4
            int r5 = r4.y0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.y0 = r5
        L_0x001a:
            r11 = r4
            goto L_0x0022
        L_0x001c:
            fp7 r4 = new fp7
            r4.<init>(r1, r2)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r2 = r11.w0
            pu3 r4 = pu3.a
            int r5 = r11.y0
            r12 = 0
            java.lang.String r13 = "gp7"
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0079
            if (r5 == r8) goto L_0x0061
            if (r5 == r7) goto L_0x004d
            if (r5 != r6) goto L_0x0045
            long r0 = r11.Z
            gp7 r4 = r11.o
            wx3.H(r2)     // Catch:{ TamErrorException -> 0x0041 }
            r14 = r0
            r1 = r4
            goto L_0x016d
        L_0x0041:
            r0 = move-exception
            r1 = r4
            goto L_0x01a7
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            long r0 = r11.Z
            java.lang.Object r5 = r11.X
            jo7 r5 = (defpackage.jo7) r5
            gp7 r7 = r11.o
            wx3.H(r2)     // Catch:{ TamErrorException -> 0x005d }
            r14 = r0
            r8 = r5
            r1 = r7
            goto L_0x0138
        L_0x005d:
            r0 = move-exception
            r1 = r7
            goto L_0x01a7
        L_0x0061:
            long r0 = r11.Z
            java.lang.String r5 = r11.Y
            java.lang.Object r8 = r11.X
            java.lang.String r8 = (java.lang.String) r8
            gp7 r9 = r11.o
            wx3.H(r2)     // Catch:{ TamErrorException -> 0x0075 }
            r16 = r0
            r0 = r8
            r1 = r9
            r9 = r16
            goto L_0x00b3
        L_0x0075:
            r0 = move-exception
            r1 = r9
            goto L_0x01a7
        L_0x0079:
            wx3.H(r2)
            t97 r2 = r1.d
            java.lang.Object r2 = r2.getValue()
            pva r2 = (defpackage.pva) r2
            r2.b()
            int r2 = zp4.o     // Catch:{ TamErrorException -> 0x0196 }
            long r9 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x0196 }
            eq4 r2 = eq4.b     // Catch:{ TamErrorException -> 0x0196 }
            long r9 = mt0.Q(r9, r2)     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.String r2 = "login: onStarted"
            udd.q(r13, r2)     // Catch:{ TamErrorException -> 0x0196 }
            t97 r2 = r1.a     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ TamErrorException -> 0x0196 }
            yy9 r2 = (defpackage.yy9) r2     // Catch:{ TamErrorException -> 0x0196 }
            r11.o = r1     // Catch:{ TamErrorException -> 0x0196 }
            r11.X = r0     // Catch:{ TamErrorException -> 0x0196 }
            r5 = r20
            r11.Y = r5     // Catch:{ TamErrorException -> 0x0196 }
            r11.Z = r9     // Catch:{ TamErrorException -> 0x0196 }
            r11.y0 = r8     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Object r2 = r2.b(r0, r11)     // Catch:{ TamErrorException -> 0x0196 }
            if (r2 != r4) goto L_0x00b3
            return r4
        L_0x00b3:
            jo7 r2 = (defpackage.jo7) r2     // Catch:{ TamErrorException -> 0x0196 }
            uj3 r8 = r2.c     // Catch:{ TamErrorException -> 0x0196 }
            if (r8 == 0) goto L_0x019b
            t97 r14 = r1.c     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ TamErrorException -> 0x0196 }
            zy9 r14 = (defpackage.zy9) r14     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.String r15 = r8.a()     // Catch:{ TamErrorException -> 0x0196 }
            r14.getClass()     // Catch:{ TamErrorException -> 0x0196 }
            android.accounts.Account r6 = new android.accounts.Account     // Catch:{ TamErrorException -> 0x0196 }
            a5 r7 = r14.a     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.String r7 = r7.a     // Catch:{ TamErrorException -> 0x0196 }
            r6.<init>(r15, r7)     // Catch:{ TamErrorException -> 0x0196 }
            g2b r6 = r14.b()     // Catch:{ TamErrorException -> 0x0196 }
            j2b r6 = (defpackage.j2b) r6     // Catch:{ TamErrorException -> 0x0196 }
            f70 r6 = r6.d     // Catch:{ TamErrorException -> 0x0196 }
            c5 r7 = r14.a()     // Catch:{ TamErrorException -> 0x0196 }
            android.accounts.Account r7 = r7.a()     // Catch:{ TamErrorException -> 0x0196 }
            r15 = 0
            r6.n(r7, r0, r15)     // Catch:{ TamErrorException -> 0x0196 }
            c5 r0 = r14.a()     // Catch:{ TamErrorException -> 0x0196 }
            r0.getClass()     // Catch:{ TamErrorException -> 0x0196 }
            t97 r0 = r1.b     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x0196 }
            f03 r0 = (defpackage.f03) r0     // Catch:{ TamErrorException -> 0x0196 }
            long r6 = r8.a     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Long r14 = new java.lang.Long     // Catch:{ TamErrorException -> 0x0196 }
            r14.<init>(r6)     // Catch:{ TamErrorException -> 0x0196 }
            lqc r0 = (defpackage.lqc) r0     // Catch:{ TamErrorException -> 0x0196 }
            r0.A(r14)     // Catch:{ TamErrorException -> 0x0196 }
            t97 r0 = r1.b     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x0196 }
            f03 r0 = (defpackage.f03) r0     // Catch:{ TamErrorException -> 0x0196 }
            i03 r0 = (defpackage.i03) r0     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.String r6 = "user.Phone"
            r0.l(r6, r5)     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.String r0 = "login: auth and token are saved"
            udd.q(r13, r0)     // Catch:{ TamErrorException -> 0x0196 }
            t97 r0 = r1.e     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x0196 }
            ap3 r0 = (defpackage.ap3) r0     // Catch:{ TamErrorException -> 0x0196 }
            java.util.List r5 = java.util.Collections.singletonList(r8)     // Catch:{ TamErrorException -> 0x0196 }
            mi3 r6 = defpackage.mi3.b     // Catch:{ TamErrorException -> 0x0196 }
            r11.o = r1     // Catch:{ TamErrorException -> 0x0196 }
            r11.X = r2     // Catch:{ TamErrorException -> 0x0196 }
            r11.Y = r12     // Catch:{ TamErrorException -> 0x0196 }
            r11.Z = r9     // Catch:{ TamErrorException -> 0x0196 }
            r7 = 2
            r11.y0 = r7     // Catch:{ TamErrorException -> 0x0196 }
            di3 r0 = r0.a     // Catch:{ TamErrorException -> 0x0196 }
            java.util.List r0 = r0.t(r5, r6)     // Catch:{ TamErrorException -> 0x0196 }
            if (r0 != r4) goto L_0x0136
            return r4
        L_0x0136:
            r8 = r2
            r14 = r9
        L_0x0138:
            t97 r0 = r1.f     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x0196 }
            r5 = r0
            bp7 r5 = (defpackage.bp7) r5     // Catch:{ TamErrorException -> 0x0196 }
            t97 r0 = r1.b     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x0196 }
            f03 r0 = (defpackage.f03) r0     // Catch:{ TamErrorException -> 0x0196 }
            lqc r0 = (defpackage.lqc) r0     // Catch:{ TamErrorException -> 0x0196 }
            long r6 = r0.n()     // Catch:{ TamErrorException -> 0x0196 }
            t97 r0 = r1.b     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x0196 }
            f03 r0 = (defpackage.f03) r0     // Catch:{ TamErrorException -> 0x0196 }
            lqc r0 = (defpackage.lqc) r0     // Catch:{ TamErrorException -> 0x0196 }
            long r9 = r0.o()     // Catch:{ TamErrorException -> 0x0196 }
            r11.o = r1     // Catch:{ TamErrorException -> 0x0196 }
            r11.X = r12     // Catch:{ TamErrorException -> 0x0196 }
            r11.Z = r14     // Catch:{ TamErrorException -> 0x0196 }
            r0 = 3
            r11.y0 = r0     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.Object r0 = r5.s(r6, r8, r9, r11)     // Catch:{ TamErrorException -> 0x0196 }
            if (r0 != r4) goto L_0x016d
            return r4
        L_0x016d:
            fn6 r0 = udd.e     // Catch:{ TamErrorException -> 0x0196 }
            if (r0 != 0) goto L_0x0172
            goto L_0x0198
        L_0x0172:
            boolean r2 = r0.c()     // Catch:{ TamErrorException -> 0x0196 }
            if (r2 == 0) goto L_0x0198
            tn7 r2 = defpackage.tn7.X     // Catch:{ TamErrorException -> 0x0196 }
            int r4 = zp4.o     // Catch:{ TamErrorException -> 0x0196 }
            long r4 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x0196 }
            eq4 r6 = eq4.b     // Catch:{ TamErrorException -> 0x0196 }
            long r4 = mt0.Q(r4, r6)     // Catch:{ TamErrorException -> 0x0196 }
            long r4 = zp4.g(r4, r14)     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.String r4 = zp4.j(r4)     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ TamErrorException -> 0x0196 }
            r0.d(r2, r13, r3, r12)     // Catch:{ TamErrorException -> 0x0196 }
            goto L_0x0198
        L_0x0196:
            r0 = move-exception
            goto L_0x01a7
        L_0x0198:
            jue r0 = jue.a
            return r0
        L_0x019b:
            java.lang.String r0 = "To login account should have profile and user id"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ TamErrorException -> 0x0196 }
            java.lang.String r0 = r0.toString()     // Catch:{ TamErrorException -> 0x0196 }
            r2.<init>(r0)     // Catch:{ TamErrorException -> 0x0196 }
            throw r2     // Catch:{ TamErrorException -> 0x0196 }
        L_0x01a7:
            uae r2 = r0.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "login: OnFailed - "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            udd.q(r13, r2)
            t97 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            wo7 r1 = (defpackage.wo7) r1
            uae r2 = r0.a
            r1.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp7.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
