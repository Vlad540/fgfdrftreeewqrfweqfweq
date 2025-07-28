package defpackage;

import android.text.TextUtils;

/* renamed from: fbe  reason: default package */
public final class fbe {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;

    public fbe(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t976;
    }

    public final hjb a() {
        return (hjb) this.c.getValue();
    }

    public final void b(String str, String str2, String str3, String str4) {
        hjb a2 = a();
        a2.f(false, !((ad3) a2.a.getValue()).c());
        ((bd) this.b.getValue()).f("ACTION_DEEP_LINK_PUSH_RECEIVE");
        ((gy9) ((pk) this.d.getValue())).B(str, false);
        b34 b34 = (b34) this.a.getValue();
        ((o54) b34.c.getValue()).getClass();
        un9 h = ((o7a) b34.b.getValue()).h("ru.oneme.app.misc", true, false);
        if (!TextUtils.isEmpty(str3)) {
            h.f(str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            h.e(str2);
            sn9 sn9 = new sn9(0);
            sn9.f = un9.c(str2);
            h.q(sn9);
        }
        if (!TextUtils.isEmpty(str4)) {
            h.k(lc0.a(b34.a, (w6a) b34.d.getValue(), (t52) b34.e.getValue(), (pc0) b34.f.getValue(), (tf3) null, str4, ((lqc) ((f03) b34.g.getValue())).p(), (qmc) b34.h.getValue()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(long r17, long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            r16 = this;
            hjb r0 = r16.a()
            r1 = 1
            r0.f(r1, r1)
            t97 r0 = r0.A0
            java.lang.Object r0 = r0.getValue()
            jjb r0 = (defpackage.jjb) r0
            r0.getClass()
            k77[] r2 = defpackage.jjb.e
            r3 = 0
            r4 = r2[r3]
            nj4 r4 = r0.c
            java.lang.Object r4 = r4.get()
            ad3 r4 = (defpackage.ad3) r4
            boolean r4 = r4.c()
            r5 = 0
            if (r4 == 0) goto L_0x0032
            java.lang.String r0 = defpackage.jjb.f
            java.lang.String r1 = "onPush: skip wakelock, backgroundDataDisabledAndOnMobileNetwork"
            udd.q(r0, r1)
        L_0x002e:
            r0 = r16
            goto L_0x0158
        L_0x0032:
            xzc r4 = r0.a
            vqc r4 = (defpackage.vqc) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f121wakelockonpush
            boolean r4 = r4.m(r6, r3)
            if (r4 == 0) goto L_0x0067
            r6 = r2[r3]
            nj4 r6 = r0.c
            java.lang.Object r6 = r6.get()
            ad3 r6 = (defpackage.ad3) r6
            boolean r6 = r6.e()
            if (r6 != 0) goto L_0x0067
            rf4 r6 = r0.a()
            boolean r6 = r6.d()
            if (r6 != 0) goto L_0x0067
            rf4 r6 = r0.a()
            boolean r6 = r6.c()
            if (r6 != 0) goto L_0x0067
            r6 = r1
            goto L_0x0068
        L_0x0067:
            r6 = r3
        L_0x0068:
            java.lang.String r7 = defpackage.jjb.f
            fn6 r8 = udd.e
            if (r8 != 0) goto L_0x006f
            goto L_0x00c6
        L_0x006f:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x00c6
            tn7 r9 = defpackage.tn7.X
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "needWakelockForLogin="
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r11 = ", wakelockOnPushEnabled="
            r10.append(r11)
            r10.append(r4)
            java.lang.String r4 = ", online="
            r10.append(r4)
            r2 = r2[r3]
            nj4 r2 = r0.c
            java.lang.Object r2 = r2.get()
            ad3 r2 = (defpackage.ad3) r2
            boolean r2 = r2.e()
            r10.append(r2)
            java.lang.String r2 = ", appVisible="
            r10.append(r2)
            rf4 r2 = r0.a()
            boolean r2 = r2.d()
            r10.append(r2)
            java.lang.String r2 = ", hasForegroundServicesAlive="
            r10.append(r2)
            rf4 r2 = r0.a()
            boolean r2 = r2.c()
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            r8.d(r9, r7, r2, r5)
        L_0x00c6:
            rf4 r2 = r0.a()
            android.content.Context r3 = r2.a
            android.os.PowerManager r4 = r2.d
            java.lang.String r8 = "power"
            if (r4 != 0) goto L_0x00da
            java.lang.Object r3 = r3.getSystemService(r8)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            r2.d = r3
        L_0x00da:
            android.os.PowerManager r2 = r2.d
            boolean r2 = r2.isDeviceIdleMode()
            if (r6 != 0) goto L_0x00eb
            if (r2 != 0) goto L_0x00eb
            java.lang.String r0 = "onPush: skip wakelock"
            udd.q(r7, r0)
            goto L_0x002e
        L_0x00eb:
            java.util.concurrent.atomic.AtomicLong r3 = r0.b
            long r3 = r3.get()
            rf4 r9 = r0.a()
            r9.getClass()
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r3 = r9 - r3
            r11 = 10000(0x2710, float:1.4013E-41)
            long r12 = (long) r11
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x010c
            java.lang.String r0 = "onPush: already acquired wakelock"
            udd.q(r7, r0)
            goto L_0x002e
        L_0x010c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "onPush: wakelock, wakelockForLogin=%b, isInDoze=%b"
            udd.p(r7, r3, r2)
            java.util.concurrent.atomic.AtomicLong r2 = r0.b
            r2.set(r9)
            if (r6 == 0) goto L_0x0127
            java.lang.String r2 = "ru.ok.tamtam:push"
            goto L_0x0129
        L_0x0127:
            java.lang.String r2 = "ru.ok.tamtam:doze-wakelock"
        L_0x0129:
            rf4 r0 = r0.a()
            r0.getClass()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.String r4 = "rf4"
            java.lang.String r6 = "wakeLock: period=%d, tag=%s"
            udd.p(r4, r6, r3)
            android.content.Context r3 = r0.a
            android.os.PowerManager r4 = r0.d
            if (r4 != 0) goto L_0x014d
            java.lang.Object r3 = r3.getSystemService(r8)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            r0.d = r3
        L_0x014d:
            android.os.PowerManager r0 = r0.d
            android.os.PowerManager$WakeLock r0 = r0.newWakeLock(r1, r2)
            r0.acquire(r12)
            goto L_0x002e
        L_0x0158:
            t97 r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            so1 r0 = (so1) r0
            df1 r1 = new df1
            r13 = 0
            r6 = r1
            r7 = r17
            r9 = r19
            r11 = r22
            r12 = r21
            r14 = r24
            r15 = r23
            r6.<init>(r7, r9, r11, r12, r13, r14, r15)
            ep1 r0 = (ep1) r0
            t97 r2 = r0.r
            java.lang.Object r2 = r2.getValue()
            pae r2 = (defpackage.pae) r2
            n3a r2 = (n3a) r2
            zr7 r2 = r2.c()
            zr7 r2 = r2.getImmediate()
            ap1 r3 = new ap1
            r3.<init>(r1, r0, r5)
            r1 = 2
            ro1 r0 = r0.a
            xs7.E(r0, r2, r5, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbe.c(long, long, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void d(p7 p7Var) {
        hjb a2 = a();
        kp0 c2 = ((zy9) a2.z0.getValue()).c();
        boolean z = c2.b;
        boolean z2 = c2.a;
        if (!z2 || z) {
            udd.U("hjb", "onReadOnOtherDevice: skipped, authorized=" + z2 + ", external=" + z);
            return;
        }
        ((kq9) a2.y0.getValue()).f(p7Var.b, p7Var.c);
        a2.f(false, a2.c());
    }

    public final void e() {
        hjb a2 = a();
        a2.f(false, !((ad3) a2.a.getValue()).c());
    }
}
