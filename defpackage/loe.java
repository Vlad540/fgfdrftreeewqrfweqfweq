package defpackage;

import java.lang.Thread;

/* renamed from: loe  reason: default package */
public final class loe implements Thread.UncaughtExceptionHandler {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (vx3.c(r10, "system." + "CRASH_REPORT" + ".shutdown.until.ts") != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            boolean r9 = defpackage.nne.b
            if (r9 == 0) goto L_0x0006
            goto L_0x00cc
        L_0x0006:
            kv2 r9 = defpackage.sne.b     // Catch:{ IllegalStateException -> 0x00cc }
            if (r9 == 0) goto L_0x00c0
            boolean r10 = defpackage.nne.b
            if (r10 == 0) goto L_0x0010
            goto L_0x00cc
        L_0x0010:
            java.lang.Object r10 = r9.b
            i3d r10 = (defpackage.i3d) r10
            r10.getClass()
            r0 = 0
            r1 = 6
            r2 = 2
            r3 = 0
            defpackage.i3d.d(r10, r2, r3, r0, r1)
            v2b r10 = defpackage.xhd.a
            if (r10 == 0) goto L_0x00b8
            java.lang.String r0 = "system.shutdown.until.ts"
            boolean r0 = vx3.c(r10, r0)
            r1 = 1
            if (r0 == 0) goto L_0x002d
        L_0x002b:
            r3 = r1
            goto L_0x0049
        L_0x002d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "system."
            r0.<init>(r2)
            java.lang.String r2 = "CRASH_REPORT"
            r0.append(r2)
            java.lang.String r2 = ".shutdown.until.ts"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r10 = vx3.c(r10, r0)
            if (r10 == 0) goto L_0x0049
            goto L_0x002b
        L_0x0049:
            if (r3 == 0) goto L_0x004d
            goto L_0x00cc
        L_0x004d:
            java.lang.Object r10 = r9.a
            r2 = r10
            mv4 r2 = (defpackage.mv4) r2
            java.lang.Object r10 = r9.b
            i3d r10 = (defpackage.i3d) r10
            c9e r5 = r10.c()
            java.lang.Object r10 = r9.c
            u9e r10 = (defpackage.u9e) r10
            java.util.ArrayList r0 = r10.e
            monitor-enter(r0)
            java.util.ArrayList r10 = r10.e     // Catch:{ all -> 0x00b5 }
            java.util.List r6 = o23.s0(r10)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r0)
            java.util.Map r7 = java.lang.Thread.getAllStackTraces()
            java.lang.Object r10 = r9.o
            yn7 r10 = (defpackage.yn7) r10
            java.util.concurrent.ConcurrentLinkedQueue r10 = r10.h
            java.util.List r8 = o23.s0(r10)
            r3 = 1
            r4 = r11
            mv3 r10 = r2.M(r3, r4, r5, r6, r7, r8)
            if (r10 == 0) goto L_0x00cc
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch
            r11.<init>(r1)
            g5 r0 = new g5
            r1 = 17
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (int) r1)
            defpackage.koe.b(r0)
            android.os.Looper r10 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r10 = hhd.f(r10, r0)
            if (r10 == 0) goto L_0x009e
            r0 = 5000(0x1388, double:2.4703E-320)
            goto L_0x00a1
        L_0x009e:
            r0 = 100000000(0x5f5e100, double:4.94065646E-316)
        L_0x00a1:
            java.lang.Object r9 = r9.X
            j3d r9 = (defpackage.j3d) r9
            r9.getClass()
            android.os.ConditionVariable r9 = r9.a     // Catch:{ Exception -> 0x00af }
            if (r9 == 0) goto L_0x00af
            r9.block(r0)     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r11.await(r0, r9)
            goto L_0x00cc
        L_0x00b5:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L_0x00b8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Tracer settings are not initialized."
            r9.<init>(r10)
            throw r9
        L_0x00c0:
            java.lang.String r9 = "Required value was null."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x00cc }
            java.lang.String r9 = r9.toString()     // Catch:{ IllegalStateException -> 0x00cc }
            r10.<init>(r9)     // Catch:{ IllegalStateException -> 0x00cc }
            throw r10     // Catch:{ IllegalStateException -> 0x00cc }
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.loe.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
