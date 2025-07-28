package defpackage;

import androidx.work.WorkRequest;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: co1  reason: default package */
public final /* synthetic */ class co1 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ co1(s16 s16, s16 s162, CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, u16 u16) {
        this.a = 1;
        this.b = s16;
        this.c = s162;
        this.Y = callsAudioManagerV3Impl;
        this.o = str;
        this.X = u16;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v51, types: [java.lang.Throwable, one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.a
            switch(r0) {
                case 0: goto L_0x0388;
                case 1: goto L_0x0370;
                case 2: goto L_0x034a;
                case 3: goto L_0x02c2;
                case 4: goto L_0x0273;
                case 5: goto L_0x01a3;
                case 6: goto L_0x0153;
                case 7: goto L_0x00fe;
                case 8: goto L_0x00c9;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.Y
            itf r0 = (itf) r0
            androidx.work.impl.WorkDatabase r2 = r0.c
            buf r2 = r2.y()
            java.lang.Object r3 = r1.o
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r4 = r2.m(r3)
            int r5 = r4.size()
            r6 = 1
            java.lang.Object r7 = r1.c
            otf r7 = (otf) r7
            if (r5 <= r6) goto L_0x0035
            xfa r0 = new xfa
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Can't apply UPDATE policy to the chains of work."
            r1.<init>(r2)
            r0.<init>(r1)
            r7.L(r0)
            goto L_0x00c8
        L_0x0035:
            java.lang.Object r4 = o23.X(r4)
            xtf r4 = (xtf) r4
            java.lang.Object r5 = r1.b
            s16 r5 = (s16) r5
            if (r4 != 0) goto L_0x0046
            r5.invoke()
            goto L_0x00c8
        L_0x0046:
            java.lang.String r6 = r4.a
            ztf r8 = r2.l(r6)
            if (r8 != 0) goto L_0x0066
            xfa r0 = new xfa
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "WorkSpec with "
            java.lang.String r4 = ", that matches a name \""
            java.lang.String r5 = "\", wasn't found"
            java.lang.String r2 = defpackage.c3d.i(r2, r6, r4, r3, r5)
            r1.<init>(r2)
            r0.<init>(r1)
            r7.L(r0)
            goto L_0x00c8
        L_0x0066:
            boolean r3 = r8.d()
            if (r3 != 0) goto L_0x007c
            xfa r0 = new xfa
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type."
            r1.<init>(r2)
            r0.<init>(r1)
            r7.L(r0)
            goto L_0x00c8
        L_0x007c:
            ctf r3 = ctf.Y
            ctf r8 = r4.b
            if (r8 != r3) goto L_0x0089
            r2.e(r6)
            r5.invoke()
            goto L_0x00c8
        L_0x0089:
            java.lang.Object r1 = r1.X
            androidx.work.WorkRequest r1 = (androidx.work.WorkRequest) r1
            ztf r8 = r1.getWorkSpec()
            java.lang.String r9 = r4.a
            r14 = 0
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r17 = 1048574(0xffffe, float:1.469365E-39)
            ztf r22 = ztf.b(r8, r9, r10, r11, r12, r13, r14, r16, r17)
            t4b r2 = r0.f     // Catch:{ all -> 0x00bf }
            androidx.work.impl.WorkDatabase r3 = r0.c     // Catch:{ all -> 0x00bf }
            sa3 r4 = r0.b     // Catch:{ all -> 0x00bf }
            java.util.List r0 = r0.e     // Catch:{ all -> 0x00bf }
            java.util.Set r23 = r1.getTags()     // Catch:{ all -> 0x00bf }
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r0
            ez3.i0(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x00bf }
            zfa r0 = aga.Q     // Catch:{ all -> 0x00bf }
            r7.L(r0)     // Catch:{ all -> 0x00bf }
            goto L_0x00c8
        L_0x00bf:
            r0 = move-exception
            xfa r1 = new xfa
            r1.<init>(r0)
            r7.L(r1)
        L_0x00c8:
            return
        L_0x00c9:
            java.lang.Object r0 = r1.Y
            h2f r0 = (h2f) r0
            hu1 r2 = r0.c()
            java.lang.Object r3 = r1.c
            hu1 r3 = (hu1) r3
            if (r3 != r2) goto L_0x00fd
            r2 = 1
            java.lang.Object r4 = r1.b
            o4e r4 = (o4e) r4
            y4e r2 = r4.d(r3, r2)
            r0.u = r2
            z80 r2 = i2f.b
            java.lang.Object r3 = r1.o
            i2f r3 = (i2f) r3
            java.lang.Object r2 = r3.h(r2)
            d7f r2 = (d7f) r2
            java.util.Objects.requireNonNull(r2)
            y4e r3 = r0.u
            java.lang.Object r1 = r1.X
            kje r1 = (kje) r1
            r2.f(r3, r1)
            r0.P()
        L_0x00fd:
            return
        L_0x00fe:
            java.lang.Object r0 = r1.Y
            r6 = r0
            izc r6 = (defpackage.izc) r6
            java.util.Map r5 = r6.A()
            java.lang.Object r0 = r1.c
            r3 = r0
            org.webrtc.StatsReport[] r3 = (org.webrtc.StatsReport[]) r3
            int r0 = r3.length
            xp0[] r4 = new xp0[r0]
            r0 = 0
            r2 = r0
        L_0x0111:
            int r7 = r3.length
            if (r2 >= r7) goto L_0x0145
            java.lang.Object r7 = r1.o
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r7.get(r2)
            wwf r7 = (defpackage.wwf) r7
            boolean r8 = r7.b
            if (r8 == 0) goto L_0x012c
            xp0 r7 = new xp0
            r8 = 0
            r9 = 1
            r7.<init>(r8, r9)
            r4[r2] = r7
            goto L_0x0142
        L_0x012c:
            boolean r8 = r7.c
            if (r8 == 0) goto L_0x0135
            pe1 r7 = r6.z0
            ke1 r7 = r7.a
            goto L_0x013b
        L_0x0135:
            ge1 r7 = r7.a
            ke1 r7 = r6.z(r7)
        L_0x013b:
            xp0 r8 = new xp0
            r8.<init>(r7, r0)
            r4[r2] = r8
        L_0x0142:
            int r2 = r2 + 1
            goto L_0x0111
        L_0x0145:
            java.lang.Object r0 = r1.X
            jsd r0 = (defpackage.jsd) r0
            java.lang.Object r1 = r1.b
            r2 = r1
            org.webrtc.StatsReport[] r2 = (org.webrtc.StatsReport[]) r2
            r1 = r0
            r1.a(r2, r3, r4, r5, r6)
            return
        L_0x0153:
            java.lang.Object r0 = r1.Y
            r2 = r0
            jg8 r2 = (defpackage.jg8) r2
            java.lang.Object r0 = r1.b
            kqe r0 = (kqe) r0
            java.lang.Object r3 = r1.c
            j93 r3 = (j93) r3
            java.lang.Object r4 = r1.o
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.X
            ig8 r1 = (defpackage.ig8) r1
            java.lang.Object r5 = r2.b
            java.lang.String r5 = (java.lang.String) r5
            fn6 r6 = udd.e
            if (r6 != 0) goto L_0x0171
            goto L_0x017f
        L_0x0171:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x017f
            tn7 r7 = defpackage.tn7.X
            r8 = 0
            java.lang.String r9 = "Transformer.startSafely"
            r6.d(r7, r5, r9, r8)
        L_0x017f:
            r0.e(r3, r4)     // Catch:{ all -> 0x0183 }
            goto L_0x01a2
        L_0x0183:
            r0 = move-exception
            r3 = r0
            java.lang.Object r0 = r2.b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "Unexpected failure when start transformer"
            udd.s(r0, r2, r3)
            one.me.sdk.media.transformer.MediaTransformException r0 = new one.me.sdk.media.transformer.MediaTransformException
            r0.<init>(r2, r3)
            java.lang.String r2 = r1.b
            java.lang.String r3 = "onError"
            udd.s(r2, r3, r0)
            gg8 r2 = r1.a
            r2.a(r0)
            r1.a()
        L_0x01a2:
            return
        L_0x01a3:
            java.lang.Object r0 = r1.Y
            r2 = r0
            kd8 r2 = (kd8) r2
            r2.getClass()
            java.lang.Object r0 = r1.b
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.incrementAndGet()
            java.lang.Object r3 = r1.c
            java.util.List r3 = (java.util.List) r3
            int r4 = r3.size()
            if (r0 != r4) goto L_0x0272
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            r6 = r5
        L_0x01c4:
            java.lang.Object r0 = r1.o
            java.util.List r0 = (java.util.List) r0
            int r7 = r0.size()
            if (r6 >= r7) goto L_0x01fe
            java.lang.Object r0 = r0.get(r6)
            ch7 r0 = (ch7) r0
            r7 = 0
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r0 = defpackage.swb.u(r0)     // Catch:{ CancellationException | ExecutionException -> 0x01de }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ CancellationException | ExecutionException -> 0x01de }
            goto L_0x01e5
        L_0x01de:
            r0 = move-exception
            java.lang.String r8 = "Failed to get bitmap"
            ez3.u(r0, r8)
        L_0x01e4:
            r0 = r7
        L_0x01e5:
            java.lang.Object r8 = r3.get(r6)
            l68 r8 = (l68) r8
            c58 r0 = qa7.g(r8, r0)
            long r8 = qa7.p(r6)
            sc8 r10 = new sc8
            r10.<init>(r7, r0, r8)
            r4.add(r10)
            int r6 = r6 + 1
            goto L_0x01c4
        L_0x01fe:
            int r0 = oze.a
            r3 = 21
            java.lang.Object r2 = r2.X
            md8 r2 = (md8) r2
            if (r0 >= r3) goto L_0x026d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r6 = r5
        L_0x0212:
            int r7 = r4.size()     // Catch:{ all -> 0x022f }
            if (r6 >= r7) goto L_0x0231
            java.lang.Object r7 = r4.get(r6)     // Catch:{ all -> 0x022f }
            android.os.Parcelable r7 = (android.os.Parcelable) r7     // Catch:{ all -> 0x022f }
            r3.writeParcelable(r7, r5)     // Catch:{ all -> 0x022f }
            int r8 = r3.dataSize()     // Catch:{ all -> 0x022f }
            r9 = 262144(0x40000, float:3.67342E-40)
            if (r8 >= r9) goto L_0x0231
            r0.add(r7)     // Catch:{ all -> 0x022f }
            int r6 = r6 + 1
            goto L_0x0212
        L_0x022f:
            r0 = move-exception
            goto L_0x0269
        L_0x0231:
            r3.recycle()
            int r3 = r0.size()
            java.lang.Object r1 = r1.X
            vje r1 = (vje) r1
            int r4 = r1.p()
            if (r3 == r4) goto L_0x0263
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Sending "
            r3.<init>(r4)
            int r4 = r0.size()
            r3.append(r4)
            java.lang.String r4 = " items out of "
            r3.append(r4)
            int r1 = r1.p()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            ez3.M(r1)
        L_0x0263:
            vc8 r1 = r2.j
            md8.L(r1, r0)
            goto L_0x0272
        L_0x0269:
            r3.recycle()
            throw r0
        L_0x026d:
            vc8 r0 = r2.j
            md8.L(r0, r4)
        L_0x0272:
            return
        L_0x0273:
            java.lang.Object r0 = r1.Y
            r6 = r0
            ih4 r6 = (defpackage.ih4) r6
            r6.getClass()
            java.lang.Object r0 = r1.c
            r3 = r0
            org.webrtc.StatsReport[] r3 = (org.webrtc.StatsReport[]) r3
            int r0 = r3.length
            xp0[] r4 = new xp0[r0]
            pe1 r0 = r6.z0
            ke1 r0 = r0.a
            java.lang.Object r2 = r1.o
            ge1 r2 = (defpackage.ge1) r2
            ke1 r2 = r6.z(r2)
            r5 = 0
            r7 = r5
        L_0x0291:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x02b2
            r8 = r3[r7]
            java.lang.String r8 = r8.id
            java.lang.String r9 = "_recv"
            boolean r8 = r8.endsWith(r9)
            if (r8 == 0) goto L_0x02a8
            xp0 r8 = new xp0
            r8.<init>(r2, r5)
            r4[r7] = r8
            goto L_0x02af
        L_0x02a8:
            xp0 r8 = new xp0
            r8.<init>(r0, r5)
            r4[r7] = r8
        L_0x02af:
            int r7 = r7 + 1
            goto L_0x0291
        L_0x02b2:
            java.util.Map r5 = java.util.Collections.EMPTY_MAP
            java.lang.Object r0 = r1.X
            jsd r0 = (defpackage.jsd) r0
            java.lang.Object r1 = r1.b
            r2 = r1
            org.webrtc.StatsReport[] r2 = (org.webrtc.StatsReport[]) r2
            r1 = r0
            r1.a(r2, r3, r4, r5, r6)
            return
        L_0x02c2:
            java.lang.Object r0 = r1.Y
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            java.lang.Object r2 = r1.b
            lhd r2 = (defpackage.lhd) r2
            java.lang.Object r3 = r1.c
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r4 = r1.o
            z50 r4 = (z50) r4
            java.lang.Object r1 = r1.X
            ga3 r1 = (ga3) r1
            r5 = 0
            r0.flush()     // Catch:{ all -> 0x0313 }
            r0.release()     // Catch:{ all -> 0x0313 }
            if (r2 == 0) goto L_0x02f7
            android.os.Looper r0 = r3.getLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x02f7
            dr1 r0 = new dr1
            r6 = 18
            r0.<init>(r2, r6, r4)
            r3.post(r0)
        L_0x02f7:
            r1.g()
            java.lang.Object r6 = c54.m0
            monitor-enter(r6)
            int r0 = c54.o0     // Catch:{ all -> 0x030d }
            int r0 = r0 + -1
            c54.o0 = r0     // Catch:{ all -> 0x030d }
            if (r0 != 0) goto L_0x030f
            java.util.concurrent.ExecutorService r0 = c54.n0     // Catch:{ all -> 0x030d }
            r0.shutdown()     // Catch:{ all -> 0x030d }
            c54.n0 = r5     // Catch:{ all -> 0x030d }
            goto L_0x030f
        L_0x030d:
            r0 = move-exception
            goto L_0x0311
        L_0x030f:
            monitor-exit(r6)     // Catch:{ all -> 0x030d }
            return
        L_0x0311:
            monitor-exit(r6)     // Catch:{ all -> 0x030d }
            throw r0
        L_0x0313:
            r0 = move-exception
            if (r2 == 0) goto L_0x032e
            android.os.Looper r6 = r3.getLooper()
            java.lang.Thread r6 = r6.getThread()
            boolean r6 = r6.isAlive()
            if (r6 == 0) goto L_0x032e
            dr1 r6 = new dr1
            r7 = 18
            r6.<init>(r2, r7, r4)
            r3.post(r6)
        L_0x032e:
            r1.g()
            java.lang.Object r2 = c54.m0
            monitor-enter(r2)
            int r1 = c54.o0     // Catch:{ all -> 0x0344 }
            int r1 = r1 + -1
            c54.o0 = r1     // Catch:{ all -> 0x0344 }
            if (r1 != 0) goto L_0x0346
            java.util.concurrent.ExecutorService r1 = c54.n0     // Catch:{ all -> 0x0344 }
            r1.shutdown()     // Catch:{ all -> 0x0344 }
            c54.n0 = r5     // Catch:{ all -> 0x0344 }
            goto L_0x0346
        L_0x0344:
            r0 = move-exception
            goto L_0x0348
        L_0x0346:
            monitor-exit(r2)     // Catch:{ all -> 0x0344 }
            throw r0
        L_0x0348:
            monitor-exit(r2)     // Catch:{ all -> 0x0344 }
            throw r0
        L_0x034a:
            java.lang.Object r0 = r1.Y
            nxc r0 = (defpackage.nxc) r0
            r0.getClass()
            java.lang.Object r2 = r1.b
            xc3 r2 = (xc3) r2
            ch7 r2 = r2.run()
            wc3 r3 = new wc3
            java.lang.Object r4 = r1.c
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4
            java.lang.Object r5 = r1.o
            yc3 r5 = (yc3) r5
            java.lang.Object r1 = r1.X
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r3.<init>(r0, r4, r5, r1)
            lh4 r0 = lh4.a
            r2.c(r3, r0)
            return
        L_0x0370:
            java.lang.Object r0 = r1.o
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.X
            u16 r2 = (u16) r2
            java.lang.Object r3 = r1.b
            s16 r3 = (s16) r3
            java.lang.Object r4 = r1.c
            s16 r4 = (s16) r4
            java.lang.Object r1 = r1.Y
            ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl r1 = (ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl) r1
            ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl.doOnOwnThreadUnsafe$lambda$8(r3, r4, r1, r0, r2)
            return
        L_0x0388:
            java.lang.Object r0 = r1.o
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.X
            u16 r2 = (u16) r2
            java.lang.Object r3 = r1.Y
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl r3 = (ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl) r3
            java.lang.Object r4 = r1.b
            s16 r4 = (s16) r4
            java.lang.Object r1 = r1.c
            s16 r1 = (s16) r1
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.doOnOwnThread$lambda$8(r3, r4, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co1.run():void");
    }

    public /* synthetic */ co1(itf itf, String str, otf otf, muf muf, WorkRequest workRequest) {
        this.a = 9;
        this.Y = itf;
        this.o = str;
        this.c = otf;
        this.b = muf;
        this.X = workRequest;
    }

    public /* synthetic */ co1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.Y = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
        this.X = obj5;
    }
}
