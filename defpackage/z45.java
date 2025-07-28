package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: z45  reason: default package */
public final class z45 implements Handler.Callback, q88, npe, of8, e94, hza {
    public static final long j1 = oze.h0(WorkRequest.MIN_BACKOFF_MILLIS);
    public final qje A0;
    public final long B0;
    public final boolean C0;
    public final dk D0;
    public final ArrayList E0;
    public final z7e F0;
    public final b45 G0;
    public final z88 H0;
    public final pf8 I0;
    public final a94 J0;
    public final long K0;
    public final cza L0;
    public xtc M0;
    public uxa N0;
    public u45 O0;
    public boolean P0;
    public boolean Q0 = false;
    public boolean R0;
    public boolean S0;
    public long T0;
    public boolean U0;
    public int V0;
    public boolean W0;
    public final ope X;
    public boolean X0;
    public final pi7 Y;
    public boolean Y0;
    public final cf0 Z;
    public boolean Z0;
    public final qi0[] a;
    public int a1;
    public final Set b;
    public x45 b1;
    public final qi0[] c;
    public long c1;
    public long d1;
    public int e1;
    public boolean f1;
    public ExoPlaybackException g1;
    public long h1;
    public r35 i1;
    public final eu7 o;
    public final h8e w0;
    public final HandlerThread x0;
    public final Looper y0;
    public final tje z0;

