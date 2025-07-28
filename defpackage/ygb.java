package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ygb  reason: default package */
public final class ygb implements s88, i75, dj7, ij7, ujc {
    public static final Map d1;
    public static final xu5 e1;
    public final ul7 A0 = new ul7("ProgressiveMediaPeriod", 1);
    public final ul7 B0;
    public final ga3 C0;
    public final pgb D0;
    public final pgb E0;
    public final Handler F0;
    public q88 G0;
    public po6 H0;
    public wjc[] I0;
    public wgb[] J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public nxc O0;
    public vtc P0;
    public long Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public int V0;
    public boolean W0;
    public final jn X;
    public long X0;
    public final fo4 Y;
    public long Y0;
    public final dhb Z;
    public boolean Z0;
    public final Uri a;
    public int a1;
    public final qz3 b;
    public boolean b1;
    public final no4 c;
    public boolean c1;
    public final mk9 o;
    public final l34 w0;
    public final String x0;
    public final long y0;
    public final long z0;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        d1 = Collections.unmodifiableMap(hashMap);
        uu5 uu5 = new uu5();
        uu5.a = "icy";
        uu5.m = c49.l("application/x-icy");
        e1 = uu5.a();
    }

    public ygb(Uri uri, qz3 qz3, ul7 ul7, no4 no4, fo4 fo4, mk9 mk9, jn jnVar, dhb dhb, l34 l34, String str, int i, long j) {
        this.a = uri;
        this.b = qz3;
        this.c = no4;
        this.Y = fo4;
        this.o = mk9;
        this.X = jnVar;
        this.Z = dhb;
        this.w0 = l34;
        this.x0 = str;
        this.y0 = (long) i;
        this.B0 = ul7;
        this.z0 = j;
        this.C0 = new ga3(false, 1);
        this.D0 = new pgb(this, 1);
        this.E0 = new pgb(this, 2);
        this.F0 = oze.o((Handler.Callback) null);
        this.J0 = new wgb[0];
        this.I0 = new wjc[0];
        this.Y0 = -9223372036854775807L;
        this.S0 = 1;
    }

    public final boolean A() {
        return this.U0 || n();
    }

    public final bpe B(int i, int i2) {
        return y(new wgb(i, false));
    }

    public final void E(gj7 gj7, long j, long j2) {
        vtc vtc;
        sgb sgb = (sgb) gj7;
        if (this.Q0 == -9223372036854775807L && (vtc = this.P0) != null) {
            boolean c2 = vtc.c();
            long j3 = j(true);
            long j4 = j3 == Long.MIN_VALUE ? 0 : j3 + WorkRequest.MIN_BACKOFF_MILLIS;
            this.Q0 = j4;
            this.Z.v(j4, c2, this.R0);
        }
        Uri uri = sgb.c.c;
        yi7 yi7 = new yi7(j2);
        this.o.getClass();
        this.X.z(yi7, 1, -1, (xu5) null, 0, (Object) null, sgb.y0, this.Q0);
        this.b1 = true;
        q88 q88 = this.G0;
        q88.getClass();
        q88.j(this);
    }

    public final void M(vtc vtc) {
        this.F0.post(new hg9(this, 24, vtc));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sz0 U(defpackage.gj7 r19, long r20, long r22, java.io.IOException r24, int r25) {
        /*
            r18 = this;
            r0 = r18
            r11 = r24
            r1 = 1
            r2 = r19
            sgb r2 = (defpackage.sgb) r2
            fsd r3 = r2.c
            yi7 r4 = new yi7
            android.net.Uri r3 = r3.c
            r5 = r22
            r4.<init>(r5)
            int r3 = defpackage.oze.a
            mk9 r3 = r0.o
            r3.getClass()
            boolean r3 = r11 instanceof androidx.media3.common.ParserException
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x0055
            boolean r3 = r11 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L_0x0055
            boolean r3 = r11 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r3 != 0) goto L_0x0055
            boolean r3 = r11 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r3 != 0) goto L_0x0055
            int r3 = androidx.media3.datasource.DataSourceException.b
            r3 = r11
        L_0x0033:
            if (r3 == 0) goto L_0x0048
            boolean r7 = r3 instanceof androidx.media3.datasource.DataSourceException
            if (r7 == 0) goto L_0x0043
            r7 = r3
            androidx.media3.datasource.DataSourceException r7 = (androidx.media3.datasource.DataSourceException) r7
            int r7 = r7.a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x0043
            goto L_0x0055
        L_0x0043:
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x0033
        L_0x0048:
            int r3 = r25 + -1
            int r3 = r3 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r7)
            long r7 = (long) r3
            r13 = r7
            goto L_0x0056
        L_0x0055:
            r13 = r5
        L_0x0056:
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x005e
            sz0 r3 = ul7.Y
        L_0x005c:
            r13 = r3
            goto L_0x00b9
        L_0x005e:
            int r3 = r18.e()
            int r7 = r0.a1
            r8 = 0
            if (r3 <= r7) goto L_0x0069
            r15 = r1
            goto L_0x006a
        L_0x0069:
            r15 = r8
        L_0x006a:
            boolean r7 = r0.W0
            if (r7 != 0) goto L_0x00ac
            vtc r7 = r0.P0
            if (r7 == 0) goto L_0x007b
            long r9 = r7.f()
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x007b
            goto L_0x00ac
        L_0x007b:
            boolean r3 = r0.L0
            if (r3 == 0) goto L_0x008a
            boolean r3 = r18.A()
            if (r3 != 0) goto L_0x008a
            r0.Z0 = r1
            sz0 r3 = ul7.X
            goto L_0x005c
        L_0x008a:
            boolean r3 = r0.L0
            r0.U0 = r3
            r5 = 0
            r0.X0 = r5
            r0.a1 = r8
            wjc[] r3 = r0.I0
            int r7 = r3.length
            r9 = r8
        L_0x0098:
            if (r9 >= r7) goto L_0x00a1
            r10 = r3[r9]
            r10.y(r8)
            int r9 = r9 + r1
            goto L_0x0098
        L_0x00a1:
            le4 r3 = r2.Z
            r3.a = r5
            r2.y0 = r5
            r2.x0 = r1
            r2.B0 = r8
            goto L_0x00ae
        L_0x00ac:
            r0.a1 = r3
        L_0x00ae:
            sz0 r3 = new sz0
            r16 = 5
            r17 = 0
            r12 = r3
            r12.<init>(r13, r15, r16, r17)
            goto L_0x005c
        L_0x00b9:
            boolean r3 = r13.a()
            r12 = r3 ^ 1
            long r7 = r2.y0
            long r9 = r0.Q0
            r3 = -1
            r5 = 0
            jn r0 = r0.X
            r2 = 1
            r6 = 0
            r14 = 0
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            r11 = r24
            r0.B(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygb.U(gj7, long, long, java.io.IOException, int):sz0");
    }

    public final void a() {
        for (wjc wjc : this.I0) {
            wjc.y(true);
            zn4 zn4 = wjc.h;
            if (zn4 != null) {
                zn4.f(wjc.e);
                wjc.h = null;
                wjc.g = null;
            }
        }
        ul7 ul7 = this.B0;
        e75 e75 = (e75) ul7.b;
        if (e75 != null) {
            e75.release();
            ul7.b = null;
        }
        ul7.c = null;
    }

    public final boolean b() {
        return this.A0.A() && this.C0.e();
    }

    public final void c() {
        this.F0.post(this.D0);
    }

    public final void d() {
        oyb.k(this.L0);
        this.O0.getClass();
        this.P0.getClass();
    }

    public final int e() {
        int i = 0;
        for (wjc wjc : this.I0) {
            i += wjc.q + wjc.p;
        }
        return i;
    }

    public final long f() {
        return r();
    }

    public final long g(g55[] g55Arr, boolean[] zArr, yjc[] yjcArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        g55 g55;
        d();
        nxc nxc = this.O0;
        woe woe = (woe) nxc.a;
        int i = this.V0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = g55Arr.length;
            zArr3 = (boolean[]) nxc.c;
            if (i3 >= length) {
                break;
            }
            ugb ugb = yjcArr[i3];
            if (ugb != null && (g55Arr[i3] == null || !zArr[i3])) {
                int i4 = ugb.a;
                oyb.k(zArr3[i4]);
                this.V0--;
                zArr3[i4] = false;
                yjcArr[i3] = null;
            }
            i3++;
        }
        boolean z = !this.T0 ? !(j == 0 || this.N0) : i == 0;
        for (int i5 = 0; i5 < g55Arr.length; i5++) {
            if (yjcArr[i5] == null && (g55 = g55Arr[i5]) != null) {
                oyb.k(g55.length() == 1);
                oyb.k(g55.f(0) == 0);
                int b2 = woe.b(g55.a());
                oyb.k(!zArr3[b2]);
                this.V0++;
                zArr3[b2] = true;
                yjcArr[i5] = new ugb(this, b2);
                zArr2[i5] = true;
                if (!z) {
                    wjc wjc = this.I0[b2];
                    z = wjc.n() != 0 && !wjc.A(j, true);
                }
            }
        }
        if (this.V0 == 0) {
            this.Z0 = false;
            this.U0 = false;
            ul7 ul7 = this.A0;
            if (ul7.A()) {
                wjc[] wjcArr = this.I0;
                int length2 = wjcArr.length;
                while (i2 < length2) {
                    wjcArr[i2].h();
                    i2++;
                }
                ul7.s();
            } else {
                this.b1 = false;
                for (wjc y : this.I0) {
                    y.y(false);
                }
            }
        } else if (z) {
            j = k(j);
            while (i2 < yjcArr.length) {
                if (yjcArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.T0 = true;
        return j;
    }

    public final long h(long j, xtc xtc) {
        d();
        if (!this.P0.c()) {
            return 0;
        }
        ttc e = this.P0.e(j);
        return xtc.a(j, e.a.a, e.b.a);
    }

    public final void i() {
        int k = this.o.k(this.S0);
        ul7 ul7 = this.A0;
        IOException iOException = (IOException) ul7.c;
        if (iOException == null) {
            ej7 ej7 = (ej7) ul7.b;
            if (ej7 != null) {
                if (k == Integer.MIN_VALUE) {
                    k = ej7.b;
                }
                IOException iOException2 = ej7.o;
                if (iOException2 != null && ej7.X > k) {
                    throw iOException2;
                }
            }
            if (this.b1 && !this.L0) {
                throw ParserException.a((RuntimeException) null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    public final long j(boolean z) {
        long j;
        long j2 = Long.MIN_VALUE;
        for (int i = 0; i < this.I0.length; i++) {
            if (!z) {
                nxc nxc = this.O0;
                nxc.getClass();
                if (!((boolean[]) nxc.c)[i]) {
                    continue;
                }
            }
            wjc wjc = this.I0[i];
            synchronized (wjc) {
                j = wjc.v;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long k(long r8) {
        /*
            r7 = this;
            r7.d()
            nxc r0 = r7.O0
            java.lang.Object r0 = r0.b
            boolean[] r0 = (boolean[]) r0
            vtc r1 = r7.P0
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r8 = 0
        L_0x0014:
            r1 = 0
            r7.U0 = r1
            r7.X0 = r8
            boolean r2 = r7.n()
            if (r2 == 0) goto L_0x0022
            r7.Y0 = r8
            return r8
        L_0x0022:
            int r2 = r7.S0
            r3 = 7
            ul7 r4 = r7.A0
            if (r2 == r3) goto L_0x005f
            boolean r2 = r7.b1
            if (r2 != 0) goto L_0x0033
            boolean r2 = r4.A()
            if (r2 == 0) goto L_0x005f
        L_0x0033:
            wjc[] r2 = r7.I0
            int r2 = r2.length
            r3 = r1
        L_0x0037:
            if (r3 >= r2) goto L_0x005b
            wjc[] r5 = r7.I0
            r5 = r5[r3]
            boolean r6 = r7.N0
            if (r6 == 0) goto L_0x0048
            int r6 = r5.q
            boolean r5 = r5.z(r6)
            goto L_0x004c
        L_0x0048:
            boolean r5 = r5.A(r8, r1)
        L_0x004c:
            if (r5 != 0) goto L_0x0058
            boolean r5 = r0[r3]
            if (r5 != 0) goto L_0x0056
            boolean r5 = r7.M0
            if (r5 != 0) goto L_0x0058
        L_0x0056:
            r0 = r1
            goto L_0x005c
        L_0x0058:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x005b:
            r0 = 1
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            return r8
        L_0x005f:
            r7.Z0 = r1
            r7.Y0 = r8
            r7.b1 = r1
            boolean r0 = r4.A()
            if (r0 == 0) goto L_0x007c
            wjc[] r7 = r7.I0
            int r0 = r7.length
        L_0x006e:
            if (r1 >= r0) goto L_0x0078
            r2 = r7[r1]
            r2.h()
            int r1 = r1 + 1
            goto L_0x006e
        L_0x0078:
            r4.s()
            goto L_0x008d
        L_0x007c:
            r0 = 0
            r4.c = r0
            wjc[] r7 = r7.I0
            int r0 = r7.length
            r2 = r1
        L_0x0083:
            if (r2 >= r0) goto L_0x008d
            r3 = r7[r2]
            r3.y(r1)
            int r2 = r2 + 1
            goto L_0x0083
        L_0x008d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygb.k(long):long");
    }

    public final void l(q88 q88, long j) {
        this.G0 = q88;
        this.C0.g();
        z();
    }

    public final boolean m(qj7 qj7) {
        if (this.b1) {
            return false;
        }
        ul7 ul7 = this.A0;
        if (ul7.w() || this.Z0) {
            return false;
        }
        if (this.L0 && this.V0 == 0) {
            return false;
        }
        boolean g = this.C0.g();
        if (ul7.A()) {
            return g;
        }
        z();
        return true;
    }

    public final boolean n() {
        return this.Y0 != -9223372036854775807L;
    }

    public final long o() {
        if (!this.U0) {
            return -9223372036854775807L;
        }
        if (!this.b1 && e() <= this.a1) {
            return -9223372036854775807L;
        }
        this.U0 = false;
        return this.X0;
    }

    public final woe p() {
        d();
        return (woe) this.O0.a;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [nxc, java.lang.Object] */
    public final void q() {
        long j;
        int i;
        if (!this.c1 && !this.L0 && this.K0 && this.P0 != null) {
            wjc[] wjcArr = this.I0;
            int length = wjcArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (wjcArr[i2].q() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.C0.c();
            int length2 = this.I0.length;
            uoe[] uoeArr = new uoe[length2];
            boolean[] zArr = new boolean[length2];
            int i3 = 0;
            while (true) {
                j = this.z0;
                if (i3 >= length2) {
                    break;
                }
                xu5 q = this.I0[i3].q();
                q.getClass();
                String str = q.n;
                boolean h = c49.h(str);
                boolean z = h || c49.k(str);
                zArr[i3] = z;
                this.M0 = z | this.M0;
                this.N0 = j != -9223372036854775807L && length2 == 1 && c49.i(str);
                po6 po6 = this.H0;
                if (po6 != null) {
                    if (h || this.J0[i3].b) {
                        a39 a39 = q.k;
                        a39 a392 = a39 == null ? new a39(po6) : a39.a(po6);
                        uu5 a2 = q.a();
                        a2.j = a392;
                        q = new xu5(a2);
                    }
                    if (h && q.g == -1 && q.h == -1 && (i = po6.a) != -1) {
                        uu5 a3 = q.a();
                        a3.g = i;
                        q = new xu5(a3);
                    }
                }
                int d = this.c.d(q);
                uu5 a4 = q.a();
                a4.J = d;
                uoeArr[i3] = new uoe(Integer.toString(i3), a4.a());
                i3++;
            }
            woe woe = new woe(uoeArr);
            ? obj = new Object();
            obj.a = woe;
            obj.b = zArr;
            int i4 = woe.a;
            obj.c = new boolean[i4];
            obj.o = new boolean[i4];
            this.O0 = obj;
            if (this.N0 && this.Q0 == -9223372036854775807L) {
                this.Q0 = j;
                this.P0 = new qgb(this, this.P0);
            }
            this.Z.v(this.Q0, this.P0.c(), this.R0);
            this.L0 = true;
            q88 q88 = this.G0;
            q88.getClass();
            q88.c(this);
        }
    }

    public final long r() {
        long j;
        boolean z;
        long j2;
        d();
        if (this.b1 || this.V0 == 0) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.Y0;
        }
        if (this.M0) {
            int length = this.I0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                nxc nxc = this.O0;
                if (((boolean[]) nxc.b)[i] && ((boolean[]) nxc.c)[i]) {
                    wjc wjc = this.I0[i];
                    synchronized (wjc) {
                        z = wjc.w;
                    }
                    if (!z) {
                        wjc wjc2 = this.I0[i];
                        synchronized (wjc2) {
                            j2 = wjc2.v;
                        }
                        j = Math.min(j, j2);
                    } else {
                        continue;
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j(false);
        }
        return j == Long.MIN_VALUE ? this.X0 : j;
    }

    public final void s(long j, boolean z) {
        if (!this.N0) {
            d();
            if (!n()) {
                boolean[] zArr = (boolean[]) this.O0.c;
                int length = this.I0.length;
                for (int i = 0; i < length; i++) {
                    this.I0[i].g(j, z, zArr[i]);
                }
            }
        }
    }

    public final void t(int i) {
        d();
        nxc nxc = this.O0;
        boolean[] zArr = (boolean[]) nxc.o;
        if (!zArr[i]) {
            xu5 xu5 = ((woe) nxc.a).a(i).d[0];
            this.X.n(c49.g(xu5.n), xu5, 0, (Object) null, this.X0);
            zArr[i] = true;
        }
    }

    public final void u(long j) {
    }

    public final void v(int i) {
        d();
        boolean[] zArr = (boolean[]) this.O0.b;
        if (this.Z0 && zArr[i] && !this.I0[i].s(false)) {
            this.Y0 = 0;
            this.Z0 = false;
            this.U0 = true;
            this.X0 = 0;
            this.a1 = 0;
            for (wjc y : this.I0) {
                y.y(false);
            }
            q88 q88 = this.G0;
            q88.getClass();
            q88.j(this);
        }
    }

    public final void w() {
        this.K0 = true;
        this.F0.post(this.D0);
    }

    public final void x(gj7 gj7, long j, long j2, boolean z) {
        sgb sgb = (sgb) gj7;
        Uri uri = sgb.c.c;
        yi7 yi7 = new yi7(j2);
        this.o.getClass();
        this.X.x(yi7, 1, -1, (xu5) null, 0, (Object) null, sgb.y0, this.Q0);
        if (!z) {
            for (wjc y : this.I0) {
                y.y(false);
            }
            if (this.V0 > 0) {
                q88 q88 = this.G0;
                q88.getClass();
                q88.j(this);
            }
        }
    }

    public final bpe y(wgb wgb) {
        int length = this.I0.length;
        for (int i = 0; i < length; i++) {
            if (wgb.equals(this.J0[i])) {
                return this.I0[i];
            }
        }
        if (this.K0) {
            ez3.j0("Extractor added new track (id=" + wgb.a + ") after finishing tracks.");
            return new qh4();
        }
        no4 no4 = this.c;
        no4.getClass();
        fo4 fo4 = this.Y;
        fo4.getClass();
        wjc wjc = new wjc(this.w0, no4, fo4);
        wjc.f = this;
        int i2 = length + 1;
        wgb[] wgbArr = (wgb[]) Arrays.copyOf(this.J0, i2);
        wgbArr[length] = wgb;
        int i3 = oze.a;
        this.J0 = wgbArr;
        wjc[] wjcArr = (wjc[]) Arrays.copyOf(this.I0, i2);
        wjcArr[length] = wjc;
        this.I0 = wjcArr;
        return wjc;
    }

    public final void z() {
        sgb sgb = new sgb(this, this.a, this.b, this.B0, this, this.C0);
        if (this.L0) {
            oyb.k(n());
            long j = this.Q0;
            if (j == -9223372036854775807L || this.Y0 <= j) {
                vtc vtc = this.P0;
                vtc.getClass();
                long j2 = vtc.e(this.Y0).a.b;
                long j3 = this.Y0;
                sgb.Z.a = j2;
                sgb.y0 = j3;
                sgb.x0 = true;
                sgb.B0 = false;
                for (wjc wjc : this.I0) {
                    wjc.t = this.Y0;
                }
                this.Y0 = -9223372036854775807L;
            } else {
                this.b1 = true;
                this.Y0 = -9223372036854775807L;
                return;
            }
        }
        this.a1 = e();
        this.X.F(new yi7(sgb.a, sgb.z0, this.A0.F(sgb, this, this.o.k(this.S0))), 1, -1, (xu5) null, 0, (Object) null, sgb.y0, this.Q0);
    }
}
