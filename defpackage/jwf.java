package defpackage;

/* renamed from: jwf  reason: default package */
public final /* synthetic */ class jwf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jwf(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e1, code lost:
        if (r12 != null) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e3, code lost:
        r12 = r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x0448;
                case 1: goto L_0x043c;
                case 2: goto L_0x03f8;
                case 3: goto L_0x002b;
                case 4: goto L_0x001f;
                case 5: goto L_0x0013;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.b
            com.my.tracker.obfuscated.t r1 = (com.my.tracker.obfuscated.t) r1
            java.lang.Object r0 = r0.c
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.a((java.lang.Boolean) r0)
            return
        L_0x0013:
            java.lang.Object r1 = r0.b
            com.my.tracker.obfuscated.t r1 = (com.my.tracker.obfuscated.t) r1
            java.lang.Object r0 = r0.c
            com.my.tracker.obfuscated.b1 r0 = (com.my.tracker.obfuscated.b1) r0
            r1.b((com.my.tracker.obfuscated.b1) r0)
            return
        L_0x001f:
            java.lang.Object r1 = r0.b
            com.my.tracker.MyTracker$AttributionListener r1 = (com.my.tracker.MyTracker.AttributionListener) r1
            java.lang.Object r0 = r0.c
            com.my.tracker.MyTrackerAttribution r0 = (com.my.tracker.MyTrackerAttribution) r0
            com.my.tracker.obfuscated.i.a((com.my.tracker.MyTracker.AttributionListener) r1, (com.my.tracker.MyTrackerAttribution) r0)
            return
        L_0x002b:
            java.lang.Object r1 = r0.b
            nxf r1 = (nxf) r1
            java.lang.Object r0 = r0.c
            qwf r0 = (qwf) r0
            java.util.concurrent.atomic.AtomicInteger r2 = r1.l
            r2.incrementAndGet()
            lje r2 = r1.u
            r2.a()
            int r2 = r0.b
            long r3 = (long) r2
            long r5 = r1.h
            r7 = 1
            long r7 = r7 + r5
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            java.lang.String r4 = "DecoderWrapper"
            if (r3 == 0) goto L_0x0078
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0078
            if (r2 == 0) goto L_0x0078
            xwb r2 = r1.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "dropping "
            r3.<init>(r5)
            int r0 = r0.b
            r3.append(r0)
            java.lang.String r0 = " due to seq ("
            r3.append(r0)
            long r5 = r1.h
            java.lang.String r0 = ")"
            java.lang.String r0 = wn6.k(r3, r5, r0)
            r2.log(r4, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.n
            r0.incrementAndGet()
            goto L_0x03f7
        L_0x0078:
            byte r2 = r0.a
            r3 = 1
            r2 = r2 & r3
            r5 = 0
            if (r2 == 0) goto L_0x0081
            r2 = r3
            goto L_0x0082
        L_0x0081:
            r2 = r5
        L_0x0082:
            if (r2 == 0) goto L_0x00f6
            ew r2 = r1.A
            java.lang.Object r6 = r2.b
            eje r6 = (eje) r6
            fje r6 = (fje) r6
            r6.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r8 = r2.c
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L_0x00b6
            long r8 = r8.longValue()
            long r8 = r6 - r8
            r10 = 1000(0x3e8, double:4.94E-321)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x00b6
            java.lang.Object r10 = r2.o
            zz5 r10 = (zz5) r10
            zz5 r11 = new zz5
            int r12 = r10.a
            int r12 = r12 + r3
            long r13 = r10.b
            long r13 = r13 + r8
            r11.<init>(r12, r13)
            r2.o = r11
        L_0x00b6:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2.c = r6
            iw9 r2 = r1.f
            if (r2 == 0) goto L_0x00e6
            xwb r2 = r1.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "received start @ seq "
            r6.<init>(r7)
            int r7 = r0.b
            r6.append(r7)
            java.lang.String r7 = " queue: "
            r6.append(r7)
            iw9 r7 = r1.f
            int r7 = r7.c
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.log(r4, r6)
            java.util.concurrent.atomic.AtomicInteger r2 = r1.n
            r2.incrementAndGet()
        L_0x00e6:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.m
            r2.incrementAndGet()
            r1.b()
            iw9 r2 = new iw9
            r2.<init>(r1, r0)
            r1.f = r2
            goto L_0x013a
        L_0x00f6:
            iw9 r2 = r1.f
            if (r2 == 0) goto L_0x013a
            boolean r6 = r2.d
            byte r7 = r0.a
            r7 = r7 & 4
            if (r7 == 0) goto L_0x0104
            r7 = r3
            goto L_0x0105
        L_0x0104:
            r7 = r5
        L_0x0105:
            r6 = r6 | r7
            r2.d = r6
        L_0x0108:
            java.nio.ByteBuffer r6 = r0.e
            int r6 = r6.remaining()
            java.lang.Object r7 = r2.f
            nxf r7 = (nxf) r7
            byte[] r7 = r7.c
            int r7 = r7.length
            int r6 = java.lang.Math.min(r6, r7)
            if (r6 != 0) goto L_0x0121
            int r6 = r2.c
            int r6 = r6 + r3
            r2.c = r6
            goto L_0x013a
        L_0x0121:
            java.nio.ByteBuffer r7 = r0.e
            java.lang.Object r8 = r2.f
            nxf r8 = (nxf) r8
            byte[] r8 = r8.c
            r7.get(r8, r5, r6)
            java.lang.Object r7 = r2.e
            java.io.ByteArrayOutputStream r7 = (java.io.ByteArrayOutputStream) r7
            java.lang.Object r8 = r2.f
            nxf r8 = (nxf) r8
            byte[] r8 = r8.c
            r7.write(r8, r5, r6)
            goto L_0x0108
        L_0x013a:
            byte r2 = r0.a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0142
            r2 = r3
            goto L_0x0143
        L_0x0142:
            r2 = r5
        L_0x0143:
            if (r2 == 0) goto L_0x03e3
            java.util.concurrent.atomic.AtomicInteger r2 = r1.o
            r2.incrementAndGet()
            lje r2 = r1.v
            r2.a()
            iw9 r2 = r1.f
            if (r2 != 0) goto L_0x015c
            xwb r2 = r1.a
            java.lang.String r3 = "unexpected: trying to deliver 0 packets as frame"
            r2.log(r4, r3)
            goto L_0x03e0
        L_0x015c:
            int r2 = r2.b
            int r7 = r1.D
            if (r2 != r7) goto L_0x016c
            r24 r7 = r1.g
            if (r7 == 0) goto L_0x016c
            boolean r7 = r7.w0
            if (r7 != 0) goto L_0x016c
            goto L_0x027e
        L_0x016c:
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r9 = r1.i
            r11 = 0
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0182
            long r9 = r7 - r9
            long r11 = nxf.G
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0182
            goto L_0x027e
        L_0x0182:
            r1.i = r7
            int[] r7 = ixf.a
            int r8 = defpackage.hr1.t(r2)
            r7 = r7[r8]
            if (r7 == r3) goto L_0x0191
            java.lang.String r7 = "video/x-vnd.on2.vp8"
            goto L_0x0193
        L_0x0191:
            java.lang.String r7 = "video/x-vnd.on2.vp9"
        L_0x0193:
            android.media.MediaCodecList r8 = new android.media.MediaCodecList
            r8.<init>(r5)
            android.media.MediaCodecInfo[] r8 = r8.getCodecInfos()
            int r9 = r8.length
            r10 = r5
            r11 = 0
            r12 = 0
        L_0x01a0:
            if (r10 >= r9) goto L_0x01fa
            r13 = r8[r10]
            boolean r14 = r13.isEncoder()
            if (r14 == 0) goto L_0x01af
        L_0x01aa:
            r16 = r8
            r17 = r9
            goto L_0x01f1
        L_0x01af:
            java.lang.String[] r14 = r13.getSupportedTypes()
            int r15 = r14.length
            r3 = r5
        L_0x01b5:
            if (r3 >= r15) goto L_0x01aa
            r5 = r14[r3]
            boolean r5 = r5.equalsIgnoreCase(r7)
            if (r5 == 0) goto L_0x01e5
            java.lang.String r5 = r13.getName()
            java.lang.String[] r6 = nxf.F
            r16 = r8
            int r8 = r6.length
            r17 = r9
            r9 = 0
        L_0x01cb:
            if (r9 >= r8) goto L_0x01dd
            r18 = r8
            r8 = r6[r9]
            boolean r8 = r5.startsWith(r8)
            if (r8 == 0) goto L_0x01d8
            goto L_0x01e1
        L_0x01d8:
            int r9 = r9 + 1
            r8 = r18
            goto L_0x01cb
        L_0x01dd:
            if (r11 != 0) goto L_0x01e1
            r11 = r13
            goto L_0x01e9
        L_0x01e1:
            if (r12 != 0) goto L_0x01e9
            r12 = r13
            goto L_0x01e9
        L_0x01e5:
            r16 = r8
            r17 = r9
        L_0x01e9:
            int r3 = r3 + 1
            r8 = r16
            r9 = r17
            r5 = 0
            goto L_0x01b5
        L_0x01f1:
            int r10 = r10 + 1
            r8 = r16
            r9 = r17
            r3 = 1
            r5 = 0
            goto L_0x01a0
        L_0x01fa:
            if (r11 == 0) goto L_0x01fd
            goto L_0x01fe
        L_0x01fd:
            r11 = r12
        L_0x01fe:
            if (r11 != 0) goto L_0x0202
            goto L_0x027e
        L_0x0202:
            android.media.MediaCodecInfo$CodecCapabilities r3 = r11.getCapabilitiesForType(r7)
            if (r3 == 0) goto L_0x0264
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            if (r3 == 0) goto L_0x0264
            xwb r5 = r1.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "selecting "
            r6.<init>(r7)
            java.lang.String r7 = r11.getName()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.log(r4, r6)
            android.util.Range r5 = r3.getSupportedWidths()
            java.lang.Comparable r5 = r5.getUpper()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            android.util.Range r3 = r3.getSupportedHeightsFor(r6)
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x0245
            r3 = 240(0xf0, float:3.36E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0245:
            r1.j = r5
            r1.k = r3
            xwb r6 = r1.a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "supports up to "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = "x"
            r7.append(r5)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r6.log(r4, r3)
        L_0x0264:
            r24 r3 = r1.g
            if (r3 == 0) goto L_0x0271
            r3.a()
            r3 = 0
            r1.g = r3
            r3 = 0
            r1.D = r3
        L_0x0271:
            r1.D = r2
            r24 r3 = new r24
            joc r4 = r1.b
            xwb r5 = r1.a
            r3.<init>(r1, r2, r4, r5)
            r1.g = r3
        L_0x027e:
            r24 r2 = r1.g
            if (r2 != 0) goto L_0x0284
            goto L_0x03e0
        L_0x0284:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.z
            int r2 = r2.get()
            r3 = 4000000(0x3d0900, float:5.605194E-39)
            if (r2 <= r3) goto L_0x02a8
            r24 r2 = r1.g
            r3 = 1
            r2.x0 = r3
            java.util.concurrent.atomic.AtomicInteger r4 = r2.A0
            java.util.concurrent.atomic.AtomicInteger r2 = r2.z0
            int r2 = r2.get()
            r4.set(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = r1.r
            r2.incrementAndGet()
            r1.B = r3
            goto L_0x03e0
        L_0x02a8:
            iw9 r2 = r1.f
            boolean r3 = r2.d
            boolean r4 = r1.B
            if (r4 == 0) goto L_0x02b9
            if (r3 != 0) goto L_0x02b9
            java.util.concurrent.atomic.AtomicInteger r2 = r1.r
            r2.incrementAndGet()
            goto L_0x03e0
        L_0x02b9:
            r4 = 0
            r1.B = r4
            java.lang.Object r2 = r2.e
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2
            byte[] r2 = r2.toByteArray()
            int r4 = r2.length
            java.nio.ByteBuffer r4 = org.webrtc.JniCommon.nativeAllocateByteBuffer(r4)
            int r5 = r2.length
            r4.limit(r5)
            r4.put(r2)
            r4.rewind()
            java.util.concurrent.atomic.AtomicInteger r2 = r1.y
            r2.incrementAndGet()
            java.util.concurrent.atomic.AtomicInteger r2 = r1.z
            int r5 = r4.capacity()
            r2.addAndGet(r5)
            org.webrtc.EncodedImage$Builder r2 = org.webrtc.EncodedImage.builder()
            lc r5 = new lc
            r6 = 12
            r5.<init>(r6)
            org.webrtc.EncodedImage$Builder r2 = r2.setBuffer(r4, r5)
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()
            org.webrtc.EncodedImage$Builder r2 = r2.setCaptureTimeNs(r5)
            java.lang.Integer r5 = r1.j
            int r5 = r5.intValue()
            org.webrtc.EncodedImage$Builder r2 = r2.setEncodedWidth(r5)
            java.lang.Integer r5 = r1.k
            int r5 = r5.intValue()
            org.webrtc.EncodedImage$Builder r2 = r2.setEncodedHeight(r5)
            if (r3 == 0) goto L_0x0311
            org.webrtc.EncodedImage$FrameType r3 = org.webrtc.EncodedImage.FrameType.VideoFrameKey
            goto L_0x0313
        L_0x0311:
            org.webrtc.EncodedImage$FrameType r3 = org.webrtc.EncodedImage.FrameType.VideoFrameDelta
        L_0x0313:
            org.webrtc.EncodedImage$Builder r2 = r2.setFrameType(r3)
            org.webrtc.EncodedImage r2 = r2.createEncodedImage()
            r24 r3 = r1.g
            if (r3 == 0) goto L_0x03c6
            org.webrtc.EncodedImage$FrameType r4 = r2.frameType
            org.webrtc.EncodedImage$FrameType r5 = org.webrtc.EncodedImage.FrameType.VideoFrameKey
            if (r4 != r5) goto L_0x0327
            r4 = 1
            goto L_0x0328
        L_0x0327:
            r4 = 0
        L_0x0328:
            r6 = r4 ^ 1
            boolean r7 = r3.x0
            if (r7 == 0) goto L_0x0351
            if (r6 == 0) goto L_0x0351
            nxf r4 = r3.D0
            java.util.concurrent.atomic.AtomicInteger r4 = r4.r
            r4.incrementAndGet()
            nxf r3 = r3.D0
            java.nio.ByteBuffer r4 = r2.buffer
            java.util.concurrent.atomic.AtomicInteger r6 = r3.y
            r6.decrementAndGet()
            r4.rewind()
            java.util.concurrent.atomic.AtomicInteger r3 = r3.z
            int r6 = r4.capacity()
            int r6 = -r6
            r3.addAndGet(r6)
            org.webrtc.JniCommon.nativeFreeByteBuffer(r4)
            goto L_0x03b1
        L_0x0351:
            java.util.concurrent.atomic.AtomicInteger r7 = r3.y0
            int r7 = r7.get()
            r8 = 30
            if (r7 > r8) goto L_0x0383
            r8 = 25
            if (r7 <= r8) goto L_0x0362
            if (r6 == 0) goto L_0x0362
            goto L_0x0383
        L_0x0362:
            r6 = 0
            r3.x0 = r6
            if (r4 == 0) goto L_0x036c
            java.util.concurrent.atomic.AtomicInteger r4 = r3.z0
            r4.incrementAndGet()
        L_0x036c:
            java.util.concurrent.atomic.AtomicInteger r4 = r3.z0
            int r4 = r4.get()
            java.util.concurrent.atomic.AtomicInteger r6 = r3.y0
            r6.incrementAndGet()
            android.os.Handler r6 = r3.X
            wg1 r7 = new wg1
            r8 = 5
            r7.<init>((java.lang.Object) r3, (java.lang.Object) r2, (int) r4, (int) r8)
            r6.post(r7)
            goto L_0x03b1
        L_0x0383:
            nxf r4 = r3.D0
            java.util.concurrent.atomic.AtomicInteger r4 = r4.r
            r4.incrementAndGet()
            nxf r4 = r3.D0
            java.nio.ByteBuffer r6 = r2.buffer
            java.util.concurrent.atomic.AtomicInteger r7 = r4.y
            r7.decrementAndGet()
            r6.rewind()
            java.util.concurrent.atomic.AtomicInteger r4 = r4.z
            int r7 = r6.capacity()
            int r7 = -r7
            r4.addAndGet(r7)
            org.webrtc.JniCommon.nativeFreeByteBuffer(r6)
            r4 = 1
            r3.x0 = r4
            java.util.concurrent.atomic.AtomicInteger r4 = r3.A0
            java.util.concurrent.atomic.AtomicInteger r3 = r3.z0
            int r3 = r3.get()
            r4.set(r3)
        L_0x03b1:
            org.webrtc.EncodedImage$FrameType r3 = r2.frameType
            if (r3 != r5) goto L_0x03ba
            java.util.concurrent.atomic.AtomicInteger r3 = r1.p
            r3.incrementAndGet()
        L_0x03ba:
            org.webrtc.EncodedImage$FrameType r2 = r2.frameType
            org.webrtc.EncodedImage$FrameType r3 = org.webrtc.EncodedImage.FrameType.VideoFrameDelta
            if (r2 != r3) goto L_0x03e0
            java.util.concurrent.atomic.AtomicInteger r2 = r1.q
            r2.incrementAndGet()
            goto L_0x03e0
        L_0x03c6:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.y
            r2.decrementAndGet()
            r4.rewind()
            java.util.concurrent.atomic.AtomicInteger r2 = r1.z
            int r3 = r4.capacity()
            int r3 = -r3
            r2.addAndGet(r3)
            org.webrtc.JniCommon.nativeFreeByteBuffer(r4)
            java.util.concurrent.atomic.AtomicInteger r2 = r1.r
            r2.incrementAndGet()
        L_0x03e0:
            r1.b()
        L_0x03e3:
            byte r0 = r0.a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x03f7
            r24 r0 = r1.g
            if (r0 != 0) goto L_0x03ee
            goto L_0x03f7
        L_0x03ee:
            r0.a()
            r0 = 0
            r1.g = r0
            r0 = 0
            r1.D = r0
        L_0x03f7:
            return
        L_0x03f8:
            java.lang.Object r1 = r0.c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.b
            r2 = r0
            jj7 r2 = (defpackage.jj7) r2
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x0409:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x043b
            java.lang.Object r0 = r3.next()
            ehc r0 = (ehc) r0
            r0.getClass()     // Catch:{ all -> 0x042e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x042e }
            java.lang.String r5 = "<- [?]: "
            r4.<init>(r5)     // Catch:{ all -> 0x042e }
            r4.append(r1)     // Catch:{ all -> 0x042e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x042e }
            xwb r5 = r0.b     // Catch:{ all -> 0x042e }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x042e }
            r5.log(r0, r4)     // Catch:{ all -> 0x042e }
            goto L_0x0409
        L_0x042e:
            r0 = move-exception
            java.lang.String r4 = "rtc.command.handle.listeners.oncommanderror"
            java.lang.Object r5 = r2.a
            xwb r5 = (xwb) r5
            java.lang.String r6 = "CallsListeners"
            r5.reportException(r6, r4, r0)
            goto L_0x0409
        L_0x043b:
            return
        L_0x043c:
            java.lang.Object r1 = r0.b
            com.my.tracker.obfuscated.a0 r1 = (com.my.tracker.obfuscated.a0) r1
            java.lang.Object r0 = r0.c
            com.android.installreferrer.api.ReferrerDetails r0 = (com.android.installreferrer.api.ReferrerDetails) r0
            r1.b((com.android.installreferrer.api.ReferrerDetails) r0)
            return
        L_0x0448:
            java.lang.Object r1 = r0.b
            com.my.tracker.obfuscated.a r1 = (com.my.tracker.obfuscated.a) r1
            java.lang.Object r0 = r0.c
            android.app.Activity r0 = (android.app.Activity) r0
            r1.a((android.app.Activity) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwf.run():void");
    }
}