    public z45(qi0[] qi0Arr, eu7 eu7, ope ope, pi7 pi7, cf0 cf0, int i, boolean z, g44 g44, xtc xtc, a94 a94, long j, Looper looper, z7e z7e, b45 b45, cza cza) {
        qi0[] qi0Arr2 = qi0Arr;
        eu7 eu72 = eu7;
        cf0 cf02 = cf0;
        g44 g442 = g44;
        z7e z7e2 = z7e;
        cza cza2 = cza;
        r35 r35 = r35.a;
        this.G0 = b45;
        this.a = qi0Arr2;
        this.o = eu72;
        this.X = ope;
        this.Y = pi7;
        this.Z = cf02;
        this.V0 = i;
        this.W0 = z;
        this.M0 = xtc;
        this.J0 = a94;
        this.K0 = j;
        this.F0 = z7e2;
        this.L0 = cza2;
        this.i1 = r35;
        this.h1 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.B0 = pi7.f();
        this.C0 = pi7.a();
        oje oje = vje.a;
        uxa i2 = uxa.i(ope);
        this.N0 = i2;
        this.O0 = new u45(i2);
        this.c = new qi0[qi0Arr2.length];
        bc4 bc4 = (bc4) eu72;
        bc4.getClass();
        for (int i3 = 0; i3 < qi0Arr2.length; i3++) {
            qi0 qi0 = qi0Arr2[i3];
            qi0.X = i3;
            qi0.Y = cza2;
            qi0.Z = z7e2;
            qi0[] qi0Arr3 = this.c;
            qi0.getClass();
            qi0Arr3[i3] = qi0;
            qi0 qi02 = this.c[i3];
            synchronized (qi02.a) {
                qi02.F0 = bc4;
            }
        }
        this.D0 = new dk(this, z7e2);
        this.E0 = new ArrayList();
        this.b = gp0.B();
        this.z0 = new tje();
        this.A0 = new qje();
        eu72.a = this;
        eu72.b = cf02;
        this.f1 = true;
        h8e a2 = z7e2.a(looper, (Handler.Callback) null);
        this.H0 = new z88(g442, a2, new r34(22, (Object) this));
        this.I0 = new pf8((of8) this, g442, a2, cza2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.x0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.y0 = looper2;
        this.w0 = z7e2.a(looper2, this);
    }

    public static Pair F(vje vje, x45 x45, boolean z, int i, boolean z2, tje tje, qje qje) {
        int G;
        vje vje2 = vje;
        x45 x452 = x45;
        qje qje2 = qje;
        vje vje3 = x452.a;
        if (vje.q()) {
            return null;
        }
        vje vje4 = vje3.q() ? vje2 : vje3;
        try {
            Pair j = vje4.j(tje, qje, x452.b, x452.c);
            if (vje.equals(vje4)) {
                return j;
            }
            if (vje.b(j.first) == -1) {
                tje tje2 = tje;
                if (z && (G = G(tje, qje, i, z2, j.first, vje4, vje)) != -1) {
                    return vje.j(tje, qje, G, -9223372036854775807L);
                }
                return null;
            } else if (!vje4.h(j.first, qje2).f || vje4.n(qje2.c, tje, 0).n != vje4.b(j.first)) {
                return j;
            } else {
                return vje.j(tje, qje, vje.h(j.first, qje2).c, x452.c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static int G(tje tje, qje qje, int i, boolean z, Object obj, vje vje, vje vje2) {
        tje tje2 = tje;
        qje qje2 = qje;
        Object obj2 = obj;
        vje vje3 = vje;
        vje vje4 = vje2;
        Object obj3 = vje3.n(vje3.h(obj2, qje2).c, tje, 0).a;
        for (int i2 = 0; i2 < vje2.p(); i2++) {
            if (vje4.n(i2, tje, 0).a.equals(obj3)) {
                return i2;
            }
        }
        int b2 = vje3.b(obj2);
        int i3 = vje.i();
        int i4 = b2;
        int i5 = -1;
        for (int i6 = 0; i6 < i3 && i5 == -1; i6++) {
            i4 = vje.d(i4, qje, tje, i, z);
            if (i4 == -1) {
                break;
            }
            i5 = vje4.b(vje3.m(i4));
        }
        if (i5 == -1) {
            return -1;
        }
        return vje4.g(i5, qje2, false).c;
    }

    public static void M(qi0 qi0, long j) {
        qi0.C0 = true;
        if (qi0 instanceof age) {
            age age = (age) qi0;
            oyb.k(age.C0);
            age.Z0 = j;
        }
    }

    public static boolean q(qi0 qi0) {
        return qi0.w0 != 0;
    }

    public final void A() {
        float f = this.D0.d().a;
        z88 z88 = this.H0;
        u88 u88 = z88.i;
        u88 u882 = z88.j;
        ope ope = null;
        u88 u883 = u88;
        boolean z = true;
        while (u883 != null && u883.d) {
            ope h = u883.h(f, this.N0.a);
            ope ope2 = u883 == this.H0.i ? h : ope;
            ope ope3 = u883.n;
            if (ope3 != null) {
                int length = ((g55[]) ope3.X).length;
                g55[] g55Arr = (g55[]) h.X;
                if (length == g55Arr.length) {
                    int i = 0;
                    while (i < g55Arr.length) {
                        if (h.G(ope3, i)) {
                            i++;
                        }
                    }
                    if (u883 == u882) {
                        z = false;
                    }
                    u883 = u883.l;
                    ope = ope2;
                }
            }
            if (z) {
                z88 z882 = this.H0;
                u88 u884 = z882.i;
                boolean l = z882.l(u884);
                boolean[] zArr = new boolean[this.a.length];
                ope2.getClass();
                long a2 = u884.a(ope2, this.N0.s, l, zArr);
                uxa uxa = this.N0;
                boolean z2 = (uxa.e == 4 || a2 == uxa.s) ? false : true;
                uxa uxa2 = this.N0;
                u88 u885 = u884;
                boolean[] zArr2 = zArr;
                this.N0 = o(uxa2.b, a2, uxa2.c, uxa2.d, z2, 5);
                if (z2) {
                    D(a2);
                }
                boolean[] zArr3 = new boolean[this.a.length];
                int i2 = 0;
                while (true) {
                    qi0[] qi0Arr = this.a;
                    if (i2 >= qi0Arr.length) {
                        break;
                    }
                    qi0 qi0 = qi0Arr[i2];
                    boolean q = q(qi0);
                    zArr3[i2] = q;
                    yjc yjc = u885.c[i2];
                    if (q) {
                        if (yjc != qi0.x0) {
                            b(qi0);
                        } else if (zArr2[i2]) {
                            long j = this.c1;
                            qi0.C0 = false;
                            qi0.A0 = j;
                            qi0.B0 = j;
                            qi0.s(j, false);
                            i2++;
                        }
                    }
                    i2++;
                }
                e(zArr3, this.c1);
            } else {
                this.H0.l(u883);
                if (u883.d) {
                    u883.a(h, Math.max(u883.f.b, this.c1 - u883.o), false, new boolean[u883.i.length]);
                }
            }
            k(true);
            if (this.N0.e != 4) {
                s();
                e0();
                this.w0.f(2);
                return;
            }
            return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            r33 = this;
            r1 = r33
            h8e r0 = r1.w0
            r2 = 2
            r0.e(r2)
            r2 = 0
            r1.g1 = r2
            r3 = 0
            r4 = 1
            r1.g0(r3, r4)
            dk r0 = r1.D0
            r0.c = r3
            java.lang.Object r0 = r0.o
            zb8 r0 = (defpackage.zb8) r0
            boolean r5 = r0.b
            if (r5 == 0) goto L_0x0025
            long r5 = r0.e()
            r0.a(r5)
            r0.b = r3
        L_0x0025:
            r5 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.c1 = r5
            qi0[] r5 = r1.a
            int r6 = r5.length
            r7 = r3
        L_0x0030:
            if (r7 >= r6) goto L_0x0040
            r0 = r5[r7]
            r1.b(r0)     // Catch:{ ExoPlaybackException | RuntimeException -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            r0 = move-exception
            java.lang.String r8 = "Disable failed."
            defpackage.ez3.B(r8, r0)
        L_0x003e:
            int r7 = r7 + r4
            goto L_0x0030
        L_0x0040:
            if (r34 == 0) goto L_0x005f
            qi0[] r5 = r1.a
            int r6 = r5.length
            r7 = r3
        L_0x0046:
            if (r7 >= r6) goto L_0x005f
            r0 = r5[r7]
            java.util.Set r8 = r1.b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x005d
            r0.B()     // Catch:{ RuntimeException -> 0x0056 }
            goto L_0x005d
        L_0x0056:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            defpackage.ez3.B(r0, r8)
        L_0x005d:
            int r7 = r7 + r4
            goto L_0x0046
        L_0x005f:
            r1.a1 = r3
            uxa r0 = r1.N0
            se8 r5 = r0.b
            long r6 = r0.s
            uxa r0 = r1.N0
            se8 r0 = r0.b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x008f
            uxa r0 = r1.N0
            qje r8 = r1.A0
            se8 r9 = r0.b
            vje r0 = r0.a
            boolean r10 = r0.q()
            if (r10 != 0) goto L_0x008f
            java.lang.Object r9 = r9.a
            qje r0 = r0.h(r9, r8)
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            uxa r0 = r1.N0
            long r8 = r0.s
            goto L_0x0093
        L_0x008f:
            uxa r0 = r1.N0
            long r8 = r0.c
        L_0x0093:
            if (r35 == 0) goto L_0x00bf
            r1.b1 = r2
            uxa r0 = r1.N0
            vje r0 = r0.a
            android.util.Pair r0 = r1.g(r0)
            java.lang.Object r5 = r0.first
            se8 r5 = (defpackage.se8) r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            uxa r0 = r1.N0
            se8 r0 = r0.b
            boolean r0 = r5.equals(r0)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00bf
            r0 = r4
        L_0x00bb:
            r28 = r6
            r9 = r8
            goto L_0x00c1
        L_0x00bf:
            r0 = r3
            goto L_0x00bb
        L_0x00c1:
            z88 r6 = r1.H0
            r6.b()
            r1.U0 = r3
            uxa r6 = r1.N0
            vje r6 = r6.a
            if (r36 == 0) goto L_0x0122
            boolean r7 = r6 instanceof defpackage.uza
            if (r7 == 0) goto L_0x0122
            uza r6 = (defpackage.uza) r6
            pf8 r7 = r1.I0
            java.lang.Object r7 = r7.l
            yed r7 = (defpackage.yed) r7
            vje[] r8 = r6.k
            int r11 = r8.length
            vje[] r11 = new defpackage.vje[r11]
            r12 = r3
        L_0x00e0:
            int r13 = r8.length
            if (r12 >= r13) goto L_0x00ee
            sza r13 = new sza
            r14 = r8[r12]
            r13.<init>(r14)
            r11[r12] = r13
            int r12 = r12 + r4
            goto L_0x00e0
        L_0x00ee:
            uza r8 = new uza
            java.lang.Object[] r6 = r6.l
            r8.<init>(r11, r6, r7)
            int r6 = r5.b
            r7 = -1
            if (r6 == r7) goto L_0x011f
            java.lang.Object r6 = r5.a
            qje r7 = r1.A0
            r8.h(r6, r7)
            qje r6 = r1.A0
            int r6 = r6.c
            tje r7 = r1.z0
            r11 = 0
            r8.n(r6, r7, r11)
            boolean r6 = r7.a()
            if (r6 == 0) goto L_0x011f
            se8 r6 = new se8
            java.lang.Object r7 = r5.a
            long r11 = r5.d
            r6.<init>(r11, r7)
            r19 = r6
        L_0x011d:
            r7 = r8
            goto L_0x0125
        L_0x011f:
            r19 = r5
            goto L_0x011d
        L_0x0122:
            r19 = r5
            r7 = r6
        L_0x0125:
            uxa r5 = new uxa
            uxa r6 = r1.N0
            int r13 = r6.e
            if (r37 == 0) goto L_0x012f
        L_0x012d:
            r14 = r2
            goto L_0x0132
        L_0x012f:
            androidx.media3.exoplayer.ExoPlaybackException r2 = r6.f
            goto L_0x012d
        L_0x0132:
            if (r0 == 0) goto L_0x0139
            woe r2 = defpackage.woe.d
        L_0x0136:
            r16 = r2
            goto L_0x013c
        L_0x0139:
            woe r2 = r6.h
            goto L_0x0136
        L_0x013c:
            if (r0 == 0) goto L_0x0143
            ope r2 = r1.X
        L_0x0140:
            r17 = r2
            goto L_0x0146
        L_0x0143:
            ope r2 = r6.i
            goto L_0x0140
        L_0x0146:
            if (r0 == 0) goto L_0x014f
            po5 r0 = defpackage.ws6.b
            e8c r0 = defpackage.e8c.X
        L_0x014c:
            r18 = r0
            goto L_0x0152
        L_0x014f:
            java.util.List r0 = r6.j
            goto L_0x014c
        L_0x0152:
            boolean r0 = r6.l
            r20 = r0
            int r0 = r6.m
            r21 = r0
            int r0 = r6.n
            r22 = r0
            wxa r0 = r6.o
            r23 = r0
            r15 = 0
            r26 = 0
            r30 = 0
            r32 = 0
            r6 = r5
            r8 = r19
            r11 = r28
            r24 = r28
            r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32)
            r1.N0 = r5
            if (r36 == 0) goto L_0x01e1
            z88 r0 = r1.H0
            java.util.List r2 = r0.o
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x019e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r3
        L_0x0187:
            java.util.List r6 = r0.o
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x019c
            java.util.List r6 = r0.o
            java.lang.Object r6 = r6.get(r5)
            u88 r6 = (defpackage.u88) r6
            r6.g()
            int r5 = r5 + r4
            goto L_0x0187
        L_0x019c:
            r0.o = r2
        L_0x019e:
            pf8 r1 = r1.I0
            java.lang.Object r0 = r1.e
            r2 = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r0 = r2.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x01ad:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = r4.next()
            r5 = r0
            lf8 r5 = (defpackage.lf8) r5
            zh0 r0 = r5.a     // Catch:{ RuntimeException -> 0x01c2 }
            ue8 r6 = r5.b     // Catch:{ RuntimeException -> 0x01c2 }
            r0.p(r6)     // Catch:{ RuntimeException -> 0x01c2 }
            goto L_0x01c8
        L_0x01c2:
            r0 = move-exception
            java.lang.String r6 = "Failed to release child source."
            defpackage.ez3.B(r6, r0)
        L_0x01c8:
            zh0 r0 = r5.a
            otf r6 = r5.c
            r0.s(r6)
            zh0 r0 = r5.a
            r0.r(r6)
            goto L_0x01ad
        L_0x01d5:
            r2.clear()
            java.lang.Object r0 = r1.f
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.clear()
            r1.g = r3
        L_0x01e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        u88 u88 = this.H0.i;
        this.R0 = u88 != null && u88.f.h && this.Q0;
    }

    public final void D(long j) {
        z88 z88 = this.H0;
        u88 u88 = z88.i;
        long j2 = j + (u88 == null ? 1000000000000L : u88.o);
        this.c1 = j2;
        ((zb8) this.D0.o).a(j2);
        for (qi0 qi0 : this.a) {
            if (q(qi0)) {
                long j3 = this.c1;
                qi0.C0 = false;
                qi0.A0 = j3;
                qi0.B0 = j3;
                qi0.s(j3, false);
            }
        }
        for (u88 u882 = z88.i; u882 != null; u882 = u882.l) {
            for (g55 g55 : (g55[]) u882.n.X) {
                if (g55 != null) {
                    g55.n();
                }
            }
        }
    }

    public final void E(vje vje, vje vje2) {
        if (!vje.q() || !vje2.q()) {
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

    public final void H(long j) {
        this.w0.a.sendEmptyMessageAtTime(2, j + ((this.N0.e != 3 || X()) ? j1 : 1000));
    }

    public final void I(boolean z) {
        se8 se8 = this.H0.i.f.a;
        long K = K(se8, this.N0.s, true, false);
        if (K != this.N0.s) {
            uxa uxa = this.N0;
            this.N0 = o(se8, K, uxa.c, uxa.d, z, 5);
        }
    }

    public final void J(x45 x45) {
        long j;
        long j2;
        boolean z;
        se8 se8;
        long j3;
        long j4;
        long j5;
        uxa uxa;
        int i;
        x45 x452 = x45;
        boolean z2 = true;
        this.O0.d(1);
        Pair F = F(this.N0.a, x45, true, this.V0, this.W0, this.z0, this.A0);
        if (F == null) {
            Pair g = g(this.N0.a);
            se8 = (se8) g.first;
            long longValue = ((Long) g.second).longValue();
            z = !this.N0.a.q();
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = F.first;
            long longValue2 = ((Long) F.second).longValue();
            long j6 = x452.c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            se8 n = this.H0.n(this.N0.a, obj, longValue2);
            if (n.b()) {
                this.N0.a.h(n.a, this.A0);
                j = this.A0.f(n.b) == n.c ? this.A0.g.c : 0;
                j2 = j6;
                se8 = n;
                z = true;
            } else {
                j = longValue2;
                j2 = j6;
                z = x452.c == -9223372036854775807L;
                se8 = n;
            }
        }
        try {
            if (this.N0.a.q()) {
                this.b1 = x452;
            } else if (F == null) {
                if (this.N0.e != 1) {
                    W(4);
                }
                B(false, true, false, true);
            } else {
                if (se8.equals(this.N0.b)) {
                    u88 u88 = this.H0.i;
                    long h = (u88 == null || !u88.d || j == 0) ? j : u88.a.h(j, this.M0);
                    if (oze.h0(h) == oze.h0(this.N0.s) && ((i = uxa.e) == 2 || i == 3)) {
                        long j7 = (uxa = this.N0).s;
                        this.N0 = o(se8, j7, j2, j7, z, 2);
                        return;
                    }
                    j5 = h;
                } else {
                    j5 = j;
                }
                boolean z3 = this.N0.e == 4;
                z88 z88 = this.H0;
                long K = K(se8, j5, z88.i != z88.j, z3);
                if (j == K) {
                    z2 = false;
                }
                z |= z2;
                try {
                    uxa uxa2 = this.N0;
                    vje vje = uxa2.a;
                    f0(vje, se8, vje, uxa2.b, j2, true);
                    j4 = K;
                    this.N0 = o(se8, j4, j2, j4, z, 2);
                } catch (Throwable th) {
                    th = th;
                    j3 = K;
                    this.N0 = o(se8, j3, j2, j3, z, 2);
                    throw th;
                }
            }
            j4 = j;
            this.N0 = o(se8, j4, j2, j4, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
            this.N0 = o(se8, j3, j2, j3, z, 2);
            throw th;
        }
    }

    public final long K(se8 se8, long j, boolean z, boolean z2) {
        b0();
        g0(false, true);
        if (z2 || this.N0.e == 3) {
            W(2);
        }
        z88 z88 = this.H0;
        u88 u88 = z88.i;
        u88 u882 = u88;
        while (u882 != null && !se8.equals(u882.f.a)) {
            u882 = u882.l;
        }
        if (z || u88 != u882 || (u882 != null && u882.o + j < 0)) {
            qi0[] qi0Arr = this.a;
            for (qi0 b2 : qi0Arr) {
                b(b2);
            }
            if (u882 != null) {
                while (z88.i != u882) {
                    z88.a();
                }
                z88.l(u882);
                u882.o = 1000000000000L;
                e(new boolean[qi0Arr.length], z88.j.e());
            }
        }
        if (u882 != null) {
            z88.l(u882);
            if (!u882.d) {
                u882.f = u882.f.b(j);
            } else if (u882.e) {
                s88 s88 = u882.a;
                j = s88.k(j);
                s88.s(j - this.B0, this.C0);
            }
            D(j);
            s();
        } else {
            z88.b();
            D(j);
        }
        k(false);
        this.w0.f(2);
        return j;
    }

    public final void L(lza lza) {
        Looper looper = lza.f;
        if (!looper.getThread().isAlive()) {
            ez3.j0("Trying to send message on a dead thread.");
            lza.b(false);
            return;
        }
        this.F0.a(looper, (Handler.Callback) null).d(new ii4(this, 21, lza));
    }

    public final void N(AtomicBoolean atomicBoolean, boolean z) {
        if (this.X0 != z) {
            this.X0 = z;
            if (!z) {
                for (qi0 qi0 : this.a) {
                    if (!q(qi0) && this.b.remove(qi0)) {
                        qi0.B();
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

    public final void O(r45 r45) {
        this.O0.d(1);
        int i = r45.c;
        yed yed = r45.b;
        List list = r45.a;
        if (i != -1) {
            this.b1 = new x45(new uza(list, yed), r45.c, r45.d);
        }
        pf8 pf8 = this.I0;
        ArrayList arrayList = (ArrayList) pf8.b;
        pf8.p(0, arrayList.size());
        l(pf8.b(arrayList.size(), list, yed), false);
    }

    public final void P(boolean z) {
        this.Q0 = z;
        C();
        if (this.R0) {
            z88 z88 = this.H0;
            if (z88.j != z88.i) {
                I(true);
                k(false);
            }
        }
    }

    public final void Q(int i, int i2, boolean z, boolean z2) {
        this.O0.d(z2 ? 1 : 0);
        this.N0 = this.N0.d(i2, i, z);
        g0(false, false);
        for (u88 u88 = this.H0.i; u88 != null; u88 = u88.l) {
            for (g55 g55 : (g55[]) u88.n.X) {
                if (g55 != null) {
                    g55.c(z);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i3 = this.N0.e;
        h8e h8e = this.w0;
        if (i3 == 3) {
            dk dkVar = this.D0;
            dkVar.c = true;
            ((zb8) dkVar.o).b();
            Z();
            h8e.f(2);
        } else if (i3 == 2) {
            h8e.f(2);
        }
    }

    public final void R(wxa wxa) {
        this.w0.e(16);
        dk dkVar = this.D0;
        dkVar.f(wxa);
        wxa d = dkVar.d();
        n(d, d.a, true, true);
    }

    public final void S(r35 r35) {
        this.i1 = r35;
        vje vje = this.N0.a;
        z88 z88 = this.H0;
        z88.getClass();
        r35.getClass();
        if (!z88.o.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < z88.o.size(); i++) {
                ((u88) z88.o.get(i)).g();
            }
            z88.o = arrayList;
        }
    }

    public final void T(int i) {
        this.V0 = i;
        vje vje = this.N0.a;
        z88 z88 = this.H0;
        z88.g = i;
        if (!z88.p(vje)) {
            I(true);
        }
        k(false);
    }

    public final void U(boolean z) {
        this.W0 = z;
        vje vje = this.N0.a;
        z88 z88 = this.H0;
        z88.h = z;
        if (!z88.p(vje)) {
            I(true);
        }
        k(false);
    }

    public final void V(yed yed) {
        this.O0.d(1);
        pf8 pf8 = this.I0;
        int size = ((ArrayList) pf8.b).size();
        if (yed.b.length != size) {
            yed = new yed(new Random(yed.a.nextLong())).a(0, size);
        }
        pf8.l = yed;
        l(pf8.f(), false);
    }

    public final void W(int i) {
        uxa uxa = this.N0;
        if (uxa.e != i) {
            if (i != 2) {
                this.h1 = -9223372036854775807L;
            }
            this.N0 = uxa.g(i);
        }
    }

    public final boolean X() {
        uxa uxa = this.N0;
        return uxa.l && uxa.n == 0;
    }

    public final boolean Y(vje vje, se8 se8) {
        if (se8.b() || vje.q()) {
            return false;
        }
        int i = vje.h(se8.a, this.A0).c;
        tje tje = this.z0;
        vje.o(i, tje);
        return tje.a() && tje.i && tje.f != -9223372036854775807L;
    }

    public final void Z() {
        u88 u88 = this.H0.i;
        if (u88 != null) {
            ope ope = u88.n;
            int i = 0;
            while (true) {
                qi0[] qi0Arr = this.a;
                if (i < qi0Arr.length) {
                    if (ope.I(i)) {
                        qi0 qi0 = qi0Arr[i];
                        int i2 = qi0.w0;
                        boolean z = true;
                        if (i2 == 1) {
                            if (i2 != 1) {
                                z = false;
                            }
                            oyb.k(z);
                            qi0.w0 = 2;
                            qi0.v();
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(r45 r45, int i) {
        this.O0.d(1);
        pf8 pf8 = this.I0;
        if (i == -1) {
            i = ((ArrayList) pf8.b).size();
        }
        l(pf8.b(i, r45.a, r45.b), false);
    }

    public final void a0(boolean z, boolean z2) {
        B(z || !this.X0, false, true, false);
        this.O0.d(z2 ? 1 : 0);
        this.Y.d(this.L0);
        W(1);
    }

    public final void b(qi0 qi0) {
        if (q(qi0)) {
            dk dkVar = this.D0;
            if (qi0 == ((qi0) dkVar.Y)) {
                dkVar.Z = null;
                dkVar.Y = null;
                dkVar.b = true;
            }
            int i = qi0.w0;
            if (i == 2) {
                oyb.k(i == 2);
                qi0.w0 = 1;
                qi0.w();
            }
            oyb.k(qi0.w0 == 1);
            qi0.c.t();
            qi0.w0 = 0;
            qi0.x0 = null;
            qi0.y0 = null;
            qi0.C0 = false;
            qi0.q();
            this.a1--;
        }
    }

    public final void b0() {
        int i;
        dk dkVar = this.D0;
        dkVar.c = false;
        zb8 zb8 = (zb8) dkVar.o;
        if (zb8.b) {
            zb8.a(zb8.e());
            zb8.b = false;
        }
        for (qi0 qi0 : this.a) {
            if (q(qi0) && (i = qi0.w0) == 2) {
                oyb.k(i == 2);
                qi0.w0 = 1;
                qi0.w();
            }
        }
    }

    public final void c(s88 s88) {
        this.w0.a(8, s88).b();
    }

    public final void c0() {
        u88 u88 = this.H0.k;
        boolean z = this.U0 || (u88 != null && u88.a.b());
        uxa uxa = this.N0;
        if (z != uxa.g) {
            uxa uxa2 = r2;
            uxa uxa3 = new uxa(uxa.a, uxa.b, uxa.c, uxa.d, uxa.e, uxa.f, z, uxa.h, uxa.i, uxa.j, uxa.k, uxa.l, uxa.m, uxa.n, uxa.o, uxa.q, uxa.r, uxa.s, uxa.t, uxa.p);
            this.N0 = uxa2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x069d  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x06d2  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06e7  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0415 A[EDGE_INSN: B:462:0x0415->B:229:0x0415 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r50 = this;
            r10 = r50
            z7e r0 = r10.F0
            r0.getClass()
            long r11 = android.os.SystemClock.uptimeMillis()
            h8e r0 = r10.w0
            r13 = 2
            r0.e(r13)
            uxa r0 = r10.N0
            vje r0 = r0.a
            boolean r0 = r0.q()
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            if (r0 != 0) goto L_0x0027
            pf8 r0 = r10.I0
            boolean r0 = r0.g
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            r14 = r9
            r19 = r11
            r1 = 3
            r11 = 1
            r13 = 0
            goto L_0x041e
        L_0x002f:
            z88 r0 = r10.H0
            long r1 = r10.c1
            u88 r0 = r0.k
            if (r0 == 0) goto L_0x004d
            u88 r3 = r0.l
            if (r3 != 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            defpackage.oyb.k(r3)
            boolean r3 = r0.d
            if (r3 == 0) goto L_0x004d
            s88 r3 = r0.a
            long r5 = r0.o
            long r1 = r1 - r5
            r3.u(r1)
        L_0x004d:
            z88 r0 = r10.H0
            u88 r1 = r0.k
            if (r1 == 0) goto L_0x0073
            x88 r2 = r1.f
            boolean r2 = r2.i
            if (r2 != 0) goto L_0x0070
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0070
            u88 r1 = r0.k
            x88 r1 = r1.f
            long r1 = r1.e
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0070
            int r0 = r0.l
            r1 = 100
            if (r0 >= r1) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r7 = 1
            goto L_0x015f
        L_0x0073:
            z88 r0 = r10.H0
            long r1 = r10.c1
            uxa r3 = r10.N0
            u88 r4 = r0.k
            if (r4 != 0) goto L_0x0094
            vje r1 = r3.a
            se8 r2 = r3.b
            long r4 = r3.c
            long r7 = r3.s
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r4
            r21 = r7
            x88 r0 = r16.e(r17, r18, r19, r21)
            goto L_0x009a
        L_0x0094:
            vje r3 = r3.a
            x88 r0 = r0.d(r3, r4, r1)
        L_0x009a:
            if (r0 == 0) goto L_0x0070
            z88 r1 = r10.H0
            u88 r2 = r1.k
            if (r2 != 0) goto L_0x00a8
            r2 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            goto L_0x00b3
        L_0x00a8:
            long r3 = r2.o
            x88 r2 = r2.f
            long r5 = r2.e
            long r3 = r3 + r5
            long r5 = r0.b
            long r3 = r3 - r5
            r2 = r3
        L_0x00b3:
            r4 = 0
        L_0x00b4:
            java.util.List r5 = r1.o
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x00f6
            java.util.List r5 = r1.o
            java.lang.Object r5 = r5.get(r4)
            u88 r5 = (defpackage.u88) r5
            x88 r5 = r5.f
            long r6 = r5.e
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x00d2
            long r13 = r0.e
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x00ed
        L_0x00d2:
            long r6 = r5.b
            long r13 = r0.b
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x00ed
            se8 r5 = r5.a
            se8 r6 = r0.a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00ed
            java.util.List r5 = r1.o
            java.lang.Object r4 = r5.remove(r4)
            u88 r4 = (defpackage.u88) r4
            goto L_0x00f7
        L_0x00ed:
            int r4 = r4 + 1
            r13 = 2
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00b4
        L_0x00f6:
            r4 = r9
        L_0x00f7:
            if (r4 != 0) goto L_0x0122
            r34 r4 = r1.e
            u88 r5 = new u88
            java.lang.Object r4 = r4.b
            z45 r4 = (defpackage.z45) r4
            pi7 r6 = r4.Y
            l34 r29 = r6.j()
            qi0[] r6 = r4.c
            eu7 r7 = r4.o
            pf8 r8 = r4.I0
            ope r4 = r4.X
            r24 = r5
            r25 = r6
            r26 = r2
            r28 = r7
            r30 = r8
            r31 = r0
            r32 = r4
            r24.<init>(r25, r26, r28, r29, r30, r31, r32)
            r4 = r5
            goto L_0x0126
        L_0x0122:
            r4.f = r0
            r4.o = r2
        L_0x0126:
            u88 r2 = r1.k
            if (r2 == 0) goto L_0x0138
            u88 r3 = r2.l
            if (r4 != r3) goto L_0x012f
            goto L_0x013c
        L_0x012f:
            r2.b()
            r2.l = r4
            r2.c()
            goto L_0x013c
        L_0x0138:
            r1.i = r4
            r1.j = r4
        L_0x013c:
            r1.m = r9
            r1.k = r4
            int r2 = r1.l
            r7 = 1
            int r2 = r2 + r7
            r1.l = r2
            r1.k()
            s88 r1 = r4.a
            long r2 = r0.b
            r1.l(r10, r2)
            z88 r1 = r10.H0
            u88 r1 = r1.i
            if (r1 != r4) goto L_0x015b
            long r0 = r0.b
            r10.D(r0)
        L_0x015b:
            r0 = 0
            r10.k(r0)
        L_0x015f:
            boolean r0 = r10.U0
            if (r0 == 0) goto L_0x016d
            boolean r0 = r50.p()
            r10.U0 = r0
            r50.c0()
            goto L_0x0170
        L_0x016d:
            r50.s()
        L_0x0170:
            z88 r8 = r10.H0
            u88 r0 = r8.j
            if (r0 != 0) goto L_0x017b
        L_0x0176:
            r19 = r11
            r11 = r7
            goto L_0x02ca
        L_0x017b:
            u88 r1 = r0.l
            qi0[] r13 = r10.a
            if (r1 == 0) goto L_0x0185
            boolean r1 = r10.R0
            if (r1 == 0) goto L_0x018a
        L_0x0185:
            r19 = r11
            r11 = r7
            goto L_0x0288
        L_0x018a:
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x018f
            goto L_0x0176
        L_0x018f:
            r1 = 0
        L_0x0190:
            int r2 = r13.length
            if (r1 >= r2) goto L_0x01c6
            r2 = r13[r1]
            yjc[] r3 = r0.c
            r3 = r3[r1]
            yjc r4 = r2.x0
            if (r4 != r3) goto L_0x0176
            if (r3 == 0) goto L_0x01c3
            boolean r3 = r2.m()
            if (r3 != 0) goto L_0x01c3
            u88 r3 = r0.l
            x88 r4 = r0.f
            boolean r4 = r4.f
            if (r4 == 0) goto L_0x0176
            boolean r4 = r3.d
            if (r4 == 0) goto L_0x0176
            boolean r4 = r2 instanceof defpackage.age
            if (r4 != 0) goto L_0x01c3
            boolean r4 = r2 instanceof defpackage.m39
            if (r4 != 0) goto L_0x01c3
            long r4 = r2.B0
            long r2 = r3.e()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0176
        L_0x01c3:
            int r1 = r1 + 1
            goto L_0x0190
        L_0x01c6:
            u88 r1 = r0.l
            boolean r2 = r1.d
            if (r2 != 0) goto L_0x01d7
            long r2 = r10.c1
            long r4 = r1.e()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x01d7
            goto L_0x0176
        L_0x01d7:
            ope r14 = r0.n
            u88 r1 = r8.j
            defpackage.oyb.l(r1)
            u88 r1 = r1.l
            r8.j = r1
            r8.k()
            u88 r15 = r8.j
            defpackage.oyb.l(r15)
            ope r5 = r15.n
            uxa r1 = r10.N0
            vje r3 = r1.a
            x88 r1 = r15.f
            se8 r2 = r1.a
            x88 r0 = r0.f
            se8 r4 = r0.a
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r21 = 0
            r0 = r50
            r1 = r3
            r9 = r5
            r5 = r19
            r19 = r11
            r11 = r7
            r7 = r21
            r0.f0(r1, r2, r3, r4, r5, r7)
            boolean r0 = r15.d
            if (r0 == 0) goto L_0x0246
            s88 r0 = r15.a
            long r0 = r0.o()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0246
            long r0 = r15.e()
            int r2 = r13.length
            r3 = 0
        L_0x0226:
            if (r3 >= r2) goto L_0x0234
            r4 = r13[r3]
            yjc r5 = r4.x0
            if (r5 == 0) goto L_0x0231
            M(r4, r0)
        L_0x0231:
            int r3 = r3 + 1
            goto L_0x0226
        L_0x0234:
            boolean r0 = r15.f()
            if (r0 != 0) goto L_0x02ca
            r8.l(r15)
            r0 = 0
            r10.k(r0)
            r50.s()
            goto L_0x02ca
        L_0x0246:
            r0 = 0
        L_0x0247:
            int r1 = r13.length
            if (r0 >= r1) goto L_0x02ca
            boolean r1 = r14.I(r0)
            boolean r2 = r9.I(r0)
            if (r1 == 0) goto L_0x0285
            r1 = r13[r0]
            boolean r1 = r1.C0
            if (r1 != 0) goto L_0x0285
            qi0[] r1 = r10.c
            r1 = r1[r0]
            int r1 = r1.b
            r3 = -2
            if (r1 != r3) goto L_0x0265
            r7 = r11
            goto L_0x0266
        L_0x0265:
            r7 = 0
        L_0x0266:
            java.lang.Object r1 = r14.o
            j9c[] r1 = (defpackage.j9c[]) r1
            r1 = r1[r0]
            java.lang.Object r3 = r9.o
            j9c[] r3 = (defpackage.j9c[]) r3
            r3 = r3[r0]
            if (r2 == 0) goto L_0x027c
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x027c
            if (r7 == 0) goto L_0x0285
        L_0x027c:
            r1 = r13[r0]
            long r2 = r15.e()
            M(r1, r2)
        L_0x0285:
            int r0 = r0 + 1
            goto L_0x0247
        L_0x0288:
            x88 r1 = r0.f
            boolean r1 = r1.i
            if (r1 != 0) goto L_0x0292
            boolean r1 = r10.R0
            if (r1 == 0) goto L_0x02ca
        L_0x0292:
            r1 = 0
        L_0x0293:
            int r2 = r13.length
            if (r1 >= r2) goto L_0x02ca
            r2 = r13[r1]
            yjc[] r3 = r0.c
            r3 = r3[r1]
            if (r3 == 0) goto L_0x02c7
            yjc r4 = r2.x0
            if (r4 != r3) goto L_0x02c7
            boolean r3 = r2.m()
            if (r3 == 0) goto L_0x02c7
            x88 r3 = r0.f
            long r3 = r3.e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x02bf
            r5 = -9223372036854775808
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x02bf
            long r5 = r0.o
            long r3 = r3 + r5
            goto L_0x02c4
        L_0x02bf:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02c4:
            M(r2, r3)
        L_0x02c7:
            int r1 = r1 + 1
            goto L_0x0293
        L_0x02ca:
            z88 r0 = r10.H0
            u88 r1 = r0.j
            if (r1 == 0) goto L_0x02d8
            u88 r0 = r0.i
            if (r0 == r1) goto L_0x02d8
            boolean r0 = r1.g
            if (r0 == 0) goto L_0x02db
        L_0x02d8:
            r8 = 0
            goto L_0x0372
        L_0x02db:
            ope r0 = r1.n
            r2 = 0
            r7 = 0
        L_0x02df:
            qi0[] r3 = r10.a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x035f
            r3 = r3[r2]
            boolean r4 = q(r3)
            if (r4 != 0) goto L_0x02ed
            goto L_0x033e
        L_0x02ed:
            yjc r4 = r3.x0
            yjc[] r5 = r1.c
            r6 = r5[r2]
            if (r4 == r6) goto L_0x02f7
            r4 = r11
            goto L_0x02f8
        L_0x02f7:
            r4 = 0
        L_0x02f8:
            boolean r6 = r0.I(r2)
            if (r6 == 0) goto L_0x0301
            if (r4 != 0) goto L_0x0301
            goto L_0x033e
        L_0x0301:
            boolean r4 = r3.C0
            if (r4 != 0) goto L_0x0350
            java.lang.Object r4 = r0.X
            g55[] r4 = (defpackage.g55[]) r4
            r4 = r4[r2]
            if (r4 == 0) goto L_0x0312
            int r6 = r4.length()
            goto L_0x0313
        L_0x0312:
            r6 = 0
        L_0x0313:
            xu5[] r8 = new defpackage.xu5[r6]
            r9 = 0
        L_0x0316:
            if (r9 >= r6) goto L_0x0321
            xu5 r12 = r4.d(r9)
            r8[r9] = r12
            int r9 = r9 + 1
            goto L_0x0316
        L_0x0321:
            r25 = r5[r2]
            long r26 = r1.e()
            long r4 = r1.o
            x88 r6 = r1.f
            se8 r6 = r6.a
            r23 = r3
            r24 = r8
            r28 = r4
            r30 = r6
            r23.A(r24, r25, r26, r28, r30)
            boolean r3 = r10.Z0
            if (r3 == 0) goto L_0x033e
            if (r3 != 0) goto L_0x0340
        L_0x033e:
            r8 = 0
            goto L_0x035c
        L_0x0340:
            r8 = 0
            r10.Z0 = r8
            uxa r3 = r10.N0
            boolean r3 = r3.p
            if (r3 == 0) goto L_0x035c
            h8e r3 = r10.w0
            r4 = 2
            r3.f(r4)
            goto L_0x035c
        L_0x0350:
            r8 = 0
            boolean r4 = r3.n()
            if (r4 == 0) goto L_0x035b
            r10.b(r3)
            goto L_0x035c
        L_0x035b:
            r7 = r11
        L_0x035c:
            int r2 = r2 + 1
            goto L_0x02df
        L_0x035f:
            r8 = 0
            r0 = r7 ^ 1
            if (r0 == 0) goto L_0x0372
            int r0 = r3.length
            boolean[] r0 = new boolean[r0]
            z88 r1 = r10.H0
            u88 r1 = r1.j
            long r1 = r1.e()
            r10.e(r0, r1)
        L_0x0372:
            r7 = r8
        L_0x0373:
            boolean r0 = r50.X()
            if (r0 != 0) goto L_0x037e
        L_0x0379:
            r13 = r8
            r1 = 3
            r14 = 0
            goto L_0x0419
        L_0x037e:
            boolean r0 = r10.R0
            if (r0 == 0) goto L_0x0383
            goto L_0x0379
        L_0x0383:
            z88 r12 = r10.H0
            u88 r0 = r12.i
            if (r0 != 0) goto L_0x038a
            goto L_0x0379
        L_0x038a:
            u88 r0 = r0.l
            if (r0 == 0) goto L_0x0379
            long r1 = r10.c1
            long r3 = r0.e()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0379
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x0379
            if (r7 == 0) goto L_0x03a1
            r50.t()
        L_0x03a1:
            u88 r0 = r12.a()
            r0.getClass()
            uxa r1 = r10.N0
            se8 r1 = r1.b
            java.lang.Object r1 = r1.a
            x88 r2 = r0.f
            se8 r2 = r2.a
            java.lang.Object r2 = r2.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x03d3
            uxa r1 = r10.N0
            se8 r1 = r1.b
            int r2 = r1.b
            r3 = -1
            if (r2 != r3) goto L_0x03d3
            x88 r2 = r0.f
            se8 r2 = r2.a
            int r4 = r2.b
            if (r4 != r3) goto L_0x03d3
            int r1 = r1.e
            int r2 = r2.e
            if (r1 == r2) goto L_0x03d3
            r7 = r11
            goto L_0x03d4
        L_0x03d3:
            r7 = r8
        L_0x03d4:
            x88 r0 = r0.f
            se8 r1 = r0.a
            long r13 = r0.b
            long r4 = r0.c
            r9 = r7 ^ 1
            r15 = 0
            r0 = r50
            r2 = r13
            r6 = r13
            r13 = r8
            r8 = r9
            r14 = 0
            r9 = r15
            uxa r0 = r0.o(r1, r2, r4, r6, r8, r9)
            r10.N0 = r0
            r50.C()
            r50.e0()
            uxa r0 = r10.N0
            int r0 = r0.e
            r1 = 3
            if (r0 != r1) goto L_0x03fd
            r50.Z()
        L_0x03fd:
            u88 r0 = r12.i
            ope r0 = r0.n
            r8 = r13
        L_0x0402:
            qi0[] r2 = r10.a
            int r3 = r2.length
            if (r8 >= r3) goto L_0x0415
            boolean r3 = r0.I(r8)
            if (r3 == 0) goto L_0x0412
            r2 = r2[r8]
            r2.h()
        L_0x0412:
            int r8 = r8 + 1
            goto L_0x0402
        L_0x0415:
            r7 = r11
            r8 = r13
            goto L_0x0373
        L_0x0419:
            r35 r0 = r10.i1
            r0.getClass()
        L_0x041e:
            uxa r0 = r10.N0
            int r0 = r0.e
            if (r0 == r11) goto L_0x0767
            r2 = 4
            if (r0 != r2) goto L_0x0429
            goto L_0x0767
        L_0x0429:
            z88 r0 = r10.H0
            u88 r0 = r0.i
            if (r0 != 0) goto L_0x0435
            r3 = r19
            r10.H(r3)
            return
        L_0x0435:
            r3 = r19
            java.lang.String r5 = "doSomeWork"
            android.os.Trace.beginSection(r5)
            r50.e0()
            boolean r5 = r0.d
            if (r5 == 0) goto L_0x04c3
            z7e r5 = r10.F0
            r5.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = defpackage.oze.S(r5)
            r10.d1 = r5
            s88 r5 = r0.a
            uxa r6 = r10.N0
            long r6 = r6.s
            long r8 = r10.B0
            long r6 = r6 - r8
            boolean r8 = r10.C0
            r5.s(r6, r8)
            r5 = r11
            r7 = r5
            r8 = r13
        L_0x0463:
            qi0[] r6 = r10.a
            int r9 = r6.length
            if (r8 >= r9) goto L_0x04ca
            r6 = r6[r8]
            boolean r9 = q(r6)
            if (r9 != 0) goto L_0x0471
            goto L_0x04be
        L_0x0471:
            long r11 = r10.c1
            long r14 = r10.d1
            r6.z(r11, r14)
            if (r7 == 0) goto L_0x0482
            boolean r7 = r6.n()
            if (r7 == 0) goto L_0x0482
            r7 = 1
            goto L_0x0483
        L_0x0482:
            r7 = r13
        L_0x0483:
            yjc[] r9 = r0.c
            r9 = r9[r8]
            yjc r11 = r6.x0
            if (r9 == r11) goto L_0x048d
            r9 = 1
            goto L_0x048e
        L_0x048d:
            r9 = r13
        L_0x048e:
            if (r9 != 0) goto L_0x0498
            boolean r11 = r6.m()
            if (r11 == 0) goto L_0x0498
            r11 = 1
            goto L_0x0499
        L_0x0498:
            r11 = r13
        L_0x0499:
            if (r9 != 0) goto L_0x04ac
            if (r11 != 0) goto L_0x04ac
            boolean r9 = r6.p()
            if (r9 != 0) goto L_0x04ac
            boolean r9 = r6.n()
            if (r9 == 0) goto L_0x04aa
            goto L_0x04ac
        L_0x04aa:
            r9 = r13
            goto L_0x04ad
        L_0x04ac:
            r9 = 1
        L_0x04ad:
            if (r5 == 0) goto L_0x04b3
            if (r9 == 0) goto L_0x04b3
            r5 = 1
            goto L_0x04b4
        L_0x04b3:
            r5 = r13
        L_0x04b4:
            if (r9 != 0) goto L_0x04be
            yjc r6 = r6.x0
            r6.getClass()
            r6.c()
        L_0x04be:
            int r8 = r8 + 1
            r11 = 1
            r14 = 0
            goto L_0x0463
        L_0x04c3:
            s88 r5 = r0.a
            r5.i()
            r5 = 1
            r7 = 1
        L_0x04ca:
            x88 r6 = r0.f
            long r8 = r6.e
            if (r7 == 0) goto L_0x04e7
            boolean r6 = r0.d
            if (r6 == 0) goto L_0x04e7
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x04e5
            uxa r6 = r10.N0
            long r6 = r6.s
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x04e7
        L_0x04e5:
            r8 = 1
            goto L_0x04e8
        L_0x04e7:
            r8 = r13
        L_0x04e8:
            if (r8 == 0) goto L_0x04f8
            boolean r6 = r10.R0
            if (r6 == 0) goto L_0x04f8
            r10.R0 = r13
            uxa r6 = r10.N0
            int r6 = r6.n
            r7 = 5
            r10.Q(r6, r7, r13, r13)
        L_0x04f8:
            if (r8 == 0) goto L_0x050b
            x88 r6 = r0.f
            boolean r6 = r6.i
            if (r6 == 0) goto L_0x050b
            r10.W(r2)
            r50.b0()
            r19 = r3
        L_0x0508:
            r3 = 1
            goto L_0x0651
        L_0x050b:
            uxa r6 = r10.N0
            int r7 = r6.e
            r8 = 2
            if (r7 != r8) goto L_0x05ea
            int r7 = r10.a1
            if (r7 != 0) goto L_0x051e
            boolean r8 = r50.r()
            r19 = r3
            goto L_0x05c5
        L_0x051e:
            if (r5 != 0) goto L_0x0525
            r19 = r3
            r8 = r13
            goto L_0x05c5
        L_0x0525:
            boolean r7 = r6.g
            if (r7 != 0) goto L_0x052e
        L_0x0529:
            r19 = r3
        L_0x052b:
            r8 = 1
            goto L_0x05c5
        L_0x052e:
            z88 r7 = r10.H0
            u88 r8 = r7.i
            vje r6 = r6.a
            x88 r9 = r8.f
            se8 r9 = r9.a
            boolean r6 = r10.Y(r6, r9)
            if (r6 == 0) goto L_0x0545
            a94 r6 = r10.J0
            long r11 = r6.j
            r34 = r11
            goto L_0x054a
        L_0x0545:
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x054a:
            u88 r6 = r7.k
            boolean r7 = r6.f()
            if (r7 == 0) goto L_0x055a
            x88 r7 = r6.f
            boolean r7 = r7.i
            if (r7 == 0) goto L_0x055a
            r7 = 1
            goto L_0x055b
        L_0x055a:
            r7 = r13
        L_0x055b:
            x88 r9 = r6.f
            se8 r9 = r9.a
            boolean r9 = r9.b()
            if (r9 == 0) goto L_0x056b
            boolean r6 = r6.d
            if (r6 != 0) goto L_0x056b
            r6 = 1
            goto L_0x056c
        L_0x056b:
            r6 = r13
        L_0x056c:
            if (r7 != 0) goto L_0x0529
            if (r6 != 0) goto L_0x0529
            oi7 r6 = new oi7
            uxa r7 = r10.N0
            vje r9 = r7.a
            x88 r11 = r8.f
            se8 r11 = r11.a
            long r14 = r10.c1
            r19 = r3
            long r2 = r8.o
            long r28 = r14 - r2
            long r2 = r7.q
            z88 r4 = r10.H0
            u88 r4 = r4.k
            r7 = 0
            if (r4 != 0) goto L_0x058f
            r30 = r7
            goto L_0x059b
        L_0x058f:
            long r14 = r10.c1
            long r12 = r4.o
            long r14 = r14 - r12
            long r2 = r2 - r14
            long r2 = java.lang.Math.max(r7, r2)
            r30 = r2
        L_0x059b:
            dk r2 = r10.D0
            wxa r2 = r2.d()
            float r2 = r2.a
            uxa r3 = r10.N0
            boolean r3 = r3.l
            boolean r3 = r10.S0
            cza r4 = r10.L0
            r24 = r6
            r25 = r4
            r26 = r9
            r27 = r11
            r32 = r2
            r33 = r3
            r24.<init>(r25, r26, r27, r28, r30, r32, r33, r34)
            pi7 r2 = r10.Y
            boolean r2 = r2.k(r6)
            if (r2 == 0) goto L_0x05c4
            goto L_0x052b
        L_0x05c4:
            r8 = 0
        L_0x05c5:
            if (r8 == 0) goto L_0x05e8
            r10.W(r1)
            r2 = 0
            r10.g1 = r2
            boolean r2 = r50.X()
            if (r2 == 0) goto L_0x0508
            r2 = 0
            r10.g0(r2, r2)
            dk r2 = r10.D0
            r3 = 1
            r2.c = r3
            java.lang.Object r2 = r2.o
            zb8 r2 = (defpackage.zb8) r2
            r2.b()
            r50.Z()
            goto L_0x0651
        L_0x05e8:
            r3 = 1
            goto L_0x05ed
        L_0x05ea:
            r19 = r3
            goto L_0x05e8
        L_0x05ed:
            uxa r2 = r10.N0
            int r2 = r2.e
            if (r2 != r1) goto L_0x0651
            int r2 = r10.a1
            if (r2 != 0) goto L_0x05fe
            boolean r2 = r50.r()
            if (r2 == 0) goto L_0x0600
            goto L_0x0651
        L_0x05fe:
            if (r5 != 0) goto L_0x0651
        L_0x0600:
            boolean r2 = r50.X()
            r4 = 0
            r10.g0(r2, r4)
            r2 = 2
            r10.W(r2)
            boolean r2 = r10.S0
            if (r2 == 0) goto L_0x064e
            z88 r2 = r10.H0
            u88 r2 = r2.i
        L_0x0614:
            if (r2 == 0) goto L_0x062d
            ope r4 = r2.n
            java.lang.Object r4 = r4.X
            g55[] r4 = (defpackage.g55[]) r4
            int r5 = r4.length
            r8 = 0
        L_0x061e:
            if (r8 >= r5) goto L_0x062a
            r6 = r4[r8]
            if (r6 == 0) goto L_0x0627
            r6.o()
        L_0x0627:
            int r8 = r8 + 1
            goto L_0x061e
        L_0x062a:
            u88 r2 = r2.l
            goto L_0x0614
        L_0x062d:
            a94 r2 = r10.J0
            long r4 = r2.j
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x063b
            goto L_0x064e
        L_0x063b:
            long r8 = r2.c
            long r4 = r4 + r8
            r2.j = r4
            long r8 = r2.i
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x064c
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x064c
            r2.j = r8
        L_0x064c:
            r2.n = r6
        L_0x064e:
            r50.b0()
        L_0x0651:
            uxa r2 = r10.N0
            int r2 = r2.e
            r4 = 2
            if (r2 != r4) goto L_0x0692
            r8 = 0
        L_0x0659:
            qi0[] r2 = r10.a
            int r4 = r2.length
            if (r8 >= r4) goto L_0x067b
            r2 = r2[r8]
            boolean r2 = q(r2)
            if (r2 == 0) goto L_0x0678
            qi0[] r2 = r10.a
            r2 = r2[r8]
            yjc r2 = r2.x0
            yjc[] r4 = r0.c
            r4 = r4[r8]
            if (r2 != r4) goto L_0x0678
            r2.getClass()
            r2.c()
        L_0x0678:
            int r8 = r8 + 1
            goto L_0x0659
        L_0x067b:
            uxa r0 = r10.N0
            boolean r2 = r0.g
            if (r2 != 0) goto L_0x0692
            long r4 = r0.r
            r6 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0692
            boolean r0 = r50.p()
            if (r0 == 0) goto L_0x0692
            r8 = r3
            goto L_0x0693
        L_0x0692:
            r8 = 0
        L_0x0693:
            if (r8 != 0) goto L_0x069d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.h1 = r4
            goto L_0x06c6
        L_0x069d:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = r10.h1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x06b4
            z7e r0 = r10.F0
            r0.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            r10.h1 = r4
            goto L_0x06c6
        L_0x06b4:
            z7e r0 = r10.F0
            r0.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r10.h1
            long r4 = r4 - r6
            r6 = 4000(0xfa0, double:1.9763E-320)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x075f
        L_0x06c6:
            boolean r0 = r50.X()
            if (r0 == 0) goto L_0x06d4
            uxa r0 = r10.N0
            int r0 = r0.e
            if (r0 != r1) goto L_0x06d4
            r8 = r3
            goto L_0x06d5
        L_0x06d4:
            r8 = 0
        L_0x06d5:
            boolean r0 = r10.Z0
            if (r0 == 0) goto L_0x06e0
            boolean r0 = r10.Y0
            if (r0 == 0) goto L_0x06e0
            if (r8 == 0) goto L_0x06e0
            goto L_0x06e1
        L_0x06e0:
            r3 = 0
        L_0x06e1:
            uxa r0 = r10.N0
            boolean r2 = r0.p
            if (r2 == r3) goto L_0x073e
            uxa r2 = new uxa
            r23 = r2
            vje r4 = r0.a
            r24 = r4
            se8 r4 = r0.b
            r25 = r4
            long r4 = r0.c
            r26 = r4
            long r4 = r0.d
            r28 = r4
            int r4 = r0.e
            r30 = r4
            androidx.media3.exoplayer.ExoPlaybackException r4 = r0.f
            r31 = r4
            boolean r4 = r0.g
            r32 = r4
            woe r4 = r0.h
            r33 = r4
            ope r4 = r0.i
            r34 = r4
            java.util.List r4 = r0.j
            r35 = r4
            se8 r4 = r0.k
            r36 = r4
            boolean r4 = r0.l
            r37 = r4
            int r4 = r0.m
            r38 = r4
            int r4 = r0.n
            r39 = r4
            wxa r4 = r0.o
            r40 = r4
            long r4 = r0.q
            r41 = r4
            long r4 = r0.r
            r43 = r4
            long r4 = r0.s
            r45 = r4
            long r4 = r0.t
            r47 = r4
            r49 = r3
            r23.<init>(r24, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r47, r49)
            r10.N0 = r2
        L_0x073e:
            r0 = 0
            r10.Y0 = r0
            if (r3 != 0) goto L_0x075b
            uxa r0 = r10.N0
            int r0 = r0.e
            r2 = 4
            if (r0 != r2) goto L_0x074b
            goto L_0x075b
        L_0x074b:
            if (r8 != 0) goto L_0x0756
            r2 = 2
            if (r0 == r2) goto L_0x0756
            if (r0 != r1) goto L_0x075b
            int r0 = r10.a1
            if (r0 == 0) goto L_0x075b
        L_0x0756:
            r0 = r19
            r10.H(r0)
        L_0x075b:
            android.os.Trace.endSection()
            return
        L_0x075f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x0767:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.d():void");
    }

    public final void d0(List list, int i, int i2) {
        boolean z = true;
        this.O0.d(1);
        pf8 pf8 = this.I0;
        pf8.getClass();
        ArrayList arrayList = (ArrayList) pf8.b;
        oyb.d(i >= 0 && i <= i2 && i2 <= arrayList.size());
        if (list.size() != i2 - i) {
            z = false;
        }
        oyb.d(z);
        for (int i3 = i; i3 < i2; i3++) {
            ((nf8) arrayList.get(i3)).a.t((l68) list.get(i3 - i));
        }
        l(pf8.f(), false);
    }

    public final void e(boolean[] zArr, long j) {
        qi0[] qi0Arr;
        Set set;
        int i;
        u88 u88;
        ope ope;
        z88 z88;
        Set set2;
        int i2;
        d28 d28;
        long j2 = j;
        z88 z882 = this.H0;
        u88 u882 = z882.j;
        ope ope2 = u882.n;
        int i3 = 0;
        while (true) {
            qi0Arr = this.a;
            int length = qi0Arr.length;
            set = this.b;
            if (i3 >= length) {
                break;
            }
            if (!ope2.I(i3) && set.remove(qi0Arr[i3])) {
                qi0Arr[i3].B();
            }
            i3++;
        }
        int i4 = 0;
        while (i4 < qi0Arr.length) {
            if (ope2.I(i4)) {
                boolean z = zArr[i4];
                qi0 qi0 = qi0Arr[i4];
                if (!q(qi0)) {
                    u88 u883 = z882.j;
                    boolean z2 = u883 == z882.i;
                    ope ope3 = u883.n;
                    j9c j9c = ((j9c[]) ope3.o)[i4];
                    g55 g55 = ((g55[]) ope3.X)[i4];
                    if (g55 != null) {
                        z88 = z882;
                        i2 = g55.length();
                    } else {
                        z88 = z882;
                        i2 = 0;
                    }
                    xu5[] xu5Arr = new xu5[i2];
                    ope = ope2;
                    for (int i5 = 0; i5 < i2; i5++) {
                        xu5Arr[i5] = g55.d(i5);
                    }
                    boolean z3 = X() && this.N0.e == 3;
                    boolean z4 = !z && z3;
                    this.a1++;
                    set.add(qi0);
                    yjc yjc = u883.c[i4];
                    u88 = u882;
                    boolean z5 = z3;
                    long j3 = u883.o;
                    se8 se8 = u883.f.a;
                    oyb.k(qi0.w0 == 0);
                    qi0.o = j9c;
                    qi0.w0 = 1;
                    qi0.r(z4, z2);
                    se8 se82 = se8;
                    xu5[] xu5Arr2 = xu5Arr;
                    qi0 qi02 = qi0;
                    boolean z6 = z2;
                    i = i4;
                    long j4 = j3;
                    set2 = set;
                    qi0.A(xu5Arr2, yjc, j, j4, se82);
                    qi02.C0 = false;
                    qi02.A0 = j2;
                    qi02.B0 = j2;
                    qi02.s(j2, z4);
                    qi02.a(11, new p45(this));
                    dk dkVar = this.D0;
                    dkVar.getClass();
                    d28 k = qi02.k();
                    if (!(k == null || k == (d28 = (d28) dkVar.Z))) {
                        if (d28 == null) {
                            dkVar.Z = k;
                            dkVar.Y = qi02;
                            k.f((wxa) ((zb8) dkVar.o).Y);
                        } else {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z5 && z6) {
                        oyb.k(qi02.w0 == 1);
                        qi02.w0 = 2;
                        qi02.v();
                    }
                    i4 = i + 1;
                    set = set2;
                    z882 = z88;
                    ope2 = ope;
                    u882 = u88;
                }
            }
            i = i4;
            z88 = z882;
            u88 = u882;
            ope = ope2;
            set2 = set;
            i4 = i + 1;
            set = set2;
            z882 = z88;
            ope2 = ope;
            u882 = u88;
        }
        u882.g = true;
    }

    public final void e0() {
        u88 u88 = this.H0.i;
        if (u88 != null) {
            long o2 = u88.d ? u88.a.o() : -9223372036854775807L;
            if (o2 != -9223372036854775807L) {
                if (!u88.f()) {
                    this.H0.l(u88);
                    k(false);
                    s();
                }
                D(o2);
                if (o2 != this.N0.s) {
                    uxa uxa = this.N0;
                    this.N0 = o(uxa.b, o2, uxa.c, o2, true, 5);
                }
            } else {
                dk dkVar = this.D0;
                boolean z = u88 != this.H0.j;
                qi0 qi0 = (qi0) dkVar.Y;
                zb8 zb8 = (zb8) dkVar.o;
                if (qi0 == null || qi0.n() || ((z && ((qi0) dkVar.Y).w0 != 2) || (!((qi0) dkVar.Y).p() && (z || ((qi0) dkVar.Y).m())))) {
                    dkVar.b = true;
                    if (dkVar.c) {
                        zb8.b();
                    }
                } else {
                    d28 d28 = (d28) dkVar.Z;
                    d28.getClass();
                    long e = d28.e();
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
                    wxa d = d28.d();
                    if (!d.equals((wxa) zb8.Y)) {
                        zb8.f(d);
                        ((z45) ((e94) dkVar.X)).w0.a(16, d).b();
                    }
                }
                long e2 = dkVar.e();
                this.c1 = e2;
                long j = e2 - u88.o;
                long j2 = this.N0.s;
                if (!this.E0.isEmpty() && !this.N0.b.b()) {
                    if (this.f1) {
                        this.f1 = false;
                    }
                    uxa uxa2 = this.N0;
                    uxa2.a.b(uxa2.b.a);
                    int min = Math.min(this.e1, this.E0.size());
                    if (min > 0) {
                        hr1.r(this.E0.get(min - 1));
                    }
                    if (min < this.E0.size()) {
                        hr1.r(this.E0.get(min));
                    }
                    this.e1 = min;
                }
                if (this.D0.I()) {
                    boolean z2 = !this.O0.e;
                    uxa uxa3 = this.N0;
                    this.N0 = o(uxa3.b, j, uxa3.c, j, z2, 6);
                } else {
                    uxa uxa4 = this.N0;
                    uxa4.s = j;
                    uxa4.t = SystemClock.elapsedRealtime();
                }
            }
            this.N0.q = this.H0.k.d();
            uxa uxa5 = this.N0;
            long j3 = uxa5.q;
            u88 u882 = this.H0.k;
            uxa5.r = u882 == null ? 0 : Math.max(0, j3 - (this.c1 - u882.o));
            uxa uxa6 = this.N0;
            if (uxa6.l && uxa6.e == 3 && Y(uxa6.a, uxa6.b)) {
                uxa uxa7 = this.N0;
                float f = 1.0f;
                if (uxa7.o.a == 1.0f) {
                    a94 a94 = this.J0;
                    long f2 = f(uxa7.a, uxa7.b.a, uxa7.s);
                    long j4 = this.N0.q;
                    u88 u883 = this.H0.k;
                    long max = u883 == null ? 0 : Math.max(0, j4 - (this.c1 - u883.o));
                    if (a94.e != -9223372036854775807L) {
                        long j5 = f2 - max;
                        long j6 = a94.o;
                        if (j6 == -9223372036854775807L) {
                            a94.o = j5;
                            a94.p = 0;
                        } else {
                            float f3 = a94.d;
                            float f4 = 1.0f - f3;
                            long max2 = Math.max(j5, (long) ((((float) j5) * f4) + (((float) j6) * f3)));
                            a94.o = max2;
                            a94.p = (long) ((f4 * ((float) Math.abs(j5 - max2))) + (f3 * ((float) a94.p)));
                        }
                        if (a94.n == -9223372036854775807L || SystemClock.elapsedRealtime() - a94.n >= 1000) {
                            a94.n = SystemClock.elapsedRealtime();
                            long j7 = (a94.p * 3) + a94.o;
                            if (a94.j > j7) {
                                float S = (float) oze.S(1000);
                                a94.j = js.A(j7, a94.g, a94.j - (((long) ((a94.m - 1.0f) * S)) + ((long) ((a94.k - 1.0f) * S))));
                            } else {
                                long k = oze.k(f2 - ((long) (Math.max(0.0f, a94.m - 1.0f) / 1.0E-7f)), a94.j, j7);
                                a94.j = k;
                                long j8 = a94.i;
                                if (j8 != -9223372036854775807L && k > j8) {
                                    a94.j = j8;
                                }
                            }
                            long j9 = f2 - a94.j;
                            if (Math.abs(j9) < a94.b) {
                                a94.m = 1.0f;
                            } else {
                                a94.m = oze.i((1.0E-7f * ((float) j9)) + 1.0f, a94.l, a94.k);
                            }
                            f = a94.m;
                        } else {
                            f = a94.m;
                        }
                    }
                    if (this.D0.d().a != f) {
                        wxa wxa = new wxa(f, this.N0.o.b);
                        this.w0.e(16);
                        this.D0.f(wxa);
                        n(this.N0.o, this.D0.d().a, false, false);
                    }
                }
            }
        }
    }

    public final long f(vje vje, Object obj, long j) {
        qje qje = this.A0;
        int i = vje.h(obj, qje).c;
        tje tje = this.z0;
        vje.o(i, tje);
        if (tje.f == -9223372036854775807L || !tje.a() || !tje.i) {
            return -9223372036854775807L;
        }
        return oze.S(oze.B(tje.g) - tje.f) - (j + qje.e);
    }

    public final void f0(vje vje, se8 se8, vje vje2, se8 se82, long j, boolean z) {
        if (!Y(vje, se8)) {
            wxa wxa = se8.b() ? wxa.d : this.N0.o;
            dk dkVar = this.D0;
            if (!dkVar.d().equals(wxa)) {
                this.w0.e(16);
                dkVar.f(wxa);
                n(this.N0.o, wxa.a, false, false);
                return;
            }
            return;
        }
        Object obj = se8.a;
        qje qje = this.A0;
        int i = vje.h(obj, qje).c;
        tje tje = this.z0;
        vje.o(i, tje);
        z58 z58 = tje.j;
        a94 a94 = this.J0;
        a94.getClass();
        a94.e = oze.S(z58.a);
        a94.h = oze.S(z58.b);
        a94.i = oze.S(z58.c);
        float f = z58.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        a94.l = f;
        float f2 = z58.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        a94.k = f2;
        if (f == 1.0f && f2 == 1.0f) {
            a94.e = -9223372036854775807L;
        }
        a94.a();
        if (j != -9223372036854775807L) {
            a94.f = f(vje, obj, j);
            a94.a();
            return;
        }
        if (!oze.a(!vje2.q() ? vje2.n(vje2.h(se82.a, qje).c, tje, 0).a : null, tje.a) || z) {
            a94.f = -9223372036854775807L;
            a94.a();
        }
    }

    public final Pair g(vje vje) {
        long j = 0;
        if (vje.q()) {
            return Pair.create(uxa.u, 0L);
        }
        int a2 = vje.a(this.W0);
        vje vje2 = vje;
        Pair j2 = vje2.j(this.z0, this.A0, a2, -9223372036854775807L);
        se8 n = this.H0.n(vje, j2.first, 0);
        long longValue = ((Long) j2.second).longValue();
        if (n.b()) {
            Object obj = n.a;
            qje qje = this.A0;
            vje.h(obj, qje);
            if (n.c == qje.f(n.b)) {
                j = qje.g.c;
            }
            longValue = j;
        }
        return Pair.create(n, Long.valueOf(longValue));
    }

    public final void g0(boolean z, boolean z2) {
        long j;
        this.S0 = z;
        if (!z || z2) {
            j = -9223372036854775807L;
        } else {
            this.F0.getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.T0 = j;
    }

    public final void h(s88 s88) {
        u88 u88 = this.H0.k;
        if (u88 != null && u88.a == s88) {
            long j = this.c1;
            if (u88 != null) {
                oyb.k(u88.l == null);
                if (u88.d) {
                    u88.a.u(j - u88.o);
                }
            }
            s();
        }
    }

    public final synchronized void h0(k94 k94, long j) {
        this.F0.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) k94.get()).booleanValue() && j > 0) {
            try {
                this.F0.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.F0.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean handleMessage(Message message) {
        int i;
        u88 u88;
        int i2;
        lza lza;
        Message message2 = message;
        int i3 = 1000;
        try {
            switch (message2.what) {
                case 1:
                    boolean z = message2.arg1 != 0;
                    int i4 = message2.arg2;
                    Q(i4 >> 4, i4 & 15, z, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    J((x45) message2.obj);
                    break;
                case 4:
                    R((wxa) message2.obj);
                    break;
                case 5:
                    this.M0 = (xtc) message2.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((s88) message2.obj);
                    break;
                case 9:
                    h((s88) message2.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    T(message2.arg1);
                    break;
                case 12:
                    U(message2.arg1 != 0);
                    break;
                case 13:
                    N((AtomicBoolean) message2.obj, message2.arg1 != 0);
                    break;
                case 14:
                    lza = (lza) message2.obj;
                    lza.getClass();
                    Looper looper = lza.f;
                    Looper looper2 = this.y0;
                    h8e h8e = this.w0;
                    if (looper != looper2) {
                        h8e.a(15, lza).b();
                        break;
                    } else {
                        synchronized (lza) {
                        }
                        lza.a.a(lza.d, lza.e);
                        lza.b(true);
                        int i5 = this.N0.e;
                        if (i5 == 3 || i5 == 2) {
                            h8e.f(2);
                            break;
                        }
                    }
                case 15:
                    L((lza) message2.obj);
                    break;
                case 16:
                    wxa wxa = (wxa) message2.obj;
                    n(wxa, wxa.a, true, false);
                    break;
                case 17:
                    O((r45) message2.obj);
                    break;
                case 18:
                    a((r45) message2.obj, message2.arg1);
                    break;
                case 19:
                    v((s45) message2.obj);
                    break;
                case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                    z(message2.arg1, message2.arg2, (yed) message2.obj);
                    break;
                case 21:
                    V((yed) message2.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message2.arg1 != 0);
                    break;
                case 25:
                    A();
                    I(true);
                    break;
                case 26:
                    A();
                    I(true);
                    break;
                case 27:
                    d0((List) message2.obj, message2.arg1, message2.arg2);
                    break;
                case 28:
                    S((r35) message2.obj);
                    break;
                case 29:
                    w();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            ExoPlaybackException exoPlaybackException = e;
            int i6 = exoPlaybackException.y0;
            z88 z88 = this.H0;
            if (i6 == 1 && (u88 = z88.j) != null) {
                exoPlaybackException = exoPlaybackException.d(u88.f.a);
            }
            if (!exoPlaybackException.E0 || !(this.g1 == null || (i = exoPlaybackException.a) == 5004 || i == 5003)) {
                ExoPlaybackException exoPlaybackException2 = this.g1;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.g1;
                }
                ExoPlaybackException exoPlaybackException3 = exoPlaybackException;
                ez3.B("Playback error", exoPlaybackException3);
                if (exoPlaybackException3.y0 == 1 && z88.i != z88.j) {
                    while (true) {
                        u88 u882 = z88.i;
                        if (u882 != z88.j) {
                            z88.a();
                        } else {
                            u882.getClass();
                            t();
                            x88 x88 = u882.f;
                            se8 se8 = x88.a;
                            long j = x88.b;
                            this.N0 = o(se8, j, x88.c, j, true, 0);
                        }
                    }
                }
                a0(true, false);
                this.N0 = this.N0.e(exoPlaybackException3);
            } else {
                ez3.k0("Recoverable renderer error", exoPlaybackException);
                ExoPlaybackException exoPlaybackException4 = this.g1;
                if (exoPlaybackException4 != null) {
                    exoPlaybackException4.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.g1;
                } else {
                    this.g1 = exoPlaybackException;
                }
                h8e h8e2 = this.w0;
                f8e a2 = h8e2.a(25, exoPlaybackException);
                h8e2.getClass();
                Message message3 = a2.a;
                message3.getClass();
                h8e2.a.sendMessageAtFrontOfQueue(message3);
                a2.a();
            }
        } catch (DrmSession$DrmSessionException e2) {
            DrmSession$DrmSessionException drmSession$DrmSessionException = e2;
            i(drmSession$DrmSessionException.a, drmSession$DrmSessionException);
        } catch (ParserException e3) {
            ParserException parserException = e3;
            boolean z2 = parserException.a;
            int i7 = parserException.b;
            if (i7 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i7 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                i(i3, parserException);
            }
            i3 = i2;
            i(i3, parserException);
        } catch (DataSourceException e4) {
            DataSourceException dataSourceException = e4;
            i(dataSourceException.a, dataSourceException);
        } catch (BehindLiveWindowException e5) {
            i(1002, e5);
        } catch (IOException e6) {
            i(2000, e6);
        } catch (RuntimeException e7) {
            RuntimeException runtimeException = e7;
            if ((runtimeException instanceof IllegalStateException) || (runtimeException instanceof IllegalArgumentException)) {
                i3 = 1004;
            }
            ExoPlaybackException exoPlaybackException5 = new ExoPlaybackException(2, runtimeException, i3);
            ez3.B("Playback error", exoPlaybackException5);
            a0(true, false);
            this.N0 = this.N0.e(exoPlaybackException5);
        } catch (Throwable th) {
            Throwable th2 = th;
            lza.b(true);
            throw th2;
        }
        t();
        return true;
    }

    public final void i(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        u88 u88 = this.H0.i;
        if (u88 != null) {
            exoPlaybackException = exoPlaybackException.d(u88.f.a);
        }
        ez3.B("Playback error", exoPlaybackException);
        a0(false, false);
        this.N0 = this.N0.e(exoPlaybackException);
    }

    public final void j(kyc kyc) {
        this.w0.a(9, (s88) kyc).b();
    }

    public final void k(boolean z) {
        u88 u88 = this.H0.k;
        se8 se8 = u88 == null ? this.N0.b : u88.f.a;
        boolean z2 = !this.N0.k.equals(se8);
        if (z2) {
            this.N0 = this.N0.b(se8);
        }
        uxa uxa = this.N0;
        uxa.q = u88 == null ? uxa.s : u88.d();
        uxa uxa2 = this.N0;
        long j = uxa2.q;
        u88 u882 = this.H0.k;
        long j2 = 0;
        if (u882 != null) {
            j2 = Math.max(0, j - (this.c1 - u882.o));
        }
        uxa2.r = j2;
        if ((z2 || z) && u88 != null && u88.d) {
            se8 se82 = u88.f.a;
            ope ope = u88.n;
            vje vje = this.N0.a;
            this.Y.h(this.L0, this.a, (g55[]) ope.X);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: tje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: x45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: tje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: tje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: qje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: qje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: x45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: int} */
    /* JADX WARNING: type inference failed for: r25v9 */
    /* JADX WARNING: type inference failed for: r25v18 */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r25v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e4, code lost:
        if (r5.e(r6, r8) != 2) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e6, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f5, code lost:
        if (r5.i(r3.b) != false) goto L_0x01e6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.vje r40, boolean r41) {
        /*
            r39 = this;
            r11 = r39
            r12 = r40
            uxa r0 = r11.N0
            x45 r8 = r11.b1
            z88 r9 = r11.H0
            int r4 = r11.V0
            boolean r10 = r11.W0
            tje r13 = r11.z0
            qje r14 = r11.A0
            boolean r1 = r40.q()
            r7 = 1
            r5 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x003d
            v45 r0 = new v45
            se8 r19 = defpackage.uxa.u
            r25 = 1
            r26 = 0
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r25, r26)
            r7 = r0
            r24 = r5
            r11 = -1
            r13 = 2
            goto L_0x0234
        L_0x003d:
            se8 r1 = r0.b
            java.lang.Object r15 = r1.a
            vje r2 = r0.a
            boolean r20 = r2.q()
            if (r20 != 0) goto L_0x0057
            java.lang.Object r3 = r1.a
            qje r2 = r2.h(r3, r14)
            boolean r2 = r2.f
            if (r2 == 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r21 = 0
            goto L_0x0059
        L_0x0057:
            r21 = r7
        L_0x0059:
            se8 r2 = r0.b
            boolean r2 = r2.b()
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
            if (r8 == 0) goto L_0x00c1
            r3 = 1
            r2 = r1
            r1 = r40
            r27 = r2
            r11 = -1
            r2 = r8
            r5 = r10
            r6 = r13
            r7 = r14
            android.util.Pair r1 = F(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x008a
            int r1 = r12.a(r10)
            r3 = r1
            r1 = r22
            r4 = 0
            r5 = 0
            r7 = 1
            goto L_0x00b4
        L_0x008a:
            long r2 = r8.c
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x009d
            java.lang.Object r1 = r1.first
            qje r1 = r12.h(r1, r14)
            int r2 = r1.c
            r3 = r2
            r1 = r22
            r7 = 0
            goto L_0x00a9
        L_0x009d:
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = r11
            r7 = 1
        L_0x00a9:
            int r4 = r0.e
            r5 = 4
            if (r4 != r5) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r5 = r4
            r4 = r7
            r7 = 0
        L_0x00b4:
            r38 = r4
            r36 = r5
            r37 = r7
            r7 = r27
            r24 = 0
            r4 = r3
            goto L_0x0169
        L_0x00c1:
            r27 = r1
            r11 = -1
            vje r1 = r0.a
            boolean r1 = r1.q()
            if (r1 == 0) goto L_0x00df
            int r1 = r12.a(r10)
        L_0x00d0:
            r4 = r1
            r1 = r22
            r7 = r27
            r24 = 0
        L_0x00d7:
            r36 = 0
            r37 = 0
        L_0x00db:
            r38 = 0
            goto L_0x0169
        L_0x00df:
            int r1 = r12.b(r15)
            if (r1 != r11) goto L_0x0107
            vje r6 = r0.a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r5 = r15
            r7 = r40
            int r1 = G(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r11) goto L_0x00fa
            int r1 = r12.a(r10)
            r7 = 1
            goto L_0x00fb
        L_0x00fa:
            r7 = 0
        L_0x00fb:
            r4 = r1
            r37 = r7
            r1 = r22
            r7 = r27
            r24 = 0
            r36 = 0
            goto L_0x00db
        L_0x0107:
            int r1 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0112
            qje r1 = r12.h(r15, r14)
            int r1 = r1.c
            goto L_0x00d0
        L_0x0112:
            if (r21 == 0) goto L_0x0160
            vje r1 = r0.a
            r7 = r27
            java.lang.Object r2 = r7.a
            r1.h(r2, r14)
            vje r1 = r0.a
            int r2 = r14.c
            r5 = 0
            tje r1 = r1.n(r2, r13, r5)
            int r1 = r1.n
            vje r2 = r0.a
            java.lang.Object r3 = r7.a
            int r2 = r2.b(r3)
            if (r1 != r2) goto L_0x0154
            long r1 = r14.e
            long r19 = r22 + r1
            qje r1 = r12.h(r15, r14)
            int r4 = r1.c
            r1 = r40
            r2 = r13
            r3 = r14
            r24 = r5
            r5 = r19
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x0158
        L_0x0154:
            r24 = r5
            r1 = r22
        L_0x0158:
            r4 = r11
            r36 = 0
            r37 = 0
            r38 = 1
            goto L_0x0169
        L_0x0160:
            r7 = r27
            r24 = 0
            r4 = r11
            r1 = r22
            goto L_0x00d7
        L_0x0169:
            if (r4 == r11) goto L_0x0185
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r40
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r34 = r16
            goto L_0x0187
        L_0x0185:
            r34 = r1
        L_0x0187:
            se8 r3 = r9.n(r12, r15, r1)
            int r4 = r3.e
            if (r4 == r11) goto L_0x0198
            int r5 = r7.e
            if (r5 == r11) goto L_0x0196
            if (r4 < r5) goto L_0x0196
            goto L_0x0198
        L_0x0196:
            r4 = 0
            goto L_0x0199
        L_0x0198:
            r4 = 1
        L_0x0199:
            java.lang.Object r5 = r7.a
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x01b1
            boolean r5 = r7.b()
            if (r5 != 0) goto L_0x01b1
            boolean r5 = r3.b()
            if (r5 != 0) goto L_0x01b1
            if (r4 == 0) goto L_0x01b1
            r4 = 1
            goto L_0x01b2
        L_0x01b1:
            r4 = 0
        L_0x01b2:
            qje r5 = r12.h(r15, r14)
            if (r21 != 0) goto L_0x01c6
            int r6 = (r22 > r34 ? 1 : (r22 == r34 ? 0 : -1))
            if (r6 != 0) goto L_0x01c6
            java.lang.Object r6 = r7.a
            java.lang.Object r8 = r3.a
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x01c8
        L_0x01c6:
            r13 = 2
            goto L_0x01f8
        L_0x01c8:
            boolean r6 = r7.b()
            if (r6 == 0) goto L_0x01e8
            int r6 = r7.b
            boolean r8 = r5.i(r6)
            if (r8 == 0) goto L_0x01e8
            int r8 = r7.c
            int r9 = r5.e(r6, r8)
            r10 = 4
            if (r9 == r10) goto L_0x01c6
            int r5 = r5.e(r6, r8)
            r13 = 2
            if (r5 == r13) goto L_0x01f8
        L_0x01e6:
            r5 = 1
            goto L_0x01f9
        L_0x01e8:
            r13 = 2
            boolean r6 = r3.b()
            if (r6 == 0) goto L_0x01f8
            int r6 = r3.b
            boolean r5 = r5.i(r6)
            if (r5 == 0) goto L_0x01f8
            goto L_0x01e6
        L_0x01f8:
            r5 = 0
        L_0x01f9:
            if (r4 != 0) goto L_0x01fd
            if (r5 == 0) goto L_0x01fe
        L_0x01fd:
            r3 = r7
        L_0x01fe:
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x0228
            boolean r1 = r3.equals(r7)
            if (r1 == 0) goto L_0x020f
            long r0 = r0.s
            r32 = r0
            goto L_0x022a
        L_0x020f:
            java.lang.Object r0 = r3.a
            r12.h(r0, r14)
            int r0 = r3.c
            int r1 = r3.b
            int r1 = r14.f(r1)
            if (r0 != r1) goto L_0x0223
            w8 r0 = r14.g
            long r5 = r0.c
            goto L_0x0225
        L_0x0223:
            r5 = r24
        L_0x0225:
            r32 = r5
            goto L_0x022a
        L_0x0228:
            r32 = r1
        L_0x022a:
            v45 r0 = new v45
            r30 = r0
            r31 = r3
            r30.<init>(r31, r32, r34, r36, r37, r38)
            r7 = r0
        L_0x0234:
            java.lang.Object r0 = r7.f
            r9 = r0
            se8 r9 = (defpackage.se8) r9
            long r14 = r7.b
            boolean r6 = r7.c
            long r3 = r7.a
            r10 = r11
            r11 = r39
            uxa r0 = r11.N0
            se8 r0 = r0.b
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0258
            uxa r0 = r11.N0
            long r0 = r0.s
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0255
            goto L_0x0258
        L_0x0255:
            r19 = 0
            goto L_0x025a
        L_0x0258:
            r19 = 1
        L_0x025a:
            r20 = 3
            boolean r0 = r7.d     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0281
            uxa r0 = r11.N0     // Catch:{ all -> 0x027d }
            int r0 = r0.e     // Catch:{ all -> 0x027d }
            r5 = 1
            if (r0 == r5) goto L_0x0277
            r2 = 4
            r11.W(r2)     // Catch:{ all -> 0x026d }
        L_0x026b:
            r1 = 0
            goto L_0x0279
        L_0x026d:
            r0 = move-exception
        L_0x026e:
            r10 = r2
            r25 = r3
            r22 = r14
            r13 = 0
            r15 = r5
            goto L_0x03df
        L_0x0277:
            r2 = 4
            goto L_0x026b
        L_0x0279:
            r11.B(r1, r1, r1, r5)     // Catch:{ all -> 0x026d }
            goto L_0x0283
        L_0x027d:
            r0 = move-exception
            r2 = 4
            r5 = 1
            goto L_0x026e
        L_0x0281:
            r2 = 4
            r5 = 1
        L_0x0283:
            qi0[] r0 = r11.a     // Catch:{ all -> 0x026d }
            int r1 = r0.length     // Catch:{ all -> 0x026d }
            r2 = 0
        L_0x0287:
            if (r2 >= r1) goto L_0x02a4
            r5 = r0[r2]     // Catch:{ all -> 0x02a2 }
            vje r8 = r5.E0     // Catch:{ all -> 0x02a2 }
            boolean r8 = defpackage.oze.a(r8, r12)     // Catch:{ all -> 0x02a2 }
            if (r8 != 0) goto L_0x0295
            r5.E0 = r12     // Catch:{ all -> 0x02a2 }
        L_0x0295:
            int r2 = r2 + 1
            r5 = 1
            goto L_0x0287
        L_0x0299:
            r25 = r3
            r22 = r14
            r10 = 4
            r13 = 0
            r15 = 1
            goto L_0x03df
        L_0x02a2:
            r0 = move-exception
            goto L_0x0299
        L_0x02a4:
            if (r19 != 0) goto L_0x031b
            z88 r1 = r11.H0     // Catch:{ all -> 0x0313 }
            long r5 = r11.c1     // Catch:{ all -> 0x0313 }
            u88 r0 = r1.j     // Catch:{ all -> 0x030d }
            if (r0 != 0) goto L_0x02b5
            r22 = r14
            r13 = r24
        L_0x02b2:
            r25 = r3
            goto L_0x02f4
        L_0x02b5:
            r22 = r14
            long r13 = r0.o     // Catch:{ all -> 0x0309 }
            boolean r2 = r0.d     // Catch:{ all -> 0x0309 }
            if (r2 != 0) goto L_0x02be
            goto L_0x02b2
        L_0x02be:
            r2 = 0
        L_0x02bf:
            qi0[] r8 = r11.a     // Catch:{ all -> 0x0309 }
            int r15 = r8.length     // Catch:{ all -> 0x0309 }
            if (r2 >= r15) goto L_0x02b2
            r15 = r8[r2]     // Catch:{ all -> 0x0309 }
            boolean r15 = q(r15)     // Catch:{ all -> 0x0309 }
            if (r15 == 0) goto L_0x02d6
            r8 = r8[r2]     // Catch:{ all -> 0x0309 }
            yjc r15 = r8.x0     // Catch:{ all -> 0x0309 }
            yjc[] r10 = r0.c     // Catch:{ all -> 0x0309 }
            r10 = r10[r2]     // Catch:{ all -> 0x0309 }
            if (r15 == r10) goto L_0x02d9
        L_0x02d6:
            r25 = r3
            goto L_0x02ee
        L_0x02d9:
            r25 = r3
            long r3 = r8.B0     // Catch:{ all -> 0x02ec }
            r28 = -9223372036854775808
            int r8 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r8 != 0) goto L_0x02e6
            r13 = r28
            goto L_0x02f4
        L_0x02e6:
            long r3 = java.lang.Math.max(r3, r13)     // Catch:{ all -> 0x02ec }
            r13 = r3
            goto L_0x02ee
        L_0x02ec:
            r0 = move-exception
            goto L_0x0318
        L_0x02ee:
            int r2 = r2 + 1
            r3 = r25
            r10 = -1
            goto L_0x02bf
        L_0x02f4:
            r10 = 4
            r2 = r40
            r3 = r5
            r15 = 1
            r5 = r13
            boolean r0 = r1.q(r2, r3, r5)     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x035d
            r1 = 0
            r11.I(r1)     // Catch:{ all -> 0x0305 }
            goto L_0x035d
        L_0x0305:
            r0 = move-exception
        L_0x0306:
            r13 = 0
            goto L_0x03df
        L_0x0309:
            r0 = move-exception
            r25 = r3
            goto L_0x0318
        L_0x030d:
            r0 = move-exception
            r25 = r3
            r22 = r14
            goto L_0x0318
        L_0x0313:
            r0 = move-exception
            r25 = r3
            r22 = r14
        L_0x0318:
            r10 = 4
            r15 = 1
            goto L_0x0306
        L_0x031b:
            r25 = r3
            r22 = r14
            r10 = 4
            r15 = 1
            boolean r0 = r40.q()     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x035d
            z88 r0 = r11.H0     // Catch:{ all -> 0x0305 }
            u88 r0 = r0.i     // Catch:{ all -> 0x0305 }
        L_0x032b:
            if (r0 == 0) goto L_0x0347
            x88 r1 = r0.f     // Catch:{ all -> 0x0305 }
            se8 r1 = r1.a     // Catch:{ all -> 0x0305 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x0305 }
            if (r1 == 0) goto L_0x0344
            z88 r1 = r11.H0     // Catch:{ all -> 0x0305 }
            x88 r2 = r0.f     // Catch:{ all -> 0x0305 }
            x88 r1 = r1.h(r12, r2)     // Catch:{ all -> 0x0305 }
            r0.f = r1     // Catch:{ all -> 0x0305 }
            r0.i()     // Catch:{ all -> 0x0305 }
        L_0x0344:
            u88 r0 = r0.l     // Catch:{ all -> 0x0305 }
            goto L_0x032b
        L_0x0347:
            z88 r0 = r11.H0     // Catch:{ all -> 0x0305 }
            u88 r1 = r0.i     // Catch:{ all -> 0x0305 }
            u88 r0 = r0.j     // Catch:{ all -> 0x0305 }
            if (r1 == r0) goto L_0x0351
            r5 = r15
            goto L_0x0352
        L_0x0351:
            r5 = 0
        L_0x0352:
            r1 = r39
            r2 = r9
            r3 = r25
            long r0 = r1.K(r2, r3, r5, r6)     // Catch:{ all -> 0x0305 }
            r25 = r0
        L_0x035d:
            uxa r0 = r11.N0
            vje r4 = r0.a
            se8 r5 = r0.b
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x036a
            r6 = r25
            goto L_0x036c
        L_0x036a:
            r6 = r16
        L_0x036c:
            r8 = 0
            r1 = r39
            r2 = r40
            r3 = r9
            r13 = 0
            r1.f0(r2, r3, r4, r5, r6, r8)
            if (r19 != 0) goto L_0x0380
            uxa r0 = r11.N0
            long r0 = r0.c
            int r0 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x03ba
        L_0x0380:
            uxa r0 = r11.N0
            se8 r1 = r0.b
            java.lang.Object r1 = r1.a
            vje r0 = r0.a
            if (r19 == 0) goto L_0x039d
            if (r41 == 0) goto L_0x039d
            boolean r2 = r0.q()
            if (r2 != 0) goto L_0x039d
            qje r2 = r11.A0
            qje r0 = r0.h(r1, r2)
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x039d
            goto L_0x039e
        L_0x039d:
            r15 = 0
        L_0x039e:
            uxa r0 = r11.N0
            long r7 = r0.d
            int r0 = r12.b(r1)
            r1 = -1
            if (r0 != r1) goto L_0x03aa
            goto L_0x03ac
        L_0x03aa:
            r10 = r20
        L_0x03ac:
            r1 = r39
            r2 = r9
            r3 = r25
            r5 = r22
            r9 = r15
            uxa r0 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.N0 = r0
        L_0x03ba:
            r39.C()
            uxa r0 = r11.N0
            vje r0 = r0.a
            r11.E(r12, r0)
            uxa r0 = r11.N0
            uxa r0 = r0.h(r12)
            r11.N0 = r0
            boolean r0 = r40.q()
            if (r0 != 0) goto L_0x03d4
            r11.b1 = r13
        L_0x03d4:
            r1 = 0
            r11.k(r1)
            h8e r0 = r11.w0
            r1 = 2
            r0.f(r1)
            return
        L_0x03df:
            uxa r1 = r11.N0
            vje r4 = r1.a
            se8 r5 = r1.b
            boolean r1 = r7.e
            if (r1 == 0) goto L_0x03ec
            r6 = r25
            goto L_0x03ee
        L_0x03ec:
            r6 = r16
        L_0x03ee:
            r8 = 0
            r1 = r39
            r2 = r40
            r3 = r9
            r1.f0(r2, r3, r4, r5, r6, r8)
            if (r19 != 0) goto L_0x0401
            uxa r1 = r11.N0
            long r1 = r1.c
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x043b
        L_0x0401:
            uxa r1 = r11.N0
            se8 r2 = r1.b
            java.lang.Object r2 = r2.a
            vje r1 = r1.a
            if (r19 == 0) goto L_0x041e
            if (r41 == 0) goto L_0x041e
            boolean r3 = r1.q()
            if (r3 != 0) goto L_0x041e
            qje r3 = r11.A0
            qje r1 = r1.h(r2, r3)
            boolean r1 = r1.f
            if (r1 != 0) goto L_0x041e
            goto L_0x041f
        L_0x041e:
            r15 = 0
        L_0x041f:
            uxa r1 = r11.N0
            long r7 = r1.d
            int r1 = r12.b(r2)
            r2 = -1
            if (r1 != r2) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            r10 = r20
        L_0x042d:
            r1 = r39
            r2 = r9
            r3 = r25
            r5 = r22
            r9 = r15
            uxa r1 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.N0 = r1
        L_0x043b:
            r39.C()
            uxa r1 = r11.N0
            vje r1 = r1.a
            r11.E(r12, r1)
            uxa r1 = r11.N0
            uxa r1 = r1.h(r12)
            r11.N0 = r1
            boolean r1 = r40.q()
            if (r1 != 0) goto L_0x0455
            r11.b1 = r13
        L_0x0455:
            r1 = 0
            r11.k(r1)
            h8e r1 = r11.w0
            r2 = 2
            r1.f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.l(vje, boolean):void");
    }

    public final void m(s88 s88) {
        z88 z88 = this.H0;
        u88 u88 = z88.k;
        if (u88 != null && u88.a == s88) {
            float f = this.D0.d().a;
            vje vje = this.N0.a;
            u88.d = true;
            u88.m = u88.a.p();
            ope h = u88.h(f, vje);
            x88 x88 = u88.f;
            long j = x88.b;
            long j2 = x88.e;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            long a2 = u88.a(h, j, false, new boolean[u88.i.length]);
            long j3 = u88.o;
            x88 x882 = u88.f;
            u88.o = (x882.b - a2) + j3;
            u88.f = x882.b(a2);
            ope ope = u88.n;
            vje vje2 = this.N0.a;
            pi7 pi7 = this.Y;
            cza cza = this.L0;
            qi0[] qi0Arr = this.a;
            pi7.h(cza, qi0Arr, (g55[]) ope.X);
            if (u88 == z88.i) {
                D(u88.f.b);
                e(new boolean[qi0Arr.length], z88.j.e());
                uxa uxa = this.N0;
                se8 se8 = uxa.b;
                long j4 = u88.f.b;
                this.N0 = o(se8, j4, uxa.c, j4, false, 5);
            }
            s();
        }
    }

    public final void n(wxa wxa, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.O0.d(1);
            }
            this.N0 = this.N0.f(wxa);
        }
        float f2 = wxa.a;
        u88 u88 = this.H0.i;
        while (true) {
            i = 0;
            if (u88 == null) {
                break;
            }
            g55[] g55Arr = (g55[]) u88.n.X;
            int length = g55Arr.length;
            while (i < length) {
                g55 g55 = g55Arr[i];
                if (g55 != null) {
                    g55.l(f2);
                }
                i++;
            }
            u88 = u88.l;
        }
        qi0[] qi0Arr = this.a;
        int length2 = qi0Arr.length;
        while (i < length2) {
            qi0 qi0 = qi0Arr[i];
            if (qi0 != null) {
                qi0.C(f, wxa.a);
            }
            i++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: e8c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: e8c} */
    /* JADX WARNING: type inference failed for: r11v5, types: [ms6, ts6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.uxa o(defpackage.se8 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r4 = r20
            r2 = r25
            boolean r3 = r0.f1
            r6 = 0
            if (r3 != 0) goto L_0x0022
            uxa r3 = r0.N0
            long r8 = r3.s
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            uxa r3 = r0.N0
            se8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = r6
            goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            r0.f1 = r3
            r16.C()
            uxa r3 = r0.N0
            woe r8 = r3.h
            ope r9 = r3.i
            java.util.List r10 = r3.j
            pf8 r11 = r0.I0
            boolean r11 = r11.g
            if (r11 == 0) goto L_0x00e0
            z88 r3 = r0.H0
            u88 r3 = r3.i
            if (r3 != 0) goto L_0x003f
            woe r8 = defpackage.woe.d
            goto L_0x0041
        L_0x003f:
            woe r8 = r3.m
        L_0x0041:
            if (r3 != 0) goto L_0x0046
            ope r9 = r0.X
            goto L_0x0048
        L_0x0046:
            ope r9 = r3.n
        L_0x0048:
            java.lang.Object r10 = r9.X
            g55[] r10 = (defpackage.g55[]) r10
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
            xu5 r15 = r15.d(r6)
            a39 r15 = r15.k
            if (r15 != 0) goto L_0x006e
            a39 r15 = new a39
            x29[] r7 = new defpackage.x29[r6]
            r15.<init>((defpackage.x29[]) r7)
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
            x88 r10 = r3.f
            long r11 = r10.c
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            x88 r10 = r10.a(r4)
            r3.f = r10
        L_0x0092:
            z88 r3 = r0.H0
            u88 r3 = r3.i
            if (r3 == 0) goto L_0x00dc
            ope r3 = r3.n
            r10 = r6
            r11 = r10
        L_0x009c:
            qi0[] r12 = r0.a
            int r13 = r12.length
            if (r11 >= r13) goto L_0x00bf
            boolean r13 = r3.I(r11)
            if (r13 == 0) goto L_0x00bc
            r12 = r12[r11]
            int r12 = r12.b
            r13 = 1
            if (r12 == r13) goto L_0x00b0
            r3 = r6
            goto L_0x00c0
        L_0x00b0:
            java.lang.Object r12 = r3.o
            j9c[] r12 = (defpackage.j9c[]) r12
            r12 = r12[r11]
            int r12 = r12.a
            if (r12 == 0) goto L_0x00bd
            r10 = r13
            goto L_0x00bd
        L_0x00bc:
            r13 = 1
        L_0x00bd:
            int r11 = r11 + r13
            goto L_0x009c
        L_0x00bf:
            r3 = 1
        L_0x00c0:
            if (r10 == 0) goto L_0x00c6
            if (r3 == 0) goto L_0x00c6
            r3 = 1
            goto L_0x00c7
        L_0x00c6:
            r3 = r6
        L_0x00c7:
            boolean r10 = r0.Z0
            if (r3 != r10) goto L_0x00cc
            goto L_0x00dc
        L_0x00cc:
            r0.Z0 = r3
            if (r3 != 0) goto L_0x00dc
            uxa r3 = r0.N0
            boolean r3 = r3.p
            if (r3 == 0) goto L_0x00dc
            h8e r3 = r0.w0
            r10 = 2
            r3.f(r10)
        L_0x00dc:
            r12 = r7
            r10 = r8
            r11 = r9
            goto L_0x00f5
        L_0x00e0:
            se8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00f2
            woe r3 = defpackage.woe.d
            ope r7 = r0.X
            e8c r8 = defpackage.e8c.X
            r10 = r3
            r11 = r7
            r12 = r8
            goto L_0x00f5
        L_0x00f2:
            r11 = r9
            r12 = r10
            r10 = r8
        L_0x00f5:
            if (r24 == 0) goto L_0x0110
            u45 r3 = r0.O0
            boolean r7 = r3.e
            if (r7 == 0) goto L_0x0109
            int r7 = r3.c
            r8 = 5
            if (r7 == r8) goto L_0x0109
            if (r2 != r8) goto L_0x0105
            r6 = 1
        L_0x0105:
            defpackage.oyb.d(r6)
            goto L_0x0110
        L_0x0109:
            r6 = 1
            r3.d = r6
            r3.e = r6
            r3.c = r2
        L_0x0110:
            uxa r2 = r0.N0
            long r6 = r2.q
            z88 r3 = r0.H0
            u88 r3 = r3.k
            if (r3 != 0) goto L_0x011d
            r8 = 0
            goto L_0x012a
        L_0x011d:
            long r13 = r0.c1
            long r8 = r3.o
            long r13 = r13 - r8
            long r6 = r6 - r13
            r8 = 0
            long r6 = java.lang.Math.max(r8, r6)
            r8 = r6
        L_0x012a:
            r0 = r2
            r1 = r17
            r2 = r18
            r4 = r20
            r6 = r22
            uxa r0 = r0.c(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.o(se8, long, long, long, boolean, int):uxa");
    }

    public final boolean p() {
        u88 u88 = this.H0.k;
        if (u88 == null) {
            return false;
        }
        try {
            s88 s88 = u88.a;
            if (!u88.d) {
                s88.i();
            } else {
                for (yjc yjc : u88.c) {
                    if (yjc != null) {
                        yjc.c();
                    }
                }
            }
            return (!u88.d ? 0 : s88.f()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean r() {
        u88 u88 = this.H0.i;
        long j = u88.f.e;
        return u88.d && (j == -9223372036854775807L || this.N0.s < j || !X());
    }

    public final void s() {
        boolean z;
        long j;
        long j2;
        boolean z2 = false;
        if (!p()) {
            z = false;
        } else {
            u88 u88 = this.H0.k;
            long f = !u88.d ? 0 : u88.a.f();
            u88 u882 = this.H0.k;
            long max = u882 == null ? 0 : Math.max(0, f - (this.c1 - u882.o));
            if (u88 == this.H0.i) {
                j2 = this.c1;
                j = u88.o;
            } else {
                j2 = this.c1 - u88.o;
                j = u88.f.b;
            }
            long j3 = j2 - j;
            long j4 = Y(this.N0.a, u88.f.a) ? this.J0.j : -9223372036854775807L;
            cza cza = this.L0;
            vje vje = this.N0.a;
            se8 se8 = u88.f.a;
            float f2 = this.D0.d().a;
            boolean z3 = this.N0.l;
            oi7 oi7 = r9;
            oi7 oi72 = new oi7(cza, vje, se8, j3, max, f2, this.S0, j4);
            z = this.Y.i(oi7);
            u88 u883 = this.H0.i;
            if (!z && u883.d && max < 500000 && (this.B0 > 0 || this.C0)) {
                u883.a.s(this.N0.s, false);
                z = this.Y.i(oi7);
            }
        }
        this.U0 = z;
        if (z) {
            u88 u884 = this.H0.k;
            long j5 = this.c1;
            float f3 = this.D0.d().a;
            long j6 = this.T0;
            oyb.k(u884.l == null);
            s88 s88 = u884.a;
            pj7 pj7 = new pj7();
            pj7.a = j5 - u884.o;
            oyb.d(f3 > 0.0f || f3 == -3.4028235E38f);
            pj7.b = f3;
            if (j6 >= 0 || j6 == -9223372036854775807L) {
                z2 = true;
            }
            oyb.d(z2);
            pj7.c = j6;
            s88.m(new qj7(pj7));
        }
        c0();
    }

    public final void t() {
        u45 u45 = this.O0;
        uxa uxa = this.N0;
        boolean z = u45.d | (((uxa) u45.f) != uxa);
        u45.d = z;
        u45.f = uxa;
        if (z) {
            n45 n45 = this.G0.b;
            n45.y0.d(new ii4(n45, 18, u45));
            this.O0 = new u45(this.N0);
        }
    }

    public final void u() {
        l(this.I0.f(), true);
    }

    public final void v(s45 s45) {
        vje vje;
        this.O0.d(1);
        int i = s45.a;
        pf8 pf8 = this.I0;
        pf8.getClass();
        ArrayList arrayList = (ArrayList) pf8.b;
        int i2 = s45.b;
        int i3 = s45.c;
        oyb.d(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        pf8.l = s45.d;
        if (i == i2 || i == i3) {
            vje = pf8.f();
        } else {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((nf8) arrayList.get(min)).d;
            oze.R(arrayList, i, i2, i3);
            while (min <= max) {
                nf8 nf8 = (nf8) arrayList.get(min);
                nf8.d = i4;
                i4 += nf8.a.o.e.p();
                min++;
            }
            vje = pf8.f();
        }
        l(vje, false);
    }

    public final void w() {
        this.O0.d(1);
        int i = 0;
        B(false, false, false, true);
        this.Y.g(this.L0);
        W(this.N0.a.q() ? 4 : 2);
        g54 g54 = (g54) this.Z;
        g54.getClass();
        pf8 pf8 = this.I0;
        oyb.k(!pf8.g);
        pf8.m = g54;
        while (true) {
            ArrayList arrayList = (ArrayList) pf8.b;
            if (i < arrayList.size()) {
                nf8 nf8 = (nf8) arrayList.get(i);
                pf8.l(nf8);
                ((HashSet) pf8.f).add(nf8);
                i++;
            } else {
                pf8.g = true;
                this.w0.f(2);
                return;
            }
        }
    }

    public final void x() {
        try {
            B(true, false, true, false);
            y();
            this.Y.c(this.L0);
            W(1);
            HandlerThread handlerThread = this.x0;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.P0 = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.x0;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.P0 = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void y() {
        for (int i = 0; i < this.a.length; i++) {
            qi0 qi0 = this.c[i];
            synchronized (qi0.a) {
                qi0.F0 = null;
            }
            qi0 qi02 = this.a[i];
            oyb.k(qi02.w0 == 0);
            qi02.t();
        }
    }

    public final void z(int i, int i2, yed yed) {
        boolean z = true;
        this.O0.d(1);
        pf8 pf8 = this.I0;
        pf8.getClass();
        if (i < 0 || i > i2 || i2 > ((ArrayList) pf8.b).size()) {
            z = false;
        }
        oyb.d(z);
        pf8.l = yed;
        pf8.p(i, i2);
        l(pf8.f(), false);
    }
}
