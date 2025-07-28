package defpackage;

import java.util.ArrayList;

/* renamed from: wqd  reason: default package */
public final class wqd implements jsd {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ pf8 b;
    public final /* synthetic */ xqd c;

    public wqd(pf8 pf8, xqd xqd) {
        this.b = pf8;
        this.c = xqd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: qf8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x076d  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0793  */
    /* JADX WARNING: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.webrtc.StatsReport[] r33, org.webrtc.StatsReport[] r34, xp0[] r35, java.util.Map r36, defpackage.sl1 r37) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            pf8 r3 = r0.b
            java.lang.Object r3 = r3.i
            ow0 r3 = (defpackage.ow0) r3
            ane r4 = r37.y()
            gx0 r3 = r3.a
            boolean r5 = r3.c1
            r6 = 1
            r5 = r5 ^ r6
            ox3 r7 = r3.n1
            r7.getClass()
            r9 = 0
        L_0x001c:
            int r10 = r2.length
            java.lang.String r12 = "StatsReportHandler"
            if (r9 >= r10) goto L_0x0221
            r10 = r35[r9]
            java.lang.Object r13 = r10.b
            ke1 r13 = (defpackage.ke1) r13
            java.lang.Object r14 = r7.h
            xwb r14 = (defpackage.xwb) r14
            boolean r15 = r10.a
            if (r13 != 0) goto L_0x0050
            if (r15 != 0) goto L_0x0050
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "incorrect mapping skipped "
            r10.<init>(r11)
            r11 = r2[r9]
            java.lang.String r11 = r11.id
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r14.log(r12, r10)
            r20 = r3
            r18 = r4
            r19 = r5
            r29 = r9
            goto L_0x0210
        L_0x0050:
            r13 = r2[r9]
            org.webrtc.StatsReport$Value[] r13 = r13.values
            int r8 = r13.length
            r16 = -9223372036854775808
            r20 = r3
            r18 = r4
            r19 = r5
            r0 = r16
            r2 = r0
            r4 = r2
            r21 = r4
            r23 = r21
            r25 = r23
            r6 = 0
            r11 = 0
        L_0x0069:
            if (r6 >= r8) goto L_0x0113
            r27 = r8
            r8 = r13[r6]
            r28 = r13
            java.lang.String r13 = r8.name
            r29 = r9
            java.lang.String r9 = "bytesSent"
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x0085
            java.lang.String r8 = r8.value     // Catch:{ Exception -> 0x0109 }
            long r2 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x0109 }
            goto L_0x0109
        L_0x0085:
            java.lang.String r9 = r8.name
            java.lang.String r13 = "bytesReceived"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x0097
            java.lang.String r8 = r8.value     // Catch:{ Exception -> 0x0109 }
            long r4 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x0109 }
            goto L_0x0109
        L_0x0097:
            java.lang.String r9 = r8.name
            java.lang.String r13 = "audioOutputLevel"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x00a8
            java.lang.String r8 = r8.value     // Catch:{ Exception -> 0x0109 }
            long r0 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x0109 }
            goto L_0x0109
        L_0x00a8:
            java.lang.String r9 = r8.name
            java.lang.String r13 = "mediaType"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x00b6
            java.lang.String r8 = r8.value
            r11 = r8
            goto L_0x0109
        L_0x00b6:
            java.lang.String r9 = r8.name
            java.lang.String r13 = "ssrc"
            boolean r9 = r13.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x00c1
            goto L_0x0109
        L_0x00c1:
            java.lang.String r9 = r8.name
            java.lang.String r13 = "googCodecName"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x00cc
            goto L_0x0109
        L_0x00cc:
            java.lang.String r9 = r8.name
            java.lang.String r13 = "codecImplementationName"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x00d7
            goto L_0x0109
        L_0x00d7:
            java.lang.String r9 = r8.name
            java.lang.String r13 = "packetsLost"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x00e8
            java.lang.String r8 = r8.value     // Catch:{ Exception -> 0x0109 }
            long r21 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x0109 }
            goto L_0x0109
        L_0x00e8:
            java.lang.String r9 = r8.name
            java.lang.String r13 = "googRtt"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x00f9
            java.lang.String r8 = r8.value     // Catch:{ Exception -> 0x0109 }
            long r25 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x0109 }
            goto L_0x0109
        L_0x00f9:
            java.lang.String r9 = r8.name
            java.lang.String r13 = "packetsSent"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x0109
            java.lang.String r8 = r8.value     // Catch:{ Exception -> 0x0109 }
            long r23 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x0109 }
        L_0x0109:
            int r6 = r6 + 1
            r8 = r27
            r13 = r28
            r9 = r29
            goto L_0x0069
        L_0x0113:
            r29 = r9
            if (r15 == 0) goto L_0x011c
            java.lang.Object r6 = r7.e
            qf8 r6 = (defpackage.qf8) r6
            goto L_0x0135
        L_0x011c:
            java.lang.Object r6 = r7.d
            java.util.Hashtable r6 = (java.util.Hashtable) r6
            java.lang.Object r8 = r10.b
            ke1 r8 = (defpackage.ke1) r8
            java.lang.Object r9 = r6.get(r8)
            qf8 r9 = (defpackage.qf8) r9
            if (r9 != 0) goto L_0x0134
            qf8 r9 = new qf8
            r9.<init>()
            r6.put(r8, r9)
        L_0x0134:
            r6 = r9
        L_0x0135:
            java.lang.Object r8 = r7.f
            fe1 r8 = (defpackage.fe1) r8
            pe0 r8 = r8.A
            ne0 r8 = r8.d
            java.lang.String r9 = "audio"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x01b1
            int r9 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r9 == 0) goto L_0x015b
            j50 r9 = r6.a
            float r10 = r9.c
            float r11 = (float) r0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x015b
            r9.a(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.b = r0
        L_0x015b:
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = "setAudioBytesReceived: "
            java.lang.String r0 = defpackage.us8.i(r4, r0)
            r8.c(r14, r12, r0)
            kg5 r0 = r6.d
            java.lang.Object r0 = r0.b
            ws4 r0 = (ws4) r0
            r0.a(r4)
        L_0x0171:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = "setAudioBytesSent: "
            java.lang.String r0 = defpackage.us8.i(r2, r0)
            r8.c(r14, r12, r0)
            kg5 r0 = r6.c
            java.lang.Object r0 = r0.b
            ws4 r0 = (ws4) r0
            r0.a(r2)
        L_0x0187:
            r0 = r21
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x0198
            java.lang.String r2 = "setAudioPacketsLost: "
            java.lang.String r2 = defpackage.us8.i(r0, r2)
            r8.c(r14, r12, r2)
            r6.f = r0
        L_0x0198:
            r9 = r23
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "setAudioPacketsSent: "
            java.lang.String r0 = defpackage.us8.i(r9, r0)
            r8.c(r14, r12, r0)
            r6.h = r9
        L_0x01a9:
            r6.getClass()
            r0 = r25
            r6.j = r0
            goto L_0x0210
        L_0x01b1:
            r0 = r21
            r9 = r23
            r30 = r25
            java.lang.String r13 = "video"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x0210
            int r11 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x01d5
            java.lang.String r11 = "setVideoBytesReceived: "
            java.lang.String r11 = defpackage.us8.i(r4, r11)
            r8.c(r14, r12, r11)
            kg5 r11 = r6.d
            java.lang.Object r11 = r11.c
            ws4 r11 = (ws4) r11
            r11.a(r4)
        L_0x01d5:
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x01eb
            java.lang.String r4 = "setVideoBytesSent: "
            java.lang.String r4 = defpackage.us8.i(r2, r4)
            r8.c(r14, r12, r4)
            kg5 r4 = r6.c
            java.lang.Object r4 = r4.c
            ws4 r4 = (ws4) r4
            r4.a(r2)
        L_0x01eb:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x01fa
            java.lang.String r2 = "setVideoPacketsLost: "
            java.lang.String r2 = defpackage.us8.i(r0, r2)
            r8.c(r14, r12, r2)
            r6.e = r0
        L_0x01fa:
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0209
            java.lang.String r0 = "setVideoPacketsSent: "
            java.lang.String r0 = defpackage.us8.i(r9, r0)
            r8.c(r14, r12, r0)
            r6.g = r9
        L_0x0209:
            r6.getClass()
            r0 = r30
            r6.i = r0
        L_0x0210:
            int r9 = r29 + 1
            r6 = 1
            r0 = r32
            r1 = r33
            r2 = r34
            r4 = r18
            r5 = r19
            r3 = r20
            goto L_0x001c
        L_0x0221:
            r0 = r3
            r18 = r4
            r19 = r5
            ox3 r1 = r0.n1
            pe1 r2 = r0.t1
            sl1 r3 = r0.x1
            ane r4 = defpackage.ane.c
            boolean r3 = r3.H(r4)
            java.util.List r5 = r0.N1
            java.lang.Object r6 = r1.h
            xwb r6 = (defpackage.xwb) r6
            java.lang.Object r7 = r1.f
            fe1 r7 = (defpackage.fe1) r7
            ane r8 = defpackage.ane.b
            if (r3 == 0) goto L_0x030a
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Object r15 = r1.e
            qf8 r15 = (defpackage.qf8) r15
            r15.getClass()
            long r16 = android.os.SystemClock.elapsedRealtime()
            kg5 r9 = r15.d
            long r9 = r9.a
            kg5 r11 = r15.c
            long r13 = r11.a
            long r9 = java.lang.Math.max(r9, r13)
            long r16 = r16 - r9
            ee1 r7 = r7.b
            long r9 = r7.a
            r13 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x0269
            goto L_0x026b
        L_0x0269:
            r9 = 3000(0xbb8, double:1.482E-320)
        L_0x026b:
            int r7 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0271
            r7 = 1
            goto L_0x0272
        L_0x0271:
            r7 = 0
        L_0x0272:
            boolean r9 = r1.c
            if (r9 == r7) goto L_0x02a5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "audio-mix track isConnected "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r10 = " timeout ms "
            r9.append(r10)
            long r10 = android.os.SystemClock.elapsedRealtime()
            kg5 r13 = r15.d
            long r13 = r13.a
            kg5 r15 = r15.c
            r16 = r4
            r17 = r5
            long r4 = r15.a
            long r4 = java.lang.Math.max(r13, r4)
            long r10 = r10 - r4
            r9.append(r10)
            java.lang.String r4 = r9.toString()
            r6.log(r12, r4)
            goto L_0x02a9
        L_0x02a5:
            r16 = r4
            r17 = r5
        L_0x02a9:
            r1.c = r7
            if (r7 == 0) goto L_0x02ec
            java.util.Collection r1 = r2.i()
            java.util.Iterator r1 = r1.iterator()
        L_0x02b5:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02cd
            java.lang.Object r4 = r1.next()
            ke1 r4 = (defpackage.ke1) r4
            boolean r5 = r4.b()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3.put(r4, r5)
            goto L_0x02b5
        L_0x02cd:
            if (r17 != 0) goto L_0x02d0
            goto L_0x0306
        L_0x02d0:
            java.util.Iterator r1 = r17.iterator()
        L_0x02d4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0306
            java.lang.Object r4 = r1.next()
            ge1 r4 = (defpackage.ge1) r4
            ke1 r4 = r2.j(r4)
            if (r4 == 0) goto L_0x02d4
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.put(r4, r5)
            goto L_0x02d4
        L_0x02ec:
            java.util.Collection r1 = r2.i()
            java.util.Iterator r1 = r1.iterator()
        L_0x02f4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0306
            java.lang.Object r4 = r1.next()
            ke1 r4 = (defpackage.ke1) r4
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.put(r4, r5)
            goto L_0x02f4
        L_0x0306:
            r17 = r2
            goto L_0x03d4
        L_0x030a:
            r16 = r4
            java.lang.Object r3 = r1.d
            java.util.Hashtable r3 = (java.util.Hashtable) r3
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x031d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03d1
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r9 = r5.getKey()
            ke1 r9 = (defpackage.ke1) r9
            java.lang.Object r5 = r5.getValue()
            qf8 r5 = (defpackage.qf8) r5
            boolean r10 = r2.k(r9)
            if (r10 != 0) goto L_0x0349
            java.lang.Object r10 = r1.i
            ke1 r10 = (defpackage.ke1) r10
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x0349
            r3.remove()
            goto L_0x031d
        L_0x0349:
            r5.getClass()
            long r10 = android.os.SystemClock.elapsedRealtime()
            kg5 r13 = r5.d
            long r13 = r13.a
            kg5 r15 = r5.c
            r17 = r2
            r23 = r3
            long r2 = r15.a
            long r2 = java.lang.Math.max(r13, r2)
            long r10 = r10 - r2
            ee1 r2 = r7.b
            long r2 = r2.a
            r13 = 1000(0x3e8, double:4.94E-321)
            int r15 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x036c
            goto L_0x036e
        L_0x036c:
            r2 = 3000(0xbb8, double:1.482E-320)
        L_0x036e:
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0374
            r2 = 1
            goto L_0x0375
        L_0x0374:
            r2 = 0
        L_0x0375:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4.put(r9, r2)
            boolean r2 = r1.b
            if (r2 != 0) goto L_0x038b
            if (r19 == 0) goto L_0x038b
            long r2 = android.os.SystemClock.elapsedRealtime()
            r5.b = r2
            r2 = 1
            r1.b = r2
        L_0x038b:
            if (r19 == 0) goto L_0x03cb
            boolean r2 = r1.a
            if (r2 != 0) goto L_0x03cb
            ee1 r2 = r7.b
            r2.getClass()
            boolean r2 = r9.b()
            if (r2 == 0) goto L_0x03cb
            cc9 r2 = r9.c
            boolean r2 = r2.e
            if (r2 == 0) goto L_0x03cb
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r10 = r5.b
            long r2 = r2 - r10
            ee1 r5 = r7.b
            r5.getClass()
            r10 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x03cb
            r2 = r18
            if (r2 != r8) goto L_0x03bb
            java.lang.String r3 = "DIRECT_VOLUME_TIMEOUT"
            goto L_0x03bd
        L_0x03bb:
            java.lang.String r3 = "SERVER_VOLUME_TIMEOUT"
        L_0x03bd:
            java.lang.String r5 = r9.k
            java.lang.Object r9 = r1.g
            axb r9 = (defpackage.axb) r9
            defpackage.d59.d(r9, r3, r5)
            r3 = 1
            r1.a = r3
            r18 = r2
        L_0x03cb:
            r2 = r17
            r3 = r23
            goto L_0x031d
        L_0x03d1:
            r17 = r2
            r3 = r4
        L_0x03d4:
            java.util.Set r1 = r3.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x03dc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x042e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            ke1 r4 = (defpackage.ke1) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r5 = r4.g
            if (r2 == r5) goto L_0x03dc
            if (r2 == 0) goto L_0x0410
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "CONNECTED: "
            r2.<init>(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r6.log(r12, r2)
            goto L_0x03dc
        L_0x0410:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "DISCONNECTED: "
            r2.<init>(r5)
            r2.append(r4)
            java.lang.String r5 = " isCallAccepted"
            r2.append(r5)
            boolean r4 = r4.b()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r6.log(r12, r2)
            goto L_0x03dc
        L_0x042e:
            r17.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r2 = r3.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x043e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0468
            java.lang.Object r4 = r2.next()
            ke1 r4 = (defpackage.ke1) r4
            java.lang.Object r5 = r3.get(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = r17
            boolean r7 = r6.k(r4)
            if (r7 == 0) goto L_0x0465
            boolean r7 = r4.g
            if (r7 == r5) goto L_0x0465
            r4.g = r5
            r1.add(r4)
        L_0x0465:
            r17 = r6
            goto L_0x043e
        L_0x0468:
            r6 = r17
            w2d r2 = r6.k
            r6.e(r2, r1)
            ox3 r1 = r0.n1
            pe1 r2 = r0.t1
            r1.getClass()
            boolean r3 = r36.isEmpty()
            if (r3 == 0) goto L_0x047d
            goto L_0x04be
        L_0x047d:
            java.util.Set r3 = r36.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0485:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04be
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            loc r5 = (defpackage.loc) r5
            java.lang.Object r4 = r4.getKey()
            ge1 r4 = (defpackage.ge1) r4
            if (r5 == 0) goto L_0x0485
            if (r4 != 0) goto L_0x04a2
            goto L_0x0485
        L_0x04a2:
            ke1 r4 = r2.j(r4)
            if (r4 != 0) goto L_0x04a9
            goto L_0x0485
        L_0x04a9:
            java.lang.Object r5 = r1.d
            java.util.Hashtable r5 = (java.util.Hashtable) r5
            java.lang.Object r6 = r5.get(r4)
            qf8 r6 = (defpackage.qf8) r6
            if (r6 != 0) goto L_0x0485
            qf8 r6 = new qf8
            r6.<init>()
            r5.put(r4, r6)
            goto L_0x0485
        L_0x04be:
            ox3 r1 = r0.n1
            sl1 r2 = r0.x1
            r3 = r16
            boolean r2 = r2.H(r3)
            r4 = 0
            if (r2 == 0) goto L_0x04f0
            java.lang.Object r1 = r1.e
            qf8 r1 = (defpackage.qf8) r1
            r1.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            kg5 r2 = r1.d
            long r9 = r2.a
            kg5 r1 = r1.c
            long r1 = r1.a
            long r1 = java.lang.Math.max(r9, r1)
            int r9 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x04e9
            goto L_0x0559
        L_0x04e9:
            long r6 = r6 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            goto L_0x055f
        L_0x04f0:
            java.lang.Object r2 = r1.d
            java.util.Hashtable r2 = (java.util.Hashtable) r2
            java.util.Set r6 = r2.keySet()
            java.util.Iterator r6 = r6.iterator()
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0501:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0550
            java.lang.Object r7 = r6.next()
            ke1 r7 = (defpackage.ke1) r7
            java.lang.Object r13 = r1.i
            ke1 r13 = (defpackage.ke1) r13
            boolean r13 = r7.equals(r13)
            if (r13 == 0) goto L_0x051b
            r15 = r1
            r36 = r2
            goto L_0x054c
        L_0x051b:
            java.lang.Object r7 = r2.get(r7)
            qf8 r7 = (defpackage.qf8) r7
            r7.getClass()
            long r13 = android.os.SystemClock.elapsedRealtime()
            kg5 r15 = r7.d
            long r9 = r15.a
            kg5 r7 = r7.c
            r15 = r1
            r36 = r2
            long r1 = r7.a
            long r1 = java.lang.Math.max(r9, r1)
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x053d
            r1 = 0
            goto L_0x0542
        L_0x053d:
            long r13 = r13 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
        L_0x0542:
            if (r1 == 0) goto L_0x054c
            long r1 = r1.longValue()
            long r11 = java.lang.Math.min(r1, r11)
        L_0x054c:
            r2 = r36
            r1 = r15
            goto L_0x0501
        L_0x0550:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x055b
        L_0x0559:
            r1 = 0
            goto L_0x055f
        L_0x055b:
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
        L_0x055f:
            if (r1 == 0) goto L_0x056c
            ob1 r2 = r0.a2
            isd r2 = r2.t
            long r6 = r1.longValue()
            r2.onMediaDataReceived(r6)
        L_0x056c:
            boolean r1 = r0.b1
            if (r1 == 0) goto L_0x075b
            ox3 r1 = r0.n1
            pe1 r2 = r0.t1
            ke1 r2 = r2.a
            if (r2 == 0) goto L_0x0584
            java.lang.Object r1 = r1.d
            java.util.Hashtable r1 = (java.util.Hashtable) r1
            java.lang.Object r1 = r1.get(r2)
            r11 = r1
            qf8 r11 = (defpackage.qf8) r11
            goto L_0x0588
        L_0x0584:
            r1.getClass()
            r11 = 0
        L_0x0588:
            if (r11 == 0) goto L_0x075b
            xwb r1 = r0.Z0
            r2 = r33
            zwb r1 = defpackage.zwb.d(r1, r2)
            iw1 r6 = r1.c()
            if (r6 == 0) goto L_0x05a1
            java.lang.String r6 = r6.i
            java.lang.String r7 = "tcp"
            boolean r6 = r6.equals(r7)
            goto L_0x05a2
        L_0x05a1:
            r6 = 0
        L_0x05a2:
            me0 r0 = r0.a1
            long r9 = r1.a
            r0.getClass()
            long r12 = r11.j
            long r14 = r11.i
            long r12 = java.lang.Math.max(r12, r14)
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x05bb
            et4 r1 = r0.b
            double r12 = (double) r12
            r1.a(r12)
        L_0x05bb:
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x05d7
            yq7 r1 = r0.g
            long r14 = r11.f
            long r12 = r11.h
            double r12 = r1.a(r14, r12)
            yq7 r1 = r0.h
            long r14 = r11.e
            long r4 = r11.g
            double r4 = r1.a(r14, r4)
            r7 = r3
            r16 = r9
            goto L_0x061e
        L_0x05d7:
            p7 r1 = r0.e
            long r4 = r11.f
            long r12 = r11.h
            long r14 = r1.b
            long r14 = r4 - r14
            r16 = r9
            long r9 = r1.c
            long r9 = r12 - r9
            r18 = 0
            int r7 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x05f3
            r7 = r3
            double r2 = (double) r14
            long r9 = r9 + r14
            double r9 = (double) r9
            double r2 = r2 / r9
            goto L_0x05f6
        L_0x05f3:
            r7 = r3
            r2 = 0
        L_0x05f6:
            r1.b = r4
            r1.c = r12
            p7 r1 = r0.f
            long r4 = r11.e
            long r9 = r11.g
            long r12 = r1.b
            long r12 = r4 - r12
            long r14 = r1.c
            long r14 = r9 - r14
            r18 = 0
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            r18 = r2
            if (r20 == 0) goto L_0x0615
            double r2 = (double) r12
            long r14 = r14 + r12
            double r12 = (double) r14
            double r2 = r2 / r12
            goto L_0x0617
        L_0x0615:
            r2 = 0
        L_0x0617:
            r1.b = r4
            r1.c = r9
            r4 = r2
            r12 = r18
        L_0x061e:
            double r1 = java.lang.Math.max(r12, r4)
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x062d
            et4 r3 = r0.c
            r3.a(r1)
        L_0x062d:
            r0.a()
            boolean r1 = r0.l
            if (r1 == 0) goto L_0x075b
            if (r6 == 0) goto L_0x064e
            kg5 r1 = r11.c
            java.lang.Object r2 = r1.b
            ws4 r2 = (ws4) r2
            java.lang.Object r2 = r2.b
            ft4 r2 = (defpackage.ft4) r2
            double r2 = r2.d
            java.lang.Object r1 = r1.c
            ws4 r1 = (ws4) r1
            java.lang.Object r1 = r1.b
            ft4 r1 = (defpackage.ft4) r1
            double r4 = r1.d
            double r4 = r4 + r2
            goto L_0x0650
        L_0x064e:
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0650:
            java.util.concurrent.CopyOnWriteArraySet r1 = r0.k
            java.util.Iterator r1 = r1.iterator()
        L_0x0656:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x075b
            java.lang.Object r2 = r1.next()
            le0 r2 = (defpackage.le0) r2
            et4 r3 = r0.b
            double r9 = r3.b
            et4 r3 = r0.c
            double r11 = r3.b
            jyf r2 = (defpackage.jyf) r2
            gx0 r2 = r2.b
            fe1 r3 = r2.y0
            pe0 r3 = r3.A
            oe0 r6 = r3.c
            boolean r6 = r6.a
            ne0 r3 = r3.d
            java.lang.String r13 = "OKRTCCall"
            if (r6 == 0) goto L_0x0734
            boolean r14 = r2.E0
            if (r14 != 0) goto L_0x0734
            sl1 r6 = r2.x1
            boolean r6 = r6.H(r8)
            if (r6 == 0) goto L_0x06f0
            ge1 r6 = r2.q()
            if (r6 == 0) goto L_0x06ed
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x06bb }
            r14.<init>()     // Catch:{ JSONException -> 0x06bb }
            java.lang.String r15 = "type"
            r18 = r0
            java.lang.String r0 = "bad-net"
            org.json.JSONObject r0 = r14.put((java.lang.String) r15, (java.lang.Object) r0)     // Catch:{ JSONException -> 0x06bb }
            java.lang.String r14 = "loss"
            org.json.JSONObject r0 = r0.put((java.lang.String) r14, (double) r11)     // Catch:{ JSONException -> 0x06bb }
            java.lang.String r11 = "rtt"
            org.json.JSONObject r0 = r0.put((java.lang.String) r11, (double) r9)     // Catch:{ JSONException -> 0x06bb }
            boolean r9 = java.lang.Double.isInfinite(r4)     // Catch:{ JSONException -> 0x06bb }
            if (r9 != 0) goto L_0x06bd
            boolean r9 = java.lang.Double.isNaN(r4)     // Catch:{ JSONException -> 0x06bb }
            if (r9 != 0) goto L_0x06bd
            java.lang.String r9 = "bitrate"
            r0.put((java.lang.String) r9, (double) r4)     // Catch:{ JSONException -> 0x06bb }
            goto L_0x06bd
        L_0x06bb:
            r0 = move-exception
            goto L_0x06e7
        L_0x06bd:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x06bb }
            r9.<init>()     // Catch:{ JSONException -> 0x06bb }
            java.lang.String r10 = "sdk"
            org.json.JSONObject r0 = r9.put((java.lang.String) r10, (java.lang.Object) r0)     // Catch:{ JSONException -> 0x06bb }
            x66 r0 = defpackage.x87.l(r6, r0)     // Catch:{ JSONException -> 0x06bb }
            xwb r6 = r2.Z0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "send bad-net message with bitrate: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r3.b(r6, r13, r9)
            mfd r2 = r2.Z
            r2.i(r0)
        L_0x06e4:
            r9 = r16
            goto L_0x0755
        L_0x06e7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x06ed:
            r18 = r0
            goto L_0x06e4
        L_0x06f0:
            r18 = r0
            sl1 r0 = r2.x1
            boolean r0 = r0.H(r7)
            if (r0 == 0) goto L_0x0710
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L_0x0710
            xwb r0 = r2.Z0
            java.lang.String r6 = "send report-network-stat..."
            r3.b(r0, r13, r6)
            sl1 r0 = r2.x1
            long r2 = (long) r4
            r9 = r16
            r0.M(r9, r2)
            goto L_0x0755
        L_0x0710:
            r9 = r16
            xwb r0 = r2.Z0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r11 = "no messages on Call::onConnectionsStats: topology: "
            r6.<init>(r11)
            sl1 r2 = r2.x1
            ane r2 = r2.y()
            r6.append(r2)
            java.lang.String r2 = ", bitrate: "
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            r3.c(r0, r13, r2)
            goto L_0x0755
        L_0x0734:
            r18 = r0
            r9 = r16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r11 = "ignore Call::onConnectionStats: newBadNetVersion && !destroy = "
            r0.<init>(r11)
            r0.append(r6)
            java.lang.String r6 = " && !"
            r0.append(r6)
            boolean r6 = r2.E0
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            xwb r2 = r2.Z0
            r3.b(r2, r13, r0)
        L_0x0755:
            r16 = r9
            r0 = r18
            goto L_0x0656
        L_0x075b:
            r0 = r32
            pf8 r1 = r0.b
            java.lang.Object r1 = r1.f
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0767:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0789
            java.lang.Object r2 = r1.next()
            rxf r2 = (defpackage.rxf) r2
            xqd r3 = r0.c
            long r3 = r3.b
            r2.getClass()
            r5 = 5
            long r3 = r3 % r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0767
            java.util.ArrayList r3 = r0.a
            r3.add(r2)
            goto L_0x0767
        L_0x0789:
            java.util.ArrayList r1 = r0.a
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x07c2
            pf8 r1 = r0.b
            java.lang.Object r1 = r1.h
            xwb r1 = (defpackage.xwb) r1
            r2 = r33
            zwb r1 = defpackage.zwb.d(r1, r2)
            java.util.ArrayList r2 = r0.a
            java.util.Iterator r2 = r2.iterator()
        L_0x07a5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x07bd
            java.lang.Object r3 = r2.next()
            rxf r3 = (defpackage.rxf) r3
            xqd r4 = r0.c
            long r4 = r4.b
            gx0 r3 = r3.a
            sl1 r3 = r3.x1
            r3.N(r1)
            goto L_0x07a5
        L_0x07bd:
            java.util.ArrayList r0 = r0.a
            r0.clear()
        L_0x07c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.a(org.webrtc.StatsReport[], org.webrtc.StatsReport[], xp0[], java.util.Map, sl1):void");
    }
}
