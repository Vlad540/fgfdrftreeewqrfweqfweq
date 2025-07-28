package defpackage;

import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: vr2  reason: default package */
public final /* synthetic */ class vr2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ vr2(t4b t4b, btf btf) {
        this.a = 2;
        this.c = t4b;
        this.o = btf;
        this.b = false;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [mr5, ig7] */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = r0.Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2 = (defpackage.i4f) ((java.util.ArrayDeque) r0.w0).poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        if (r2 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        r2.run();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r0 = 1
            int r1 = r8.a
            switch(r1) {
                case 0: goto L_0x0162;
                case 1: goto L_0x0125;
                case 2: goto L_0x0117;
                case 3: goto L_0x00bf;
                case 4: goto L_0x007b;
                case 5: goto L_0x006d;
                case 6: goto L_0x002f;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r8.c
            hxf r0 = (hxf) r0
            dhc r0 = r0.a
            java.util.concurrent.atomic.AtomicReference r1 = r0.b
            java.lang.Object r1 = r1.get()
            az3 r1 = (az3) r1
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.j
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x002e
            java.lang.Object r2 = r8.o
            az3 r2 = (az3) r2
            if (r1 == r2) goto L_0x0023
            goto L_0x002e
        L_0x0023:
            boolean r8 = r8.b
            if (r8 == 0) goto L_0x002b
            r0.b()
            goto L_0x002e
        L_0x002b:
            r0.a()
        L_0x002e:
            return
        L_0x002f:
            java.lang.Object r0 = r8.c
            ew0 r0 = (defpackage.ew0) r0
            boolean r1 = r8.b
            java.lang.Object r8 = r8.o
            i4f r8 = (defpackage.i4f) r8
            r0.getClass()
            java.lang.Object r2 = r0.Z     // Catch:{ Exception -> 0x005e }
            monitor-enter(r2)     // Catch:{ Exception -> 0x005e }
            boolean r3 = r0.Y     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0049
            if (r1 != 0) goto L_0x0049
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            goto L_0x006c
        L_0x0047:
            r8 = move-exception
            goto L_0x0067
        L_0x0049:
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
        L_0x004a:
            java.lang.Object r1 = r0.Z     // Catch:{ Exception -> 0x005e }
            monitor-enter(r1)     // Catch:{ Exception -> 0x005e }
            java.lang.Object r2 = r0.w0     // Catch:{ all -> 0x0064 }
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch:{ all -> 0x0064 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0064 }
            i4f r2 = (defpackage.i4f) r2     // Catch:{ all -> 0x0064 }
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x0060
            r8.run()     // Catch:{ Exception -> 0x005e }
            goto L_0x006c
        L_0x005e:
            r8 = move-exception
            goto L_0x0069
        L_0x0060:
            r2.run()     // Catch:{ Exception -> 0x005e }
            goto L_0x004a
        L_0x0064:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ Exception -> 0x005e }
        L_0x0067:
            monitor-exit(r2)     // Catch:{ all -> 0x0047 }
            throw r8     // Catch:{ Exception -> 0x005e }
        L_0x0069:
            r0.e(r8)
        L_0x006c:
            return
        L_0x006d:
            java.lang.Object r0 = r8.c
            ene r0 = (defpackage.ene) r0
            java.lang.Object r1 = r8.o
            sn1 r1 = (defpackage.sn1) r1
            boolean r8 = r8.b
            r0.a(r1, r8)
            return
        L_0x007b:
            java.lang.Object r1 = r8.o
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r2 = r8.b
            java.lang.Object r8 = r8.c
            nae r8 = (nae) r8
            r8.getClass()
            java.lang.String r3 = "nae"
            long r4 = java.lang.System.currentTimeMillis()
            r8.g(r1, r2)     // Catch:{ Exception -> 0x0092 }
            goto L_0x00a4
        L_0x0092:
            r2 = move-exception
            java.lang.String r6 = "sync exception"
            defpackage.udd.s(r3, r6, r2)
            ru.ok.tamtam.util.HandledException r6 = new ru.ok.tamtam.util.HandledException
            r6.<init>(r2)
            g15 r8 = r8.j
            r4a r8 = (defpackage.r4a) r8
            r8.c(r6, r0)
        L_0x00a4:
            long r6 = java.lang.System.currentTimeMillis()
            int r8 = r1.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            long r6 = r6 - r4
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            java.lang.String r0 = "syncWorker: sync %d ids done for %d"
            defpackage.udd.p(r3, r0, r8)
            return
        L_0x00bf:
            java.lang.Object r1 = r8.c
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r8.o
            vde r2 = (defpackage.vde) r2
            r3 = 0
            int r4 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x00e0 }
            android.content.pm.ApplicationInfo r5 = r1.getApplicationInfo()     // Catch:{ all -> 0x00e0 }
            int r5 = r5.uid     // Catch:{ all -> 0x00e0 }
            if (r4 != r5) goto L_0x00d6
            r4 = r0
            goto L_0x00d7
        L_0x00d6:
            r4 = 0
        L_0x00d7:
            if (r4 != 0) goto L_0x00e2
            r1.getPackageName()     // Catch:{ all -> 0x00e0 }
        L_0x00dc:
            r2.d(r3)
            goto L_0x0112
        L_0x00e0:
            r8 = move-exception
            goto L_0x0113
        L_0x00e2:
            android.content.SharedPreferences r4 = defpackage.udd.B(r1)     // Catch:{ all -> 0x00e0 }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x00e0 }
            java.lang.String r5 = "proxy_notification_initialized"
            r4.putBoolean(r5, r0)     // Catch:{ all -> 0x00e0 }
            r4.apply()     // Catch:{ all -> 0x00e0 }
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x00e0 }
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch:{ all -> 0x00e0 }
            boolean r8 = r8.b
            java.lang.String r1 = "com.google.android.gms"
            if (r8 == 0) goto L_0x0104
            r0.setNotificationDelegate(r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x00dc
        L_0x0104:
            java.lang.String r8 = r0.getNotificationDelegate()     // Catch:{ all -> 0x00e0 }
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x00e0 }
            if (r8 == 0) goto L_0x00dc
            r0.setNotificationDelegate(r3)     // Catch:{ all -> 0x00e0 }
            goto L_0x00dc
        L_0x0112:
            return
        L_0x0113:
            r2.d(r3)
            throw r8
        L_0x0117:
            java.lang.Object r0 = r8.c
            t4b r0 = (defpackage.t4b) r0
            java.lang.Object r1 = r8.o
            btf r1 = (defpackage.btf) r1
            boolean r8 = r8.b
            r0.b(r1, r8)
            return
        L_0x0125:
            java.lang.Object r0 = r8.c
            bp5 r0 = (defpackage.bp5) r0
            boolean r1 = r8.b
            java.lang.Object r8 = r8.o
            sn1 r8 = (defpackage.sn1) r8
            zq1 r2 = r0.a
            ap5 r3 = r0.w
            xq1 r2 = r2.b
            java.lang.Object r2 = r2.b
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.remove(r3)
            r0.v = r1
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x014f
            if (r8 == 0) goto L_0x0161
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "Camera is not active."
            r0.<init>(r1)
            r8.d(r0)
            goto L_0x0161
        L_0x014f:
            zq1 r1 = r0.a
            long r1 = r1.A()
            ap5 r3 = new ap5
            r3.<init>(r0, r1, r8)
            r0.w = r3
            zq1 r8 = r0.a
            r8.p(r3)
        L_0x0161:
            return
        L_0x0162:
            k77[] r1 = one.me.chats.search.ChatsListSearchScreen.N0
            boolean r1 = r8.b
            java.lang.Object r2 = r8.c
            one.me.chats.search.ChatsListSearchScreen r2 = (one.me.chats.search.ChatsListSearchScreen) r2
            if (r1 == 0) goto L_0x016f
            r2.p0()
        L_0x016f:
            t97 r1 = r2.w0
            java.lang.Object r1 = r1.getValue()
            xf0 r1 = (defpackage.xf0) r1
            t0c r1 = r1.w0
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            mr5 r3 = r2.H0
            r3.E(r1)
            java.lang.Object r8 = r8.o
            dp6 r8 = (defpackage.dp6) r8
            java.util.List r1 = r8.b
            boolean r3 = r1.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x019a
            p2c r0 = defpackage.p2c.a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L_0x019c
        L_0x019a:
            hw4 r0 = defpackage.hw4.a
        L_0x019c:
            cpf r3 = r2.A0
            r3.E(r0)
            tn3 r0 = r2.B0
            r0.E(r1)
            cpf r0 = r2.C0
            java.util.List r8 = r8.c
            r0.E(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr2.run():void");
    }

    public /* synthetic */ vr2(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
    }

    public /* synthetic */ vr2(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.o = obj2;
    }

    public /* synthetic */ vr2(boolean z, ChatsListSearchScreen chatsListSearchScreen, dp6 dp6) {
        this.a = 0;
        this.b = z;
        this.c = chatsListSearchScreen;
        this.o = dp6;
    }
}
