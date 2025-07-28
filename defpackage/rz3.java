package defpackage;

import java.util.concurrent.Callable;

/* renamed from: rz3  reason: default package */
public final /* synthetic */ class rz3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rz3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v23, types: [java.lang.Object, e06] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r10 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            int r3 = r10.a
            switch(r3) {
                case 0: goto L_0x0235;
                case 1: goto L_0x01e8;
                case 2: goto L_0x01db;
                case 3: goto L_0x01c5;
                case 4: goto L_0x011c;
                case 5: goto L_0x0077;
                case 6: goto L_0x0068;
                case 7: goto L_0x0057;
                case 8: goto L_0x0046;
                case 9: goto L_0x0015;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r0 = r10.b
            org.webrtc.audio.WebRtcAudioRecord r0 = (org.webrtc.audio.WebRtcAudioRecord) r0
            java.lang.Object r10 = r10.c
            android.media.AudioRecord r10 = (android.media.AudioRecord) r10
            java.lang.String r10 = org.webrtc.audio.WebRtcAudioRecord.a(r0, r10)
            return r10
        L_0x0015:
            java.lang.Object r0 = r10.b
            j3f r0 = (j3f) r0
            r0.getClass()
            java.lang.Object r10 = r10.c
            a3f r10 = (a3f) r10
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r2 = "j3f"
            java.lang.String r3 = "newConversion: for data = %s"
            defpackage.udd.p(r2, r3, r1)
            e06 r1 = new e06
            r1.<init>()
            bf5 r0 = r0.c
            java.lang.String r2 = "mp4"
            java.io.File r0 = r0.a(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            r1.o = r0
            r1.b = r10
            z2f r10 = new z2f
            r10.<init>(r1)
            return r10
        L_0x0046:
            java.lang.Object r0 = r10.b
            yfe r0 = (yfe) r0
            q16 r0 = r0.a
            java.lang.Object r10 = r10.c
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.Object r10 = r0.get(r10)
            xfe r10 = (xfe) r10
            return r10
        L_0x0057:
            java.lang.Object r0 = r10.b
            jee r0 = (jee) r0
            java.lang.Object r10 = r10.c
            java.util.List r10 = (java.util.List) r10
            long r0 = r0.b(r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            return r10
        L_0x0068:
            java.lang.Object r0 = r10.b
            jic r0 = (jic) r0
            uk r0 = r0.a
            java.lang.Object r10 = r10.c
            yk r10 = (yk) r10
            java.lang.Object r10 = r0.a(r10)
            return r10
        L_0x0077:
            java.lang.Object r0 = r10.b
            vs7 r0 = (vs7) r0
            r0.getClass()
            long r3 = java.lang.System.nanoTime()
            fq3 r0 = r0.s
            java.lang.Object r0 = r0.get()
            csc r0 = (csc) r0
            java.lang.Object r10 = r10.c
            java.lang.String r10 = (java.lang.String) r10
            java.util.List r10 = r0.a(r10)
            zb9 r0 = new zb9
            r0.<init>((java.lang.Object) r2)
            zb9 r1 = new zb9
            r1.<init>((java.lang.Object) r2)
            zb9 r5 = new zb9
            r5.<init>((java.lang.Object) r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r10.size()
            r2.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x00ae:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0101
            java.lang.Object r6 = r10.next()
            prc r6 = (prc) r6
            i22 r7 = r6.o
            if (r7 == 0) goto L_0x00d1
            long r7 = r7.a
            boolean r7 = r0.d(r7)
            if (r7 != 0) goto L_0x00d1
            i22 r7 = r6.o
            long r7 = r7.a
            r0.a(r7)
            r2.add(r6)
            goto L_0x00ae
        L_0x00d1:
            tf3 r7 = r6.X
            if (r7 == 0) goto L_0x00ea
            long r8 = r7.n()
            boolean r8 = r1.d(r8)
            if (r8 != 0) goto L_0x00ea
            long r7 = r7.n()
            r1.a(r7)
            r2.add(r6)
            goto L_0x00ae
        L_0x00ea:
            ym8 r7 = r6.Y
            if (r7 == 0) goto L_0x00fd
            long r7 = r7.a
            boolean r9 = r5.d(r7)
            if (r9 != 0) goto L_0x00fd
            r5.a(r7)
            r2.add(r6)
            goto L_0x00ae
        L_0x00fd:
            r2.add(r6)
            goto L_0x00ae
        L_0x0101:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r3
            long r0 = r10.toMillis(r0)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "vs7"
            java.lang.String r1 = "localSearchWorker, local search finish: %d ms"
            defpackage.udd.I(r0, r1, r10)
            return r2
        L_0x011c:
            java.lang.Object r3 = r10.b
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r10 = r10.c
            android.content.Intent r10 = (android.content.Intent) r10
            b0d r4 = defpackage.b0d.t()
            java.lang.Object r5 = r4.X
            java.util.ArrayDeque r5 = (java.util.ArrayDeque) r5
            r5.offer(r10)
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r5 = "com.google.firebase.MESSAGING_EVENT"
            r10.<init>(r5)
            java.lang.String r5 = r3.getPackageName()
            r10.setPackage(r5)
            monitor-enter(r4)
            java.lang.Object r5 = r4.b     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0187 }
            if (r5 == 0) goto L_0x0147
            monitor-exit(r4)
            r2 = r5
            goto L_0x0197
        L_0x0147:
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ all -> 0x0187 }
            android.content.pm.ResolveInfo r1 = r5.resolveService(r10, r1)     // Catch:{ all -> 0x0187 }
            if (r1 == 0) goto L_0x0196
            android.content.pm.ServiceInfo r1 = r1.serviceInfo     // Catch:{ all -> 0x0187 }
            if (r1 != 0) goto L_0x0156
            goto L_0x0196
        L_0x0156:
            java.lang.String r5 = r3.getPackageName()     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = r1.packageName     // Catch:{ all -> 0x0187 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0187 }
            if (r5 == 0) goto L_0x0194
            java.lang.String r5 = r1.name     // Catch:{ all -> 0x0187 }
            if (r5 != 0) goto L_0x0167
            goto L_0x0194
        L_0x0167:
            java.lang.String r2 = "."
            boolean r2 = r5.startsWith(r2)     // Catch:{ all -> 0x0187 }
            if (r2 == 0) goto L_0x0189
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r2.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = r3.getPackageName()     // Catch:{ all -> 0x0187 }
            r2.append(r5)     // Catch:{ all -> 0x0187 }
            java.lang.String r1 = r1.name     // Catch:{ all -> 0x0187 }
            r2.append(r1)     // Catch:{ all -> 0x0187 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0187 }
            r4.b = r1     // Catch:{ all -> 0x0187 }
            goto L_0x018d
        L_0x0187:
            r10 = move-exception
            goto L_0x01c3
        L_0x0189:
            java.lang.String r1 = r1.name     // Catch:{ all -> 0x0187 }
            r4.b = r1     // Catch:{ all -> 0x0187 }
        L_0x018d:
            java.lang.Object r1 = r4.b     // Catch:{ all -> 0x0187 }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0187 }
            monitor-exit(r4)
            goto L_0x0197
        L_0x0194:
            monitor-exit(r4)
            goto L_0x0197
        L_0x0196:
            monitor-exit(r4)
        L_0x0197:
            if (r2 == 0) goto L_0x01a0
            java.lang.String r1 = r3.getPackageName()
            r10.setClassName(r1, r2)
        L_0x01a0:
            boolean r1 = r4.w(r3)     // Catch:{ SecurityException -> 0x01bc, IllegalStateException -> 0x01ab }
            if (r1 == 0) goto L_0x01ad
            android.content.ComponentName r10 = defpackage.kef.c(r3, r10)     // Catch:{ SecurityException -> 0x01bc, IllegalStateException -> 0x01ab }
            goto L_0x01b1
        L_0x01ab:
            r10 = move-exception
            goto L_0x01b6
        L_0x01ad:
            android.content.ComponentName r10 = r3.startService(r10)     // Catch:{ SecurityException -> 0x01bc, IllegalStateException -> 0x01ab }
        L_0x01b1:
            if (r10 != 0) goto L_0x01be
            r0 = 404(0x194, float:5.66E-43)
            goto L_0x01be
        L_0x01b6:
            r10.toString()
            r0 = 402(0x192, float:5.63E-43)
            goto L_0x01be
        L_0x01bc:
            r0 = 401(0x191, float:5.62E-43)
        L_0x01be:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            return r10
        L_0x01c3:
            monitor-exit(r4)     // Catch:{ all -> 0x0187 }
            throw r10
        L_0x01c5:
            java.lang.Object r0 = r10.b
            w95 r0 = (w95) r0
            pk r0 = r0.a
            gy9 r0 = (gy9) r0
            java.lang.Object r10 = r10.c
            long[] r10 = (long[]) r10
            r1 = 5
            long r0 = r0.f(r1, r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            return r10
        L_0x01db:
            java.lang.Object r0 = r10.b
            org.webrtc.EglBase$Context r0 = (org.webrtc.EglBase.Context) r0
            java.lang.Object r10 = r10.c
            int[] r10 = (int[]) r10
            org.webrtc.EglBase$EglConnection r10 = org.webrtc.EglThread.a(r0, r10)
            return r10
        L_0x01e8:
            java.lang.Object r2 = r10.c
            r4 = r2
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.Object r10 = r10.b
            sz3 r10 = (defpackage.sz3) r10
            nz3 r2 = r10.b
            qz3 r2 = r2.a()
            android.graphics.BitmapFactory$Options r10 = r10.c
            yz3 r9 = new yz3     // Catch:{ all -> 0x0230 }
            r5 = 0
            r7 = -1
            r3 = r9
            r3.<init>(r4, r5, r7)     // Catch:{ all -> 0x0230 }
            r2.G(r9)     // Catch:{ all -> 0x0230 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0230 }
            r4 = r3
            r3 = r1
        L_0x020c:
            if (r1 == r0) goto L_0x0223
            int r1 = r4.length     // Catch:{ all -> 0x0230 }
            if (r3 != r1) goto L_0x0219
            int r1 = r4.length     // Catch:{ all -> 0x0230 }
            int r1 = r1 * 2
            byte[] r1 = java.util.Arrays.copyOf(r4, r1)     // Catch:{ all -> 0x0230 }
            r4 = r1
        L_0x0219:
            int r1 = r4.length     // Catch:{ all -> 0x0230 }
            int r1 = r1 - r3
            int r1 = r2.read(r4, r3, r1)     // Catch:{ all -> 0x0230 }
            if (r1 == r0) goto L_0x020c
            int r3 = r3 + r1
            goto L_0x020c
        L_0x0223:
            byte[] r0 = java.util.Arrays.copyOf(r4, r3)     // Catch:{ all -> 0x0230 }
            int r1 = r0.length     // Catch:{ all -> 0x0230 }
            android.graphics.Bitmap r10 = defpackage.e07.q(r0, r1, r10)     // Catch:{ all -> 0x0230 }
            r2.close()
            return r10
        L_0x0230:
            r10 = move-exception
            r2.close()
            throw r10
        L_0x0235:
            java.lang.Object r0 = r10.b
            sz3 r0 = (defpackage.sz3) r0
            r0.getClass()
            java.lang.Object r10 = r10.c
            byte[] r10 = (byte[]) r10
            int r1 = r10.length
            android.graphics.BitmapFactory$Options r0 = r0.c
            android.graphics.Bitmap r10 = defpackage.e07.q(r10, r1, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz3.call():java.lang.Object");
    }
}
