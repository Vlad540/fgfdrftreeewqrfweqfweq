package defpackage;

/* renamed from: ad3  reason: default package */
public final class ad3 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public ad3(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
    }

    public final ed3 a() {
        return (ed3) this.c.getValue();
    }

    public final rf4 b() {
        return (rf4) this.b.getValue();
    }

    public final boolean c() {
        boolean z = !a().a() && (!e() || !b().d() || !b().c()) && d();
        udd.p("ad3", "isBackgroundDataDisabledAndOnMobileNetwork: %b, isOnline=%b, appIsVisible=%b, hasForegroundServicesAlive=%b, isOnMobileNetwork=%b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(e()), Boolean.valueOf(b().d()), Boolean.valueOf(b().c()), Boolean.valueOf(d())});
        return z;
    }

    public final boolean d() {
        return (a().b() == wd3.c || a().b() == wd3.b) ? false : true;
    }

    public final boolean e() {
        return ((h3d) ((f3d) this.d.getValue())).h == 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0072, code lost:
        if (r8 == false) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r13 = this;
            rf4 r0 = r13.b()
            boolean r0 = r0.d()
            rf4 r1 = r13.b()
            boolean r1 = r1.c()
            rf4 r2 = r13.b()
            tf4 r2 = (defpackage.tf4) r2
            ezd r2 = r2.g
            fb6 r2 = (defpackage.fb6) r2
            boolean r2 = r2.a()
            r3 = 1
            r2 = r2 ^ r3
            ed3 r4 = r13.a()
            wd3 r4 = r4.b()
            t97 r5 = r13.a
            java.lang.Object r5 = r5.getValue()
            g2b r5 = (defpackage.g2b) r5
            j2b r5 = (defpackage.j2b) r5
            i03 r5 = r5.a
            r5.getClass()
            x97 r5 = r5.g
            java.lang.String r6 = "app.forceConnection"
            r7 = 0
            boolean r5 = r5.getBoolean(r6, r7)
            r6 = 2
            if (r0 != 0) goto L_0x0074
            if (r1 != 0) goto L_0x0074
            if (r2 != 0) goto L_0x0074
            if (r5 == 0) goto L_0x004a
            goto L_0x0074
        L_0x004a:
            ed3 r8 = r13.a()
            boolean r8 = r8.f()
            t97 r9 = r13.a
            java.lang.Object r9 = r9.getValue()
            g2b r9 = (defpackage.g2b) r9
            j2b r9 = (defpackage.j2b) r9
            yzc r9 = r9.b
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r10 = ru.ok.tamtam.android.prefs.PmsKey.f51keepconnection
            long r11 = (long) r6
            long r9 = r9.o(r10, r11)
            int r9 = (int) r9
            if (r9 == 0) goto L_0x0076
            if (r9 == r3) goto L_0x006e
            goto L_0x0077
        L_0x006e:
            wd3 r9 = defpackage.wd3.c
            if (r4 != r9) goto L_0x0077
            if (r8 == 0) goto L_0x0077
        L_0x0074:
            r7 = r3
            goto L_0x0077
        L_0x0076:
            r7 = r8
        L_0x0077:
            fn6 r8 = udd.e
            if (r8 != 0) goto L_0x007d
            goto L_0x00f5
        L_0x007d:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x00f5
            tn7 r9 = defpackage.tn7.X
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "shouldConnect: "
            r10.<init>(r11)
            r10.append(r7)
            java.lang.String r11 = "\nappVisible: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = "\nhasForegroundServicesAlive: "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = "\nnoServices: "
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = "\nforceConnection: "
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = "\nconnectionType: "
            r10.append(r0)
            java.lang.String r0 = r4.a()
            r10.append(r0)
            java.lang.String r0 = "\nkeepAlive: "
            r10.append(r0)
            t97 r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            g2b r13 = (defpackage.g2b) r13
            j2b r13 = (defpackage.j2b) r13
            yzc r13 = r13.b
            r13.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f51keepconnection
            long r1 = (long) r6
            long r0 = r13.o(r0, r1)
            int r13 = (int) r0
            if (r13 == 0) goto L_0x00e6
            if (r13 == r3) goto L_0x00e3
            if (r13 == r6) goto L_0x00e0
            java.lang.String r13 = "unknown"
            goto L_0x00e8
        L_0x00e0:
            java.lang.String r13 = "never"
            goto L_0x00e8
        L_0x00e3:
            java.lang.String r13 = "wifi"
            goto L_0x00e8
        L_0x00e6:
            java.lang.String r13 = "always"
        L_0x00e8:
            r10.append(r13)
            java.lang.String r13 = r10.toString()
            r0 = 0
            java.lang.String r1 = "ad3"
            r8.d(r9, r1, r13, r0)
        L_0x00f5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad3.f():boolean");
    }
}
