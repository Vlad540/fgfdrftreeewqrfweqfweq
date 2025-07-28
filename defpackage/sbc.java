package defpackage;

/* renamed from: sbc  reason: default package */
public final /* synthetic */ class sbc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sbc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        defpackage.d8.f(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L_0x04d4;
                case 1: goto L_0x0476;
                case 2: goto L_0x0407;
                case 3: goto L_0x03cd;
                case 4: goto L_0x0364;
                case 5: goto L_0x0320;
                case 6: goto L_0x02b5;
                case 7: goto L_0x0284;
                case 8: goto L_0x0256;
                case 9: goto L_0x0228;
                case 10: goto L_0x020f;
                case 11: goto L_0x0203;
                case 12: goto L_0x01f7;
                case 13: goto L_0x01eb;
                case 14: goto L_0x01df;
                case 15: goto L_0x01d3;
                case 16: goto L_0x01c7;
                case 17: goto L_0x01ae;
                case 18: goto L_0x0193;
                case 19: goto L_0x0150;
                case 20: goto L_0x013e;
                case 21: goto L_0x011b;
                case 22: goto L_0x00e3;
                case 23: goto L_0x00c9;
                case 24: goto L_0x00b1;
                case 25: goto L_0x0099;
                case 26: goto L_0x008b;
                case 27: goto L_0x0073;
                case 28: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.b
            qce r0 = (qce) r0
            java.lang.Object r12 = r12.c
            lbe r12 = (lbe) r12
            r0.c(r12)
            return
        L_0x0011:
            java.lang.Object r0 = r12.b
            fb0 r0 = (defpackage.fb0) r0
            lv1 r0 = r0.c
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r12 = r12.c
            lr6 r12 = (defpackage.lr6) r12
            java.util.Objects.requireNonNull(r12)
            java.lang.Class<lv1> r1 = lv1.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "capture image with success"
            defpackage.udd.p(r1, r2, new java.lang.Object[0])
            java.lang.Object r0 = r0.b
            ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView r0 = (ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView) r0
            mv4[] r1 = r12.v()     // Catch:{ all -> 0x006c }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x006c }
            java.nio.ByteBuffer r1 = r1.E()     // Catch:{ all -> 0x006c }
            int r2 = r1.capacity()     // Catch:{ all -> 0x006c }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x006c }
            r1.rewind()     // Catch:{ all -> 0x006c }
            r1.get(r2)     // Catch:{ all -> 0x006c }
            ju1 r0 = r0.w0     // Catch:{ all -> 0x006c }
            r1 = 0
            if (r0 == 0) goto L_0x0068
            gvf r0 = (defpackage.gvf) r0     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x006c }
            vkb r0 = (vkb) r0     // Catch:{ all -> 0x006c }
            ykb r0 = r0.o     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0057
            r0 = r1
        L_0x0057:
            pae r3 = r0.w0     // Catch:{ all -> 0x006c }
            n3a r3 = (defpackage.n3a) r3     // Catch:{ all -> 0x006c }
            ju3 r3 = r3.b()     // Catch:{ all -> 0x006c }
            wkb r4 = new wkb     // Catch:{ all -> 0x006c }
            r4.<init>(r0, r2, r1)     // Catch:{ all -> 0x006c }
            r2 = 2
            taf.n(r0, r3, r1, r4, r2)     // Catch:{ all -> 0x006c }
        L_0x0068:
            defpackage.d8.f(r12, r1)
            return
        L_0x006c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r1 = move-exception
            defpackage.d8.f(r12, r0)
            throw r1
        L_0x0073:
            java.lang.Object r0 = r12.b
            fb0 r0 = (defpackage.fb0) r0
            lv1 r0 = r0.c
            if (r0 == 0) goto L_0x0083
            java.lang.Object r12 = r12.c
            androidx.camera.core.ImageCaptureException r12 = (androidx.camera.core.ImageCaptureException) r12
            r0.y(r12)
            return
        L_0x0083:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "One and only one callback is allowed."
            r12.<init>(r0)
            throw r12
        L_0x008b:
            java.lang.Object r0 = r12.b
            z9e r0 = (defpackage.z9e) r0
            java.util.ArrayList r0 = r0.X
            java.lang.Object r12 = r12.c
            xac r12 = (defpackage.xac) r12
            r0.remove(r12)
            return
        L_0x0099:
            java.lang.Object r0 = r12.c
            q4e r0 = (defpackage.q4e) r0
            java.lang.Object r12 = r12.b
            s4e r12 = (defpackage.s4e) r12
            r12.getClass()
            r4e r1 = r12.a     // Catch:{ ProcessingException -> 0x00aa }
            r1.c(r0)     // Catch:{ ProcessingException -> 0x00aa }
            goto L_0x00b0
        L_0x00aa:
            r0 = move-exception
            rf3 r12 = r12.c
            r12.accept(r0)
        L_0x00b0:
            return
        L_0x00b1:
            java.lang.Object r0 = r12.c
            y4e r0 = (defpackage.y4e) r0
            java.lang.Object r12 = r12.b
            s4e r12 = (defpackage.s4e) r12
            r12.getClass()
            r4e r1 = r12.a     // Catch:{ ProcessingException -> 0x00c2 }
            r1.a(r0)     // Catch:{ ProcessingException -> 0x00c2 }
            goto L_0x00c8
        L_0x00c2:
            r0 = move-exception
            rf3 r12 = r12.c
            r12.accept(r0)
        L_0x00c8:
            return
        L_0x00c9:
            java.lang.Object r0 = r12.b
            q4e r0 = (defpackage.q4e) r0
            r0.getClass()
            java.lang.Object r12 = r12.c
            java.util.concurrent.atomic.AtomicReference r12 = (java.util.concurrent.atomic.AtomicReference) r12
            java.lang.Object r12 = r12.get()
            rf3 r12 = (defpackage.rf3) r12
            za0 r1 = new za0
            r1.<init>(r0)
            r12.accept(r1)
            return
        L_0x00e3:
            java.lang.Object r0 = r12.b
            nmd r0 = (defpackage.nmd) r0
            android.graphics.SurfaceTexture r1 = r0.y0
            android.view.Surface r2 = r0.z0
            android.view.Surface r3 = new android.view.Surface
            java.lang.Object r12 = r12.c
            android.graphics.SurfaceTexture r12 = (android.graphics.SurfaceTexture) r12
            r3.<init>(r12)
            r0.y0 = r12
            r0.z0 = r3
            java.util.concurrent.CopyOnWriteArrayList r12 = r0.a
            java.util.Iterator r12 = r12.iterator()
        L_0x00fe:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r0 = r12.next()
            g45 r0 = (defpackage.g45) r0
            m45 r0 = r0.a
            r0.m2(r3)
            goto L_0x00fe
        L_0x0110:
            if (r1 == 0) goto L_0x0115
            r1.release()
        L_0x0115:
            if (r2 == 0) goto L_0x011a
            r2.release()
        L_0x011a:
            return
        L_0x011b:
            r0 = 0
            java.lang.Object r1 = r12.b
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            android.view.ViewPropertyAnimator r0 = r1.translationY(r0)
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            java.lang.Object r12 = r12.c
            vkd r12 = (vkd) r12
            t97 r12 = r12.b
            java.lang.Object r12 = r12.getValue()
            android.view.animation.AccelerateDecelerateInterpolator r12 = (android.view.animation.AccelerateDecelerateInterpolator) r12
            android.view.ViewPropertyAnimator r12 = r0.setInterpolator(r12)
            r12.start()
            return
        L_0x013e:
            java.lang.Object r0 = r12.b
            xw2 r0 = (defpackage.xw2) r0
            java.lang.Object r0 = r0.c
            vhd r0 = (defpackage.vhd) r0
            z4f r0 = r0.o
            java.lang.Object r12 = r12.c
            androidx.media3.common.VideoFrameProcessingException r12 = (androidx.media3.common.VideoFrameProcessingException) r12
            r0.c(r12)
            return
        L_0x0150:
            java.lang.Object r0 = r12.b
            mfd r0 = (mfd) r0
            boolean r1 = r0.p
            java.lang.Object r12 = r12.c
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            java.lang.String r2 = "OKSignaling"
            xwb r3 = r0.b
            if (r1 != 0) goto L_0x0176
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<!> ignoring "
            r0.<init>(r1)
            java.lang.String r12 = r12.toString()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r3.log(r2, r12)
            goto L_0x0192
        L_0x0176:
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.k     // Catch:{ JSONException -> 0x018c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x018c }
        L_0x017c:
            boolean r1 = r0.hasNext()     // Catch:{ JSONException -> 0x018c }
            if (r1 == 0) goto L_0x0192
            java.lang.Object r1 = r0.next()     // Catch:{ JSONException -> 0x018c }
            lfd r1 = (lfd) r1     // Catch:{ JSONException -> 0x018c }
            r1.k(r12)     // Catch:{ JSONException -> 0x018c }
            goto L_0x017c
        L_0x018c:
            r12 = move-exception
            java.lang.String r0 = "signaling.listener.response.notification"
            r3.reportException(r2, r0, r12)
        L_0x0192:
            return
        L_0x0193:
            java.lang.Object r0 = r12.b
            ocd r0 = (ocd) r0
            e3 r0 = r0.f
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r0 = r0.a
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            mwf r1 = new mwf
            r2 = 0
            java.lang.Object r12 = r12.c
            u39 r12 = (u39) r12
            r1.<init>(r2, r12)
            r0.remove(r1)
        L_0x01ad:
            return
        L_0x01ae:
            java.lang.Object r0 = r12.b
            ocd r0 = (ocd) r0
            java.lang.Object r12 = r12.c
            d r12 = (d) r12
            r0.getClass()
            jl7 r12 = r12.D0
            if (r12 == 0) goto L_0x01c1
            r1 = 0
            r12.j(r1)
        L_0x01c1:
            org.webrtc.audio.JavaAudioDeviceModule r12 = r0.g
            r12.stopDeviceAudioShare()
            return
        L_0x01c7:
            java.lang.Object r0 = r12.b
            u16 r0 = (defpackage.u16) r0
            java.lang.Object r12 = r12.c
            ru.ok.android.externcalls.sdk.id.ParticipantId r12 = (ru.ok.android.externcalls.sdk.id.ParticipantId) r12
            ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl.c(r0, r12)
            return
        L_0x01d3:
            java.lang.Object r0 = r12.b
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r0 = (ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl) r0
            java.lang.Object r12 = r12.c
            kj1 r12 = (kj1) r12
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl.c(r0, r12)
            return
        L_0x01df:
            java.lang.Object r0 = r12.b
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r0 = (ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl) r0
            java.lang.Object r12 = r12.c
            lj1 r12 = (lj1) r12
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl.e(r0, r12)
            return
        L_0x01eb:
            java.lang.Object r0 = r12.b
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r0 = (ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl) r0
            java.lang.Object r12 = r12.c
            jj1 r12 = (jj1) r12
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl.a(r0, r12)
            return
        L_0x01f7:
            java.lang.Object r0 = r12.b
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r0 = (ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl) r0
            java.lang.Object r12 = r12.c
            mj1 r12 = (mj1) r12
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl.b(r0, r12)
            return
        L_0x0203:
            java.lang.Object r0 = r12.b
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r0 = (ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl) r0
            java.lang.Object r12 = r12.c
            ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager$OwnRoomsListener r12 = (ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener) r12
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl.d(r0, r12)
            return
        L_0x020f:
            java.lang.Object r0 = r12.b
            noc r0 = (noc) r0
            java.lang.Object r12 = r12.c
            az3 r12 = (az3) r12
            hz5 r1 = r0.Y
            r1.d(r12)
            boolean r1 = r0.Z
            if (r1 == 0) goto L_0x0227
            if (r12 == 0) goto L_0x0227
            hz5 r12 = r0.Y
            r12.e()
        L_0x0227:
            return
        L_0x0228:
            java.lang.Object r0 = r12.c
            hhc r0 = (hhc) r0
            java.lang.Object r12 = r12.b
            km4 r12 = (defpackage.km4) r12
            java.lang.Object r1 = r12.a
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0238:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0255
            java.lang.Object r2 = r1.next()
            ihc r2 = (ihc) r2
            r2.b(r0)     // Catch:{ all -> 0x0248 }
            goto L_0x0238
        L_0x0248:
            r2 = move-exception
            java.lang.String r3 = "rtc.notification.handle.notificationreceived"
            java.lang.Object r4 = r12.c
            xwb r4 = (xwb) r4
            java.lang.String r5 = "RtcNotificationReceiver"
            r4.reportException(r5, r3, r2)
            goto L_0x0238
        L_0x0255:
            return
        L_0x0256:
            java.lang.Object r0 = r12.c
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r12 = r12.b
            km4 r12 = (defpackage.km4) r12
            java.lang.Object r1 = r12.a
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0266:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0283
            java.lang.Object r2 = r1.next()
            ihc r2 = (ihc) r2
            r2.c(r0)     // Catch:{ all -> 0x0276 }
            goto L_0x0266
        L_0x0276:
            r2 = move-exception
            java.lang.String r3 = "rtc.notification.handle.notificationerror"
            java.lang.Object r4 = r12.c
            xwb r4 = (xwb) r4
            java.lang.String r5 = "RtcNotificationReceiver"
            r4.reportException(r5, r3, r2)
            goto L_0x0266
        L_0x0283:
            return
        L_0x0284:
            java.lang.Object r0 = r12.b
            km4 r0 = (defpackage.km4) r0
            java.lang.Object r1 = r0.Z
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0293
            goto L_0x02b4
        L_0x0293:
            java.lang.Object r1 = r0.w0
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.Object r2 = r1.get()
            az3 r2 = (az3) r2
            java.lang.Object r12 = r12.c
            az3 r12 = (az3) r12
            if (r2 == r12) goto L_0x02b4
            r1.set(r12)
            java.lang.Object r0 = r0.x0
            owf r0 = (owf) r0
            if (r2 == 0) goto L_0x02af
            r2.c(r0)
        L_0x02af:
            if (r12 == 0) goto L_0x02b4
            r12.a(r0)
        L_0x02b4:
            return
        L_0x02b5:
            java.lang.Object r0 = r12.b
            dhc r0 = (dhc) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.j
            boolean r2 = r1.get()
            if (r2 == 0) goto L_0x02c2
            goto L_0x031f
        L_0x02c2:
            java.util.concurrent.atomic.AtomicReference r2 = r0.b
            java.lang.Object r3 = r2.get()
            az3 r3 = (az3) r3
            java.lang.Object r12 = r12.c
            az3 r12 = (az3) r12
            if (r3 != r12) goto L_0x02d1
            goto L_0x031f
        L_0x02d1:
            r2.set(r12)
            java.lang.String r4 = "Illegal 'listener' value: null"
            owf r5 = r0.d
            hxf r6 = r0.c
            if (r3 == 0) goto L_0x02ed
            if (r6 == 0) goto L_0x02e7
            java.util.concurrent.CopyOnWriteArrayList r7 = r3.c
            r7.remove(r6)
            r3.c(r5)
            goto L_0x02ed
        L_0x02e7:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r4)
            throw r12
        L_0x02ed:
            r0.a()
            if (r12 == 0) goto L_0x031f
            r12.a(r5)
            if (r6 == 0) goto L_0x0319
            java.util.concurrent.CopyOnWriteArrayList r3 = r12.c
            r3.add(r6)
            boolean r3 = r12.b()
            java.lang.Object r2 = r2.get()
            az3 r2 = (az3) r2
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x031f
            if (r2 == r12) goto L_0x030f
            goto L_0x031f
        L_0x030f:
            if (r3 == 0) goto L_0x0315
            r0.b()
            goto L_0x031f
        L_0x0315:
            r0.a()
            goto L_0x031f
        L_0x0319:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r4)
            throw r12
        L_0x031f:
            return
        L_0x0320:
            java.lang.Object r0 = r12.b
            dhc r0 = (dhc) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.j
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x032d
            goto L_0x0363
        L_0x032d:
            long r1 = r0.k
            r3 = 1
            long r1 = r1 + r3
            r0.k = r1
            nwf r3 = new nwf
            java.lang.Object r12 = r12.c
            bhc r12 = (bhc) r12
            xwb r4 = r0.o
            r3.<init>(r1, r12, r4)
            android.util.LongSparseArray r4 = r0.l
            r4.put(r1, r3)
            jj7 r3 = r0.n
            r3.getClass()
            zwf r4 = new zwf
            ahc r12 = r12.b
            r5 = 0
            r4.<init>(r3, r12, r5)
            java.lang.Object r12 = r3.c
            android.os.Handler r12 = (android.os.Handler) r12
            r12.post(r4)
            chc r12 = new chc
            r3 = 0
            r12.<init>(r0, r1, r3)
            android.os.Handler r0 = r0.f
            r0.post(r12)
        L_0x0363:
            return
        L_0x0364:
            java.lang.Object r0 = r12.b
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0370:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03cc
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            java.lang.Object r1 = r12.c
            oec r1 = (oec) r1
            dpa r1 = r1.c()
            aec r5 = r1.a
            r5.b()
            yv8 r1 = r1.d
            yz5 r6 = r1.f()
            r7 = 1
            r6.j(r7, r3)
            long r3 = (long) r7
            r7 = 2
            r6.j(r7, r3)
            r3 = 3
            if (r2 != 0) goto L_0x03af
            r6.W(r3)
            goto L_0x03b2
        L_0x03af:
            r6.f(r3, r2)
        L_0x03b2:
            r5.c()     // Catch:{ all -> 0x03c7 }
            r6.n()     // Catch:{ all -> 0x03c2 }
            r5.r()     // Catch:{ all -> 0x03c2 }
            r5.l()     // Catch:{ all -> 0x03c7 }
            r1.u(r6)
            goto L_0x0370
        L_0x03c2:
            r12 = move-exception
            r5.l()     // Catch:{ all -> 0x03c7 }
            throw r12     // Catch:{ all -> 0x03c7 }
        L_0x03c7:
            r12 = move-exception
            r1.u(r6)
            throw r12
        L_0x03cc:
            return
        L_0x03cd:
            java.lang.Object r0 = r12.b
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x03d5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0406
            java.lang.Object r1 = r0.next()
            ioa r1 = (ioa) r1
            java.lang.Object r2 = r12.c
            oec r2 = (oec) r2
            dpa r3 = r2.c()
            joa r1 = oec.b(r2, r1)
            aec r2 = r3.a
            r2.b()
            r2.c()
            sh r3 = r3.b     // Catch:{ all -> 0x0401 }
            r3.C(r1)     // Catch:{ all -> 0x0401 }
            r2.r()     // Catch:{ all -> 0x0401 }
            r2.l()
            goto L_0x03d5
        L_0x0401:
            r12 = move-exception
            r2.l()
            throw r12
        L_0x0406:
            return
        L_0x0407:
            java.lang.Object r0 = r12.b
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0413:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0475
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Object r1 = r1.getValue()
            yr8 r1 = (yr8) r1
            java.lang.Object r4 = r12.c
            nec r4 = (nec) r4
            cw8 r4 = r4.d()
            aec r5 = r4.a
            r5.b()
            yv8 r6 = r4.m
            yz5 r7 = r6.f()
            p29 r4 = r4.a()
            r4.getClass()
            byte[] r1 = p29.d(r1)
            r4 = 1
            if (r1 != 0) goto L_0x0454
            r7.W(r4)
            goto L_0x0457
        L_0x0454:
            r7.k(r4, r1)
        L_0x0457:
            r1 = 2
            r7.j(r1, r2)
            r5.c()     // Catch:{ all -> 0x0470 }
            r7.n()     // Catch:{ all -> 0x046b }
            r5.r()     // Catch:{ all -> 0x046b }
            r5.l()     // Catch:{ all -> 0x0470 }
            r6.u(r7)
            goto L_0x0413
        L_0x046b:
            r12 = move-exception
            r5.l()     // Catch:{ all -> 0x0470 }
            throw r12     // Catch:{ all -> 0x0470 }
        L_0x0470:
            r12 = move-exception
            r6.u(r7)
            throw r12
        L_0x0475:
            return
        L_0x0476:
            java.lang.Object r0 = r12.b
            uq7 r0 = (defpackage.uq7) r0
            int r1 = r0.h()
            r2 = 0
        L_0x047f:
            if (r2 >= r1) goto L_0x04d3
            long r3 = r0.e(r2)
            java.lang.Object r5 = r0.i(r2)
            l2b r5 = (l2b) r5
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x04d0
            java.lang.Object r6 = r12.c
            ydc r6 = (ydc) r6
            do3 r6 = r6.x()
            int r7 = r5.b
            aec r8 = r6.a
            r8.b()
            th r6 = r6.d
            yz5 r9 = r6.f()
            long r10 = (long) r7
            r7 = 1
            r9.j(r7, r10)
            int r5 = r5.a
            long r10 = (long) r5
            r5 = 2
            r9.j(r5, r10)
            r5 = 3
            r9.j(r5, r3)
            r8.c()     // Catch:{ all -> 0x04cb }
            r9.n()     // Catch:{ all -> 0x04c6 }
            r8.r()     // Catch:{ all -> 0x04c6 }
            r8.l()     // Catch:{ all -> 0x04cb }
            r6.u(r9)
            goto L_0x04d0
        L_0x04c6:
            r12 = move-exception
            r8.l()     // Catch:{ all -> 0x04cb }
            throw r12     // Catch:{ all -> 0x04cb }
        L_0x04cb:
            r12 = move-exception
            r6.u(r9)
            throw r12
        L_0x04d0:
            int r2 = r2 + 1
            goto L_0x047f
        L_0x04d3:
            return
        L_0x04d4:
            java.lang.Object r0 = r12.b
            vx3 r0 = (defpackage.vx3) r0
            java.lang.Object r12 = r12.c
            android.graphics.Typeface r12 = (android.graphics.Typeface) r12
            r0.E(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbc.run():void");
    }
}
