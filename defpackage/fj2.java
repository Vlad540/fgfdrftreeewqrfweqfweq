package defpackage;

/* renamed from: fj2  reason: default package */
public final class fj2 {
    public static final /* synthetic */ int h = 0;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;

    public fj2(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t976;
        this.g = t977;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.wi2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            wi2 r0 = (defpackage.wi2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            wi2 r0 = new wi2
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            java.lang.String r3 = "fj2"
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            wx3.H(r8)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            goto L_0x005c
        L_0x0029:
            r5 = move-exception
            goto L_0x0057
        L_0x002b:
            r5 = move-exception
            goto L_0x005f
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            wx3.H(r8)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r2 = "cancel %d"
            udd.p(r3, r2, r8)
            t97 r5 = r5.b     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            ab5 r5 = (defpackage.ab5) r5     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            r0.Y = r4     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            java.lang.Object r5 = r5.s(r6, r0)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            if (r5 != r1) goto L_0x005c
            return r1
        L_0x0057:
            java.lang.String r6 = "cancel failure!"
            udd.s(r3, r6, r5)
        L_0x005c:
            jue r5 = jue.a
            return r5
        L_0x005f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj2.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xi2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            xi2 r0 = (defpackage.xi2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            xi2 r0 = new xi2
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            java.lang.String r3 = "fj2"
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            wx3.H(r6)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            goto L_0x0053
        L_0x0029:
            r5 = move-exception
            goto L_0x004e
        L_0x002b:
            r5 = move-exception
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            wx3.H(r6)
            java.lang.String r6 = "cancelAll"
            udd.q(r3, r6)
            t97 r5 = r5.b     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            ab5 r5 = (defpackage.ab5) r5     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            r0.Y = r4     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            java.lang.Object r5 = r5.t(r0)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x004e:
            java.lang.String r6 = "cancelAll failure!"
            udd.s(r3, r6, r5)
        L_0x0053:
            jue r5 = jue.a
            return r5
        L_0x0056:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj2.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0078, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0092, code lost:
        r17 = r0;
        r19 = r7;
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0118, code lost:
        r9 = ((defpackage.j2b) r0.d()).a.o();
        r6.o = r0;
        r6.X = r1;
        r6.Y = null;
        r6.w0 = r9;
        r6.A0 = 2;
        r2 = (defpackage.aw2) ((defpackage.bv2) r0.e.getValue());
        r2.getClass();
        r2 = udd.M(new nl1(12, r2), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0146, code lost:
        if (r2 != r13) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0148, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0149, code lost:
        r7 = r1;
        r21 = r9;
        r9 = r0;
        r0 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014f, code lost:
        r0 = java.lang.Math.max(r0, ((java.lang.Number) r2).longValue()) - 1;
        udd.q("fj2", "getChatsNotifications: chatServerIds=" + r7 + ", maxCacheSyncTime=" + r0);
        r6.o = r9;
        r6.X = r7;
        r6.w0 = r0;
        r6.A0 = 3;
        r2 = ((defpackage.yj7) r9.a.getValue()).q(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x018a, code lost:
        if (r2 != r13) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x018c, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x018d, code lost:
        r2 = (defpackage.ui2) r2;
        r0 = (defpackage.ab5) r1.b.getValue();
        r6.o = r1;
        r6.X = r2;
        r6.A0 = 4;
        r0 = xs7.U(r0.X.b(), new defpackage.va5(r0, r17, r19, (kotlin.coroutines.Continuation) null), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b4, code lost:
        if (r0 != r13) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b6, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01b7, code lost:
        r7 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01b9, code lost:
        r2 = (defpackage.ui2) r2;
        udd.p("fj2", "fcmNotificationData = %s", new java.lang.Object[]{r2});
        r1.getClass();
        r8 = new bs(o23.m0(z3d.I(r7.a.keySet(), r2.a.keySet()), new ns(r7, r2)));
        r6.o = r1;
        r6.X = r7;
        r6.Y = r2;
        r6.Z = r8;
        r6.A0 = 5;
        r0 = n1g.f(new defpackage.aj2(r8, r1, (kotlin.coroutines.Continuation) null), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01f9, code lost:
        if (r0 != r13) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01fb, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01fc, code lost:
        r15 = r1;
        r1 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0201, code lost:
        r2 = (pj5) r2;
        r6.o = r15;
        r6.X = r0;
        r6.Y = r1;
        r6.Z = r2;
        r6.A0 = 6;
        r7 = r15.e(r8, r0, r1, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0217, code lost:
        if (r7 != r13) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0219, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x021a, code lost:
        r8 = r15;
        r21 = r7;
        r7 = r0;
        r0 = r2;
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0221, code lost:
        r2 = (defpackage.vo9) r2;
        r9 = ((defpackage.j2b) r8.d()).c.g.getLong("app.notification.dontDisturbUntil", 0);
        r11 = ((defpackage.j2b) r8.d()).a.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0245, code lost:
        if (r9 == -1) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0249, code lost:
        if (r11 >= r9) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x024c, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x024e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x024f, code lost:
        if (r9 != false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0251, code lost:
        r6.o = r8;
        r6.X = r7;
        r6.Y = r2;
        r6.Z = null;
        r6.x0 = r9;
        r6.A0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0262, code lost:
        if (r8.h(r1, r0, r6) != r13) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0264, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0265, code lost:
        r1 = r2;
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0267, code lost:
        r6.o = r8;
        r6.X = r1;
        r6.Y = null;
        r6.x0 = r0;
        r6.A0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0277, code lost:
        if (r8.g(r7, r6) != r13) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0279, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x027a, code lost:
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x027b, code lost:
        r9 = r0;
        r2 = r1;
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x027e, code lost:
        if (r9 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0280, code lost:
        r8.getClass();
        r0 = r2.a;
        r7 = new java.util.LinkedHashMap(ju7.S(r0.size()));
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x029e, code lost:
        if (r0.hasNext() == false) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02a0, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        r6 = r1.getKey();
        r10 = new vqe(new es(2, ((defpackage.si2) r1.getValue()).f), new hd1(18));
        r8 = ((defpackage.si2) r1.getValue()).g;
        r9 = new java.util.ArrayList(q23.H(r8, 10));
        r8 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02de, code lost:
        if (r8.hasNext() == false) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02e0, code lost:
        r11 = (defpackage.or9) r8.next();
        r13 = r11.a;
        r19 = defpackage.ep4.DO_NOT_DISTURB_MODE;
        r3 = r11.b;
        r17 = r11.c;
        r11 = r12;
        r12 = new defpackage.or9(r13, r3, r17, r19);
        r9.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02fd, code lost:
        r7.put(r6, defpackage.si2.a((defpackage.si2) r1.getValue(), hw4.a, myc.U(myc.P(cs.K(new dyc[]{r10, new es(2, r9)}), x51.w0)), false, 32415));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return new defpackage.vo9(r7, r2.b, 0, r2.d, r2.e, r2.f, r2.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(zb9 r24, kotlin.coroutines.Continuation r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = 1
            r5 = 2
            boolean r6 = r2 instanceof defpackage.yi2
            if (r6 == 0) goto L_0x001b
            r6 = r2
            yi2 r6 = (defpackage.yi2) r6
            int r7 = r6.A0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001b
            int r7 = r7 - r8
            r6.A0 = r7
            goto L_0x0020
        L_0x001b:
            yi2 r6 = new yi2
            r6.<init>(r0, r2)
        L_0x0020:
            java.lang.Object r2 = r6.y0
            pu3 r13 = pu3.a
            int r7 = r6.A0
            java.lang.String r8 = "fj2"
            r14 = 0
            switch(r7) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00a6;
                case 2: goto L_0x0099;
                case 3: goto L_0x0087;
                case 4: goto L_0x007b;
                case 5: goto L_0x0065;
                case 6: goto L_0x0052;
                case 7: goto L_0x0041;
                case 8: goto L_0x0034;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            boolean r0 = r6.x0
            java.lang.Object r1 = r6.X
            vo9 r1 = (defpackage.vo9) r1
            fj2 r6 = r6.o
            wx3.H(r2)
            goto L_0x027b
        L_0x0041:
            boolean r0 = r6.x0
            java.lang.Object r1 = r6.Y
            vo9 r1 = (defpackage.vo9) r1
            java.lang.Object r7 = r6.X
            ui2 r7 = (defpackage.ui2) r7
            fj2 r8 = r6.o
            wx3.H(r2)
            goto L_0x0267
        L_0x0052:
            java.lang.Object r0 = r6.Z
            pj5 r0 = (pj5) r0
            java.lang.Object r1 = r6.Y
            ui2 r1 = (defpackage.ui2) r1
            java.lang.Object r7 = r6.X
            ui2 r7 = (defpackage.ui2) r7
            fj2 r8 = r6.o
            wx3.H(r2)
            goto L_0x0221
        L_0x0065:
            java.lang.Object r0 = r6.Z
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r1 = r6.Y
            ui2 r1 = (defpackage.ui2) r1
            java.lang.Object r7 = r6.X
            ui2 r7 = (defpackage.ui2) r7
            fj2 r8 = r6.o
            wx3.H(r2)
            r15 = r8
            r8 = r0
        L_0x0078:
            r0 = r7
            goto L_0x0201
        L_0x007b:
            java.lang.Object r0 = r6.X
            ui2 r0 = (defpackage.ui2) r0
            fj2 r1 = r6.o
            wx3.H(r2)
            r7 = r0
            goto L_0x01b9
        L_0x0087:
            long r0 = r6.w0
            java.lang.Object r7 = r6.X
            zb9 r7 = (zb9) r7
            fj2 r9 = r6.o
            wx3.H(r2)
        L_0x0092:
            r17 = r0
            r19 = r7
            r1 = r9
            goto L_0x018d
        L_0x0099:
            long r0 = r6.w0
            java.lang.Object r7 = r6.X
            zb9 r7 = (zb9) r7
            fj2 r9 = r6.o
            wx3.H(r2)
            goto L_0x014f
        L_0x00a6:
            java.lang.Object r0 = r6.Y
            zb9 r0 = (zb9) r0
            java.lang.Object r1 = r6.X
            zb9 r1 = (zb9) r1
            fj2 r7 = r6.o
            wx3.H(r2)
            r21 = r2
            r2 = r0
            r0 = r7
            r7 = r21
            goto L_0x00e8
        L_0x00ba:
            wx3.H(r2)
            boolean r2 = r24.i()
            if (r2 == 0) goto L_0x00c6
            zb9 r1 = tq7.a
            goto L_0x0118
        L_0x00c6:
            zb9 r2 = new zb9
            int r7 = r1.d
            r2.<init>(r7)
            t97 r7 = r0.e
            java.lang.Object r7 = r7.getValue()
            bv2 r7 = (defpackage.bv2) r7
            r6.o = r0
            r6.X = r2
            r6.Y = r2
            r6.A0 = r3
            aw2 r7 = (defpackage.aw2) r7
            java.lang.Object r1 = r7.o(r1, r6)
            if (r1 != r13) goto L_0x00e6
            return r13
        L_0x00e6:
            r7 = r1
            r1 = r2
        L_0x00e8:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x00ee:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0118
            java.lang.Object r9 = r7.next()
            i22 r9 = (defpackage.i22) r9
            g2b r10 = r0.d()
            j2b r10 = (defpackage.j2b) r10
            i03 r10 = r10.a
            g2b r11 = r0.d()
            j2b r11 = (defpackage.j2b) r11
            kp r11 = r11.c
            boolean r10 = r9.L(r10, r11)
            if (r10 != 0) goto L_0x00ee
            o62 r9 = r9.b
            long r9 = r9.a
            r2.a(r9)
            goto L_0x00ee
        L_0x0118:
            g2b r2 = r0.d()
            j2b r2 = (defpackage.j2b) r2
            i03 r2 = r2.a
            long r9 = r2.o()
            t97 r2 = r0.e
            java.lang.Object r2 = r2.getValue()
            bv2 r2 = (defpackage.bv2) r2
            r6.o = r0
            r6.X = r1
            r6.Y = r14
            r6.w0 = r9
            r6.A0 = r5
            aw2 r2 = (defpackage.aw2) r2
            r2.getClass()
            nl1 r7 = new nl1
            r11 = 12
            r7.<init>(r11, r2)
            java.lang.Object r2 = udd.M(r7, r6)
            if (r2 != r13) goto L_0x0149
            return r13
        L_0x0149:
            r7 = r1
            r21 = r9
            r9 = r0
            r0 = r21
        L_0x014f:
            java.lang.Number r2 = (java.lang.Number) r2
            long r10 = r2.longValue()
            long r0 = java.lang.Math.max(r0, r10)
            r10 = 1
            long r0 = r0 - r10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r10 = "getChatsNotifications: chatServerIds="
            r2.<init>(r10)
            r2.append(r7)
            java.lang.String r10 = ", maxCacheSyncTime="
            r2.append(r10)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            udd.q(r8, r2)
            t97 r2 = r9.a
            java.lang.Object r2 = r2.getValue()
            yj7 r2 = (defpackage.yj7) r2
            r6.o = r9
            r6.X = r7
            r6.w0 = r0
            r10 = 3
            r6.A0 = r10
            java.lang.Object r2 = r2.q(r7, r6)
            if (r2 != r13) goto L_0x0092
            return r13
        L_0x018d:
            ui2 r2 = (defpackage.ui2) r2
            t97 r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            ab5 r0 = (defpackage.ab5) r0
            r6.o = r1
            r6.X = r2
            r7 = 4
            r6.A0 = r7
            pae r7 = r0.X
            n3a r7 = (n3a) r7
            ju3 r7 = r7.b()
            va5 r9 = new va5
            r20 = 0
            r15 = r9
            r16 = r0
            r15.<init>(r16, r17, r19, r20)
            java.lang.Object r0 = xs7.U(r7, r9, r6)
            if (r0 != r13) goto L_0x01b7
            return r13
        L_0x01b7:
            r7 = r2
            r2 = r0
        L_0x01b9:
            ui2 r2 = (defpackage.ui2) r2
            java.lang.String r0 = "fcmNotificationData = %s"
            java.lang.Object[] r9 = new java.lang.Object[]{r2}
            udd.p(r8, r0, r9)
            r1.getClass()
            java.util.Map r0 = r7.a
            java.util.Set r0 = r0.keySet()
            java.util.Map r8 = r2.a
            java.util.Set r8 = r8.keySet()
            java.util.LinkedHashSet r0 = z3d.I(r0, r8)
            ns r8 = new ns
            r8.<init>(r7, r2)
            java.util.List r0 = o23.m0(r0, r8)
            bs r8 = new bs
            r8.<init>(r0)
            r6.o = r1
            r6.X = r7
            r6.Y = r2
            r6.Z = r8
            r0 = 5
            r6.A0 = r0
            aj2 r0 = new aj2
            r0.<init>(r8, r1, r14)
            java.lang.Object r0 = n1g.f(r0, r6)
            if (r0 != r13) goto L_0x01fc
            return r13
        L_0x01fc:
            r15 = r1
            r1 = r2
            r2 = r0
            goto L_0x0078
        L_0x0201:
            pj5 r2 = (pj5) r2
            r6.o = r15
            r6.X = r0
            r6.Y = r1
            r6.Z = r2
            r7 = 6
            r6.A0 = r7
            r7 = r15
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r6
            java.lang.Object r7 = r7.e(r8, r9, r10, r11, r12)
            if (r7 != r13) goto L_0x021a
            return r13
        L_0x021a:
            r8 = r15
            r21 = r7
            r7 = r0
            r0 = r2
            r2 = r21
        L_0x0221:
            vo9 r2 = (defpackage.vo9) r2
            g2b r9 = r8.d()
            j2b r9 = (defpackage.j2b) r9
            kp r9 = r9.c
            x97 r9 = r9.g
            java.lang.String r10 = "app.notification.dontDisturbUntil"
            r11 = 0
            long r9 = r9.getLong(r10, r11)
            g2b r11 = r8.d()
            j2b r11 = (defpackage.j2b) r11
            i03 r11 = r11.a
            long r11 = r11.m()
            r15 = -1
            int r15 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x024e
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x024c
            goto L_0x024e
        L_0x024c:
            r9 = 0
            goto L_0x024f
        L_0x024e:
            r9 = r3
        L_0x024f:
            if (r9 != 0) goto L_0x027e
            r6.o = r8
            r6.X = r7
            r6.Y = r2
            r6.Z = r14
            r6.x0 = r9
            r10 = 7
            r6.A0 = r10
            java.lang.Object r0 = r8.h(r1, r0, r6)
            if (r0 != r13) goto L_0x0265
            return r13
        L_0x0265:
            r1 = r2
            r0 = r9
        L_0x0267:
            r6.o = r8
            r6.X = r1
            r6.Y = r14
            r6.x0 = r0
            r2 = 8
            r6.A0 = r2
            java.lang.Object r2 = r8.g(r7, r6)
            if (r2 != r13) goto L_0x027a
            return r13
        L_0x027a:
            r6 = r8
        L_0x027b:
            r9 = r0
            r2 = r1
            r8 = r6
        L_0x027e:
            if (r9 == 0) goto L_0x033f
            r8.getClass()
            java.util.Map r0 = r2.a
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            int r1 = r0.size()
            int r1 = ju7.S(r1)
            r7.<init>(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x029a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x032d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r6 = r1.getKey()
            java.lang.Object r8 = r1.getValue()
            si2 r8 = (defpackage.si2) r8
            java.util.List r8 = r8.f
            es r9 = new es
            r9.<init>(r5, r8)
            hd1 r8 = new hd1
            r10 = 18
            r8.<init>(r10)
            vqe r10 = new vqe
            r10.<init>(r9, r8)
            java.lang.Object r8 = r1.getValue()
            si2 r8 = (defpackage.si2) r8
            java.util.List r8 = r8.g
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 10
            int r11 = q23.H(r8, r11)
            r9.<init>(r11)
            java.util.Iterator r8 = r8.iterator()
        L_0x02da:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x02fd
            java.lang.Object r11 = r8.next()
            or9 r11 = (defpackage.or9) r11
            or9 r15 = new or9
            long r13 = r11.a
            ep4 r19 = defpackage.ep4.DO_NOT_DISTURB_MODE
            long r3 = r11.b
            long r11 = r11.c
            r17 = r11
            r12 = r15
            r11 = r15
            r15 = r3
            r12.<init>(r13, r15, r17, r19)
            r9.add(r11)
            r3 = 1
            goto L_0x02da
        L_0x02fd:
            es r3 = new es
            r3.<init>(r5, r9)
            dyc[] r4 = new dyc[r5]
            r8 = 0
            r4[r8] = r10
            r8 = 1
            r4[r8] = r3
            dyc r3 = cs.K(r4)
            x51 r4 = x51.w0
            xi5 r3 = myc.P(r3, r4)
            java.util.List r3 = myc.U(r3)
            java.lang.Object r1 = r1.getValue()
            si2 r1 = (defpackage.si2) r1
            hw4 r4 = hw4.a
            r9 = 32415(0x7e9f, float:4.5423E-41)
            r10 = 0
            si2 r1 = defpackage.si2.a(r1, r4, r3, r10, r9)
            r7.put(r6, r1)
            r3 = r8
            goto L_0x029a
        L_0x032d:
            vo9 r0 = new vo9
            int r10 = r2.d
            java.lang.String r11 = r2.e
            kp9 r8 = r2.b
            r9 = 0
            boolean r12 = r2.f
            java.lang.String r13 = r2.g
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2 = r0
        L_0x033f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj2.c(zb9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final g2b d() {
        return (g2b) this.d.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: si2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0214 A[EDGE_INSN: B:92:0x0214->B:71:0x0214 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.util.Set r22, defpackage.ui2 r23, defpackage.ui2 r24, pj5 r25, kotlin.coroutines.Continuation r26) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r0 = r26
            boolean r1 = r0 instanceof defpackage.bj2
            if (r1 == 0) goto L_0x001a
            r1 = r0
            bj2 r1 = (defpackage.bj2) r1
            int r2 = r1.y0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.y0 = r2
        L_0x0018:
            r5 = r1
            goto L_0x0020
        L_0x001a:
            bj2 r1 = new bj2
            r1.<init>(r6, r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r5.w0
            pu3 r8 = pu3.a
            int r1 = r5.y0
            r9 = 1
            java.lang.String r10 = "fj2"
            if (r1 == 0) goto L_0x0043
            if (r1 != r9) goto L_0x003b
            ui2 r1 = r5.Z
            ui2 r2 = r5.Y
            java.util.Set r3 = r5.X
            fj2 r4 = r5.o
            wx3.H(r0)
            r12 = r1
            r11 = r2
            goto L_0x0078
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            wx3.H(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "merge: starting for "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            udd.q(r10, r0)
            r5.o = r6
            r5.X = r7
            r11 = r23
            r5.Y = r11
            r12 = r24
            r5.Z = r12
            r5.y0 = r9
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            java.io.Serializable r0 = r0.f(r1, r2, r3, r4, r5)
            if (r0 != r8) goto L_0x0076
            return r8
        L_0x0076:
            r4 = r6
            r3 = r7
        L_0x0078:
            r14 = r0
            java.util.Map r14 = (java.util.Map) r14
            int r0 = r11.b
            int r1 = r12.b
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "merge: finished for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ", totalUnreadMessagesCount="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            udd.q(r10, r1)
            r4.getClass()
            java.util.Collection r1 = r14.values()
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 != 0) goto L_0x00ad
            r2 = r3
            goto L_0x00d2
        L_0x00ad:
            java.lang.Object r2 = r1.next()
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L_0x00b8
            goto L_0x00d2
        L_0x00b8:
            r5 = r2
            si2 r5 = (defpackage.si2) r5
            long r5 = r5.m
        L_0x00bd:
            java.lang.Object r7 = r1.next()
            r8 = r7
            si2 r8 = (defpackage.si2) r8
            long r11 = r8.m
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x00cc
            r2 = r7
            r5 = r11
        L_0x00cc:
            boolean r7 = r1.hasNext()
            if (r7 != 0) goto L_0x00bd
        L_0x00d2:
            r1 = r2
            si2 r1 = (defpackage.si2) r1
            r5 = 0
            if (r1 == 0) goto L_0x00db
            boolean r1 = r1.j
            goto L_0x00dc
        L_0x00db:
            r1 = r5
        L_0x00dc:
            if (r1 == 0) goto L_0x00df
            r3 = r2
        L_0x00df:
            si2 r3 = (defpackage.si2) r3
            if (r3 != 0) goto L_0x00ff
            java.lang.String r1 = "buildNotificationSettings: no alert"
            udd.q(r10, r1)
            kp9 r1 = new kp9
            r2 = 0
            java.lang.String r3 = "_NONE_"
            r21 = r1
            r22 = r2
            r23 = r3
            r24 = r2
            r25 = r2
            r26 = r2
            r21.<init>(r22, r23, r24, r25, r26)
            r15 = r1
            goto L_0x01e9
        L_0x00ff:
            java.lang.String r1 = "buildNotificationSettings: need alert"
            udd.q(r10, r1)
            ti2 r1 = defpackage.ti2.a
            ti2 r2 = r3.e
            r3 = 1
            if (r2 != r1) goto L_0x010d
            r1 = r3
            goto L_0x010e
        L_0x010d:
            r1 = r5
        L_0x010e:
            if (r1 == 0) goto L_0x011f
            g2b r2 = r4.d()
            j2b r2 = (defpackage.j2b) r2
            kp r2 = r2.c
            java.lang.String r6 = "app.notification.ringtone"
            java.lang.String r2 = r2.v(r6)
            goto L_0x012d
        L_0x011f:
            g2b r2 = r4.d()
            j2b r2 = (defpackage.j2b) r2
            kp r2 = r2.c
            java.lang.String r6 = "app.notification.chats.ringtone"
            java.lang.String r2 = r2.v(r6)
        L_0x012d:
            t97 r6 = r4.f
            java.lang.Object r7 = r6.getValue()
            rf4 r7 = (defpackage.rf4) r7
            boolean r7 = r7.d()
            if (r7 == 0) goto L_0x014d
            g2b r7 = r4.d()
            j2b r7 = (defpackage.j2b) r7
            kp r7 = r7.c
            java.lang.String r8 = "app.notification.in.app.sound"
            boolean r7 = r7.c(r8, r9)
            if (r7 != 0) goto L_0x014d
            java.lang.String r2 = "_NONE_"
        L_0x014d:
            if (r1 == 0) goto L_0x015e
            g2b r7 = r4.d()
            j2b r7 = (defpackage.j2b) r7
            kp r7 = r7.c
            java.lang.String r8 = "app.notification.vibrate"
            boolean r7 = r7.c(r8, r9)
            goto L_0x016e
        L_0x015e:
            g2b r7 = r4.d()
            j2b r7 = (defpackage.j2b) r7
            kp r7 = r7.c
            x97 r7 = r7.g
            java.lang.String r8 = "app.notification.chats.vibrate"
            boolean r7 = r7.getBoolean(r8, r9)
        L_0x016e:
            java.lang.Object r8 = r6.getValue()
            rf4 r8 = (defpackage.rf4) r8
            boolean r8 = r8.d()
            if (r8 == 0) goto L_0x018d
            g2b r8 = r4.d()
            j2b r8 = (defpackage.j2b) r8
            kp r8 = r8.c
            x97 r8 = r8.g
            java.lang.String r10 = "app.notification.in.app.vibrate"
            boolean r8 = r8.getBoolean(r10, r9)
            if (r8 != 0) goto L_0x018d
            r7 = r5
        L_0x018d:
            if (r1 == 0) goto L_0x01a2
            g2b r1 = r4.d()
            j2b r1 = (defpackage.j2b) r1
            kp r1 = r1.c
            int r8 = r1.t()
            java.lang.String r10 = "app.notification.led.color"
            int r1 = r1.d(r10, r8)
            goto L_0x01b6
        L_0x01a2:
            g2b r1 = r4.d()
            j2b r1 = (defpackage.j2b) r1
            kp r1 = r1.c
            int r8 = r1.t()
            x97 r1 = r1.g
            java.lang.String r10 = "app.notification.chats.led.color"
            int r1 = r1.getInt(r10, r8)
        L_0x01b6:
            java.lang.Object r6 = r6.getValue()
            rf4 r6 = (defpackage.rf4) r6
            boolean r6 = r6.d()
            if (r6 != 0) goto L_0x01d6
            g2b r6 = r4.d()
            j2b r6 = (defpackage.j2b) r6
            kp r6 = r6.c
            x97 r6 = r6.g
            java.lang.String r8 = "app.notification.important.priority"
            boolean r6 = r6.getBoolean(r8, r9)
            if (r6 == 0) goto L_0x01d6
            r6 = r3
            goto L_0x01d7
        L_0x01d6:
            r6 = r5
        L_0x01d7:
            kp9 r8 = new kp9
            r21 = r8
            r22 = r3
            r23 = r2
            r24 = r1
            r25 = r7
            r26 = r6
            r21.<init>(r22, r23, r24, r25, r26)
            r15 = r8
        L_0x01e9:
            t97 r1 = r4.g
            java.lang.Object r2 = r1.getValue()
            h7a r2 = (h7a) r2
            int r17 = r2.e()
            java.lang.Object r2 = r1.getValue()
            h7a r2 = (h7a) r2
            t97 r2 = r2.d
            java.lang.Object r2 = r2.getValue()
            b4a r2 = (b4a) r2
            r2.getClass()
            java.util.Collection r2 = r14.values()
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0217
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0217
        L_0x0214:
            r19 = r5
            goto L_0x024e
        L_0x0217:
            java.util.Iterator r2 = r2.iterator()
        L_0x021b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0214
            java.lang.Object r3 = r2.next()
            si2 r3 = (defpackage.si2) r3
            java.util.List r3 = r3.f
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0235
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0235
        L_0x0233:
            r3 = r5
            goto L_0x024a
        L_0x0235:
            java.util.Iterator r3 = r3.iterator()
        L_0x0239:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0233
            java.lang.Object r4 = r3.next()
            hr8 r4 = (defpackage.hr8) r4
            boolean r4 = r4.n
            if (r4 == 0) goto L_0x0239
            r3 = r9
        L_0x024a:
            if (r3 == 0) goto L_0x021b
            r19 = r9
        L_0x024e:
            java.lang.Object r1 = r1.getValue()
            h7a r1 = (h7a) r1
            r1.getClass()
            vo9 r1 = new vo9
            java.lang.String r18 = "ru.oneme.app.notifications"
            r20 = 0
            r13 = r1
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj2.e(java.util.Set, ui2, ui2, pj5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0491 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b5  */
    public final java.io.Serializable f(java.util.Set r54, defpackage.ui2 r55, defpackage.ui2 r56, pj5 r57, kotlin.coroutines.Continuation r58) {
        /*
            r53 = this;
            r0 = r58
            boolean r1 = r0 instanceof defpackage.cj2
            if (r1 == 0) goto L_0x0017
            r1 = r0
            cj2 r1 = (defpackage.cj2) r1
            int r2 = r1.C0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.C0 = r2
            r2 = r53
            goto L_0x001e
        L_0x0017:
            cj2 r1 = new cj2
            r2 = r53
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.A0
            pu3 r3 = pu3.a
            int r4 = r1.C0
            java.lang.String r7 = " fcmLastNotifiedMessageId="
            java.lang.String r8 = ", cacheLastNotifiedMessageId="
            r11 = 2
            java.lang.String r12 = " "
            java.lang.String r14 = "mergeNotificationsMap: chatServerId="
            r15 = 1
            java.lang.String r9 = "fj2"
            if (r4 == 0) goto L_0x008c
            if (r4 == r15) goto L_0x0061
            if (r4 != r11) goto L_0x0059
            r4 = r12
            long r11 = r1.z0
            si2 r2 = r1.y0
            java.util.Iterator r10 = r1.x0
            java.util.LinkedHashMap r13 = r1.w0
            pj5 r5 = r1.Z
            ui2 r6 = r1.Y
            ui2 r15 = r1.X
            r53 = r2
            fj2 r2 = r1.o
            wx3.H(r0)
            r18 = r7
            r19 = r8
            r8 = r15
            r15 = 2
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r53
            goto L_0x01de
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0061:
            r4 = r12
            long r5 = r1.z0
            si2 r2 = r1.y0
            java.util.Iterator r10 = r1.x0
            java.util.LinkedHashMap r11 = r1.w0
            pj5 r12 = r1.Z
            ui2 r13 = r1.Y
            ui2 r15 = r1.X
            r53 = r2
            fj2 r2 = r1.o
            wx3.H(r0)
            r18 = r7
            r19 = r8
            r7 = r13
            r8 = r15
            r15 = 1
            r13 = r11
            r50 = r2
            r2 = r53
            r51 = r5
            r5 = r50
            r6 = r12
            r11 = r51
            goto L_0x0113
        L_0x008c:
            r4 = r12
            wx3.H(r0)
            boolean r0 = r54.isEmpty()
            if (r0 == 0) goto L_0x0099
            iw4 r0 = iw4.a
            return r0
        L_0x0099:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r5 = r54.size()
            r0.<init>(r5)
            java.util.Iterator r5 = r54.iterator()
            r13 = r0
            r6 = r1
            r10 = r5
            r0 = r55
            r1 = r56
            r5 = r57
        L_0x00af:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0491
            java.lang.Object r11 = r10.next()
            java.lang.Number r11 = (java.lang.Number) r11
            long r11 = r11.longValue()
            java.util.Map r15 = r0.a
            r18 = r7
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r11)
            java.lang.Object r7 = r15.get(r7)
            si2 r7 = (defpackage.si2) r7
            java.util.Map r15 = r1.a
            r19 = r8
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r11)
            java.lang.Object r8 = r15.get(r8)
            si2 r8 = (defpackage.si2) r8
            if (r8 == 0) goto L_0x01af
            if (r7 != 0) goto L_0x01af
            boolean r7 = r8.j
            if (r7 == 0) goto L_0x018d
            t97 r7 = r2.e
            java.lang.Object r7 = r7.getValue()
            bv2 r7 = (defpackage.bv2) r7
            r6.o = r2
            r6.X = r0
            r6.Y = r1
            r6.Z = r5
            r6.w0 = r13
            r6.x0 = r10
            r6.y0 = r8
            r6.z0 = r11
            r15 = 1
            r6.C0 = r15
            aw2 r7 = (defpackage.aw2) r7
            java.lang.Object r7 = r7.k(r11, r6)
            if (r7 != r3) goto L_0x0109
            return r3
        L_0x0109:
            r50 = r8
            r8 = r0
            r0 = r7
            r7 = r1
            r1 = r6
            r6 = r5
            r5 = r2
            r2 = r50
        L_0x0113:
            i22 r0 = (defpackage.i22) r0
            r53 = r5
            r54 = r6
            long r5 = r2.l
            if (r0 == 0) goto L_0x012c
            o62 r0 = r0.b
            if (r0 == 0) goto L_0x012c
            f62 r0 = r0.a()
            if (r0 == 0) goto L_0x012c
            r55 = r1
            long r0 = r0.d
            goto L_0x0130
        L_0x012c:
            r55 = r1
            r0 = -1
        L_0x0130:
            int r17 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r56 = r7
            if (r17 <= 0) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r11)
            r57 = r8
            r20 = r10
            r8 = 32255(0x7dff, float:4.5199E-41)
            r10 = 0
            si2 r2 = defpackage.si2.a(r2, r10, r10, r15, r8)
            r13.put(r7, r2)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
            java.lang.String r2 = js.f(r2, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r14)
            r7.append(r11)
            java.lang.String r8 = ". using fcmNotification, needNotify="
            r7.append(r8)
            r7.append(r15)
            java.lang.String r8 = ", fcmLastNotifiedMessageId="
            hr1.s(r7, r8, r5, r4)
            r7.append(r2)
            java.lang.String r2 = " cacheLastNotifiedMessageId="
            r7.append(r2)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            udd.q(r9, r0)
            r2 = r53
            r5 = r54
            r6 = r55
            r1 = r56
            r0 = r57
            r10 = r20
            goto L_0x01a9
        L_0x018d:
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r11)
            r13.put(r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r14)
            r7.append(r11)
            java.lang.String r8 = ". using fcmNotification, no notify needed"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            udd.q(r9, r7)
        L_0x01a9:
            r7 = r18
            r8 = r19
            goto L_0x00af
        L_0x01af:
            if (r7 == 0) goto L_0x02a4
            if (r8 != 0) goto L_0x02a4
            boolean r8 = r7.j
            if (r8 == 0) goto L_0x0276
            r6.o = r2
            r6.X = r0
            r6.Y = r1
            r6.Z = r5
            r6.w0 = r13
            r6.x0 = r10
            r6.y0 = r7
            r6.z0 = r11
            r15 = 2
            r6.C0 = r15
            java.lang.Object r8 = ez3.D(r5, r6)
            if (r8 != r3) goto L_0x01d1
            return r3
        L_0x01d1:
            r50 = r8
            r8 = r0
            r0 = r50
            r51 = r7
            r7 = r1
            r1 = r6
            r6 = r5
            r5 = r2
            r2 = r51
        L_0x01de:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01e4:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x0203
            java.lang.Object r20 = r0.next()
            r15 = r20
            fb5 r15 = (defpackage.fb5) r15
            r54 = r0
            r53 = r1
            long r0 = r15.a
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x01fd
            goto L_0x0207
        L_0x01fd:
            r1 = r53
            r0 = r54
            r15 = 2
            goto L_0x01e4
        L_0x0203:
            r53 = r1
            r20 = 0
        L_0x0207:
            r0 = r20
            fb5 r0 = (defpackage.fb5) r0
            r54 = r5
            r55 = r6
            long r5 = r2.l
            if (r0 == 0) goto L_0x0216
            long r0 = r0.b
            goto L_0x0218
        L_0x0216:
            r0 = -1
        L_0x0218:
            int r15 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r20 = r3
            if (r15 <= 0) goto L_0x0220
            r15 = 1
            goto L_0x0221
        L_0x0220:
            r15 = 0
        L_0x0221:
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r11)
            r57 = r7
            r56 = r10
            r7 = 0
            r10 = 32255(0x7dff, float:4.5199E-41)
            si2 r2 = defpackage.si2.a(r2, r7, r7, r15, r10)
            r13.put(r3, r2)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            java.lang.String r2 = js.f(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r14)
            r3.append(r11)
            java.lang.String r7 = ". using cacheNotification, needNotify="
            r3.append(r7)
            r3.append(r15)
            r15 = r19
            hr1.s(r3, r15, r5, r4)
            r3.append(r2)
            r2 = r18
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            udd.q(r9, r0)
            r6 = r53
            r5 = r55
            r16 = r56
            r1 = r57
            r3 = r2
            r0 = r8
            r2 = r54
            goto L_0x029c
        L_0x0276:
            r20 = r3
            r16 = r10
            r3 = r18
            r15 = r19
            r10 = 32255(0x7dff, float:4.5199E-41)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r11)
            r13.put(r8, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r14)
            r7.append(r11)
            java.lang.String r8 = ". using cacheNotification, no notify needed"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            udd.q(r9, r7)
        L_0x029c:
            r7 = r3
            r8 = r15
            r10 = r16
            r3 = r20
            goto L_0x00af
        L_0x02a4:
            r20 = r3
            r16 = r10
            r3 = r18
            r15 = r19
            r10 = 32255(0x7dff, float:4.5199E-41)
            if (r8 == 0) goto L_0x02b2
            if (r7 != 0) goto L_0x02c4
        L_0x02b2:
            r54 = r0
            r19 = r1
            r55 = r2
            r2 = r3
            r8 = r4
            r56 = r5
            r53 = r6
            r1 = r9
            r5 = r11
            r4 = r14
            r7 = r15
            goto L_0x046a
        L_0x02c4:
            r2.getClass()
            r53 = r11
            long r10 = r7.l
            r12 = r0
            r19 = r1
            long r0 = r8.l
            int r21 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r21 < 0) goto L_0x02d9
            r55 = r2
            boolean r2 = r7.j
            goto L_0x02dd
        L_0x02d9:
            r55 = r2
            boolean r2 = r8.j
        L_0x02dd:
            if (r21 < 0) goto L_0x02e6
            r56 = r5
            int r5 = r7.i
        L_0x02e3:
            r33 = r5
            goto L_0x02eb
        L_0x02e6:
            r56 = r5
            int r5 = r8.i
            goto L_0x02e3
        L_0x02eb:
            java.lang.Long r5 = new java.lang.Long
            r57 = r3
            r43 = r4
            r3 = r53
            r5.<init>(r3)
            r53 = r6
            java.lang.Long r6 = new java.lang.Long
            r44 = r3
            long r3 = r8.a
            r6.<init>(r3)
            long r3 = r6.longValue()
            r22 = 0
            int r3 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r3 == 0) goto L_0x030c
            goto L_0x030d
        L_0x030c:
            r6 = 0
        L_0x030d:
            if (r6 == 0) goto L_0x0314
            long r3 = r6.longValue()
            goto L_0x0316
        L_0x0314:
            long r3 = r7.a
        L_0x0316:
            if (r21 < 0) goto L_0x031d
            java.lang.String r6 = r7.d
        L_0x031a:
            r28 = r6
            goto L_0x0320
        L_0x031d:
            java.lang.String r6 = r8.d
            goto L_0x031a
        L_0x0320:
            java.util.ArrayList r6 = new java.util.ArrayList
            r54 = r12
            java.util.List r12 = r7.f
            r6.<init>(r12)
            r46 = r9
            java.util.List r9 = r8.f
            java.util.Iterator r9 = r9.iterator()
        L_0x0331:
            boolean r24 = r9.hasNext()
            if (r24 == 0) goto L_0x03a5
            java.lang.Object r24 = r9.next()
            r25 = r9
            r9 = r24
            hr8 r9 = (defpackage.hr8) r9
            r47 = r15
            boolean r15 = r12 instanceof java.util.Collection
            if (r15 == 0) goto L_0x0356
            boolean r15 = r12.isEmpty()
            if (r15 == 0) goto L_0x0356
        L_0x034d:
            r49 = r2
            r34 = r3
            r26 = r12
            r48 = r14
            goto L_0x03a1
        L_0x0356:
            java.util.Iterator r15 = r12.iterator()
        L_0x035a:
            boolean r24 = r15.hasNext()
            if (r24 == 0) goto L_0x034d
            java.lang.Object r24 = r15.next()
            r26 = r12
            r12 = r24
            hr8 r12 = (defpackage.hr8) r12
            r48 = r14
            r24 = r15
            long r14 = r12.c
            r49 = r2
            r34 = r3
            long r2 = r9.c
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0396
            long r2 = r12.e
            long r14 = r9.e
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0396
            android.graphics.Bitmap r2 = r9.h
            if (r2 == 0) goto L_0x0389
            r2.recycle()
        L_0x0389:
            r9 = r25
            r12 = r26
            r3 = r34
            r15 = r47
            r14 = r48
            r2 = r49
            goto L_0x0331
        L_0x0396:
            r15 = r24
            r12 = r26
            r3 = r34
            r14 = r48
            r2 = r49
            goto L_0x035a
        L_0x03a1:
            r6.add(r9)
            goto L_0x0389
        L_0x03a5:
            r49 = r2
            r34 = r3
            r48 = r14
            r47 = r15
            zo4 r2 = new zo4
            r3 = 13
            r2.<init>(r3)
            java.util.List r30 = o23.m0(r6, r2)
            android.graphics.Bitmap r2 = r7.h
            android.graphics.Bitmap r3 = r8.h
            if (r21 < 0) goto L_0x03c6
            if (r3 == 0) goto L_0x03c3
            r3.recycle()
        L_0x03c3:
            r32 = r2
            goto L_0x03cd
        L_0x03c6:
            if (r2 == 0) goto L_0x03cb
            r2.recycle()
        L_0x03cb:
            r32 = r3
        L_0x03cd:
            boolean r2 = r7.k
            if (r2 == 0) goto L_0x03d7
            boolean r2 = r8.k
            if (r2 == 0) goto L_0x03d7
            r2 = 1
            goto L_0x03d8
        L_0x03d7:
            r2 = 0
        L_0x03d8:
            long r36 = java.lang.Math.max(r10, r0)
            long r3 = r7.m
            long r14 = r8.m
            long r38 = java.lang.Math.max(r3, r14)
            java.lang.Long r3 = new java.lang.Long
            long r14 = r7.o
            r3.<init>(r14)
            long r14 = r3.longValue()
            int r4 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r4 == 0) goto L_0x03f4
            goto L_0x03f5
        L_0x03f4:
            r3 = 0
        L_0x03f5:
            if (r3 == 0) goto L_0x03fe
            long r3 = r3.longValue()
        L_0x03fb:
            r41 = r3
            goto L_0x0401
        L_0x03fe:
            long r3 = r8.o
            goto L_0x03fb
        L_0x0401:
            java.lang.String r3 = r8.n
            if (r3 != 0) goto L_0x0407
            java.lang.String r3 = r7.n
        L_0x0407:
            r40 = r3
            si2 r3 = new si2
            ti2 r4 = r7.e
            r29 = r4
            java.util.List r4 = r7.g
            r31 = r4
            java.lang.String r4 = r8.b
            r25 = r4
            long r6 = r7.c
            r26 = r6
            r22 = r3
            r23 = r34
            r34 = r49
            r35 = r2
            r22.<init>(r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40, r41)
            r13.put(r5, r3)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r10)
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            java.lang.String r2 = js.f(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r48
            r3.<init>(r4)
            r5 = r44
            r3.append(r5)
            java.lang.String r5 = ". using both, needNotify="
            r3.append(r5)
            r5 = r49
            r3.append(r5)
            r8 = r43
            r7 = r47
            hr1.s(r3, r7, r10, r8)
            r3.append(r2)
            r2 = r57
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = r46
            udd.q(r1, r0)
            r3 = 0
            goto L_0x047c
        L_0x046a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "mergeNotificationsMap: failed, no notification data for chatServerId="
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r3 = 0
            udd.s(r1, r0, r3)
        L_0x047c:
            r6 = r53
            r0 = r54
            r5 = r56
            r9 = r1
            r14 = r4
            r4 = r8
            r10 = r16
            r1 = r19
            r3 = r20
            r8 = r7
            r7 = r2
            r2 = r55
            goto L_0x00af
        L_0x0491:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj2.f(java.util.Set, ui2, ui2, pj5, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(defpackage.ui2 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.dj2
            if (r0 == 0) goto L_0x0013
            r0 = r15
            dj2 r0 = (defpackage.dj2) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            dj2 r0 = new dj2
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            jue r3 = jue.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r5) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.util.Iterator r13 = r0.Y
            ui2 r14 = r0.X
            fj2 r2 = r0.o
            wx3.H(r15)
            goto L_0x0073
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003a:
            ui2 r14 = r0.X
            fj2 r13 = r0.o
            wx3.H(r15)
            goto L_0x006b
        L_0x0042:
            wx3.H(r15)
            java.util.Map r15 = r14.a
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x004e
            return r3
        L_0x004e:
            t97 r15 = r13.e
            java.lang.Object r15 = r15.getValue()
            bv2 r15 = (defpackage.bv2) r15
            java.util.Map r2 = r14.a
            java.util.Set r2 = r2.keySet()
            r0.o = r13
            r0.X = r14
            r0.x0 = r5
            aw2 r15 = (defpackage.aw2) r15
            java.lang.Object r15 = r15.p(r2, r0)
            if (r15 != r1) goto L_0x006b
            return r1
        L_0x006b:
            java.util.List r15 = (java.util.List) r15
            java.util.Iterator r15 = r15.iterator()
            r2 = r13
            r13 = r15
        L_0x0073:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x00cc
            java.lang.Object r15 = r13.next()
            i22 r15 = (defpackage.i22) r15
            java.util.Map r5 = r14.a
            o62 r6 = r15.b
            long r6 = r6.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            java.lang.Object r5 = r5.get(r8)
            si2 r5 = (defpackage.si2) r5
            if (r5 != 0) goto L_0x0093
            goto L_0x0073
        L_0x0093:
            o62 r6 = r15.b
            f62 r6 = r6.a()
            long r6 = r6.d
            long r8 = r5.l
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0073
            t97 r6 = r2.e
            java.lang.Object r6 = r6.getValue()
            bv2 r6 = (defpackage.bv2) r6
            r0.o = r2
            r0.X = r14
            r0.Y = r13
            r0.x0 = r4
            r8 = r6
            aw2 r8 = (defpackage.aw2) r8
            r8.getClass()
            ov2 r6 = new ov2
            long r9 = r15.a
            long r11 = r5.l
            r7 = r6
            r7.<init>(r8, r9, r11)
            java.lang.Object r15 = udd.M(r6, r0)
            if (r15 != r1) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r15 = r3
        L_0x00c9:
            if (r15 != r1) goto L_0x0073
            return r1
        L_0x00cc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj2.g(ui2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7 A[LOOP:1: B:43:0x00f1->B:45:0x00f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0136 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.ui2 r17, pj5 r18, kotlin.coroutines.Continuation r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r19
            boolean r3 = r1 instanceof defpackage.ej2
            if (r3 == 0) goto L_0x0019
            r3 = r1
            ej2 r3 = (defpackage.ej2) r3
            int r4 = r3.C0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.C0 = r4
            r4 = r16
            goto L_0x0020
        L_0x0019:
            ej2 r3 = new ej2
            r4 = r16
            r3.<init>(r4, r1)
        L_0x0020:
            java.lang.Object r1 = r3.A0
            pu3 r5 = pu3.a
            int r6 = r3.C0
            jue r7 = jue.a
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0057
            if (r6 == r9) goto L_0x0043
            if (r6 != r8) goto L_0x003b
            wx3.H(r1)     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            goto L_0x013e
        L_0x0035:
            r0 = move-exception
            goto L_0x0137
        L_0x0038:
            r0 = move-exception
            goto L_0x013f
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            long r11 = r3.z0
            fj2 r0 = r3.y0
            si2 r4 = r3.x0
            java.lang.Object r6 = r3.w0
            java.util.Iterator r13 = r3.Z
            java.util.Collection r14 = r3.Y
            pj5 r15 = r3.X
            fj2 r8 = r3.o
            wx3.H(r1)
            goto L_0x00a3
        L_0x0057:
            wx3.H(r1)
            java.util.Map r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0063
            return r7
        L_0x0063:
            java.util.Map r0 = r0.a
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            r14 = r1
            r0 = r18
        L_0x0076:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00e0
            java.lang.Object r6 = r13.next()
            r1 = r6
            si2 r1 = (defpackage.si2) r1
            long r11 = r1.l
            r3.o = r4
            r3.X = r0
            r3.Y = r14
            r3.Z = r13
            r3.w0 = r6
            r3.x0 = r1
            r3.y0 = r4
            r3.z0 = r11
            r3.C0 = r9
            java.lang.Object r8 = ez3.D(r0, r3)
            if (r8 != r5) goto L_0x009e
            return r5
        L_0x009e:
            r15 = r0
            r0 = r4
            r4 = r1
            r1 = r8
            r8 = r0
        L_0x00a3:
            java.util.List r1 = (java.util.List) r1
            long r9 = r4.c
            r0.getClass()
            java.util.Iterator r0 = r1.iterator()
        L_0x00ae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r1 = r0.next()
            r4 = r1
            fb5 r4 = (defpackage.fb5) r4
            r16 = r3
            long r2 = r4.a
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            r3 = r16
            goto L_0x00ae
        L_0x00c7:
            r16 = r3
            r1 = 0
        L_0x00ca:
            fb5 r1 = (defpackage.fb5) r1
            if (r1 == 0) goto L_0x00d1
            long r0 = r1.b
            goto L_0x00d3
        L_0x00d1:
            r0 = 0
        L_0x00d3:
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00da
            r14.add(r6)
        L_0x00da:
            r3 = r16
            r4 = r8
            r0 = r15
            r9 = 1
            goto L_0x0076
        L_0x00e0:
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = q23.H(r14, r1)
            r0.<init>(r2)
            java.util.Iterator r1 = r14.iterator()
        L_0x00f1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x010a
            java.lang.Object r2 = r1.next()
            si2 r2 = (defpackage.si2) r2
            fb5 r6 = new fb5
            long r8 = r2.c
            long r10 = r2.l
            r6.<init>(r8, r10)
            r0.add(r6)
            goto L_0x00f1
        L_0x010a:
            t97 r1 = r4.c     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            eb5 r1 = (defpackage.eb5) r1     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r2 = 0
            r3.o = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.X = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.Y = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.Z = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.w0 = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.x0 = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.y0 = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r2 = 2
            r3.C0 = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r1.getClass()     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            uh r2 = new uh     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r4 = 10
            r2.<init>(r1, r4, r0)     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            aec r0 = r1.a     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            java.lang.Object r0 = r1g.h(r0, r2, r3)     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            if (r0 != r5) goto L_0x013e
            return r5
        L_0x0137:
            java.lang.String r1 = "fj2"
            java.lang.String r2 = "failed to put notifications history items"
            udd.s(r1, r2, r0)
        L_0x013e:
            return r7
        L_0x013f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj2.h(ui2, pj5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
