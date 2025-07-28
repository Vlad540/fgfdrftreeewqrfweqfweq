package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: dbe  reason: default package */
public final class dbe extends l5e implements i26 {
    public final /* synthetic */ Map X;
    public final /* synthetic */ ebe Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dbe(yr yrVar, ebe ebe, long j, Continuation continuation) {
        super(2, continuation);
        this.X = yrVar;
        this.Y = ebe;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dbe(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015f, code lost:
        r0 = o0e.H(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025f A[Catch:{ Exception -> 0x02ba }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r28) {
        /*
            r27 = this;
            r1 = r27
            wx3.H(r28)
            java.util.Map r2 = r1.X
            boolean r0 = r2.isEmpty()
            jue r3 = jue.a
            ebe r4 = r1.Y
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r4.i
            java.lang.String r1 = "onMessageReceived: emptyData!"
            udd.U(r0, r1)
            fbe r0 = r4.a()
            r0.e()
            return r3
        L_0x0020:
            t97 r0 = r4.d
            java.lang.Object r0 = r0.getValue()
            f03 r0 = (defpackage.f03) r0
            lqc r0 = (defpackage.lqc) r0
            long r11 = r0.m()
            r7e r5 = r4.j
            java.lang.Object r0 = r5.getValue()
            hb5 r0 = (defpackage.hb5) r0
            java.lang.String r6 = r0.c
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r0 = r0.d
            boolean r0 = hhd.f(r6, r0)
            g15 r6 = r4.a
            java.lang.String r14 = r4.i
            java.lang.String r15 = "suid"
            java.lang.String r9 = "type"
            r7 = 1
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x007f }
            hb5 r0 = (defpackage.hb5) r0     // Catch:{ all -> 0x007f }
            r0.getClass()     // Catch:{ all -> 0x007f }
            p7 r0 = new p7     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "hmc"
            java.lang.Object r5 = ju7.Q(r2, r5)     // Catch:{ all -> 0x007f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x007f }
            long r17 = java.lang.Long.parseLong(r5)     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "mark"
            java.lang.Object r5 = ju7.Q(r2, r5)     // Catch:{ all -> 0x007f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x007f }
            long r19 = java.lang.Long.parseLong(r5)     // Catch:{ all -> 0x007f }
            r21 = 5
            r16 = r0
            r16.<init>((long) r17, (long) r19, (int) r21)     // Catch:{ all -> 0x007f }
            fbe r5 = r4.a()     // Catch:{ all -> 0x007f }
            r5.d(r0)     // Catch:{ all -> 0x007f }
            goto L_0x00a1
        L_0x007f:
            r0 = move-exception
            java.lang.String r5 = "onReadOnOtherDevice: failed"
            udd.s(r14, r5, r0)
            q0a r5 = at7.y0
            if (r5 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r5 = 0
        L_0x008b:
            r5.getClass()
            ru.ok.tamtam.util.HandledException r5 = new ru.ok.tamtam.util.HandledException
            java.lang.String r8 = "failed to parse read on other device notification"
            r5.<init>(r8, r0)
            r4a r6 = (r4a) r6
            r6.c(r5, r7)
            fbe r0 = r4.a()
            r0.e()
        L_0x00a1:
            r17 = r3
            r3 = r9
            goto L_0x024f
        L_0x00a6:
            java.lang.Object r0 = r5.getValue()
            hb5 r0 = (defpackage.hb5) r0
            java.lang.String r8 = r0.a
            boolean r8 = r2.containsKey(r8)
            if (r8 == 0) goto L_0x0120
            java.lang.String r0 = r0.b
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x0120
            long r7 = r1.Z
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x00cd }
            hb5 r0 = (defpackage.hb5) r0     // Catch:{ all -> 0x00cd }
            r10 = r2
            yr r10 = (yr) r10     // Catch:{ all -> 0x00cd }
            cb5 r0 = r0.b(r10)     // Catch:{ all -> 0x00cd }
            r13 = r0
            goto L_0x00e1
        L_0x00cd:
            r0 = move-exception
            java.lang.String r10 = "parseNotification: failed to parse message"
            udd.s(r14, r10, r0)
            ru.ok.tamtam.util.HandledException r10 = new ru.ok.tamtam.util.HandledException
            java.lang.String r13 = "failed to parse notification"
            r10.<init>(r13, r0)
            r4a r6 = (r4a) r6
            r13 = 1
            r6.c(r10, r13)
            r13 = 0
        L_0x00e1:
            q0a r0 = at7.y0
            if (r0 == 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            r0.getClass()
            if (r13 != 0) goto L_0x00f4
            fbe r0 = r4.a()
            r0.e()
            goto L_0x00a1
        L_0x00f4:
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x0109 }
            r5 = r0
            hb5 r5 = (defpackage.hb5) r5     // Catch:{ all -> 0x0109 }
            r6 = r2
            yr r6 = (yr) r6     // Catch:{ all -> 0x0109 }
            r17 = r3
            r3 = r9
            r9 = r11
            oa5 r0 = r5.a(r6, r7, r9)     // Catch:{ all -> 0x0107 }
            goto L_0x0113
        L_0x0107:
            r0 = move-exception
            goto L_0x010d
        L_0x0109:
            r0 = move-exception
            r17 = r3
            r3 = r9
        L_0x010d:
            java.lang.String r5 = "parseNotification: failed to parse analytics data"
            udd.s(r14, r5, r0)
            r0 = 0
        L_0x0113:
            fbe r5 = r4.a()
            hjb r5 = r5.a()
            r5.e(r13, r0)
            goto L_0x024f
        L_0x0120:
            r17 = r3
            r3 = r9
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r5 = "InboundCall"
            boolean r0 = hhd.f(r0, r5)
            if (r0 == 0) goto L_0x01c2
            t97 r0 = r4.g
            java.lang.Object r0 = r0.getValue()
            h0a r0 = (h0a) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x013f
            goto L_0x024f
        L_0x013f:
            java.lang.String r0 = "userName"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x016c }
            r23 = r0
            java.lang.String r23 = (java.lang.String) r23     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "vcId"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x016c }
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "chatId"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x016c }
            r7 = 0
            if (r0 == 0) goto L_0x016e
            java.lang.Long r0 = o0e.H(r0)     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x016e
            long r9 = r0.longValue()     // Catch:{ all -> 0x016c }
            r21 = r9
            goto L_0x0170
        L_0x016c:
            r0 = move-exception
            goto L_0x01a7
        L_0x016e:
            r21 = r7
        L_0x0170:
            java.lang.Object r0 = r2.get(r15)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0182
            java.lang.Long r0 = o0e.H(r0)     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0182
            long r7 = r0.longValue()     // Catch:{ all -> 0x016c }
        L_0x0182:
            r19 = r7
            java.lang.String r0 = "vcp"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x016c }
            r25 = r0
            java.lang.String r25 = (java.lang.String) r25     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "iv"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x016c }
            if (r0 != 0) goto L_0x019a
            java.lang.String r0 = ""
        L_0x019a:
            boolean r26 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x016c }
            fbe r18 = r4.a()     // Catch:{ all -> 0x016c }
            r18.c(r19, r21, r23, r24, r25, r26)     // Catch:{ all -> 0x016c }
            goto L_0x024f
        L_0x01a7:
            java.lang.String r5 = "onCall: failed"
            udd.s(r14, r5, r0)
            ru.ok.tamtam.util.HandledException r5 = new ru.ok.tamtam.util.HandledException
            java.lang.String r7 = "failed to parse call notification"
            r5.<init>(r7, r0)
            r4a r6 = (r4a) r6
            r7 = 1
            r6.c(r5, r7)
            fbe r0 = r4.a()
            r0.e()
            goto L_0x024f
        L_0x01c2:
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r5 = "TamtamSpam"
            boolean r0 = hhd.f(r0, r5)
            if (r0 == 0) goto L_0x0211
            java.lang.String r0 = "uri"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01f6 }
            java.lang.String r5 = "msg"
            java.lang.Object r5 = r2.get(r5)     // Catch:{ all -> 0x01f6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01f6 }
            java.lang.String r7 = "title"
            java.lang.Object r7 = r2.get(r7)     // Catch:{ all -> 0x01f6 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01f6 }
            java.lang.String r8 = "imageUrl"
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x01f6 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01f6 }
            fbe r9 = r4.a()     // Catch:{ all -> 0x01f6 }
            r9.b(r0, r5, r7, r8)     // Catch:{ all -> 0x01f6 }
            goto L_0x024f
        L_0x01f6:
            r0 = move-exception
            java.lang.String r5 = "onDeepLink: failed"
            udd.s(r14, r5, r0)
            ru.ok.tamtam.util.HandledException r5 = new ru.ok.tamtam.util.HandledException
            java.lang.String r7 = "failed to parse deep link notification"
            r5.<init>(r7, r0)
            r4a r6 = (r4a) r6
            r7 = 1
            r6.c(r5, r7)
            fbe r0 = r4.a()
            r0.e()
            goto L_0x024f
        L_0x0211:
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r5 = "LocationRequest"
            boolean r0 = hhd.f(r0, r5)
            if (r0 == 0) goto L_0x0243
            fbe r0 = r4.a()
            hjb r5 = r0.a()
            t97 r6 = r5.a
            java.lang.Object r6 = r6.getValue()
            ad3 r6 = (defpackage.ad3) r6
            boolean r6 = r6.c()
            r7 = 1
            r6 = r6 ^ r7
            r7 = 0
            r5.f(r7, r6)
            t97 r0 = r0.e
            java.lang.Object r0 = r0.getValue()
            di7 r0 = (defpackage.di7) r0
            r0.getClass()
            goto L_0x024f
        L_0x0243:
            java.lang.String r0 = "unknown push"
            udd.U(r14, r0)
            fbe r0 = r4.a()
            r0.e()
        L_0x024f:
            long r0 = r1.Z
            java.lang.String r5 = "eKey"
            java.lang.String r6 = "ttime"
            java.lang.String r7 = "trid"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x02ba }
            if (r3 == 0) goto L_0x02da
            int r8 = r3.length()     // Catch:{ Exception -> 0x02ba }
            if (r8 != 0) goto L_0x0267
            goto L_0x02da
        L_0x0267:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x02ba }
            r8.<init>()     // Catch:{ Exception -> 0x02ba }
            java.lang.Object r9 = r2.get(r7)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x02ba }
            if (r9 == 0) goto L_0x02da
            java.lang.Long r9 = o0e.H(r9)     // Catch:{ Exception -> 0x02ba }
            if (r9 == 0) goto L_0x02da
            r8.put(r7, r9)     // Catch:{ Exception -> 0x02ba }
            java.lang.Object r7 = r2.get(r6)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x02ba }
            if (r7 == 0) goto L_0x02da
            java.lang.Long r7 = o0e.H(r7)     // Catch:{ Exception -> 0x02ba }
            if (r7 == 0) goto L_0x02da
            long r9 = r7.longValue()     // Catch:{ Exception -> 0x02ba }
            r8.put(r6, r7)     // Catch:{ Exception -> 0x02ba }
            java.lang.Object r6 = r2.get(r5)     // Catch:{ Exception -> 0x02ba }
            r8.put(r5, r6)     // Catch:{ Exception -> 0x02ba }
            long r11 = r11 - r9
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r6 = "dtime"
            r8.put(r6, r5)     // Catch:{ Exception -> 0x02ba }
            long r0 = r0 - r9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r1 = "fcmdtime"
            r8.put(r1, r0)     // Catch:{ Exception -> 0x02ba }
            java.lang.Object r0 = r2.get(r15)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02ba }
            if (r0 == 0) goto L_0x02bc
            java.lang.Long r13 = o0e.H(r0)     // Catch:{ Exception -> 0x02ba }
            goto L_0x02bd
        L_0x02ba:
            r0 = move-exception
            goto L_0x02d5
        L_0x02bc:
            r13 = 0
        L_0x02bd:
            if (r13 == 0) goto L_0x02c2
            r8.put(r15, r13)     // Catch:{ Exception -> 0x02ba }
        L_0x02c2:
            java.lang.String r0 = "p_op"
            java.lang.String r1 = "delivered"
            r8.put(r0, r1)     // Catch:{ Exception -> 0x02ba }
            t97 r0 = r4.c     // Catch:{ Exception -> 0x02ba }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x02ba }
            bd r0 = (defpackage.bd) r0     // Catch:{ Exception -> 0x02ba }
            r0.b(r3, r8)     // Catch:{ Exception -> 0x02ba }
            goto L_0x02da
        L_0x02d5:
            java.lang.String r1 = "logDelivery: failed"
            udd.S(r14, r1, r0)
        L_0x02da:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbe.o(java.lang.Object):java.lang.Object");
    }
}
