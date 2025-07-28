package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: al7  reason: default package */
public final class al7 implements q98 {
    public final t98 a;
    public final n35 b;
    public final s98 c;
    public final Context d;
    public p98 e;
    public u2f f;
    public o98 g;
    public float h;
    public boolean i;
    public boolean j;
    public PowerManager k;
    public PowerManager.WakeLock l;

    public al7(t98 t98, n35 n35, s98 s98, Context context, float f2, boolean z, boolean z2) {
        this.a = t98;
        this.b = n35;
        this.c = s98;
        this.d = context;
        this.h = f2;
        this.i = z;
        this.j = z2;
    }

    public final void a() {
        t98 t98 = t98.a;
        t98 t982 = this.a;
        if (t982 != t98 && t982 != t98.b && k()) {
            if (this.l == null) {
                if (this.k == null) {
                    this.k = (PowerManager) this.d.getSystemService("power");
                }
                PowerManager powerManager = this.k;
                Locale locale = Locale.ENGLISH;
                this.l = powerManager.newWakeLock(536870922, "tamtam:media_player_controller_" + t982);
            }
            if (!this.l.isHeld()) {
                try {
                    this.l.acquire();
                    udd.p("al7", "New wake lock acquire %s", new Object[]{t982});
                } catch (Exception unused) {
                }
            }
        }
    }

    public final String b(String str) {
        Locale locale = Locale.ENGLISH;
        StringBuilder n = me4.n(str, "-");
        n.append(this.a);
        return n.toString();
    }

    public final long c() {
        long j2;
        if (this.f == null) {
            return 0;
        }
        n35 n35 = this.b;
        if (n35.Z == null) {
            return 0;
        }
        tgd tgd = n35.a;
        tgd.Z1();
        m45 m45 = tgd.c;
        m45.s2();
        if (m45.n()) {
            txa txa = m45.o1;
            j2 = txa.k.equals(txa.b) ? mze.M(m45.o1.q) : m45.c();
        } else {
            m45.s2();
            if (m45.o1.a.q()) {
                j2 = m45.q1;
            } else {
                txa txa2 = m45.o1;
                if (txa2.k.d != txa2.b.d) {
                    j2 = mze.M(txa2.a.n(m45.p0(), (sje) m45.b, 0).C0);
                } else {
                    long j3 = txa2.q;
                    if (m45.o1.k.a()) {
                        txa txa3 = m45.o1;
                        pje h2 = txa3.a.h(txa3.k.a, m45.D0);
                        long j4 = h2.Z.a(m45.o1.k.b).a;
                        j3 = j4 == Long.MIN_VALUE ? h2.o : j4;
                    }
                    txa txa4 = m45.o1;
                    uje uje = txa4.a;
                    Object obj = txa4.k.a;
                    pje pje = m45.D0;
                    uje.h(obj, pje);
                    j2 = mze.M(j3 + pje.X);
                }
            }
        }
        return j2 - n35.Z.m();
    }

