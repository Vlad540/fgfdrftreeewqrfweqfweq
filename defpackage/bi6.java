package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bi6  reason: default package */
public final class bi6 implements r88, cj6, hyc {
    public final lu7 A0;
    public final boolean B0;
    public final int C0;
    public final boolean D0;
    public final bza E0;
    public p88 F0;
    public int G0;
    public voe H0;
    public oj6[] I0 = new oj6[0];
    public oj6[] J0 = new oj6[0];
    public int K0;
    public wwc L0 = new wwc(9, new jyc[0]);
    public final mo4 X;
    public final eo4 Y;
    public final lk9 Z;
    public final wh6 a;
    public final f84 b;
    public final e3 c;
    public final bqe o;
    public final af8 w0;
    public final l34 x0;
    public final IdentityHashMap y0 = new IdentityHashMap();
    public final mod z0 = new mod(29);

    public bi6(wh6 wh6, f84 f84, e3 e3Var, bqe bqe, mo4 mo4, eo4 eo4, lk9 lk9, af8 af8, l34 l34, lu7 lu7, boolean z, int i, boolean z2, bza bza) {
        this.a = wh6;
        this.b = f84;
        this.c = e3Var;
        this.o = bqe;
        this.X = mo4;
        this.Y = eo4;
        this.Z = lk9;
        this.w0 = af8;
        this.x0 = l34;
        this.A0 = lu7;
        this.B0 = z;
        this.C0 = i;
        this.D0 = z2;
        this.E0 = bza;
        lu7.getClass();
    }

