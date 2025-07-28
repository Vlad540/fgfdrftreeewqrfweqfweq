package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jy2  reason: default package */
public final class jy2 implements yjc, kyc, dj7, ij7 {
    public final List A0;
    public final wjc B0;
    public final wjc[] C0;
    public final otf D0;
    public zx2 E0;
    public xu5 F0;
    public hy2 G0;
    public long H0;
    public long I0;
    public int J0;
    public uh0 K0;
    public boolean L0;
    public final e64 X;
    public final iyc Y;
    public final jn Z;
    public final int a;
    public final int[] b;
    public final xu5[] c;
    public final boolean[] o;
    public final mk9 w0;
    public final ul7 x0 = new ul7("ChunkSampleStream", 1);
    public final xp0 y0 = new Object();
    public final ArrayList z0;

    /* JADX WARNING: type inference failed for: r3v2, types: [xp0, java.lang.Object] */
    public jy2(int i, int[] iArr, xu5[] xu5Arr, e64 e64, iyc iyc, l34 l34, long j, no4 no4, fo4 fo4, mk9 mk9, jn jnVar) {
        this.a = i;
        this.b = iArr;
        this.c = xu5Arr;
        this.X = e64;
        this.Y = iyc;
        this.Z = jnVar;
        this.w0 = mk9;
        ArrayList arrayList = new ArrayList();
        this.z0 = arrayList;
        this.A0 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.C0 = new wjc[length];
        this.o = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        wjc[] wjcArr = new wjc[i2];
        no4.getClass();
        wjc wjc = new wjc(l34, no4, fo4);
        this.B0 = wjc;
        int i3 = 0;
        iArr2[0] = i;
        wjcArr[0] = wjc;
        while (i3 < length) {
            wjc wjc2 = new wjc(l34, (no4) null, (fo4) null);
            this.C0[i3] = wjc2;
            int i4 = i3 + 1;
            wjcArr[i4] = wjc2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.D0 = new otf(iArr2, wjcArr);
        this.H0 = j;
        this.I0 = j;
    }

    public final void A(hy2 hy2) {
        this.G0 = hy2;
        wjc wjc = this.B0;
        wjc.h();
        zn4 zn4 = wjc.h;
        if (zn4 != null) {
            zn4.f(wjc.e);
            wjc.h = null;
            wjc.g = null;
        }
        for (wjc wjc2 : this.C0) {
            wjc2.h();
            zn4 zn42 = wjc2.h;
            if (zn42 != null) {
                zn42.f(wjc2.e);
                wjc2.h = null;
                wjc2.g = null;
            }
        }
        this.x0.E(this);
    }

    public final fy2 B(int i, long j) {
        int i2 = 0;
        while (true) {
            wjc[] wjcArr = this.C0;
            if (i2 >= wjcArr.length) {
                throw new IllegalStateException();
            } else if (this.b[i2] == i) {
                boolean[] zArr = this.o;
                oyb.k(!zArr[i2]);
                zArr[i2] = true;
                wjcArr[i2].A(j, true);
                return new fy2(this, this, wjcArr[i2], i2);
            } else {
                i2++;
            }
        }
    }

    public final void E(gj7 gj7, long j, long j2) {
        zx2 zx2 = (zx2) gj7;
        this.E0 = null;
        e64 e64 = this.X;
        e64.getClass();
        if (zx2 instanceof qw6) {
            int s = e64.j.s(((qw6) zx2).o);
            a64[] a64Arr = e64.i;
            a64 a64 = a64Arr[s];
            if (((wy3) a64.g) == null) {
                ay2 ay2 = (ay2) a64.d;
                oyb.l(ay2);
                cy2 a2 = ((qt0) ay2).a();
                if (a2 != null) {
                    kac kac = (kac) a64.e;
                    xw2 xw2 = new xw2((Object) a2, kac.c, 3);
                    long j3 = a64.c;
                    a64Arr[s] = new a64(a64.b, kac, (hj0) a64.f, (ay2) a64.d, j3, xw2, 1);
                }
            }
        }
        wya wya = e64.h;
        if (wya != null) {
            long j4 = wya.d;
            if (j4 == -9223372036854775807L || zx2.w0 > j4) {
                wya.d = zx2.w0;
            }
            wya.e.o = true;
        }
        long j5 = zx2.a;
        Uri uri = zx2.x0.c;
        yi7 yi7 = new yi7(j2);
        this.w0.getClass();
        this.Z.z(yi7, zx2.c, this.a, zx2.o, zx2.X, zx2.Y, zx2.Z, zx2.w0);
        this.Y.j(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sz0 U(defpackage.gj7 r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r12 = r32
            r1 = 1
            r2 = r27
            zx2 r2 = (defpackage.zx2) r2
            fsd r3 = r2.x0
            long r3 = r3.b
            boolean r5 = r2 instanceof defpackage.uh0
            java.util.ArrayList r6 = r0.z0
            int r7 = r6.size()
            int r7 = r7 - r1
            r8 = 0
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0027
            if (r5 == 0) goto L_0x0027
            boolean r3 = r0.v(r7)
            if (r3 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = 0
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            yi7 r10 = new yi7
            fsd r11 = r2.x0
            android.net.Uri r11 = r11.c
            r13 = r30
            r10.<init>(r13)
            long r13 = r2.Z
            defpackage.oze.h0(r13)
            long r8 = r2.w0
            defpackage.oze.h0(r8)
            wi7 r8 = new wi7
            r9 = r33
            r8.<init>(r9, r12)
            e64 r9 = r0.X
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            mk9 r11 = r0.w0
            if (r3 != 0) goto L_0x005b
            r9.getClass()
            r16 = r6
            r17 = r7
            r25 = r10
        L_0x0058:
            r1 = 0
            goto L_0x0234
        L_0x005b:
            wya r4 = r9.h
            r19 = r2
            if (r4 == 0) goto L_0x00a8
            long r1 = r4.d
            int r17 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x006d
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x006d
            r1 = 1
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            xya r2 = r4.e
            java.lang.Object r4 = r2.y0
            ey3 r4 = (defpackage.ey3) r4
            boolean r4 = r4.d
            if (r4 != 0) goto L_0x0079
            goto L_0x00a8
        L_0x0079:
            boolean r4 = r2.X
            if (r4 == 0) goto L_0x007e
            goto L_0x009d
        L_0x007e:
            if (r1 == 0) goto L_0x00a8
            boolean r1 = r2.o
            if (r1 != 0) goto L_0x0085
            goto L_0x009d
        L_0x0085:
            r1 = 1
            r2.X = r1
            r1 = 0
            r2.o = r1
            java.lang.Object r1 = r2.w0
            u5g r1 = (defpackage.u5g) r1
            java.lang.Object r1 = r1.b
            uy3 r1 = (defpackage.uy3) r1
            android.os.Handler r2 = r1.D
            oy3 r4 = r1.w
            r2.removeCallbacks(r4)
            r1.z()
        L_0x009d:
            r16 = r6
            r17 = r7
            r25 = r10
            r2 = r19
        L_0x00a5:
            r1 = 1
            goto L_0x0234
        L_0x00a8:
            ey3 r1 = r9.k
            boolean r1 = r1.d
            r2 = r19
            xu5 r4 = r2.o
            a64[] r13 = r9.i
            if (r1 != 0) goto L_0x0107
            boolean r1 = r2 instanceof defpackage.y18
            if (r1 == 0) goto L_0x0107
            boolean r1 = r12 instanceof androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException
            if (r1 == 0) goto L_0x0107
            r1 = r12
            androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException r1 = (androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException) r1
            int r1 = r1.o
            r14 = 404(0x194, float:5.66E-43)
            if (r1 != r14) goto L_0x0107
            g55 r1 = r9.j
            int r1 = r1.s(r4)
            r1 = r13[r1]
            long r17 = r1.e()
            r19 = -1
            int r14 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r14 == 0) goto L_0x0107
            r19 = 0
            int r14 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r14 == 0) goto L_0x0107
            java.lang.Object r14 = r1.g
            wy3 r14 = (defpackage.wy3) r14
            defpackage.oyb.l(r14)
            long r19 = r14.C()
            long r14 = r1.c
            long r19 = r19 + r14
            long r19 = r19 + r17
            r14 = 1
            long r19 = r19 - r14
            r1 = r2
            y18 r1 = (defpackage.y18) r1
            long r14 = r1.b()
            int r1 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x0107
            r1 = 1
            r9.n = r1
        L_0x0100:
            r16 = r6
            r17 = r7
            r25 = r10
            goto L_0x00a5
        L_0x0107:
            g55 r1 = r9.j
            int r1 = r1.s(r4)
            r1 = r13[r1]
            java.lang.Object r13 = r1.e
            kac r13 = (defpackage.kac) r13
            ws6 r13 = r13.b
            j8e r14 = r9.b
            hj0 r13 = r14.C(r13)
            java.lang.Object r15 = r1.f
            hj0 r15 = (defpackage.hj0) r15
            if (r13 == 0) goto L_0x0128
            boolean r13 = r15.equals(r13)
            if (r13 != 0) goto L_0x0128
            goto L_0x0100
        L_0x0128:
            g55 r13 = r9.j
            java.lang.Object r1 = r1.e
            kac r1 = (defpackage.kac) r1
            ws6 r1 = r1.b
            r16 = r6
            r17 = r7
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r12 = r13.length()
            r25 = r10
            r10 = 0
            r23 = 0
        L_0x0141:
            if (r10 >= r12) goto L_0x0153
            boolean r18 = r13.q(r10, r6)
            if (r18 == 0) goto L_0x014e
            r18 = 1
            int r23 = r23 + 1
            goto L_0x0150
        L_0x014e:
            r18 = 1
        L_0x0150:
            int r10 = r10 + 1
            goto L_0x0141
        L_0x0153:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r7 = 0
        L_0x0159:
            int r10 = r1.size()
            if (r7 >= r10) goto L_0x0171
            java.lang.Object r10 = r1.get(r7)
            hj0 r10 = (defpackage.hj0) r10
            int r10 = r10.c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.add(r10)
            r10 = 1
            int r7 = r7 + r10
            goto L_0x0159
        L_0x0171:
            int r20 = r6.size()
            nv4 r6 = new nv4
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.ArrayList r1 = r14.l(r1)
            r10 = 0
        L_0x0181:
            int r13 = r1.size()
            if (r10 >= r13) goto L_0x0199
            java.lang.Object r13 = r1.get(r10)
            hj0 r13 = (defpackage.hj0) r13
            int r13 = r13.c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r7.add(r13)
            r13 = 1
            int r10 = r10 + r13
            goto L_0x0181
        L_0x0199:
            int r1 = r7.size()
            int r21 = r20 - r1
            r24 = 2
            r19 = r6
            r22 = r12
            r19.<init>(r20, r21, r22, r23, r24)
            r1 = 2
            boolean r7 = r6.a(r1)
            if (r7 != 0) goto L_0x01b8
            r7 = 1
            boolean r10 = r6.a(r7)
            if (r10 != 0) goto L_0x01b8
            goto L_0x0058
        L_0x01b8:
            r11.getClass()
            sz0 r7 = defpackage.mk9.i(r6, r8)
            if (r7 == 0) goto L_0x0058
            int r10 = r7.b
            boolean r6 = r6.a(r10)
            if (r6 != 0) goto L_0x01cb
            goto L_0x0058
        L_0x01cb:
            long r6 = r7.c
            if (r10 != r1) goto L_0x01da
            g55 r1 = r9.j
            int r4 = r1.s(r4)
            boolean r1 = r1.u(r4, r6)
            goto L_0x0234
        L_0x01da:
            r1 = 1
            if (r10 != r1) goto L_0x0058
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 + r6
            java.lang.String r1 = r15.b
            java.lang.Object r4 = r14.a
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r1)
            if (r6 == 0) goto L_0x01ff
            java.lang.Object r6 = r4.get(r1)
            java.lang.Long r6 = (java.lang.Long) r6
            int r7 = defpackage.oze.a
            long r6 = r6.longValue()
            long r6 = java.lang.Math.max(r9, r6)
            goto L_0x0200
        L_0x01ff:
            r6 = r9
        L_0x0200:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.put(r1, r6)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r15.c
            if (r4 == r1) goto L_0x00a5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r14.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r1)
            if (r6 == 0) goto L_0x022b
            java.lang.Object r6 = r4.get(r1)
            java.lang.Long r6 = (java.lang.Long) r6
            int r7 = defpackage.oze.a
            long r6 = r6.longValue()
            long r9 = java.lang.Math.max(r9, r6)
        L_0x022b:
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r4.put(r1, r6)
            goto L_0x00a5
        L_0x0234:
            r12 = 0
            if (r1 == 0) goto L_0x025b
            if (r3 == 0) goto L_0x0256
            if (r5 == 0) goto L_0x0253
            r7 = r17
            uh0 r1 = r0.n(r7)
            if (r1 != r2) goto L_0x0245
            r1 = 1
            goto L_0x0246
        L_0x0245:
            r1 = 0
        L_0x0246:
            defpackage.oyb.k(r1)
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x0253
            long r3 = r0.I0
            r0.H0 = r3
        L_0x0253:
            sz0 r1 = ul7.X
            goto L_0x025c
        L_0x0256:
            java.lang.String r1 = "Ignoring attempt to cancel non-cancelable load."
            defpackage.ez3.j0(r1)
        L_0x025b:
            r1 = r12
        L_0x025c:
            if (r1 != 0) goto L_0x027e
            r11.getClass()
            long r14 = defpackage.mk9.m(r8)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x027c
            sz0 r1 = new sz0
            r17 = 5
            r18 = 0
            r13 = r1
            r3 = 0
            r16 = r3
            r13.<init>(r14, r16, r17, r18)
            goto L_0x027e
        L_0x027c:
            sz0 r1 = ul7.Y
        L_0x027e:
            r14 = r1
            boolean r1 = r14.a()
            r3 = 1
            r15 = r1 ^ 1
            long r8 = r2.Z
            long r6 = r2.w0
            jn r1 = r0.Z
            int r3 = r2.c
            int r4 = r0.a
            xu5 r5 = r2.o
            int r10 = r2.X
            java.lang.Object r13 = r2.Y
            r2 = r25
            r16 = r6
            r6 = r10
            r7 = r13
            r18 = r11
            r10 = r16
            r13 = r12
            r12 = r32
            r27 = r14
            r14 = r13
            r13 = r15
            r1.B(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r15 == 0) goto L_0x02b6
            r0.E0 = r14
            r18.getClass()
            iyc r1 = r0.Y
            r1.j(r0)
        L_0x02b6:
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy2.U(gj7, long, long, java.io.IOException, int):sz0");
    }