    public final ooe d() {
        int intValue;
        u2f u2f = this.f;
        ooe ooe = ooe.y0;
        if (u2f == null) {
            return ooe;
        }
        kv2 kv2 = this.b.b;
        ac4 ac4 = (ac4) kv2.a;
        bu7 bu7 = ac4.c;
        if (bu7 == null || (intValue = ((Integer) kv2.k(bu7).second).intValue()) < 0) {
            return ooe;
        }
        pb4 a2 = ((mb4) ac4.e.get()).a(intValue, bu7.c[intValue]);
        if (a2 != null) {
            for (ooe ooe2 : kv2.j().b) {
                if (ooe2.w0 == a2.a && ooe2.x0 == a2.b[0]) {
                    return ooe2;
                }
            }
        }
        tgd tgd = (tgd) kv2.b;
        tgd.Z1();
        m45 m45 = tgd.c;
        m45.s2();
        f55[] f55Arr = (f55[]) m45.o1.i.X;
        int length = f55Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            vu5 vu5 = null;
            if (i2 < length) {
                f55 f55 = f55Arr[i2];
                if (f55 instanceof f55) {
                    vu5 = f55.j();
                }
            }
            if (vu5 != null && b49.g(vu5.A0) == 1) {
                for (poe poe : (List) kv2.o) {
                    Iterator it = poe.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ooe ooe3 = (ooe) it.next();
                            if (kv2.e(ooe3, vu5)) {
                                return ooe3;
                            }
                        }
                    }
                }
                continue;
            }
        }
        return ooe;
    }

    public final long e() {
        if (this.f == null) {
            return 0;
        }
        n35 n35 = this.b;
        if (n35.Z == null) {
            return 0;
        }
        return n35.a.k() - n35.Z.m();
    }

    public final long f() {
        if (this.f == null) {
            return 0;
        }
        return this.b.v();
    }

    public final int g() {
        if (this.f == null) {
            return 0;
        }
        n35 n35 = this.b;
        if (n35.Z == null) {
            return 0;
        }
        return n35.z0;
    }

    public final int h() {
        if (this.f == null) {
            return 0;
        }
        return this.b.A0;
    }

    public final int i() {
        if (this.f == null) {
            return 0;
        }
        n35 n35 = this.b;
        if (n35.Z == null) {
            return 0;
        }
        return n35.y0;
    }

    public final boolean j() {
        if (this.f == null) {
            return false;
        }
        return this.b.a();
    }

    public final boolean k() {
        return this.h == 1.0f;
    }

    public final void l() {
        this.c.o(this);
        p98 p98 = this.e;
        if (p98 != null) {
            p98.i();
        }
        a();
    }

    public final void m() {
        if (this.f != null) {
            udd.p("al7", "Pause %s", new Object[]{this.a});
            this.j = false;
            this.b.pause();
        }
    }

    public final void n() {
        if (this.f != null) {
            udd.p("al7", "Play %s", new Object[]{this.a});
            this.j = true;
            this.b.play();
        }
    }

    public final void o() {
        PowerManager.WakeLock wakeLock = this.l;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.l.release();
            udd.p("al7", "Release wake lock %s", new Object[]{this.a});
        }
    }

    public final void p(long j2) {
        if (this.f != null) {
            n35 n35 = this.b;
            n35.getClass();
            n35.u();
            if (n35.Z != null) {
                tgd tgd = n35.a;
                tgd.Z1();
                m45 m45 = tgd.c;
                if (m45.c() != 0) {
                    tgd.Z1();
                    if (j2 > m45.c() - n35.Z.m()) {
                        return;
                    }
                }
                tgd.r(tgd.p0(), n35.Z.m() + j2);
            }
        }
    }

    public final void q(Surface surface) {
        udd.p("al7", "Set surface %s", new Object[]{this.a});
        n35 n35 = this.b;
        n35.getClass();
        n35.u();
        udd.p("n35", "Set surface %s", new Object[]{surface});
        tgd tgd = n35.a;
        if (surface == null) {
            tgd.Z1();
            m45 m45 = tgd.c;
            m45.s2();
            m45.m2((Surface) null);
            m45.i2(0, 0);
            return;
        }
        tgd.Z1();
        m45 m452 = tgd.c;
        m452.s2();
        m452.m2(surface);
        m452.i2(-1, -1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: yh0[]} */
    /* JADX WARNING: type inference failed for: r16v2, types: [java.lang.Object, lk9] */
    /* JADX WARNING: type inference failed for: r16v3, types: [java.lang.Object, lk9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(defpackage.u2f r29, defpackage.o98 r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            r2 = 23
            r3 = 1
            t98 r4 = r0.a
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "al7"
            java.lang.String r6 = "Set video content %s"
            udd.p(r5, r6, r4)
            r4 = r29
            r0.f = r4
            o98 r4 = r0.g
            if (r4 == 0) goto L_0x0021
            if (r4 == r1) goto L_0x0021
            r4.c1()
        L_0x0021:
            r0.g = r1
            n35 r1 = r0.b
            r1.getClass()
            defpackage.n35.u()
            r1.Y = r0
            u2f r4 = r0.f
            jj0 r4 = (defpackage.jj0) r4
            boolean r4 = r4.g
            if (r4 == 0) goto L_0x0037
            r4 = 0
            goto L_0x0039
        L_0x0037:
            float r4 = r0.h
        L_0x0039:
            r1.g(r4)
            boolean r4 = r0.i
            defpackage.n35.u()
            tgd r5 = r1.a
            r5.Z1()
            m45 r5 = r5.c
            r5.s2()
            int r6 = r5.R0
            r7 = 0
            if (r6 == r4) goto L_0x007c
            r5.R0 = r4
            y45 r6 = r5.A0
            g8e r6 = r6.w0
            r6.getClass()
            e8e r8 = g8e.b()
            android.os.Handler r6 = r6.a
            r9 = 11
            android.os.Message r6 = r6.obtainMessage(r9, r4, r7)
            r8.a = r6
            r8.b()
            x34 r6 = new x34
            r6.<init>(r4, r3)
            oz2 r4 = r5.B0
            r8 = 8
            r4.l(r8, r6)
            r5.o2()
            r4.h()
        L_0x007c:
            u2f r4 = r0.f
            boolean r0 = r0.j
            defpackage.n35.u()
            u2f r5 = r1.Z
            java.lang.String r6 = "n35"
            tgd r8 = r1.a
            r9 = 4
            if (r5 == 0) goto L_0x00e4
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x00e4
            r8.Z1()
            m45 r5 = r8.c
            r5.s2()
            txa r5 = r5.o1
            int r5 = r5.e
            if (r5 != r3) goto L_0x00a1
            goto L_0x00e4
        L_0x00a1:
            tgd r2 = r1.a
            r2.Z1()
            m45 r2 = r2.c
            r2.s2()
            txa r2 = r2.o1
            int r2 = r2.e
            if (r2 != r9) goto L_0x00b9
            java.lang.String r2 = "Video ended. Seek to start"
            udd.q(r6, r2)
            r1.A()
        L_0x00b9:
            r8.Z1()
            m45 r2 = r8.c
            r2.s2()
            txa r2 = r2.o1
            int r2 = r2.e
            r3 = 3
            if (r2 != r3) goto L_0x00d3
            al7 r2 = r1.Y
            if (r2 == 0) goto L_0x00d3
            p98 r2 = r2.e
            if (r2 == 0) goto L_0x00d3
            r2.j1()
        L_0x00d3:
            r8.Y(r0)
            if (r0 == 0) goto L_0x0359
            al7 r0 = r1.Y
            if (r0 == 0) goto L_0x00df
            r0.l()
        L_0x00df:
            r1.w()
            goto L_0x0359
        L_0x00e4:
            java.lang.String r5 = "Prepare new video content"
            udd.q(r6, r5)
            r1.y0 = r7
            r1.z0 = r7
            r1.A0 = r7
            r1.B0 = r7
            al7 r5 = r1.Y
            if (r5 == 0) goto L_0x00fc
            p98 r5 = r5.e
            if (r5 == 0) goto L_0x00fc
            r5.y0()
        L_0x00fc:
            r1.Z = r4
            int r5 = r4.getWidth()
            float r5 = (float) r5
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r5 = r5 / r4
            r1.w0 = r5
            u2f r4 = r1.Z
            kv2 r5 = r1.b
            r5.c = r4
            java.util.List r4 = java.util.Collections.emptyList()
            r5.o = r4
            java.lang.Object r4 = r5.a
            ac4 r4 = (ac4) r4
            ob4 r6 = r4.b()
            android.util.SparseArray r10 = r6.M
            int r11 = r10.size()
            if (r11 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r10.clear()
        L_0x012b:
            r4.h(r6)
            r5.l()
            u2f r4 = r1.Z
            android.net.Uri r5 = r4.l()
            r6 = r4
            jj0 r6 = (defpackage.jj0) r6
            boolean r6 = r6.c
            r6 = r6 ^ r3
            f35 r10 = r1.o
            mz3 r6 = r10.a(r5, r6)
            boolean r10 = r4 instanceof defpackage.xy3
            if (r10 == 0) goto L_0x0191
            com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r2 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
            r2.<init>(r6)
            j68 r4 = j68.a(r5)
            c68 r5 = r4.b
            r5.getClass()
            hy3 r6 = new hy3
            r6.<init>()
            java.util.List r5 = r5.c
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L_0x016a
            nu7 r10 = new nu7
            r10.<init>((java.lang.Object) r6, (java.lang.Object) r5)
            r19 = r10
            goto L_0x016c
        L_0x016a:
            r19 = r6
        L_0x016c:
            ty3 r5 = new ty3
            mn r6 = r2.c
            mo4 r22 = r6.L(r4)
            long r10 = r2.f
            lu7 r6 = r2.d
            lk9 r12 = r2.e
            mz3 r13 = r2.b
            nfc r2 = r2.a
            r16 = r5
            r17 = r4
            r18 = r13
            r20 = r2
            r21 = r6
            r23 = r12
            r24 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x028c
        L_0x0191:
            boolean r10 = r4 instanceof defpackage.uj6
            if (r10 == 0) goto L_0x01ee
            com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory r2 = new com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
            r2.<init>(r6)
            j68 r4 = j68.a(r5)
            c68 r5 = r4.b
            r5.getClass()
            jk9 r6 = r2.c
            java.util.List r5 = r5.c
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L_0x01b3
            otf r10 = new otf
            r10.<init>(r6, r5)
            r6 = r10
        L_0x01b3:
            oi6 r5 = new oi6
            gf6 r10 = r2.b
            mn r11 = r2.f
            mo4 r21 = r11.L(r4)
            hs1 r11 = r2.d
            r11.getClass()
            f84 r11 = new f84
            lk9 r12 = r2.g
            e3 r13 = r2.a
            r11.<init>(r13, r12, r6)
            lu7 r6 = r2.e
            long r13 = r2.j
            boolean r9 = r2.h
            int r15 = r2.i
            e3 r2 = r2.a
            r16 = r5
            r17 = r4
            r18 = r2
            r19 = r10
            r20 = r6
            r22 = r12
            r23 = r11
            r24 = r13
            r26 = r9
            r27 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27)
            goto L_0x028c
        L_0x01ee:
            boolean r9 = r4 instanceof defpackage.y79
            if (r9 == 0) goto L_0x0261
            r5 = r4
            y79 r5 = (defpackage.y79) r5
            java.util.List r9 = r5.j
            int r10 = r9.size()
            yh0[] r10 = new yh0[r10]
            r15 = r7
        L_0x01fe:
            int r11 = r9.size()
            if (r15 >= r11) goto L_0x025b
            java.lang.Object r11 = r9.get(r15)
            w79 r11 = (defpackage.w79) r11
            s74 r12 = new s74
            r12.<init>()
            ss8 r14 = new ss8
            r14.<init>((int) r2, (java.lang.Object) r12)
            lk9 r16 = new lk9
            r16.<init>()
            java.lang.String r11 = r11.a
            android.net.Uri r11 = android.net.Uri.parse(r11)
            j68 r12 = j68.a(r11)
            c68 r11 = r12.b
            r11.getClass()
            chb r13 = new chb
            c68 r11 = r12.b
            r11.getClass()
            c68 r11 = r12.b
            r11.getClass()
            io4 r17 = mo4.a
            r11 = r13
            r7 = r13
            r13 = r6
            r18 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            boolean r11 = r4 instanceof defpackage.bse
            if (r11 == 0) goto L_0x0254
            s03 r13 = new s03
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r14 = r5.k()
            long r11 = r11.toMicros(r14)
            r13.<init>(r7, r11)
            goto L_0x0255
        L_0x0254:
            r13 = r7
        L_0x0255:
            r10[r18] = r13
            int r15 = r18 + 1
            r7 = 0
            goto L_0x01fe
        L_0x025b:
            um8 r5 = new um8
            r5.<init>(r10)
            goto L_0x028c
        L_0x0261:
            s74 r4 = new s74
            r4.<init>()
            ss8 r14 = new ss8
            r14.<init>((int) r2, (java.lang.Object) r4)
            lk9 r16 = new lk9
            r16.<init>()
            j68 r12 = j68.a(r5)
            c68 r2 = r12.b
            r2.getClass()
            chb r5 = new chb
            c68 r2 = r12.b
            r2.getClass()
            c68 r2 = r12.b
            r2.getClass()
            io4 r15 = mo4.a
            r11 = r5
            r13 = r6
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x028c:
            r1.x0 = r5
            r8.Y(r0)
            u2f r2 = r1.Z
            r4 = r2
            jj0 r4 = (defpackage.jj0) r4
            long r4 = r4.b
            long r6 = r2.m()
            long r12 = java.lang.Math.max(r4, r6)
            u2f r2 = r1.Z
            jj0 r2 = (defpackage.jj0) r2
            boolean r2 = r2.c
            m45 r4 = r8.c
            if (r2 != 0) goto L_0x02c7
            r5 = 0
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x02b1
            goto L_0x02c7
        L_0x02b1:
            yh0 r2 = r1.x0
            r8.Z1()
            r4.s2()
            java.util.List r10 = java.util.Collections.singletonList(r2)
            r4.s2()
            r14 = 0
            r11 = 0
            r9 = r4
            r9.l2(r10, r11, r12, r14)
            goto L_0x02e6
        L_0x02c7:
            yh0 r2 = r1.x0
            r8.Z1()
            r4.s2()
            java.util.List r15 = java.util.Collections.singletonList(r2)
            r4.s2()
            r4.s2()
            r19 = 1
            r16 = -1
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = r4
            r14.l2(r15, r16, r17, r19)
        L_0x02e6:
            r8.Z1()
            r4.s2()
            boolean r2 = r4.u()
            p30 r5 = r4.M0
            r6 = 2
            int r5 = r5.d(r6, r2)
            if (r2 == 0) goto L_0x02fd
            if (r5 == r3) goto L_0x02fd
            r7 = r6
            goto L_0x02fe
        L_0x02fd:
            r7 = r3
        L_0x02fe:
            r4.p2(r5, r7, r2)
            txa r2 = r4.o1
            int r5 = r2.e
            if (r5 == r3) goto L_0x0308
            goto L_0x034d
        L_0x0308:
            r5 = 0
            txa r2 = r2.e(r5)
            uje r5 = r2.a
            boolean r5 = r5.q()
            if (r5 == 0) goto L_0x0317
            r9 = 4
            goto L_0x0318
        L_0x0317:
            r9 = r6
        L_0x0318:
            txa r15 = r2.f(r9)
            int r2 = r4.S0
            int r2 = r2 + r3
            r4.S0 = r2
            y45 r2 = r4.A0
            g8e r2 = r2.w0
            r2.getClass()
            e8e r3 = g8e.b()
            android.os.Handler r2 = r2.a
            r5 = 0
            android.os.Message r2 = r2.obtainMessage(r5)
            r3.a = r2
            r3.b()
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r23 = -1
            r16 = 1
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 5
            r14 = r4
            r14.q2(r15, r16, r17, r18, r19, r20, r21, r23)
        L_0x034d:
            if (r0 == 0) goto L_0x0359
            al7 r0 = r1.Y
            if (r0 == 0) goto L_0x0356
            r0.l()
        L_0x0356:
            r1.w()
        L_0x0359:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al7.r(u2f, o98):void");
    }

    public final void s(float f2) {
        u2f u2f = this.f;
        if (u2f == null || !((jj0) u2f).g) {
            this.h = f2;
            this.b.g(f2);
            if (k() && this.f != null && k()) {
                this.c.o(this);
            }
        }
    }

    public final void t() {
        if (this.f != null) {
            udd.p("al7", "Stop %s", new Object[]{this.a});
            this.b.D();
        }
    }

    public final void u() {
        s(0.0f);
    }
}
