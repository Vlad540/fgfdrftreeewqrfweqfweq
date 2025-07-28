package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: y45  reason: default package */
public final class y45 implements Handler.Callback, p88 {
    public final pje A0;
    public final long B0;
    public final boolean C0;
    public final dk D0;
    public final ArrayList E0;
    public final y7e F0;
    public final z35 G0;
    public final y88 H0;
    public final pf8 I0;
    public final a94 J0;
    public wtc K0;
    public txa L0;
    public t45 M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public int S0;
    public boolean T0 = false;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public final ope X;
    public int X0;
    public final c94 Y;
    public w45 Y0;
    public final bf0 Z;
    public long Z0;
    public final pi0[] a;
    public int a1;
    public final Set b;
    public boolean b1;
    public final pi0[] c;
    public ExoPlaybackException c1;
    public long d1;
    public final du7 o;
    public final g8e w0;
    public final HandlerThread x0;
    public final Looper y0;
    public final sje z0;

    public y45(pi0[] pi0Arr, du7 du7, ope ope, c94 c94, bf0 bf0, int i, f44 f44, wtc wtc, a94 a94, boolean z, Looper looper, y7e y7e, z35 z35, bza bza) {
        this.G0 = z35;
        this.a = pi0Arr;
        this.o = du7;
        this.X = ope;
        this.Y = c94;
        this.Z = bf0;
        this.S0 = i;
        this.K0 = wtc;
        this.J0 = a94;
        this.O0 = z;
        this.F0 = y7e;
        this.d1 = -9223372036854775807L;
        this.B0 = c94.h;
        this.C0 = c94.i;
        txa h = txa.h(ope);
        this.L0 = h;
        this.M0 = new t45(h);
        this.c = new pi0[pi0Arr.length];
        for (int i2 = 0; i2 < pi0Arr.length; i2++) {
            pi0 pi0 = pi0Arr[i2];
            pi0.o = i2;
            pi0.X = bza;
            this.c[i2] = pi0;
        }
        this.D0 = new dk(this, y7e);
        this.E0 = new ArrayList();
        this.b = gp0.B();
        this.z0 = new sje();
        this.A0 = new pje();
        du7.a = this;
        du7.b = bf0;
        this.b1 = true;
        Handler handler = new Handler(looper);
        this.H0 = new y88(f44, handler);
        this.I0 = new pf8(this, f44, handler, bza);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.x0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.y0 = looper2;
        this.w0 = y7e.a(looper2, this);
    }

