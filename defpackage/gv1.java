package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: gv1  reason: default package */
public final /* synthetic */ class gv1 implements Runnable {
    public final /* synthetic */ int X;
    public final /* synthetic */ Context Y;
    public final /* synthetic */ sn1 Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hv1 b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ long o;

    public /* synthetic */ gv1(hv1 hv1, Context context, Executor executor, int i, sn1 sn1, long j) {
        this.b = hv1;
        this.Y = context;
        this.c = executor;
        this.X = i;
        this.Z = sn1;
        this.o = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0121 A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0136 A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014f A[Catch:{ all -> 0x00a5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x0023;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r1 = r0.X
            int r6 = r1 + 1
            hv1 r3 = r0.b
            r3.getClass()
            gv1 r1 = new gv1
            android.content.Context r4 = r0.Y
            java.util.concurrent.Executor r10 = r0.c
            sn1 r7 = r0.Z
            long r8 = r0.o
            r2 = r1
            r5 = r10
            r2.<init>((defpackage.hv1) r3, (android.content.Context) r4, (java.util.concurrent.Executor) r5, (int) r6, (defpackage.sn1) r7, (long) r8)
            r10.execute(r1)
            return
        L_0x0023:
            hv1 r12 = r0.b
            android.content.Context r1 = r0.Y
            java.util.concurrent.Executor r13 = r0.c
            int r2 = r0.X
            sn1 r3 = r0.Z
            long r14 = r0.o
            r12.getClass()
            java.lang.String r4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: "
            java.lang.String r0 = "CX:initAndRetryRecursively"
            java.lang.String r0 = defpackage.am7.C(r0)
            android.os.Trace.beginSection(r0)
            android.content.Context r1 = defpackage.fja.g(r1)
            r9 = 0
            iv1 r0 = r12.c     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            hs1 r0 = r0.c()     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            if (r0 == 0) goto L_0x0102
            java.util.concurrent.Executor r0 = r12.d     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            android.os.Handler r5 = r12.e     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            v80 r7 = new v80     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            r7.<init>(r0, r5)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            iv1 r0 = r12.c     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            wu1 r0 = r0.a()     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            iv1 r5 = r12.c     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            long r16 = r5.e()     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            zd2 r10 = new zd2     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00ff }
            r5 = r10
            r6 = r1
            r8 = r0
            r11 = r10
            r9 = r16
            r5.<init>(r6, r7, r8, r9)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            r12.f = r11     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            iv1 r5 = r12.c     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            is1 r5 = r5.g()     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            if (r5 == 0) goto L_0x00f1
            zd2 r5 = r12.f     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            java.lang.Object r6 = r5.f     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            ku1 r6 = (defpackage.ku1) r6     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            java.lang.Object r5 = r5.g     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            r7.<init>(r5)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            mn r5 = defpackage.is1.a(r1, r6, r7)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            r12.g = r5     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            iv1 r5 = r12.c     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            hs1 r5 = r5.j()     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            if (r5 == 0) goto L_0x00e3
            ls1 r5 = new ls1     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            r5.<init>(r1)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            r12.h = r5     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            boolean r5 = r13 instanceof defpackage.yt1     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            if (r5 == 0) goto L_0x00ab
            r5 = r13
            yt1 r5 = (defpackage.yt1) r5     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            zd2 r6 = r12.f     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            r5.a(r6)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            goto L_0x00ab
        L_0x00a5:
            r0 = move-exception
            goto L_0x01a3
        L_0x00a8:
            r0 = move-exception
            r6 = 0
            goto L_0x0110
        L_0x00ab:
            otf r5 = r12.a     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            zd2 r6 = r12.f     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            r5.K(r6)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            otf r5 = r12.a     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            defpackage.fv1.a(r1, r5, r0)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            r0 = 1
            if (r2 <= r0) goto L_0x00cb
            boolean r0 = defpackage.kne.a()     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "CX:CameraProvider-RetryStatus"
            java.lang.String r0 = defpackage.am7.C(r0)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            r5 = -1
            long r5 = (long) r5     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            android.os.Trace.setCounter(r0, r5)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
        L_0x00cb:
            java.lang.Object r5 = r12.b     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            monitor-enter(r5)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00a8 }
            r6 = 4
            r12.k = r6     // Catch:{ all -> 0x00dd }
            monitor-exit(r5)     // Catch:{ all -> 0x00dd }
            r6 = 0
            r3.b(r6)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
        L_0x00d6:
            android.os.Trace.endSection()
            goto L_0x019f
        L_0x00db:
            r0 = move-exception
            goto L_0x0110
        L_0x00dd:
            r0 = move-exception
            r6 = 0
        L_0x00df:
            monitor-exit(r5)     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
        L_0x00e1:
            r0 = move-exception
            goto L_0x00df
        L_0x00e3:
            r6 = 0
            androidx.camera.core.InitializationException r0 = new androidx.camera.core.InitializationException     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            java.lang.String r7 = "Invalid app configuration provided. Missing UseCaseConfigFactory."
            r5.<init>(r7)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            r0.<init>(r5)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            throw r0     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
        L_0x00f1:
            r6 = 0
            androidx.camera.core.InitializationException r0 = new androidx.camera.core.InitializationException     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            java.lang.String r7 = "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."
            r5.<init>(r7)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            r0.<init>(r5)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            throw r0     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
        L_0x00ff:
            r0 = move-exception
            r6 = r9
            goto L_0x0110
        L_0x0102:
            r6 = r9
            androidx.camera.core.InitializationException r0 = new androidx.camera.core.InitializationException     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            java.lang.String r7 = "Invalid app configuration provided. Missing CameraFactory."
            r5.<init>(r7)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            r0.<init>(r5)     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
            throw r0     // Catch:{ InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException -> 0x00db }
        L_0x0110:
            tu1 r5 = new tu1     // Catch:{ all -> 0x00a5 }
            r5.<init>(r14, r0)     // Catch:{ all -> 0x00a5 }
            ucc r7 = r12.i     // Catch:{ all -> 0x00a5 }
            tcc r7 = r7.b(r5)     // Catch:{ all -> 0x00a5 }
            boolean r8 = defpackage.kne.a()     // Catch:{ all -> 0x00a5 }
            if (r8 == 0) goto L_0x012d
            int r5 = r5.a     // Catch:{ all -> 0x00a5 }
            java.lang.String r8 = "CX:CameraProvider-RetryStatus"
            java.lang.String r8 = defpackage.am7.C(r8)     // Catch:{ all -> 0x00a5 }
            long r9 = (long) r5     // Catch:{ all -> 0x00a5 }
            android.os.Trace.setCounter(r8, r9)     // Catch:{ all -> 0x00a5 }
        L_0x012d:
            boolean r5 = r7.b     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x014f
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r5) goto L_0x014f
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00a5 }
            android.os.Handler r0 = r12.e     // Catch:{ all -> 0x00a5 }
            gv1 r4 = new gv1     // Catch:{ all -> 0x00a5 }
            r11 = r4
            r16 = r2
            r17 = r1
            r18 = r3
            r11.<init>((defpackage.hv1) r12, (java.util.concurrent.Executor) r13, (long) r14, (int) r16, (android.content.Context) r17, (defpackage.sn1) r18)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "retry_token"
            long r2 = r7.a     // Catch:{ all -> 0x00a5 }
            r0.postDelayed(r4, r1, r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x00d6
        L_0x014f:
            java.lang.Object r1 = r12.b     // Catch:{ all -> 0x00a5 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a5 }
            r2 = 3
            r12.k = r2     // Catch:{ all -> 0x01a0 }
            monitor-exit(r1)     // Catch:{ all -> 0x01a0 }
            boolean r1 = r7.c     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0169
            java.lang.Object r1 = r12.b     // Catch:{ all -> 0x00a5 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a5 }
            r2 = 4
            r12.k = r2     // Catch:{ all -> 0x0166 }
            monitor-exit(r1)     // Catch:{ all -> 0x0166 }
            r3.b(r6)     // Catch:{ all -> 0x00a5 }
            goto L_0x00d6
        L_0x0166:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0166 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x0169:
            boolean r1 = r0 instanceof androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x018c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r1.<init>(r4)     // Catch:{ all -> 0x00a5 }
            androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException r0 = (androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException) r0     // Catch:{ all -> 0x00a5 }
            int r0 = r0.a     // Catch:{ all -> 0x00a5 }
            r1.append(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a5 }
            androidx.camera.core.InitializationException r1 = new androidx.camera.core.InitializationException     // Catch:{ all -> 0x00a5 }
            androidx.camera.core.CameraUnavailableException r2 = new androidx.camera.core.CameraUnavailableException     // Catch:{ all -> 0x00a5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a5 }
            r1.<init>(r2)     // Catch:{ all -> 0x00a5 }
            r3.d(r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x00d6
        L_0x018c:
            boolean r1 = r0 instanceof androidx.camera.core.InitializationException     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0195
            r3.d(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x00d6
        L_0x0195:
            androidx.camera.core.InitializationException r1 = new androidx.camera.core.InitializationException     // Catch:{ all -> 0x00a5 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a5 }
            r3.d(r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x00d6
        L_0x019f:
            return
        L_0x01a0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01a0 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x01a3:
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv1.run():void");
    }

    public /* synthetic */ gv1(hv1 hv1, Executor executor, long j, int i, Context context, sn1 sn1) {
        this.b = hv1;
        this.c = executor;
        this.o = j;
        this.X = i;
        this.Y = context;
        this.Z = sn1;
    }
}