    public final void a() {
        wjc wjc = this.B0;
        wjc.y(true);
        zn4 zn4 = wjc.h;
        if (zn4 != null) {
            zn4.f(wjc.e);
            wjc.h = null;
            wjc.g = null;
        }
        for (wjc wjc2 : this.C0) {
            wjc2.y(true);
            zn4 zn42 = wjc2.h;
            if (zn42 != null) {
                zn42.f(wjc2.e);
                wjc2.h = null;
                wjc2.g = null;
            }
        }
        for (a64 a64 : this.X.i) {
            ay2 ay2 = (ay2) a64.d;
            if (ay2 != null) {
                ((qt0) ay2).c();
            }
        }
        hy2 hy2 = this.G0;
        if (hy2 != null) {
            my3 my3 = (my3) hy2;
            synchronized (my3) {
                wya wya = (wya) my3.C0.remove(this);
                if (wya != null) {
                    wjc wjc3 = wya.a;
                    wjc3.y(true);
                    zn4 zn43 = wjc3.h;
                    if (zn43 != null) {
                        zn43.f(wjc3.e);
                        wjc3.h = null;
                        wjc3.g = null;
                    }
                }
            }
        }
    }

    public final boolean b() {
        return this.x0.A();
    }

    public final void c() {
        ul7 ul7 = this.x0;
        ul7.c();
        this.B0.u();
        if (!ul7.A()) {
            e64 e64 = this.X;
            BehindLiveWindowException behindLiveWindowException = e64.m;
            if (behindLiveWindowException == null) {
                e64.a.c();
                return;
            }
            throw behindLiveWindowException;
        }
    }

