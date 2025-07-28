package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: pj6  reason: default package */
public final class pj6 implements dj7, ij7, kyc, i75, ujc {
    public static final Set n1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    public final int A0;
    public final ud B0;
    public final ArrayList C0;
    public final List D0;
    public final jj6 E0;
    public final jj6 F0;
    public final Handler G0;
    public final ArrayList H0;
    public final Map I0;
    public zx2 J0;
    public nj6[] K0;
    public int[] L0;
    public final HashSet M0;
    public final SparseIntArray N0;
    public lj6 O0;
    public int P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public xu5 U0;
    public xu5 V0;
    public boolean W0;
    public final l34 X;
    public woe X0;
    public final xu5 Y;
    public Set Y0;
    public final no4 Z;
    public int[] Z0;
    public final String a;
    public int a1;
    public final int b;
    public boolean b1;
    public final lv1 c;
    public boolean[] c1;
    public boolean[] d1;
    public long e1;
    public long f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public long k1;
    public xn4 l1;
    public ai6 m1;
    public final uh6 o;
    public final fo4 w0;
    public final mk9 x0;
    public final ul7 y0 = new ul7("Loader:HlsSampleStreamWrapper", 1);
    public final jn z0;

    public pj6(String str, int i, lv1 lv1, uh6 uh6, Map map, l34 l34, long j, xu5 xu5, no4 no4, fo4 fo4, mk9 mk9, jn jnVar, int i2) {
        this.a = str;
        this.b = i;
        this.c = lv1;
        this.o = uh6;
        this.I0 = map;
        this.X = l34;
        this.Y = xu5;
        this.Z = no4;
        this.w0 = fo4;
        this.x0 = mk9;
        this.z0 = jnVar;
        this.A0 = i2;
        ud udVar = new ud(10, (byte) 0);
        udVar.c = null;
        udVar.b = false;
        udVar.o = null;
        this.B0 = udVar;
        this.L0 = new int[0];
        Set set = n1;
        this.M0 = new HashSet(set.size());
        this.N0 = new SparseIntArray(set.size());
        this.K0 = new nj6[0];
        this.d1 = new boolean[0];
        this.c1 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.C0 = arrayList;
        this.D0 = Collections.unmodifiableList(arrayList);
        this.H0 = new ArrayList();
        this.E0 = new jj6(this, 0);
        this.F0 = new jj6(this, 1);
        this.G0 = oze.o((Handler.Callback) null);
        this.e1 = j;
        this.f1 = j;
    }

    public static qh4 e(int i, int i2) {
        ez3.j0("Unmapped track with id " + i + " of type " + i2);
        return new qh4();
    }

    public static xu5 n(xu5 xu5, xu5 xu52, boolean z) {
        String str;
        String str2;
        if (xu5 == null) {
            return xu52;
        }
        String str3 = xu52.n;
        int g = c49.g(str3);
        String str4 = xu5.j;
        if (oze.u(g, str4) == 1) {
            str2 = oze.v(g, str4);
            str = c49.c(str2);
        } else {
            String a2 = c49.a(str4, str3);
            str = str3;
            str2 = a2;
        }
        uu5 a3 = xu52.a();
        a3.a = xu5.a;
        a3.b = xu5.b;
        a3.c = ws6.j(xu5.c);
        a3.d = xu5.d;
        a3.e = xu5.e;
        a3.f = xu5.f;
        a3.g = z ? xu5.g : -1;
        a3.h = z ? xu5.h : -1;
        a3.i = str2;
        if (g == 2) {
            a3.s = xu5.t;
            a3.t = xu5.u;
            a3.u = xu5.v;
        }
        if (str != null) {
            a3.d(str);
        }
        int i = xu5.B;
        if (i != -1 && g == 1) {
            a3.A = i;
        }
        a39 a39 = xu5.k;
        if (a39 != null) {
            a39 a392 = xu52.k;
            if (a392 != null) {
                a39 = a392.b(a39);
            }
            a3.j = a39;
        }
        return new xu5(a3);
    }

