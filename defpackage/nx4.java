package defpackage;

/* renamed from: nx4  reason: default package */
public final /* synthetic */ class nx4 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ nx4(vxe vxe, hb0 hb0, int i, Runnable runnable) {
        this.a = 4;
        this.c = vxe;
        this.o = hb0;
        this.b = i;
        this.X = runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04a0, code lost:
        if (defpackage.xf4.a.j(androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class) != null) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04b1, code lost:
        if (defpackage.xf4.a.j(androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) != null) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0188, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r0.d.a(r1, r2 + 1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a4, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x019a */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05e5  */
    /* JADX WARNING: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r0 = r29
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x061f;
                case 1: goto L_0x01fa;
                case 2: goto L_0x01df;
                case 3: goto L_0x01a8;
                case 4: goto L_0x014d;
                case 5: goto L_0x00f5;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.c
            owf r1 = (owf) r1
            java.lang.Object r1 = r1.b
            dhc r1 = (dhc) r1
            android.os.Handler r2 = r1.h
            android.util.LongSparseArray r3 = r1.l
            java.lang.String r4 = "Unable to cast response to valid type. Response: "
            java.util.concurrent.atomic.AtomicReference r5 = r1.b
            java.lang.Object r5 = r5.get()
            az3 r5 = (az3) r5
            java.util.concurrent.atomic.AtomicBoolean r6 = r1.j
            boolean r6 = r6.get()
            if (r6 != 0) goto L_0x00f4
            java.lang.Object r6 = r0.o
            az3 r6 = (az3) r6
            if (r5 == r6) goto L_0x002d
            goto L_0x00f4
        L_0x002d:
            jj7 r5 = r1.n
            r5.getClass()
            axf r6 = new axf
            java.lang.Object r7 = r0.X
            byte[] r7 = (byte[]) r7
            int r0 = r0.b
            r8 = 0
            r6.<init>(r5, r7, r0, r8)
            java.lang.Object r8 = r5.c
            android.os.Handler r8 = (android.os.Handler) r8
            r8.post(r6)
            ghc r6 = r1.a     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            xw2 r0 = r6.f(r0, r7)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            if (r0 != 0) goto L_0x004f
            goto L_0x00f4
        L_0x004f:
            long r6 = r0.b     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            java.lang.Object r0 = r0.c     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            khc r0 = (khc) r0     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            java.lang.Object r9 = r3.get(r6)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            nwf r9 = (nwf) r9     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            if (r9 != 0) goto L_0x005f
            goto L_0x00f4
        L_0x005f:
            ahc r10 = r9.c
            if (r0 == 0) goto L_0x0083
            ncd r4 = new ncd     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r11 = 15
            r4.<init>(r5, r10, r0, r11)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r8.post(r4)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r5.a(r10)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            zbe r4 = new zbe     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r10 = 28
            r4.<init>(r9, r10, r0)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r2.post(r4)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r3.remove(r6)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            goto L_0x00f4
        L_0x007f:
            r0 = move-exception
            goto L_0x009f
        L_0x0081:
            r0 = move-exception
            goto L_0x00a9
        L_0x0083:
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r10.<init>(r4)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r10.append(r0)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            java.lang.String r0 = r10.toString()     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r9.<init>(r0)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException r0 = new ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            r6 = 0
            r0.<init>(r4, r6, r9)     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
            throw r0     // Catch:{ RtcCommandException -> 0x0081, all -> 0x007f }
        L_0x009f:
            jwf r1 = new jwf
            r2 = 2
            r1.<init>(r5, r2, r0)
            r8.post(r1)
            goto L_0x00f4
        L_0x00a9:
            java.lang.Long r4 = r0.a
            if (r4 != 0) goto L_0x00af
            r6 = 0
            goto L_0x00b9
        L_0x00af:
            long r6 = r4.longValue()
            java.lang.Object r6 = r3.get(r6)
            nwf r6 = (nwf) r6
        L_0x00b9:
            if (r4 == 0) goto L_0x00eb
            if (r6 != 0) goto L_0x00be
            goto L_0x00eb
        L_0x00be:
            ncd r7 = new ncd
            ahc r9 = r6.c
            r10 = 16
            r7.<init>(r5, r9, r0, r10)
            r8.post(r7)
            boolean r7 = r0.b
            if (r7 == 0) goto L_0x00d6
            long r2 = r4.longValue()
            r1.c(r2)
            goto L_0x00f4
        L_0x00d6:
            r5.a(r9)
            zbe r1 = new zbe
            r5 = 29
            r1.<init>(r6, r5, r0)
            r2.post(r1)
            long r0 = r4.longValue()
            r3.remove(r0)
            goto L_0x00f4
        L_0x00eb:
            jwf r1 = new jwf
            r2 = 2
            r1.<init>(r5, r2, r0)
            r8.post(r1)
        L_0x00f4:
            return
        L_0x00f5:
            java.lang.Object r1 = r0.c
            owf r1 = (owf) r1
            java.lang.Object r1 = r1.b
            km4 r1 = (defpackage.km4) r1
            java.lang.Object r2 = r1.w0
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            java.lang.Object r2 = r2.get()
            az3 r2 = (az3) r2
            java.lang.Object r3 = r1.Z
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x014c
            java.lang.Object r3 = r0.o
            az3 r3 = (az3) r3
            if (r2 == r3) goto L_0x0118
            goto L_0x014c
        L_0x0118:
            java.lang.Object r2 = r1.Y
            android.os.Handler r2 = (android.os.Handler) r2
            wg1 r3 = new wg1
            java.lang.Object r4 = r0.X
            byte[] r4 = (byte[]) r4
            int r0 = r0.b
            r5 = 15
            r3.<init>((java.lang.Object) r1, (java.lang.Object) r4, (int) r0, (int) r5)
            r2.post(r3)
            java.lang.Object r3 = r1.b     // Catch:{ all -> 0x0141 }
            duf r3 = (defpackage.duf) r3     // Catch:{ all -> 0x0141 }
            hhc r0 = r3.d(r0, r4)     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x014c
            sbc r3 = new sbc     // Catch:{ all -> 0x0141 }
            r4 = 9
            r3.<init>(r1, r4, r0)     // Catch:{ all -> 0x0141 }
            r2.post(r3)     // Catch:{ all -> 0x0141 }
            goto L_0x014c
        L_0x0141:
            r0 = move-exception
            sbc r3 = new sbc
            r4 = 8
            r3.<init>(r1, r4, r0)
            r2.post(r3)
        L_0x014c:
            return
        L_0x014d:
            java.lang.Object r1 = r0.o
            hb0 r1 = (defpackage.hb0) r1
            int r2 = r0.b
            java.lang.Object r3 = r0.X
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            java.lang.Object r0 = r0.c
            vxe r0 = (defpackage.vxe) r0
            m7e r4 = r0.f
            a15 r5 = r0.c     // Catch:{ SynchronizationException -> 0x019a }
            java.util.Objects.requireNonNull(r5)     // Catch:{ SynchronizationException -> 0x019a }
            xle r6 = new xle     // Catch:{ SynchronizationException -> 0x019a }
            r7 = 4
            r6.<init>(r7, r5)     // Catch:{ SynchronizationException -> 0x019a }
            r5 = r4
            xic r5 = (defpackage.xic) r5     // Catch:{ SynchronizationException -> 0x019a }
            r5.e0(r6)     // Catch:{ SynchronizationException -> 0x019a }
            android.content.Context r5 = r0.a     // Catch:{ SynchronizationException -> 0x019a }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ SynchronizationException -> 0x019a }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ SynchronizationException -> 0x019a }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ SynchronizationException -> 0x019a }
            if (r5 == 0) goto L_0x018a
            boolean r5 = r5.isConnected()     // Catch:{ SynchronizationException -> 0x019a }
            if (r5 == 0) goto L_0x018a
            r0.a(r1, r2)     // Catch:{ SynchronizationException -> 0x019a }
            goto L_0x0196
        L_0x0188:
            r0 = move-exception
            goto L_0x01a4
        L_0x018a:
            ph0 r5 = new ph0     // Catch:{ SynchronizationException -> 0x019a }
            r6 = 15
            r5.<init>(r0, r1, r2, r6)     // Catch:{ SynchronizationException -> 0x019a }
            xic r4 = (defpackage.xic) r4     // Catch:{ SynchronizationException -> 0x019a }
            r4.e0(r5)     // Catch:{ SynchronizationException -> 0x019a }
        L_0x0196:
            r3.run()
            goto L_0x01a3
        L_0x019a:
            i37 r0 = r0.d     // Catch:{ all -> 0x0188 }
            int r2 = r2 + 1
            r4 = 0
            r0.a(r1, r2, r4)     // Catch:{ all -> 0x0188 }
            goto L_0x0196
        L_0x01a3:
            return
        L_0x01a4:
            r3.run()
            throw r0
        L_0x01a8:
            java.lang.Object r1 = r0.c
            jn r1 = (defpackage.jn) r1
            java.lang.Object r1 = r1.o
            md8 r1 = (defpackage.md8) r1
            r2 = -1
            int r3 = r0.b
            java.lang.Object r4 = r0.o
            java.util.List r4 = (java.util.List) r4
            if (r3 != r2) goto L_0x01c1
            cd8 r2 = r1.f
            qza r2 = r2.s
            r2.w0(r4)
            goto L_0x01c8
        L_0x01c1:
            cd8 r2 = r1.f
            qza r2 = r2.s
            r2.d0(r3, r4)
        L_0x01c8:
            cd8 r1 = r1.f
            android.util.SparseBooleanArray r2 = new android.util.SparseBooleanArray
            r2.<init>()
            r3 = 1
            r4 = 20
            r2.append(r4, r3)
            eya r2 = new eya
            java.lang.Object r0 = r0.X
            ic8 r0 = (defpackage.ic8) r0
            r1.p(r0)
            return
        L_0x01df:
            java.lang.Object r1 = r0.c
            ue r1 = (defpackage.ue) r1
            int r2 = r1.a
            int r3 = r0.b
            if (r3 != r2) goto L_0x01f9
            r2 = 0
            java.lang.Object r3 = r0.o
            kc8 r3 = (defpackage.kc8) r3
            boolean r2 = r1.i(r3, r2)
            java.lang.Object r0 = r0.X
            og0 r0 = (defpackage.og0) r0
            r1.j(r3, r0, r2)
        L_0x01f9:
            return
        L_0x01fa:
            java.lang.Object r1 = r0.c
            vx4 r1 = (defpackage.vx4) r1
            java.lang.Object r2 = r0.o
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2
            java.lang.Object r3 = r0.X
            android.media.MediaCodec r3 = (android.media.MediaCodec) r3
            int r0 = r0.b
            boolean r4 = r1.j
            if (r4 == 0) goto L_0x0212
            xx4 r0 = r1.k
            java.lang.String r0 = r0.a
            goto L_0x061e
        L_0x0212:
            xx4 r4 = r1.k
            int r4 = r4.D
            int r4 = defpackage.hr1.t(r4)
            switch(r4) {
                case 0: goto L_0x061e;
                case 1: goto L_0x0231;
                case 2: goto L_0x0231;
                case 3: goto L_0x0231;
                case 4: goto L_0x0231;
                case 5: goto L_0x0231;
                case 6: goto L_0x0231;
                case 7: goto L_0x061e;
                case 8: goto L_0x061e;
                default: goto L_0x021d;
            }
        L_0x021d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            xx4 r1 = r1.k
            int r1 = r1.D
            java.lang.String r1 = me4.r(r1)
            java.lang.String r2 = "Unknown state: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0231:
            xx4 r4 = r1.k
            java.lang.Object r4 = r4.b
            monitor-enter(r4)
            xx4 r5 = r1.k     // Catch:{ all -> 0x061b }
            ix4 r6 = r5.r     // Catch:{ all -> 0x061b }
            java.util.concurrent.Executor r5 = r5.s     // Catch:{ all -> 0x061b }
            monitor-exit(r4)     // Catch:{ all -> 0x061b }
            boolean r4 = r1.c
            r7 = 1
            if (r4 != 0) goto L_0x0255
            r1.c = r7
            java.util.Objects.requireNonNull(r6)     // Catch:{ RejectedExecutionException -> 0x0251 }
            ux4 r4 = new ux4     // Catch:{ RejectedExecutionException -> 0x0251 }
            r8 = 0
            r4.<init>(r6, r8)     // Catch:{ RejectedExecutionException -> 0x0251 }
            r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x0251 }
            goto L_0x0255
        L_0x0251:
            xx4 r4 = r1.k
            java.lang.String r4 = r4.a
        L_0x0255:
            boolean r4 = r1.e
            if (r4 == 0) goto L_0x0260
            xx4 r3 = r1.k
            java.lang.String r3 = r3.a
        L_0x025d:
            r5 = 0
            goto L_0x056b
        L_0x0260:
            int r4 = r2.size
            if (r4 > 0) goto L_0x0269
            xx4 r3 = r1.k
            java.lang.String r3 = r3.a
            goto L_0x025d
        L_0x0269:
            int r4 = r2.flags
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0274
            xx4 r3 = r1.k
            java.lang.String r3 = r3.a
            goto L_0x025d
        L_0x0274:
            kd8 r4 = r1.a
            r9 = 3
            if (r4 == 0) goto L_0x039c
            long r12 = r2.presentationTimeUs
            java.lang.Object r14 = r4.X
            kje r14 = (defpackage.kje) r14
            java.lang.Object r15 = r4.a
            xhd r15 = (xhd) r15
            if (r14 != 0) goto L_0x031a
            java.lang.Object r14 = r4.c
            androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk r14 = (androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk) r14
            java.lang.Object r8 = r4.b
            kje r8 = (defpackage.kje) r8
            if (r14 == 0) goto L_0x0291
            r10 = 0
            goto L_0x02ac
        L_0x0291:
            r15.getClass()
            long r16 = xhd.m()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r10 = android.os.SystemClock.elapsedRealtimeNanos()
            long r10 = r14.toMicros(r10)
            long r10 = r10 - r16
            r16 = 3000000(0x2dc6c0, double:1.482197E-317)
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0318
            r10 = r7
        L_0x02ac:
            r15.getClass()
            long r16 = xhd.m()
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            r20 = r8
            long r7 = android.os.SystemClock.elapsedRealtimeNanos()
            long r7 = r11.toMicros(r7)
            long r7 = r12 - r7
            long r7 = java.lang.Math.abs(r7)
            long r16 = r12 - r16
            long r16 = java.lang.Math.abs(r16)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x02d2
            kje r7 = defpackage.kje.b
            goto L_0x02d4
        L_0x02d2:
            kje r7 = defpackage.kje.a
        L_0x02d4:
            if (r10 == 0) goto L_0x0314
            r8 = r20
            if (r7 == r8) goto L_0x0314
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 31
            if (r8 < r10) goto L_0x02f5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = ", SOC: "
            r10.<init>(r11)
            java.lang.String r11 = android.os.Build.SOC_MODEL
            r10.append(r11)
            java.lang.String r10 = r10.toString()
        L_0x02f2:
            r25 = r10
            goto L_0x02f8
        L_0x02f5:
            java.lang.String r10 = ""
            goto L_0x02f2
        L_0x02f8:
            java.lang.String r21 = android.os.Build.MANUFACTURER
            java.lang.String r22 = android.os.Build.MODEL
            java.lang.String r23 = android.os.Build.HARDWARE
            java.lang.Integer r24 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r4.b
            r26 = r8
            kje r26 = (defpackage.kje) r26
            r27 = r7
            java.lang.Object[] r8 = new java.lang.Object[]{r21, r22, r23, r24, r25, r26, r27}
            java.lang.String r10 = "Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s."
            java.lang.String.format(r10, r8)
            goto L_0x0317
        L_0x0314:
            r7.toString()
        L_0x0317:
            r8 = r7
        L_0x0318:
            r4.X = r8
        L_0x031a:
            java.lang.Object r7 = r4.X
            kje r7 = (defpackage.kje) r7
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x0396
            r8 = 1
            if (r7 != r8) goto L_0x037e
            long r7 = r4.o
            r10 = -1
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0377
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = r5
            r10 = r7
            r7 = 0
            r8 = r6
            r5 = 0
        L_0x033b:
            if (r7 >= r9) goto L_0x036e
            r15.getClass()
            long r20 = xhd.m()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.NANOSECONDS
            r23 = r10
            long r9 = android.os.SystemClock.elapsedRealtimeNanos()
            long r9 = r14.toMicros(r9)
            long r25 = xhd.m()
            long r27 = r25 - r20
            if (r7 == 0) goto L_0x0360
            int r11 = (r27 > r23 ? 1 : (r27 == r23 ? 0 : -1))
            if (r11 >= 0) goto L_0x035d
            goto L_0x0360
        L_0x035d:
            r10 = r23
            goto L_0x036a
        L_0x0360:
            long r20 = r20 + r25
            r5 = 1
            long r20 = r20 >> r5
            long r9 = r9 - r20
            r5 = r9
            r10 = r27
        L_0x036a:
            int r7 = r7 + 1
            r9 = 3
            goto L_0x033b
        L_0x036e:
            r9 = 0
            long r5 = java.lang.Math.max(r9, r5)
            r4.o = r5
            goto L_0x037a
        L_0x0377:
            r16 = r5
            r8 = r6
        L_0x037a:
            long r4 = r4.o
            long r12 = r12 - r4
            goto L_0x0399
        L_0x037e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown timebase: "
            r1.<init>(r2)
            java.lang.Object r2 = r4.X
            kje r2 = (defpackage.kje) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0396:
            r16 = r5
            r8 = r6
        L_0x0399:
            r2.presentationTimeUs = r12
            goto L_0x039f
        L_0x039c:
            r16 = r5
            r8 = r6
        L_0x039f:
            long r4 = r2.presentationTimeUs
            long r6 = r1.f
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x03ad
            xx4 r3 = r1.k
            java.lang.String r3 = r3.a
            goto L_0x025d
        L_0x03ad:
            r1.f = r4
            xx4 r6 = r1.k
            android.util.Range r6 = r6.t
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L_0x03f7
            xx4 r3 = r1.k
            java.lang.String r4 = r3.a
            boolean r4 = r3.v
            if (r4 == 0) goto L_0x025d
            long r4 = r2.presentationTimeUs
            android.util.Range r3 = r3.t
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Long r3 = (java.lang.Long) r3
            long r6 = r3.longValue()
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x025d
            xx4 r3 = r1.k
            java.util.concurrent.ScheduledFuture r3 = r3.x
            if (r3 == 0) goto L_0x03e1
            r4 = 1
            r3.cancel(r4)
        L_0x03e1:
            xx4 r3 = r1.k
            long r4 = r2.presentationTimeUs
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.w = r4
            xx4 r3 = r1.k
            r3.j()
            xx4 r3 = r1.k
            r4 = 0
            r3.v = r4
            goto L_0x025d
        L_0x03f7:
            xx4 r4 = r1.k
            long r5 = r2.presentationTimeUs
        L_0x03fb:
            java.util.ArrayDeque r7 = r4.o
            boolean r9 = r7.isEmpty()
            if (r9 != 0) goto L_0x0439
            java.lang.Object r9 = r7.getFirst()
            android.util.Range r9 = (android.util.Range) r9
            java.lang.Comparable r10 = r9.getUpper()
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0439
            r7.removeFirst()
            long r10 = r4.u
            java.lang.Comparable r7 = r9.getUpper()
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            java.lang.Comparable r7 = r9.getLower()
            java.lang.Long r7 = (java.lang.Long) r7
            long r20 = r7.longValue()
            long r12 = r12 - r20
            long r12 = r12 + r10
            r4.u = r12
            defpackage.e07.I(r12)
            goto L_0x03fb
        L_0x0439:
            xx4 r4 = r1.k
            long r5 = r2.presentationTimeUs
            java.util.ArrayDeque r4 = r4.o
            java.util.Iterator r4 = r4.iterator()
        L_0x0443:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0469
            java.lang.Object r7 = r4.next()
            android.util.Range r7 = (android.util.Range) r7
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            boolean r9 = r7.contains(r9)
            if (r9 == 0) goto L_0x045b
            r4 = 1
            goto L_0x046a
        L_0x045b:
            java.lang.Comparable r7 = r7.getLower()
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0443
        L_0x0469:
            r4 = 0
        L_0x046a:
            boolean r5 = r1.h
            if (r5 != 0) goto L_0x04fd
            if (r4 == 0) goto L_0x04fd
            xx4 r4 = r1.k
            java.lang.String r5 = r4.a
            r5 = 1
            r1.h = r5
            java.lang.Object r6 = r4.b
            monitor-enter(r6)
            xx4 r4 = r1.k     // Catch:{ all -> 0x04fa }
            java.util.concurrent.Executor r5 = r4.s     // Catch:{ all -> 0x04fa }
            ix4 r4 = r4.r     // Catch:{ all -> 0x04fa }
            monitor-exit(r6)     // Catch:{ all -> 0x04fa }
            java.util.Objects.requireNonNull(r4)
            ux4 r6 = new ux4
            r7 = 0
            r6.<init>(r4, r7)
            r5.execute(r6)
            xx4 r4 = r1.k
            int r5 = r4.D
            r6 = 3
            if (r5 != r6) goto L_0x04d7
            boolean r4 = r4.c
            if (r4 != 0) goto L_0x04a3
            java.lang.Class<androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk> r4 = androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class
            xe6 r5 = defpackage.xf4.a
            zkb r4 = r5.j(r4)
            if (r4 == 0) goto L_0x04a3
            goto L_0x04d7
        L_0x04a3:
            xx4 r4 = r1.k
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x04b4
            java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk> r4 = androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class
            xe6 r5 = defpackage.xf4.a
            zkb r4 = r5.j(r4)
            if (r4 == 0) goto L_0x04b4
            goto L_0x04d7
        L_0x04b4:
            xx4 r4 = r1.k
            ex4 r4 = r4.f
            boolean r5 = r4 instanceof defpackage.tx4
            if (r5 == 0) goto L_0x04c2
            tx4 r4 = (defpackage.tx4) r4
            r5 = 0
            r4.a(r5)
        L_0x04c2:
            xx4 r4 = r1.k
            r4.getClass()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "drop-input-frames"
            r7 = 1
            r5.putInt(r6, r7)
            android.media.MediaCodec r4 = r4.e
            r4.setParameters(r5)
        L_0x04d7:
            xx4 r4 = r1.k
            long r5 = r2.presentationTimeUs
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.w = r5
            xx4 r4 = r1.k
            boolean r5 = r4.v
            if (r5 == 0) goto L_0x0515
            java.util.concurrent.ScheduledFuture r4 = r4.x
            if (r4 == 0) goto L_0x04ef
            r5 = 1
            r4.cancel(r5)
        L_0x04ef:
            xx4 r4 = r1.k
            r4.j()
            xx4 r4 = r1.k
            r5 = 0
            r4.v = r5
            goto L_0x0515
        L_0x04fa:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x04fa }
            throw r0
        L_0x04fd:
            if (r5 == 0) goto L_0x0515
            if (r4 != 0) goto L_0x0515
            xx4 r4 = r1.k
            java.lang.String r5 = r4.a
            r5 = 0
            r1.h = r5
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x0515
            int r4 = r2.flags
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0513
            goto L_0x0515
        L_0x0513:
            r1.i = r5
        L_0x0515:
            boolean r4 = r1.h
            if (r4 == 0) goto L_0x051f
            xx4 r3 = r1.k
            java.lang.String r3 = r3.a
            goto L_0x025d
        L_0x051f:
            xx4 r4 = r1.k
            long r5 = r4.u
            r9 = 0
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x052d
            long r9 = r2.presentationTimeUs
            long r9 = r9 - r5
            goto L_0x052f
        L_0x052d:
            long r9 = r2.presentationTimeUs
        L_0x052f:
            long r5 = r1.g
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0548
            java.lang.String r3 = r4.a
            boolean r3 = r4.c
            if (r3 == 0) goto L_0x0545
            int r3 = r2.flags
            r5 = 1
            r3 = r3 & r5
            if (r3 == 0) goto L_0x025d
            r1.i = r5
            goto L_0x025d
        L_0x0545:
            r5 = 1
            goto L_0x025d
        L_0x0548:
            r5 = 1
            boolean r6 = r1.d
            if (r6 != 0) goto L_0x0557
            boolean r7 = r1.i
            if (r7 != 0) goto L_0x0557
            boolean r7 = r4.c
            if (r7 == 0) goto L_0x0557
            r1.i = r5
        L_0x0557:
            boolean r7 = r1.i
            if (r7 == 0) goto L_0x0584
            int r7 = r2.flags
            r7 = r7 & r5
            if (r7 == 0) goto L_0x0565
            r5 = 0
            r1.i = r5
            r7 = 1
            goto L_0x0586
        L_0x0565:
            r5 = 0
            java.lang.String r3 = r4.a
            r4.g()
        L_0x056b:
            xx4 r3 = r1.k     // Catch:{ CodecException -> 0x0574 }
            android.media.MediaCodec r3 = r3.e     // Catch:{ CodecException -> 0x0574 }
            r3.releaseOutputBuffer(r0, r5)     // Catch:{ CodecException -> 0x0574 }
            goto L_0x05e1
        L_0x0574:
            r0 = move-exception
            xx4 r1 = r1.k
            r1.getClass()
            java.lang.String r2 = r0.getMessage()
            r7 = 1
            r1.b(r7, r2, r0)
            goto L_0x061e
        L_0x0584:
            r7 = r5
            r5 = 0
        L_0x0586:
            if (r6 != 0) goto L_0x0597
            r1.d = r7
            java.lang.String r6 = r4.a
            kje r4 = r4.p
            java.util.Objects.toString(r4)
            android.os.SystemClock.uptimeMillis()
            android.os.SystemClock.elapsedRealtime()
        L_0x0597:
            xx4 r4 = r1.k
            long r6 = r4.u
            r9 = 0
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x05a7
            long r9 = r2.presentationTimeUs
            long r9 = r9 - r6
        L_0x05a4:
            r20 = r9
            goto L_0x05aa
        L_0x05a7:
            long r9 = r2.presentationTimeUs
            goto L_0x05a4
        L_0x05aa:
            long r6 = r2.presentationTimeUs
            int r4 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x05b2
            r4 = r2
            goto L_0x05d3
        L_0x05b2:
            long r6 = r1.g
            int r4 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x05b9
            r5 = 1
        L_0x05b9:
            r4 = 0
            defpackage.e07.p(r4, r5)
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo
            r4.<init>()
            int r5 = r2.offset
            int r6 = r2.size
            int r7 = r2.flags
            r17 = r4
            r18 = r5
            r19 = r6
            r22 = r7
            r17.set(r18, r19, r20, r22)
        L_0x05d3:
            long r5 = r4.presentationTimeUs
            r1.g = r5
            yw4 r5 = new yw4     // Catch:{ CodecException -> 0x060c }
            r5.<init>(r3, r0, r4)     // Catch:{ CodecException -> 0x060c }
            r0 = r16
            r1.b(r5, r8, r0)     // Catch:{ CodecException -> 0x060c }
        L_0x05e1:
            boolean r0 = r1.e
            if (r0 != 0) goto L_0x061e
            int r0 = r2.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x05ec
            goto L_0x0608
        L_0x05ec:
            boolean r0 = r1.b
            if (r0 == 0) goto L_0x061e
            xx4 r0 = r1.k
            boolean r3 = r0.B
            if (r3 == 0) goto L_0x061e
            long r2 = r2.presentationTimeUs
            android.util.Range r0 = r0.t
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x061e
        L_0x0608:
            r1.a()
            goto L_0x061e
        L_0x060c:
            r0 = move-exception
            xx4 r1 = r1.k
            r1.getClass()
            java.lang.String r2 = r0.getMessage()
            r3 = 1
            r1.b(r3, r2, r0)
            goto L_0x061e
        L_0x061b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x061b }
            throw r0
        L_0x061e:
            return
        L_0x061f:
            java.lang.Object r1 = r0.c
            xx4 r1 = (defpackage.xx4) r1
            int r2 = r0.b
            java.lang.Object r3 = r0.o
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.X
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.d(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx4.run():void");
    }

    public /* synthetic */ nx4(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
        this.X = obj3;
    }

    public /* synthetic */ nx4(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.X = obj3;
        this.b = i;
    }
}
