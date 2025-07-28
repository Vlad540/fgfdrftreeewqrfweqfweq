package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
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

/* renamed from: oj6  reason: default package */
public final class oj6 implements cj7, hj7, jyc, h75, tjc {
    public static final Set n1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    public final int A0;
    public final ud B0;
    public final ArrayList C0;
    public final List D0;
    public final ij6 E0;
    public final ij6 F0;
    public final Handler G0;
    public final ArrayList H0;
    public final Map I0;
    public xx2 J0;
    public mj6[] K0;
    public int[] L0;
    public final HashSet M0;
    public final SparseIntArray N0;
    public kj6 O0;
    public int P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public vu5 U0;
    public vu5 V0;
    public boolean W0;
    public final l34 X;
    public voe X0;
    public final vu5 Y;
    public Set Y0;
    public final mo4 Z;
    public int[] Z0;
    public final String a;
    public int a1;
    public final int b;
    public boolean b1;
    public final bi6 c;
    public boolean[] c1;
    public boolean[] d1;
    public long e1;
    public long f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public long k1;
    public wn4 l1;
    public zh6 m1;
    public final th6 o;
    public final eo4 w0;
    public final lk9 x0;
    public final jj7 y0 = new jj7("Loader:HlsSampleStreamWrapper");
    public final af8 z0;

    public oj6(String str, int i, bi6 bi6, th6 th6, Map map, l34 l34, long j, vu5 vu5, mo4 mo4, eo4 eo4, lk9 lk9, af8 af8, int i2) {
        this.a = str;
        this.b = i;
        this.c = bi6;
        this.o = th6;
        this.I0 = map;
        this.X = l34;
        this.Y = vu5;
        this.Z = mo4;
        this.w0 = eo4;
        this.x0 = lk9;
        this.z0 = af8;
        this.A0 = i2;
        ud udVar = new ud(9, (byte) 0);
        udVar.c = null;
        udVar.b = false;
        udVar.o = null;
        this.B0 = udVar;
        this.L0 = new int[0];
        Set set = n1;
        this.M0 = new HashSet(set.size());
        this.N0 = new SparseIntArray(set.size());
        this.K0 = new mj6[0];
        this.d1 = new boolean[0];
        this.c1 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.C0 = arrayList;
        this.D0 = Collections.unmodifiableList(arrayList);
        this.H0 = new ArrayList();
        this.E0 = new ij6(this, 0);
        this.F0 = new ij6(this, 1);
        this.G0 = mze.m((Handler.Callback) null);
        this.e1 = j;
        this.f1 = j;
    }

    public static vu5 h(vu5 vu5, vu5 vu52, boolean z) {
        String str;
        String str2;
        if (vu5 == null) {
            return vu52;
        }
        String str3 = vu52.A0;
        int g = b49.g(str3);
        String str4 = vu5.x0;
        if (mze.p(g, str4) == 1) {
            str2 = mze.q(g, str4);
            str = b49.c(str2);
        } else {
            String a2 = b49.a(str4, str3);
            str = str3;
            str2 = a2;
        }
        tu5 a3 = vu52.a();
        a3.a = vu5.a;
        a3.b = vu5.b;
        a3.c = vu5.c;
        a3.d = vu5.o;
        a3.e = vu5.X;
        a3.f = z ? vu5.Y : -1;
        a3.g = z ? vu5.Z : -1;
        a3.h = str2;
        if (g == 2) {
            a3.p = vu5.F0;
            a3.q = vu5.G0;
            a3.r = vu5.H0;
        }
        if (str != null) {
            a3.k = str;
        }
        int i = vu5.N0;
        if (i != -1 && g == 1) {
            a3.x = i;
        }
        y29 y29 = vu5.y0;
        if (y29 != null) {
            y29 y292 = vu52.y0;
            if (y292 != null) {
                w29[] w29Arr = y29.a;
                if (w29Arr.length == 0) {
                    y29 = y292;
                } else {
                    w29[] w29Arr2 = y292.a;
                    Object[] copyOf = Arrays.copyOf(w29Arr2, w29Arr2.length + w29Arr.length);
                    System.arraycopy(w29Arr, 0, copyOf, w29Arr2.length, w29Arr.length);
                    y29 = new y29((w29[]) copyOf);
                }
            }
            a3.i = y29;
        }
        return new vu5(a3);
    }