    public static Pair E(uje uje, w45 w45, boolean z, int i, boolean z2, sje sje, pje pje) {
        Object F;
        uje uje2 = uje;
        w45 w452 = w45;
        pje pje2 = pje;
        uje uje3 = w452.a;
        if (uje.q()) {
            return null;
        }
        uje uje4 = uje3.q() ? uje2 : uje3;
        try {
            Pair j = uje4.j(sje, pje, w452.b, w452.c);
            if (uje.equals(uje4)) {
                return j;
            }
            if (uje.b(j.first) == -1) {
                sje sje2 = sje;
                if (z && (F = F(sje, pje, i, z2, j.first, uje4, uje)) != null) {
                    return uje.j(sje, pje, uje.h(F, pje2).c, -9223372036854775807L);
                }
                return null;
            } else if (!uje4.h(j.first, pje2).Y || uje4.n(pje2.c, sje, 0).D0 != uje4.b(j.first)) {
                return j;
            } else {
                return uje.j(sje, pje, uje.h(j.first, pje2).c, w452.c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object F(sje sje, pje pje, int i, boolean z, Object obj, uje uje, uje uje2) {
        int b2 = uje.b(obj);
        int i2 = uje.i();
        int i3 = b2;
        int i4 = -1;
        for (int i5 = 0; i5 < i2 && i4 == -1; i5++) {
            i3 = uje.d(i3, pje, sje, i, z);
            if (i3 == -1) {
                break;
            }
            i4 = uje2.b(uje.m(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return uje2.m(i4);
    }

    public static void L(pi0 pi0, long j) {
        pi0.z0 = true;
        if (pi0 instanceof zfe) {
            zfe zfe = (zfe) pi0;
            swb.h(zfe.z0);
            zfe.P0 = j;
        }
    }

    public static boolean q(pi0 pi0) {
        return pi0.Y != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b9, code lost:
        if (r5.equals(r1.L0.b) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            r30 = this;
            r1 = r30
            r2 = 1
            g8e r0 = r1.w0
            r3 = 2
            android.os.Handler r0 = r0.a
            r0.removeMessages(r3)
            r3 = 0
            r1.c1 = r3
            r4 = 0
            r1.Q0 = r4
            dk r0 = r1.D0
            r0.c = r4
            java.lang.Object r0 = r0.o
            zb8 r0 = (defpackage.zb8) r0
            boolean r5 = r0.b
            if (r5 == 0) goto L_0x0026
            long r5 = r0.e()
            r0.a(r5)
            r0.b = r4
        L_0x0026:
            r5 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.Z0 = r5
            pi0[] r5 = r1.a
            int r6 = r5.length
            r7 = r4
        L_0x0031:
            if (r7 >= r6) goto L_0x0041
            r0 = r5[r7]
            r1.b(r0)     // Catch:{ ExoPlaybackException | RuntimeException -> 0x0039 }
            goto L_0x003f
        L_0x0039:
            r0 = move-exception
            java.lang.String r8 = "Disable failed."
            defpackage.oyb.b(r8, r0)
        L_0x003f:
            int r7 = r7 + r2
            goto L_0x0031
        L_0x0041:
            if (r31 == 0) goto L_0x0060
            pi0[] r5 = r1.a
            int r6 = r5.length
            r7 = r4
        L_0x0047:
            if (r7 >= r6) goto L_0x0060
            r0 = r5[r7]
            java.util.Set r8 = r1.b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x005e
            r0.y()     // Catch:{ RuntimeException -> 0x0057 }
            goto L_0x005e
        L_0x0057:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            defpackage.oyb.b(r0, r8)
        L_0x005e:
            int r7 = r7 + r2
            goto L_0x0047
        L_0x0060:
            r1.X0 = r4
            txa r0 = r1.L0
            re8 r5 = r0.b
            long r6 = r0.s
            txa r0 = r1.L0
            re8 r0 = r0.b
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0090
            txa r0 = r1.L0
            pje r8 = r1.A0
            re8 r9 = r0.b
            uje r0 = r0.a
            boolean r10 = r0.q()
            if (r10 != 0) goto L_0x0090
            java.lang.Object r9 = r9.a
            pje r0 = r0.h(r9, r8)
            boolean r0 = r0.Y
            if (r0 == 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            txa r0 = r1.L0
            long r8 = r0.s
            goto L_0x0094
        L_0x0090:
            txa r0 = r1.L0
            long r8 = r0.c
        L_0x0094:
            if (r32 == 0) goto L_0x00c0
            r1.Y0 = r3
            txa r0 = r1.L0
            uje r0 = r0.a
            android.util.Pair r0 = r1.h(r0)
            java.lang.Object r5 = r0.first
            re8 r5 = (defpackage.re8) r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            txa r0 = r1.L0
            re8 r0 = r0.b
            boolean r0 = r5.equals(r0)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00c0
        L_0x00bb:
            r18 = r5
            r26 = r6
            goto L_0x00c2
        L_0x00c0:
            r2 = r4
            goto L_0x00bb
        L_0x00c2:
            y88 r0 = r1.H0
            r0.b()
            r1.R0 = r4
            txa r0 = new txa
            txa r5 = r1.L0
            uje r6 = r5.a
            int r12 = r5.e
            if (r34 == 0) goto L_0x00d5
        L_0x00d3:
            r13 = r3
            goto L_0x00d8
        L_0x00d5:
            com.google.android.exoplayer2.ExoPlaybackException r3 = r5.f
            goto L_0x00d3
        L_0x00d8:
            if (r2 == 0) goto L_0x00de
            voe r3 = defpackage.voe.o
        L_0x00dc:
            r15 = r3
            goto L_0x00e1
        L_0x00de:
            voe r3 = r5.h
            goto L_0x00dc
        L_0x00e1:
            if (r2 == 0) goto L_0x00e8
            ope r3 = r1.X
        L_0x00e5:
            r16 = r3
            goto L_0x00eb
        L_0x00e8:
            ope r3 = r5.i
            goto L_0x00e5
        L_0x00eb:
            if (r2 == 0) goto L_0x00f4
            po5 r2 = defpackage.ws6.b
            e8c r2 = defpackage.e8c.X
        L_0x00f1:
            r17 = r2
            goto L_0x00f7
        L_0x00f4:
            java.util.List r2 = r5.j
            goto L_0x00f1
        L_0x00f7:
            boolean r2 = r5.l
            r19 = r2
            int r2 = r5.m
            r20 = r2
            vxa r2 = r5.n
            r21 = r2
            boolean r2 = r1.W0
            r28 = r2
            r14 = 0
            r24 = 0
            r29 = 0
            r5 = r0
            r7 = r18
            r10 = r26
            r22 = r26
            r5.<init>(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r29)
            r1.L0 = r0
            if (r33 == 0) goto L_0x015d
            pf8 r1 = r1.I0
            java.lang.Object r0 = r1.e
            r2 = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r0 = r2.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x0129:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = r3.next()
            r5 = r0
            kf8 r5 = (defpackage.kf8) r5
            yh0 r0 = r5.a     // Catch:{ RuntimeException -> 0x013e }
            te8 r6 = r5.b     // Catch:{ RuntimeException -> 0x013e }
            r0.l(r6)     // Catch:{ RuntimeException -> 0x013e }
            goto L_0x0144
        L_0x013e:
            r0 = move-exception
            java.lang.String r6 = "Failed to release child source."
            defpackage.oyb.b(r6, r0)
        L_0x0144:
            yh0 r0 = r5.a
            nxc r6 = r5.c
            r0.o(r6)
            yh0 r0 = r5.a
            r0.n(r6)
            goto L_0x0129
        L_0x0151:
            r2.clear()
            java.lang.Object r0 = r1.f
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.clear()
            r1.g = r4
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y45.A(boolean, boolean, boolean, boolean):void");
    }

    public final void B() {
        t88 t88 = this.H0.h;
        this.P0 = t88 != null && t88.f.h && this.O0;
    }

    public final void C(long j) {
        y88 y88 = this.H0;
        t88 t88 = y88.h;
        long j2 = j + (t88 == null ? 1000000000000L : t88.o);
        this.Z0 = j2;
        ((zb8) this.D0.o).a(j2);
        for (pi0 pi0 : this.a) {
            if (q(pi0)) {
                long j3 = this.Z0;
                pi0.z0 = false;
                pi0.y0 = j3;
                pi0.q(j3, false);
            }
        }
        for (t88 t882 = y88.h; t882 != null; t882 = t882.l) {
            for (f55 f55 : (f55[]) t882.n.X) {
                if (f55 != null) {
                    f55.n();
                }
            }
        }
    }

    public final void D(uje uje, uje uje2) {
        if (!uje.q() || !uje2.q()) {
            ArrayList arrayList = this.E0;
            int size = arrayList.size() - 1;
            if (size < 0) {
                Collections.sort(arrayList);
            } else {
                hr1.r(arrayList.get(size));
                throw null;
            }
        }
    }

    public final void G(long j, long j2) {
        g8e g8e = this.w0;
        g8e.a.removeMessages(2);
        g8e.a.sendEmptyMessageAtTime(2, j + j2);
    }

    public final void H(boolean z) {
        re8 re8 = this.H0.h.f.a;
        long J = J(re8, this.L0.s, true, false);
        if (J != this.L0.s) {
            txa txa = this.L0;
            this.L0 = o(re8, J, txa.c, txa.d, z, 5);
        }
    }

    public final void I(w45 w45) {
        long j;
        long j2;
        boolean z;
        re8 re8;
        long j3;
        long j4;
        long j5;
        txa txa;
        int i;
        w45 w452 = w45;
        boolean z2 = true;
        this.M0.a(1);
        Pair E = E(this.L0.a, w45, true, this.S0, this.T0, this.z0, this.A0);
        if (E == null) {
            Pair h = h(this.L0.a);
            re8 = (re8) h.first;
            long longValue = ((Long) h.second).longValue();
            z = !this.L0.a.q();
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = E.first;
            long longValue2 = ((Long) E.second).longValue();
            long j6 = w452.c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            re8 m = this.H0.m(this.L0.a, obj, longValue2);
            if (m.a()) {
                this.L0.a.h(m.a, this.A0);
                j = this.A0.e(m.b) == m.c ? this.A0.Z.b : 0;
                j2 = j6;
                re8 = m;
                z = true;
            } else {
                j = longValue2;
                j2 = j6;
                z = w452.c == -9223372036854775807L;
                re8 = m;
            }
        }
        try {
            if (this.L0.a.q()) {
                this.Y0 = w452;
            } else if (E == null) {
                if (this.L0.e != 1) {
                    V(4);
                }
                A(false, true, false, true);
            } else {
                if (re8.equals(this.L0.b)) {
                    t88 t88 = this.H0.h;
                    long D = (t88 == null || !t88.d || j == 0) ? j : t88.a.D(j, this.K0);
                    if (mze.M(D) == mze.M(this.L0.s) && ((i = txa.e) == 2 || i == 3)) {
                        long j7 = (txa = this.L0).s;
                        this.L0 = o(re8, j7, j2, j7, z, 2);
                        return;
                    }
                    j5 = D;
                } else {
                    j5 = j;
                }
                boolean z3 = this.L0.e == 4;
                y88 y88 = this.H0;
                long J = J(re8, j5, y88.h != y88.i, z3);
                if (j == J) {
                    z2 = false;
                }
                boolean z4 = z2 | z;
                try {
                    txa txa2 = this.L0;
                    uje uje = txa2.a;
                    e0(uje, re8, uje, txa2.b, j2);
                    z = z4;
                    j4 = J;
                    this.L0 = o(re8, j4, j2, j4, z, 2);
                } catch (Throwable th) {
                    th = th;
                    z = z4;
                    j3 = J;
                    this.L0 = o(re8, j3, j2, j3, z, 2);
                    throw th;
                }
            }
            j4 = j;
            this.L0 = o(re8, j4, j2, j4, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
            this.L0 = o(re8, j3, j2, j3, z, 2);
            throw th;
        }
    }

    public final long J(re8 re8, long j, boolean z, boolean z2) {
        a0();
        this.Q0 = false;
        if (z2 || this.L0.e == 3) {
            V(2);
        }
        y88 y88 = this.H0;
        t88 t88 = y88.h;
        t88 t882 = t88;
        while (t882 != null && !re8.equals(t882.f.a)) {
            t882 = t882.l;
        }
        if (z || t88 != t882 || (t882 != null && t882.o + j < 0)) {
            pi0[] pi0Arr = this.a;
            for (pi0 b2 : pi0Arr) {
                b(b2);
            }
            if (t882 != null) {
                while (y88.h != t882) {
                    y88.a();
                }
                y88.k(t882);
                t882.o = 1000000000000L;
                f(new boolean[pi0Arr.length]);
            }
        }
        if (t882 != null) {
            y88.k(t882);
            if (!t882.d) {
                t882.f = t882.f.b(j);
            } else if (t882.e) {
                r88 r88 = t882.a;
                j = r88.k(j);
                r88.s(j - this.B0, this.C0);
            }
            C(j);
            s();
        } else {
            y88.b();
            C(j);
        }
        k(false);
        this.w0.c(2);
        return j;
    }

    public final void K(kza kza) {
        Looper looper = kza.f;
        if (!looper.getThread().isAlive()) {
            kza.b(false);
            return;
        }
        g8e a2 = this.F0.a(looper, (Handler.Callback) null);
        a2.a.post(new ii4(this, 20, kza));
    }

    public final void M(AtomicBoolean atomicBoolean, boolean z) {
        if (this.U0 != z) {
            this.U0 = z;
            if (!z) {
                for (pi0 pi0 : this.a) {
                    if (!q(pi0) && this.b.remove(pi0)) {
                        pi0.y();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void N(q45 q45) {
        this.M0.a(1);
        int i = q45.c;
        xed xed = q45.b;
        List list = q45.a;
        if (i != -1) {
            this.Y0 = new w45(new tza(list, xed), q45.c, q45.d);
        }
        pf8 pf8 = this.I0;
        ArrayList arrayList = (ArrayList) pf8.b;
        pf8.p(0, arrayList.size());
        l(pf8.a(arrayList.size(), list, xed), false);
    }

    public final void O(boolean z) {
        if (z != this.W0) {
            this.W0 = z;
            txa txa = this.L0;
            int i = txa.e;
            if (z || i == 4 || i == 1) {
                this.L0 = txa.c(z);
            } else {
                this.w0.c(2);
            }
        }
    }

    public final void P(boolean z) {
        this.O0 = z;
        B();
        if (this.P0) {
            y88 y88 = this.H0;
            if (y88.i != y88.h) {
                H(true);
                k(false);
            }
        }
    }

    public final void Q(int i, int i2, boolean z, boolean z2) {
        this.M0.a(z2 ? 1 : 0);
        t45 t45 = this.M0;
        t45.a = true;
        t45.f = true;
        t45.g = i2;
        this.L0 = this.L0.d(i, z);
        this.Q0 = false;
        for (t88 t88 = this.H0.h; t88 != null; t88 = t88.l) {
            for (f55 f55 : (f55[]) t88.n.X) {
                if (f55 != null) {
                    f55.c(z);
                }
            }
        }
        if (!W()) {
            a0();
            d0();
            return;
        }
        int i3 = this.L0.e;
        g8e g8e = this.w0;
        if (i3 == 3) {
            Y();
            g8e.c(2);
        } else if (i3 == 2) {
            g8e.c(2);
        }
    }

    public final void R(vxa vxa) {
        dk dkVar = this.D0;
        dkVar.g(vxa);
        vxa d = dkVar.d();
        n(d, d.a, true, true);
    }

    public final void S(int i) {
        this.S0 = i;
        uje uje = this.L0.a;
        y88 y88 = this.H0;
        y88.f = i;
        if (!y88.n(uje)) {
            H(true);
        }
        k(false);
    }

    public final void T(boolean z) {
        this.T0 = z;
        uje uje = this.L0.a;
        y88 y88 = this.H0;
        y88.g = z;
        if (!y88.n(uje)) {
            H(true);
        }
        k(false);
    }

    public final void U(xed xed) {
        this.M0.a(1);
        pf8 pf8 = this.I0;
        int size = ((ArrayList) pf8.b).size();
        if (xed.b.length != size) {
            xed = new xed(new Random(xed.a.nextLong())).a(size);
        }
        pf8.l = xed;
        l(pf8.e(), false);
    }

    public final void V(int i) {
        txa txa = this.L0;
        if (txa.e != i) {
            if (i != 2) {
                this.d1 = -9223372036854775807L;
            }
            this.L0 = txa.f(i);
        }
    }

    public final boolean W() {
        txa txa = this.L0;
        return txa.l && txa.m == 0;
    }

    public final boolean X(uje uje, re8 re8) {
        if (re8.a() || uje.q()) {
            return false;
        }
        int i = uje.h(re8.a, this.A0).c;
        sje sje = this.z0;
        uje.o(i, sje);
        return sje.a() && sje.x0 && sje.Y != -9223372036854775807L;
    }

    public final void Y() {
        this.Q0 = false;
        dk dkVar = this.D0;
        dkVar.c = true;
        ((zb8) dkVar.o).b();
        for (pi0 pi0 : this.a) {
            if (q(pi0)) {
                swb.h(pi0.Y == 1);
                pi0.Y = 2;
                pi0.s();
            }
        }
    }

    public final void Z(boolean z, boolean z2) {
        A(z || !this.U0, false, true, false);
        this.M0.a(z2 ? 1 : 0);
        this.Y.b(true);
        V(1);
    }

    public final void a(q45 q45, int i) {
        this.M0.a(1);
        pf8 pf8 = this.I0;
        if (i == -1) {
            i = ((ArrayList) pf8.b).size();
        }
        l(pf8.a(i, q45.a, q45.b), false);
    }

    public final void a0() {
        int i;
        dk dkVar = this.D0;
        dkVar.c = false;
        zb8 zb8 = (zb8) dkVar.o;
        if (zb8.b) {
            zb8.a(zb8.e());
            zb8.b = false;
        }
        for (pi0 pi0 : this.a) {
            if (q(pi0) && (i = pi0.Y) == 2) {
                swb.h(i == 2);
                pi0.Y = 1;
                pi0.t();
            }
        }
    }

    public final void b(pi0 pi0) {
        if (q(pi0)) {
            dk dkVar = this.D0;
            if (pi0 == ((pi0) dkVar.Y)) {
                dkVar.Z = null;
                dkVar.Y = null;
                dkVar.b = true;
            }
            int i = pi0.Y;
            if (i == 2) {
                swb.h(i == 2);
                pi0.Y = 1;
                pi0.t();
            }
            swb.h(pi0.Y == 1);
            pi0.b.w();
            pi0.Y = 0;
            pi0.Z = null;
            pi0.w0 = null;
            pi0.z0 = false;
            pi0.o();
            this.X0--;
        }
    }

    public final void b0() {
        t88 t88 = this.H0.j;
        boolean z = this.R0 || (t88 != null && t88.a.b());
        txa txa = this.L0;
        if (z != txa.g) {
            txa txa2 = r2;
            txa txa3 = new txa(txa.a, txa.b, txa.c, txa.d, txa.e, txa.f, z, txa.h, txa.i, txa.j, txa.k, txa.l, txa.m, txa.n, txa.q, txa.r, txa.s, txa.o, txa.p);
            this.L0 = txa2;
        }
    }

    public final void c(jyc jyc) {
        this.w0.a(9, (r88) jyc).b();
    }

    public final void c0(ope ope) {
        f55[] f55Arr = (f55[]) ope.X;
        c94 c94 = this.Y;
        int i = c94.f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                pi0[] pi0Arr = this.a;
                int i4 = 13107200;
                if (i2 < pi0Arr.length) {
                    if (f55Arr[i2] != null) {
                        switch (pi0Arr[i2].a) {
                            case -2:
                                i4 = 0;
                                break;
                            case 0:
                                i4 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i4 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        i3 += i4;
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        c94.j = i;
        c94.a.c(i);
    }

    public final void d(r88 r88) {
        this.w0.a(8, r88).b();
    }

    public final void d0() {
        float f;
        t88 t88 = this.H0.h;
        if (t88 != null) {
            long o2 = t88.d ? t88.a.o() : -9223372036854775807L;
            if (o2 != -9223372036854775807L) {
                C(o2);
                if (o2 != this.L0.s) {
                    txa txa = this.L0;
                    this.L0 = o(txa.b, o2, txa.c, o2, true, 5);
                }
            } else {
                dk dkVar = this.D0;
                boolean z = t88 != this.H0.i;
                pi0 pi0 = (pi0) dkVar.Y;
                zb8 zb8 = (zb8) dkVar.o;
                if (pi0 == null || pi0.m() || (!((pi0) dkVar.Y).n() && (z || ((pi0) dkVar.Y).l()))) {
                    dkVar.b = true;
                    if (dkVar.c) {
                        zb8.b();
                    }
                } else {
                    c28 c28 = (c28) dkVar.Z;
                    c28.getClass();
                    long e = c28.e();
                    if (dkVar.b) {
                        if (e >= zb8.e()) {
                            dkVar.b = false;
                            if (dkVar.c) {
                                zb8.b();
                            }
                        } else if (zb8.b) {
                            zb8.a(zb8.e());
                            zb8.b = false;
                        }
                    }
                    zb8.a(e);
                    vxa d = c28.d();
                    if (!d.equals((vxa) zb8.Y)) {
                        zb8.g(d);
                        ((y45) dkVar.X).w0.a(16, d).b();
                    }
                }
                long e2 = dkVar.e();
                this.Z0 = e2;
                long j = e2 - t88.o;
                long j2 = this.L0.s;
                if (!this.E0.isEmpty() && !this.L0.b.a()) {
                    if (this.b1) {
                        this.b1 = false;
                    }
                    txa txa2 = this.L0;
                    txa2.a.b(txa2.b.a);
                    int min = Math.min(this.a1, this.E0.size());
                    if (min > 0) {
                        hr1.r(this.E0.get(min - 1));
                    }
                    if (min < this.E0.size()) {
                        hr1.r(this.E0.get(min));
                    }
                    this.a1 = min;
                }
                this.L0.s = j;
            }
            this.L0.q = this.H0.j.d();
            txa txa3 = this.L0;
            long j3 = txa3.q;
            t88 t882 = this.H0.j;
            txa3.r = t882 == null ? 0 : Math.max(0, j3 - (this.Z0 - t882.o));
            txa txa4 = this.L0;
            if (txa4.l && txa4.e == 3 && X(txa4.a, txa4.b)) {
                txa txa5 = this.L0;
                if (txa5.n.a == 1.0f) {
                    a94 a94 = this.J0;
                    long g = g(txa5.a, txa5.b.a, txa5.s);
                    long j4 = this.L0.q;
                    t88 t883 = this.H0.j;
                    long max = t883 == null ? 0 : Math.max(0, j4 - (this.Z0 - t883.o));
                    if (a94.e == -9223372036854775807L) {
                        f = 1.0f;
                    } else {
                        long j5 = g - max;
                        long j6 = a94.o;
                        if (j6 == -9223372036854775807L) {
                            a94.o = j5;
                            a94.p = 0;
                        } else {
                            float f2 = a94.d;
                            float f3 = 1.0f - f2;
                            long max2 = Math.max(j5, (long) ((((float) j5) * f3) + (((float) j6) * f2)));
                            a94.o = max2;
                            a94.p = (long) ((f3 * ((float) Math.abs(j5 - max2))) + (f2 * ((float) a94.p)));
                        }
                        if (a94.n == -9223372036854775807L || SystemClock.elapsedRealtime() - a94.n >= 1000) {
                            a94.n = SystemClock.elapsedRealtime();
                            long j7 = (a94.p * 3) + a94.o;
                            if (a94.j > j7) {
                                float D = (float) mze.D(1000);
                                a94.j = js.A(j7, a94.g, a94.j - (((long) ((a94.m - 1.0f) * D)) + ((long) ((a94.k - 1.0f) * D))));
                            } else {
                                long k = mze.k(g - ((long) (Math.max(0.0f, a94.m - 1.0f) / 1.0E-7f)), a94.j, j7);
                                a94.j = k;
                                long j8 = a94.i;
                                if (j8 != -9223372036854775807L && k > j8) {
                                    a94.j = j8;
                                }
                            }
                            long j9 = g - a94.j;
                            if (Math.abs(j9) < a94.b) {
                                a94.m = 1.0f;
                            } else {
                                a94.m = mze.i((1.0E-7f * ((float) j9)) + 1.0f, a94.l, a94.k);
                            }
                            f = a94.m;
                        } else {
                            f = a94.m;
                        }
                    }
                    if (this.D0.d().a != f) {
                        this.D0.g(new vxa(f, this.L0.n.b));
                        n(this.L0.n, this.D0.d().a, false, false);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:326:0x051f, code lost:
        if (r8 >= r4.j) goto L_0x0525;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0630  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x02e3 A[EDGE_INSN: B:444:0x02e3->B:173:0x02e3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r47 = this;
            r0 = r47
            y7e r1 = r0.F0
            r1.getClass()
            long r11 = android.os.SystemClock.uptimeMillis()
            txa r1 = r0.L0
            uje r1 = r1.a
            boolean r1 = r1.q()
            r13 = -9223372036854775808
            r15 = 0
            r9 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0024
            pf8 r1 = r0.I0
            boolean r1 = r1.g
            if (r1 != 0) goto L_0x002a
        L_0x0024:
            r16 = r11
            r11 = 1
            r12 = r6
            goto L_0x0373
        L_0x002a:
            y88 r1 = r0.H0
            long r2 = r0.Z0
            t88 r1 = r1.j
            if (r1 == 0) goto L_0x004b
            t88 r4 = r1.l
            if (r4 != 0) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            r4 = r15
        L_0x0039:
            swb.h(r4)
            boolean r4 = r1.d
            if (r4 == 0) goto L_0x004b
            r88 r4 = r1.a
            r16 = r11
            long r10 = r1.o
            long r2 = r2 - r10
            r4.u(r2)
            goto L_0x004d
        L_0x004b:
            r16 = r11
        L_0x004d:
            y88 r1 = r0.H0
            t88 r2 = r1.j
            if (r2 == 0) goto L_0x007b
            w88 r3 = r2.f
            boolean r3 = r3.i
            if (r3 != 0) goto L_0x0115
            boolean r3 = r2.d
            if (r3 == 0) goto L_0x0115
            boolean r3 = r2.e
            if (r3 == 0) goto L_0x006b
            r88 r2 = r2.a
            long r2 = r2.r()
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0115
        L_0x006b:
            t88 r2 = r1.j
            w88 r2 = r2.f
            long r2 = r2.e
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0115
            int r1 = r1.k
            r2 = 100
            if (r1 >= r2) goto L_0x0115
        L_0x007b:
            y88 r1 = r0.H0
            long r2 = r0.Z0
            txa r4 = r0.L0
            t88 r5 = r1.j
            if (r5 != 0) goto L_0x009c
            uje r2 = r4.a
            re8 r3 = r4.b
            long r10 = r4.c
            long r4 = r4.s
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r10
            r23 = r4
            w88 r1 = r18.d(r19, r20, r21, r23)
            goto L_0x00a2
        L_0x009c:
            uje r4 = r4.a
            w88 r1 = r1.c(r4, r5, r2)
        L_0x00a2:
            if (r1 == 0) goto L_0x0115
            y88 r2 = r0.H0
            pi0[] r3 = r0.c
            du7 r4 = r0.o
            c94 r5 = r0.Y
            l34 r5 = r5.a
            pf8 r8 = r0.I0
            ope r10 = r0.X
            t88 r11 = r2.j
            if (r11 != 0) goto L_0x00be
            r18 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r20 = r18
            goto L_0x00ca
        L_0x00be:
            long r6 = r11.o
            w88 r11 = r11.f
            long r12 = r11.e
            long r6 = r6 + r12
            long r11 = r1.b
            long r6 = r6 - r11
            r20 = r6
        L_0x00ca:
            t88 r6 = new t88
            r18 = r6
            r19 = r3
            r22 = r4
            r23 = r5
            r24 = r8
            r25 = r1
            r26 = r10
            r18.<init>(r19, r20, r22, r23, r24, r25, r26)
            t88 r3 = r2.j
            if (r3 == 0) goto L_0x00ef
            t88 r4 = r3.l
            if (r6 != r4) goto L_0x00e6
            goto L_0x00f3
        L_0x00e6:
            r3.b()
            r3.l = r6
            r3.c()
            goto L_0x00f3
        L_0x00ef:
            r2.h = r6
            r2.i = r6
        L_0x00f3:
            r2.l = r9
            r2.j = r6
            int r3 = r2.k
            r4 = 1
            int r3 = r3 + r4
            r2.k = r3
            r2.j()
            r88 r2 = r6.a
            long r3 = r1.b
            r2.L(r0, r3)
            y88 r2 = r0.H0
            t88 r2 = r2.h
            if (r2 != r6) goto L_0x0112
            long r1 = r1.b
            r0.C(r1)
        L_0x0112:
            r0.k(r15)
        L_0x0115:
            boolean r1 = r0.R0
            if (r1 == 0) goto L_0x0123
            boolean r1 = r47.p()
            r0.R0 = r1
            r47.b0()
            goto L_0x0126
        L_0x0123:
            r47.s()
        L_0x0126:
            y88 r1 = r0.H0
            t88 r2 = r1.i
            if (r2 != 0) goto L_0x0133
        L_0x012c:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x026d
        L_0x0133:
            t88 r3 = r2.l
            pi0[] r8 = r0.a
            if (r3 == 0) goto L_0x013d
            boolean r3 = r0.P0
            if (r3 == 0) goto L_0x0144
        L_0x013d:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0234
        L_0x0144:
            boolean r3 = r2.d
            if (r3 != 0) goto L_0x0149
            goto L_0x012c
        L_0x0149:
            r3 = r15
        L_0x014a:
            int r4 = r8.length
            if (r3 >= r4) goto L_0x0180
            r4 = r8[r3]
            xjc[] r5 = r2.c
            r5 = r5[r3]
            xjc r6 = r4.Z
            if (r6 != r5) goto L_0x012c
            if (r5 == 0) goto L_0x017d
            boolean r5 = r4.l()
            if (r5 != 0) goto L_0x017d
            t88 r5 = r2.l
            w88 r6 = r2.f
            boolean r6 = r6.f
            if (r6 == 0) goto L_0x012c
            boolean r6 = r5.d
            if (r6 == 0) goto L_0x012c
            boolean r6 = r4 instanceof defpackage.zfe
            if (r6 != 0) goto L_0x017d
            boolean r6 = r4 instanceof defpackage.l39
            if (r6 != 0) goto L_0x017d
            long r6 = r4.y0
            long r4 = r5.e()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x012c
        L_0x017d:
            int r3 = r3 + 1
            goto L_0x014a
        L_0x0180:
            t88 r3 = r2.l
            boolean r4 = r3.d
            if (r4 != 0) goto L_0x0191
            long r4 = r0.Z0
            long r6 = r3.e()
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0191
            goto L_0x012c
        L_0x0191:
            ope r10 = r2.n
            t88 r3 = r1.i
            if (r3 == 0) goto L_0x019d
            t88 r3 = r3.l
            if (r3 == 0) goto L_0x019d
            r3 = 1
            goto L_0x019e
        L_0x019d:
            r3 = r15
        L_0x019e:
            swb.h(r3)
            t88 r3 = r1.i
            t88 r3 = r3.l
            r1.i = r3
            r1.j()
            t88 r11 = r1.i
            ope r13 = r11.n
            txa r1 = r0.L0
            uje r4 = r1.a
            w88 r1 = r11.f
            re8 r3 = r1.a
            w88 r1 = r2.f
            re8 r5 = r1.a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r47
            r2 = r4
            r18 = r13
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.e0(r2, r3, r4, r5, r6)
            boolean r1 = r11.d
            if (r1 == 0) goto L_0x01ee
            r88 r1 = r11.a
            long r1 = r1.o()
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x01ee
            long r1 = r11.e()
            int r3 = r8.length
            r4 = r15
        L_0x01e0:
            if (r4 >= r3) goto L_0x026d
            r5 = r8[r4]
            xjc r6 = r5.Z
            if (r6 == 0) goto L_0x01eb
            L(r5, r1)
        L_0x01eb:
            int r4 = r4 + 1
            goto L_0x01e0
        L_0x01ee:
            r1 = r15
        L_0x01ef:
            int r2 = r8.length
            if (r1 >= r2) goto L_0x026d
            boolean r2 = r10.I(r1)
            r3 = r18
            boolean r4 = r3.I(r1)
            if (r2 == 0) goto L_0x022f
            r2 = r8[r1]
            boolean r2 = r2.z0
            if (r2 != 0) goto L_0x022f
            pi0[] r2 = r0.c
            r2 = r2[r1]
            int r2 = r2.a
            r5 = -2
            if (r2 != r5) goto L_0x020f
            r2 = 1
            goto L_0x0210
        L_0x020f:
            r2 = r15
        L_0x0210:
            java.lang.Object r5 = r10.o
            i9c[] r5 = (defpackage.i9c[]) r5
            r5 = r5[r1]
            java.lang.Object r6 = r3.o
            i9c[] r6 = (defpackage.i9c[]) r6
            r6 = r6[r1]
            if (r4 == 0) goto L_0x0226
            boolean r4 = r6.equals(r5)
            if (r4 == 0) goto L_0x0226
            if (r2 == 0) goto L_0x022f
        L_0x0226:
            r2 = r8[r1]
            long r4 = r11.e()
            L(r2, r4)
        L_0x022f:
            int r1 = r1 + 1
            r18 = r3
            goto L_0x01ef
        L_0x0234:
            w88 r1 = r2.f
            boolean r1 = r1.i
            if (r1 != 0) goto L_0x023e
            boolean r1 = r0.P0
            if (r1 == 0) goto L_0x026d
        L_0x023e:
            r1 = r15
        L_0x023f:
            int r3 = r8.length
            if (r1 >= r3) goto L_0x026d
            r3 = r8[r1]
            xjc[] r4 = r2.c
            r4 = r4[r1]
            if (r4 == 0) goto L_0x026a
            xjc r5 = r3.Z
            if (r5 != r4) goto L_0x026a
            boolean r4 = r3.l()
            if (r4 == 0) goto L_0x026a
            w88 r4 = r2.f
            long r4 = r4.e
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x0266
            r6 = -9223372036854775808
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0266
            long r6 = r2.o
            long r6 = r6 + r4
            goto L_0x0267
        L_0x0266:
            r6 = r12
        L_0x0267:
            L(r3, r6)
        L_0x026a:
            int r1 = r1 + 1
            goto L_0x023f
        L_0x026d:
            y88 r1 = r0.H0
            t88 r2 = r1.i
            if (r2 == 0) goto L_0x02ee
            t88 r1 = r1.h
            if (r1 == r2) goto L_0x02ee
            boolean r1 = r2.g
            if (r1 == 0) goto L_0x027d
            goto L_0x02ee
        L_0x027d:
            ope r1 = r2.n
            r3 = r15
            r4 = r3
        L_0x0281:
            pi0[] r5 = r0.a
            int r6 = r5.length
            if (r4 >= r6) goto L_0x02e3
            r5 = r5[r4]
            boolean r6 = q(r5)
            if (r6 != 0) goto L_0x028f
            goto L_0x02e0
        L_0x028f:
            xjc r6 = r5.Z
            xjc[] r7 = r2.c
            r8 = r7[r4]
            if (r6 == r8) goto L_0x0299
            r6 = 1
            goto L_0x029a
        L_0x0299:
            r6 = r15
        L_0x029a:
            boolean r8 = r1.I(r4)
            if (r8 == 0) goto L_0x02a3
            if (r6 != 0) goto L_0x02a3
            goto L_0x02e0
        L_0x02a3:
            boolean r6 = r5.z0
            if (r6 != 0) goto L_0x02d5
            java.lang.Object r6 = r1.X
            f55[] r6 = (defpackage.f55[]) r6
            r6 = r6[r4]
            if (r6 == 0) goto L_0x02b4
            int r8 = r6.length()
            goto L_0x02b5
        L_0x02b4:
            r8 = r15
        L_0x02b5:
            vu5[] r10 = new defpackage.vu5[r8]
            r11 = r15
        L_0x02b8:
            if (r11 >= r8) goto L_0x02c3
            vu5 r18 = r6.d(r11)
            r10[r11] = r18
            int r11 = r11 + 1
            goto L_0x02b8
        L_0x02c3:
            r20 = r7[r4]
            long r21 = r2.e()
            long r6 = r2.o
            r18 = r5
            r19 = r10
            r23 = r6
            r18.x(r19, r20, r21, r23)
            goto L_0x02e0
        L_0x02d5:
            boolean r6 = r5.m()
            if (r6 == 0) goto L_0x02df
            r0.b(r5)
            goto L_0x02e0
        L_0x02df:
            r3 = 1
        L_0x02e0:
            int r4 = r4 + 1
            goto L_0x0281
        L_0x02e3:
            r4 = 1
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x02ee
            int r1 = r5.length
            boolean[] r1 = new boolean[r1]
            r0.f(r1)
        L_0x02ee:
            r14 = r15
        L_0x02ef:
            boolean r1 = r47.W()
            if (r1 != 0) goto L_0x02f7
            goto L_0x0372
        L_0x02f7:
            boolean r1 = r0.P0
            if (r1 == 0) goto L_0x02fd
            goto L_0x0372
        L_0x02fd:
            y88 r1 = r0.H0
            t88 r3 = r1.h
            if (r3 != 0) goto L_0x0305
            goto L_0x0372
        L_0x0305:
            t88 r3 = r3.l
            if (r3 == 0) goto L_0x0372
            long r4 = r0.Z0
            long r6 = r3.e()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0372
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x0372
            if (r14 == 0) goto L_0x031c
            r47.t()
        L_0x031c:
            t88 r1 = r1.a()
            r1.getClass()
            txa r3 = r0.L0
            re8 r3 = r3.b
            java.lang.Object r3 = r3.a
            w88 r4 = r1.f
            re8 r4 = r4.a
            java.lang.Object r4 = r4.a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x034e
            txa r3 = r0.L0
            re8 r3 = r3.b
            int r4 = r3.b
            r5 = -1
            if (r4 != r5) goto L_0x034e
            w88 r4 = r1.f
            re8 r4 = r4.a
            int r6 = r4.b
            if (r6 != r5) goto L_0x034e
            int r3 = r3.e
            int r4 = r4.e
            if (r3 == r4) goto L_0x034e
            r14 = 1
            goto L_0x034f
        L_0x034e:
            r14 = r15
        L_0x034f:
            w88 r1 = r1.f
            re8 r3 = r1.a
            long r7 = r1.b
            long r5 = r1.c
            r10 = 1
            r11 = r14 ^ 1
            r14 = 0
            r1 = r47
            r2 = r3
            r3 = r7
            r9 = r11
            r11 = r10
            r10 = r14
            txa r1 = r1.o(r2, r3, r5, r7, r9, r10)
            r0.L0 = r1
            r47.B()
            r47.d0()
            r14 = r11
            r9 = 0
            goto L_0x02ef
        L_0x0372:
            r11 = 1
        L_0x0373:
            txa r1 = r0.L0
            int r1 = r1.e
            if (r1 == r11) goto L_0x06c3
            r3 = 4
            if (r1 != r3) goto L_0x037e
            goto L_0x06c3
        L_0x037e:
            y88 r1 = r0.H0
            t88 r1 = r1.h
            r4 = 10
            if (r1 != 0) goto L_0x038c
            r6 = r16
            r0.G(r6, r4)
            return
        L_0x038c:
            r6 = r16
            java.lang.String r8 = "doSomeWork"
            defpackage.xs7.e(r8)
            r47.d0()
            boolean r8 = r1.d
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r8 == 0) goto L_0x0410
            long r16 = android.os.SystemClock.elapsedRealtime()
            long r4 = r16 * r9
            r88 r8 = r1.a
            txa r14 = r0.L0
            long r9 = r14.s
            long r2 = r0.B0
            long r9 = r9 - r2
            boolean r2 = r0.C0
            r8.s(r9, r2)
            r2 = r11
            r10 = r2
            r3 = r15
        L_0x03b3:
            pi0[] r8 = r0.a
            int r9 = r8.length
            if (r3 >= r9) goto L_0x0417
            r8 = r8[r3]
            boolean r9 = q(r8)
            if (r9 != 0) goto L_0x03c1
            goto L_0x040c
        L_0x03c1:
            long r14 = r0.Z0
            r8.w(r14, r4)
            if (r10 == 0) goto L_0x03d0
            boolean r10 = r8.m()
            if (r10 == 0) goto L_0x03d0
            r10 = r11
            goto L_0x03d1
        L_0x03d0:
            r10 = 0
        L_0x03d1:
            xjc[] r14 = r1.c
            r14 = r14[r3]
            xjc r15 = r8.Z
            if (r14 == r15) goto L_0x03db
            r14 = r11
            goto L_0x03dc
        L_0x03db:
            r14 = 0
        L_0x03dc:
            if (r14 != 0) goto L_0x03e6
            boolean r15 = r8.l()
            if (r15 == 0) goto L_0x03e6
            r15 = r11
            goto L_0x03e7
        L_0x03e6:
            r15 = 0
        L_0x03e7:
            if (r14 != 0) goto L_0x03fa
            if (r15 != 0) goto L_0x03fa
            boolean r14 = r8.n()
            if (r14 != 0) goto L_0x03fa
            boolean r14 = r8.m()
            if (r14 == 0) goto L_0x03f8
            goto L_0x03fa
        L_0x03f8:
            r14 = 0
            goto L_0x03fb
        L_0x03fa:
            r14 = r11
        L_0x03fb:
            if (r2 == 0) goto L_0x0401
            if (r14 == 0) goto L_0x0401
            r2 = r11
            goto L_0x0402
        L_0x0401:
            r2 = 0
        L_0x0402:
            if (r14 != 0) goto L_0x040c
            xjc r8 = r8.Z
            r8.getClass()
            r8.c()
        L_0x040c:
            int r3 = r3 + 1
            r15 = 0
            goto L_0x03b3
        L_0x0410:
            r88 r2 = r1.a
            r2.i()
            r2 = r11
            r10 = r2
        L_0x0417:
            w88 r3 = r1.f
            long r3 = r3.e
            if (r10 == 0) goto L_0x042f
            boolean r5 = r1.d
            if (r5 == 0) goto L_0x042f
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x042d
            txa r5 = r0.L0
            long r14 = r5.s
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x042f
        L_0x042d:
            r10 = r11
            goto L_0x0430
        L_0x042f:
            r10 = 0
        L_0x0430:
            if (r10 == 0) goto L_0x0441
            boolean r3 = r0.P0
            if (r3 == 0) goto L_0x0441
            r3 = 0
            r0.P0 = r3
            txa r4 = r0.L0
            int r4 = r4.m
            r5 = 5
            r0.Q(r4, r5, r3, r3)
        L_0x0441:
            r3 = 3
            if (r10 == 0) goto L_0x0453
            w88 r4 = r1.f
            boolean r4 = r4.i
            if (r4 == 0) goto L_0x0453
            r4 = 4
            r0.V(r4)
            r47.a0()
            goto L_0x059a
        L_0x0453:
            txa r4 = r0.L0
            int r5 = r4.e
            r8 = 2
            if (r5 != r8) goto L_0x0538
            int r5 = r0.X0
            if (r5 != 0) goto L_0x0465
            boolean r10 = r47.r()
            r4 = r10
            goto L_0x0526
        L_0x0465:
            if (r2 != 0) goto L_0x046a
        L_0x0467:
            r4 = 0
            goto L_0x0526
        L_0x046a:
            boolean r5 = r4.g
            if (r5 != 0) goto L_0x0471
            r4 = r11
            goto L_0x0526
        L_0x0471:
            uje r4 = r4.a
            y88 r5 = r0.H0
            t88 r8 = r5.h
            w88 r8 = r8.f
            re8 r8 = r8.a
            boolean r4 = r0.X(r4, r8)
            if (r4 == 0) goto L_0x0486
            a94 r4 = r0.J0
            long r9 = r4.j
            goto L_0x0487
        L_0x0486:
            r9 = r12
        L_0x0487:
            t88 r4 = r5.j
            boolean r5 = r4.d
            if (r5 == 0) goto L_0x04a5
            boolean r5 = r4.e
            if (r5 == 0) goto L_0x049d
            r88 r5 = r4.a
            long r21 = r5.r()
            r23 = -9223372036854775808
            int r5 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r5 != 0) goto L_0x04a5
        L_0x049d:
            w88 r5 = r4.f
            boolean r5 = r5.i
            if (r5 == 0) goto L_0x04a5
            r5 = r11
            goto L_0x04a6
        L_0x04a5:
            r5 = 0
        L_0x04a6:
            w88 r15 = r4.f
            re8 r15 = r15.a
            boolean r15 = r15.a()
            if (r15 == 0) goto L_0x04b6
            boolean r4 = r4.d
            if (r4 != 0) goto L_0x04b6
            r4 = r11
            goto L_0x04b7
        L_0x04b6:
            r4 = 0
        L_0x04b7:
            if (r5 != 0) goto L_0x0525
            if (r4 != 0) goto L_0x0525
            txa r4 = r0.L0
            long r4 = r4.q
            y88 r15 = r0.H0
            t88 r15 = r15.j
            r22 = r9
            r8 = 0
            if (r15 != 0) goto L_0x04cb
            r4 = r8
            goto L_0x04d5
        L_0x04cb:
            long r11 = r0.Z0
            long r14 = r15.o
            long r11 = r11 - r14
            long r4 = r4 - r11
            long r4 = java.lang.Math.max(r8, r4)
        L_0x04d5:
            dk r11 = r0.D0
            vxa r11 = r11.d()
            float r11 = r11.a
            boolean r12 = r0.Q0
            c94 r14 = r0.Y
            r14.getClass()
            long r4 = defpackage.mze.w(r11, r4)
            if (r12 == 0) goto L_0x04f2
            long r11 = r14.e
        L_0x04ec:
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x04f5
        L_0x04f2:
            long r11 = r14.d
            goto L_0x04ec
        L_0x04f5:
            int r15 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r15 == 0) goto L_0x0504
            r24 = 2
            r26 = r14
            long r13 = r22 / r24
            long r11 = java.lang.Math.min(r13, r11)
            goto L_0x0506
        L_0x0504:
            r26 = r14
        L_0x0506:
            int r8 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0525
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0525
            r4 = r26
            boolean r5 = r4.g
            if (r5 != 0) goto L_0x0467
            l34 r5 = r4.a
            monitor-enter(r5)
            int r8 = r5.e     // Catch:{ all -> 0x0522 }
            int r9 = r5.c     // Catch:{ all -> 0x0522 }
            int r8 = r8 * r9
            monitor-exit(r5)
            int r4 = r4.j
            if (r8 < r4) goto L_0x0467
            goto L_0x0525
        L_0x0522:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0522 }
            throw r0
        L_0x0525:
            r4 = 1
        L_0x0526:
            if (r4 == 0) goto L_0x0538
            r0.V(r3)
            r2 = 0
            r0.c1 = r2
            boolean r2 = r47.W()
            if (r2 == 0) goto L_0x059a
            r47.Y()
            goto L_0x059a
        L_0x0538:
            txa r4 = r0.L0
            int r4 = r4.e
            if (r4 != r3) goto L_0x059a
            int r4 = r0.X0
            if (r4 != 0) goto L_0x0549
            boolean r2 = r47.r()
            if (r2 == 0) goto L_0x054b
            goto L_0x059a
        L_0x0549:
            if (r2 != 0) goto L_0x059a
        L_0x054b:
            boolean r2 = r47.W()
            r0.Q0 = r2
            r2 = 2
            r0.V(r2)
            boolean r2 = r0.Q0
            if (r2 == 0) goto L_0x0597
            y88 r2 = r0.H0
            t88 r2 = r2.h
        L_0x055d:
            if (r2 == 0) goto L_0x0576
            ope r4 = r2.n
            java.lang.Object r4 = r4.X
            f55[] r4 = (defpackage.f55[]) r4
            int r5 = r4.length
            r8 = 0
        L_0x0567:
            if (r8 >= r5) goto L_0x0573
            r9 = r4[r8]
            if (r9 == 0) goto L_0x0570
            r9.o()
        L_0x0570:
            int r8 = r8 + 1
            goto L_0x0567
        L_0x0573:
            t88 r2 = r2.l
            goto L_0x055d
        L_0x0576:
            a94 r2 = r0.J0
            long r4 = r2.j
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x0584
            goto L_0x0597
        L_0x0584:
            long r11 = r2.c
            long r4 = r4 + r11
            r2.j = r4
            long r11 = r2.i
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x0595
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0595
            r2.j = r11
        L_0x0595:
            r2.n = r8
        L_0x0597:
            r47.a0()
        L_0x059a:
            txa r2 = r0.L0
            int r2 = r2.e
            r4 = 2
            if (r2 != r4) goto L_0x05db
            r2 = 0
        L_0x05a2:
            pi0[] r4 = r0.a
            int r5 = r4.length
            if (r2 >= r5) goto L_0x05c4
            r4 = r4[r2]
            boolean r4 = q(r4)
            if (r4 == 0) goto L_0x05c1
            pi0[] r4 = r0.a
            r4 = r4[r2]
            xjc r4 = r4.Z
            xjc[] r5 = r1.c
            r5 = r5[r2]
            if (r4 != r5) goto L_0x05c1
            r4.getClass()
            r4.c()
        L_0x05c1:
            int r2 = r2 + 1
            goto L_0x05a2
        L_0x05c4:
            txa r1 = r0.L0
            boolean r2 = r1.g
            if (r2 != 0) goto L_0x05db
            long r1 = r1.r
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x05db
            boolean r1 = r47.p()
            if (r1 == 0) goto L_0x05db
            r1 = 1
            goto L_0x05dc
        L_0x05db:
            r1 = 0
        L_0x05dc:
            if (r1 != 0) goto L_0x05e6
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.d1 = r1
            goto L_0x060f
        L_0x05e6:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r4 = r0.d1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x05fd
            y7e r1 = r0.F0
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.d1 = r1
            goto L_0x060f
        L_0x05fd:
            y7e r1 = r0.F0
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.d1
            long r1 = r1 - r4
            r4 = 4000(0xfa0, double:1.9763E-320)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x06bb
        L_0x060f:
            boolean r1 = r0.W0
            txa r2 = r0.L0
            boolean r4 = r2.o
            if (r1 == r4) goto L_0x061d
            txa r1 = r2.c(r1)
            r0.L0 = r1
        L_0x061d:
            boolean r1 = r47.W()
            if (r1 == 0) goto L_0x0629
            txa r1 = r0.L0
            int r1 = r1.e
            if (r1 == r3) goto L_0x0630
        L_0x0629:
            txa r1 = r0.L0
            int r1 = r1.e
            r2 = 2
            if (r1 != r2) goto L_0x0645
        L_0x0630:
            boolean r1 = r0.W0
            if (r1 == 0) goto L_0x063b
            boolean r1 = r0.V0
            if (r1 == 0) goto L_0x063b
            r1 = 1
            r10 = 0
            goto L_0x0642
        L_0x063b:
            r1 = 10
            r0.G(r6, r1)
            r1 = 1
            r10 = 1
        L_0x0642:
            r3 = r10 ^ 1
            goto L_0x065b
        L_0x0645:
            int r2 = r0.X0
            if (r2 == 0) goto L_0x0652
            r2 = 4
            if (r1 == r2) goto L_0x0652
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.G(r6, r1)
            goto L_0x065a
        L_0x0652:
            g8e r1 = r0.w0
            android.os.Handler r1 = r1.a
            r2 = 2
            r1.removeMessages(r2)
        L_0x065a:
            r3 = 0
        L_0x065b:
            txa r1 = r0.L0
            boolean r2 = r1.p
            if (r2 == r3) goto L_0x06b4
            txa r2 = new txa
            r22 = r2
            uje r4 = r1.a
            r23 = r4
            re8 r4 = r1.b
            r24 = r4
            long r4 = r1.c
            r25 = r4
            long r4 = r1.d
            r27 = r4
            int r4 = r1.e
            r29 = r4
            com.google.android.exoplayer2.ExoPlaybackException r4 = r1.f
            r30 = r4
            boolean r4 = r1.g
            r31 = r4
            voe r4 = r1.h
            r32 = r4
            ope r4 = r1.i
            r33 = r4
            java.util.List r4 = r1.j
            r34 = r4
            re8 r4 = r1.k
            r35 = r4
            boolean r4 = r1.l
            r36 = r4
            int r4 = r1.m
            r37 = r4
            vxa r4 = r1.n
            r38 = r4
            long r4 = r1.q
            r39 = r4
            long r4 = r1.r
            r41 = r4
            long r4 = r1.s
            r43 = r4
            boolean r1 = r1.o
            r45 = r1
            r46 = r3
            r22.<init>(r23, r24, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r46)
            r0.L0 = r2
        L_0x06b4:
            r1 = 0
            r0.V0 = r1
            defpackage.xs7.l()
            return
        L_0x06bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x06c3:
            g8e r0 = r0.w0
            android.os.Handler r0 = r0.a
            r1 = 2
            r0.removeMessages(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y45.e():void");
    }

    public final void e0(uje uje, re8 re8, uje uje2, re8 re82, long j) {
        if (!X(uje, re8)) {
            vxa vxa = re8.a() ? vxa.o : this.L0.n;
            dk dkVar = this.D0;
            if (!dkVar.d().equals(vxa)) {
                dkVar.g(vxa);
                return;
            }
            return;
        }
        Object obj = re8.a;
        pje pje = this.A0;
        int i = uje.h(obj, pje).c;
        sje sje = this.z0;
        uje.o(i, sje);
        y58 y58 = sje.z0;
        int i2 = mze.a;
        a94 a94 = this.J0;
        a94.getClass();
        a94.e = mze.D(y58.a);
        a94.h = mze.D(y58.b);
        a94.i = mze.D(y58.c);
        float f = y58.o;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        a94.l = f;
        float f2 = y58.X;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        a94.k = f2;
        if (f == 1.0f && f2 == 1.0f) {
            a94.e = -9223372036854775807L;
        }
        a94.a();
        if (j != -9223372036854775807L) {
            a94.f = g(uje, obj, j);
            a94.a();
            return;
        }
        if (!mze.a(!uje2.q() ? uje2.n(uje2.h(re82.a, pje).c, sje, 0).a : null, sje.a)) {
            a94.f = -9223372036854775807L;
            a94.a();
        }
    }

    public final void f(boolean[] zArr) {
        pi0[] pi0Arr;
        Set set;
        int i;
        pi0[] pi0Arr2;
        t88 t88;
        y88 y88;
        c28 c28;
        y88 y882 = this.H0;
        t88 t882 = y882.i;
        ope ope = t882.n;
        int i2 = 0;
        while (true) {
            pi0Arr = this.a;
            int length = pi0Arr.length;
            set = this.b;
            if (i2 >= length) {
                break;
            }
            if (!ope.I(i2) && set.remove(pi0Arr[i2])) {
                pi0Arr[i2].y();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < pi0Arr.length) {
            if (ope.I(i3)) {
                boolean z = zArr[i3];
                pi0 pi0 = pi0Arr[i3];
                if (!q(pi0)) {
                    t88 t883 = y882.i;
                    boolean z2 = t883 == y882.h;
                    ope ope2 = t883.n;
                    i9c i9c = ((i9c[]) ope2.o)[i3];
                    f55 f55 = ((f55[]) ope2.X)[i3];
                    int length2 = f55 != null ? f55.length() : 0;
                    vu5[] vu5Arr = new vu5[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        vu5Arr[i4] = f55.d(i4);
                    }
                    boolean z3 = W() && this.L0.e == 3;
                    boolean z4 = !z && z3;
                    this.X0++;
                    set.add(pi0);
                    xjc xjc = t883.c[i3];
                    y88 = y882;
                    t88 = t882;
                    long j = this.Z0;
                    long e = t883.e();
                    i = i3;
                    pi0Arr2 = pi0Arr;
                    long j2 = t883.o;
                    swb.h(pi0.Y == 0);
                    pi0.c = i9c;
                    pi0.Y = 1;
                    pi0.p(z4, z2);
                    pi0 pi02 = pi0;
                    pi0.x(vu5Arr, xjc, e, j2);
                    pi02.z0 = false;
                    pi02.y0 = j;
                    pi02.q(j, z4);
                    pi02.a(11, new o45(this));
                    dk dkVar = this.D0;
                    dkVar.getClass();
                    c28 j3 = pi02.j();
                    if (!(j3 == null || j3 == (c28 = (c28) dkVar.Z))) {
                        if (c28 == null) {
                            dkVar.Z = j3;
                            dkVar.Y = pi02;
                            ((l28) j3).g((vxa) ((zb8) dkVar.o).Y);
                        } else {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z3) {
                        swb.h(pi02.Y == 1);
                        pi02.Y = 2;
                        pi02.s();
                    }
                    i3 = i + 1;
                    y882 = y88;
                    t882 = t88;
                    pi0Arr = pi0Arr2;
                }
            }
            y88 = y882;
            t88 = t882;
            i = i3;
            pi0Arr2 = pi0Arr;
            i3 = i + 1;
            y882 = y88;
            t882 = t88;
            pi0Arr = pi0Arr2;
        }
        t882.g = true;
    }

    public final long g(uje uje, Object obj, long j) {
        pje pje = this.A0;
        int i = uje.h(obj, pje).c;
        sje sje = this.z0;
        uje.o(i, sje);
        if (sje.Y == -9223372036854775807L || !sje.a() || !sje.x0) {
            return -9223372036854775807L;
        }
        return mze.D(mze.t(sje.Z) - sje.Y) - (j + pje.X);
    }

    public final Pair h(uje uje) {
        long j = 0;
        if (uje.q()) {
            return Pair.create(txa.t, 0L);
        }
        int a2 = uje.a(this.T0);
        uje uje2 = uje;
        Pair j2 = uje2.j(this.z0, this.A0, a2, -9223372036854775807L);
        re8 m = this.H0.m(uje, j2.first, 0);
        long longValue = ((Long) j2.second).longValue();
        if (m.a()) {
            Object obj = m.a;
            pje pje = this.A0;
            uje.h(obj, pje);
            if (m.c == pje.e(m.b)) {
                j = pje.Z.b;
            }
            longValue = j;
        }
        return Pair.create(m, Long.valueOf(longValue));
    }

    public final boolean handleMessage(Message message) {
        t88 t88;
        int i;
        kza kza;
        int i2 = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    Q(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    I((w45) message.obj);
                    break;
                case 4:
                    R((vxa) message.obj);
                    break;
                case 5:
                    this.K0 = (wtc) message.obj;
                    break;
                case 6:
                    Z(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((r88) message.obj);
                    break;
                case 9:
                    i((r88) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    S(message.arg1);
                    break;
                case 12:
                    T(message.arg1 != 0);
                    break;
                case 13:
                    M((AtomicBoolean) message.obj, message.arg1 != 0);
                    break;
                case 14:
                    kza = (kza) message.obj;
                    kza.getClass();
                    Looper looper = kza.f;
                    Looper looper2 = this.y0;
                    g8e g8e = this.w0;
                    if (looper != looper2) {
                        g8e.a(15, kza).b();
                        break;
                    } else {
                        synchronized (kza) {
                        }
                        kza.a.a(kza.d, kza.e);
                        kza.b(true);
                        int i3 = this.L0.e;
                        if (i3 == 3 || i3 == 2) {
                            g8e.c(2);
                            break;
                        }
                    }
                case 15:
                    K((kza) message.obj);
                    break;
                case 16:
                    vxa vxa = (vxa) message.obj;
                    n(vxa, vxa.a, true, false);
                    break;
                case 17:
                    N((q45) message.obj);
                    break;
                case 18:
                    a((q45) message.obj, message.arg1);
                    break;
                case 19:
                    hr1.r(message.obj);
                    v();
                    throw null;
                case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                    y(message.arg1, message.arg2, (xed) message.obj);
                    break;
                case 21:
                    U((xed) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message.arg1 != 0);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                    O(message.arg1 == 1);
                    break;
                case 25:
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.c == 1 && (t88 = this.H0.i) != null) {
                e = e.a(t88.f.a);
            }
            if (!e.x0 || this.c1 != null) {
                ExoPlaybackException exoPlaybackException = this.c1;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.c1;
                }
                oyb.b("Playback error", e);
                Z(true, false);
                this.L0 = this.L0.e(e);
            } else {
                oyb.b("Recoverable renderer error", e);
                this.c1 = e;
                g8e g8e2 = this.w0;
                e8e a2 = g8e2.a(25, e);
                g8e2.getClass();
                Message message2 = a2.a;
                message2.getClass();
                g8e2.a.sendMessageAtFrontOfQueue(message2);
                a2.a();
            }
        } catch (DrmSession$DrmSessionException e2) {
            j(e2.a, e2);
        } catch (ParserException e3) {
            boolean z = e3.a;
            int i4 = e3.b;
            if (i4 == 1) {
                i = z ? 3001 : 3003;
            } else {
                if (i4 == 4) {
                    i = z ? 3002 : 3004;
                }
                j(i2, e3);
            }
            i2 = i;
            j(i2, e3);
        } catch (DataSourceException e4) {
            j(e4.a, e4);
        } catch (BehindLiveWindowException e5) {
            j(1002, e5);
        } catch (IOException e6) {
            j(2000, e6);
        } catch (RuntimeException e7) {
            if ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) {
                i2 = 1004;
            }
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, i2);
            oyb.b("Playback error", exoPlaybackException2);
            Z(true, false);
            this.L0 = this.L0.e(exoPlaybackException2);
        } catch (Throwable th) {
            kza.b(true);
            throw th;
        }
        t();
        return true;
    }

    public final void i(r88 r88) {
        t88 t88 = this.H0.j;
        if (t88 != null && t88.a == r88) {
            long j = this.Z0;
            if (t88 != null) {
                swb.h(t88.l == null);
                if (t88.d) {
                    t88.a.u(j - t88.o);
                }
            }
            s();
        }
    }

    public final void j(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        t88 t88 = this.H0.h;
        if (t88 != null) {
            exoPlaybackException = exoPlaybackException.a(t88.f.a);
        }
        oyb.b("Playback error", exoPlaybackException);
        Z(false, false);
        this.L0 = this.L0.e(exoPlaybackException);
    }

    public final void k(boolean z) {
        t88 t88 = this.H0.j;
        re8 re8 = t88 == null ? this.L0.b : t88.f.a;
        boolean z2 = !this.L0.k.equals(re8);
        if (z2) {
            this.L0 = this.L0.a(re8);
        }
        txa txa = this.L0;
        txa.q = t88 == null ? txa.s : t88.d();
        txa txa2 = this.L0;
        long j = txa2.q;
        t88 t882 = this.H0.j;
        long j2 = 0;
        if (t882 != null) {
            j2 = Math.max(0, j - (this.Z0 - t882.o));
        }
        txa2.r = j2;
        if ((z2 || z) && t88 != null && t88.d) {
            c0(t88.n);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: w45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: w45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: sje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: w45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: sje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: sje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: pje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: pje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: w45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: w45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: w45} */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ee, code lost:
        if (r5.d(r6, r9) != 2) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f0, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fe, code lost:
        if (r5.g(r3.b) != false) goto L_0x01f0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02eb A[Catch:{ all -> 0x02f3, all -> 0x02f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0431  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.uje r38, boolean r39) {
        /*
            r37 = this;
            r11 = r37
            r12 = r38
            txa r0 = r11.L0
            w45 r8 = r11.Y0
            y88 r9 = r11.H0
            int r4 = r11.S0
            boolean r10 = r11.T0
            sje r13 = r11.z0
            pje r14 = r11.A0
            boolean r1 = r38.q()
            r7 = 1
            r5 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x003d
            v45 r0 = new v45
            re8 r19 = defpackage.txa.t
            r25 = 1
            r26 = 0
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r25, r26)
            r7 = r0
            r24 = r5
            r8 = -1
            r11 = 4
            goto L_0x023d
        L_0x003d:
            re8 r1 = r0.b
            java.lang.Object r15 = r1.a
            uje r2 = r0.a
            boolean r20 = r2.q()
            if (r20 != 0) goto L_0x0057
            java.lang.Object r3 = r1.a
            pje r2 = r2.h(r3, r14)
            boolean r2 = r2.Y
            if (r2 == 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r21 = 0
            goto L_0x0059
        L_0x0057:
            r21 = r7
        L_0x0059:
            re8 r2 = r0.b
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x0069
            if (r21 == 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            long r2 = r0.s
        L_0x0066:
            r22 = r2
            goto L_0x006c
        L_0x0069:
            long r2 = r0.c
            goto L_0x0066
        L_0x006c:
            if (r8 == 0) goto L_0x00c0
            r3 = 1
            r2 = r1
            r1 = r38
            r27 = r2
            r11 = 4
            r2 = r8
            r5 = r10
            r6 = r13
            r7 = r14
            android.util.Pair r1 = E(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x008a
            int r1 = r12.a(r10)
            r3 = r1
            r1 = r22
            r4 = 0
            r5 = 0
            r7 = 1
            goto L_0x00b2
        L_0x008a:
            long r2 = r8.c
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x009c
            java.lang.Object r1 = r1.first
            pje r1 = r12.h(r1, r14)
            int r3 = r1.c
            r1 = r22
            r7 = 0
            goto L_0x00a8
        L_0x009c:
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = -1
            r7 = 1
        L_0x00a8:
            int r4 = r0.e
            if (r4 != r11) goto L_0x00ae
            r4 = 1
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            r5 = r4
            r4 = r7
            r7 = 0
        L_0x00b2:
            r36 = r4
            r34 = r5
            r35 = r7
            r7 = r27
            r8 = -1
            r24 = 0
            r4 = r3
            goto L_0x0175
        L_0x00c0:
            r27 = r1
            r11 = 4
            uje r1 = r0.a
            boolean r1 = r1.q()
            if (r1 == 0) goto L_0x00df
            int r1 = r12.a(r10)
            r4 = r1
            r1 = r22
            r7 = r27
            r8 = -1
        L_0x00d5:
            r24 = 0
        L_0x00d7:
            r34 = 0
            r35 = 0
        L_0x00db:
            r36 = 0
            goto L_0x0175
        L_0x00df:
            int r1 = r12.b(r15)
            r8 = -1
            if (r1 != r8) goto L_0x010e
            uje r6 = r0.a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r5 = r15
            r7 = r38
            java.lang.Object r1 = F(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00fb
            int r1 = r12.a(r10)
            r7 = 1
            goto L_0x0102
        L_0x00fb:
            pje r1 = r12.h(r1, r14)
            int r1 = r1.c
            r7 = 0
        L_0x0102:
            r4 = r1
            r35 = r7
            r1 = r22
            r7 = r27
            r24 = 0
            r34 = 0
            goto L_0x00db
        L_0x010e:
            int r1 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x011e
            pje r1 = r12.h(r15, r14)
            int r1 = r1.c
            r4 = r1
            r1 = r22
            r7 = r27
            goto L_0x00d5
        L_0x011e:
            if (r21 == 0) goto L_0x016c
            uje r1 = r0.a
            r7 = r27
            java.lang.Object r2 = r7.a
            r1.h(r2, r14)
            uje r1 = r0.a
            int r2 = r14.c
            r5 = 0
            sje r1 = r1.n(r2, r13, r5)
            int r1 = r1.D0
            uje r2 = r0.a
            java.lang.Object r3 = r7.a
            int r2 = r2.b(r3)
            if (r1 != r2) goto L_0x0160
            long r1 = r14.X
            long r19 = r22 + r1
            pje r1 = r12.h(r15, r14)
            int r4 = r1.c
            r1 = r38
            r2 = r13
            r3 = r14
            r24 = r5
            r5 = r19
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x0164
        L_0x0160:
            r24 = r5
            r1 = r22
        L_0x0164:
            r4 = r8
            r34 = 0
            r35 = 0
            r36 = 1
            goto L_0x0175
        L_0x016c:
            r7 = r27
            r24 = 0
            r4 = r8
            r1 = r22
            goto L_0x00d7
        L_0x0175:
            if (r4 == r8) goto L_0x0191
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r38
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r32 = r16
            goto L_0x0193
        L_0x0191:
            r32 = r1
        L_0x0193:
            re8 r3 = r9.m(r12, r15, r1)
            int r4 = r3.e
            if (r4 == r8) goto L_0x01a4
            int r5 = r7.e
            if (r5 == r8) goto L_0x01a2
            if (r4 < r5) goto L_0x01a2
            goto L_0x01a4
        L_0x01a2:
            r4 = 0
            goto L_0x01a5
        L_0x01a4:
            r4 = 1
        L_0x01a5:
            java.lang.Object r5 = r7.a
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x01bd
            boolean r5 = r7.a()
            if (r5 != 0) goto L_0x01bd
            boolean r5 = r3.a()
            if (r5 != 0) goto L_0x01bd
            if (r4 == 0) goto L_0x01bd
            r4 = 1
            goto L_0x01be
        L_0x01bd:
            r4 = 0
        L_0x01be:
            pje r5 = r12.h(r15, r14)
            if (r21 != 0) goto L_0x0201
            int r6 = (r22 > r32 ? 1 : (r22 == r32 ? 0 : -1))
            if (r6 != 0) goto L_0x0201
            java.lang.Object r6 = r7.a
            java.lang.Object r9 = r3.a
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x01d3
            goto L_0x0201
        L_0x01d3:
            boolean r6 = r7.a()
            if (r6 == 0) goto L_0x01f2
            int r6 = r7.b
            boolean r9 = r5.g(r6)
            if (r9 == 0) goto L_0x01f2
            int r9 = r7.c
            int r10 = r5.d(r6, r9)
            if (r10 == r11) goto L_0x0201
            int r5 = r5.d(r6, r9)
            r6 = 2
            if (r5 == r6) goto L_0x0201
        L_0x01f0:
            r5 = 1
            goto L_0x0202
        L_0x01f2:
            boolean r6 = r3.a()
            if (r6 == 0) goto L_0x0201
            int r6 = r3.b
            boolean r5 = r5.g(r6)
            if (r5 == 0) goto L_0x0201
            goto L_0x01f0
        L_0x0201:
            r5 = 0
        L_0x0202:
            if (r4 != 0) goto L_0x0206
            if (r5 == 0) goto L_0x0207
        L_0x0206:
            r3 = r7
        L_0x0207:
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x0231
            boolean r1 = r3.equals(r7)
            if (r1 == 0) goto L_0x0218
            long r0 = r0.s
            r30 = r0
            goto L_0x0233
        L_0x0218:
            java.lang.Object r0 = r3.a
            r12.h(r0, r14)
            int r0 = r3.c
            int r1 = r3.b
            int r1 = r14.e(r1)
            if (r0 != r1) goto L_0x022c
            v8 r0 = r14.Z
            long r5 = r0.b
            goto L_0x022e
        L_0x022c:
            r5 = r24
        L_0x022e:
            r30 = r5
            goto L_0x0233
        L_0x0231:
            r30 = r1
        L_0x0233:
            v45 r0 = new v45
            r28 = r0
            r29 = r3
            r28.<init>(r29, r30, r32, r34, r35, r36)
            r7 = r0
        L_0x023d:
            java.lang.Object r0 = r7.f
            r9 = r0
            re8 r9 = (defpackage.re8) r9
            long r13 = r7.b
            boolean r6 = r7.c
            long r3 = r7.a
            r10 = r11
            r11 = r37
            txa r0 = r11.L0
            re8 r0 = r0.b
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0260
            txa r0 = r11.L0
            long r0 = r0.s
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r15 = 0
            goto L_0x0261
        L_0x0260:
            r15 = 1
        L_0x0261:
            r19 = 3
            boolean r0 = r7.d     // Catch:{ all -> 0x03b4 }
            if (r0 == 0) goto L_0x0282
            txa r0 = r11.L0     // Catch:{ all -> 0x027f }
            int r0 = r0.e     // Catch:{ all -> 0x027f }
            r2 = 1
            if (r0 == r2) goto L_0x0271
            r11.V(r10)     // Catch:{ all -> 0x0273 }
        L_0x0271:
            r1 = 0
            goto L_0x027b
        L_0x0273:
            r0 = move-exception
        L_0x0274:
            r8 = r2
            r24 = r13
        L_0x0277:
            r10 = 0
            r13 = r3
            goto L_0x03ba
        L_0x027b:
            r11.A(r1, r1, r1, r2)     // Catch:{ all -> 0x0273 }
            goto L_0x0283
        L_0x027f:
            r0 = move-exception
            r2 = 1
            goto L_0x0274
        L_0x0282:
            r2 = 1
        L_0x0283:
            if (r15 != 0) goto L_0x02f7
            y88 r1 = r11.H0     // Catch:{ all -> 0x0273 }
            long r5 = r11.Z0     // Catch:{ all -> 0x0273 }
            t88 r0 = r1.i     // Catch:{ all -> 0x0273 }
            if (r0 != 0) goto L_0x0294
            r21 = r3
            r26 = r24
        L_0x0291:
            r24 = r13
            goto L_0x02dc
        L_0x0294:
            r21 = r3
            long r2 = r0.o     // Catch:{ all -> 0x02f3 }
            boolean r4 = r0.d     // Catch:{ all -> 0x02f3 }
            if (r4 != 0) goto L_0x029f
            r26 = r2
            goto L_0x0291
        L_0x029f:
            r4 = 0
        L_0x02a0:
            pi0[] r10 = r11.a     // Catch:{ all -> 0x02f3 }
            int r8 = r10.length     // Catch:{ all -> 0x02f3 }
            if (r4 >= r8) goto L_0x02d8
            r8 = r10[r4]     // Catch:{ all -> 0x02f3 }
            boolean r8 = q(r8)     // Catch:{ all -> 0x02f3 }
            if (r8 == 0) goto L_0x02ca
            r8 = r10[r4]     // Catch:{ all -> 0x02f3 }
            xjc r10 = r8.Z     // Catch:{ all -> 0x02f3 }
            r24 = r13
            xjc[] r13 = r0.c     // Catch:{ all -> 0x02c8 }
            r13 = r13[r4]     // Catch:{ all -> 0x02c8 }
            if (r10 == r13) goto L_0x02ba
            goto L_0x02cc
        L_0x02ba:
            long r13 = r8.y0     // Catch:{ all -> 0x02c8 }
            r26 = -9223372036854775808
            int r8 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r8 != 0) goto L_0x02c3
            goto L_0x02dc
        L_0x02c3:
            long r2 = java.lang.Math.max(r13, r2)     // Catch:{ all -> 0x02c8 }
            goto L_0x02cc
        L_0x02c8:
            r0 = move-exception
            goto L_0x02d2
        L_0x02ca:
            r24 = r13
        L_0x02cc:
            int r4 = r4 + 1
            r13 = r24
            r8 = -1
            goto L_0x02a0
        L_0x02d2:
            r13 = r21
            r8 = 1
            r10 = 0
            goto L_0x03ba
        L_0x02d8:
            r24 = r13
            r26 = r2
        L_0x02dc:
            r8 = 1
            r2 = r38
            r13 = r21
            r3 = r5
            r10 = 0
            r5 = r26
            boolean r0 = r1.o(r2, r3, r5)     // Catch:{ all -> 0x02f0 }
            if (r0 != 0) goto L_0x0336
            r1 = 0
            r11.H(r1)     // Catch:{ all -> 0x02f0 }
            goto L_0x0336
        L_0x02f0:
            r0 = move-exception
            goto L_0x03ba
        L_0x02f3:
            r0 = move-exception
            r24 = r13
            goto L_0x02d2
        L_0x02f7:
            r8 = r2
            r24 = r13
            r10 = 0
            r13 = r3
            boolean r0 = r38.q()     // Catch:{ all -> 0x02f0 }
            if (r0 != 0) goto L_0x0336
            y88 r0 = r11.H0     // Catch:{ all -> 0x02f0 }
            t88 r0 = r0.h     // Catch:{ all -> 0x02f0 }
        L_0x0306:
            if (r0 == 0) goto L_0x0322
            w88 r1 = r0.f     // Catch:{ all -> 0x02f0 }
            re8 r1 = r1.a     // Catch:{ all -> 0x02f0 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x02f0 }
            if (r1 == 0) goto L_0x031f
            y88 r1 = r11.H0     // Catch:{ all -> 0x02f0 }
            w88 r2 = r0.f     // Catch:{ all -> 0x02f0 }
            w88 r1 = r1.g(r12, r2)     // Catch:{ all -> 0x02f0 }
            r0.f = r1     // Catch:{ all -> 0x02f0 }
            r0.h()     // Catch:{ all -> 0x02f0 }
        L_0x031f:
            t88 r0 = r0.l     // Catch:{ all -> 0x02f0 }
            goto L_0x0306
        L_0x0322:
            y88 r0 = r11.H0     // Catch:{ all -> 0x02f0 }
            t88 r1 = r0.h     // Catch:{ all -> 0x02f0 }
            t88 r0 = r0.i     // Catch:{ all -> 0x02f0 }
            if (r1 == r0) goto L_0x032c
            r5 = r8
            goto L_0x032d
        L_0x032c:
            r5 = 0
        L_0x032d:
            r1 = r37
            r2 = r9
            r3 = r13
            long r0 = r1.J(r2, r3, r5, r6)     // Catch:{ all -> 0x02f0 }
            r13 = r0
        L_0x0336:
            txa r0 = r11.L0
            uje r4 = r0.a
            re8 r5 = r0.b
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x0342
            r6 = r13
            goto L_0x0344
        L_0x0342:
            r6 = r16
        L_0x0344:
            r1 = r37
            r2 = r38
            r3 = r9
            r1.e0(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x0359
            txa r0 = r11.L0
            long r0 = r0.c
            int r0 = (r24 > r0 ? 1 : (r24 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0357
            goto L_0x0359
        L_0x0357:
            r13 = r10
            goto L_0x0395
        L_0x0359:
            txa r0 = r11.L0
            re8 r1 = r0.b
            java.lang.Object r1 = r1.a
            uje r0 = r0.a
            if (r15 == 0) goto L_0x0377
            if (r39 == 0) goto L_0x0377
            boolean r2 = r0.q()
            if (r2 != 0) goto L_0x0377
            pje r2 = r11.A0
            pje r0 = r0.h(r1, r2)
            boolean r0 = r0.Y
            if (r0 != 0) goto L_0x0377
            r0 = r8
            goto L_0x0378
        L_0x0377:
            r0 = 0
        L_0x0378:
            txa r2 = r11.L0
            long r7 = r2.d
            int r1 = r12.b(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0385
            r19 = 4
        L_0x0385:
            r1 = r37
            r2 = r9
            r3 = r13
            r5 = r24
            r9 = r0
            r13 = r10
            r10 = r19
            txa r0 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.L0 = r0
        L_0x0395:
            r37.B()
            txa r0 = r11.L0
            uje r0 = r0.a
            r11.D(r12, r0)
            txa r0 = r11.L0
            txa r0 = r0.g(r12)
            r11.L0 = r0
            boolean r0 = r38.q()
            if (r0 != 0) goto L_0x03af
            r11.Y0 = r13
        L_0x03af:
            r1 = 0
            r11.k(r1)
            return
        L_0x03b4:
            r0 = move-exception
            r24 = r13
            r8 = 1
            goto L_0x0277
        L_0x03ba:
            txa r1 = r11.L0
            uje r4 = r1.a
            re8 r5 = r1.b
            boolean r1 = r7.e
            if (r1 == 0) goto L_0x03c6
            r6 = r13
            goto L_0x03c8
        L_0x03c6:
            r6 = r16
        L_0x03c8:
            r1 = r37
            r2 = r38
            r3 = r9
            r1.e0(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x03dd
            txa r1 = r11.L0
            long r1 = r1.c
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x03db
            goto L_0x03dd
        L_0x03db:
            r13 = r10
            goto L_0x0419
        L_0x03dd:
            txa r1 = r11.L0
            re8 r2 = r1.b
            java.lang.Object r2 = r2.a
            uje r1 = r1.a
            if (r15 == 0) goto L_0x03fb
            if (r39 == 0) goto L_0x03fb
            boolean r3 = r1.q()
            if (r3 != 0) goto L_0x03fb
            pje r3 = r11.A0
            pje r1 = r1.h(r2, r3)
            boolean r1 = r1.Y
            if (r1 != 0) goto L_0x03fb
            r15 = r8
            goto L_0x03fc
        L_0x03fb:
            r15 = 0
        L_0x03fc:
            txa r1 = r11.L0
            long r7 = r1.d
            int r1 = r12.b(r2)
            r2 = -1
            if (r1 != r2) goto L_0x0409
            r19 = 4
        L_0x0409:
            r1 = r37
            r2 = r9
            r3 = r13
            r5 = r24
            r9 = r15
            r13 = r10
            r10 = r19
            txa r1 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.L0 = r1
        L_0x0419:
            r37.B()
            txa r1 = r11.L0
            uje r1 = r1.a
            r11.D(r12, r1)
            txa r1 = r11.L0
            txa r1 = r1.g(r12)
            r11.L0 = r1
            boolean r1 = r38.q()
            if (r1 != 0) goto L_0x0433
            r11.Y0 = r13
        L_0x0433:
            r1 = 0
            r11.k(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y45.l(uje, boolean):void");
    }

    public final void m(r88 r88) {
        y88 y88 = this.H0;
        t88 t88 = y88.j;
        if (t88 != null && t88.a == r88) {
            float f = this.D0.d().a;
            uje uje = this.L0.a;
            t88.d = true;
            t88.m = t88.a.p();
            ope g = t88.g(f, uje);
            w88 w88 = t88.f;
            long j = w88.b;
            long j2 = w88.e;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            long a2 = t88.a(g, j, false, new boolean[t88.i.length]);
            long j3 = t88.o;
            w88 w882 = t88.f;
            t88.o = (w882.b - a2) + j3;
            t88.f = w882.b(a2);
            c0(t88.n);
            if (t88 == y88.h) {
                C(t88.f.b);
                f(new boolean[this.a.length]);
                txa txa = this.L0;
                re8 re8 = txa.b;
                long j4 = t88.f.b;
                this.L0 = o(re8, j4, txa.c, j4, false, 5);
            }
            s();
        }
    }

    public final void n(vxa vxa, float f, boolean z, boolean z2) {
        int i;
        y45 y45 = this;
        vxa vxa2 = vxa;
        if (z) {
            if (z2) {
                y45.M0.a(1);
            }
            txa txa = y45.L0;
            txa txa2 = txa;
            uje uje = txa.a;
            txa txa3 = new txa(uje, txa.b, txa.c, txa.d, txa.e, txa.f, txa.g, txa.h, txa.i, txa.j, txa.k, txa2.l, txa2.m, vxa, txa2.q, txa2.r, txa2.s, txa2.o, txa2.p);
            y45 = this;
            y45.L0 = txa3;
        }
        vxa vxa3 = vxa;
        float f2 = vxa3.a;
        t88 t88 = y45.H0.h;
        while (true) {
            i = 0;
            if (t88 == null) {
                break;
            }
            f55[] f55Arr = (f55[]) t88.n.X;
            int length = f55Arr.length;
            while (i < length) {
                f55 f55 = f55Arr[i];
                if (f55 != null) {
                    f55.l(f2);
                }
                i++;
            }
            t88 = t88.l;
        }
        pi0[] pi0Arr = y45.a;
        int length2 = pi0Arr.length;
        while (i < length2) {
            pi0 pi0 = pi0Arr[i];
            if (pi0 != null) {
                pi0.z(f, vxa3.a);
            } else {
                float f3 = f;
            }
            i++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: e8c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: e8c} */
    /* JADX WARNING: type inference failed for: r11v5, types: [ms6, ts6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.txa o(defpackage.re8 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r4 = r20
            r2 = r25
            boolean r3 = r0.b1
            r6 = 0
            if (r3 != 0) goto L_0x0022
            txa r3 = r0.L0
            long r8 = r3.s
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            txa r3 = r0.L0
            re8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = r6
            goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            r0.b1 = r3
            r16.B()
            txa r3 = r0.L0
            voe r8 = r3.h
            ope r9 = r3.i
            java.util.List r10 = r3.j
            pf8 r11 = r0.I0
            boolean r11 = r11.g
            if (r11 == 0) goto L_0x0096
            y88 r3 = r0.H0
            t88 r3 = r3.h
            if (r3 != 0) goto L_0x003f
            voe r8 = defpackage.voe.o
            goto L_0x0041
        L_0x003f:
            voe r8 = r3.m
        L_0x0041:
            if (r3 != 0) goto L_0x0046
            ope r9 = r0.X
            goto L_0x0048
        L_0x0046:
            ope r9 = r3.n
        L_0x0048:
            java.lang.Object r10 = r9.X
            f55[] r10 = (defpackage.f55[]) r10
            ts6 r11 = new ts6
            r12 = 4
            r11.<init>(r12)
            int r12 = r10.length
            r13 = r6
            r14 = r13
        L_0x0055:
            if (r13 >= r12) goto L_0x0077
            r15 = r10[r13]
            if (r15 == 0) goto L_0x0074
            vu5 r15 = r15.d(r6)
            y29 r15 = r15.y0
            if (r15 != 0) goto L_0x006e
            y29 r15 = new y29
            w29[] r7 = new defpackage.w29[r6]
            r15.<init>((defpackage.w29[]) r7)
            r11.a(r15)
            goto L_0x0074
        L_0x006e:
            r11.a(r15)
            r7 = 1
            r14 = 1
            goto L_0x0075
        L_0x0074:
            r7 = 1
        L_0x0075:
            int r13 = r13 + r7
            goto L_0x0055
        L_0x0077:
            if (r14 == 0) goto L_0x007e
            e8c r7 = r11.j()
            goto L_0x0082
        L_0x007e:
            po5 r7 = defpackage.ws6.b
            e8c r7 = defpackage.e8c.X
        L_0x0082:
            if (r3 == 0) goto L_0x0092
            w88 r10 = r3.f
            long r11 = r10.c
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            w88 r10 = r10.a(r4)
            r3.f = r10
        L_0x0092:
            r12 = r7
            r10 = r8
            r11 = r9
            goto L_0x00ab
        L_0x0096:
            re8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00a8
            voe r3 = defpackage.voe.o
            ope r7 = r0.X
            e8c r8 = defpackage.e8c.X
            r10 = r3
            r11 = r7
            r12 = r8
            goto L_0x00ab
        L_0x00a8:
            r11 = r9
            r12 = r10
            r10 = r8
        L_0x00ab:
            if (r24 == 0) goto L_0x00c6
            t45 r3 = r0.M0
            boolean r7 = r3.d
            if (r7 == 0) goto L_0x00bf
            int r7 = r3.e
            r8 = 5
            if (r7 == r8) goto L_0x00bf
            if (r2 != r8) goto L_0x00bb
            r6 = 1
        L_0x00bb:
            swb.e(r6)
            goto L_0x00c6
        L_0x00bf:
            r6 = 1
            r3.a = r6
            r3.d = r6
            r3.e = r2
        L_0x00c6:
            txa r2 = r0.L0
            long r6 = r2.q
            y88 r3 = r0.H0
            t88 r3 = r3.j
            if (r3 != 0) goto L_0x00d3
            r8 = 0
            goto L_0x00e0
        L_0x00d3:
            long r13 = r0.Z0
            long r8 = r3.o
            long r13 = r13 - r8
            long r6 = r6 - r13
            r8 = 0
            long r6 = java.lang.Math.max(r8, r6)
            r8 = r6
        L_0x00e0:
            r0 = r2
            r1 = r17
            r2 = r18
            r4 = r20
            r6 = r22
            txa r0 = r0.b(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y45.o(re8, long, long, long, boolean, int):txa");
    }

    public final boolean p() {
        t88 t88 = this.H0.j;
        if (t88 == null) {
            return false;
        }
        return (!t88.d ? 0 : t88.a.f()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        t88 t88 = this.H0.h;
        long j = t88.f.e;
        return t88.d && (j == -9223372036854775807L || this.L0.s < j || !W());
    }

    public final void s() {
        boolean z;
        int i;
        boolean p = p();
        y88 y88 = this.H0;
        boolean z2 = true;
        if (!p) {
            z = false;
        } else {
            t88 t88 = y88.j;
            long j = 0;
            long f = !t88.d ? 0 : t88.a.f();
            t88 t882 = this.H0.j;
            if (t882 != null) {
                j = Math.max(0, f - (this.Z0 - t882.o));
            }
            if (t88 != y88.h) {
                long j2 = t88.f.b;
            }
            float f2 = this.D0.d().a;
            c94 c94 = this.Y;
            l34 l34 = c94.a;
            synchronized (l34) {
                i = l34.e * l34.c;
            }
            boolean z3 = i >= c94.j;
            int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            long j3 = c94.c;
            long j4 = c94.b;
            if (i2 > 0) {
                j4 = Math.min(mze.s(f2, j4), j3);
            }
            if (j < Math.max(j4, 500000)) {
                c94.k = c94.g || !z3;
            } else if (j >= j3 || z3) {
                c94.k = false;
            }
            z = c94.k;
        }
        this.R0 = z;
        if (z) {
            t88 t883 = y88.j;
            long j5 = this.Z0;
            if (t883.l != null) {
                z2 = false;
            }
            swb.h(z2);
            t883.a.F(j5 - t883.o);
        }
        b0();
    }

    public final void t() {
        t45 t45 = this.M0;
        txa txa = this.L0;
        boolean z = t45.a | (t45.b != txa);
        t45.a = z;
        t45.b = txa;
        if (z) {
            m45 m45 = this.G0.a;
            m45.y0.a.post(new ii4(m45, 19, t45));
            this.M0 = new t45(this.L0);
        }
    }

    public final void u() {
        l(this.I0.e(), true);
    }

    public final void v() {
        this.M0.a(1);
        throw null;
    }

    public final void w() {
        this.M0.a(1);
        int i = 0;
        A(false, false, false, true);
        this.Y.b(false);
        V(this.L0.a.q() ? 4 : 2);
        f54 f54 = (f54) this.Z;
        f54.getClass();
        pf8 pf8 = this.I0;
        swb.h(!pf8.g);
        pf8.m = f54;
        while (true) {
            ArrayList arrayList = (ArrayList) pf8.b;
            if (i < arrayList.size()) {
                mf8 mf8 = (mf8) arrayList.get(i);
                pf8.k(mf8);
                ((HashSet) pf8.f).add(mf8);
                i++;
            } else {
                pf8.g = true;
                this.w0.c(2);
                return;
            }
        }
    }

    public final void x() {
        A(true, false, true, false);
        this.Y.b(true);
        V(1);
        this.x0.quit();
        synchronized (this) {
            this.N0 = true;
            notifyAll();
        }
    }

    public final void y(int i, int i2, xed xed) {
        boolean z = true;
        this.M0.a(1);
        pf8 pf8 = this.I0;
        pf8.getClass();
        if (i < 0 || i > i2 || i2 > ((ArrayList) pf8.b).size()) {
            z = false;
        }
        swb.e(z);
        pf8.l = xed;
        pf8.p(i, i2);
        l(pf8.e(), false);
    }

    public final void z() {
        float f = this.D0.d().a;
        y88 y88 = this.H0;
        t88 t88 = y88.h;
        t88 t882 = y88.i;
        t88 t883 = t88;
        boolean z = true;
        while (t883 != null && t883.d) {
            ope g = t883.g(f, this.L0.a);
            ope ope = t883.n;
            if (ope != null) {
                int length = ((f55[]) ope.X).length;
                f55[] f55Arr = (f55[]) g.X;
                if (length == f55Arr.length) {
                    int i = 0;
                    while (i < f55Arr.length) {
                        if (g.F(ope, i)) {
                            i++;
                        }
                    }
                    if (t883 == t882) {
                        z = false;
                    }
                    t883 = t883.l;
                }
            }
            if (z) {
                y88 y882 = this.H0;
                t88 t884 = y882.h;
                boolean k = y882.k(t884);
                boolean[] zArr = new boolean[this.a.length];
                long a2 = t884.a(g, this.L0.s, k, zArr);
                txa txa = this.L0;
                boolean z2 = (txa.e == 4 || a2 == txa.s) ? false : true;
                txa txa2 = this.L0;
                t88 t885 = t884;
                boolean[] zArr2 = zArr;
                this.L0 = o(txa2.b, a2, txa2.c, txa2.d, z2, 5);
                if (z2) {
                    C(a2);
                }
                boolean[] zArr3 = new boolean[this.a.length];
                int i2 = 0;
                while (true) {
                    pi0[] pi0Arr = this.a;
                    if (i2 >= pi0Arr.length) {
                        break;
                    }
                    pi0 pi0 = pi0Arr[i2];
                    boolean q = q(pi0);
                    zArr3[i2] = q;
                    xjc xjc = t885.c[i2];
                    if (q) {
                        if (xjc != pi0.Z) {
                            b(pi0);
                        } else if (zArr2[i2]) {
                            long j = this.Z0;
                            pi0.z0 = false;
                            pi0.y0 = j;
                            pi0.q(j, false);
                            i2++;
                        }
                    }
                    i2++;
                }
                f(zArr3);
            } else {
                this.H0.k(t883);
                if (t883.d) {
                    t883.a(g, Math.max(t883.f.b, this.Z0 - t883.o), false, new boolean[t883.i.length]);
                }
            }
            k(true);
            if (this.L0.e != 4) {
                s();
                d0();
                this.w0.c(2);
                return;
            }
            return;
        }
    }
}