    public static vu5 h(vu5 vu5, vu5 vu52, boolean z) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        y29 y29;
        String str3;
        int i4 = -1;
        if (vu52 != null) {
            str3 = vu52.x0;
            y29 = vu52.y0;
            i3 = vu52.N0;
            i2 = vu52.o;
            i = vu52.X;
            str2 = vu52.c;
            str = vu52.b;
        } else {
            str3 = mze.q(1, vu5.x0);
            y29 = vu5.y0;
            if (z) {
                i3 = vu5.N0;
                i2 = vu5.o;
                i = vu5.X;
                str2 = vu5.c;
                str = vu5.b;
            } else {
                i2 = 0;
                str2 = null;
                i3 = -1;
                i = 0;
                str = null;
            }
        }
        String c2 = b49.c(str3);
        int i5 = z ? vu5.Y : -1;
        if (z) {
            i4 = vu5.Z;
        }
        tu5 tu5 = new tu5();
        tu5.a = vu5.a;
        tu5.b = str;
        tu5.j = vu5.z0;
        tu5.k = c2;
        tu5.h = str3;
        tu5.i = y29;
        tu5.f = i5;
        tu5.g = i4;
        tu5.x = i3;
        tu5.d = i2;
        tu5.e = i;
        tu5.c = str2;
        return new vu5(tu5);
    }

    public final long D(long j, wtc wtc) {
        oj6[] oj6Arr = this.J0;
        int length = oj6Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            oj6 oj6 = oj6Arr[i];
            if (oj6.P0 == 2) {
                th6 th6 = oj6.o;
                int b2 = th6.q.b();
                Uri[] uriArr = th6.e;
                int length2 = uriArr.length;
                f84 f84 = th6.g;
                mi6 a2 = (b2 >= length2 || b2 == -1) ? null : f84.a(uriArr[th6.q.i()], true);
                if (a2 != null) {
                    ws6 ws6 = a2.r;
                    if (!ws6.isEmpty() && a2.c) {
                        long j2 = a2.h - f84.Z;
                        long j3 = j - j2;
                        int e = mze.e(Long.valueOf(j3), ws6, true);
                        long j4 = ((hi6) ws6.get(e)).X;
                        return wtc.a(j3, j4, e != ws6.size() - 1 ? ((hi6) ws6.get(e + 1)).X : j4) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    public final boolean F(long j) {
        if (this.H0 != null) {
            return this.L0.F(j);
        }
        for (oj6 oj6 : this.I0) {
            if (!oj6.S0) {
                oj6.F(oj6.e1);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011a, code lost:
        if (r2[r13] != 1) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L(defpackage.p88 r26, long r27) {
        /*
            r25 = this;
            r10 = r25
            r11 = 1
            r0 = r26
            r10.F0 = r0
            f84 r0 = r10.b
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.c
            r1.add(r10)
            java.lang.Object r0 = r0.C0
            r12 = r0
            ui6 r12 = (defpackage.ui6) r12
            r12.getClass()
            boolean r0 = r10.D0
            r13 = 0
            if (r0 == 0) goto L_0x008d
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r12.m
            r0.<init>(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r13
        L_0x002b:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x008b
            java.lang.Object r4 = r1.get(r3)
            wn4 r4 = (defpackage.wn4) r4
            java.lang.String r5 = r4.c
            int r3 = r3 + r11
            r6 = r3
        L_0x003b:
            int r7 = r0.size()
            if (r6 >= r7) goto L_0x0087
            java.lang.Object r7 = r0.get(r6)
            wn4 r7 = (defpackage.wn4) r7
            java.lang.String r8 = r7.c
            boolean r8 = android.text.TextUtils.equals(r8, r5)
            if (r8 == 0) goto L_0x0085
            java.lang.String r8 = r4.c
            java.lang.String r9 = r7.c
            if (r8 == 0) goto L_0x0060
            if (r9 == 0) goto L_0x0060
            boolean r14 = android.text.TextUtils.equals(r8, r9)
            if (r14 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r14 = r13
            goto L_0x0061
        L_0x0060:
            r14 = r11
        L_0x0061:
            swb.h(r14)
            if (r8 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r8 = r9
        L_0x0068:
            int r9 = defpackage.mze.a
            un4[] r4 = r4.a
            int r9 = r4.length
            un4[] r7 = r7.a
            int r14 = r7.length
            int r9 = r9 + r14
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r4, r9)
            int r4 = r4.length
            int r14 = r7.length
            java.lang.System.arraycopy(r7, r13, r9, r4, r14)
            un4[] r9 = (defpackage.un4[]) r9
            wn4 r4 = new wn4
            r4.<init>(r8, r11, r9)
            r0.remove(r6)
            goto L_0x003b
        L_0x0085:
            int r6 = r6 + r11
            goto L_0x003b
        L_0x0087:
            r2.put(r5, r4)
            goto L_0x002b
        L_0x008b:
            r14 = r2
            goto L_0x0092
        L_0x008d:
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x008b
        L_0x0092:
            java.util.List r0 = r12.e
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r11
            r10.G0 = r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            boolean r9 = r10.B0
            java.util.List r7 = r12.g
            if (r1 == 0) goto L_0x0295
            int r1 = r0.size()
            int[] r2 = new int[r1]
            r3 = r13
            r4 = r3
            r5 = r4
        L_0x00b4:
            int r6 = r0.size()
            r13 = 2
            if (r3 >= r6) goto L_0x00e6
            java.lang.Object r6 = r0.get(r3)
            si6 r6 = (defpackage.si6) r6
            vu5 r6 = r6.b
            int r11 = r6.G0
            if (r11 > 0) goto L_0x00cf
            java.lang.String r6 = r6.x0
            java.lang.String r11 = defpackage.mze.q(r13, r6)
            if (r11 == 0) goto L_0x00d1
        L_0x00cf:
            r11 = 1
            goto L_0x00e0
        L_0x00d1:
            r11 = 1
            java.lang.String r6 = defpackage.mze.q(r11, r6)
            if (r6 == 0) goto L_0x00dc
            r2[r3] = r11
            int r5 = r5 + r11
            goto L_0x00e3
        L_0x00dc:
            r6 = -1
            r2[r3] = r6
            goto L_0x00e3
        L_0x00e0:
            r2[r3] = r13
            int r4 = r4 + r11
        L_0x00e3:
            int r3 = r3 + r11
            r13 = 0
            goto L_0x00b4
        L_0x00e6:
            if (r4 <= 0) goto L_0x00ec
            r11 = r4
            r1 = 1
        L_0x00ea:
            r3 = 0
            goto L_0x00f6
        L_0x00ec:
            if (r5 >= r1) goto L_0x00f3
            int r1 = r1 - r5
            r11 = r1
            r1 = 0
            r3 = 1
            goto L_0x00f6
        L_0x00f3:
            r11 = r1
            r1 = 0
            goto L_0x00ea
        L_0x00f6:
            android.net.Uri[] r4 = new android.net.Uri[r11]
            vu5[] r6 = new defpackage.vu5[r11]
            int[] r5 = new int[r11]
            r18 = r7
            r13 = 0
            r17 = 0
        L_0x0101:
            int r7 = r0.size()
            if (r13 >= r7) goto L_0x0139
            if (r1 == 0) goto L_0x0113
            r7 = r2[r13]
            r19 = r8
            r8 = 2
            if (r7 != r8) goto L_0x0111
            goto L_0x0115
        L_0x0111:
            r8 = 1
            goto L_0x011d
        L_0x0113:
            r19 = r8
        L_0x0115:
            if (r3 == 0) goto L_0x011f
            r7 = r2[r13]
            r8 = 1
            if (r7 == r8) goto L_0x011d
            goto L_0x0120
        L_0x011d:
            r7 = r8
            goto L_0x0135
        L_0x011f:
            r8 = 1
        L_0x0120:
            java.lang.Object r7 = r0.get(r13)
            si6 r7 = (defpackage.si6) r7
            android.net.Uri r8 = r7.a
            r4[r17] = r8
            vu5 r7 = r7.b
            r6[r17] = r7
            r7 = 1
            int r8 = r17 + 1
            r5[r17] = r13
            r17 = r8
        L_0x0135:
            int r13 = r13 + r7
            r8 = r19
            goto L_0x0101
        L_0x0139:
            r19 = r8
            r7 = 1
            r8 = 0
            r0 = r6[r8]
            java.lang.String r0 = r0.x0
            r2 = 2
            int r13 = defpackage.mze.p(r2, r0)
            int r8 = defpackage.mze.p(r7, r0)
            if (r8 > r7) goto L_0x0155
            if (r13 > r7) goto L_0x0155
            int r0 = r8 + r13
            if (r0 <= 0) goto L_0x0155
            r17 = 1
            goto L_0x0157
        L_0x0155:
            r17 = 0
        L_0x0157:
            if (r1 != 0) goto L_0x015d
            if (r8 <= 0) goto L_0x015d
            r2 = 1
            goto L_0x015e
        L_0x015d:
            r2 = 0
        L_0x015e:
            java.lang.String r7 = "main"
            vu5 r3 = r12.j
            java.util.List r1 = r12.k
            r0 = r25
            r20 = r1
            r1 = r7
            r21 = r3
            r3 = r4
            r4 = r6
            r10 = r5
            r5 = r21
            r21 = r6
            r6 = r20
            r22 = r7
            r20 = r18
            r7 = r14
            r23 = r8
            r18 = r14
            r14 = r19
            r19 = r9
            r8 = r27
            oj6 r0 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.add(r0)
            r14.add(r10)
            if (r19 == 0) goto L_0x029c
            if (r17 == 0) goto L_0x029c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            vu5 r2 = r12.j
            if (r13 <= 0) goto L_0x0242
            vu5[] r3 = new defpackage.vu5[r11]
            r4 = 0
        L_0x019d:
            if (r4 >= r11) goto L_0x01eb
            r5 = r21[r4]
            java.lang.String r6 = r5.x0
            r7 = 2
            java.lang.String r6 = defpackage.mze.q(r7, r6)
            java.lang.String r8 = defpackage.b49.c(r6)
            tu5 r9 = new tu5
            r9.<init>()
            java.lang.String r10 = r5.a
            r9.a = r10
            java.lang.String r10 = r5.b
            r9.b = r10
            java.lang.String r10 = r5.z0
            r9.j = r10
            r9.k = r8
            r9.h = r6
            y29 r6 = r5.y0
            r9.i = r6
            int r6 = r5.Y
            r9.f = r6
            int r6 = r5.Z
            r9.g = r6
            int r6 = r5.F0
            r9.p = r6
            int r6 = r5.G0
            r9.q = r6
            float r6 = r5.H0
            r9.r = r6
            int r6 = r5.o
            r9.d = r6
            int r5 = r5.X
            r9.e = r5
            vu5 r5 = new vu5
            r5.<init>(r9)
            r3[r4] = r5
            r5 = 1
            int r4 = r4 + r5
            goto L_0x019d
        L_0x01eb:
            toe r4 = new toe
            r5 = r22
            r4.<init>(r5, r3)
            r1.add(r4)
            if (r23 <= 0) goto L_0x0218
            if (r2 != 0) goto L_0x01ff
            boolean r3 = r20.isEmpty()
            if (r3 == 0) goto L_0x0218
        L_0x01ff:
            toe r3 = new toe
            java.lang.String r4 = ":audio"
            java.lang.String r4 = r5.concat(r4)
            r6 = 0
            r7 = r21[r6]
            vu5 r2 = h(r7, r2, r6)
            vu5[] r2 = new defpackage.vu5[]{r2}
            r3.<init>(r4, r2)
            r1.add(r3)
        L_0x0218:
            java.util.List r2 = r12.k
            if (r2 == 0) goto L_0x0240
            r3 = 0
        L_0x021d:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0240
            r4 = 19
            java.lang.String r6 = "main:cc:"
            java.lang.String r4 = m4b.h(r4, r3, r6)
            toe r6 = new toe
            java.lang.Object r7 = r2.get(r3)
            vu5 r7 = (defpackage.vu5) r7
            vu5[] r7 = new defpackage.vu5[]{r7}
            r6.<init>(r4, r7)
            r1.add(r6)
            r4 = 1
            int r3 = r3 + r4
            goto L_0x021d
        L_0x0240:
            r4 = 1
            goto L_0x025c
        L_0x0242:
            r5 = r22
            r4 = 1
            vu5[] r3 = new defpackage.vu5[r11]
            r6 = 0
        L_0x0248:
            if (r6 >= r11) goto L_0x0254
            r7 = r21[r6]
            vu5 r7 = h(r7, r2, r4)
            r3[r6] = r7
            int r6 = r6 + r4
            goto L_0x0248
        L_0x0254:
            toe r2 = new toe
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x025c:
            toe r2 = new toe
            java.lang.String r3 = ":id3"
            java.lang.String r3 = r5.concat(r3)
            tu5 r4 = new tu5
            r4.<init>()
            java.lang.String r5 = "ID3"
            r4.a = r5
            java.lang.String r5 = "application/id3"
            r4.k = r5
            vu5 r5 = new vu5
            r5.<init>(r4)
            vu5[] r4 = new defpackage.vu5[]{r5}
            r2.<init>(r3, r4)
            r1.add(r2)
            r3 = 0
            toe[] r4 = new defpackage.toe[r3]
            java.lang.Object[] r3 = r1.toArray(r4)
            toe[] r3 = (defpackage.toe[]) r3
            int r1 = r1.indexOf(r2)
            int[] r1 = new int[]{r1}
            r0.x(r3, r1)
            goto L_0x029c
        L_0x0295:
            r20 = r7
            r19 = r9
            r18 = r14
            r14 = r8
        L_0x029c:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r20.size()
            r10.<init>(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r20.size()
            r11.<init>(r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r20.size()
            r13.<init>(r0)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r9 = 0
        L_0x02bd:
            int r0 = r20.size()
            if (r9 >= r0) goto L_0x03a0
            r7 = r20
            java.lang.Object r0 = r7.get(r9)
            qi6 r0 = (defpackage.qi6) r0
            java.lang.String r0 = r0.c
            boolean r1 = r8.add(r0)
            if (r1 != 0) goto L_0x02dc
            r17 = r7
            r20 = r8
            r21 = r9
        L_0x02d9:
            r0 = 1
            goto L_0x0398
        L_0x02dc:
            r10.clear()
            r11.clear()
            r13.clear()
            r1 = 0
            r16 = 1
        L_0x02e8:
            int r2 = r7.size()
            if (r1 >= r2) goto L_0x0327
            java.lang.Object r2 = r7.get(r1)
            qi6 r2 = (defpackage.qi6) r2
            java.lang.String r2 = r2.c
            boolean r2 = defpackage.mze.a(r0, r2)
            if (r2 == 0) goto L_0x0324
            java.lang.Object r2 = r7.get(r1)
            qi6 r2 = (defpackage.qi6) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r13.add(r3)
            android.net.Uri r3 = r2.a
            r10.add(r3)
            vu5 r2 = r2.b
            r11.add(r2)
            java.lang.String r2 = r2.x0
            r3 = 1
            int r2 = defpackage.mze.p(r3, r2)
            if (r2 != r3) goto L_0x031e
            r2 = r3
            goto L_0x031f
        L_0x031e:
            r2 = 0
        L_0x031f:
            r2 = r16 & r2
            r16 = r2
            goto L_0x0325
        L_0x0324:
            r3 = 1
        L_0x0325:
            int r1 = r1 + r3
            goto L_0x02e8
        L_0x0327:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "audio:"
            if (r1 == 0) goto L_0x033a
            java.lang.String r0 = r2.concat(r0)
        L_0x0337:
            r6 = r0
            r0 = 0
            goto L_0x0340
        L_0x033a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x0337
        L_0x0340:
            android.net.Uri[] r1 = new android.net.Uri[r0]
            int r2 = defpackage.mze.a
            java.lang.Object[] r1 = r10.toArray(r1)
            r3 = r1
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            vu5[] r1 = new defpackage.vu5[r0]
            java.lang.Object[] r0 = r11.toArray(r1)
            r4 = r0
            vu5[] r4 = (defpackage.vu5[]) r4
            java.util.List r17 = java.util.Collections.emptyList()
            r2 = 1
            r5 = 0
            r0 = r25
            r1 = r6
            r24 = r6
            r6 = r17
            r17 = r7
            r7 = r18
            r20 = r8
            r21 = r9
            r8 = r27
            oj6 r0 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = defpackage.xie.H(r13)
            r14.add(r1)
            r15.add(r0)
            if (r19 == 0) goto L_0x02d9
            if (r16 == 0) goto L_0x02d9
            r1 = 0
            vu5[] r2 = new defpackage.vu5[r1]
            java.lang.Object[] r2 = r11.toArray(r2)
            vu5[] r2 = (defpackage.vu5[]) r2
            toe r3 = new toe
            r4 = r24
            r3.<init>(r4, r2)
            toe[] r2 = new defpackage.toe[]{r3}
            int[] r3 = new int[r1]
            r0.x(r2, r3)
            goto L_0x02d9
        L_0x0398:
            int r9 = r21 + 1
            r8 = r20
            r20 = r17
            goto L_0x02bd
        L_0x03a0:
            int r0 = r15.size()
            r10 = r25
            r10.K0 = r0
            r11 = 0
        L_0x03a9:
            java.util.List r0 = r12.h
            int r1 = r0.size()
            if (r11 >= r1) goto L_0x0417
            java.lang.Object r0 = r0.get(r11)
            qi6 r0 = (defpackage.qi6) r0
            java.lang.String r1 = r0.c
            r2 = 21
            int r2 = me4.e(r2, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "subtitle:"
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = ":"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r13 = r3.toString()
            android.net.Uri r1 = r0.a
            android.net.Uri[] r3 = new android.net.Uri[]{r1}
            vu5 r8 = r0.b
            vu5[] r4 = new defpackage.vu5[]{r8}
            java.util.List r6 = java.util.Collections.emptyList()
            r2 = 3
            r5 = 0
            r0 = r25
            r1 = r13
            r7 = r18
            r16 = r8
            r8 = r27
            oj6 r0 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = new int[]{r11}
            r14.add(r1)
            r15.add(r0)
            toe r1 = new toe
            vu5[] r2 = new defpackage.vu5[]{r16}
            r1.<init>(r13, r2)
            toe[] r1 = new defpackage.toe[]{r1}
            r2 = 0
            int[] r3 = new int[r2]
            r0.x(r1, r3)
            r0 = 1
            int r11 = r11 + r0
            goto L_0x03a9
        L_0x0417:
            r2 = 0
            oj6[] r0 = new defpackage.oj6[r2]
            java.lang.Object[] r0 = r15.toArray(r0)
            oj6[] r0 = (defpackage.oj6[]) r0
            r10.I0 = r0
            int[][] r0 = new int[r2][]
            java.lang.Object[] r0 = r14.toArray(r0)
            int[][] r0 = (int[][]) r0
            oj6[] r0 = r10.I0
            int r1 = r0.length
            r10.G0 = r1
            r1 = r0[r2]
            th6 r1 = r1.o
            r3 = 1
            r1.l = r3
            int r1 = r0.length
            r13 = r2
        L_0x0438:
            if (r13 >= r1) goto L_0x0448
            r2 = r0[r13]
            boolean r3 = r2.S0
            if (r3 != 0) goto L_0x0445
            long r3 = r2.e1
            r2.F(r3)
        L_0x0445:
            r2 = 1
            int r13 = r13 + r2
            goto L_0x0438
        L_0x0448:
            oj6[] r0 = r10.I0
            r10.J0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi6.L(p88, long):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: gj6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0263  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long M(defpackage.f55[] r38, boolean[] r39, defpackage.xjc[] r40, boolean[] r41, long r42) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r40
            r12 = r42
            int r3 = r1.length
            int[] r14 = new int[r3]
            int r3 = r1.length
            int[] r15 = new int[r3]
            r3 = 0
        L_0x000f:
            int r4 = r1.length
            java.util.IdentityHashMap r10 = r0.y0
            r8 = -1
            if (r3 >= r4) goto L_0x004d
            r4 = r2[r3]
            if (r4 != 0) goto L_0x001b
            r4 = r8
            goto L_0x0025
        L_0x001b:
            java.lang.Object r4 = r10.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x0025:
            r14[r3] = r4
            r15[r3] = r8
            r4 = r1[r3]
            if (r4 == 0) goto L_0x004a
            toe r4 = r4.a()
            r5 = 0
        L_0x0032:
            oj6[] r6 = r0.I0
            int r7 = r6.length
            if (r5 >= r7) goto L_0x004a
            r6 = r6[r5]
            r6.d()
            voe r6 = r6.X0
            int r6 = r6.b(r4)
            if (r6 == r8) goto L_0x0047
            r15[r3] = r5
            goto L_0x004a
        L_0x0047:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x004d:
            r10.clear()
            int r9 = r1.length
            xjc[] r6 = new defpackage.xjc[r9]
            int r7 = r1.length
            xjc[] r4 = new defpackage.xjc[r7]
            int r5 = r1.length
            f55[] r3 = new defpackage.f55[r5]
            oj6[] r11 = r0.I0
            int r11 = r11.length
            oj6[] r11 = new defpackage.oj6[r11]
            r17 = r9
            r9 = 0
            r18 = 0
            r19 = 0
        L_0x0065:
            oj6[] r8 = r0.I0
            int r8 = r8.length
            if (r9 >= r8) goto L_0x0321
            r21 = r6
            r8 = 0
        L_0x006d:
            int r6 = r1.length
            r22 = r7
            if (r8 >= r6) goto L_0x008b
            r6 = r14[r8]
            if (r6 != r9) goto L_0x0079
            r6 = r2[r8]
            goto L_0x007a
        L_0x0079:
            r6 = 0
        L_0x007a:
            r4[r8] = r6
            r6 = r15[r8]
            if (r6 != r9) goto L_0x0083
            r7 = r1[r8]
            goto L_0x0084
        L_0x0083:
            r7 = 0
        L_0x0084:
            r3[r8] = r7
            int r8 = r8 + 1
            r7 = r22
            goto L_0x006d
        L_0x008b:
            oj6[] r6 = r0.I0
            r8 = r6[r9]
            r8.d()
            int r6 = r8.T0
            r24 = r9
            r7 = 0
        L_0x0097:
            if (r7 >= r5) goto L_0x00f1
            r25 = r4[r7]
            r9 = r25
            gj6 r9 = (defpackage.gj6) r9
            if (r9 == 0) goto L_0x00ac
            r25 = r3[r7]
            if (r25 == 0) goto L_0x00a9
            boolean r25 = r39[r7]
            if (r25 != 0) goto L_0x00ac
        L_0x00a9:
            r25 = r10
            goto L_0x00b3
        L_0x00ac:
            r25 = r10
            r27 = r11
            r2 = -1
            r11 = 0
            goto L_0x00e8
        L_0x00b3:
            int r10 = r8.T0
            r26 = 1
            int r10 = r10 + -1
            r8.T0 = r10
            int r10 = r9.c
            r27 = r11
            r11 = -1
            if (r10 == r11) goto L_0x00e3
            oj6 r10 = r9.b
            r10.d()
            int[] r11 = r10.Z0
            r11.getClass()
            int[] r11 = r10.Z0
            int r2 = r9.a
            r2 = r11[r2]
            boolean[] r11 = r10.c1
            boolean r11 = r11[r2]
            swb.h(r11)
            boolean[] r10 = r10.c1
            r11 = 0
            r10[r2] = r11
            r2 = -1
            r9.c = r2
        L_0x00e1:
            r9 = 0
            goto L_0x00e6
        L_0x00e3:
            r2 = r11
            r11 = 0
            goto L_0x00e1
        L_0x00e6:
            r4[r7] = r9
        L_0x00e8:
            int r7 = r7 + 1
            r2 = r40
            r10 = r25
            r11 = r27
            goto L_0x0097
        L_0x00f1:
            r25 = r10
            r27 = r11
            r2 = -1
            r11 = 0
            if (r19 != 0) goto L_0x0109
            boolean r7 = r8.h1
            if (r7 == 0) goto L_0x0100
            if (r6 != 0) goto L_0x0107
            goto L_0x0109
        L_0x0100:
            long r6 = r8.e1
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r6 = r11
            goto L_0x010a
        L_0x0109:
            r6 = 1
        L_0x010a:
            th6 r10 = r8.o
            f55 r7 = r10.q
            r16 = r6
            r9 = r7
            r6 = r11
        L_0x0112:
            if (r6 >= r5) goto L_0x016b
            r2 = r3[r6]
            if (r2 != 0) goto L_0x011b
            r28 = r3
            goto L_0x0164
        L_0x011b:
            voe r11 = r8.X0
            r28 = r3
            toe r3 = r2.a()
            int r3 = r11.b(r3)
            int r11 = r8.a1
            if (r3 != r11) goto L_0x012e
            r10.q = r2
            r9 = r2
        L_0x012e:
            r2 = r4[r6]
            if (r2 != 0) goto L_0x0164
            int r2 = r8.T0
            r11 = 1
            int r2 = r2 + r11
            r8.T0 = r2
            gj6 r2 = new gj6
            r2.<init>(r8, r3)
            r4[r6] = r2
            r41[r6] = r11
            int[] r11 = r8.Z0
            if (r11 == 0) goto L_0x0164
            r2.a()
            if (r16 != 0) goto L_0x0164
            mj6[] r2 = r8.K0
            int[] r11 = r8.Z0
            r3 = r11[r3]
            r2 = r2[r3]
            r3 = 1
            boolean r11 = r2.A(r12, r3)
            if (r11 != 0) goto L_0x0161
            int r2 = r2.o()
            if (r2 == 0) goto L_0x0161
            r2 = 1
            goto L_0x0162
        L_0x0161:
            r2 = 0
        L_0x0162:
            r16 = r2
        L_0x0164:
            int r6 = r6 + 1
            r3 = r28
            r2 = -1
            r11 = 0
            goto L_0x0112
        L_0x016b:
            r28 = r3
            int r2 = r8.T0
            java.util.ArrayList r3 = r8.C0
            if (r2 != 0) goto L_0x01bb
            r2 = 0
            r10.n = r2
            r8.V0 = r2
            r2 = 1
            r8.g1 = r2
            r3.clear()
            jj7 r3 = r8.y0
            boolean r6 = r3.C()
            if (r6 == 0) goto L_0x019c
            boolean r6 = r8.R0
            if (r6 == 0) goto L_0x0198
            mj6[] r6 = r8.K0
            int r7 = r6.length
            r9 = 0
        L_0x018e:
            if (r9 >= r7) goto L_0x0198
            r11 = r6[r9]
            r11.i()
            int r9 = r9 + 1
            goto L_0x018e
        L_0x0198:
            r3.o()
            goto L_0x019f
        L_0x019c:
            r8.z()
        L_0x019f:
            r31 = r4
            r32 = r5
            r2 = r8
            r33 = r17
            r20 = r21
            r0 = r22
            r34 = r24
            r35 = r25
            r36 = r27
            r26 = r28
            r17 = -1
            r21 = r14
            r24 = r15
            r14 = r10
            goto L_0x0275
        L_0x01bb:
            r2 = 1
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0242
            boolean r3 = defpackage.mze.a(r9, r7)
            if (r3 != 0) goto L_0x0242
            boolean r3 = r8.h1
            if (r3 != 0) goto L_0x0222
            r6 = 0
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x01d3
            long r6 = -r12
        L_0x01d3:
            zh6 r11 = r8.l()
            z18[] r23 = r10.a(r11, r12)
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List r3 = r8.D0
            r26 = r28
            r28 = r3
            r3 = r9
            r31 = r4
            r32 = r5
            r4 = r42
            r2 = r21
            r0 = r22
            r20 = r2
            r2 = r8
            r22 = r9
            r21 = r14
            r33 = r17
            r34 = r24
            r14 = 1
            r17 = -1
            r8 = r29
            r14 = r10
            r35 = r25
            r10 = r28
            r24 = r15
            r36 = r27
            r15 = r11
            r11 = r23
            r3.t(r4, r6, r8, r10, r11)
            vu5 r3 = r15.o
            toe r4 = r14.h
            int r3 = r4.a(r3)
            int r4 = r22.i()
            if (r4 == r3) goto L_0x0220
        L_0x021e:
            r3 = 1
            goto L_0x023d
        L_0x0220:
            r3 = 1
            goto L_0x025d
        L_0x0222:
            r31 = r4
            r32 = r5
            r2 = r8
            r33 = r17
            r20 = r21
            r0 = r22
            r34 = r24
            r35 = r25
            r36 = r27
            r26 = r28
            r17 = -1
            r21 = r14
            r24 = r15
            r14 = r10
            goto L_0x021e
        L_0x023d:
            r2.g1 = r3
            r4 = r3
            r9 = r4
            goto L_0x0261
        L_0x0242:
            r3 = r2
            r31 = r4
            r32 = r5
            r2 = r8
            r33 = r17
            r20 = r21
            r0 = r22
            r34 = r24
            r35 = r25
            r36 = r27
            r26 = r28
            r17 = -1
            r21 = r14
            r24 = r15
            r14 = r10
        L_0x025d:
            r9 = r16
            r4 = r19
        L_0x0261:
            if (r9 == 0) goto L_0x0273
            r2.A(r12, r4)
            r11 = 0
        L_0x0267:
            if (r11 >= r0) goto L_0x0273
            r4 = r31[r11]
            if (r4 == 0) goto L_0x026f
            r41[r11] = r3
        L_0x026f:
            int r11 = r11 + 1
            r3 = 1
            goto L_0x0267
        L_0x0273:
            r16 = r9
        L_0x0275:
            java.util.ArrayList r3 = r2.H0
            r3.clear()
            r11 = 0
        L_0x027b:
            if (r11 >= r0) goto L_0x0289
            r4 = r31[r11]
            if (r4 == 0) goto L_0x0286
            gj6 r4 = (defpackage.gj6) r4
            r3.add(r4)
        L_0x0286:
            int r11 = r11 + 1
            goto L_0x027b
        L_0x0289:
            r4 = 1
            r2.h1 = r4
            r3 = 0
            r11 = 0
        L_0x028e:
            int r4 = r1.length
            if (r11 >= r4) goto L_0x02be
            r4 = r31[r11]
            r5 = r24[r11]
            r6 = r34
            if (r5 != r6) goto L_0x02a9
            r4.getClass()
            r20[r11] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r5 = r35
            r5.put(r4, r3)
            r3 = 1
            goto L_0x02b7
        L_0x02a9:
            r5 = r35
            r7 = r21[r11]
            if (r7 != r6) goto L_0x02b7
            if (r4 != 0) goto L_0x02b3
            r4 = 1
            goto L_0x02b4
        L_0x02b3:
            r4 = 0
        L_0x02b4:
            swb.h(r4)
        L_0x02b7:
            int r11 = r11 + 1
            r35 = r5
            r34 = r6
            goto L_0x028e
        L_0x02be:
            r6 = r34
            r5 = r35
            if (r3 == 0) goto L_0x0302
            r4 = r18
            r3 = r36
            r3[r4] = r2
            int r18 = r4 + 1
            if (r4 != 0) goto L_0x02f3
            r4 = 1
            r14.l = r4
            if (r16 != 0) goto L_0x02e3
            r7 = r0
            r0 = r37
            oj6[] r8 = r0.J0
            int r9 = r8.length
            if (r9 == 0) goto L_0x02e1
            r9 = 0
            r8 = r8[r9]
            if (r2 == r8) goto L_0x030a
            goto L_0x02e7
        L_0x02e1:
            r9 = 0
            goto L_0x02e7
        L_0x02e3:
            r9 = 0
            r7 = r0
            r0 = r37
        L_0x02e7:
            mod r2 = r0.z0
            java.lang.Object r2 = r2.b
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            r2.clear()
            r19 = r4
            goto L_0x030a
        L_0x02f3:
            r4 = 1
            r9 = 0
            r7 = r0
            r0 = r37
            int r2 = r0.K0
            if (r6 >= r2) goto L_0x02fe
            r11 = r4
            goto L_0x02ff
        L_0x02fe:
            r11 = r9
        L_0x02ff:
            r14.l = r11
            goto L_0x030a
        L_0x0302:
            r9 = 0
            r7 = r0
            r4 = r18
            r3 = r36
            r0 = r37
        L_0x030a:
            int r2 = r6 + 1
            r9 = r2
            r11 = r3
            r10 = r5
            r6 = r20
            r14 = r21
            r15 = r24
            r3 = r26
            r4 = r31
            r5 = r32
            r17 = r33
            r2 = r40
            goto L_0x0065
        L_0x0321:
            r8 = r6
            r3 = r11
            r6 = r17
            r4 = r18
            r9 = 0
            java.lang.System.arraycopy(r8, r9, r2, r9, r6)
            java.lang.Object[] r1 = defpackage.mze.F(r4, r3)
            oj6[] r1 = (defpackage.oj6[]) r1
            r0.J0 = r1
            lu7 r2 = r0.A0
            r2.getClass()
            wwc r2 = new wwc
            r3 = 9
            r2.<init>(r3, r1)
            r0.L0 = r2
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi6.M(f55[], boolean[], xjc[], boolean[], long):long");
    }

    public final void a() {
        for (oj6 oj6 : this.I0) {
            ArrayList arrayList = oj6.C0;
            if (!arrayList.isEmpty()) {
                zh6 zh6 = (zh6) gwf.t(arrayList);
                int b2 = oj6.o.b(zh6);
                if (b2 == 1) {
                    zh6.Z0 = true;
                } else if (b2 == 2 && !oj6.i1) {
                    jj7 jj7 = oj6.y0;
                    if (jj7.C()) {
                        jj7.o();
                    }
                }
            }
        }
        this.F0.c(this);
    }

    public final boolean b() {
        return this.L0.b();
    }

    public final void c(jyc jyc) {
        oj6 oj6 = (oj6) jyc;
        this.F0.c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r4 != false) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(android.net.Uri r17, defpackage.wi7 r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            oj6[] r2 = r0.I0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L_0x0009:
            if (r6 >= r3) goto L_0x00a6
            r8 = r2[r6]
            th6 r9 = r8.o
            android.net.Uri[] r10 = r9.e
            boolean r10 = defpackage.mze.l(r10, r1)
            if (r10 != 0) goto L_0x001d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L_0x00a1
        L_0x001d:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L_0x003f
            f55 r12 = r9.q
            nv4 r12 = ek8.o(r12)
            lk9 r8 = r8.x0
            r8.getClass()
            r8 = r18
            sz0 r12 = defpackage.lk9.f(r12, r8)
            if (r12 == 0) goto L_0x0041
            int r13 = r12.b
            r14 = 2
            if (r13 != r14) goto L_0x0041
            long r12 = r12.c
            goto L_0x0042
        L_0x003f:
            r8 = r18
        L_0x0041:
            r12 = r10
        L_0x0042:
            r14 = 0
        L_0x0043:
            android.net.Uri[] r15 = r9.e
            int r5 = r15.length
            r4 = -1
            if (r14 >= r5) goto L_0x0055
            r5 = r15[r14]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            int r14 = r14 + 1
            goto L_0x0043
        L_0x0055:
            r14 = r4
        L_0x0056:
            if (r14 != r4) goto L_0x005b
        L_0x0058:
            r4 = 1
            r5 = 1
            goto L_0x0098
        L_0x005b:
            f55 r5 = r9.q
            int r5 = r5.p(r14)
            if (r5 != r4) goto L_0x0064
            goto L_0x0058
        L_0x0064:
            boolean r4 = r9.s
            android.net.Uri r14 = r9.o
            boolean r14 = r1.equals(r14)
            r4 = r4 | r14
            r9.s = r4
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0096
            f55 r4 = r9.q
            boolean r4 = r4.r(r5, r12)
            if (r4 == 0) goto L_0x0093
            f84 r4 = r9.g
            java.util.HashMap r4 = r4.b
            java.lang.Object r4 = r4.get(r1)
            d84 r4 = (defpackage.d84) r4
            if (r4 == 0) goto L_0x008e
            boolean r4 = defpackage.d84.a(r4, r12)
            r5 = 1
            r4 = r4 ^ r5
            goto L_0x0090
        L_0x008e:
            r5 = 1
            r4 = 0
        L_0x0090:
            if (r4 == 0) goto L_0x0094
            goto L_0x0097
        L_0x0093:
            r5 = 1
        L_0x0094:
            r4 = 0
            goto L_0x0098
        L_0x0096:
            r5 = 1
        L_0x0097:
            r4 = r5
        L_0x0098:
            if (r4 == 0) goto L_0x00a0
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x00a0
            r4 = r5
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L_0x0009
        L_0x00a6:
            p88 r1 = r0.F0
            r1.c(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi6.e(android.net.Uri, wi7, boolean):boolean");
    }

    public final long f() {
        return this.L0.f();
    }

    public final oj6 g(String str, int i, Uri[] uriArr, vu5[] vu5Arr, vu5 vu5, List list, Map map, long j) {
        Uri[] uriArr2 = uriArr;
        vu5[] vu5Arr2 = vu5Arr;
        th6 th6 = new th6(this.a, this.b, uriArr2, vu5Arr2, this.c, this.o, this.z0, list, this.E0);
        af8 af8 = this.w0;
        int i2 = this.C0;
        return new oj6(str, i, this, th6, map, this.x0, j, vu5, this.X, this.Y, this.Z, af8, i2);
    }

    public final void i() {
        oj6[] oj6Arr = this.I0;
        int length = oj6Arr.length;
        int i = 0;
        while (i < length) {
            oj6 oj6 = oj6Arr[i];
            oj6.v();
            if (!oj6.i1 || oj6.S0) {
                i++;
            } else {
                throw ParserException.a((RuntimeException) null, "Loading finished before preparation is complete.");
            }
        }
    }

    public final void j() {
        int i = this.G0 - 1;
        this.G0 = i;
        if (i <= 0) {
            int i2 = 0;
            for (oj6 oj6 : this.I0) {
                oj6.d();
                i2 += oj6.X0.a;
            }
            toe[] toeArr = new toe[i2];
            int i3 = 0;
            for (oj6 oj62 : this.I0) {
                oj62.d();
                int i4 = oj62.X0.a;
                int i5 = 0;
                while (i5 < i4) {
                    oj62.d();
                    toeArr[i3] = oj62.X0.a(i5);
                    i5++;
                    i3++;
                }
            }
            this.H0 = new voe(toeArr);
            this.F0.d(this);
        }
    }

    public final long k(long j) {
        oj6[] oj6Arr = this.J0;
        if (oj6Arr.length > 0) {
            boolean A = oj6Arr[0].A(j, false);
            int i = 1;
            while (true) {
                oj6[] oj6Arr2 = this.J0;
                if (i >= oj6Arr2.length) {
                    break;
                }
                oj6Arr2[i].A(j, A);
                i++;
            }
            if (A) {
                ((SparseArray) this.z0.b).clear();
            }
        }
        return j;
    }

    public final long o() {
        return -9223372036854775807L;
    }

    public final voe p() {
        voe voe = this.H0;
        voe.getClass();
        return voe;
    }

    public final long r() {
        return this.L0.r();
    }

    public final void s(long j, boolean z) {
        for (oj6 oj6 : this.J0) {
            if (oj6.R0 && !oj6.n()) {
                int length = oj6.K0.length;
                for (int i = 0; i < length; i++) {
                    oj6.K0[i].h(j, z, oj6.c1[i]);
                }
            }
        }
    }

    public final void u(long j) {
        this.L0.u(j);
    }
}
