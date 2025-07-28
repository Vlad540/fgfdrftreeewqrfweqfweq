package defpackage;

/* renamed from: pfe  reason: default package */
public final /* synthetic */ class pfe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pfe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0260, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        defpackage.urd.l(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0264, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            r0 = 1021(0x3fd, float:1.431E-42)
            r1 = 1
            r2 = 0
            r3 = 0
            int r4 = r12.a
            switch(r4) {
                case 0: goto L_0x041c;
                case 1: goto L_0x0412;
                case 2: goto L_0x03e3;
                case 3: goto L_0x0221;
                case 4: goto L_0x01ff;
                case 5: goto L_0x01f7;
                case 6: goto L_0x01ef;
                case 7: goto L_0x01e7;
                case 8: goto L_0x01df;
                case 9: goto L_0x01d3;
                case 10: goto L_0x01cb;
                case 11: goto L_0x01c3;
                case 12: goto L_0x019e;
                case 13: goto L_0x0178;
                case 14: goto L_0x011a;
                case 15: goto L_0x00de;
                case 16: goto L_0x00cf;
                case 17: goto L_0x00b9;
                case 18: goto L_0x00a1;
                case 19: goto L_0x008d;
                case 20: goto L_0x0085;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.String r0 = "x"
            java.lang.String r1 = "OKRTCLmsAdapter"
            java.lang.String r2 = "Screen size did change"
            java.lang.Object r12 = r12.b
            lde r12 = (defpackage.lde) r12
            java.lang.Object r12 = r12.b
            j8e r12 = (defpackage.j8e) r12
            java.lang.Object r3 = r12.a
            ml7 r3 = (ml7) r3
            java.lang.Object r4 = r12.o
            jl7 r4 = (jl7) r4
            if (r3 != 0) goto L_0x0023
            goto L_0x0084
        L_0x0023:
            r4.e()     // Catch:{ all -> 0x0037 }
            org.webrtc.Size r3 = r4.B
            android.util.DisplayMetrics r5 = r4.A
            int r6 = r5.widthPixels     // Catch:{ all -> 0x0037 }
            int r7 = r3.width     // Catch:{ all -> 0x0037 }
            if (r6 != r7) goto L_0x0039
            int r6 = r5.heightPixels     // Catch:{ all -> 0x0037 }
            int r7 = r3.height     // Catch:{ all -> 0x0037 }
            if (r6 == r7) goto L_0x007d
            goto L_0x0039
        L_0x0037:
            r0 = move-exception
            goto L_0x0076
        L_0x0039:
            xwb r6 = r4.n     // Catch:{ all -> 0x0037 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r7.<init>(r2)     // Catch:{ all -> 0x0037 }
            int r2 = r3.width     // Catch:{ all -> 0x0037 }
            r7.append(r2)     // Catch:{ all -> 0x0037 }
            r7.append(r0)     // Catch:{ all -> 0x0037 }
            int r2 = r3.height     // Catch:{ all -> 0x0037 }
            r7.append(r2)     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "->"
            r7.append(r2)     // Catch:{ all -> 0x0037 }
            int r2 = r5.widthPixels     // Catch:{ all -> 0x0037 }
            r7.append(r2)     // Catch:{ all -> 0x0037 }
            r7.append(r0)     // Catch:{ all -> 0x0037 }
            int r0 = r5.heightPixels     // Catch:{ all -> 0x0037 }
            r7.append(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0037 }
            r6.log(r1, r0)     // Catch:{ all -> 0x0037 }
            int r0 = r5.widthPixels     // Catch:{ all -> 0x0037 }
            r3.width = r0     // Catch:{ all -> 0x0037 }
            int r2 = r5.heightPixels     // Catch:{ all -> 0x0037 }
            r3.height = r2     // Catch:{ all -> 0x0037 }
            java.lang.Object r3 = r12.a     // Catch:{ all -> 0x0037 }
            ml7 r3 = (ml7) r3     // Catch:{ all -> 0x0037 }
            r3.a(r0, r2)     // Catch:{ all -> 0x0037 }
            goto L_0x007d
        L_0x0076:
            xwb r2 = r4.n
            java.lang.String r3 = "Error on screen share size update"
            r2.reportException(r1, r3, r0)
        L_0x007d:
            java.lang.Object r12 = r12.a
            ml7 r12 = (ml7) r12
            r4.b(r12)
        L_0x0084:
            return
        L_0x0085:
            java.lang.Object r12 = r12.b
            com.my.tracker.obfuscated.f0 r12 = (com.my.tracker.obfuscated.f0) r12
            r12.a()
            return
        L_0x008d:
            java.lang.Object r12 = r12.b
            nxf r12 = (nxf) r12
            r24 r0 = r12.g
            if (r0 != 0) goto L_0x0096
            goto L_0x009d
        L_0x0096:
            r0.a()
            r12.g = r3
            r12.D = r2
        L_0x009d:
            r12.b()
            return
        L_0x00a1:
            java.lang.Object r12 = r12.b
            nwf r12 = (nwf) r12
            r12.getClass()
            bhc r0 = r12.d     // Catch:{ all -> 0x00ae }
            r0.getClass()     // Catch:{ all -> 0x00ae }
            goto L_0x00b8
        L_0x00ae:
            r0 = move-exception
            java.lang.String r1 = "rtc.command.handle.command.onsent"
            xwb r12 = r12.a
            java.lang.String r2 = "ProtocolInfo"
            r12.reportException(r2, r1, r0)
        L_0x00b8:
            return
        L_0x00b9:
            java.lang.Object r12 = r12.b
            etf r12 = (defpackage.etf) r12
            r12.getClass()
            xle r0 = new xle
            r1 = 20
            r0.<init>(r1, r12)
            m7e r12 = r12.d
            xic r12 = (defpackage.xic) r12
            r12.e0(r0)
            return
        L_0x00cf:
            java.lang.Object r12 = r12.b
            ssf r12 = (defpackage.ssf) r12
            android.content.Intent r0 = r12.a
            r0.getAction()
            vde r12 = r12.b
            r12.d(r3)
            return
        L_0x00de:
            java.lang.Object r12 = r12.b
            eef r12 = (eef) r12
            java.lang.String r0 = r12.h
            boolean r1 = r12.k
            if (r1 == 0) goto L_0x00fb
            long r3 = r12.l
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x00f1
            goto L_0x00fb
        L_0x00f1:
            java.lang.String r1 = "recoverTs"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = eef.e(r0, r1, r3)
        L_0x00fb:
            d4b r1 = r12.q
            java.lang.String r3 = "transport.reconnect"
            r1.n(r3)
            java.lang.Object r3 = r12.b
            monitor-enter(r3)
            r12.h = r0     // Catch:{ all -> 0x0117 }
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            java.lang.Object r0 = r12.e
            monitor-enter(r0)
            r12.f = r2     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = "reconnect"
            r12.a(r1)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return
        L_0x0114:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            throw r12
        L_0x0117:
            r12 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            throw r12
        L_0x011a:
            java.lang.Object r12 = r12.b
            rgc r12 = (defpackage.rgc) r12
            java.lang.Object r12 = r12.b
            pd r12 = (pd) r12
            java.lang.Object r0 = r12.c
            s16 r0 = (defpackage.s16) r0
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0133
            goto L_0x0177
        L_0x0133:
            boolean r0 = r12.a
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = "OwnTalkingReporter"
            java.lang.String r2 = "on voice start detected and reported"
            java.lang.Object r3 = r12.b
            xwb r3 = (xwb) r3
            r3.log(r0, r2)
            java.lang.Object r0 = r12.Y
            rgc r0 = (defpackage.rgc) r0
            if (r0 == 0) goto L_0x016c
            java.lang.Object r0 = r0.b
            pe1 r0 = (pe1) r0
            ke1 r2 = r0.a
            boolean r3 = r2.d()
            r2.n = r1
            boolean r2 = r2.d()
            if (r3 == r2) goto L_0x016c
            ke1 r2 = r0.a
            ge1 r3 = r2.a
            if (r3 != 0) goto L_0x0161
            goto L_0x016c
        L_0x0161:
            w2d r3 = r0.c(r3)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0.e(r3, r2)
        L_0x016c:
            r12.a = r1
        L_0x016e:
            jue r0 = defpackage.jue.a
            java.lang.Object r12 = r12.o
            ajb r12 = (defpackage.ajb) r12
            r12.c(r0)
        L_0x0177:
            return
        L_0x0178:
            java.lang.Object r12 = r12.b
            d4b r12 = (defpackage.d4b) r12
            r12.getClass()
            int r1 = defpackage.mze.a
            java.lang.Object r12 = r12.c
            g45 r12 = (defpackage.g45) r12
            m45 r12 = r12.a
            f44 r12 = r12.G0
            oz2 r1 = r12.o
            java.lang.Object r1 = r1.e
            re8 r1 = (defpackage.re8) r1
            fd r1 = r12.M(r1)
            t34 r2 = new t34
            r3 = 25
            r2.<init>((int) r3)
            r12.Q(r1, r0, r2)
            return
        L_0x019e:
            java.lang.Object r12 = r12.b
            v4b r12 = (v4b) r12
            r12.getClass()
            int r1 = defpackage.oze.a
            java.lang.Object r12 = r12.c
            h45 r12 = (defpackage.h45) r12
            n45 r12 = r12.a
            g44 r12 = r12.H0
            yd3 r1 = r12.o
            java.lang.Object r1 = r1.e
            se8 r1 = (defpackage.se8) r1
            gd r1 = r12.e(r1)
            t34 r2 = new t34
            r3 = 5
            r2.<init>((int) r3)
            r12.J(r1, r0, r2)
            return
        L_0x01c3:
            java.lang.Object r12 = r12.b
            j6f r12 = (j6f) r12
            r12.c()
            return
        L_0x01cb:
            java.lang.Object r12 = r12.b
            org.webrtc.VideoFileRenderer r12 = (org.webrtc.VideoFileRenderer) r12
            org.webrtc.VideoFileRenderer.b(r12)
            return
        L_0x01d3:
            java.lang.Object r12 = r12.b
            vj4 r12 = (defpackage.vj4) r12
            java.lang.Object r12 = r12.l
            sn1 r12 = (defpackage.sn1) r12
            r12.b(r3)
            return
        L_0x01df:
            java.lang.Object r12 = r12.b
            h2f r12 = (defpackage.h2f) r12
            r12.q()
            return
        L_0x01e7:
            java.lang.Object r12 = r12.b
            ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl r12 = (ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl) r12
            ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl.a(r12)
            return
        L_0x01ef:
            java.lang.Object r12 = r12.b
            java.lang.String r12 = (java.lang.String) r12
            ru.ok.android.externcalls.analytics.internal.upload.UploadStarter.a(r12)
            return
        L_0x01f7:
            java.lang.Object r12 = r12.b
            android.os.HandlerThread r12 = (android.os.HandlerThread) r12
            r12.quitSafely()
            return
        L_0x01ff:
            java.lang.Object r12 = r12.b
            mma r12 = (mma) r12
            goe r0 = hoe.b
            boolean r1 = r0 instanceof eoe
            if (r1 == 0) goto L_0x0211
            eoe r0 = (eoe) r0
            java.util.LinkedList r0 = r0.a
            r0.add(r12)
            goto L_0x0220
        L_0x0211:
            boolean r1 = r0 instanceof foe
            if (r1 == 0) goto L_0x021d
            foe r0 = (foe) r0
            hw9 r0 = r0.a
            r0.d(r12)
            goto L_0x0220
        L_0x021d:
            java.util.Objects.toString(r0)
        L_0x0220:
            return
        L_0x0221:
            java.lang.Object r12 = r12.b
            java.io.File r12 = (java.io.File) r12
            i3d r0 = nne.e
            if (r0 == 0) goto L_0x022a
            goto L_0x022b
        L_0x022a:
            r0 = r3
        L_0x022b:
            r0.b()
            c9e r0 = r0.h
            if (r0 == 0) goto L_0x03e2
            nne r2 = nne.a
            java.util.Map r2 = nne.c()
            x3a r4 = defpackage.r1g.c
            java.lang.Object r2 = r2.get(r4)
            boolean r5 = r2 instanceof tma
            if (r5 == 0) goto L_0x0244
            tma r2 = (tma) r2
        L_0x0244:
            hw4 r2 = defpackage.hw4.a
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0265 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0265 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0265 }
            r7.<init>(r12)     // Catch:{ IOException -> 0x0265 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0265 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0265 }
            lg7 r6 = xhd.d(r5)     // Catch:{ all -> 0x025e }
            defpackage.urd.l(r5, r3)     // Catch:{ IOException -> 0x0265 }
            r2 = r6
            goto L_0x0268
        L_0x025e:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0260 }
        L_0x0260:
            r7 = move-exception
            defpackage.urd.l(r5, r6)     // Catch:{ IOException -> 0x0265 }
            throw r7     // Catch:{ IOException -> 0x0265 }
        L_0x0265:
            java.util.Objects.toString(r12)
        L_0x0268:
            r12.delete()
            boolean r12 = xhd.h(r4)
            if (r12 == 0) goto L_0x0273
            goto L_0x03e2
        L_0x0273:
            boolean r12 = r2.isEmpty()
            if (r12 == 0) goto L_0x027b
            goto L_0x03e2
        L_0x027b:
            r2.size()
            nne r12 = nne.a
            java.lang.String r12 = nne.a()
            if (r12 != 0) goto L_0x0288
            goto L_0x03e2
        L_0x0288:
            org.json.JSONObject r0 = defpackage.xs7.S(r0)
            long r4 = r1b.a
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()
            long r6 = r6 + r4
            long r4 = r1b.b
            long r6 = r6 - r4
            java.lang.String r4 = "clientTimeUnixNano"
            r0.put(r4, r6)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x02a4:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0367
            java.lang.Object r5 = r2.next()
            mma r5 = (mma) r5
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            long r7 = r5.a
            java.lang.String r9 = "timeUnixNano"
            r6.put(r9, r7)
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.b
            r6.put(r7, r8)
            java.lang.String r7 = "value"
            long r8 = r5.c
            r6.put(r7, r8)
            java.lang.String r7 = "unit"
            java.lang.String r8 = r5.d
            r6.put(r7, r8)
            java.util.Map r5 = r5.e
            boolean r7 = r5.isEmpty()
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x0362
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x02e7:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x035d
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.getValue()
            boolean r10 = r8 instanceof java.lang.String
            if (r10 == 0) goto L_0x0305
            r7.put(r9, r8)
            goto L_0x02e7
        L_0x0305:
            boolean r10 = r8 instanceof java.lang.Boolean
            if (r10 == 0) goto L_0x0313
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r7.put(r9, r8)
            goto L_0x02e7
        L_0x0313:
            boolean r10 = r8 instanceof java.lang.Long
            if (r10 == 0) goto L_0x0321
            java.lang.Number r8 = (java.lang.Number) r8
            long r10 = r8.longValue()
            r7.put(r9, r10)
            goto L_0x02e7
        L_0x0321:
            boolean r10 = r8 instanceof java.lang.Double
            if (r10 == 0) goto L_0x032f
            java.lang.Number r8 = (java.lang.Number) r8
            double r10 = r8.doubleValue()
            r7.put(r9, r10)
            goto L_0x02e7
        L_0x032f:
            boolean r10 = r8 instanceof java.lang.Byte
            if (r10 == 0) goto L_0x0337
            r7.put(r9, r8)
            goto L_0x02e7
        L_0x0337:
            boolean r10 = r8 instanceof java.lang.Short
            if (r10 == 0) goto L_0x033f
            r7.put(r9, r8)
            goto L_0x02e7
        L_0x033f:
            boolean r10 = r8 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x034d
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.put(r9, r8)
            goto L_0x02e7
        L_0x034d:
            boolean r10 = r8 instanceof java.lang.Float
            if (r10 == 0) goto L_0x0355
            r7.put(r9, r8)
            goto L_0x02e7
        L_0x0355:
            java.lang.String r8 = r8.toString()
            r7.put(r9, r8)
            goto L_0x02e7
        L_0x035d:
            java.lang.String r5 = "attributes"
            r6.put(r5, r7)
        L_0x0362:
            r4.put(r6)
            goto L_0x02a4
        L_0x0367:
            java.lang.String r1 = "samples"
            r0.put(r1, r4)
            nne r1 = nne.a
            java.util.Map r1 = nne.c()
            x3a r2 = defpackage.xie.a
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof cu3
            if (r2 == 0) goto L_0x037f
            cu3 r1 = (cu3) r1
            goto L_0x0380
        L_0x037f:
            r1 = r3
        L_0x0380:
            if (r1 != 0) goto L_0x038a
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            defpackage.ju7.W(r1)
        L_0x038a:
            java.lang.String r1 = "https://sdk-api.apptracer.ru"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r2 = "api/perf/upload"
            android.net.Uri$Builder r1 = r1.appendEncodedPath(r2)
            java.lang.String r2 = "crashToken"
            android.net.Uri$Builder r12 = r1.appendQueryParameter(r2, r12)
            java.lang.String r12 = r12.toString()
            jg8 r1 = new jg8
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "application/json; charset=utf-8"
            be5 r0 = defpackage.mk9.h(r2, r0)
            r1.<init>(r12, r0)
            r7e r12 = nne.h     // Catch:{ Exception -> 0x03e2 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ Exception -> 0x03e2 }
            tm6 r12 = (tm6) r12     // Catch:{ Exception -> 0x03e2 }
            om6 r12 = r12.b(r1)     // Catch:{ Exception -> 0x03e2 }
            java.io.Closeable r0 = r12.o     // Catch:{ all -> 0x03d0 }
            be5 r0 = (defpackage.be5) r0     // Catch:{ all -> 0x03d0 }
            if (r0 == 0) goto L_0x03d2
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x03d0 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x03d0 }
            if (r0 == 0) goto L_0x03d2
            java.lang.String r0 = defpackage.p0e.L(r0)     // Catch:{ all -> 0x03d0 }
            goto L_0x03d3
        L_0x03d0:
            r0 = move-exception
            goto L_0x03dc
        L_0x03d2:
            r0 = r3
        L_0x03d3:
            java.lang.String r1 = "PERFORMANCE_METRICS"
            defpackage.qr4.s(r0, r1, r3)     // Catch:{ all -> 0x03d0 }
            defpackage.urd.l(r12, r3)     // Catch:{ Exception -> 0x03e2 }
            goto L_0x03e2
        L_0x03dc:
            throw r0     // Catch:{ all -> 0x03dd }
        L_0x03dd:
            r1 = move-exception
            defpackage.urd.l(r12, r0)     // Catch:{ Exception -> 0x03e2 }
            throw r1     // Catch:{ Exception -> 0x03e2 }
        L_0x03e2:
            return
        L_0x03e3:
            java.lang.Object r12 = r12.b
            tne r12 = (tne) r12
            java.util.concurrent.atomic.AtomicInteger r0 = r12.h
            r1 = 8
            int r0 = r0.getAndSet(r1)
            int r0 = r0 - r1
            zne r12 = r12.a
            fzd r12 = r12.h
            java.lang.Object r12 = r12.b
            r7e r12 = (defpackage.r7e) r12
            java.lang.Object r12 = r12.getValue()
            dp4 r12 = (dp4) r12
            r12.getClass()
            fp4 r1 = new fp4
            java.lang.String r2 = "non_fatal"
            java.lang.String r3 = "max_non_fatals_per_session_reached"
            r1.<init>(r2, r3, r0)
            java.util.List r0 = java.util.Collections.singletonList(r1)
            r12.a(r0)
            return
        L_0x0412:
            java.lang.Object r12 = r12.b
            jme r12 = (jme) r12
            r12.A0 = r3
            r12.a()
            return
        L_0x041c:
            java.lang.Object r12 = r12.b
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            android.widget.EditText r12 = r12.o
            r12.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfe.run():void");
    }

    public /* synthetic */ pfe(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