    public final boolean d() {
        return !w() && this.B0.s(this.L0);
    }

    public final int e(long j) {
        if (w()) {
            return 0;
        }
        wjc wjc = this.B0;
        int p = wjc.p(j, this.L0);
        uh0 uh0 = this.K0;
        if (uh0 != null) {
            p = Math.min(p, uh0.d(0) - wjc.n());
        }
        wjc.B(p);
        y();
        return p;
    }

    public final long f() {
        if (w()) {
            return this.H0;
        }
        if (this.L0) {
            return Long.MIN_VALUE;
        }
        return t().w0;
    }

    public final int j(qe4 qe4, n24 n24, int i) {
        if (w()) {
            return -3;
        }
        uh0 uh0 = this.K0;
        wjc wjc = this.B0;
        if (uh0 != null && uh0.d(0) <= wjc.n()) {
            return -3;
        }
        y();
        return wjc.x(qe4, n24, i, this.L0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r41v3, types: [np3] */
    /* JADX WARNING: type inference failed for: r41v4, types: [hid] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0196 A[EDGE_INSN: B:202:0x0196->B:66:0x0196 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(defpackage.qj7 r64) {
        /*
            r63 = this;
            r0 = r63
            boolean r1 = r0.L0
            if (r1 != 0) goto L_0x0014
            ul7 r1 = r0.x0
            boolean r3 = r1.A()
            if (r3 != 0) goto L_0x0014
            boolean r3 = r1.w()
            if (r3 == 0) goto L_0x0017
        L_0x0014:
            r0 = 0
            goto L_0x04ec
        L_0x0017:
            boolean r3 = r63.w()
            if (r3 == 0) goto L_0x0024
            java.util.List r4 = java.util.Collections.emptyList()
            long r5 = r0.H0
            goto L_0x002c
        L_0x0024:
            uh0 r4 = r63.t()
            long r5 = r4.w0
            java.util.List r4 = r0.A0
        L_0x002c:
            e64 r15 = r0.X
            androidx.media3.exoplayer.source.BehindLiveWindowException r7 = r15.m
            xp0 r11 = r0.y0
            if (r7 == 0) goto L_0x003b
            r38 = r1
            r17 = r3
            r0 = r11
            goto L_0x043d
        L_0x003b:
            r7 = r64
            long r8 = r7.a
            long r16 = r5 - r8
            ey3 r7 = r15.k
            r19 = r11
            long r10 = r7.a
            long r10 = defpackage.oze.S(r10)
            ey3 r7 = r15.k
            int r2 = r15.l
            wma r2 = r7.b(r2)
            long r12 = r2.b
            long r12 = defpackage.oze.S(r12)
            long r12 = r12 + r10
            long r12 = r12 + r5
            wya r2 = r15.h
            if (r2 == 0) goto L_0x00e2
            xya r2 = r2.e
            java.lang.Object r7 = r2.y0
            ey3 r7 = (defpackage.ey3) r7
            boolean r10 = r7.d
            if (r10 != 0) goto L_0x006d
            r23 = r15
            r14 = 0
            goto L_0x00d5
        L_0x006d:
            boolean r10 = r2.X
            if (r10 == 0) goto L_0x0075
            r23 = r15
            r14 = 1
            goto L_0x00d5
        L_0x0075:
            java.util.TreeMap r10 = r2.c
            r23 = r15
            long r14 = r7.h
            java.lang.Long r7 = java.lang.Long.valueOf(r14)
            java.util.Map$Entry r7 = r10.ceilingEntry(r7)
            java.lang.Object r10 = r2.w0
            u5g r10 = (defpackage.u5g) r10
            if (r7 == 0) goto L_0x00b8
            java.lang.Object r11 = r7.getValue()
            java.lang.Long r11 = (java.lang.Long) r11
            long r14 = r11.longValue()
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x00b8
            java.lang.Object r7 = r7.getKey()
            java.lang.Long r7 = (java.lang.Long) r7
            long r11 = r7.longValue()
            java.lang.Object r7 = r10.b
            uy3 r7 = (defpackage.uy3) r7
            long r13 = r7.N
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r15 == 0) goto L_0x00b4
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x00b6
        L_0x00b4:
            r7.N = r11
        L_0x00b6:
            r7 = 1
            goto L_0x00b9
        L_0x00b8:
            r7 = 0
        L_0x00b9:
            if (r7 == 0) goto L_0x00d4
            boolean r11 = r2.o
            if (r11 != 0) goto L_0x00c0
            goto L_0x00d4
        L_0x00c0:
            r11 = 1
            r2.X = r11
            r11 = 0
            r2.o = r11
            java.lang.Object r2 = r10.b
            uy3 r2 = (defpackage.uy3) r2
            android.os.Handler r10 = r2.D
            oy3 r11 = r2.w
            r10.removeCallbacks(r11)
            r2.z()
        L_0x00d4:
            r14 = r7
        L_0x00d5:
            if (r14 == 0) goto L_0x00df
            r38 = r1
        L_0x00d9:
            r17 = r3
            r0 = r19
            goto L_0x043d
        L_0x00df:
            r2 = r23
            goto L_0x00e3
        L_0x00e2:
            r2 = r15
        L_0x00e3:
            long r10 = r2.f
            long r10 = defpackage.oze.B(r10)
            long r14 = defpackage.oze.S(r10)
            ey3 r7 = r2.k
            long r10 = r7.a
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r23 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r23 != 0) goto L_0x0100
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0110
        L_0x0100:
            int r12 = r2.l
            wma r7 = r7.b(r12)
            long r12 = r7.b
            long r10 = r10 + r12
            long r10 = defpackage.oze.S(r10)
            long r10 = r14 - r10
            r12 = r10
        L_0x0110:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x011b
            r23 = 1
            r24 = 0
            goto L_0x012b
        L_0x011b:
            int r7 = r4.size()
            r23 = 1
            int r7 = r7 + -1
            java.lang.Object r7 = r4.get(r7)
            y18 r7 = (defpackage.y18) r7
            r24 = r7
        L_0x012b:
            g55 r7 = r2.j
            int r7 = r7.length()
            a28[] r10 = new defpackage.a28[r7]
            r25 = r12
            r11 = 0
        L_0x0136:
            a64[] r12 = r2.i
            if (r11 >= r7) goto L_0x0196
            r12 = r12[r11]
            java.lang.Object r13 = r12.g
            wy3 r13 = (defpackage.wy3) r13
            qr4 r27 = defpackage.a28.P
            if (r13 != 0) goto L_0x0149
            r10[r11] = r27
            r38 = r1
            goto L_0x018f
        L_0x0149:
            long r34 = r12.c(r14)
            long r36 = r12.d(r14)
            if (r24 == 0) goto L_0x015c
            long r12 = r24.b()
            r38 = r1
            r30 = r12
            goto L_0x0179
        L_0x015c:
            java.lang.Object r13 = r12.g
            wy3 r13 = (defpackage.wy3) r13
            defpackage.oyb.l(r13)
            r38 = r1
            long r0 = r12.b
            long r0 = r13.v(r5, r0)
            long r12 = r12.c
            long r28 = r0 + r12
            r30 = r34
            r32 = r36
            long r0 = defpackage.oze.k(r28, r30, r32)
            r30 = r0
        L_0x0179:
            int r0 = (r30 > r34 ? 1 : (r30 == r34 ? 0 : -1))
            if (r0 >= 0) goto L_0x0180
            r10[r11] = r27
            goto L_0x018f
        L_0x0180:
            a64 r29 = r2.b(r11)
            c64 r0 = new c64
            r28 = r0
            r32 = r36
            r28.<init>(r29, r30, r32)
            r10[r11] = r0
        L_0x018f:
            int r11 = r11 + 1
            r0 = r63
            r1 = r38
            goto L_0x0136
        L_0x0196:
            r38 = r1
            ey3 r0 = r2.k
            boolean r0 = r0.d
            r27 = r5
            r5 = 0
            if (r0 == 0) goto L_0x01ad
            r0 = 0
            r1 = r12[r0]
            long r29 = r1.e()
            int r1 = (r29 > r5 ? 1 : (r29 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x01b3
        L_0x01ad:
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01eb
        L_0x01b3:
            r1 = r12[r0]
            long r5 = r1.d(r14)
            r1 = r12[r0]
            long r0 = r1.f(r5)
            ey3 r5 = r2.k
            long r6 = r5.a
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r11 != 0) goto L_0x01cf
            r5 = r21
            goto L_0x01de
        L_0x01cf:
            int r11 = r2.l
            wma r5 = r5.b(r11)
            long r11 = r5.b
            long r6 = r6 + r11
            long r5 = defpackage.oze.S(r6)
            long r5 = r14 - r5
        L_0x01de:
            long r0 = java.lang.Math.min(r5, r0)
            long r0 = r0 - r8
            r5 = 0
            long r0 = java.lang.Math.max(r5, r0)
            r12 = r0
            goto L_0x01ed
        L_0x01eb:
            r12 = r21
        L_0x01ed:
            g55 r7 = r2.j
            r5 = r10
            r1 = r19
            r0 = 0
            r10 = r16
            r39 = r25
            r41 = r14
            r6 = r23
            r14 = r4
            r15 = r5
            r7.r(r8, r10, r12, r14, r15)
            g55 r5 = r2.j
            int r5 = r5.b()
            android.os.SystemClock.elapsedRealtime()
            a64 r5 = r2.b(r5)
            java.lang.Object r7 = r5.g
            wy3 r7 = (defpackage.wy3) r7
            java.lang.Object r8 = r5.f
            hj0 r8 = (defpackage.hj0) r8
            java.lang.Object r9 = r5.d
            ay2 r9 = (defpackage.ay2) r9
            java.lang.Object r10 = r5.e
            kac r10 = (defpackage.kac) r10
            if (r9 == 0) goto L_0x0275
            r11 = r9
            qt0 r11 = (defpackage.qt0) r11
            xu5[] r11 = r11.x0
            if (r11 != 0) goto L_0x0229
            nxb r11 = r10.X
            goto L_0x022a
        L_0x0229:
            r11 = r0
        L_0x022a:
            if (r7 != 0) goto L_0x0231
            nxb r12 = r10.d()
            goto L_0x0232
        L_0x0231:
            r12 = r0
        L_0x0232:
            if (r11 != 0) goto L_0x0236
            if (r12 == 0) goto L_0x0275
        L_0x0236:
            g55 r4 = r2.j
            xu5 r16 = r4.j()
            g55 r4 = r2.j
            int r17 = r4.k()
            g55 r4 = r2.j
            java.lang.Object r18 = r4.m()
            if (r11 == 0) goto L_0x0255
            java.lang.String r4 = r8.a
            nxb r4 = r11.a(r12, r4)
            if (r4 != 0) goto L_0x0253
            goto L_0x0259
        L_0x0253:
            r11 = r4
            goto L_0x0259
        L_0x0255:
            r12.getClass()
            r11 = r12
        L_0x0259:
            java.lang.String r4 = r8.a
            r7 = 0
            yz3 r15 = pa2.f(r10, r4, r11, r7)
            qw6 r4 = new qw6
            java.lang.Object r5 = r5.d
            r19 = r5
            ay2 r19 = (defpackage.ay2) r19
            qz3 r14 = r2.e
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.b = r4
        L_0x0270:
            r0 = r1
            r17 = r3
            goto L_0x043d
        L_0x0275:
            ey3 r11 = r2.k
            boolean r12 = r11.d
            if (r12 == 0) goto L_0x0288
            int r12 = r2.l
            java.util.List r11 = r11.m
            int r11 = r11.size()
            int r11 = r11 - r6
            if (r12 != r11) goto L_0x0288
            r14 = r6
            goto L_0x0289
        L_0x0288:
            r14 = 0
        L_0x0289:
            long r12 = r5.b
            r64 = r7
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x029b
            int r15 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            r15 = 0
            goto L_0x029c
        L_0x029b:
            r15 = 1
        L_0x029c:
            long r16 = r5.e()
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 != 0) goto L_0x02a9
            r1.a = r15
            goto L_0x0270
        L_0x02a9:
            r6 = r41
            long r16 = r5.c(r6)
            long r6 = r5.d(r6)
            if (r14 == 0) goto L_0x02c9
            long r18 = r5.f(r6)
            long r21 = r5.g(r6)
            long r21 = r18 - r21
            long r21 = r21 + r18
            int r14 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x02c7
            r14 = 1
            goto L_0x02c8
        L_0x02c7:
            r14 = 0
        L_0x02c8:
            r15 = r15 & r14
        L_0x02c9:
            r19 = r1
            long r0 = r5.c
            if (r24 == 0) goto L_0x02da
            long r21 = r24.b()
            r14 = r64
            r64 = r10
        L_0x02d7:
            r10 = r21
            goto L_0x02f4
        L_0x02da:
            defpackage.oyb.l(r64)
            r14 = r64
            r64 = r10
            r10 = r27
            long r21 = r14.v(r10, r12)
            long r29 = r21 + r0
            r31 = r16
            r33 = r6
            long r21 = defpackage.oze.k(r29, r31, r33)
            r27 = r10
            goto L_0x02d7
        L_0x02f4:
            int r16 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r16 >= 0) goto L_0x0301
            androidx.media3.exoplayer.source.BehindLiveWindowException r0 = new androidx.media3.exoplayer.source.BehindLiveWindowException
            r0.<init>()
            r2.m = r0
            goto L_0x00d9
        L_0x0301:
            int r16 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            r17 = r3
            if (r16 > 0) goto L_0x030d
            boolean r3 = r2.n
            if (r3 == 0) goto L_0x0311
            if (r16 < 0) goto L_0x0311
        L_0x030d:
            r0 = r19
            goto L_0x043b
        L_0x0311:
            if (r15 == 0) goto L_0x0323
            long r15 = r5.g(r10)
            int r3 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r3 < 0) goto L_0x0323
            r15 = r19
            r3 = 1
            r15.a = r3
            r0 = r15
            goto L_0x043d
        L_0x0323:
            r15 = r19
            int r3 = r2.g
            r19 = r8
            r16 = r9
            long r8 = (long) r3
            long r6 = r6 - r10
            r21 = 1
            long r6 = r6 + r21
            long r6 = java.lang.Math.min(r8, r6)
            int r3 = (int) r6
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0351
        L_0x033f:
            r6 = 1
            if (r3 <= r6) goto L_0x0351
            long r6 = (long) r3
            long r6 = r6 + r10
            long r6 = r6 - r21
            long r6 = r5.g(r6)
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x0351
            int r3 = r3 + -1
            goto L_0x033f
        L_0x0351:
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x035a
            r51 = r27
            goto L_0x035f
        L_0x035a:
            r51 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x035f:
            g55 r4 = r2.j
            xu5 r4 = r4.j()
            g55 r6 = r2.j
            int r45 = r6.k()
            g55 r6 = r2.j
            java.lang.Object r46 = r6.m()
            long r47 = r5.g(r10)
            defpackage.oyb.l(r14)
            long r6 = r10 - r0
            nxb r6 = r14.p(r6)
            qz3 r7 = r2.e
            if (r16 != 0) goto L_0x03b4
            long r49 = r5.f(r10)
            r0 = r39
            boolean r0 = r5.h(r10, r0)
            if (r0 == 0) goto L_0x0392
            r0 = r19
            r9 = 0
            goto L_0x0396
        L_0x0392:
            r0 = r19
            r9 = 8
        L_0x0396:
            java.lang.String r0 = r0.a
            r1 = r64
            yz3 r43 = pa2.f(r1, r0, r6, r9)
            hid r0 = new hid
            int r1 = r2.d
            r41 = r0
            r42 = r7
            r44 = r4
            r51 = r10
            r53 = r1
            r54 = r4
            r41.<init>(r42, r43, r44, r45, r46, r47, r49, r51, r53, r54)
            r1 = r15
            goto L_0x0437
        L_0x03b4:
            r9 = r64
            r2 = r19
            r61 = r39
            r16 = r7
            r19 = r15
            r7 = 1
            r15 = 1
        L_0x03c0:
            if (r15 >= r3) goto L_0x03e3
            r25 = r3
            r23 = r4
            long r3 = (long) r15
            long r3 = r3 + r10
            defpackage.oyb.l(r14)
            long r3 = r3 - r0
            nxb r3 = r14.p(r3)
            java.lang.String r4 = r2.a
            nxb r3 = r6.a(r3, r4)
            if (r3 != 0) goto L_0x03d9
            goto L_0x03e5
        L_0x03d9:
            int r7 = r7 + 1
            int r15 = r15 + 1
            r6 = r3
            r4 = r23
            r3 = r25
            goto L_0x03c0
        L_0x03e3:
            r23 = r4
        L_0x03e5:
            long r0 = (long) r7
            long r0 = r0 + r10
            long r0 = r0 - r21
            long r49 = r5.f(r0)
            if (r8 == 0) goto L_0x03f8
            int r3 = (r12 > r49 ? 1 : (r12 == r49 ? 0 : -1))
            if (r3 > 0) goto L_0x03f8
            r53 = r12
            r3 = r61
            goto L_0x03ff
        L_0x03f8:
            r3 = r61
            r53 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x03ff:
            boolean r0 = r5.h(r0, r3)
            if (r0 == 0) goto L_0x0407
            r0 = 0
            goto L_0x0409
        L_0x0407:
            r0 = 8
        L_0x0409:
            java.lang.String r1 = r2.a
            yz3 r43 = pa2.f(r9, r1, r6, r0)
            long r0 = r9.c
            long r0 = -r0
            r2 = r23
            java.lang.String r3 = r2.n
            boolean r3 = defpackage.c49.i(r3)
            if (r3 == 0) goto L_0x041e
            long r0 = r0 + r47
        L_0x041e:
            r58 = r0
            np3 r0 = new np3
            r41 = r0
            java.lang.Object r1 = r5.d
            r60 = r1
            ay2 r60 = (defpackage.ay2) r60
            r42 = r16
            r44 = r2
            r55 = r10
            r57 = r7
            r41.<init>(r42, r43, r44, r45, r46, r47, r49, r51, r53, r55, r57, r58, r60)
            r1 = r19
        L_0x0437:
            r1.b = r0
            r0 = r1
            goto L_0x043d
        L_0x043b:
            r0.a = r15
        L_0x043d:
            boolean r1 = r0.a
            java.lang.Object r2 = r0.b
            zx2 r2 = (defpackage.zx2) r2
            r3 = 0
            r0.b = r3
            r3 = 0
            r0.a = r3
            if (r1 == 0) goto L_0x0458
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r63
            r0.H0 = r4
            r1 = 1
            r0.L0 = r1
            return r1
        L_0x0458:
            r0 = r63
            if (r2 != 0) goto L_0x045d
            return r3
        L_0x045d:
            r0.E0 = r2
            boolean r1 = r2 instanceof defpackage.uh0
            otf r3 = r0.D0
            if (r1 == 0) goto L_0x04ad
            r1 = r2
            uh0 r1 = (defpackage.uh0) r1
            if (r17 == 0) goto L_0x048c
            long r4 = r0.H0
            long r6 = r1.Z
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0485
            wjc r6 = r0.B0
            r6.t = r4
            wjc[] r4 = r0.C0
            int r5 = r4.length
            r6 = 0
        L_0x047a:
            if (r6 >= r5) goto L_0x0485
            r7 = r4[r6]
            long r8 = r0.H0
            r7.t = r8
            int r6 = r6 + 1
            goto L_0x047a
        L_0x0485:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.H0 = r4
        L_0x048c:
            r1.B0 = r3
            java.lang.Object r3 = r3.b
            wjc[] r3 = (defpackage.wjc[]) r3
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
        L_0x0496:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x04a5
            r6 = r3[r5]
            int r7 = r6.q
            int r6 = r6.p
            int r7 = r7 + r6
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x0496
        L_0x04a5:
            r1.C0 = r4
            java.util.ArrayList r3 = r0.z0
            r3.add(r1)
            goto L_0x04b6
        L_0x04ad:
            boolean r1 = r2 instanceof defpackage.qw6
            if (r1 == 0) goto L_0x04b6
            r1 = r2
            qw6 r1 = (defpackage.qw6) r1
            r1.z0 = r3
        L_0x04b6:
            mk9 r1 = r0.w0
            int r3 = r2.c
            int r1 = r1.k(r3)
            r3 = r38
            long r8 = r3.F(r2, r0, r1)
            yi7 r13 = new yi7
            long r5 = r2.a
            yz3 r7 = r2.b
            r4 = r13
            r4.<init>(r5, r7, r8)
            int r1 = r2.X
            java.lang.Object r3 = r2.Y
            jn r12 = r0.Z
            int r14 = r2.c
            int r15 = r0.a
            xu5 r0 = r2.o
            long r4 = r2.Z
            long r6 = r2.w0
            r16 = r0
            r17 = r1
            r18 = r3
            r19 = r4
            r21 = r6
            r12.F(r13, r14, r15, r16, r17, r18, r19, r21)
            r0 = 1
        L_0x04ec:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy2.m(qj7):boolean");
    }

    public final uh0 n(int i) {
        ArrayList arrayList = this.z0;
        uh0 uh0 = (uh0) arrayList.get(i);
        oze.X(arrayList, i, arrayList.size());
        this.J0 = Math.max(this.J0, arrayList.size());
        int i2 = 0;
        this.B0.j(uh0.d(0));
        while (true) {
            wjc[] wjcArr = this.C0;
            if (i2 >= wjcArr.length) {
                return uh0;
            }
            wjc wjc = wjcArr[i2];
            i2++;
            wjc.j(uh0.d(i2));
        }
    }

    public final e64 q() {
        return this.X;
    }

    public final long r() {
        long j;
        if (this.L0) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.H0;
        }
        long j2 = this.I0;
        uh0 t = t();
        if (!t.c()) {
            ArrayList arrayList = this.z0;
            t = arrayList.size() > 1 ? (uh0) rf0.e(arrayList, 2) : null;
        }
        if (t != null) {
            j2 = Math.max(j2, t.w0);
        }
        wjc wjc = this.B0;
        synchronized (wjc) {
            j = wjc.v;
        }
        return Math.max(j2, j);
    }

    public final uh0 t() {
        return (uh0) rf0.e(this.z0, 1);
    }

    public final void u(long j) {
        ul7 ul7 = this.x0;
        if (!ul7.w() && !w()) {
            boolean A = ul7.A();
            ArrayList arrayList = this.z0;
            boolean z = false;
            List list = this.A0;
            e64 e64 = this.X;
            if (A) {
                zx2 zx2 = this.E0;
                zx2.getClass();
                boolean z2 = zx2 instanceof uh0;
                if (!z2 || !v(arrayList.size() - 1)) {
                    if (e64.m == null) {
                        z = e64.j.t(j, zx2, list);
                    }
                    if (z) {
                        ul7.s();
                        if (z2) {
                            this.K0 = (uh0) zx2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int size = (e64.m != null || e64.j.length() < 2) ? list.size() : e64.j.g(j, list);
            if (size < arrayList.size()) {
                oyb.k(!ul7.A());
                int size2 = arrayList.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!v(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size != -1) {
                    long j2 = t().w0;
                    uh0 n = n(size);
                    if (arrayList.isEmpty()) {
                        this.H0 = this.I0;
                    }
                    this.L0 = false;
                    jn jnVar = this.Z;
                    jnVar.getClass();
                    jnVar.P(new i78(1, this.a, (Object) null, 3, (Object) null, oze.h0(n.Z), oze.h0(j2)));
                }
            }
        }
    }

    public final boolean v(int i) {
        int n;
        uh0 uh0 = (uh0) this.z0.get(i);
        if (this.B0.n() > uh0.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            wjc[] wjcArr = this.C0;
            if (i2 >= wjcArr.length) {
                return false;
            }
            n = wjcArr[i2].n();
            i2++;
        } while (n <= uh0.d(i2));
        return true;
    }

    public final boolean w() {
        return this.H0 != -9223372036854775807L;
    }

    public final void x(gj7 gj7, long j, long j2, boolean z) {
        zx2 zx2 = (zx2) gj7;
        this.E0 = null;
        this.K0 = null;
        long j3 = zx2.a;
        Uri uri = zx2.x0.c;
        yi7 yi7 = new yi7(j2);
        this.w0.getClass();
        this.Z.x(yi7, zx2.c, this.a, zx2.o, zx2.X, zx2.Y, zx2.Z, zx2.w0);
        if (!z) {
            if (w()) {
                this.B0.y(false);
                for (wjc y : this.C0) {
                    y.y(false);
                }
            } else if (zx2 instanceof uh0) {
                ArrayList arrayList = this.z0;
                n(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.H0 = this.I0;
                }
            }
            this.Y.j(this);
        }
    }

    public final void y() {
        int z = z(this.B0.n(), this.J0 - 1);
        while (true) {
            int i = this.J0;
            if (i <= z) {
                this.J0 = i + 1;
                uh0 uh0 = (uh0) this.z0.get(i);
                xu5 xu5 = uh0.o;
                if (!xu5.equals(this.F0)) {
                    xu5 xu52 = xu5;
                    this.Z.n(this.a, xu52, uh0.X, uh0.Y, uh0.Z);
                }
                this.F0 = xu5;
            } else {
                return;
            }
        }
    }

    public final int z(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.z0;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((uh0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }
}
