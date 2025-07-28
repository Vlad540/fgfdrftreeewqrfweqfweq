package defpackage;

import android.content.Context;

/* renamed from: nm  reason: default package */
public final /* synthetic */ class nm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ nm(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: kd8} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x037d, code lost:
        if (r2 != null) goto L_0x0382;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x038c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            r1 = 14
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            int r6 = r0.a
            switch(r6) {
                case 0: goto L_0x0325;
                case 1: goto L_0x02eb;
                case 2: goto L_0x022e;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00bb;
                case 5: goto L_0x00ae;
                case 6: goto L_0x0013;
                default: goto L_0x000d;
            }
        L_0x000d:
            android.content.Context r0 = r0.b
            com.my.tracker.obfuscated.h0.d(r0)
            return
        L_0x0013:
            android.content.Context r0 = r0.b
            java.lang.String r1 = defpackage.xs7.B()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ Exception -> 0x00a9 }
            boolean r2 = r1.equals(r2)     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x0026
            java.lang.String r1 = "tracer"
            goto L_0x0040
        L_0x0026:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = "tracer-"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a9 }
            r3 = 58
            r4 = 45
            java.lang.String r1 = r1.replace(r3, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r1 = android.net.Uri.encode(r1)     // Catch:{ Exception -> 0x00a9 }
            r2.append(r1)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00a9 }
        L_0x0040:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00a9 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ Exception -> 0x00a9 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r0 = "perf-old.bin"
            java.io.File r0 = defpackage.ng5.N(r2, r0)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r1 = "perf-current.bin"
            java.io.File r1 = defpackage.ng5.N(r2, r1)     // Catch:{ Exception -> 0x00a9 }
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x005e
            defpackage.h2g.h(r0)     // Catch:{ Exception -> 0x00a9 }
        L_0x005e:
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x0079
            java.io.File r2 = r0.getParentFile()     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x006d
            defpackage.h2g.t(r2)     // Catch:{ Exception -> 0x00a9 }
        L_0x006d:
            defpackage.h2g.y(r1, r0)     // Catch:{ Exception -> 0x00a9 }
            pfe r2 = new pfe     // Catch:{ Exception -> 0x00a9 }
            r3 = 3
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x00a9 }
            koe.b(r2)     // Catch:{ Exception -> 0x00a9 }
        L_0x0079:
            hw9 r0 = new hw9     // Catch:{ Exception -> 0x00a9 }
            r0.<init>((java.io.File) r1)     // Catch:{ Exception -> 0x00a9 }
            goe r1 = hoe.b     // Catch:{ Exception -> 0x00a9 }
            boolean r2 = r1 instanceof eoe     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x009c
            eoe r1 = (eoe) r1     // Catch:{ Exception -> 0x00a9 }
            java.util.LinkedList r1 = r1.a     // Catch:{ Exception -> 0x00a9 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00a9 }
        L_0x008c:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x00a1
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00a9 }
            mma r2 = (mma) r2     // Catch:{ Exception -> 0x00a9 }
            r0.d(r2)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x008c
        L_0x009c:
            goe r1 = hoe.b     // Catch:{ Exception -> 0x00a9 }
            java.util.Objects.toString(r1)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a1:
            foe r1 = new foe     // Catch:{ Exception -> 0x00a9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00a9 }
            hoe.b = r1     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            ns7 r0 = ns7.Z
            hoe.b = r0
        L_0x00ad:
            return
        L_0x00ae:
            gr r1 = new gr
            r1.<init>(r2)
            s59 r2 = defpackage.hwf.b
            android.content.Context r0 = r0.b
            defpackage.hwf.z(r0, r1, r2, r5)
            return
        L_0x00bb:
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r12 = new java.util.concurrent.LinkedBlockingQueue
            r12.<init>()
            r7 = 0
            r8 = 1
            r9 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r11, r12)
            nm r2 = new nm
            android.content.Context r0 = r0.b
            r3 = 5
            r2.<init>(r0, r3)
            r1.execute(r2)
            return
        L_0x00d8:
            ff6 r2 = ff6.a
            java.lang.String r2 = "HEAP_DUMP_"
            android.content.Context r0 = r0.b
            ff6.c = r0
            java.io.File r0 = defpackage.gf6.k(r0)
            nne r6 = nne.a
            java.util.Map r6 = nne.c()
            x3a r7 = defpackage.n1g.c
            java.lang.Object r6 = r6.get(r7)
            boolean r7 = r6 instanceof bf6
            if (r7 == 0) goto L_0x00f7
            bf6 r6 = (bf6) r6
            goto L_0x00f8
        L_0x00f7:
            r6 = r3
        L_0x00f8:
            if (r6 != 0) goto L_0x0105
            u5g r6 = new u5g
            r6.<init>((int) r1, (boolean) r5)
            bf6 r1 = new bf6
            r1.<init>(r6)
            r6 = r1
        L_0x0105:
            java.lang.String r1 = "dump-tmp.hprof"
            java.io.File r1 = defpackage.ng5.N(r0, r1)
            ff6.a(r1)
            java.lang.String r1 = "dump-tmp-meta.json"
            java.io.File r1 = defpackage.ng5.N(r0, r1)
            ff6.a(r1)
            boolean r1 = r6.a
            java.lang.String r6 = "dump-meta.json"
            java.lang.String r7 = "dump.hprof"
            if (r1 != 0) goto L_0x0134
            java.io.File r1 = defpackage.ng5.N(r0, r7)
            ff6.a(r1)
            java.io.File r0 = defpackage.ng5.N(r0, r6)
            ff6.a(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = ff6.b
            r0.set(r5)
            goto L_0x022d
        L_0x0134:
            x93 r0 = new x93
            r0.<init>(r4)
            x87.z0(r0)
            java.lang.String r0 = "Dump from different buildUuid. Current "
            android.content.Context r1 = ff6.c
            if (r1 != 0) goto L_0x0144
            goto L_0x022d
        L_0x0144:
            java.io.File r5 = defpackage.gf6.k(r1)
            java.io.File r7 = defpackage.ng5.N(r5, r7)
            java.io.File r5 = defpackage.ng5.N(r5, r6)
            boolean r6 = r7.exists()
            if (r6 != 0) goto L_0x015e
            boolean r6 = r5.exists()
            if (r6 != 0) goto L_0x015e
            goto L_0x022d
        L_0x015e:
            java.lang.String r6 = defpackage.ng5.M(r5)     // Catch:{ Exception -> 0x0227 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0220 }
            r8.<init>(r6)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r6 = "buildUuid"
            java.lang.String r6 = r8.optString(r6)     // Catch:{ Exception -> 0x0220 }
            boolean r9 = defpackage.h0e.c0(r6)     // Catch:{ Exception -> 0x0220 }
            r9 = r9 ^ r4
            if (r9 == 0) goto L_0x0175
            goto L_0x0176
        L_0x0175:
            r6 = r3
        L_0x0176:
            java.lang.String r9 = "tag"
            java.lang.String r8 = r8.optString(r9)     // Catch:{ Exception -> 0x0220 }
            boolean r9 = defpackage.h0e.c0(r8)     // Catch:{ Exception -> 0x0220 }
            r9 = r9 ^ r4
            if (r9 == 0) goto L_0x0184
            goto L_0x0185
        L_0x0184:
            r8 = r3
        L_0x0185:
            defpackage.h2g.h(r5)     // Catch:{ Exception -> 0x0227 }
            kd8 r9 = nne.c     // Catch:{ Exception -> 0x0227 }
            if (r9 == 0) goto L_0x018d
            r3 = r9
        L_0x018d:
            java.lang.Object r3 = r3.c     // Catch:{ Exception -> 0x0227 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0227 }
            boolean r9 = defpackage.hhd.f(r6, r3)     // Catch:{ Exception -> 0x0227 }
            if (r9 == 0) goto L_0x0202
            java.lang.String r0 = ".bin"
            java.io.File r3 = defpackage.gf6.k(r1)     // Catch:{ Exception -> 0x0227 }
            defpackage.h2g.t(r3)     // Catch:{ Exception -> 0x0227 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0227 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x0227 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0227 }
            r6.append(r9)     // Catch:{ Exception -> 0x0227 }
            r6.append(r0)     // Catch:{ Exception -> 0x0227 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0227 }
            java.io.File r0 = defpackage.ng5.N(r3, r0)     // Catch:{ Exception -> 0x0227 }
            defpackage.h2g.y(r7, r0)     // Catch:{ Exception -> 0x0227 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0227 }
            r2.<init>()     // Catch:{ Exception -> 0x0227 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0227 }
            java.lang.String r3 = "param_dump_path"
            r2.put(r3, r0)     // Catch:{ Exception -> 0x0227 }
            java.lang.String r0 = "param_tag"
            r2.put(r0, r8)     // Catch:{ Exception -> 0x0227 }
            zy3 r0 = new zy3     // Catch:{ Exception -> 0x0227 }
            r0.<init>((java.util.Map) r2)     // Catch:{ Exception -> 0x0227 }
            defpackage.zy3.f(r0)     // Catch:{ Exception -> 0x0227 }
            bfa r2 = new bfa     // Catch:{ Exception -> 0x0227 }
            java.lang.Class<ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker> r3 = ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker.class
            r2.<init>(r3)     // Catch:{ Exception -> 0x0227 }
            androidx.work.WorkRequest$Builder r0 = r2.setInputData(r0)     // Catch:{ Exception -> 0x0227 }
            bfa r0 = (defpackage.bfa) r0     // Catch:{ Exception -> 0x0227 }
            androidx.work.WorkRequest r0 = r0.build()     // Catch:{ Exception -> 0x0227 }
            cfa r0 = (defpackage.cfa) r0     // Catch:{ Exception -> 0x0227 }
            r7e r2 = koe.a     // Catch:{ Exception -> 0x0227 }
            zo5 r2 = new zo5     // Catch:{ Exception -> 0x0227 }
            r2.<init>(r1, r4, r0)     // Catch:{ Exception -> 0x0227 }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x0227 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0227 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0227 }
            k30 r1 = new k30     // Catch:{ Exception -> 0x0227 }
            r3 = 6
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0227 }
            r0.post(r1)     // Catch:{ Exception -> 0x0227 }
            goto L_0x022d
        L_0x0202:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0227 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0227 }
            r1.append(r3)     // Catch:{ Exception -> 0x0227 }
            java.lang.String r0 = " != "
            r1.append(r0)     // Catch:{ Exception -> 0x0227 }
            r1.append(r6)     // Catch:{ Exception -> 0x0227 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0227 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0227 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0227 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0227 }
            throw r1     // Catch:{ Exception -> 0x0227 }
        L_0x0220:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0227 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0227 }
            throw r1     // Catch:{ Exception -> 0x0227 }
        L_0x0227:
            ff6.a(r7)
            ff6.a(r5)
        L_0x022d:
            return
        L_0x022e:
            android.content.Context r0 = r0.b
            ns7.o = r0
            nne r0 = nne.a
            java.util.Map r0 = nne.c()
            x3a r6 = defpackage.hwf.a
            java.lang.Object r0 = r0.get(r6)
            boolean r6 = r0 instanceof di4
            if (r6 == 0) goto L_0x0245
            di4 r0 = (di4) r0
            goto L_0x0246
        L_0x0245:
            r0 = r3
        L_0x0246:
            if (r0 != 0) goto L_0x0253
            lv1 r0 = new lv1
            r0.<init>(r1, r5)
            di4 r1 = new di4
            r1.<init>(r0)
            r0 = r1
        L_0x0253:
            boolean r0 = r0.a
            java.lang.String r1 = "tracer.disk.usage.worker"
            if (r0 != 0) goto L_0x0272
            android.content.Context r0 = ns7.o
            if (r0 != 0) goto L_0x025e
            goto L_0x025f
        L_0x025e:
            r3 = r0
        L_0x025f:
            itf r0 = defpackage.itf.d(r3)
            r0.getClass()
            tv1 r2 = new tv1
            r2.<init>(r0, r1, r4)
            bee r0 = r0.d
            r0.c(r2)
            goto L_0x02ea
        L_0x0272:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Map r4 = nne.c()
            x3a r5 = defpackage.xie.a
            java.lang.Object r4 = r4.get(r5)
            boolean r5 = r4 instanceof cu3
            if (r5 == 0) goto L_0x0288
            cu3 r4 = (cu3) r4
            goto L_0x0289
        L_0x0288:
            r4 = r3
        L_0x0289:
            if (r4 != 0) goto L_0x0295
            b2b r4 = new b2b
            r5 = 13
            r4.<init>((int) r5)
            r4.s()
        L_0x0295:
            java.util.Set r16 = defpackage.o23.w0(r0)
            if3 r0 = new if3
            r12 = -1
            r14 = -1
            r7 = 3
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r5 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "probability"
            r4.put(r6, r5)
            zy3 r5 = new zy3
            r5.<init>((java.util.Map) r4)
            defpackage.zy3.f(r5)
            xma r4 = new xma
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            java.lang.Class<ru.ok.tracer.disk.usage.DiskUsageWorker> r7 = ru.ok.tracer.disk.usage.DiskUsageWorker.class
            r8 = 1
            r4.<init>(r7, r8, r6)
            androidx.work.WorkRequest$Builder r4 = r4.setInputData(r5)
            xma r4 = (defpackage.xma) r4
            androidx.work.WorkRequest$Builder r0 = r4.setConstraints(r0)
            xma r0 = (defpackage.xma) r0
            androidx.work.WorkRequest r0 = r0.build()
            yma r0 = (defpackage.yma) r0
            android.content.Context r4 = ns7.o
            if (r4 != 0) goto L_0x02e2
            goto L_0x02e3
        L_0x02e2:
            r3 = r4
        L_0x02e3:
            itf r3 = defpackage.itf.d(r3)
            r3.b(r1, r2, r0)
        L_0x02ea:
            return
        L_0x02eb:
            ov7 r1 = new ov7
            android.content.Context r0 = r0.b
            r1.<init>(r0)
            int r2 = cic.b3
            pc r3 = r1.a
            android.content.Context r4 = r3.a
            java.lang.CharSequence r2 = r4.getText(r2)
            r3.d = r2
            int r2 = cic.c
            r1.b(r2)
            int r2 = cic.W1
            g00 r3 = new g00
            r3.<init>(r5, r0)
            ov7 r0 = r1.d(r2, r3)
            int r1 = cic.r
            h00 r2 = new h00
            r2.<init>(r5)
            pc r3 = r0.a
            android.content.Context r4 = r3.a
            java.lang.CharSequence r1 = r4.getText(r1)
            r3.k = r1
            r3.l = r2
            r0.a()
            return
        L_0x0325:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x03a4
            android.content.ComponentName r5 = new android.content.ComponentName
            android.content.Context r0 = r0.b
            java.lang.String r6 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r5.<init>(r0, r6)
            android.content.pm.PackageManager r6 = r0.getPackageManager()
            int r6 = r6.getComponentEnabledSetting(r5)
            if (r6 == r4) goto L_0x03a4
            java.lang.String r6 = "locale"
            if (r1 < r2) goto L_0x037b
            bs r1 = defpackage.rm.Z
            r1.getClass()
            ur r2 = new ur
            r2.<init>((defpackage.bs) r1)
        L_0x034c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x036a
            java.lang.Object r1 = r2.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            rm r1 = (defpackage.rm) r1
            if (r1 == 0) goto L_0x034c
            dn r1 = (defpackage.dn) r1
            android.content.Context r1 = r1.z0
            if (r1 == 0) goto L_0x034c
            java.lang.Object r3 = r1.getSystemService(r6)
        L_0x036a:
            if (r3 == 0) goto L_0x0380
            android.os.LocaleList r1 = defpackage.pm.a(r3)
            xl7 r2 = new xl7
            yl7 r3 = new yl7
            r3.<init>(r1)
            r2.<init>(r3)
            goto L_0x0382
        L_0x037b:
            xl7 r2 = defpackage.rm.c
            if (r2 == 0) goto L_0x0380
            goto L_0x0382
        L_0x0380:
            xl7 r2 = defpackage.xl7.b
        L_0x0382:
            yl7 r1 = r2.a
            android.os.LocaleList r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x039d
            java.lang.String r1 = pa2.G(r0)
            java.lang.Object r2 = r0.getSystemService(r6)
            if (r2 == 0) goto L_0x039d
            android.os.LocaleList r1 = defpackage.om.a(r1)
            defpackage.pm.b(r2, r1)
        L_0x039d:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r0.setComponentEnabledSetting(r5, r4, r4)
        L_0x03a4:
            defpackage.rm.Y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm.run():void");
    }
}