    public static int m(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public final boolean A(long j, boolean z) {
        this.e1 = j;
        if (n()) {
            this.f1 = j;
            return true;
        }
        if (this.R0 && !z) {
            int length = this.K0.length;
            int i = 0;
            while (i < length) {
                if (this.K0[i].A(j, false) || (!this.d1[i] && this.b1)) {
                    i++;
                }
            }
            return false;
        }
        this.f1 = j;
        this.i1 = false;
        this.C0.clear();
        jj7 jj7 = this.y0;
        if (jj7.C()) {
            if (this.R0) {
                for (mj6 i2 : this.K0) {
                    i2.i();
                }
            }
            jj7.o();
        } else {
            jj7.c = null;
            z();
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [xp4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ape B(int r12, int r13) {
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
            if (r1 == 0) goto L_0x0046
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r2.contains(r1)
            swb.e(r1)
            r1 = -1
            int r2 = r4.get(r13, r1)
            if (r2 != r1) goto L_0x0026
            goto L_0x0057
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
            mj6[] r1 = r11.K0
            r1 = r1[r2]
        L_0x003e:
            r6 = r1
            goto L_0x0057
        L_0x0040:
            xp4 r1 = new xp4
            r1.<init>()
            goto L_0x003e
        L_0x0046:
            r1 = r5
        L_0x0047:
            mj6[] r2 = r11.K0
            int r7 = r2.length
            if (r1 >= r7) goto L_0x0057
            int[] r7 = r11.L0
            r7 = r7[r1]
            if (r7 != r12) goto L_0x0055
            r6 = r2[r1]
            goto L_0x0057
        L_0x0055:
            int r1 = r1 + r0
            goto L_0x0047
        L_0x0057:
            if (r6 != 0) goto L_0x00e9
            boolean r1 = r11.j1
            if (r1 == 0) goto L_0x0063
            xp4 r11 = new xp4
            r11.<init>()
            return r11
        L_0x0063:
            mj6[] r1 = r11.K0
            int r1 = r1.length
            if (r13 == r0) goto L_0x006b
            r2 = 2
            if (r13 != r2) goto L_0x006c
        L_0x006b:
            r5 = r0
        L_0x006c:
            mj6 r6 = new mj6
            l34 r2 = r11.X
            java.util.Map r7 = r11.I0
            mo4 r8 = r11.Z
            eo4 r9 = r11.w0
            r6.<init>(r2, r8, r9, r7)
            long r7 = r11.e1
            r6.t = r7
            if (r5 == 0) goto L_0x0085
            wn4 r2 = r11.l1
            r6.I = r2
            r6.z = r0
        L_0x0085:
            long r7 = r11.k1
            long r9 = r6.F
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0091
            r6.F = r7
            r6.z = r0
        L_0x0091:
            zh6 r2 = r11.m1
            if (r2 == 0) goto L_0x0099
            int r2 = r2.z0
            r6.C = r2
        L_0x0099:
            r6.f = r11
            int[] r2 = r11.L0
            int r7 = r1 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r7)
            r11.L0 = r2
            r2[r1] = r12
            mj6[] r12 = r11.K0
            int r2 = defpackage.mze.a
            int r2 = r12.length
            int r2 = r2 + r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r12, r2)
            int r12 = r12.length
            r0[r12] = r6
            mj6[] r0 = (defpackage.mj6[]) r0
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
            int r12 = m(r13)
            int r0 = r11.P0
            int r0 = m(r0)
            if (r12 <= r0) goto L_0x00e1
            r11.Q0 = r1
            r11.P0 = r13
        L_0x00e1:
            boolean[] r12 = r11.c1
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.c1 = r12
        L_0x00e9:
            r12 = 5
            if (r13 != r12) goto L_0x00fc
            kj6 r12 = r11.O0
            if (r12 != 0) goto L_0x00f9
            kj6 r12 = new kj6
            int r13 = r11.A0
            r12.<init>(r6, r13)
            r11.O0 = r12
        L_0x00f9:
            kj6 r11 = r11.O0
            return r11
        L_0x00fc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj6.B(int, int):ape");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(long r56) {
        /*
            r55 = this;
            r0 = r55
            r10 = 1
            boolean r1 = r0.i1
            r11 = 0
            if (r1 != 0) goto L_0x0016
            jj7 r12 = r0.y0
            boolean r1 = r12.C()
            if (r1 != 0) goto L_0x0016
            boolean r1 = r12.B()
            if (r1 == 0) goto L_0x0019
        L_0x0016:
            r0 = r11
            goto L_0x053d
        L_0x0019:
            boolean r1 = r55.n()
            if (r1 == 0) goto L_0x0036
            java.util.List r1 = java.util.Collections.emptyList()
            long r2 = r0.f1
            mj6[] r4 = r0.K0
            int r5 = r4.length
            r6 = r11
        L_0x0029:
            if (r6 >= r5) goto L_0x0033
            r7 = r4[r6]
            long r8 = r0.f1
            r7.t = r8
            int r6 = r6 + r10
            goto L_0x0029
        L_0x0033:
            r8 = r1
            r14 = r2
            goto L_0x004e
        L_0x0036:
            zh6 r1 = r55.l()
            boolean r2 = r1.W0
            if (r2 == 0) goto L_0x0042
            long r1 = r1.w0
        L_0x0040:
            r2 = r1
            goto L_0x004b
        L_0x0042:
            long r2 = r0.e1
            long r4 = r1.Z
            long r1 = java.lang.Math.max(r2, r4)
            goto L_0x0040
        L_0x004b:
            java.util.List r1 = r0.D0
            goto L_0x0033
        L_0x004e:
            ud r13 = r0.B0
            r9 = 0
            r13.c = r9
            r13.b = r11
            r13.o = r9
            boolean r1 = r0.S0
            if (r1 != 0) goto L_0x0065
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r21 = r11
            goto L_0x0067
        L_0x0065:
            r21 = r10
        L_0x0067:
            th6 r6 = r0.o
            r6.getClass()
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0074
            r7 = r9
            goto L_0x007b
        L_0x0074:
            java.lang.Object r1 = defpackage.gwf.t(r8)
            zh6 r1 = (defpackage.zh6) r1
            r7 = r1
        L_0x007b:
            if (r7 != 0) goto L_0x007f
            r5 = -1
            goto L_0x0088
        L_0x007f:
            toe r1 = r6.h
            vu5 r2 = r7.o
            int r1 = r1.a(r2)
            r5 = r1
        L_0x0088:
            long r1 = r14 - r56
            r17 = r5
            long r4 = r6.r
            r22 = r12
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x009c
            long r4 = r4 - r56
            goto L_0x009d
        L_0x009c:
            r4 = r11
        L_0x009d:
            if (r7 == 0) goto L_0x00c0
            boolean r3 = r6.p
            if (r3 != 0) goto L_0x00c0
            long r9 = r7.w0
            long r11 = r7.Z
            long r9 = r9 - r11
            long r1 = r1 - r9
            r11 = 0
            long r1 = java.lang.Math.max(r11, r1)
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x00c0
            long r4 = r4 - r9
            long r3 = java.lang.Math.max(r11, r4)
            r9 = r3
        L_0x00be:
            r4 = r1
            goto L_0x00c2
        L_0x00c0:
            r9 = r4
            goto L_0x00be
        L_0x00c2:
            z18[] r11 = r6.a(r7, r14)
            f55 r1 = r6.q
            r2 = r56
            r12 = r17
            r0 = -1
            r0 = r6
            r57 = r7
            r6 = r9
            r10 = 0
            r9 = r11
            r1.t(r2, r4, r6, r8, r9)
            f55 r1 = r0.q
            int r5 = r1.i()
            if (r12 == r5) goto L_0x00e0
            r1 = 1
            goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            android.net.Uri[] r2 = r0.e
            r3 = r2[r5]
            f84 r4 = r0.g
            boolean r6 = r4.d(r3)
            if (r6 != 0) goto L_0x00ff
            r13.o = r3
            boolean r1 = r0.s
            android.net.Uri r2 = r0.o
            boolean r2 = r3.equals(r2)
            r1 = r1 & r2
            r0.s = r1
            r0.o = r3
            r0 = r13
            goto L_0x0478
        L_0x00ff:
            r6 = 1
            mi6 r7 = r4.a(r3, r6)
            r7.getClass()
            boolean r6 = r7.c
            r0.p = r6
            boolean r6 = r7.o
            long r8 = r7.h
            if (r6 == 0) goto L_0x0119
            r23 = r7
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0122
        L_0x0119:
            long r10 = r7.u
            long r10 = r10 + r8
            r23 = r7
            long r6 = r4.Z
            long r6 = r10 - r6
        L_0x0122:
            r0.r = r6
            long r6 = r4.Z
            long r8 = r8 - r6
            r7 = r13
            r13 = r0
            r10 = r14
            r14 = r57
            r15 = r1
            r16 = r23
            r17 = r8
            r19 = r10
            android.util.Pair r6 = r13.c(r14, r15, r16, r17, r19)
            java.lang.Object r13 = r6.first
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r16 = r5
            r17 = r6
            r15 = r23
            long r5 = r15.k
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0188
            r5 = r57
            if (r5 == 0) goto L_0x018a
            if (r1 == 0) goto L_0x018a
            r3 = r2[r12]
            r1 = 1
            mi6 r2 = r4.a(r3, r1)
            r2.getClass()
            long r8 = r4.Z
            long r13 = r2.h
            long r8 = r13 - r8
            r15 = 0
            r13 = r0
            r14 = r5
            r16 = r2
            r17 = r8
            r19 = r10
            android.util.Pair r1 = r13.c(r14, r15, r16, r17, r19)
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r13 = r4.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r15 = r2
            goto L_0x018e
        L_0x0188:
            r5 = r57
        L_0x018a:
            r12 = r16
            r1 = r17
        L_0x018e:
            long r10 = r15.k
            int r2 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x019e
            com.google.android.exoplayer2.source.BehindLiveWindowException r1 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r1.<init>()
            r0.n = r1
        L_0x019b:
            r0 = r7
            goto L_0x0478
        L_0x019e:
            r16 = r8
            long r8 = r13 - r10
            int r2 = (int) r8
            ws6 r4 = r15.r
            int r6 = r4.size()
            ws6 r8 = r15.s
            r18 = 1
            if (r2 != r6) goto L_0x01c6
            r6 = -1
            if (r1 == r6) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            int r2 = r8.size()
            if (r1 >= r2) goto L_0x0218
            sh6 r9 = new sh6
            java.lang.Object r2 = r8.get(r1)
            ji6 r2 = (defpackage.ji6) r2
            r9.<init>((defpackage.ji6) r2, (long) r13, (int) r1)
            goto L_0x0219
        L_0x01c6:
            java.lang.Object r6 = r4.get(r2)
            hi6 r6 = (defpackage.hi6) r6
            r9 = -1
            if (r1 != r9) goto L_0x01d6
            sh6 r1 = new sh6
            r1.<init>((defpackage.ji6) r6, (long) r13, (int) r9)
            r9 = r1
            goto L_0x0219
        L_0x01d6:
            ws6 r9 = r6.B0
            int r9 = r9.size()
            if (r1 >= r9) goto L_0x01ec
            sh6 r9 = new sh6
            ws6 r2 = r6.B0
            java.lang.Object r2 = r2.get(r1)
            ji6 r2 = (defpackage.ji6) r2
            r9.<init>((defpackage.ji6) r2, (long) r13, (int) r1)
            goto L_0x0219
        L_0x01ec:
            r1 = 1
            int r2 = r2 + r1
            int r1 = r4.size()
            if (r2 >= r1) goto L_0x0203
            sh6 r9 = new sh6
            java.lang.Object r1 = r4.get(r2)
            ji6 r1 = (defpackage.ji6) r1
            long r13 = r13 + r18
            r2 = -1
            r9.<init>((defpackage.ji6) r1, (long) r13, (int) r2)
            goto L_0x0219
        L_0x0203:
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0218
            sh6 r9 = new sh6
            r1 = 0
            java.lang.Object r2 = r8.get(r1)
            ji6 r2 = (defpackage.ji6) r2
            long r13 = r13 + r18
            r9.<init>((defpackage.ji6) r2, (long) r13, (int) r1)
            goto L_0x0219
        L_0x0218:
            r9 = 0
        L_0x0219:
            if (r9 != 0) goto L_0x024e
            boolean r1 = r15.o
            if (r1 != 0) goto L_0x0230
            r7.o = r3
            boolean r1 = r0.s
            android.net.Uri r2 = r0.o
            boolean r2 = r3.equals(r2)
            r1 = r1 & r2
            r0.s = r1
            r0.o = r3
            goto L_0x019b
        L_0x0230:
            if (r21 != 0) goto L_0x0238
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x023a
        L_0x0238:
            r0 = 1
            goto L_0x0250
        L_0x023a:
            sh6 r9 = new sh6
            java.lang.Object r1 = defpackage.gwf.t(r4)
            ji6 r1 = (defpackage.ji6) r1
            int r2 = r4.size()
            long r13 = (long) r2
            long r10 = r10 + r13
            long r10 = r10 - r18
            r2 = -1
            r9.<init>((defpackage.ji6) r1, (long) r10, (int) r2)
        L_0x024e:
            r1 = 0
            goto L_0x0254
        L_0x0250:
            r7.b = r0
            goto L_0x019b
        L_0x0254:
            r0.s = r1
            r1 = 0
            r0.o = r1
            java.lang.Comparable r1 = r9.d
            ji6 r1 = (defpackage.ji6) r1
            hi6 r2 = r1.b
            java.lang.String r4 = r15.a
            if (r2 == 0) goto L_0x026d
            java.lang.String r2 = r2.Z
            if (r2 != 0) goto L_0x0268
            goto L_0x026d
        L_0x0268:
            android.net.Uri r2 = defpackage.mt0.E(r4, r2)
            goto L_0x026e
        L_0x026d:
            r2 = 0
        L_0x026e:
            mh6 r8 = r0.d(r2, r12)
            r7.c = r8
            if (r8 == 0) goto L_0x0278
        L_0x0276:
            goto L_0x019b
        L_0x0278:
            java.lang.String r8 = r1.Z
            if (r8 != 0) goto L_0x027e
            r8 = 0
            goto L_0x0282
        L_0x027e:
            android.net.Uri r8 = defpackage.mt0.E(r4, r8)
        L_0x0282:
            mh6 r10 = r0.d(r8, r12)
            r7.c = r10
            if (r10 == 0) goto L_0x028b
            goto L_0x0276
        L_0x028b:
            long r10 = r1.X
            if (r5 != 0) goto L_0x0296
            java.util.concurrent.atomic.AtomicInteger r13 = defpackage.zh6.a1
        L_0x0291:
            r19 = r7
            r53 = 0
            goto L_0x02cd
        L_0x0296:
            android.net.Uri r13 = r5.B0
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x02a3
            boolean r13 = r5.W0
            if (r13 == 0) goto L_0x02a3
            goto L_0x0291
        L_0x02a3:
            long r13 = r16 + r10
            boolean r6 = r1 instanceof defpackage.di6
            r19 = r7
            boolean r7 = r15.c
            if (r6 == 0) goto L_0x02bf
            r6 = r1
            di6 r6 = (defpackage.di6) r6
            boolean r6 = r6.A0
            if (r6 != 0) goto L_0x02bd
            int r6 = r9.b
            if (r6 != 0) goto L_0x02bb
            if (r7 == 0) goto L_0x02bb
            goto L_0x02bd
        L_0x02bb:
            r6 = 0
            goto L_0x02be
        L_0x02bd:
            r6 = 1
        L_0x02be:
            r7 = r6
        L_0x02bf:
            if (r7 == 0) goto L_0x02ca
            long r6 = r5.w0
            int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x02c8
            goto L_0x02ca
        L_0x02c8:
            r6 = 0
            goto L_0x02cb
        L_0x02ca:
            r6 = 1
        L_0x02cb:
            r53 = r6
        L_0x02cd:
            boolean r6 = r9.c
            if (r53 == 0) goto L_0x02d7
            if (r6 == 0) goto L_0x02d7
            r0 = r19
            goto L_0x0478
        L_0x02d7:
            vu5[] r7 = r0.f
            r28 = r7[r12]
            f55 r7 = r0.q
            int r35 = r7.k()
            f55 r7 = r0.q
            java.lang.Object r36 = r7.m()
            boolean r7 = r0.l
            nfc r12 = r0.j
            if (r8 != 0) goto L_0x02f2
            r12.getClass()
            r8 = 0
            goto L_0x02fc
        L_0x02f2:
            java.lang.Object r13 = r12.b
            q16 r13 = (defpackage.q16) r13
            java.lang.Object r8 = r13.get(r8)
            byte[] r8 = (byte[]) r8
        L_0x02fc:
            if (r2 != 0) goto L_0x0300
            r2 = 0
            goto L_0x030a
        L_0x0300:
            java.lang.Object r12 = r12.b
            q16 r12 = (defpackage.q16) r12
            java.lang.Object r2 = r12.get(r2)
            byte[] r2 = (byte[]) r2
        L_0x030a:
            java.util.concurrent.atomic.AtomicInteger r12 = defpackage.zh6.a1
            java.util.Map r43 = java.util.Collections.emptyMap()
            java.lang.String r12 = r1.a
            android.net.Uri r38 = defpackage.mt0.E(r4, r12)
            if (r6 == 0) goto L_0x031d
            r12 = 8
            r49 = r12
            goto L_0x031f
        L_0x031d:
            r49 = 0
        L_0x031f:
            if (r38 == 0) goto L_0x0535
            xz3 r27 = new xz3
            r48 = 0
            r50 = 0
            r39 = 0
            r41 = 1
            r42 = 0
            long r12 = r1.x0
            r14 = r6
            r20 = r7
            long r6 = r1.y0
            r37 = r27
            r44 = r12
            r46 = r6
            r37.<init>(r38, r39, r41, r42, r43, r44, r46, r48, r49, r50)
            if (r8 == 0) goto L_0x0342
            r29 = 1
            goto L_0x0344
        L_0x0342:
            r29 = 0
        L_0x0344:
            if (r29 == 0) goto L_0x0350
            java.lang.String r6 = r1.w0
            r6.getClass()
            byte[] r6 = defpackage.zh6.e(r6)
            goto L_0x0351
        L_0x0350:
            r6 = 0
        L_0x0351:
            oz3 r7 = r0.b
            if (r8 == 0) goto L_0x0360
            r6.getClass()
            jc r12 = new jc
            r12.<init>(r7, r8, r6)
            r26 = r12
            goto L_0x0362
        L_0x0360:
            r26 = r7
        L_0x0362:
            hi6 r6 = r1.b
            if (r6 == 0) goto L_0x03b6
            if (r2 == 0) goto L_0x036a
            r8 = 1
            goto L_0x036b
        L_0x036a:
            r8 = 0
        L_0x036b:
            if (r8 == 0) goto L_0x0377
            java.lang.String r12 = r6.w0
            r12.getClass()
            byte[] r12 = defpackage.zh6.e(r12)
            goto L_0x0378
        L_0x0377:
            r12 = 0
        L_0x0378:
            java.lang.String r13 = r6.a
            android.net.Uri r38 = defpackage.mt0.E(r4, r13)
            xz3 r4 = new xz3
            r56 = r8
            r13 = r9
            long r8 = r6.x0
            r21 = r13
            r57 = r14
            long r13 = r6.y0
            java.util.Map r43 = java.util.Collections.emptyMap()
            r49 = 0
            r50 = 0
            r39 = 0
            r41 = 1
            r42 = 0
            r48 = 0
            r37 = r4
            r44 = r8
            r46 = r13
            r37.<init>(r38, r39, r41, r42, r43, r44, r46, r48, r49, r50)
            if (r2 == 0) goto L_0x03b0
            r12.getClass()
            jc r6 = new jc
            r6.<init>(r7, r2, r12)
            r9 = r6
            goto L_0x03b1
        L_0x03b0:
            r9 = r7
        L_0x03b1:
            r32 = r56
            r30 = r9
            goto L_0x03bf
        L_0x03b6:
            r21 = r9
            r57 = r14
            r4 = 0
            r30 = 0
            r32 = 0
        L_0x03bf:
            long r37 = r16 + r10
            long r6 = r1.c
            long r39 = r37 + r6
            int r2 = r15.j
            int r6 = r1.o
            int r2 = r2 + r6
            if (r5 == 0) goto L_0x0414
            xz3 r6 = r5.F0
            if (r4 == r6) goto L_0x03e9
            if (r4 == 0) goto L_0x03e7
            if (r6 == 0) goto L_0x03e7
            android.net.Uri r7 = r4.a
            android.net.Uri r8 = r6.a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x03e7
            long r7 = r4.f
            long r9 = r6.f
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x03e7
            goto L_0x03e9
        L_0x03e7:
            r6 = 0
            goto L_0x03ea
        L_0x03e9:
            r6 = 1
        L_0x03ea:
            android.net.Uri r7 = r5.B0
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x03f8
            boolean r7 = r5.W0
            if (r7 == 0) goto L_0x03f8
            r7 = 1
            goto L_0x03f9
        L_0x03f8:
            r7 = 0
        L_0x03f9:
            if (r6 == 0) goto L_0x0408
            if (r7 == 0) goto L_0x0408
            boolean r6 = r5.Y0
            if (r6 != 0) goto L_0x0408
            int r6 = r5.A0
            if (r6 != r2) goto L_0x0408
            it4 r9 = r5.R0
            goto L_0x0409
        L_0x0408:
            r9 = 0
        L_0x0409:
            vo6 r6 = r5.N0
            yze r5 = r5.O0
            r52 = r5
            r51 = r6
            r50 = r9
            goto L_0x0427
        L_0x0414:
            vo6 r5 = new vo6
            r6 = 0
            r5.<init>(r6)
            yze r7 = new yze
            r8 = 10
            r7.<init>((int) r8)
            r51 = r5
            r50 = r6
            r52 = r7
        L_0x0427:
            zh6 r5 = new zh6
            r6 = 1
            r44 = r57 ^ 1
            mod r6 = r0.d
            java.lang.Object r6 = r6.b
            android.util.SparseArray r6 = (android.util.SparseArray) r6
            java.lang.Object r7 = r6.get(r2)
            bke r7 = (defpackage.bke) r7
            if (r7 != 0) goto L_0x0447
            bke r7 = new bke
            r8 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r7.<init>(r8)
            r6.put(r2, r7)
        L_0x0447:
            r48 = r7
            r9 = r21
            int r6 = r9.b
            r43 = r6
            boolean r6 = r1.z0
            r46 = r6
            wh6 r6 = r0.a
            r25 = r6
            java.util.List r6 = r0.i
            r34 = r6
            long r6 = r9.a
            r41 = r6
            wn4 r1 = r1.Y
            r49 = r1
            bza r0 = r0.k
            r54 = r0
            r24 = r5
            r31 = r4
            r33 = r3
            r45 = r2
            r47 = r20
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r0 = r19
            r0.c = r5
        L_0x0478:
            boolean r1 = r0.b
            java.lang.Object r2 = r0.c
            xx2 r2 = (defpackage.xx2) r2
            java.lang.Object r0 = r0.o
            android.net.Uri r0 = (android.net.Uri) r0
            if (r1 == 0) goto L_0x0491
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r55
            r1.f1 = r3
            r0 = 1
            r1.i1 = r0
            return r0
        L_0x0491:
            r1 = r55
            if (r2 != 0) goto L_0x04aa
            if (r0 == 0) goto L_0x04a8
            bi6 r1 = r1.c
            f84 r1 = r1.b
            java.util.HashMap r1 = r1.b
            java.lang.Object r0 = r1.get(r0)
            d84 r0 = (defpackage.d84) r0
            android.net.Uri r1 = r0.a
            r0.c(r1)
        L_0x04a8:
            r0 = 0
            return r0
        L_0x04aa:
            boolean r0 = r2 instanceof defpackage.zh6
            if (r0 == 0) goto L_0x0500
            r0 = r2
            zh6 r0 = (defpackage.zh6) r0
            r1.m1 = r0
            vu5 r3 = r0.o
            r1.U0 = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.f1 = r3
            java.util.ArrayList r3 = r1.C0
            r3.add(r0)
            ts6 r3 = defpackage.ws6.i()
            mj6[] r4 = r1.K0
            int r5 = r4.length
            r6 = 0
        L_0x04cb:
            if (r6 >= r5) goto L_0x04de
            r7 = r4[r6]
            int r8 = r7.q
            int r7 = r7.p
            int r8 = r8 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3.a(r7)
            r7 = 1
            int r6 = r6 + r7
            goto L_0x04cb
        L_0x04de:
            e8c r3 = r3.j()
            r0.S0 = r1
            r0.X0 = r3
            mj6[] r3 = r1.K0
            int r4 = r3.length
            r11 = 0
        L_0x04ea:
            if (r11 >= r4) goto L_0x0500
            r5 = r3[r11]
            r5.getClass()
            int r6 = r0.z0
            r5.C = r6
            boolean r6 = r0.C0
            if (r6 == 0) goto L_0x04fd
            r6 = 1
            r5.G = r6
            goto L_0x04fe
        L_0x04fd:
            r6 = 1
        L_0x04fe:
            int r11 = r11 + r6
            goto L_0x04ea
        L_0x0500:
            r1.J0 = r2
            lk9 r0 = r1.x0
            int r3 = r2.c
            int r0 = r0.h(r3)
            r3 = r22
            long r8 = r3.G(r2, r1, r0)
            xi7 r11 = new xi7
            long r5 = r2.a
            xz3 r7 = r2.b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r15 = r2.X
            java.lang.Object r0 = r2.Y
            af8 r10 = r1.z0
            int r12 = r2.c
            int r13 = r1.b
            vu5 r14 = r2.o
            long r3 = r2.Z
            long r1 = r2.w0
            r16 = r0
            r17 = r3
            r19 = r1
            r10.k(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
            return r0
        L_0x0535:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The uri must be set."
            r0.<init>(r1)
            throw r0
        L_0x053d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj6.F(long):boolean");
    }

    public final void K(utc utc) {
    }

    public final void a() {
        for (mj6 mj6 : this.K0) {
            mj6.z(true);
            yn4 yn4 = mj6.h;
            if (yn4 != null) {
                yn4.f(mj6.e);
                mj6.h = null;
                mj6.g = null;
            }
        }
    }

    public final boolean b() {
        return this.y0.C();
    }

    public final void c() {
        this.G0.post(this.E0);
    }

    public final void d() {
        swb.h(this.S0);
        this.X0.getClass();
        this.Y0.getClass();
    }

    public final voe e(toe[] toeArr) {
        for (int i = 0; i < toeArr.length; i++) {
            toe toe = toeArr[i];
            vu5[] vu5Arr = new vu5[toe.a];
            for (int i2 = 0; i2 < toe.a; i2++) {
                vu5 vu5 = toe.c[i2];
                int b2 = this.Z.b(vu5);
                tu5 a2 = vu5.a();
                a2.D = b2;
                vu5Arr[i2] = a2.a();
            }
            toeArr[i] = new toe(toe.b, vu5Arr);
        }
        return new voe(toeArr);
    }

    public final long f() {
        if (n()) {
            return this.f1;
        }
        if (this.i1) {
            return Long.MIN_VALUE;
        }
        return l().w0;
    }

    public final void g(fj7 fj7, long j, long j2, boolean z) {
        xx2 xx2 = (xx2) fj7;
        this.J0 = null;
        long j3 = xx2.a;
        esd esd = xx2.x0;
        xi7 xi7 = new xi7(j3, xx2.b, esd.c, esd.o, j, j2, esd.b);
        this.x0.getClass();
        xi7 xi72 = xi7;
        this.z0.d(xi72, xx2.c, this.b, xx2.o, xx2.X, xx2.Y, xx2.Z, xx2.w0);
        if (!z) {
            if (n() || this.T0 == 0) {
                z();
            }
            if (this.T0 > 0) {
                this.c.c(this);
            }
        }
    }

    public final void j(int i) {
        ArrayList arrayList;
        swb.h(!this.y0.C());
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
                    zh6 zh6 = (zh6) arrayList.get(i2);
                    int i4 = 0;
                    while (i4 < this.K0.length) {
                        if (this.K0[i4].o() <= zh6.f(i4)) {
                            i4++;
                        }
                    }
                    break loop0;
                } else if (((zh6) arrayList.get(i3)).C0) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 != -1) {
            long j = l().w0;
            zh6 zh62 = (zh6) arrayList.get(i2);
            mze.I(arrayList, i2, arrayList.size());
            for (int i5 = 0; i5 < this.K0.length; i5++) {
                this.K0[i5].k(zh62.f(i5));
            }
            if (arrayList.isEmpty()) {
                this.f1 = this.e1;
            } else {
                ((zh6) gwf.t(arrayList)).Y0 = true;
            }
            this.i1 = false;
            int i6 = this.P0;
            long j2 = zh62.Z;
            af8 af8 = this.z0;
            af8.m(new i78(1, i6, (Object) null, 3, (Object) null, af8.a(j2), af8.a(j)));
        }
    }

    public final zh6 l() {
        return (zh6) rf0.e(this.C0, 1);
    }

    public final boolean n() {
        return this.f1 != -9223372036854775807L;
    }

    public final void q(fj7 fj7, long j, long j2) {
        xx2 xx2 = (xx2) fj7;
        this.J0 = null;
        th6 th6 = this.o;
        th6.getClass();
        if (xx2 instanceof mh6) {
            mh6 mh6 = (mh6) xx2;
            th6.m = mh6.y0;
            Uri uri = mh6.b.a;
            byte[] bArr = mh6.A0;
            bArr.getClass();
            nfc nfc = th6.j;
            nfc.getClass();
            uri.getClass();
            byte[] bArr2 = (byte[]) ((q16) nfc.b).put(uri, bArr);
        }
        long j3 = xx2.a;
        esd esd = xx2.x0;
        xi7 xi7 = new xi7(j3, xx2.b, esd.c, esd.o, j, j2, esd.b);
        this.x0.getClass();
        xi7 xi72 = xi7;
        this.z0.f(xi72, xx2.c, this.b, xx2.o, xx2.X, xx2.Y, xx2.Z, xx2.w0);
        if (!this.S0) {
            F(this.e1);
        } else {
            this.c.c(this);
        }
    }

    public final long r() {
        long j;
        if (this.i1) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.f1;
        }
        long j2 = this.e1;
        zh6 l = l();
        if (!l.W0) {
            ArrayList arrayList = this.C0;
            l = arrayList.size() > 1 ? (zh6) rf0.e(arrayList, 2) : null;
        }
        if (l != null) {
            j2 = Math.max(j2, l.w0);
        }
        if (this.R0) {
            for (mj6 mj6 : this.K0) {
                synchronized (mj6) {
                    j = mj6.v;
                }
                j2 = Math.max(j2, j);
            }
        }
        return j2;
    }

    public final void t() {
        boolean z;
        if (!this.W0 && this.Z0 == null && this.R0) {
            mj6[] mj6Arr = this.K0;
            int length = mj6Arr.length;
            boolean z2 = false;
            int i = 0;
            while (i < length) {
                if (mj6Arr[i].r() != null) {
                    i++;
                } else {
                    return;
                }
            }
            voe voe = this.X0;
            if (voe != null) {
                int i2 = voe.a;
                int[] iArr = new int[i2];
                this.Z0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = 0;
                    while (true) {
                        mj6[] mj6Arr2 = this.K0;
                        if (i4 >= mj6Arr2.length) {
                            break;
                        }
                        vu5 r = mj6Arr2[i4].r();
                        swb.i(r);
                        vu5 vu5 = this.X0.a(i3).c[0];
                        String str = vu5.A0;
                        String str2 = r.A0;
                        int g = b49.g(str2);
                        if (g == 3) {
                            if (mze.a(str2, str)) {
                                if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || r.S0 == vu5.S0) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i4++;
                        } else if (g == b49.g(str)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    this.Z0[i3] = i4;
                }
                Iterator it = this.H0.iterator();
                while (it.hasNext()) {
                    ((gj6) it.next()).a();
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
                vu5 r2 = this.K0[i5].r();
                swb.i(r2);
                String str3 = r2.A0;
                if (b49.j(str3)) {
                    i8 = 2;
                } else if (!b49.h(str3)) {
                    i8 = b49.i(str3) ? 3 : -2;
                }
                if (m(i8) > m(i7)) {
                    i6 = i5;
                    i7 = i8;
                } else if (i8 == i7 && i6 != -1) {
                    i6 = -1;
                }
                i5++;
            }
            toe toe = this.o.h;
            int i9 = toe.a;
            this.a1 = -1;
            this.Z0 = new int[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                this.Z0[i10] = i10;
            }
            toe[] toeArr = new toe[length2];
            int i11 = 0;
            while (i11 < length2) {
                vu5 r3 = this.K0[i11].r();
                swb.i(r3);
                String str4 = this.a;
                vu5 vu52 = this.Y;
                if (i11 == i6) {
                    vu5[] vu5Arr = new vu5[i9];
                    for (int i12 = z2; i12 < i9; i12++) {
                        vu5 vu53 = toe.c[i12];
                        if (i7 == 1 && vu52 != null) {
                            vu53 = vu53.d(vu52);
                        }
                        vu5Arr[i12] = i9 == 1 ? r3.d(vu53) : h(vu53, r3, true);
                    }
                    toeArr[i11] = new toe(str4, vu5Arr);
                    this.a1 = i11;
                    z = false;
                } else {
                    if (i7 != 2 || !b49.h(r3.A0)) {
                        vu52 = null;
                    }
                    int i13 = i11 < i6 ? i11 : i11 - 1;
                    StringBuilder sb = new StringBuilder(me4.e(18, str4));
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i13);
                    z = false;
                    toeArr[i11] = new toe(sb.toString(), h(vu52, r3, false));
                }
                i11++;
                z2 = z;
            }
            boolean z3 = z2;
            this.X0 = e(toeArr);
            swb.h(this.Y0 == null ? true : z3);
            this.Y0 = Collections.emptySet();
            this.S0 = true;
            this.c.j();
        }
    }

    public final void u(long j) {
        jj7 jj7 = this.y0;
        if (!jj7.B() && !n()) {
            boolean C = jj7.C();
            th6 th6 = this.o;
            List list = this.D0;
            if (C) {
                this.J0.getClass();
                if (th6.n != null ? false : th6.q.u(j, this.J0, list)) {
                    jj7.o();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && th6.b((zh6) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                j(size);
            }
            int size2 = (th6.n != null || th6.q.length() < 2) ? list.size() : th6.q.g(j, list);
            if (size2 < this.C0.size()) {
                j(size2);
            }
        }
    }

    public final void v() {
        this.y0.c();
        th6 th6 = this.o;
        BehindLiveWindowException behindLiveWindowException = th6.n;
        if (behindLiveWindowException == null) {
            Uri uri = th6.o;
            if (uri != null && th6.s) {
                d84 d84 = (d84) th6.g.b.get(uri);
                d84.b.c();
                IOException iOException = d84.y0;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw behindLiveWindowException;
    }

    public final void w() {
        this.j1 = true;
        this.G0.post(this.F0);
    }

    public final void x(toe[] toeArr, int... iArr) {
        this.X0 = e(toeArr);
        this.Y0 = new HashSet();
        for (int a2 : iArr) {
            this.Y0.add(this.X0.a(a2));
        }
        this.a1 = 0;
        Handler handler = this.G0;
        bi6 bi6 = this.c;
        Objects.requireNonNull(bi6);
        handler.post(new oc4(26, bi6));
        this.S0 = true;
    }

    public final sz0 y(fj7 fj7, long j, long j2, IOException iOException, int i) {
        boolean z;
        sz0 sz0;
        int i2;
        IOException iOException2 = iOException;
        xx2 xx2 = (xx2) fj7;
        boolean z2 = xx2 instanceof zh6;
        if (z2 && !((zh6) xx2).Z0 && (iOException2 instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException2).c) == 410 || i2 == 404)) {
            return jj7.o;
        }
        long j3 = xx2.x0.b;
        esd esd = xx2.x0;
        xi7 xi7 = new xi7(xx2.a, xx2.b, esd.c, esd.o, j, j2, j3);
        mze.M(xx2.Z);
        mze.M(xx2.w0);
        wi7 wi7 = new wi7(i, iOException2);
        th6 th6 = this.o;
        nv4 o2 = ek8.o(th6.q);
        this.x0.getClass();
        sz0 f = lk9.f(o2, wi7);
        boolean z3 = false;
        if (f == null || f.b != 2) {
            z = false;
        } else {
            f55 f55 = th6.q;
            z = f55.r(f55.p(th6.h.a(xx2.o)), f.c);
        }
        if (z) {
            if (z2 && j3 == 0) {
                ArrayList arrayList = this.C0;
                if (((zh6) arrayList.remove(arrayList.size() - 1)) == xx2) {
                    z3 = true;
                }
                swb.h(z3);
                if (arrayList.isEmpty()) {
                    this.f1 = this.e1;
                } else {
                    ((zh6) gwf.t(arrayList)).Y0 = true;
                }
            }
            sz0 = jj7.X;
        } else {
            long j4 = lk9.j(wi7);
            sz0 = j4 != -9223372036854775807L ? new sz0(j4, 0, 4, false) : jj7.Y;
        }
        sz0 sz02 = sz0;
        boolean z4 = !sz02.a();
        this.z0.h(xi7, xx2.c, this.b, xx2.o, xx2.X, xx2.Y, xx2.Z, xx2.w0, iOException, z4);
        if (z4) {
            this.J0 = null;
        }
        if (z) {
            if (!this.S0) {
                F(this.e1);
            } else {
                this.c.c(this);
            }
        }
        return sz02;
    }

    public final void z() {
        for (mj6 z : this.K0) {
            z.z(this.g1);
        }
        this.g1 = false;
    }
}
