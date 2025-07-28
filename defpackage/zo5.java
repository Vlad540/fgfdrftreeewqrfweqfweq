package defpackage;

/* renamed from: zo5  reason: default package */
public final /* synthetic */ class zo5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zo5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        defpackage.urd.l(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02e8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0438, code lost:
        if (r2.equals("errors.process.attachment.video.not.processed") == false) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0441, code lost:
        if (r2.equals("attachment.not.ready") == false) goto L_0x045c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            r0 = 3
            r1 = -1
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            int r6 = r13.a
            switch(r6) {
                case 0: goto L_0x0516;
                case 1: goto L_0x0506;
                case 2: goto L_0x04e8;
                case 3: goto L_0x04ba;
                case 4: goto L_0x04a9;
                case 5: goto L_0x0491;
                case 6: goto L_0x0485;
                case 7: goto L_0x0419;
                case 8: goto L_0x0382;
                case 9: goto L_0x0374;
                case 10: goto L_0x035c;
                case 11: goto L_0x034c;
                case 12: goto L_0x0327;
                case 13: goto L_0x030b;
                case 14: goto L_0x02ea;
                case 15: goto L_0x0212;
                case 16: goto L_0x01a1;
                case 17: goto L_0x0190;
                case 18: goto L_0x017c;
                case 19: goto L_0x016d;
                case 20: goto L_0x0120;
                case 21: goto L_0x00eb;
                case 22: goto L_0x00b0;
                case 23: goto L_0x0080;
                case 24: goto L_0x0065;
                case 25: goto L_0x0057;
                case 26: goto L_0x004b;
                case 27: goto L_0x003c;
                case 28: goto L_0x0027;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r13.b
            pqe r0 = (defpackage.pqe) r0
            r0.getClass()
            java.lang.Object r13 = r13.c
            java.lang.Exception r13 = (java.lang.Exception) r13
            boolean r1 = r13 instanceof androidx.media3.common.VideoFrameProcessingException
            if (r1 == 0) goto L_0x001d
            androidx.media3.common.VideoFrameProcessingException r13 = (androidx.media3.common.VideoFrameProcessingException) r13
            goto L_0x0021
        L_0x001d:
            androidx.media3.common.VideoFrameProcessingException r13 = androidx.media3.common.VideoFrameProcessingException.a(r13)
        L_0x0021:
            z4f r0 = r0.X
            r0.c(r13)
            return
        L_0x0027:
            java.lang.Object r0 = r13.b
            pqe r0 = (defpackage.pqe) r0
            r0.getClass()
            java.lang.Object r13 = r13.c
            java.lang.InterruptedException r13 = (java.lang.InterruptedException) r13
            androidx.media3.common.VideoFrameProcessingException r13 = androidx.media3.common.VideoFrameProcessingException.a(r13)
            z4f r0 = r0.X
            r0.c(r13)
            return
        L_0x003c:
            java.lang.Object r0 = r13.b
            d39 r0 = (defpackage.d39) r0
            r0.getClass()
            java.lang.Object r13 = r13.c
            mr6 r13 = (defpackage.mr6) r13
            r13.f(r0)
            return
        L_0x004b:
            java.lang.Object r0 = r13.b
            ts8 r0 = (ts8) r0
            java.lang.Object r13 = r13.c
            qs8 r13 = (qs8) r13
            r0.setLayout(r13)
            return
        L_0x0057:
            java.lang.Object r0 = r13.b
            me8 r0 = (defpackage.me8) r0
            nxc r0 = r0.e
            java.lang.Object r13 = r13.c
            ic8 r13 = (defpackage.ic8) r13
            r0.r(r13)
            return
        L_0x0065:
            java.lang.Object r0 = r13.b
            me8 r0 = (defpackage.me8) r0
            r0.getClass()
            java.lang.Object r13 = r13.c
            hn6 r13 = (defpackage.hn6) r13
            android.os.IBinder r13 = r13.asBinder()
            nxc r0 = r0.e
            ic8 r13 = r0.x(r13)
            if (r13 == 0) goto L_0x007f
            r0.V(r13)
        L_0x007f:
            return
        L_0x0080:
            java.lang.Object r0 = r13.b
            ue r0 = (defpackage.ue) r0
            java.lang.Object r0 = r0.i
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r13 = r13.c
            kc8 r13 = (defpackage.kc8) r13
            java.lang.Object r0 = r0.remove(r13)
            ch7 r0 = (defpackage.ch7) r0
            if (r0 == 0) goto L_0x00ab
            boolean r1 = r0.cancel(r3)
            if (r1 == 0) goto L_0x009b
            goto L_0x00ab
        L_0x009b:
            java.lang.Object r0 = swb.u(r0)     // Catch:{ CancellationException | ExecutionException -> 0x00a5 }
            r38 r0 = (defpackage.r38) r0     // Catch:{ CancellationException | ExecutionException -> 0x00a5 }
            r0.release()
            goto L_0x00ab
        L_0x00a5:
            r0 = move-exception
            java.lang.String r1 = "MediaController future failed (so we couldn't release it)"
            defpackage.ez3.k0(r1, r0)
        L_0x00ab:
            cd8 r13 = r13.a
            r13.v = r4
            return
        L_0x00b0:
            java.lang.Object r0 = r13.b
            cd8 r0 = (defpackage.cd8) r0
            ic8 r2 = r0.e()
            java.lang.Object r13 = r13.c
            android.content.Intent r13 = (android.content.Intent) r13
            if (r2 != 0) goto L_0x00df
            android.content.ComponentName r2 = r13.getComponent()
            if (r2 == 0) goto L_0x00c9
            java.lang.String r2 = r2.getPackageName()
            goto L_0x00cb
        L_0x00c9:
            java.lang.String r2 = "androidx.media3.session.MediaSessionService"
        L_0x00cb:
            ic8 r10 = new ic8
            pd8 r4 = new pd8
            r4.<init>(r2, r1, r1)
            android.os.Bundle r9 = android.os.Bundle.EMPTY
            r5 = 1004001300(0x3bd7d814, float:0.006587038)
            r8 = 0
            r6 = 6
            r7 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = r10
        L_0x00df:
            boolean r13 = r0.n(r2, r13)
            if (r13 != 0) goto L_0x00ea
            java.lang.String r13 = "Ignored unrecognized media button intent."
            defpackage.ez3.v(r13)
        L_0x00ea:
            return
        L_0x00eb:
            java.lang.Object r0 = r13.b
            ch7 r0 = (defpackage.ch7) r0
            java.lang.Object r0 = r0.get()     // Catch:{ CancellationException -> 0x00fd, InterruptedException | ExecutionException -> 0x00fb }
            p2d r0 = (defpackage.p2d) r0     // Catch:{ CancellationException -> 0x00fd, InterruptedException | ExecutionException -> 0x00fb }
            java.lang.String r2 = "SessionResult must not be null"
            defpackage.oyb.h(r0, r2)     // Catch:{ CancellationException -> 0x00fd, InterruptedException | ExecutionException -> 0x00fb }
            goto L_0x0114
        L_0x00fb:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fd:
            r0 = move-exception
            goto L_0x010a
        L_0x00ff:
            java.lang.String r2 = "Custom command failed"
            defpackage.ez3.k0(r2, r0)
            p2d r0 = new p2d
            r0.<init>(r1)
            goto L_0x0114
        L_0x010a:
            java.lang.String r1 = "Custom command cancelled"
            defpackage.ez3.k0(r1, r0)
            p2d r0 = new p2d
            r0.<init>(r5)
        L_0x0114:
            android.os.Bundle r1 = r0.b
            java.lang.Object r13 = r13.c
            android.os.ResultReceiver r13 = (android.os.ResultReceiver) r13
            int r0 = r0.a
            r13.send(r0, r1)
            return
        L_0x0120:
            java.lang.Object r0 = r13.b
            cd8 r0 = (defpackage.cd8) r0
            md8 r1 = r0.h
            java.lang.Object r13 = r13.c
            qza r13 = (defpackage.qza) r13
            r0.s = r13
            ad8 r2 = new ad8
            r2.<init>(r0, r13)
            r13.z(r2)
            r0.u = r2
            kd8 r2 = r1.h     // Catch:{ RemoteException -> 0x013c }
            r2.x(r3, r13)     // Catch:{ RemoteException -> 0x013c }
            goto L_0x0142
        L_0x013c:
            r2 = move-exception
            java.lang.String r3 = "Exception in using media1 API"
            defpackage.ez3.B(r3, r2)
        L_0x0142:
            vc8 r1 = r1.j
            qc8 r2 = r1.a
            android.media.session.MediaSession r2 = r2.a
            r2.setActive(r5)
            java.util.ArrayList r1 = r1.c
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L_0x0165
            fza r1 = r13.o()
            r0.r = r1
            eya r13 = r13.s()
            r0.f(r13)
            return
        L_0x0165:
            java.lang.Object r13 = r1.next()
            defpackage.hr1.r(r13)
            throw r4
        L_0x016d:
            java.lang.Object r0 = r13.b
            cd8 r0 = (defpackage.cd8) r0
            r0.getClass()
            java.lang.Object r13 = r13.c
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            r13.run()
            return
        L_0x017c:
            java.lang.Object r0 = r13.b
            cd8 r0 = (defpackage.cd8) r0
            boolean r0 = r0.o()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r13 = r13.c
            a4d r13 = (defpackage.a4d) r13
            r13.l(r0)
            return
        L_0x0190:
            java.lang.Object r0 = r13.b
            o48 r0 = (defpackage.o48) r0
            boolean r1 = r0.m
            if (r1 == 0) goto L_0x0199
            goto L_0x01a0
        L_0x0199:
            java.lang.Object r13 = r13.c
            y48 r13 = (defpackage.y48) r13
            r13.c(r0)
        L_0x01a0:
            return
        L_0x01a1:
            java.lang.Object r0 = r13.b
            u48 r0 = (defpackage.u48) r0
            java.lang.Object r13 = r13.c
            uc8 r13 = (defpackage.uc8) r13
            mn r1 = new mn
            android.content.Context r2 = r0.a
            r1.<init>((android.content.Context) r2, (defpackage.uc8) r13)
            r0.g = r1
            s48 r13 = r0.e
            r38 r0 = r0.b
            android.os.Handler r0 = r0.X
            if (r13 == 0) goto L_0x020a
            java.lang.Object r2 = r1.c
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.add(r13)
            if (r2 != 0) goto L_0x01c5
            goto L_0x0207
        L_0x01c5:
            if (r0 != 0) goto L_0x01cc
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
        L_0x01cc:
            r13.j(r0)
            java.lang.Object r1 = r1.b
            v38 r1 = (defpackage.v38) r1
            android.media.session.MediaController r2 = r1.a
            s38 r3 = r13.a
            r3.getClass()
            r2.registerCallback(r3, r0)
            java.lang.Object r0 = r1.b
            monitor-enter(r0)
            uc8 r2 = r1.e     // Catch:{ all -> 0x01fd }
            mn6 r2 = r2.a()     // Catch:{ all -> 0x01fd }
            if (r2 == 0) goto L_0x01ff
            u38 r3 = new u38     // Catch:{ all -> 0x01fd }
            r3.<init>(r13)     // Catch:{ all -> 0x01fd }
            java.util.HashMap r1 = r1.d     // Catch:{ all -> 0x01fd }
            r1.put(r13, r3)     // Catch:{ all -> 0x01fd }
            r13.c = r3     // Catch:{ all -> 0x01fd }
            r2.g0(r3)     // Catch:{ RemoteException -> 0x0206 }
            r1 = 13
            r13.i(r1, r4, r4)     // Catch:{ RemoteException -> 0x0206 }
            goto L_0x0206
        L_0x01fd:
            r13 = move-exception
            goto L_0x0208
        L_0x01ff:
            r13.c = r4     // Catch:{ all -> 0x01fd }
            java.util.ArrayList r1 = r1.c     // Catch:{ all -> 0x01fd }
            r1.add(r13)     // Catch:{ all -> 0x01fd }
        L_0x0206:
            monitor-exit(r0)     // Catch:{ all -> 0x01fd }
        L_0x0207:
            return
        L_0x0208:
            monitor-exit(r0)     // Catch:{ all -> 0x01fd }
            throw r13
        L_0x020a:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "callback must not be null"
            r13.<init>(r0)
            throw r13
        L_0x0212:
            java.lang.Object r1 = r13.c
            mn7 r1 = (mn7) r1
            java.lang.Object r13 = r13.b
            yn7 r13 = (yn7) r13
            r13.a(r2)
            java.lang.String r3 = defpackage.xs7.B()
            android.content.Context r6 = r13.a
            java.lang.String r7 = r6.getPackageName()
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x0230
            java.lang.String r3 = "tracer"
            goto L_0x024a
        L_0x0230:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "tracer-"
            r7.<init>(r8)
            r8 = 58
            r9 = 45
            java.lang.String r3 = r3.replace(r8, r9)
            java.lang.String r3 = android.net.Uri.encode(r3)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
        L_0x024a:
            java.io.File r7 = new java.io.File
            java.io.File r6 = r6.getCacheDir()
            r7.<init>(r6, r3)
            java.lang.String r3 = "logs"
            java.io.File r3 = defpackage.ng5.N(r7, r3)
            defpackage.h2g.t(r3)     // Catch:{ IOException -> 0x025d }
            goto L_0x0260
        L_0x025d:
            r3.toString()
        L_0x0260:
            int r6 = r13.e
            int r6 = defpackage.hr1.t(r6)
            java.lang.String r7 = "b.log"
            java.lang.String r8 = "a.log"
            if (r6 == 0) goto L_0x02ae
            r9 = 65536(0x10000, double:3.2379E-319)
            if (r6 == r5) goto L_0x0291
            if (r6 == r2) goto L_0x0274
            goto L_0x02c1
        L_0x0274:
            java.io.File r0 = r13.f
            if (r0 != 0) goto L_0x0279
            r0 = r4
        L_0x0279:
            long r6 = r0.length()
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02c1
            java.io.File r0 = defpackage.ng5.N(r3, r8)
            java.io.File[] r3 = new java.io.File[]{r0}
            dr9.a(r3)
            r13.f = r0
            r13.e = r2
            goto L_0x02c1
        L_0x0291:
            java.io.File r2 = r13.f
            if (r2 != 0) goto L_0x0296
            r2 = r4
        L_0x0296:
            long r11 = r2.length()
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x02c1
            java.io.File r2 = defpackage.ng5.N(r3, r7)
            java.io.File[] r3 = new java.io.File[]{r2}
            dr9.a(r3)
            r13.f = r2
            r13.e = r0
            goto L_0x02c1
        L_0x02ae:
            java.io.File r0 = defpackage.ng5.N(r3, r8)
            java.io.File r3 = defpackage.ng5.N(r3, r7)
            java.io.File[] r3 = new java.io.File[]{r0, r3}
            dr9.a(r3)
            r13.f = r0
            r13.e = r2
        L_0x02c1:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x02e9 }
            java.io.File r13 = r13.f     // Catch:{ IOException -> 0x02e9 }
            if (r13 != 0) goto L_0x02c8
            r13 = r4
        L_0x02c8:
            r0.<init>(r13, r5)     // Catch:{ IOException -> 0x02e9 }
            java.io.DataOutputStream r13 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x02e9 }
            r13.<init>(r0)     // Catch:{ IOException -> 0x02e9 }
            long r2 = r1.a     // Catch:{ all -> 0x02e2 }
            r13.writeLong(r2)     // Catch:{ all -> 0x02e2 }
            byte[] r0 = r1.b     // Catch:{ all -> 0x02e2 }
            int r1 = r0.length     // Catch:{ all -> 0x02e2 }
            r13.writeInt(r1)     // Catch:{ all -> 0x02e2 }
            r13.write(r0)     // Catch:{ all -> 0x02e2 }
            defpackage.urd.l(r13, r4)     // Catch:{ IOException -> 0x02e9 }
            goto L_0x02e9
        L_0x02e2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02e4 }
        L_0x02e4:
            r1 = move-exception
            defpackage.urd.l(r13, r0)     // Catch:{ IOException -> 0x02e9 }
            throw r1     // Catch:{ IOException -> 0x02e9 }
        L_0x02e9:
            return
        L_0x02ea:
            java.lang.Object r0 = r13.b
            jl7 r0 = (jl7) r0
            java.lang.Object r13 = r13.c
            at1 r13 = (at1) r13
            at1 r1 = r0.r
            if (r13 == r1) goto L_0x0307
            xwb r13 = r0.n
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Wrong camera capturer"
            r0.<init>(r1)
            java.lang.String r1 = "OKRTCLmsAdapter"
            java.lang.String r2 = "camera.switch.check"
            r13.reportException(r1, r2, r0)
            goto L_0x030a
        L_0x0307:
            r13.a()
        L_0x030a:
            return
        L_0x030b:
            java.lang.Object r0 = r13.b
            ai7 r0 = (defpackage.ai7) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.a
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x0318
            goto L_0x0326
        L_0x0318:
            java.lang.Object r13 = r13.c
            bi7 r13 = (defpackage.bi7) r13
            r13.getClass()
            ls9 r0 = r0.b
            java.lang.Object r13 = r13.a
            r0.a(r13)
        L_0x0326:
            return
        L_0x0327:
            java.lang.Object r0 = r13.b
            b2b r0 = (defpackage.b2b) r0
            java.lang.Object r0 = r0.b
            vb9 r0 = (defpackage.vb9) r0
            java.lang.Object r0 = r0.d()
            bi7 r0 = (defpackage.bi7) r0
            java.lang.Object r13 = r13.c
            sn1 r13 = (defpackage.sn1) r13
            if (r0 != 0) goto L_0x0346
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Observable has not yet been initialized with a value."
            r0.<init>(r1)
            r13.d(r0)
            goto L_0x034b
        L_0x0346:
            java.lang.Object r0 = r0.a
            r13.b(r0)
        L_0x034b:
            return
        L_0x034c:
            java.lang.Object r0 = r13.b
            b2b r0 = (defpackage.b2b) r0
            java.lang.Object r0 = r0.b
            vb9 r0 = (defpackage.vb9) r0
            java.lang.Object r13 = r13.c
            ai7 r13 = (defpackage.ai7) r13
            r0.j(r13)
            return
        L_0x035c:
            java.lang.Object r0 = r13.b
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            java.lang.Object r13 = r13.c
            android.view.View r13 = (android.view.View) r13
            r0.showSoftInput(r13, r5)
            return
        L_0x0374:
            int r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.a
            java.lang.Object r0 = r13.b
            com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService r0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService) r0
            java.lang.Object r13 = r13.c
            android.app.job.JobParameters r13 = (android.app.job.JobParameters) r13
            r0.jobFinished(r13, r3)
            return
        L_0x0382:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r3 = r13.b
            h7f r3 = (h7f) r3
            java.util.Map r3 = r3.b
            java.lang.String r5 = "DASH"
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x039b
            r12 = r6
            goto L_0x039c
        L_0x039b:
            r12 = r5
        L_0x039c:
            int r5 = r12.length()
            if (r5 <= 0) goto L_0x03af
            vb5 r5 = new vb5
            r10 = 0
            r11 = 0
            r8 = 2
            r9 = 0
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r1.add(r5)
        L_0x03af:
            java.lang.String r5 = "HLS"
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x03bb
            r12 = r6
            goto L_0x03bc
        L_0x03bb:
            r12 = r5
        L_0x03bc:
            int r5 = r12.length()
            if (r5 <= 0) goto L_0x03cf
            vb5 r5 = new vb5
            r10 = 0
            r11 = 0
            r8 = 1
            r9 = 0
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r1.add(r5)
        L_0x03cf:
            java.util.Set r3 = r3.entrySet()
            es r5 = new es
            r5.<init>(r2, r3)
            xz6 r3 = new xz6
            r3.<init>(r2)
            sg5 r2 = defpackage.myc.L(r5, r3)
            xz6 r3 = new xz6
            r3.<init>(r0)
            vqe r0 = new vqe
            r0.<init>(r2, r3)
            java.util.List r0 = defpackage.myc.U(r0)
            r1.addAll(r0)
            boolean r0 = r1.isEmpty()
            java.lang.Object r13 = r13.c
            zz6 r13 = (zz6) r13
            vw r13 = r13.k
            if (r0 == 0) goto L_0x040d
            ru.ok.messages.video.fetcher.FetcherException r0 = new ru.ok.messages.video.fetcher.FetcherException
            r1 = 4
            java.lang.String r2 = "failed to get internal link from video play cmd"
            r0.<init>(r1, r2)
            r13.onError(r0)
            r13.b()
            goto L_0x0418
        L_0x040d:
            xb5 r0 = new xb5
            r0.<init>(r4, r1)
            r13.c(r0)
            r13.b()
        L_0x0418:
            return
        L_0x0419:
            java.lang.Object r0 = r13.b
            jh0 r0 = (jh0) r0
            uae r1 = r0.b
            java.lang.String r2 = r1.b
            boolean r1 = r1 instanceof lae
            if (r1 == 0) goto L_0x0426
            goto L_0x045e
        L_0x0426:
            if (r2 == 0) goto L_0x045c
            int r1 = r2.hashCode()
            r5 = 9
            switch(r1) {
                case 212698279: goto L_0x0450;
                case 979732336: goto L_0x0444;
                case 1378132925: goto L_0x043b;
                case 1739785143: goto L_0x0432;
                default: goto L_0x0431;
            }
        L_0x0431:
            goto L_0x045c
        L_0x0432:
            java.lang.String r1 = "errors.process.attachment.video.not.processed"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x045e
            goto L_0x045c
        L_0x043b:
            java.lang.String r1 = "attachment.not.ready"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x045e
            goto L_0x045c
        L_0x0444:
            java.lang.String r1 = "video.offline"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x044d
            goto L_0x045c
        L_0x044d:
            r5 = 8
            goto L_0x045e
        L_0x0450:
            java.lang.String r1 = "not.found"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0459
            goto L_0x045c
        L_0x0459:
            r5 = 10
            goto L_0x045e
        L_0x045c:
            r5 = 11
        L_0x045e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "videoplay cmd failed "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "zz6"
            defpackage.udd.s(r1, r0, r4)
            ru.ok.messages.video.fetcher.FetcherException r0 = new ru.ok.messages.video.fetcher.FetcherException
            java.lang.String r1 = "videoplay cmd failed"
            r0.<init>(r5, r1)
            java.lang.Object r13 = r13.c
            zz6 r13 = (zz6) r13
            vw r13 = r13.k
            r13.onError(r0)
            r13.b()
            return
        L_0x0485:
            java.lang.Object r0 = r13.b
            wq6 r0 = (wq6) r0
            java.lang.Object r13 = r13.c
            java.lang.String r13 = (java.lang.String) r13
            r0.p(r13)
            return
        L_0x0491:
            java.lang.Object r0 = r13.c
            vde r0 = (defpackage.vde) r0
            java.lang.Object r13 = r13.b
            jq6 r13 = (defpackage.jq6) r13
            r13.getClass()
            android.graphics.Bitmap r13 = r13.m()     // Catch:{ Exception -> 0x04a4 }
            r0.b(r13)     // Catch:{ Exception -> 0x04a4 }
            goto L_0x04a8
        L_0x04a4:
            r13 = move-exception
            r0.a(r13)
        L_0x04a8:
            return
        L_0x04a9:
            java.lang.Object r0 = r13.b
            yic r0 = (defpackage.yic) r0
            r0.a()
            java.lang.Object r13 = r13.c
            yic r13 = (defpackage.yic) r13
            if (r13 == 0) goto L_0x04b9
            r13.a()
        L_0x04b9:
            return
        L_0x04ba:
            java.lang.Object r0 = r13.b
            yl6 r0 = (yl6) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.Y
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x04c7
            goto L_0x04e7
        L_0x04c7:
            java.lang.String r1 = "zl6"
            java.lang.String r2 = "onFileUploadCompleted: completed download"
            defpackage.udd.p(r1, r2, new java.lang.Object[0])
            java.lang.Object r13 = r13.c
            java.io.File r13 = (java.io.File) r13
            r13.length()
            vl6 r13 = new vl6
            r1 = 1120403456(0x42c80000, float:100.0)
            r13.<init>(r1, r5)
            bw9 r1 = r0.X
            r1.c(r13)
            r1.b()
            r0.c(r3)
        L_0x04e7:
            return
        L_0x04e8:
            java.lang.Object r0 = r13.b
            pj6 r0 = (defpackage.pj6) r0
            lv1 r0 = r0.c
            java.lang.Object r13 = r13.c
            ai6 r13 = (defpackage.ai6) r13
            android.net.Uri r13 = r13.B0
            java.lang.Object r0 = r0.b
            ci6 r0 = (defpackage.ci6) r0
            f84 r0 = r0.b
            java.util.HashMap r0 = r0.b
            java.lang.Object r13 = r0.get(r13)
            e84 r13 = (defpackage.e84) r13
            r13.c(r5)
            return
        L_0x0506:
            java.lang.Object r0 = r13.b
            android.content.Context r0 = (android.content.Context) r0
            itf r0 = defpackage.itf.d(r0)
            java.lang.Object r13 = r13.c
            cfa r13 = (defpackage.cfa) r13
            r0.a(r13)
            return
        L_0x0516:
            java.lang.Object r0 = r13.b
            bp5 r0 = (defpackage.bp5) r0
            java.lang.Object r13 = r13.c
            sn1 r13 = (defpackage.sn1) r13
            r0.d(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo5.run():void");
    }

    public /* synthetic */ zo5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj3;
    }
}