    public static int v(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void A() {
        this.y0.c();
        uh6 uh6 = this.o;
        BehindLiveWindowException behindLiveWindowException = uh6.o;
        if (behindLiveWindowException == null) {
            Uri uri = uh6.p;
            if (uri != null && uh6.t) {
                e84 e84 = (e84) uh6.g.b.get(uri);
                e84.b.c();
                IOException iOException = e84.y0;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw behindLiveWindowException;
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [qh4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bpe B(int r12, int r13) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.util.Set r2 = n1
            boolean r1 = r2.contains(r1)
            java.util.HashSet r3 = r11.M0
            android.util.SparseIntArray r4 = r11.N0
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x0045
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r2.contains(r1)
            defpackage.oyb.d(r1)
            r1 = -1
            int r2 = r4.get(r13, r1)
            if (r2 != r1) goto L_0x0026
            goto L_0x0056
        L_0x0026:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r3.add(r1)
            if (r1 == 0) goto L_0x0034
            int[] r1 = r11.L0
            r1[r2] = r12
        L_0x0034:
            int[] r1 = r11.L0
            r1 = r1[r2]
            if (r1 != r12) goto L_0x0040
            nj6[] r1 = r11.K0
            r1 = r1[r2]
        L_0x003e:
            r6 = r1
            goto L_0x0056
        L_0x0040:
            qh4 r1 = e(r12, r13)
            goto L_0x003e
        L_0x0045:
            r1 = r5
        L_0x0046:
            nj6[] r2 = r11.K0
            int r7 = r2.length
            if (r1 >= r7) goto L_0x0056
            int[] r7 = r11.L0
            r7 = r7[r1]
            if (r7 != r12) goto L_0x0054
            r6 = r2[r1]
            goto L_0x0056
        L_0x0054:
            int r1 = r1 + r0
            goto L_0x0046
        L_0x0056:
            if (r6 != 0) goto L_0x00e8
            boolean r1 = r11.j1
            if (r1 == 0) goto L_0x0061
            qh4 r11 = e(r12, r13)
            return r11
        L_0x0061:
            nj6[] r1 = r11.K0
            int r1 = r1.length
            if (r13 == r0) goto L_0x0069
            r2 = 2
            if (r13 != r2) goto L_0x006a
        L_0x0069:
            r5 = r0
        L_0x006a:
            nj6 r6 = new nj6
            l34 r2 = r11.X
            java.util.Map r7 = r11.I0
            no4 r8 = r11.Z
            fo4 r9 = r11.w0
            r6.<init>(r2, r8, r9, r7)
            long r7 = r11.e1
            r6.t = r7
            if (r5 == 0) goto L_0x0083
            xn4 r2 = r11.l1
            r6.I = r2
            r6.z = r0
        L_0x0083:
            long r7 = r11.k1
            long r9 = r6.F
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x008f
            r6.F = r7
            r6.z = r0
        L_0x008f:
            ai6 r2 = r11.m1
            if (r2 == 0) goto L_0x0098
            int r2 = r2.z0
            long r7 = (long) r2
            r6.C = r7
        L_0x0098:
            r6.f = r11
            int[] r2 = r11.L0
            int r7 = r1 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r7)
            r11.L0 = r2
            r2[r1] = r12
            nj6[] r12 = r11.K0
            int r2 = defpackage.oze.a
            int r2 = r12.length
            int r2 = r2 + r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r12, r2)
            int r12 = r12.length
            r0[r12] = r6
            nj6[] r0 = (defpackage.nj6[]) r0
            r11.K0 = r0
            boolean[] r12 = r11.d1
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.d1 = r12
            r12[r1] = r5
            boolean r12 = r11.b1
            r12 = r12 | r5
            r11.b1 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r3.add(r12)
            r4.append(r13, r1)
            int r12 = v(r13)
            int r0 = r11.P0
            int r0 = v(r0)
            if (r12 <= r0) goto L_0x00e0
            r11.Q0 = r1
            r11.P0 = r13
        L_0x00e0:
            boolean[] r12 = r11.c1
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.c1 = r12
        L_0x00e8:
            r12 = 5
            if (r13 != r12) goto L_0x00fb
            lj6 r12 = r11.O0
            if (r12 != 0) goto L_0x00f8
            lj6 r12 = new lj6
            int r13 = r11.A0
            r12.<init>(r6, r13)
            r11.O0 = r12
        L_0x00f8:
            lj6 r11 = r11.O0
            return r11
        L_0x00fb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj6.B(int, int):bpe");
    }

    public final void C(uoe[] uoeArr, int... iArr) {
        this.X0 = j(uoeArr);
        this.Y0 = new HashSet();
        for (int a2 : iArr) {
            this.Y0.add(this.X0.a(a2));
        }
        this.a1 = 0;
        Handler handler = this.G0;
        lv1 lv1 = this.c;
        Objects.requireNonNull(lv1);
        handler.post(new oc4(27, lv1));
        this.S0 = true;
    }

    public final void D() {
        for (nj6 y : this.K0) {
            y.y(this.g1);
        }
        this.g1 = false;
    }

    public final void E(gj7 gj7, long j, long j2) {
        zx2 zx2 = (zx2) gj7;
        this.J0 = null;
        uh6 uh6 = this.o;
        uh6.getClass();
        if (zx2 instanceof nh6) {
            nh6 nh6 = (nh6) zx2;
            uh6.n = nh6.y0;
            Uri uri = nh6.b.a;
            byte[] bArr = nh6.A0;
            bArr.getClass();
            lv1 lv1 = uh6.j;
            lv1.getClass();
            uri.getClass();
            byte[] bArr2 = (byte[]) ((q16) lv1.b).put(uri, bArr);
        }
        long j3 = zx2.a;
        Uri uri2 = zx2.x0.c;
        yi7 yi7 = new yi7(j2);
        this.x0.getClass();
        this.z0.z(yi7, zx2.c, this.b, zx2.o, zx2.X, zx2.Y, zx2.Z, zx2.w0);
        if (!this.S0) {
            pj7 pj7 = new pj7();
            pj7.a = this.e1;
            m(new qj7(pj7));
            return;
        }
        this.c.j(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r11 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(long r9, boolean r11) {
        /*
            r8 = this;
            r8.e1 = r9
            boolean r0 = r8.y()
            r1 = 1
            if (r0 == 0) goto L_0x000c
            r8.f1 = r9
            return r1
        L_0x000c:
            uh6 r0 = r8.o
            boolean r0 = r0.q
            r2 = 0
            java.util.ArrayList r3 = r8.C0
            r4 = 0
            if (r0 == 0) goto L_0x002d
            r0 = r4
        L_0x0017:
            int r5 = r3.size()
            if (r0 >= r5) goto L_0x002d
            java.lang.Object r5 = r3.get(r0)
            ai6 r5 = (defpackage.ai6) r5
            long r6 = r5.Z
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r0 = r0 + 1
            goto L_0x0017
        L_0x002d:
            r5 = r2
        L_0x002e:
            boolean r0 = r8.R0
            if (r0 == 0) goto L_0x0062
            if (r11 != 0) goto L_0x0062
            nj6[] r11 = r8.K0
            int r11 = r11.length
            r0 = r4
        L_0x0038:
            if (r0 >= r11) goto L_0x005e
            nj6[] r6 = r8.K0
            r6 = r6[r0]
            if (r5 == 0) goto L_0x0049
            int r7 = r5.f(r0)
            boolean r6 = r6.z(r7)
            goto L_0x004d
        L_0x0049:
            boolean r6 = r6.A(r9, r4)
        L_0x004d:
            if (r6 != 0) goto L_0x005b
            boolean[] r6 = r8.d1
            boolean r6 = r6[r0]
            if (r6 != 0) goto L_0x0059
            boolean r6 = r8.b1
            if (r6 != 0) goto L_0x005b
        L_0x0059:
            r11 = r4
            goto L_0x005f
        L_0x005b:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x005e:
            r11 = r1
        L_0x005f:
            if (r11 == 0) goto L_0x0062
            return r4
        L_0x0062:
            r8.f1 = r9
            r8.i1 = r4
            r3.clear()
            ul7 r9 = r8.y0
            boolean r10 = r9.A()
            if (r10 == 0) goto L_0x0086
            boolean r10 = r8.R0
            if (r10 == 0) goto L_0x0082
            nj6[] r8 = r8.K0
            int r10 = r8.length
        L_0x0078:
            if (r4 >= r10) goto L_0x0082
            r11 = r8[r4]
            r11.h()
            int r4 = r4 + 1
            goto L_0x0078
        L_0x0082:
            r9.s()
            goto L_0x008b
        L_0x0086:
            r9.c = r2
            r8.D()
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj6.F(long, boolean):boolean");
    }

    public final void M(vtc vtc) {
    }

    public final sz0 U(gj7 gj7, long j, long j2, IOException iOException, int i) {
        boolean z;
        sz0 sz0;
        int i2;
        IOException iOException2 = iOException;
        zx2 zx2 = (zx2) gj7;
        boolean z2 = zx2 instanceof ai6;
        if (z2 && !((ai6) zx2).a1 && (iOException2 instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException2).o) == 410 || i2 == 404)) {
            return ul7.o;
        }
        long j3 = zx2.x0.b;
        Uri uri = zx2.x0.c;
        yi7 yi7 = new yi7(j2);
        oze.h0(zx2.Z);
        oze.h0(zx2.w0);
        wi7 wi7 = new wi7(i, iOException2);
        uh6 uh6 = this.o;
        nv4 k = jjd.k(uh6.r);
        this.x0.getClass();
        sz0 i3 = mk9.i(k, wi7);
        boolean z3 = false;
        if (i3 == null || i3.b != 2) {
            z = false;
        } else {
            g55 g55 = uh6.r;
            z = g55.u(g55.p(uh6.h.d(zx2.o)), i3.c);
        }
        if (z) {
            if (z2 && j3 == 0) {
                ArrayList arrayList = this.C0;
                if (((ai6) arrayList.remove(arrayList.size() - 1)) == zx2) {
                    z3 = true;
                }
                oyb.k(z3);
                if (arrayList.isEmpty()) {
                    this.f1 = this.e1;
                } else {
                    ((ai6) gwf.t(arrayList)).Z0 = true;
                }
            }
            sz0 = ul7.X;
        } else {
            long m = mk9.m(wi7);
            sz0 = m != -9223372036854775807L ? new sz0(m, 0, 5, false) : ul7.Y;
        }
        sz0 sz02 = sz0;
        boolean z4 = !sz02.a();
        this.z0.B(yi7, zx2.c, this.b, zx2.o, zx2.X, zx2.Y, zx2.Z, zx2.w0, iOException, z4);
        if (z4) {
            this.J0 = null;
        }
        if (z) {
            if (!this.S0) {
                pj7 pj7 = new pj7();
                pj7.a = this.e1;
                m(new qj7(pj7));
            } else {
                this.c.j(this);
            }
        }
        return sz02;
    }

    public final void a() {
        for (nj6 nj6 : this.K0) {
            nj6.y(true);
            zn4 zn4 = nj6.h;
            if (zn4 != null) {
                zn4.f(nj6.e);
                nj6.h = null;
                nj6.g = null;
            }
        }
    }

    public final boolean b() {
        return this.y0.A();
    }

    public final void c() {
        this.G0.post(this.E0);
    }

    public final void d() {
        oyb.k(this.S0);
        this.X0.getClass();
        this.Y0.getClass();
    }

    public final long f() {
        if (y()) {
            return this.f1;
        }
        if (this.i1) {
            return Long.MIN_VALUE;
        }
        return t().w0;
    }

    public final woe j(uoe[] uoeArr) {
        for (int i = 0; i < uoeArr.length; i++) {
            uoe uoe = uoeArr[i];
            xu5[] xu5Arr = new xu5[uoe.a];
            for (int i2 = 0; i2 < uoe.a; i2++) {
                xu5 xu5 = uoe.d[i2];
                int d = this.Z.d(xu5);
                uu5 a2 = xu5.a();
                a2.J = d;
                xu5Arr[i2] = a2.a();
            }
            uoeArr[i] = new uoe(uoe.b, xu5Arr);
        }
        return new woe(uoeArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(defpackage.qj7 r60) {
        /*
            r59 = this;
            r0 = r59
            r1 = 1
            boolean r2 = r0.i1
            r3 = 0
            if (r2 != 0) goto L_0x0016
            ul7 r2 = r0.y0
            boolean r4 = r2.A()
            if (r4 != 0) goto L_0x0016
            boolean r4 = r2.w()
            if (r4 == 0) goto L_0x0019
        L_0x0016:
            r0 = r3
            goto L_0x0583
        L_0x0019:
            boolean r4 = r59.y()
            if (r4 == 0) goto L_0x0035
            java.util.List r4 = java.util.Collections.emptyList()
            long r5 = r0.f1
            nj6[] r7 = r0.K0
            int r8 = r7.length
            r9 = r3
        L_0x0029:
            if (r9 >= r8) goto L_0x0033
            r10 = r7[r9]
            long r11 = r0.f1
            r10.t = r11
            int r9 = r9 + r1
            goto L_0x0029
        L_0x0033:
            r14 = r4
            goto L_0x004d
        L_0x0035:
            ai6 r4 = r59.t()
            boolean r5 = r4.X0
            if (r5 == 0) goto L_0x0041
            long r4 = r4.w0
        L_0x003f:
            r5 = r4
            goto L_0x004a
        L_0x0041:
            long r5 = r0.e1
            long r7 = r4.Z
            long r4 = java.lang.Math.max(r5, r7)
            goto L_0x003f
        L_0x004a:
            java.util.List r4 = r0.D0
            goto L_0x0033
        L_0x004d:
            ud r4 = r0.B0
            r15 = 0
            r4.c = r15
            r4.b = r3
            r4.o = r15
            boolean r7 = r0.S0
            if (r7 != 0) goto L_0x0064
            boolean r7 = r14.isEmpty()
            if (r7 != 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r16 = r3
            goto L_0x0066
        L_0x0064:
            r16 = r1
        L_0x0066:
            uh6 r12 = r0.o
            r12.getClass()
            boolean r7 = r14.isEmpty()
            if (r7 == 0) goto L_0x0073
            r13 = r15
            goto L_0x007a
        L_0x0073:
            java.lang.Object r7 = defpackage.gwf.t(r14)
            ai6 r7 = (defpackage.ai6) r7
            r13 = r7
        L_0x007a:
            if (r13 != 0) goto L_0x0080
            r7 = r60
            r11 = -1
            goto L_0x008b
        L_0x0080:
            uoe r7 = r12.h
            xu5 r8 = r13.o
            int r7 = r7.d(r8)
            r11 = r7
            r7 = r60
        L_0x008b:
            long r8 = r7.a
            long r17 = r5 - r8
            r20 = r11
            long r10 = r12.s
            r21 = r2
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x00a0
            long r10 = r10 - r8
            goto L_0x00a1
        L_0x00a0:
            r10 = r1
        L_0x00a1:
            if (r13 == 0) goto L_0x00ca
            boolean r7 = r12.q
            if (r7 != 0) goto L_0x00ca
            r22 = r4
            long r3 = r13.w0
            long r1 = r13.Z
            long r3 = r3 - r1
            long r1 = r17 - r3
            r23 = r14
            r14 = 0
            long r1 = java.lang.Math.max(r14, r1)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r7 == 0) goto L_0x00c8
            long r10 = r10 - r3
            long r3 = java.lang.Math.max(r14, r10)
        L_0x00c6:
            r10 = r1
            goto L_0x00d1
        L_0x00c8:
            r3 = r10
            goto L_0x00c6
        L_0x00ca:
            r22 = r4
            r23 = r14
            r3 = r10
            r10 = r17
        L_0x00d1:
            a28[] r15 = r12.a(r13, r5)
            g55 r7 = r12.r
            r1 = r20
            r2 = -1
            r14 = r12
            r60 = r13
            r12 = r3
            r3 = r14
            r14 = r23
            r4 = 0
            r7.r(r8, r10, r12, r14, r15)
            g55 r7 = r3.r
            int r12 = r7.i()
            if (r1 == r12) goto L_0x00ef
            r13 = 1
            goto L_0x00f0
        L_0x00ef:
            r13 = 0
        L_0x00f0:
            android.net.Uri[] r14 = r3.e
            r15 = r14[r12]
            f84 r10 = r3.g
            boolean r7 = r10.d(r15)
            if (r7 != 0) goto L_0x0110
            r7 = r22
            r7.o = r15
            boolean r1 = r3.t
            android.net.Uri r2 = r3.p
            boolean r2 = r15.equals(r2)
            r1 = r1 & r2
            r3.t = r1
            r3.p = r15
            r0 = r7
            goto L_0x04c3
        L_0x0110:
            r7 = r22
            r8 = 1
            ni6 r11 = r10.b(r15, r8)
            r11.getClass()
            boolean r8 = r11.c
            r3.q = r8
            boolean r8 = r11.o
            r17 = r5
            long r4 = r11.h
            if (r8 == 0) goto L_0x012d
            r8 = r3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0138
        L_0x012d:
            long r8 = r11.u
            long r8 = r8 + r4
            r19 = r3
            long r2 = r10.Z
            long r2 = r8 - r2
            r8 = r19
        L_0x0138:
            r8.s = r2
            long r2 = r10.Z
            long r2 = r4 - r2
            r9 = r7
            r7 = 0
            r4 = r8
            r5 = r60
            r6 = r13
            r19 = r12
            r12 = r7
            r7 = r11
            r22 = r8
            r12 = r9
            r8 = r2
            r24 = r2
            r3 = r10
            r2 = r11
            r10 = r17
            android.util.Pair r4 = r4.c(r5, r6, r7, r8, r10)
            java.lang.Object r5 = r4.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r7 = r2.k
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x01a6
            r10 = r60
            if (r10 == 0) goto L_0x01a4
            if (r13 == 0) goto L_0x01a4
            r15 = r14[r1]
            r2 = 1
            ni6 r13 = r3.b(r15, r2)
            r13.getClass()
            long r4 = r3.Z
            long r6 = r13.h
            long r24 = r6 - r4
            r6 = 0
            r4 = r22
            r5 = r10
            r7 = r13
            r8 = r24
            r2 = r10
            r10 = r17
            android.util.Pair r4 = r4.c(r5, r6, r7, r8, r10)
            java.lang.Object r5 = r4.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r11 = r1
            r7 = r2
            r2 = r13
            goto L_0x01aa
        L_0x01a4:
            r7 = r10
            goto L_0x01a8
        L_0x01a6:
            r7 = r60
        L_0x01a8:
            r11 = r19
        L_0x01aa:
            if (r11 == r1) goto L_0x01be
            r8 = -1
            if (r1 == r8) goto L_0x01be
            r1 = r14[r1]
            java.util.HashMap r3 = r3.b
            java.lang.Object r1 = r3.get(r1)
            e84 r1 = (defpackage.e84) r1
            if (r1 == 0) goto L_0x01be
            r3 = 0
            r1.z0 = r3
        L_0x01be:
            long r8 = r2.k
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x01d0
            androidx.media3.exoplayer.source.BehindLiveWindowException r1 = new androidx.media3.exoplayer.source.BehindLiveWindowException
            r1.<init>()
            r3 = r22
            r3.o = r1
        L_0x01cd:
            r0 = r12
            goto L_0x04c3
        L_0x01d0:
            r3 = r22
            long r13 = r5 - r8
            int r1 = (int) r13
            ws6 r10 = r2.r
            int r13 = r10.size()
            r17 = 1
            ws6 r14 = r2.s
            if (r1 != r13) goto L_0x01fb
            r13 = -1
            if (r4 == r13) goto L_0x01e5
            goto L_0x01e6
        L_0x01e5:
            r4 = 0
        L_0x01e6:
            int r1 = r14.size()
            if (r4 >= r1) goto L_0x01f8
            sh6 r1 = new sh6
            java.lang.Object r13 = r14.get(r4)
            ki6 r13 = (defpackage.ki6) r13
            r1.<init>((defpackage.ki6) r13, (long) r5, (int) r4)
            goto L_0x01f9
        L_0x01f8:
            r1 = 0
        L_0x01f9:
            r0 = r1
            goto L_0x024d
        L_0x01fb:
            java.lang.Object r13 = r10.get(r1)
            ii6 r13 = (defpackage.ii6) r13
            r0 = -1
            if (r4 != r0) goto L_0x020a
            sh6 r1 = new sh6
            r1.<init>((defpackage.ki6) r13, (long) r5, (int) r0)
            goto L_0x01f9
        L_0x020a:
            ws6 r0 = r13.B0
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x0220
            sh6 r0 = new sh6
            ws6 r1 = r13.B0
            java.lang.Object r1 = r1.get(r4)
            ki6 r1 = (defpackage.ki6) r1
            r0.<init>((defpackage.ki6) r1, (long) r5, (int) r4)
            goto L_0x024d
        L_0x0220:
            r0 = 1
            int r1 = r1 + r0
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0237
            sh6 r0 = new sh6
            java.lang.Object r1 = r10.get(r1)
            ki6 r1 = (defpackage.ki6) r1
            long r5 = r5 + r17
            r4 = -1
            r0.<init>((defpackage.ki6) r1, (long) r5, (int) r4)
            goto L_0x024d
        L_0x0237:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x024c
            sh6 r0 = new sh6
            r1 = 0
            java.lang.Object r4 = r14.get(r1)
            ki6 r4 = (defpackage.ki6) r4
            long r5 = r5 + r17
            r0.<init>((defpackage.ki6) r4, (long) r5, (int) r1)
            goto L_0x024d
        L_0x024c:
            r0 = 0
        L_0x024d:
            if (r0 != 0) goto L_0x0282
            boolean r0 = r2.o
            if (r0 != 0) goto L_0x0264
            r12.o = r15
            boolean r0 = r3.t
            android.net.Uri r1 = r3.p
            boolean r1 = r15.equals(r1)
            r0 = r0 & r1
            r3.t = r0
            r3.p = r15
            goto L_0x01cd
        L_0x0264:
            if (r16 != 0) goto L_0x026c
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x026e
        L_0x026c:
            r0 = 1
            goto L_0x0284
        L_0x026e:
            sh6 r0 = new sh6
            java.lang.Object r1 = defpackage.gwf.t(r10)
            ki6 r1 = (defpackage.ki6) r1
            int r4 = r10.size()
            long r4 = (long) r4
            long r8 = r8 + r4
            long r8 = r8 - r17
            r4 = -1
            r0.<init>((defpackage.ki6) r1, (long) r8, (int) r4)
        L_0x0282:
            r1 = 0
            goto L_0x0288
        L_0x0284:
            r12.b = r0
            goto L_0x01cd
        L_0x0288:
            r3.t = r1
            r1 = 0
            r3.p = r1
            android.os.SystemClock.elapsedRealtime()
            java.lang.Comparable r1 = r0.d
            ki6 r1 = (defpackage.ki6) r1
            ii6 r4 = r1.b
            java.lang.String r5 = r2.a
            if (r4 == 0) goto L_0x02a5
            java.lang.String r4 = r4.Z
            if (r4 != 0) goto L_0x029f
            goto L_0x02a5
        L_0x029f:
            android.net.Uri r4 = pa2.J(r5, r4)
        L_0x02a3:
            r6 = 1
            goto L_0x02a7
        L_0x02a5:
            r4 = 0
            goto L_0x02a3
        L_0x02a7:
            nh6 r8 = r3.d(r4, r11, r6)
            r12.c = r8
            if (r8 == 0) goto L_0x02b1
        L_0x02af:
            goto L_0x01cd
        L_0x02b1:
            java.lang.String r6 = r1.Z
            if (r6 != 0) goto L_0x02b8
            r6 = 0
        L_0x02b6:
            r8 = 0
            goto L_0x02bd
        L_0x02b8:
            android.net.Uri r6 = pa2.J(r5, r6)
            goto L_0x02b6
        L_0x02bd:
            nh6 r9 = r3.d(r6, r11, r8)
            r12.c = r9
            if (r9 == 0) goto L_0x02c6
            goto L_0x02af
        L_0x02c6:
            long r8 = r1.X
            if (r7 != 0) goto L_0x02d3
            java.util.concurrent.atomic.AtomicInteger r10 = defpackage.ai6.b1
        L_0x02cc:
            r16 = r8
            r22 = r12
            r57 = 0
            goto L_0x030c
        L_0x02d3:
            android.net.Uri r10 = r7.B0
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L_0x02e0
            boolean r10 = r7.X0
            if (r10 == 0) goto L_0x02e0
            goto L_0x02cc
        L_0x02e0:
            long r13 = r24 + r8
            boolean r10 = r1 instanceof defpackage.ei6
            r22 = r12
            boolean r12 = r2.c
            if (r10 == 0) goto L_0x02fc
            r10 = r1
            ei6 r10 = (defpackage.ei6) r10
            boolean r10 = r10.A0
            if (r10 != 0) goto L_0x02fa
            int r10 = r0.b
            if (r10 != 0) goto L_0x02f8
            if (r12 == 0) goto L_0x02f8
            goto L_0x02fa
        L_0x02f8:
            r10 = 0
            goto L_0x02fb
        L_0x02fa:
            r10 = 1
        L_0x02fb:
            r12 = r10
        L_0x02fc:
            r16 = r8
            if (r12 == 0) goto L_0x0309
            long r8 = r7.w0
            int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0307
            goto L_0x0309
        L_0x0307:
            r8 = 0
            goto L_0x030a
        L_0x0309:
            r8 = 1
        L_0x030a:
            r57 = r8
        L_0x030c:
            boolean r8 = r0.c
            if (r57 == 0) goto L_0x0316
            if (r8 == 0) goto L_0x0316
            r0 = r22
            goto L_0x04c3
        L_0x0316:
            xu5[] r9 = r3.f
            r30 = r9[r11]
            g55 r9 = r3.r
            int r37 = r9.k()
            g55 r9 = r3.r
            java.lang.Object r38 = r9.m()
            boolean r9 = r3.m
            lv1 r10 = r3.j
            if (r6 != 0) goto L_0x0331
            r10.getClass()
            r6 = 0
            goto L_0x033b
        L_0x0331:
            java.lang.Object r11 = r10.b
            q16 r11 = (defpackage.q16) r11
            java.lang.Object r6 = r11.get(r6)
            byte[] r6 = (byte[]) r6
        L_0x033b:
            if (r4 != 0) goto L_0x033f
            r4 = 0
            goto L_0x0349
        L_0x033f:
            java.lang.Object r10 = r10.b
            q16 r10 = (defpackage.q16) r10
            java.lang.Object r4 = r10.get(r4)
            byte[] r4 = (byte[]) r4
        L_0x0349:
            java.util.concurrent.atomic.AtomicInteger r10 = defpackage.ai6.b1
            java.util.Map r45 = java.util.Collections.emptyMap()
            java.lang.String r10 = r1.a
            android.net.Uri r10 = pa2.J(r5, r10)
            if (r8 == 0) goto L_0x035c
            r11 = 8
            r51 = r11
            goto L_0x035e
        L_0x035c:
            r51 = 0
        L_0x035e:
            java.lang.String r11 = "The uri must be set."
            defpackage.oyb.m(r10, r11)
            yz3 r29 = new yz3
            r50 = 0
            r52 = 0
            r41 = 0
            r43 = 1
            r44 = 0
            long r12 = r1.x0
            r14 = r8
            r18 = r9
            long r8 = r1.y0
            r39 = r29
            r40 = r10
            r46 = r12
            r48 = r8
            r39.<init>(r40, r41, r43, r44, r45, r46, r48, r50, r51, r52)
            if (r6 == 0) goto L_0x0386
            r31 = 1
            goto L_0x0388
        L_0x0386:
            r31 = 0
        L_0x0388:
            if (r31 == 0) goto L_0x0394
            java.lang.String r8 = r1.w0
            r8.getClass()
            byte[] r8 = defpackage.ai6.e(r8)
            goto L_0x0395
        L_0x0394:
            r8 = 0
        L_0x0395:
            qz3 r9 = r3.b
            if (r6 == 0) goto L_0x03a4
            r8.getClass()
            kc r10 = new kc
            r10.<init>(r9, r6, r8)
            r28 = r10
            goto L_0x03a6
        L_0x03a4:
            r28 = r9
        L_0x03a6:
            ii6 r6 = r1.b
            if (r6 == 0) goto L_0x03fc
            if (r4 == 0) goto L_0x03ae
            r8 = 1
            goto L_0x03af
        L_0x03ae:
            r8 = 0
        L_0x03af:
            if (r8 == 0) goto L_0x03bb
            java.lang.String r10 = r6.w0
            r10.getClass()
            byte[] r10 = defpackage.ai6.e(r10)
            goto L_0x03bc
        L_0x03bb:
            r10 = 0
        L_0x03bc:
            java.lang.String r12 = r6.a
            android.net.Uri r5 = pa2.J(r5, r12)
            java.util.Map r45 = java.util.Collections.emptyMap()
            defpackage.oyb.m(r5, r11)
            yz3 r11 = new yz3
            r51 = 0
            r52 = 0
            r41 = 0
            r43 = 1
            r44 = 0
            long r12 = r6.x0
            r60 = r14
            r19 = r15
            long r14 = r6.y0
            r50 = 0
            r39 = r11
            r40 = r5
            r46 = r12
            r48 = r14
            r39.<init>(r40, r41, r43, r44, r45, r46, r48, r50, r51, r52)
            if (r4 == 0) goto L_0x03f6
            r10.getClass()
            kc r5 = new kc
            r5.<init>(r9, r4, r10)
            r15 = r5
            goto L_0x03f7
        L_0x03f6:
            r15 = r9
        L_0x03f7:
            r34 = r8
            r32 = r15
            goto L_0x0405
        L_0x03fc:
            r60 = r14
            r19 = r15
            r11 = 0
            r32 = 0
            r34 = 0
        L_0x0405:
            long r39 = r24 + r16
            long r4 = r1.c
            long r41 = r39 + r4
            int r2 = r2.j
            int r4 = r1.o
            int r2 = r2 + r4
            if (r7 == 0) goto L_0x045c
            yz3 r4 = r7.F0
            if (r11 == r4) goto L_0x042f
            if (r11 == 0) goto L_0x042d
            if (r4 == 0) goto L_0x042d
            android.net.Uri r5 = r11.a
            android.net.Uri r6 = r4.a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x042d
            long r5 = r11.f
            long r8 = r4.f
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            r4 = 0
            goto L_0x0430
        L_0x042f:
            r4 = 1
        L_0x0430:
            android.net.Uri r5 = r7.B0
            r15 = r19
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x0440
            boolean r5 = r7.X0
            if (r5 == 0) goto L_0x0440
            r5 = 1
            goto L_0x0441
        L_0x0440:
            r5 = 0
        L_0x0441:
            if (r4 == 0) goto L_0x0450
            if (r5 == 0) goto L_0x0450
            boolean r4 = r7.Z0
            if (r4 != 0) goto L_0x0450
            int r4 = r7.A0
            if (r4 != r2) goto L_0x0450
            te r4 = r7.S0
            goto L_0x0451
        L_0x0450:
            r4 = 0
        L_0x0451:
            wo6 r5 = r7.N0
            ija r6 = r7.O0
            r54 = r4
            r55 = r5
        L_0x0459:
            r56 = r6
            goto L_0x0470
        L_0x045c:
            r15 = r19
            wo6 r4 = new wo6
            r5 = 0
            r4.<init>(r5)
            ija r6 = new ija
            r7 = 10
            r6.<init>((int) r7)
            r55 = r4
            r54 = r5
            goto L_0x0459
        L_0x0470:
            ai6 r4 = new ai6
            r5 = 1
            r46 = r60 ^ 1
            gvf r5 = r3.d
            java.lang.Object r5 = r5.b
            android.util.SparseArray r5 = (android.util.SparseArray) r5
            java.lang.Object r6 = r5.get(r2)
            cke r6 = (defpackage.cke) r6
            if (r6 != 0) goto L_0x0490
            cke r6 = new cke
            r7 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r6.<init>(r7)
            r5.put(r2, r6)
        L_0x0490:
            r50 = r6
            boolean r5 = r1.z0
            r48 = r5
            long r5 = r3.l
            r51 = r5
            xh6 r5 = r3.a
            r27 = r5
            java.util.List r5 = r3.i
            r36 = r5
            long r5 = r0.a
            r43 = r5
            int r0 = r0.b
            r45 = r0
            xn4 r0 = r1.Y
            r53 = r0
            cza r0 = r3.k
            r58 = r0
            r26 = r4
            r33 = r11
            r35 = r15
            r47 = r2
            r49 = r18
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r46, r47, r48, r49, r50, r51, r53, r54, r55, r56, r57, r58)
            r0 = r22
            r0.c = r4
        L_0x04c3:
            boolean r1 = r0.b
            java.lang.Object r2 = r0.c
            zx2 r2 = (defpackage.zx2) r2
            java.lang.Object r0 = r0.o
            android.net.Uri r0 = (android.net.Uri) r0
            if (r1 == 0) goto L_0x04dc
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r59
            r1.f1 = r3
            r3 = 1
            r1.i1 = r3
            return r3
        L_0x04dc:
            r1 = r59
            r3 = 1
            if (r2 != 0) goto L_0x04f8
            if (r0 == 0) goto L_0x04f6
            lv1 r1 = r1.c
            java.lang.Object r1 = r1.b
            ci6 r1 = (defpackage.ci6) r1
            f84 r1 = r1.b
            java.util.HashMap r1 = r1.b
            java.lang.Object r0 = r1.get(r0)
            e84 r0 = (defpackage.e84) r0
            r0.c(r3)
        L_0x04f6:
            r0 = 0
            return r0
        L_0x04f8:
            boolean r0 = r2 instanceof defpackage.ai6
            if (r0 == 0) goto L_0x054f
            r0 = r2
            ai6 r0 = (defpackage.ai6) r0
            r1.m1 = r0
            xu5 r3 = r0.o
            r1.U0 = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.f1 = r3
            java.util.ArrayList r3 = r1.C0
            r3.add(r0)
            ts6 r3 = defpackage.ws6.i()
            nj6[] r4 = r1.K0
            int r5 = r4.length
            r6 = 0
        L_0x0519:
            if (r6 >= r5) goto L_0x052c
            r7 = r4[r6]
            int r8 = r7.q
            int r7 = r7.p
            int r8 = r8 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3.a(r7)
            r7 = 1
            int r6 = r6 + r7
            goto L_0x0519
        L_0x052c:
            e8c r3 = r3.j()
            r0.T0 = r1
            r0.Y0 = r3
            nj6[] r3 = r1.K0
            int r4 = r3.length
            r5 = 0
        L_0x0538:
            if (r5 >= r4) goto L_0x054f
            r6 = r3[r5]
            r6.getClass()
            int r7 = r0.z0
            long r7 = (long) r7
            r6.C = r7
            boolean r7 = r0.C0
            if (r7 == 0) goto L_0x054c
            r7 = 1
            r6.G = r7
            goto L_0x054d
        L_0x054c:
            r7 = 1
        L_0x054d:
            int r5 = r5 + r7
            goto L_0x0538
        L_0x054f:
            r1.J0 = r2
            mk9 r0 = r1.x0
            int r3 = r2.c
            int r0 = r0.k(r3)
            r3 = r21
            long r8 = r3.F(r2, r1, r0)
            yi7 r11 = new yi7
            long r5 = r2.a
            yz3 r7 = r2.b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r15 = r2.X
            java.lang.Object r0 = r2.Y
            jn r10 = r1.z0
            int r12 = r2.c
            int r13 = r1.b
            xu5 r14 = r2.o
            long r3 = r2.Z
            long r1 = r2.w0
            r16 = r0
            r17 = r3
            r19 = r1
            r10.F(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
        L_0x0583:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj6.m(qj7):boolean");
    }

    public final void q(int i) {
        ArrayList arrayList;
        oyb.k(!this.y0.A());
        int i2 = i;
        loop0:
        while (true) {
            arrayList = this.C0;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= arrayList.size()) {
                    ai6 ai6 = (ai6) arrayList.get(i2);
                    int i4 = 0;
                    while (i4 < this.K0.length) {
                        if (this.K0[i4].n() <= ai6.f(i4)) {
                            i4++;
                        }
                    }
                    break loop0;
                } else if (((ai6) arrayList.get(i3)).C0) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 != -1) {
            long j = t().w0;
            ai6 ai62 = (ai6) arrayList.get(i2);
            oze.X(arrayList, i2, arrayList.size());
            for (int i5 = 0; i5 < this.K0.length; i5++) {
                this.K0[i5].j(ai62.f(i5));
            }
            if (arrayList.isEmpty()) {
                this.f1 = this.e1;
            } else {
                ((ai6) gwf.t(arrayList)).Z0 = true;
            }
            this.i1 = false;
            int i6 = this.P0;
            long j2 = ai62.Z;
            jn jnVar = this.z0;
            jnVar.getClass();
            jnVar.P(new i78(1, i6, (Object) null, 3, (Object) null, oze.h0(j2), oze.h0(j)));
        }
    }

    public final long r() {
        long j;
        if (this.i1) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f1;
        }
        long j2 = this.e1;
        ai6 t = t();
        if (!t.X0) {
            ArrayList arrayList = this.C0;
            t = arrayList.size() > 1 ? (ai6) rf0.e(arrayList, 2) : null;
        }
        if (t != null) {
            j2 = Math.max(j2, t.w0);
        }
        if (this.R0) {
            for (nj6 nj6 : this.K0) {
                synchronized (nj6) {
                    j = nj6.v;
                }
                j2 = Math.max(j2, j);
            }
        }
        return j2;
    }

    public final ai6 t() {
        return (ai6) rf0.e(this.C0, 1);
    }

    public final void u(long j) {
        ul7 ul7 = this.y0;
        if (!ul7.w() && !y()) {
            boolean A = ul7.A();
            uh6 uh6 = this.o;
            List list = this.D0;
            if (A) {
                this.J0.getClass();
                if (uh6.o != null ? false : uh6.r.t(j, this.J0, list)) {
                    ul7.s();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && uh6.b((ai6) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                q(size);
            }
            int size2 = (uh6.o != null || uh6.r.length() < 2) ? list.size() : uh6.r.g(j, list);
            if (size2 < this.C0.size()) {
                q(size2);
            }
        }
    }

    public final void w() {
        this.j1 = true;
        this.G0.post(this.F0);
    }

    public final void x(gj7 gj7, long j, long j2, boolean z) {
        zx2 zx2 = (zx2) gj7;
        this.J0 = null;
        long j3 = zx2.a;
        Uri uri = zx2.x0.c;
        yi7 yi7 = new yi7(j2);
        this.x0.getClass();
        this.z0.x(yi7, zx2.c, this.b, zx2.o, zx2.X, zx2.Y, zx2.Z, zx2.w0);
        if (!z) {
            if (y() || this.T0 == 0) {
                D();
            }
            if (this.T0 > 0) {
                this.c.j(this);
            }
        }
    }

    public final boolean y() {
        return this.f1 != -9223372036854775807L;
    }

    public final void z() {
        boolean z;
        if (!this.W0 && this.Z0 == null && this.R0) {
            nj6[] nj6Arr = this.K0;
            int length = nj6Arr.length;
            boolean z2 = false;
            int i = 0;
            while (i < length) {
                if (nj6Arr[i].q() != null) {
                    i++;
                } else {
                    return;
                }
            }
            woe woe = this.X0;
            if (woe != null) {
                int i2 = woe.a;
                int[] iArr = new int[i2];
                this.Z0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = 0;
                    while (true) {
                        nj6[] nj6Arr2 = this.K0;
                        if (i4 >= nj6Arr2.length) {
                            break;
                        }
                        xu5 q = nj6Arr2[i4].q();
                        oyb.l(q);
                        xu5 xu5 = this.X0.a(i3).d[0];
                        String str = xu5.n;
                        String str2 = q.n;
                        int g = c49.g(str2);
                        if (g == 3) {
                            if (oze.a(str2, str)) {
                                if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || q.G == xu5.G) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i4++;
                        } else if (g == c49.g(str)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    this.Z0[i3] = i4;
                }
                Iterator it = this.H0.iterator();
                while (it.hasNext()) {
                    ((hj6) it.next()).a();
                }
                return;
            }
            int length2 = this.K0.length;
            int i5 = 0;
            int i6 = -1;
            int i7 = -2;
            while (true) {
                int i8 = 1;
                if (i5 >= length2) {
                    break;
                }
                xu5 q2 = this.K0[i5].q();
                oyb.l(q2);
                String str3 = q2.n;
                if (c49.k(str3)) {
                    i8 = 2;
                } else if (!c49.h(str3)) {
                    i8 = c49.j(str3) ? 3 : -2;
                }
                if (v(i8) > v(i7)) {
                    i6 = i5;
                    i7 = i8;
                } else if (i8 == i7 && i6 != -1) {
                    i6 = -1;
                }
                i5++;
            }
            uoe uoe = this.o.h;
            int i9 = uoe.a;
            this.a1 = -1;
            this.Z0 = new int[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                this.Z0[i10] = i10;
            }
            uoe[] uoeArr = new uoe[length2];
            int i11 = 0;
            while (i11 < length2) {
                xu5 q3 = this.K0[i11].q();
                oyb.l(q3);
                String str4 = this.a;
                xu5 xu52 = this.Y;
                if (i11 == i6) {
                    xu5[] xu5Arr = new xu5[i9];
                    for (int i12 = z2; i12 < i9; i12++) {
                        xu5 xu53 = uoe.d[i12];
                        if (i7 == 1 && xu52 != null) {
                            xu53 = xu53.f(xu52);
                        }
                        xu5Arr[i12] = i9 == 1 ? q3.f(xu53) : n(xu53, q3, true);
                    }
                    uoeArr[i11] = new uoe(str4, xu5Arr);
                    this.a1 = i11;
                    z = false;
                } else {
                    if (i7 != 2 || !c49.h(q3.n)) {
                        xu52 = null;
                    }
                    StringBuilder n = me4.n(str4, ":muxed:");
                    n.append(i11 < i6 ? i11 : i11 - 1);
                    z = false;
                    uoeArr[i11] = new uoe(n.toString(), n(xu52, q3, false));
                }
                i11++;
                z2 = z;
            }
            boolean z3 = z2;
            this.X0 = j(uoeArr);
            oyb.k(this.Y0 == null ? true : z3);
            this.Y0 = Collections.emptySet();
            this.S0 = true;
            this.c.z();
        }
    }
}
