package defpackage;

/* renamed from: ld3  reason: default package */
public final class ld3 implements xrd {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ld3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: t7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: t7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: t7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: t7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: t7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v126, resolved type: t7} */
    /* JADX WARNING: type inference failed for: r3v67, types: [s30, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0856, code lost:
        if (hhd.f(r5, r6 != null ? (java.lang.String) r6.o : r2) != false) goto L_0x0866;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0326 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.zwb r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            int r4 = r0.a
            switch(r4) {
                case 0: goto L_0x0872;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r0.b
            gx0 r4 = (defpackage.gx0) r4
            sl1 r4 = r4.x1
            java.util.Map r4 = r4.A()
            java.lang.Object r5 = r0.b
            gx0 r5 = (defpackage.gx0) r5
            rk1 r6 = r5.W1
            cc9 r5 = r5.C1
            boolean r7 = r5.e
            boolean r5 = r5.f
            boolean r8 = r6.k
            java.lang.String r9 = "network_type"
            java.lang.String r10 = "vcid"
            if (r8 != 0) goto L_0x002d
            r13 = r9
            r20 = r10
            r2 = 0
            goto L_0x06de
        L_0x002d:
            ok1 r8 = r6.h
            ew r6 = r6.i
            java.lang.Object r6 = r6.o
            lv3 r6 = (defpackage.lv3) r6
            k2e r12 = r8.h
            java.lang.Long r12 = r12.g()
            if (r12 == 0) goto L_0x06d8
            long r12 = r12.longValue()
            sq7 r14 = defpackage.pk1.a
            long r2 = r14.a
            long r14 = r14.b
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x06ab
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x06ab
            ru.ok.android.externcalls.analytics.events.EventItemsMap r2 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            r2.<init>()
            ea6 r3 = r8.e
            java.lang.Object r3 = r3.b
            ct3 r3 = (defpackage.ct3) r3
            dt3 r3 = (defpackage.dt3) r3
            java.lang.String r3 = r3.a
            r2.set((java.lang.String) r10, (java.lang.String) r3)
            otf r3 = r8.f
            java.lang.Object r14 = r3.a
            android.net.ConnectivityManager r14 = (android.net.ConnectivityManager) r14
            java.lang.Object r3 = r3.b
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r3 = defpackage.d59.b(r14, r3)
            r2.set((java.lang.String) r9, (java.lang.String) r3)
            java.lang.String r3 = java.lang.String.valueOf(r12)
            java.lang.String r12 = "stat_time_delta"
            r2.set((java.lang.String) r12, (java.lang.String) r3)
            iw1 r3 = r29.c()
            if (r3 == 0) goto L_0x056b
            mk9 r14 = r8.d
            r14.getClass()
            mk9.d(r2, r3)
            java.util.List r14 = r1.c
            java.util.ArrayList r3 = gwf.P(r14, r3)
            b0d r3 = gwf.O(r3)
            java.lang.Object r14 = r3.X
            java.util.List r14 = (java.util.List) r14
            pb5 r15 = r8.k
            r16 = -1
            if (r5 != 0) goto L_0x00a4
            r15.d()
        L_0x00a0:
            r13 = r9
            r15 = r10
            goto L_0x0184
        L_0x00a4:
            r15.getClass()
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto L_0x00b1
            r15.d()
            goto L_0x00a0
        L_0x00b1:
            java.lang.Object r5 = r15.Y
            ygd r5 = (ygd) r5
            boolean r5 = r5.g(r14)
            if (r5 == 0) goto L_0x00be
            r15.d()
        L_0x00be:
            java.util.Iterator r5 = r14.iterator()
        L_0x00c2:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x00da
            java.lang.Object r14 = r5.next()
            r11 = r14
            dod r11 = (defpackage.dod) r11
            java.lang.Boolean r11 = r11.k
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            boolean r11 = hhd.f(r11, r12)
            if (r11 == 0) goto L_0x00c2
            goto L_0x00db
        L_0x00da:
            r14 = 0
        L_0x00db:
            dod r14 = (defpackage.dod) r14
            if (r14 != 0) goto L_0x00e3
            r15.d()
            goto L_0x00a0
        L_0x00e3:
            java.math.BigInteger r5 = r14.i
            java.lang.Object r11 = r15.a
            afc r11 = (defpackage.afc) r11
            java.math.BigInteger r12 = r14.h
            java.lang.Integer r5 = r11.w(r12, r5)
            java.lang.String r11 = "video_loss"
            r2.set((java.lang.String) r11, (java.lang.Integer) r5)
            long r11 = r14.l
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x010b
            java.lang.Object r5 = r15.b
            le4 r5 = (defpackage.le4) r5
            long r11 = r5.a(r11)
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            java.lang.String r11 = "nack_received"
            r2.set((java.lang.String) r11, (java.lang.Long) r5)
        L_0x010b:
            long r11 = r14.m
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0122
            java.lang.Object r5 = r15.c
            le4 r5 = (defpackage.le4) r5
            long r11 = r5.a(r11)
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            java.lang.String r11 = "pli_received"
            r2.set((java.lang.String) r11, (java.lang.Long) r5)
        L_0x0122:
            long r11 = r14.n
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0139
            java.lang.Object r5 = r15.o
            le4 r5 = (defpackage.le4) r5
            long r11 = r5.a(r11)
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            java.lang.String r11 = "fir_received"
            r2.set((java.lang.String) r11, (java.lang.Long) r5)
        L_0x0139:
            long r11 = r14.p
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0148
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            java.lang.String r11 = "adaptation_changes"
            r2.set((java.lang.String) r11, (java.lang.Long) r5)
        L_0x0148:
            x1f r5 = r1.b
            if (r5 == 0) goto L_0x00a0
            long r11 = r5.a
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 == 0) goto L_0x015b
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.String r12 = "br_encode"
            r2.set((java.lang.String) r12, (java.lang.Long) r11)
        L_0x015b:
            long r11 = r5.c
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            r14 = 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0171
            r13 = r9
            r15 = r10
            long r9 = (long) r14
            long r11 = r11 / r9
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            java.lang.String r10 = "br_transmit"
            r2.set((java.lang.String) r10, (java.lang.Long) r9)
            goto L_0x0173
        L_0x0171:
            r13 = r9
            r15 = r10
        L_0x0173:
            long r9 = r5.b
            int r5 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0184
            long r11 = (long) r14
            long r9 = r9 / r11
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            java.lang.String r9 = "br_retransmit"
            r2.set((java.lang.String) r9, (java.lang.Long) r5)
        L_0x0184:
            java.lang.Object r5 = r3.c
            java.util.List r5 = (java.util.List) r5
            hi2 r9 = r8.j
            r9.getClass()
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto L_0x0198
            r9.c()
            goto L_0x03df
        L_0x0198:
            java.lang.Object r10 = r9.j
            ygd r10 = (ygd) r10
            boolean r10 = r10.g(r5)
            if (r10 == 0) goto L_0x01a5
            r9.c()
        L_0x01a5:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r5.iterator()
        L_0x01ae:
            boolean r12 = r11.hasNext()
            java.lang.Object r14 = r9.g
            java.util.HashMap r14 = (java.util.HashMap) r14
            if (r12 == 0) goto L_0x0200
            java.lang.Object r12 = r11.next()
            r20 = r11
            r11 = r12
            cod r11 = (defpackage.cod) r11
            long r0 = r11.p
            r18 = 0
            int r21 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r21 == 0) goto L_0x01cd
            int r21 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r21 != 0) goto L_0x01d4
        L_0x01cd:
            r0 = r28
            r1 = r29
            r11 = r20
            goto L_0x01ae
        L_0x01d4:
            java.lang.String r11 = r11.e
            java.lang.Object r11 = r14.get(r11)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 != 0) goto L_0x01df
            goto L_0x01e7
        L_0x01df:
            long r21 = r11.longValue()
            int r14 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r14 <= 0) goto L_0x01eb
        L_0x01e7:
            r10.add(r12)
            goto L_0x01cd
        L_0x01eb:
            long r11 = r11.longValue()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x01f4
            goto L_0x01cd
        L_0x01f4:
            java.lang.Object r0 = r9.a
            xwb r0 = (defpackage.xwb) r0
            java.lang.String r1 = "IncomingVideoStatistics"
            java.lang.String r11 = "newFramesReceived < oldFramesReceived"
            r0.log(r1, r11)
            goto L_0x01cd
        L_0x0200:
            java.util.Iterator r0 = r5.iterator()
        L_0x0204:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0224
            java.lang.Object r1 = r0.next()
            cod r1 = (defpackage.cod) r1
            long r11 = r1.p
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            java.lang.String r1 = r1.e
            if (r5 != 0) goto L_0x021c
            r14.remove(r1)
            goto L_0x0204
        L_0x021c:
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r14.put(r1, r5)
            goto L_0x0204
        L_0x0224:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x022c
            goto L_0x03df
        L_0x022c:
            txf r0 = defpackage.txf.a
            long r0 = hi2.a(r10, r0)
            java.lang.Object r5 = r9.b
            le4 r5 = (defpackage.le4) r5
            long r0 = r5.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "nack_sent"
            r2.set((java.lang.String) r1, (java.lang.Long) r0)
            wxf r0 = defpackage.wxf.a
            long r0 = hi2.a(r10, r0)
            java.lang.Object r5 = r9.c
            le4 r5 = (defpackage.le4) r5
            long r0 = r5.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "pli_sent"
            r2.set((java.lang.String) r1, (java.lang.Long) r0)
            jxf r0 = defpackage.jxf.a
            long r0 = hi2.a(r10, r0)
            java.lang.Object r5 = r9.d
            le4 r5 = (defpackage.le4) r5
            long r0 = r5.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "fir_sent"
            r2.set((java.lang.String) r1, (java.lang.Long) r0)
            lxf r0 = defpackage.lxf.a
            long r0 = hi2.a(r10, r0)
            java.lang.Object r5 = r9.f
            le4 r5 = (defpackage.le4) r5
            long r0 = r5.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "frames_dropped"
            r2.set((java.lang.String) r1, (java.lang.Long) r0)
            int r0 = defpackage.oxf.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = q23.H(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r10.iterator()
        L_0x0299:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x02b7
            java.lang.Object r5 = r1.next()
            cod r5 = (defpackage.cod) r5
            long r11 = r5.k
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            long r11 = r5.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r0.add(r5)
            goto L_0x0299
        L_0x02b7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x02c0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x02d9
            java.lang.Object r5 = r0.next()
            r11 = r5
            java.lang.Number r11 = (java.lang.Number) r11
            long r11 = r11.longValue()
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x02c0
            r1.add(r5)
            goto L_0x02c0
        L_0x02d9:
            java.util.Iterator r0 = r1.iterator()
            r1 = 0
            r20 = 0
        L_0x02e0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x02fd
            java.lang.Object r5 = r0.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r11 = r5.longValue()
            double r11 = (double) r11
            double r20 = r20 + r11
            r5 = 1
            int r1 = r1 + r5
            if (r1 < 0) goto L_0x02f8
            goto L_0x02e0
        L_0x02f8:
            p23.F()
            r0 = 0
            throw r0
        L_0x02fd:
            if (r1 != 0) goto L_0x0302
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x0307
        L_0x0302:
            double r0 = (double) r1
            double r20 = r20 / r0
            r0 = r20
        L_0x0307:
            boolean r5 = java.lang.Double.isInfinite(r0)
            if (r5 != 0) goto L_0x031d
            boolean r5 = java.lang.Double.isNaN(r0)
            if (r5 != 0) goto L_0x031d
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "jitter_video"
            r2.set((java.lang.String) r1, (java.lang.Long) r0)
        L_0x031d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r10.iterator()
        L_0x0326:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0366
            java.lang.Object r5 = r1.next()
            cod r5 = (defpackage.cod) r5
            long r11 = r5.o
            int r14 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x035f
            r18 = 0
            int r14 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r14 != 0) goto L_0x033f
            goto L_0x035f
        L_0x033f:
            double r11 = (double) r11
            java.lang.Double r14 = r5.t
            if (r14 != 0) goto L_0x0345
            goto L_0x035f
        L_0x0345:
            double r24 = r14.doubleValue()
            java.lang.Double r5 = r5.u
            if (r5 != 0) goto L_0x034e
            goto L_0x035f
        L_0x034e:
            double r26 = r5.doubleValue()
            double r26 = r26 * r26
            double r26 = r26 / r11
            double r24 = r24 - r26
            double r24 = r24 / r11
            java.lang.Double r5 = java.lang.Double.valueOf(r24)
            goto L_0x0360
        L_0x035f:
            r5 = 0
        L_0x0360:
            if (r5 == 0) goto L_0x0326
            r0.add(r5)
            goto L_0x0326
        L_0x0366:
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r11 = 0
        L_0x036d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0389
            java.lang.Object r5 = r0.next()
            java.lang.Number r5 = (java.lang.Number) r5
            double r22 = r5.doubleValue()
            double r11 = r22 + r11
            r5 = 1
            int r1 = r1 + r5
            if (r1 < 0) goto L_0x0384
            goto L_0x036d
        L_0x0384:
            p23.F()
            r0 = 0
            throw r0
        L_0x0389:
            if (r1 != 0) goto L_0x038e
            r11 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x0390
        L_0x038e:
            double r0 = (double) r1
            double r11 = r11 / r0
        L_0x0390:
            boolean r0 = java.lang.Double.isInfinite(r11)
            if (r0 != 0) goto L_0x03ab
            boolean r0 = java.lang.Double.isNaN(r11)
            if (r0 != 0) goto L_0x03ab
            r0 = 1000000(0xf4240, float:1.401298E-39)
            double r0 = (double) r0
            double r11 = r11 * r0
            float r0 = (float) r11
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r1 = "interframe_delay_variance"
            r2.set((java.lang.String) r1, (java.lang.Float) r0)
        L_0x03ab:
            ayf r0 = defpackage.ayf.a
            long r0 = hi2.a(r10, r0)
            java.lang.Object r5 = r9.h
            le4 r5 = (defpackage.le4) r5
            long r0 = r5.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "freeze_count"
            r2.set((java.lang.String) r1, (java.lang.Long) r0)
            dyf r0 = defpackage.dyf.a
            long r0 = hi2.a(r10, r0)
            java.lang.Object r5 = r9.i
            le4 r5 = (defpackage.le4) r5
            long r0 = r5.a(r0)
            r9 = 0
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x03df
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "total_freezes_duration"
            r2.set((java.lang.String) r1, (java.lang.Long) r0)
        L_0x03df:
            java.lang.Object r0 = r3.o
            java.util.List r0 = (java.util.List) r0
            w4g r1 = r8.l
            if (r7 != 0) goto L_0x03f1
            java.lang.Object r0 = r1.o
            afc r0 = (defpackage.afc) r0
            r5 = 0
            r0.a = r5
            r0.b = r5
            goto L_0x0432
        L_0x03f1:
            r5 = 0
            r1.getClass()
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L_0x0404
            java.lang.Object r0 = r1.o
            afc r0 = (defpackage.afc) r0
            r0.a = r5
            r0.b = r5
            goto L_0x0432
        L_0x0404:
            java.lang.Object r7 = r1.c
            ygd r7 = (ygd) r7
            boolean r7 = r7.g(r0)
            if (r7 == 0) goto L_0x0416
            java.lang.Object r7 = r1.o
            afc r7 = (defpackage.afc) r7
            r7.a = r5
            r7.b = r5
        L_0x0416:
            java.lang.Object r0 = o23.X(r0)
            znd r0 = (defpackage.znd) r0
            if (r0 != 0) goto L_0x0420
            r5 = 0
            goto L_0x0432
        L_0x0420:
            java.math.BigInteger r5 = r0.h
            java.lang.Object r1 = r1.b
            afc r1 = (defpackage.afc) r1
            java.math.BigInteger r0 = r0.i
            java.lang.Integer r0 = r1.w(r5, r0)
            ple r1 = new ple
            r1.<init>(r0)
            r5 = r1
        L_0x0432:
            if (r5 == 0) goto L_0x0439
            java.lang.Object r0 = r5.a
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x043a
        L_0x0439:
            r0 = 0
        L_0x043a:
            java.lang.String r1 = "audio_loss"
            r2.set((java.lang.String) r1, (java.lang.Integer) r0)
            java.lang.Object r0 = r3.b
            java.util.List r0 = (java.util.List) r0
            h2d r1 = r8.i
            r1.getClass()
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0457
            r1.b()
            r20 = r15
            r3 = 0
            r15 = r8
            goto L_0x0530
        L_0x0457:
            java.lang.Object r3 = r1.Z
            ygd r3 = (ygd) r3
            boolean r3 = r3.g(r0)
            if (r3 == 0) goto L_0x0464
            r1.b()
        L_0x0464:
            java.lang.Object r0 = o23.V(r0)
            ynd r0 = (defpackage.ynd) r0
            long r9 = r0.m
            java.lang.Object r3 = r1.a
            le4 r3 = (defpackage.le4) r3
            long r9 = r3.a(r9)
            r11 = 0
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x047e
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x0483
        L_0x047e:
            r20 = r15
            r15 = r8
            goto L_0x052f
        L_0x0483:
            s30 r3 = new s30
            r3.<init>()
            r5 = 0
            r3.a = r5
            r3.b = r5
            r3.c = r5
            r3.o = r5
            r3.X = r5
            r3.Y = r5
            java.lang.Object r5 = r1.b
            le4 r5 = (defpackage.le4) r5
            long r11 = r0.n
            long r11 = r5.a(r11)
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r5 == 0) goto L_0x04b0
            float r5 = (float) r11
            float r11 = (float) r9
            float r5 = r5 / r11
            float r11 = (float) r7
            float r5 = r5 * r11
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3.a = r5
        L_0x04b0:
            java.lang.Object r5 = r1.c
            le4 r5 = (defpackage.le4) r5
            long r11 = r0.o
            long r11 = r5.a(r11)
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x04c9
            float r5 = (float) r11
            float r11 = (float) r9
            float r5 = r5 / r11
            float r11 = (float) r7
            float r5 = r5 * r11
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3.b = r5
        L_0x04c9:
            java.lang.Object r5 = r1.o
            le4 r5 = (defpackage.le4) r5
            long r11 = r0.p
            long r11 = r5.a(r11)
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x04e5
            float r14 = (float) r11
            r20 = r15
            float r15 = (float) r9
            float r14 = r14 / r15
            float r15 = (float) r7
            float r14 = r14 * r15
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r3.c = r14
            goto L_0x04e7
        L_0x04e5:
            r20 = r15
        L_0x04e7:
            java.lang.Object r14 = r1.X
            le4 r14 = (defpackage.le4) r14
            r15 = r8
            long r7 = r0.q
            long r7 = r14.a(r7)
            int r14 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x0503
            float r7 = (float) r7
            float r8 = (float) r9
            float r7 = r7 / r8
            r8 = 1000(0x3e8, float:1.401E-42)
            float r8 = (float) r8
            float r7 = r7 * r8
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r3.X = r7
        L_0x0503:
            java.lang.Object r1 = r1.Y
            le4 r1 = (defpackage.le4) r1
            long r7 = r0.r
            long r7 = r1.a(r7)
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto L_0x0522
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0522
            if (r5 == 0) goto L_0x0522
            float r1 = (float) r11
            float r5 = (float) r7
            float r1 = r1 / r5
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3.Y = r1
        L_0x0522:
            long r0 = r0.k
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0530
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.o = r0
            goto L_0x0530
        L_0x052f:
            r3 = 0
        L_0x0530:
            if (r3 != 0) goto L_0x0533
            goto L_0x0569
        L_0x0533:
            java.lang.Object r0 = r3.a
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.String r1 = "inserted_audio_samples_for_deceleration"
            r2.set((java.lang.String) r1, (java.lang.Float) r0)
            java.lang.Object r0 = r3.b
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.String r1 = "removed_audio_samples_for_acceleration"
            r2.set((java.lang.String) r1, (java.lang.Float) r0)
            java.lang.Object r0 = r3.c
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.String r1 = "concealed_audio_samples"
            r2.set((java.lang.String) r1, (java.lang.Float) r0)
            java.lang.Object r0 = r3.o
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.String r1 = "jitter_audio"
            r2.set((java.lang.String) r1, (java.lang.Long) r0)
            java.lang.Object r0 = r3.X
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.String r1 = "concealed_silent_audio_samples"
            r2.set((java.lang.String) r1, (java.lang.Float) r0)
            java.lang.Object r0 = r3.Y
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.String r1 = "concealment_audio_avg_size"
            r2.set((java.lang.String) r1, (java.lang.Float) r0)
        L_0x0569:
            r0 = r15
            goto L_0x056f
        L_0x056b:
            r13 = r9
            r20 = r10
            r0 = r8
        L_0x056f:
            bae r1 = r0.c
            r1.a(r2)
            ydc r1 = r0.m
            if (r4 == 0) goto L_0x05f9
            r1.getClass()
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x0583
            goto L_0x05f9
        L_0x0583:
            java.util.Set r3 = r4.keySet()
            java.lang.Object r5 = r1.o
            java.util.Set r5 = (java.util.Set) r5
            boolean r5 = hhd.f(r5, r3)
            if (r5 != 0) goto L_0x05a0
            java.lang.Object r5 = r1.b
            wwc r5 = (defpackage.wwc) r5
            r7 = 0
            r5.b = r7
            java.lang.Object r5 = r1.c
            wwc r5 = (defpackage.wwc) r5
            r5.b = r7
            r1.o = r3
        L_0x05a0:
            java.util.Collection r3 = r4.values()
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L_0x05a9:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x05bb
            java.lang.Object r7 = r3.next()
            loc r7 = (defpackage.loc) r7
            zz5 r7 = r7.p
            int r7 = r7.a
            int r5 = r5 + r7
            goto L_0x05a9
        L_0x05bb:
            long r7 = (long) r5
            java.util.Collection r3 = r4.values()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x05c6:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x05d8
            java.lang.Object r9 = r3.next()
            loc r9 = (defpackage.loc) r9
            zz5 r9 = r9.p
            long r9 = r9.b
            long r4 = r4 + r9
            goto L_0x05c6
        L_0x05d8:
            f2b r3 = new f2b
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object r8 = r1.b
            wwc r8 = (defpackage.wwc) r8
            java.lang.Long r7 = r8.c0(r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r1 = r1.c
            wwc r1 = (defpackage.wwc) r1
            java.lang.Long r1 = r1.c0(r4)
            r4 = 16
            r5 = 0
            r3.<init>(r7, r1, r5, r4)
            goto L_0x0607
        L_0x05f9:
            java.lang.Object r3 = r1.b
            wwc r3 = (defpackage.wwc) r3
            r4 = 0
            r3.b = r4
            java.lang.Object r1 = r1.c
            wwc r1 = (defpackage.wwc) r1
            r1.b = r4
            r3 = 0
        L_0x0607:
            if (r3 != 0) goto L_0x060a
            goto L_0x0629
        L_0x060a:
            java.lang.Object r1 = r3.b
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.String r4 = "ss_freeze_count"
            r2.set((java.lang.String) r4, (java.lang.Long) r1)
            java.lang.Object r1 = r3.c
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 != 0) goto L_0x061a
            goto L_0x0624
        L_0x061a:
            long r3 = r1.longValue()
            r7 = 0
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0629
        L_0x0624:
            java.lang.String r3 = "ss_total_freezes_duration"
            r2.set((java.lang.String) r3, (java.lang.Long) r1)
        L_0x0629:
            cqc r1 = r0.n
            r1.getClass()
            if (r6 != 0) goto L_0x0631
            goto L_0x0641
        L_0x0631:
            r1 = 100
            float r1 = (float) r1
            float r3 = r6.a
            float r3 = r3 * r1
            long r3 = (long) r3
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "cpu_usage_percent_total"
            r2.set((java.lang.String) r3, (java.lang.Long) r1)
        L_0x0641:
            eje r1 = r0.g
            fje r1 = (defpackage.fje) r1
            java.lang.Long r1 = r1.a()
            if (r1 == 0) goto L_0x06a9
            java.lang.String r3 = "timestamp"
            r2.set((java.lang.String) r3, (java.lang.Long) r1)
            java.util.Map r1 = r2.getItems()
            java.util.Set r1 = r1.keySet()
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0663
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0663
            goto L_0x06a9
        L_0x0663:
            java.util.Iterator r1 = r1.iterator()
        L_0x0667:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x06a9
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Set r4 = defpackage.ok1.o
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0667
            ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent$Builder r1 = new ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent$Builder
            r1.<init>()
            r1.addAll((ru.ok.android.externcalls.analytics.events.EventItemsMap) r2)
            ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent r1 = r1.build()
            java.util.Map r2 = r1.getItems()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "callStat: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "CallStatLog"
            xwb r4 = r0.b
            r4.log(r3, r2)
            otf r0 = r0.a
            java.lang.Object r0 = r0.b
            ru.ok.android.externcalls.analytics.CallAnalyticsSender r0 = (ru.ok.android.externcalls.analytics.CallAnalyticsSender) r0
            r0.send(r1)
        L_0x06a9:
            r2 = 0
            goto L_0x06dc
        L_0x06ab:
            r0 = r8
            r13 = r9
            r20 = r10
            h2d r1 = r0.i
            r1.b()
            hi2 r1 = r0.j
            r1.c()
            w4g r1 = r0.l
            java.lang.Object r1 = r1.o
            afc r1 = (defpackage.afc) r1
            r2 = 0
            r1.a = r2
            r1.b = r2
            pb5 r1 = r0.k
            r1.d()
            ydc r0 = r0.m
            java.lang.Object r1 = r0.b
            wwc r1 = (defpackage.wwc) r1
            r1.b = r2
            java.lang.Object r0 = r0.c
            wwc r0 = (defpackage.wwc) r0
            r0.b = r2
            goto L_0x06dc
        L_0x06d8:
            r13 = r9
            r20 = r10
            goto L_0x06a9
        L_0x06dc:
            r0 = r28
        L_0x06de:
            java.lang.Object r1 = r0.b
            gx0 r1 = (defpackage.gx0) r1
            rk1 r1 = r1.W1
            r1.getClass()
            iw1 r3 = r29.c()
            if (r3 != 0) goto L_0x06ef
            r4 = r2
            goto L_0x0721
        L_0x06ef:
            ru.ok.android.externcalls.analytics.events.EventItemsMap r4 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            r4.<init>()
            mk9 r5 = r1.c
            r5.getClass()
            mk9.d(r4, r3)
            bae r3 = r1.b
            r3.a(r4)
            ea6 r3 = r1.d
            java.lang.Object r3 = r3.b
            ct3 r3 = (defpackage.ct3) r3
            dt3 r3 = (defpackage.dt3) r3
            java.lang.String r3 = r3.a
            r5 = r20
            r4.set((java.lang.String) r5, (java.lang.String) r3)
            otf r3 = r1.e
            java.lang.Object r5 = r3.a
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5
            java.lang.Object r3 = r3.b
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r3 = defpackage.d59.b(r5, r3)
            r4.set((java.lang.String) r13, (java.lang.String) r3)
        L_0x0721:
            if (r4 != 0) goto L_0x0727
            r3 = r29
            goto L_0x0866
        L_0x0727:
            tz0 r3 = r1.l
            r3.i = r4
            x41 r3 = r1.j
            r3.getClass()
            java.util.Map r4 = r4.getItems()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r4)
            java.util.List r4 = defpackage.x41.e
            java.util.Iterator r4 = r4.iterator()
        L_0x073f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x074f
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            r5.remove(r6)
            goto L_0x073f
        L_0x074f:
            ru.ok.android.externcalls.analytics.events.EventItemsMap r4 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            r4.<init>(r5)
            r3.c = r4
            java.util.ArrayList r5 = r3.d
            java.util.Iterator r6 = r5.iterator()
        L_0x075c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x076c
            java.lang.Object r7 = r6.next()
            swf r7 = (defpackage.swf) r7
            r3.b(r7, r4)
            goto L_0x075c
        L_0x076c:
            r5.clear()
            u7 r1 = r1.m
            r1.getClass()
            r3 = r29
            java.util.List r4 = r3.c
            java.util.Iterator r5 = r4.iterator()
        L_0x077c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x079a
            java.lang.Object r6 = r5.next()
            r7 = r6
            eod r7 = (defpackage.eod) r7
            boolean r8 = r7 instanceof defpackage.dod
            if (r8 == 0) goto L_0x077c
            dod r7 = (defpackage.dod) r7
            java.lang.Boolean r7 = r7.k
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r7 = hhd.f(r7, r8)
            if (r7 == 0) goto L_0x077c
            goto L_0x079b
        L_0x079a:
            r6 = r2
        L_0x079b:
            eod r6 = (defpackage.eod) r6
            if (r6 == 0) goto L_0x07a7
            t7 r5 = new t7
            w4g r6 = r6.f
            r5.<init>(r6)
            goto L_0x07a8
        L_0x07a7:
            r5 = r2
        L_0x07a8:
            java.util.Iterator r4 = r4.iterator()
        L_0x07ac:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x07ca
            java.lang.Object r6 = r4.next()
            r7 = r6
            eod r7 = (defpackage.eod) r7
            boolean r8 = r7 instanceof defpackage.znd
            if (r8 == 0) goto L_0x07ac
            znd r7 = (defpackage.znd) r7
            java.lang.Boolean r7 = r7.k
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r7 = hhd.f(r7, r8)
            if (r7 == 0) goto L_0x07ac
            goto L_0x07cb
        L_0x07ca:
            r6 = r2
        L_0x07cb:
            eod r6 = (defpackage.eod) r6
            if (r6 == 0) goto L_0x07d7
            t7 r4 = new t7
            w4g r6 = r6.f
            r4.<init>(r6)
            goto L_0x07d8
        L_0x07d7:
            r4 = r2
        L_0x07d8:
            w7 r6 = r1.b
            boolean r7 = r6.b
            if (r7 != 0) goto L_0x07df
            goto L_0x0825
        L_0x07df:
            java.lang.Object r7 = r6.e
            t7 r7 = (defpackage.t7) r7
            if (r7 == 0) goto L_0x07e8
            java.lang.String r7 = r7.b
            goto L_0x07e9
        L_0x07e8:
            r7 = r2
        L_0x07e9:
            if (r5 == 0) goto L_0x07ee
            java.lang.String r8 = r5.b
            goto L_0x07ef
        L_0x07ee:
            r8 = r2
        L_0x07ef:
            boolean r7 = hhd.f(r7, r8)
            if (r7 == 0) goto L_0x07f6
            goto L_0x0825
        L_0x07f6:
            if (r5 != 0) goto L_0x07fc
            r6.a()
            goto L_0x0825
        L_0x07fc:
            java.lang.Object r7 = r6.c
            eje r7 = (defpackage.eje) r7
            fje r7 = (defpackage.fje) r7
            r7.getClass()
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r9 = r6.e
            t7 r9 = (defpackage.t7) r9
            if (r9 == 0) goto L_0x081e
            long r10 = r6.a
            long r10 = r7 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r11 = r6.d
            i26 r11 = (i26) r11
            r11.invoke(r9, r10)
        L_0x081e:
            r6.a = r7
            r6.e = r5
            r5 = 1
            r6.b = r5
        L_0x0825:
            nu7 r1 = r1.c
            if (r4 == 0) goto L_0x0863
            java.lang.Object r5 = r1.b
            t7 r5 = (defpackage.t7) r5
            if (r5 == 0) goto L_0x0832
            java.lang.String r6 = r5.b
            goto L_0x0833
        L_0x0832:
            r6 = r2
        L_0x0833:
            java.lang.String r7 = r4.b
            boolean r6 = hhd.f(r6, r7)
            if (r6 == 0) goto L_0x0859
            if (r5 == 0) goto L_0x0846
            w4g r5 = r5.a
            if (r5 == 0) goto L_0x0846
            java.lang.Object r5 = r5.o
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0847
        L_0x0846:
            r5 = r2
        L_0x0847:
            w4g r6 = r4.a
            if (r6 == 0) goto L_0x0851
            java.lang.Object r2 = r6.o
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x0852
        L_0x0851:
            r11 = r2
        L_0x0852:
            boolean r2 = hhd.f(r5, r11)
            if (r2 == 0) goto L_0x0859
            goto L_0x0866
        L_0x0859:
            java.lang.Object r2 = r1.a
            u16 r2 = (u16) r2
            r2.invoke(r4)
            r1.b = r4
            goto L_0x0866
        L_0x0863:
            r1.getClass()
        L_0x0866:
            java.lang.Object r0 = r0.b
            gx0 r0 = (defpackage.gx0) r0
            ob1 r0 = r0.a2
            lhc r0 = r0.u
            r0.onRtcStats(r3)
            return
        L_0x0872:
            r3 = r1
            java.util.List r1 = r3.d
            java.util.Iterator r1 = r1.iterator()
        L_0x0879:
            boolean r2 = r1.hasNext()
            java.lang.String r4 = "ConnectionLogger"
            java.lang.Object r5 = r0.b
            xwb r5 = (defpackage.xwb) r5
            if (r2 == 0) goto L_0x08c4
            java.lang.Object r2 = r1.next()
            iw1 r2 = (defpackage.iw1) r2
            boolean r6 = r2.k
            if (r6 == 0) goto L_0x0879
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Active connection: "
            r6.<init>(r7)
            java.lang.String r7 = r2.c
            r6.append(r7)
            java.lang.String r7 = "("
            r6.append(r7)
            java.lang.String r8 = r2.b
            r6.append(r8)
            java.lang.String r8 = ") -> "
            r6.append(r8)
            java.lang.String r8 = r2.f
            r6.append(r8)
            r6.append(r7)
            java.lang.String r2 = r2.e
            r6.append(r2)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.log(r4, r2)
            goto L_0x0879
        L_0x08c4:
            java.util.List r0 = r3.c
            java.util.Iterator r0 = r0.iterator()
        L_0x08ca:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x08de
            java.lang.Object r1 = r0.next()
            eod r1 = (defpackage.eod) r1
            java.lang.String r1 = r1.toString()
            r5.log(r4, r1)
            goto L_0x08ca
        L_0x08de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld3.a(zwb):void");
    }
}
