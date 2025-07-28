package defpackage;

import one.me.android.OneMeApplication;

/* renamed from: ly9  reason: default package */
public final /* synthetic */ class ly9 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeApplication b;

    public /* synthetic */ ly9(OneMeApplication oneMeApplication, int i) {
        this.a = i;
        this.b = oneMeApplication;
    }

    /* JADX WARNING: type inference failed for: r3v17, types: [i26, l5e] */
    /* JADX WARNING: type inference failed for: r4v21, types: [i26, l5e] */
    /* JADX WARNING: type inference failed for: r0v93, types: [android.app.Application$ActivityLifecycleCallbacks, ry9] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x05ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r17 = this;
            r1 = r17
            java.lang.Class<vf4> r0 = vf4.class
            r2 = 17
            r3 = -1
            java.lang.Class<vqc> r5 = vqc.class
            r6 = 0
            java.lang.Class<lqc> r7 = lqc.class
            r8 = 5
            r9 = 2
            r10 = 3
            r11 = 0
            r12 = 1
            int r13 = r1.a
            switch(r13) {
                case 0: goto L_0x063b;
                case 1: goto L_0x0505;
                case 2: goto L_0x04f7;
                case 3: goto L_0x04eb;
                case 4: goto L_0x04df;
                case 5: goto L_0x04b9;
                case 6: goto L_0x04a1;
                case 7: goto L_0x047e;
                case 8: goto L_0x045e;
                case 9: goto L_0x0435;
                case 10: goto L_0x041b;
                case 11: goto L_0x040d;
                case 12: goto L_0x031e;
                case 13: goto L_0x0188;
                case 14: goto L_0x0161;
                case 15: goto L_0x0121;
                case 16: goto L_0x00f4;
                case 17: goto L_0x0071;
                default: goto L_0x0017;
            }
        L_0x0017:
            int r0 = one.me.android.OneMeApplication.w0
            o2a r0 = defpackage.o2a.a
            w4 r0 = r0.getAccessor()
            java.lang.Class<o4a> r2 = o4a.class
            java.lang.Object r0 = r0.c(r2)
            o4a r0 = (o4a) r0
            h37 r2 = defpackage.lp.a()
            nqc r3 = nqc.a
            w4 r4 = r3.getAccessor()
            java.lang.Class<ku3> r5 = defpackage.ku3.class
            java.lang.Object r4 = r4.c(r5)
            ku3 r4 = (defpackage.ku3) r4
            hu3 r2 = r2.plus((defpackage.hu3) r4)
            pae r3 = r3.s()
            n3a r3 = (defpackage.n3a) r3
            zr7 r3 = r3.c()
            zr7 r3 = r3.getImmediate()
            hu3 r2 = r2.plus(r3)
            kotlinx.coroutines.internal.ContextScope r2 = defpackage.n1g.a(r2)
            cue r3 = defpackage.oi4.b
            sy9 r4 = new sy9
            one.me.android.OneMeApplication r1 = r1.b
            r4.<init>(r0, r1, r11)
            defpackage.xs7.E(r2, r3, r11, r4, r9)
            zqd r0 = r0.a
            ty9 r3 = new ty9
            r3.<init>(r1, r11)
            ck5 r1 = new ck5
            r1.<init>(r0, r3, r8)
            defpackage.ez3.N(r1, r2)
            jue r0 = defpackage.jue.a
            return r0
        L_0x0071:
            one.me.android.OneMeApplication r0 = r1.b
            int r1 = one.me.android.OneMeApplication.w0
            gk9 r1 = new gk9
            nqc r1 = nqc.a
            bd r1 = r1.b()
            i2b r2 = i2b.a
            w4 r2 = r2.getAccessor()
            java.lang.Object r2 = r2.c(r7)
            lqc r2 = (lqc) r2
            java.lang.String r3 = "gk9"
            java.lang.String r4 = "execute"
            defpackage.udd.p(r3, r4, new java.lang.Object[0])
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r4.getInstallerPackageName(r0)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00e5
            int r4 = r0.length()
            if (r4 != 0) goto L_0x00a5
            goto L_0x00e5
        L_0x00a5:
            java.lang.String r4 = "execute: installer %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r0}
            defpackage.udd.p(r3, r4, r5)
            r4 = 32
            r5 = 95
            java.lang.String r0 = r0.replace(r4, r5)
            r4 = 47
            java.lang.String r0 = r0.replace(r4, r5)
            x97 r4 = r2.g
            java.lang.String r5 = "install-market"
            java.lang.String r4 = r4.getString(r5, r11)
            java.lang.String r6 = "execute: prevInstaller %s"
            java.lang.Object[] r7 = new java.lang.Object[]{r4}
            defpackage.udd.p(r3, r6, r7)
            if (r4 == 0) goto L_0x00dc
            int r3 = r4.length()
            if (r3 != 0) goto L_0x00d6
            goto L_0x00dc
        L_0x00d6:
            boolean r3 = r4.equals(r0)
            if (r3 != 0) goto L_0x00f1
        L_0x00dc:
            r2.l(r5, r0)
            java.lang.String r2 = "INSTALLER"
            r1.g(r2, r0)
            goto L_0x00f1
        L_0x00e5:
            java.lang.String r0 = "installer is empty"
            defpackage.udd.T(r3, r0, new java.lang.Object[0])
            goto L_0x00f1
        L_0x00eb:
            r0 = move-exception
            java.lang.String r1 = "could not get installer package name"
            defpackage.udd.s(r3, r1, r0)
        L_0x00f1:
            jue r0 = defpackage.jue.a
            return r0
        L_0x00f4:
            int r0 = one.me.android.OneMeApplication.w0
            ru.ok.messages.TimeChangeReceiver r0 = new ru.ok.messages.TimeChangeReceiver
            r0.<init>()
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.DATE_CHANGED"
            r2.<init>(r3)
            one.me.android.OneMeApplication r1 = r1.b
            r1.registerReceiver(r0, r2)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.TIME_SET"
            r2.<init>(r3)
            r1.registerReceiver(r0, r2)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.TIMEZONE_CHANGED"
            r2.<init>(r3)
            r1.registerReceiver(r0, r2)
            ru.ok.messages.TimeChangeReceiver.a(r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x0121:
            int r0 = one.me.android.OneMeApplication.w0
            ry9 r0 = new ry9
            one.me.android.OneMeApplication r1 = r1.b
            r0.<init>(r1)
            r1.registerActivityLifecycleCallbacks(r0)
            zl3 r2 = zl3.b
            do2 r3 = new do2
            r3.<init>(r2, r12)
            one.me.android.di.ConcurrentComponent r2 = one.me.android.di.ConcurrentComponent.INSTANCE
            pae r2 = r2.getDispatchers()
            n3a r2 = (defpackage.n3a) r2
            ju3 r2 = r2.a()
            java.lang.String r4 = "chroma"
            ju3 r2 = r2.limitedParallelism(r12, r4)
            h37 r4 = defpackage.lp.a()
            hu3 r2 = r2.plus(r4)
            hu3 r2 = r2.plus(r3)
            kotlinx.coroutines.internal.ContextScope r2 = defpackage.n1g.a(r2)
            qy9 r3 = new qy9
            r3.<init>(r1, r0, r11)
            defpackage.xs7.E(r2, r11, r11, r3, r10)
            jue r0 = defpackage.jue.a
            return r0
        L_0x0161:
            int r0 = one.me.android.OneMeApplication.w0
            one.me.android.di.ConcurrentComponent r0 = one.me.android.di.ConcurrentComponent.INSTANCE
            pae r0 = r0.getDispatchers()
            n3a r0 = (defpackage.n3a) r0
            ju3 r0 = r0.a()
            h37 r2 = defpackage.lp.a()
            hu3 r0 = r0.plus(r2)
            kotlinx.coroutines.internal.ContextScope r0 = defpackage.n1g.a(r0)
            oy9 r2 = new oy9
            one.me.android.OneMeApplication r1 = r1.b
            r2.<init>(r1, r11)
            defpackage.xs7.E(r0, r11, r11, r2, r10)
            jue r0 = defpackage.jue.a
            return r0
        L_0x0188:
            int r0 = one.me.android.OneMeApplication.w0
            o2a r0 = defpackage.o2a.a
            i2b r0 = i2b.a
            w4 r0 = r0.getAccessor()
            java.lang.Object r0 = r0.c(r7)
            lqc r0 = (lqc) r0
            int r2 = defpackage.fja.d
            java.lang.String r2 = r0.q()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "setupLocale "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "fja"
            defpackage.udd.p(r4, r3, new java.lang.Object[0])
            boolean r3 = defpackage.r1g.p(r2)
            if (r3 == 0) goto L_0x0300
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r2 = r2.getConfiguration()
            android.os.LocaleList r2 = r2.getLocales()
            java.util.Locale r2 = r2.get(r6)
            if (r2 != 0) goto L_0x01cc
            java.util.Locale r2 = java.util.Locale.ENGLISH
            goto L_0x01d5
        L_0x01cc:
            java.lang.String r3 = r2.getLanguage()
            java.lang.String r5 = "user.systemLang"
            r0.l(r5, r3)
        L_0x01d5:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r6 = "ru"
            r5.<init>(r6)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "en"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "az"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "de"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "hy"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "it"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "es"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "ka"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "kk"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "ky"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "ro"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "tg"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "tr"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "uk"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "uz"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "fa"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "ar"
            r5.<init>(r7)
            r3.add(r5)
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "pt"
            r5.<init>(r7)
            r3.add(r5)
            java.lang.String r5 = r2.getLanguage()
            java.lang.String r7 = r2.getLanguage()
            java.util.Locale r8 = new java.util.Locale
            java.lang.String r10 = "be"
            r8.<init>(r10)
            java.util.Locale r10 = new java.util.Locale
            java.lang.String r11 = "bg"
            r10.<init>(r11)
            java.lang.String r8 = r8.getLanguage()
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x02e9
            java.lang.String r8 = r10.getLanguage()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02b9
            goto L_0x02e9
        L_0x02b9:
            n73 r3 = defpackage.ms9.j(r3)
            j67 r6 = new j67
            r6.<init>(r9)
            ps9 r7 = new ps9
            r7.<init>(r3, r6, r12)
            hy5 r3 = new hy5
            r6 = 12
            r3.<init>(r6, r2)
            rs9 r2 = new rs9
            r2.<init>(r7, r3)
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ r12
            if (r2 == 0) goto L_0x02e7
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.getLanguage()
            goto L_0x02ea
        L_0x02e7:
            r2 = r5
            goto L_0x02ea
        L_0x02e9:
            r2 = r6
        L_0x02ea:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "setupLocaleInitial: "
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            defpackage.udd.p(r4, r3, new java.lang.Object[0])
            java.lang.String r3 = "user.lang"
            r0.l(r3, r2)
        L_0x0300:
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r2)
            java.util.Locale.setDefault(r0)
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>()
            r3 = 0
            r2.fontScale = r3
            r2.setLocale(r0)
            r2.setLayoutDirection(r0)
            one.me.android.OneMeApplication r0 = r1.b
            r0.createConfigurationContext(r2)
            jue r0 = defpackage.jue.a
            return r0
        L_0x031e:
            int r0 = one.me.android.OneMeApplication.w0
            i2b r0 = i2b.a
            w4 r13 = r0.getAccessor()
            java.lang.Object r13 = r13.c(r5)
            vqc r13 = (vqc) r13
            r13.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r14 = ru.ok.tamtam.android.prefs.PmsKey.mytracker-enabled
            boolean r13 = r13.m(r14, r12)
            if (r13 == 0) goto L_0x040a
            rf9 r13 = defpackage.rf9.a
            w4 r13 = r0.getAccessor()
            java.lang.Object r5 = r13.c(r5)
            vqc r5 = (vqc) r5
            r5.getClass()
            boolean r13 = r5.m(r14, r12)
            r13 = r13 ^ r12
            if (r13 == 0) goto L_0x034f
            goto L_0x040a
        L_0x034f:
            w4 r0 = r0.getAccessor()
            java.lang.Object r0 = r0.c(r7)
            lqc r0 = (lqc) r0
            long r13 = r0.s()
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x036d
            com.my.tracker.MyTrackerParams r3 = com.my.tracker.MyTracker.getTrackerParams()
            java.lang.String r4 = java.lang.String.valueOf(r13)
            r3.setCustomUserId(r4)
            goto L_0x0374
        L_0x036d:
            com.my.tracker.MyTrackerParams r3 = com.my.tracker.MyTracker.getTrackerParams()
            r3.setCustomUserId(r11)
        L_0x0374:
            com.my.tracker.MyTrackerConfig r3 = com.my.tracker.MyTracker.getTrackerConfig()
            dd9 r4 = new dd9
            r7 = 16
            r4.<init>(r7)
            com.my.tracker.MyTrackerConfig r3 = r3.setOkHttpClientProvider(r4)
            com.my.tracker.MyTrackerConfig r3 = r3.setKidMode(r6)
            r7e r4 = defpackage.y93.f
            java.lang.Object r4 = r4.getValue()
            x4a r4 = (x4a) r4
            java.util.concurrent.ExecutorService r4 = r4.b()
            com.my.tracker.MyTrackerConfig r3 = r3.setBackgroundExecutor(r4)
            ss8 r4 = new ss8
            r6 = 11
            r4.<init>(r6, r5)
            r3.setLogger(r4)
            dd9 r3 = new dd9
            r3.<init>(r2)
            com.my.tracker.MyTracker.setAttributionListener(r3)
            java.lang.String r2 = "34982109644049932883"
            one.me.android.OneMeApplication r1 = r1.b
            com.my.tracker.MyTracker.initTracker(r2, r1)
            n73 r2 = r0.t()
            rn1 r2 = defpackage.am7.c(r2)
            pf9 r3 = new pf9
            r3.<init>(r9, r11)
            ck5 r4 = new ck5
            r4.<init>(r2, r3, r8)
            kotlinx.coroutines.internal.ContextScope r2 = defpackage.rf9.b
            defpackage.ez3.N(r4, r2)
            o2a r3 = defpackage.o2a.a
            w4 r4 = r3.getAccessor()
            java.lang.Class<uo7> r5 = uo7.class
            java.lang.Object r4 = r4.c(r5)
            uo7 r4 = (uo7) r4
            s0c r4 = r4.stream()
            w09 r5 = new w09
            r5.<init>(r4, r0, r12)
            u09 r0 = new u09
            r0.<init>(r5, r10)
            qf9 r4 = new qf9
            r4.<init>(r9, r11)
            ck5 r5 = new ck5
            r5.<init>(r0, r4, r8)
            defpackage.ez3.N(r5, r2)
            java.lang.String r0 = com.my.tracker.MyTracker.getInstanceId(r1)     // Catch:{ all -> 0x03fe }
            tf4 r1 = r3.f()     // Catch:{ all -> 0x03fe }
            java.util.concurrent.atomic.AtomicReference r1 = r1.l     // Catch:{ all -> 0x03fe }
            r1.set(r0)     // Catch:{ all -> 0x03fe }
            goto L_0x040a
        L_0x03fe:
            r0 = move-exception
            java.lang.Class<rf9> r1 = defpackage.rf9.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "fail to fetch mytracker instance id"
            defpackage.udd.s(r1, r2, r0)
        L_0x040a:
            jue r0 = defpackage.jue.a
            return r0
        L_0x040d:
            one.me.android.OneMeApplication r0 = r1.b
            int r1 = one.me.android.OneMeApplication.w0
            dd9 r1 = new dd9
            r1.<init>(r0)
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase.m = r1
            jue r0 = defpackage.jue.a
            return r0
        L_0x041b:
            int r0 = one.me.android.OneMeApplication.w0
            au6 r0 = new au6
            nqc r2 = nqc.a
            bf5 r2 = r2.j()
            qq9 r3 = new qq9
            r3.<init>(r12)
            one.me.android.OneMeApplication r1 = r1.b
            r0.<init>(r1, r2, r3)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)
            jue r0 = defpackage.jue.a
            return r0
        L_0x0435:
            int r0 = one.me.android.OneMeApplication.w0
            i2b r0 = i2b.a
            w4 r0 = r0.getAccessor()
            java.lang.Class<g2b> r2 = g2b.class
            java.lang.Object r0 = r0.c(r2)
            g2b r0 = (g2b) r0
            int r2 = mzb.a
            one.me.android.OneMeApplication r1 = r1.b
            defpackage.r1g.e(r1, r0)
            r2 = r0
            j2b r2 = (j2b) r2
            qf4 r3 = new qf4
            r3.<init>(r1, r12, r0)
            yzc r0 = r2.b
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.m
            r0.add(r3)
            jue r0 = defpackage.jue.a
            return r0
        L_0x045e:
            int r0 = one.me.android.OneMeApplication.w0
            o2a r0 = defpackage.o2a.a
            w4 r0 = r0.getAccessor()
            java.lang.Class<mna> r2 = mna.class
            java.lang.Object r0 = r0.c(r2)
            mna r0 = (mna) r0
            r0.getClass()
            bb5 r2 = new bb5
            r2.<init>(r10, r0)
            one.me.android.OneMeApplication r0 = r1.b
            r0.registerActivityLifecycleCallbacks(r2)
            jue r0 = defpackage.jue.a
            return r0
        L_0x047e:
            int r0 = one.me.android.OneMeApplication.w0
            java.lang.String[] r0 = defpackage.urd.c
            java.lang.String[] r2 = defpackage.urd.d
            one.me.android.OneMeApplication r1 = r1.b
            boolean r2 = defpackage.urd.j(r1, r2)
            android.content.SharedPreferences r1 = defpackage.urd.u(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
        L_0x0492:
            if (r6 >= r9) goto L_0x049b
            r3 = r0[r6]
            r1.putBoolean(r3, r2)
            int r6 = r6 + r12
            goto L_0x0492
        L_0x049b:
            r1.commit()
            jue r0 = defpackage.jue.a
            return r0
        L_0x04a1:
            int r0 = one.me.android.OneMeApplication.w0
            o2a r0 = defpackage.o2a.a
            w4 r0 = r0.getAccessor()
            java.lang.Class<x7> r2 = x7.class
            java.lang.Object r0 = r0.c(r2)
            x7 r0 = (x7) r0
            one.me.android.OneMeApplication r1 = r1.b
            r1.registerActivityLifecycleCallbacks(r0)
            jue r0 = defpackage.jue.a
            return r0
        L_0x04b9:
            int r2 = one.me.android.OneMeApplication.w0
            o2a r2 = defpackage.o2a.a
            w4 r2 = r2.getAccessor()
            java.lang.Object r0 = r2.c(r0)
            vf4 r0 = (vf4) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "performance.class = "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            one.me.android.OneMeApplication r1 = r1.b
            java.lang.String r1 = r1.Y
            defpackage.udd.p(r1, r0, new java.lang.Object[0])
            jue r0 = defpackage.jue.a
            return r0
        L_0x04df:
            int r0 = one.me.android.OneMeApplication.w0
            qcd r0 = new qcd
            r7e r2 = defpackage.y93.i
            one.me.android.OneMeApplication r1 = r1.b
            r0.<init>(r1, r2)
            return r0
        L_0x04eb:
            int r0 = one.me.android.OneMeApplication.w0
            s59 r0 = defpackage.km4.y0
            one.me.android.OneMeApplication r1 = r1.b
            r0.n(r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x04f7:
            one.me.android.OneMeApplication r0 = r1.b
            int r1 = one.me.android.OneMeApplication.w0
            za6 r1 = new za6
            r1.<init>((java.lang.Object) r0)
            defpackage.xs7.A = r1
            jue r0 = defpackage.jue.a
            return r0
        L_0x0505:
            one.me.android.OneMeApplication r1 = r1.b
            int r6 = one.me.android.OneMeApplication.w0
            o2a r6 = defpackage.o2a.a
            w4 r7 = r6.getAccessor()
            java.lang.Class<q0a> r13 = defpackage.q0a.class
            java.lang.Object r7 = r7.c(r13)
            q0a r7 = (defpackage.q0a) r7
            r7.getClass()
            i2b r7 = i2b.a
            w4 r7 = r7.getAccessor()
            java.lang.Object r5 = r7.c(r5)
            vqc r5 = (vqc) r5
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.anr-config
            java.lang.String r5 = r5.v(r7, r11)
            if (r5 != 0) goto L_0x0530
            goto L_0x0638
        L_0x0530:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x0596 }
            r7.<init>(r5)     // Catch:{ all -> 0x0596 }
            java.lang.String r13 = "enabled"
            boolean r13 = r7.optBoolean(r13)     // Catch:{ all -> 0x0596 }
            if (r13 != 0) goto L_0x0540
        L_0x053d:
            r0 = r11
            goto L_0x05a7
        L_0x0540:
            java.lang.String r13 = "timeout"
            org.json.JSONObject r7 = r7.optJSONObject(r13)     // Catch:{ all -> 0x0596 }
            if (r7 != 0) goto L_0x0549
            goto L_0x053d
        L_0x0549:
            w4 r6 = r6.getAccessor()     // Catch:{ all -> 0x0596 }
            java.lang.Object r0 = r6.c(r0)     // Catch:{ all -> 0x0596 }
            vf4 r0 = (vf4) r0     // Catch:{ all -> 0x0596 }
            java.lang.String r6 = "low"
            long r13 = r7.optLong(r6, r3)     // Catch:{ all -> 0x0596 }
            java.lang.String r6 = "avg"
            long r15 = r7.optLong(r6, r3)     // Catch:{ all -> 0x0596 }
            java.lang.String r6 = "high"
            long r6 = r7.optLong(r6, r3)     // Catch:{ all -> 0x0596 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0596 }
            if (r0 == 0) goto L_0x0583
            if (r0 == r12) goto L_0x057c
            if (r0 != r9) goto L_0x0576
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0574
            goto L_0x053d
        L_0x0574:
            r13 = r6
            goto L_0x0588
        L_0x0576:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0596 }
            r0.<init>()     // Catch:{ all -> 0x0596 }
            throw r0     // Catch:{ all -> 0x0596 }
        L_0x057c:
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0581
            goto L_0x053d
        L_0x0581:
            r13 = r15
            goto L_0x0588
        L_0x0583:
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0588
            goto L_0x053d
        L_0x0588:
            fk r0 = new fk     // Catch:{ all -> 0x0596 }
            int r3 = defpackage.zp4.o     // Catch:{ all -> 0x0596 }
            eq4 r3 = defpackage.eq4.MILLISECONDS     // Catch:{ all -> 0x0596 }
            long r3 = defpackage.mt0.Q(r13, r3)     // Catch:{ all -> 0x0596 }
            r0.<init>(r3)     // Catch:{ all -> 0x0596 }
            goto L_0x05a7
        L_0x0596:
            java.lang.String r0 = "invalid anr json config "
            java.lang.String r0 = r0.concat(r5)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            java.lang.String r4 = "AnrConfig"
            defpackage.udd.s(r4, r0, r3)
            goto L_0x053d
        L_0x05a7:
            if (r0 != 0) goto L_0x05ab
            goto L_0x0638
        L_0x05ab:
            java.lang.String r1 = r1.Y
            fn6 r3 = defpackage.udd.e
            if (r3 != 0) goto L_0x05b2
            goto L_0x05cb
        L_0x05b2:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x05cb
            tn7 r4 = tn7.X
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "anr config = "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r3.d(r4, r1, r5, r11)
        L_0x05cb:
            duf r1 = new duf
            r7e r3 = defpackage.y93.i
            java.lang.Object r4 = r3.getValue()
            pae r4 = (pae) r4
            n3a r4 = (defpackage.n3a) r4
            zr7 r4 = r4.c()
            my9 r5 = new my9
            r6 = 8
            r5.<init>(r6)
            r1.<init>((java.lang.Object) r0, (java.lang.Object) r4, (java.lang.Object) r5)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r12)
            kk r5 = new kk
            r5.<init>(r1, r11)
            djc r1 = new djc
            r1.<init>(r5)
            k4b r5 = defpackage.k4b.w0
            pc7 r6 = r5.Y
            ob7 r7 = defpackage.ob7.o
            rn1 r1 = defpackage.wx3.e(r1, r6, r7)
            vy9 r6 = new vy9
            r6.<init>(r4, r0, r11)
            ck5 r0 = new ck5
            r0.<init>(r1, r6, r8)
            ao2 r1 = new ao2
            r1.<init>(r10, r11, r10)
            bc r4 = new bc
            r4.<init>(r0, r2, r1)
            java.lang.Object r0 = r3.getValue()
            pae r0 = (pae) r0
            n3a r0 = (defpackage.n3a) r0
            ju3 r0 = r0.a()
            java.lang.String r1 = "AnrWatchDog-Observe"
            ju3 r0 = r0.limitedParallelism(r12, r1)
            pj5 r0 = defpackage.ez3.J(r4, r0)
            ac7 r1 = defpackage.xs7.A(r5)
            defpackage.ez3.N(r0, r1)
        L_0x0638:
            jue r0 = defpackage.jue.a
            return r0
        L_0x063b:
            int r0 = one.me.android.OneMeApplication.w0
            ga0 r0 = new ga0     // Catch:{ all -> 0x0646 }
            r0.<init>()     // Catch:{ all -> 0x0646 }
            r0.d()     // Catch:{ all -> 0x0646 }
            goto L_0x0650
        L_0x0646:
            r0 = move-exception
            one.me.android.OneMeApplication r1 = r1.b
            java.lang.String r1 = r1.Y
            java.lang.String r2 = "fail to upgrade library!"
            defpackage.udd.s(r1, r2, r0)
        L_0x0650:
            jue r0 = defpackage.jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly9.invoke():java.lang.Object");
    }
}
