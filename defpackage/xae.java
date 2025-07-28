package defpackage;

/* renamed from: xae  reason: default package */
public final class xae implements kz6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yae b;

    public /* synthetic */ xae(yae yae, int i) {
        this.a = i;
        this.b = yae;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final xbc a(e1c r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "ClassCastException"
            java.lang.String r3 = "Host"
            r4 = 0
            int r5 = r0.a
            switch(r5) {
                case 0: goto L_0x00a3;
                default: goto L_0x000e;
            }
        L_0x000e:
            r5 = 61453(0xf00d, float:8.6114E-41)
            android.net.TrafficStats.setThreadStatsTag(r5)
            java.lang.Object r5 = r1.i
            lac r5 = (lac) r5
            s86 r6 = r5.a()
            yae r7 = r0.b
            java.lang.String r7 = r7.h
            java.lang.Object r8 = r6.c
            xe6 r8 = (xe6) r8
            java.lang.String r9 = "User-Agent"
            r8.n(r9, r7)
            yae r7 = r0.b
            boolean r7 = r7.c
            if (r7 == 0) goto L_0x0094
            sm6 r7 = r5.b
            java.lang.String r8 = r7.e
            yae r9 = r0.b
            boolean r9 = r9.d(r8)
            if (r9 != 0) goto L_0x0053
            ru.ok.tamtam.util.HandledException r9 = new ru.ok.tamtam.util.HandledException
            java.lang.String r10 = r7.b()
            java.lang.Object[] r10 = new java.lang.Object[]{r8, r10}
            java.lang.String r11 = "Http request behind the proxy. Host = %s, path = %s"
            r9.<init>(r11, r10)
            yae r10 = r0.b
            g15 r10 = r10.b
            r4a r10 = (r4a) r10
            r10.c(r9, r4)
        L_0x0053:
            yae r9 = r0.b
            java.lang.String r9 = r9.f
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0075
            ru.ok.tamtam.util.HandledException r9 = new ru.ok.tamtam.util.HandledException
            java.lang.String r10 = r7.b()
            java.lang.Object[] r10 = new java.lang.Object[]{r8, r10}
            java.lang.String r11 = "Http request with direct proxy Host = %s, path = %s"
            r9.<init>(r11, r10)
            yae r10 = r0.b
            g15 r10 = r10.b
            r4a r10 = (r4a) r10
            r10.c(r9, r4)
        L_0x0075:
            yae r4 = r0.b
            u93 r7 = r7.f()
            sm6 r5 = r5.b
            boolean r5 = r5.a
            defpackage.yae.c(r4, r7, r5)
            sm6 r4 = r7.b()
            yae r0 = r0.b
            r0.getClass()
            java.lang.Object r0 = r6.c
            xe6 r0 = (xe6) r0
            r0.n(r3, r8)
            r6.a = r4
        L_0x0094:
            lac r0 = r6.j()     // Catch:{ ClassCastException -> 0x009d }
            xbc r0 = r1.d(r0)     // Catch:{ ClassCastException -> 0x009d }
            return r0
        L_0x009d:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        L_0x00a3:
            java.lang.Object r5 = r1.i
            lac r5 = (lac) r5
            sm6 r6 = r5.b
            yae r7 = r0.b
            boolean r7 = r7.c
            r8 = 0
            if (r7 == 0) goto L_0x0112
            java.util.List r7 = r6.g
            if (r7 != 0) goto L_0x00b6
        L_0x00b4:
            r4 = r8
            goto L_0x00eb
        L_0x00b6:
            int r9 = r7.size()
            fz6 r4 = gwf.S(r4, r9)
            r9 = 2
            dz6 r4 = gwf.Q(r4, r9)
            int r9 = r4.a
            int r10 = r4.b
            int r4 = r4.c
            if (r4 < 0) goto L_0x00ce
            if (r9 > r10) goto L_0x00b4
            goto L_0x00d0
        L_0x00ce:
            if (r9 < r10) goto L_0x00b4
        L_0x00d0:
            java.lang.Object r11 = r7.get(r9)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "TAM_TAM_ORIGINAL_HOST"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x00e7
            int r9 = r9 + 1
            java.lang.Object r4 = r7.get(r9)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00eb
        L_0x00e7:
            if (r9 == r10) goto L_0x00b4
            int r9 = r9 + r4
            goto L_0x00d0
        L_0x00eb:
            boolean r7 = r1g.p(r4)
            if (r7 != 0) goto L_0x0112
            u93 r6 = r6.f()
            r6.l()
            sm6 r6 = r6.b()
            yae r7 = r0.b
            s86 r5 = r5.a()
            r7.getClass()
            java.lang.Object r7 = r5.c
            xe6 r7 = (xe6) r7
            r7.n(r3, r4)
            r5.a = r6
            lac r5 = r5.j()
        L_0x0112:
            xbc r1 = r1.d(r5)     // Catch:{ ClassCastException -> 0x01c8 }
            yae r2 = r0.b
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x01c7
            int r2 = r1.o
            r3 = 307(0x133, float:4.3E-43)
            if (r2 == r3) goto L_0x012b
            r3 = 308(0x134, float:4.32E-43)
            if (r2 == r3) goto L_0x012b
            switch(r2) {
                case 300: goto L_0x012b;
                case 301: goto L_0x012b;
                case 302: goto L_0x012b;
                case 303: goto L_0x012b;
                default: goto L_0x0129;
            }
        L_0x0129:
            goto L_0x01c7
        L_0x012b:
            ye6 r2 = r1.Y
            java.lang.String r3 = "Location"
            java.lang.String r2 = r2.a(r3)
            if (r2 == 0) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r2 = r8
        L_0x0137:
            boolean r4 = r1g.p(r2)
            java.lang.String r6 = "yae"
            if (r4 == 0) goto L_0x0146
            java.lang.String r0 = "Redirect, but Location is empty"
            udd.s(r6, r0, r8)
            goto L_0x01c7
        L_0x0146:
            u93 r4 = new u93     // Catch:{ IllegalArgumentException -> 0x0153 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x0153 }
            r4.j(r8, r2)     // Catch:{ IllegalArgumentException -> 0x0153 }
            sm6 r4 = r4.b()     // Catch:{ IllegalArgumentException -> 0x0153 }
            goto L_0x0154
        L_0x0153:
            r4 = r8
        L_0x0154:
            if (r4 != 0) goto L_0x016a
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Can't parse location "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            udd.s(r6, r0, r8)
            goto L_0x01c7
        L_0x016a:
            java.lang.String r9 = r4.e
            yae r0 = r0.b
            u93 r2 = r4.f()
            sm6 r4 = r5.b
            boolean r4 = r4.a
            defpackage.yae.c(r0, r2, r4)
            r2.l()
            java.util.ArrayList r0 = r2.d
            if (r0 != 0) goto L_0x0187
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.d = r0
        L_0x0187:
            java.util.ArrayList r0 = r2.d
            r16 = 1
            r17 = 0
            java.lang.String r10 = "TAM_TAM_ORIGINAL_HOST"
            r11 = 0
            r12 = 0
            java.lang.String r13 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
            r14 = 0
            r15 = 0
            r18 = 219(0xdb, float:3.07E-43)
            java.lang.String r4 = defpackage.smc.a(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.add(r4)
            java.util.ArrayList r0 = r2.d
            if (r9 == 0) goto L_0x01b1
            r15 = 1
            r16 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
            r13 = 0
            r14 = 0
            r17 = 219(0xdb, float:3.07E-43)
            java.lang.String r8 = defpackage.smc.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x01b1:
            r0.add(r8)
            sm6 r0 = r2.b()
            wbc r1 = r1.n()
            java.lang.String r0 = r0.i
            xe6 r2 = r1.f
            r2.n(r3, r0)
            xbc r1 = r1.a()
        L_0x01c7:
            return r1
        L_0x01c8:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xae.a(e1c):xbc");
    }
}
