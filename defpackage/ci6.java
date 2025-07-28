package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ci6  reason: default package */
public final class ci6 implements s88, dj6 {
    public final s59 A0;
    public final boolean B0;
    public final int C0;
    public final boolean D0;
    public final cza E0;
    public final lv1 F0 = new lv1(18, this);
    public final long G0;
    public q88 H0;
    public int I0;
    public woe J0;
    public pj6[] K0;
    public pj6[] L0;
    public int M0;
    public y83 N0;
    public final no4 X;
    public final fo4 Y;
    public final mk9 Z;
    public final xh6 a;
    public final f84 b;
    public final x3a c;
    public final cqe o;
    public final jn w0;
    public final l34 x0;
    public final IdentityHashMap y0;
    public final gvf z0;

    public ci6(xh6 xh6, f84 f84, x3a x3a, cqe cqe, no4 no4, fo4 fo4, mk9 mk9, jn jnVar, l34 l34, s59 s59, boolean z, int i, boolean z2, cza cza, long j) {
        this.a = xh6;
        this.b = f84;
        this.c = x3a;
        this.o = cqe;
        this.X = no4;
        this.Y = fo4;
        this.Z = mk9;
        this.w0 = jnVar;
        this.x0 = l34;
        this.A0 = s59;
        this.B0 = z;
        this.C0 = i;
        this.D0 = z2;
        this.E0 = cza;
        this.G0 = j;
        s59.getClass();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        this.N0 = new y83(e8c, e8c);
        this.y0 = new IdentityHashMap();
        this.z0 = new gvf(29);
        this.K0 = new pj6[0];
        this.L0 = new pj6[0];
    }

    public static xu5 e(xu5 xu5, xu5 xu52, boolean z) {
        List list;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        a39 a39;
        String str3;
        po5 po5 = ws6.b;
        List list2 = e8c.X;
        int i4 = -1;
        if (xu52 != null) {
            str3 = xu52.j;
            a39 = xu52.k;
            i3 = xu52.B;
            i2 = xu52.e;
            i = xu52.f;
            str2 = xu52.d;
            str = xu52.b;
            list = xu52.c;
        } else {
            String v = oze.v(1, xu5.j);
            a39 = xu5.k;
            if (z) {
                i3 = xu5.B;
                i2 = xu5.e;
                i = xu5.f;
                str2 = xu5.d;
                str = xu5.b;
                list2 = xu5.c;
            } else {
                i2 = 0;
                str2 = null;
                i3 = -1;
                i = 0;
                str = null;
            }
            List list3 = list2;
            str3 = v;
            list = list3;
        }
        String c2 = c49.c(str3);
        int i5 = z ? xu5.g : -1;
        if (z) {
            i4 = xu5.h;
        }
        uu5 uu5 = new uu5();
        uu5.a = xu5.a;
        uu5.b = str;
        uu5.c = ws6.j(list);
        uu5.l = c49.l(xu5.m);
        uu5.m = c49.l(c2);
        uu5.i = str3;
        uu5.j = a39;
        uu5.g = i5;
        uu5.h = i4;
        uu5.A = i3;
        uu5.e = i2;
        uu5.f = i;
        uu5.d = str2;
        return new xu5(uu5);
    }

    public final void a() {
        for (pj6 pj6 : this.K0) {
            ArrayList arrayList = pj6.C0;
            if (!arrayList.isEmpty()) {
                ai6 ai6 = (ai6) gwf.t(arrayList);
                int b2 = pj6.o.b(ai6);
                if (b2 == 1) {
                    ai6.a1 = true;
                } else if (b2 == 0) {
                    pj6.G0.post(new zo5(pj6, 2, ai6));
                } else if (b2 == 2 && !pj6.i1) {
                    ul7 ul7 = pj6.y0;
                    if (ul7.A()) {
                        ul7.s();
                    }
                }
            }
        }
        this.H0.j(this);
    }

    public final boolean b() {
        return this.N0.b();
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
    public final boolean c(android.net.Uri r17, defpackage.wi7 r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            pj6[] r2 = r0.K0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L_0x0009:
            if (r6 >= r3) goto L_0x00a6
            r8 = r2[r6]
            uh6 r9 = r8.o
            android.net.Uri[] r10 = r9.e
            boolean r10 = defpackage.oze.m(r10, r1)
            if (r10 != 0) goto L_0x001d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L_0x00a1
        L_0x001d:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L_0x003f
            g55 r12 = r9.r
            nv4 r12 = defpackage.jjd.k(r12)
            mk9 r8 = r8.x0
            r8.getClass()
            r8 = r18
            sz0 r12 = defpackage.mk9.i(r12, r8)
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
            g55 r5 = r9.r
            int r5 = r5.p(r14)
            if (r5 != r4) goto L_0x0064
            goto L_0x0058
        L_0x0064:
            boolean r4 = r9.t
            android.net.Uri r14 = r9.p
            boolean r14 = r1.equals(r14)
            r4 = r4 | r14
            r9.t = r4
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0096
            g55 r4 = r9.r
            boolean r4 = r4.u(r5, r12)
            if (r4 == 0) goto L_0x0093
            f84 r4 = r9.g
            java.util.HashMap r4 = r4.b
            java.lang.Object r4 = r4.get(r1)
            e84 r4 = (defpackage.e84) r4
            if (r4 == 0) goto L_0x008e
            boolean r4 = defpackage.e84.a(r4, r12)
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
            q88 r1 = r0.H0
            r1.j(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci6.c(android.net.Uri, wi7, boolean):boolean");
    }

    public final pj6 d(String str, int i, Uri[] uriArr, xu5[] xu5Arr, xu5 xu5, List list, Map map, long j) {
        Uri[] uriArr2 = uriArr;
        xu5[] xu5Arr2 = xu5Arr;
        uh6 uh6 = new uh6(this.a, this.b, uriArr2, xu5Arr2, this.c, this.o, this.z0, this.G0, list, this.E0);
        fo4 fo4 = this.Y;
        mk9 mk9 = this.Z;
        return new pj6(str, i, this.F0, uh6, map, this.x0, j, xu5, this.X, fo4, mk9, this.w0, this.C0);
    }

    public final long f() {
        return this.N0.f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: hj6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x028d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g(defpackage.g55[] r37, boolean[] r38, defpackage.yjc[] r39, boolean[] r40, long r41) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r39
            r12 = r41
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
            uoe r4 = r4.a()
            r5 = 0
        L_0x0032:
            pj6[] r6 = r0.K0
            int r7 = r6.length
            if (r5 >= r7) goto L_0x004a
            r6 = r6[r5]
            r6.d()
            woe r6 = r6.X0
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
            yjc[] r6 = new defpackage.yjc[r9]
            int r7 = r1.length
            yjc[] r4 = new defpackage.yjc[r7]
            int r5 = r1.length
            g55[] r3 = new defpackage.g55[r5]
            pj6[] r11 = r0.K0
            int r11 = r11.length
            pj6[] r11 = new defpackage.pj6[r11]
            r17 = r9
            r9 = 0
            r18 = 0
            r19 = 0
        L_0x0065:
            pj6[] r8 = r0.K0
            int r8 = r8.length
            if (r9 >= r8) goto L_0x0349
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
            pj6[] r6 = r0.K0
            r8 = r6[r9]
            r8.d()
            int r6 = r8.T0
            r24 = r9
            r7 = 0
        L_0x0097:
            if (r7 >= r5) goto L_0x00ef
            r25 = r4[r7]
            r9 = r25
            hj6 r9 = (defpackage.hj6) r9
            if (r9 == 0) goto L_0x00ac
            r25 = r3[r7]
            if (r25 == 0) goto L_0x00a9
            boolean r25 = r38[r7]
            if (r25 != 0) goto L_0x00ac
        L_0x00a9:
            r25 = r10
            goto L_0x00b2
        L_0x00ac:
            r25 = r10
            r27 = r11
            r2 = -1
            goto L_0x00e6
        L_0x00b2:
            int r10 = r8.T0
            r26 = 1
            int r10 = r10 + -1
            r8.T0 = r10
            int r10 = r9.c
            r27 = r11
            r11 = -1
            if (r10 == r11) goto L_0x00e2
            pj6 r10 = r9.b
            r10.d()
            int[] r11 = r10.Z0
            r11.getClass()
            int[] r11 = r10.Z0
            int r2 = r9.a
            r2 = r11[r2]
            boolean[] r11 = r10.c1
            boolean r11 = r11[r2]
            defpackage.oyb.k(r11)
            boolean[] r10 = r10.c1
            r11 = 0
            r10[r2] = r11
            r2 = -1
            r9.c = r2
        L_0x00e0:
            r9 = 0
            goto L_0x00e4
        L_0x00e2:
            r2 = r11
            goto L_0x00e0
        L_0x00e4:
            r4[r7] = r9
        L_0x00e6:
            int r7 = r7 + 1
            r2 = r39
            r10 = r25
            r11 = r27
            goto L_0x0097
        L_0x00ef:
            r25 = r10
            r27 = r11
            r2 = -1
            if (r19 != 0) goto L_0x0106
            boolean r7 = r8.h1
            if (r7 == 0) goto L_0x00fd
            if (r6 != 0) goto L_0x0104
            goto L_0x0106
        L_0x00fd:
            long r6 = r8.e1
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r6 = 0
            goto L_0x0107
        L_0x0106:
            r6 = 1
        L_0x0107:
            uh6 r11 = r8.o
            g55 r7 = r11.r
            r20 = r6
            r10 = r7
            r6 = 0
        L_0x010f:
            f84 r9 = r11.g
            android.net.Uri[] r2 = r11.e
            if (r6 >= r5) goto L_0x0185
            r28 = r5
            r5 = r3[r6]
            if (r5 != 0) goto L_0x011e
            r29 = r3
            goto L_0x017b
        L_0x011e:
            r29 = r3
            woe r3 = r8.X0
            uoe r0 = r5.a()
            int r0 = r3.b(r0)
            int r3 = r8.a1
            if (r0 != r3) goto L_0x0146
            g55 r3 = r11.r
            int r3 = r3.i()
            r2 = r2[r3]
            java.util.HashMap r3 = r9.b
            java.lang.Object r2 = r3.get(r2)
            e84 r2 = (defpackage.e84) r2
            if (r2 == 0) goto L_0x0143
            r3 = 0
            r2.z0 = r3
        L_0x0143:
            r11.r = r5
            r10 = r5
        L_0x0146:
            r2 = r4[r6]
            if (r2 != 0) goto L_0x017b
            int r2 = r8.T0
            r3 = 1
            int r2 = r2 + r3
            r8.T0 = r2
            hj6 r2 = new hj6
            r2.<init>(r8, r0)
            r4[r6] = r2
            r40[r6] = r3
            int[] r5 = r8.Z0
            if (r5 == 0) goto L_0x017b
            r2.a()
            if (r20 != 0) goto L_0x017b
            nj6[] r2 = r8.K0
            int[] r5 = r8.Z0
            r0 = r5[r0]
            r0 = r2[r0]
            int r2 = r0.n()
            if (r2 == 0) goto L_0x0178
            boolean r0 = r0.A(r12, r3)
            if (r0 != 0) goto L_0x0178
            r0 = 1
            goto L_0x0179
        L_0x0178:
            r0 = 0
        L_0x0179:
            r20 = r0
        L_0x017b:
            int r6 = r6 + 1
            r0 = r36
            r5 = r28
            r3 = r29
            r2 = -1
            goto L_0x010f
        L_0x0185:
            r29 = r3
            r28 = r5
            int r0 = r8.T0
            java.util.ArrayList r3 = r8.C0
            if (r0 != 0) goto L_0x01ea
            g55 r0 = r11.r
            int r0 = r0.i()
            r0 = r2[r0]
            java.util.HashMap r2 = r9.b
            java.lang.Object r0 = r2.get(r0)
            e84 r0 = (defpackage.e84) r0
            r2 = 0
            if (r0 == 0) goto L_0x01a4
            r0.z0 = r2
        L_0x01a4:
            r0 = 0
            r11.o = r0
            r8.V0 = r0
            r0 = 1
            r8.g1 = r0
            r3.clear()
            ul7 r3 = r8.y0
            boolean r5 = r3.A()
            if (r5 == 0) goto L_0x01cd
            boolean r5 = r8.R0
            if (r5 == 0) goto L_0x01c9
            nj6[] r5 = r8.K0
            int r6 = r5.length
            r7 = r2
        L_0x01bf:
            if (r7 >= r6) goto L_0x01c9
            r9 = r5[r7]
            r9.h()
            int r7 = r7 + 1
            goto L_0x01bf
        L_0x01c9:
            r3.s()
            goto L_0x01d0
        L_0x01cd:
            r8.D()
        L_0x01d0:
            r26 = r4
            r0 = r8
            r32 = r17
            r2 = r22
            r33 = r24
            r34 = r25
            r35 = r27
            r23 = r29
            r17 = -1
            r22 = r14
            r24 = r21
            r21 = r15
            r15 = r11
            goto L_0x029f
        L_0x01ea:
            r0 = 1
            r2 = 0
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x026e
            boolean r3 = defpackage.oze.a(r10, r7)
            if (r3 != 0) goto L_0x026e
            boolean r3 = r8.h1
            if (r3 != 0) goto L_0x0250
            r5 = 0
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0203
            long r5 = -r12
        L_0x0203:
            r6 = r5
            ai6 r9 = r8.t()
            a28[] r16 = r11.a(r9, r12)
            r30 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List r5 = r8.D0
            r23 = r29
            r3 = r10
            r26 = r4
            r29 = r5
            r4 = r41
            r0 = r21
            r2 = r22
            r22 = r14
            r32 = r17
            r33 = r24
            r17 = -1
            r24 = r0
            r0 = r8
            r14 = r9
            r8 = r30
            r34 = r25
            r25 = r10
            r10 = r29
            r21 = r15
            r35 = r27
            r15 = r11
            r11 = r16
            r3.r(r4, r6, r8, r10, r11)
            xu5 r3 = r14.o
            uoe r4 = r15.h
            int r3 = r4.d(r3)
            int r4 = r25.i()
            if (r4 == r3) goto L_0x024e
        L_0x024c:
            r3 = 1
            goto L_0x0269
        L_0x024e:
            r3 = 1
            goto L_0x0287
        L_0x0250:
            r26 = r4
            r0 = r8
            r32 = r17
            r2 = r22
            r33 = r24
            r34 = r25
            r35 = r27
            r23 = r29
            r17 = -1
            r22 = r14
            r24 = r21
            r21 = r15
            r15 = r11
            goto L_0x024c
        L_0x0269:
            r0.g1 = r3
            r4 = r3
            r9 = r4
            goto L_0x028b
        L_0x026e:
            r3 = r0
            r26 = r4
            r0 = r8
            r32 = r17
            r2 = r22
            r33 = r24
            r34 = r25
            r35 = r27
            r23 = r29
            r17 = -1
            r22 = r14
            r24 = r21
            r21 = r15
            r15 = r11
        L_0x0287:
            r4 = r19
            r9 = r20
        L_0x028b:
            if (r9 == 0) goto L_0x029d
            r0.F(r12, r4)
            r11 = 0
        L_0x0291:
            if (r11 >= r2) goto L_0x029d
            r4 = r26[r11]
            if (r4 == 0) goto L_0x0299
            r40[r11] = r3
        L_0x0299:
            int r11 = r11 + 1
            r3 = 1
            goto L_0x0291
        L_0x029d:
            r20 = r9
        L_0x029f:
            java.util.ArrayList r3 = r0.H0
            r3.clear()
            r11 = 0
        L_0x02a5:
            if (r11 >= r2) goto L_0x02b3
            r4 = r26[r11]
            if (r4 == 0) goto L_0x02b0
            hj6 r4 = (defpackage.hj6) r4
            r3.add(r4)
        L_0x02b0:
            int r11 = r11 + 1
            goto L_0x02a5
        L_0x02b3:
            r4 = 1
            r0.h1 = r4
            r3 = 0
            r11 = 0
        L_0x02b8:
            int r4 = r1.length
            if (r11 >= r4) goto L_0x02e8
            r4 = r26[r11]
            r5 = r21[r11]
            r6 = r33
            if (r5 != r6) goto L_0x02d3
            r4.getClass()
            r24[r11] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r5 = r34
            r5.put(r4, r3)
            r3 = 1
            goto L_0x02e1
        L_0x02d3:
            r5 = r34
            r7 = r22[r11]
            if (r7 != r6) goto L_0x02e1
            if (r4 != 0) goto L_0x02dd
            r4 = 1
            goto L_0x02de
        L_0x02dd:
            r4 = 0
        L_0x02de:
            defpackage.oyb.k(r4)
        L_0x02e1:
            int r11 = r11 + 1
            r34 = r5
            r33 = r6
            goto L_0x02b8
        L_0x02e8:
            r6 = r33
            r5 = r34
            if (r3 == 0) goto L_0x0329
            r4 = r18
            r3 = r35
            r3[r4] = r0
            int r18 = r4 + 1
            if (r4 != 0) goto L_0x031b
            r4 = 1
            r15.m = r4
            if (r20 != 0) goto L_0x030c
            r7 = r36
            pj6[] r8 = r7.L0
            int r9 = r8.length
            if (r9 == 0) goto L_0x030a
            r9 = 0
            r8 = r8[r9]
            if (r0 == r8) goto L_0x0330
            goto L_0x030f
        L_0x030a:
            r9 = 0
            goto L_0x030f
        L_0x030c:
            r9 = 0
            r7 = r36
        L_0x030f:
            gvf r0 = r7.z0
            java.lang.Object r0 = r0.b
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r0.clear()
            r19 = r4
            goto L_0x0330
        L_0x031b:
            r4 = 1
            r9 = 0
            r7 = r36
            int r0 = r7.M0
            if (r6 >= r0) goto L_0x0325
            r11 = r4
            goto L_0x0326
        L_0x0325:
            r11 = r9
        L_0x0326:
            r15.m = r11
            goto L_0x0330
        L_0x0329:
            r9 = 0
            r7 = r36
            r4 = r18
            r3 = r35
        L_0x0330:
            int r0 = r6 + 1
            r9 = r0
            r11 = r3
            r10 = r5
            r0 = r7
            r15 = r21
            r14 = r22
            r3 = r23
            r6 = r24
            r4 = r26
            r5 = r28
            r17 = r32
            r7 = r2
            r2 = r39
            goto L_0x0065
        L_0x0349:
            r7 = r0
            r0 = r2
            r8 = r6
            r3 = r11
            r6 = r17
            r4 = r18
            r9 = 0
            java.lang.System.arraycopy(r8, r9, r0, r9, r6)
            java.lang.Object[] r0 = defpackage.oze.U(r4, r3)
            pj6[] r0 = (defpackage.pj6[]) r0
            r7.L0 = r0
            e8c r0 = defpackage.ws6.k(r0)
            yc5 r1 = new yc5
            r2 = 22
            r1.<init>(r2)
            java.util.AbstractList r1 = defpackage.jjd.S(r1, r0)
            s59 r2 = r7.A0
            r2.getClass()
            y83 r2 = new y83
            r2.<init>(r0, r1)
            r7.N0 = r2
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci6.g(g55[], boolean[], yjc[], boolean[], long):long");
    }

    public final long h(long j, xtc xtc) {
        pj6[] pj6Arr = this.L0;
        int length = pj6Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            pj6 pj6 = pj6Arr[i];
            if (pj6.P0 == 2) {
                uh6 uh6 = pj6.o;
                int b2 = uh6.r.b();
                Uri[] uriArr = uh6.e;
                int length2 = uriArr.length;
                f84 f84 = uh6.g;
                ni6 b3 = (b2 >= length2 || b2 == -1) ? null : f84.b(uriArr[uh6.r.i()], true);
                if (b3 != null) {
                    ws6 ws6 = b3.r;
                    if (!ws6.isEmpty() && b3.c) {
                        long j2 = b3.h - f84.Z;
                        long j3 = j - j2;
                        int d = oze.d(Long.valueOf(j3), ws6, true);
                        long j4 = ((ii6) ws6.get(d)).X;
                        return xtc.a(j3, j4, d != ws6.size() - 1 ? ((ii6) ws6.get(d + 1)).X : j4) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    public final void i() {
        pj6[] pj6Arr = this.K0;
        int length = pj6Arr.length;
        int i = 0;
        while (i < length) {
            pj6 pj6 = pj6Arr[i];
            pj6.A();
            if (!pj6.i1 || pj6.S0) {
                i++;
            } else {
                throw ParserException.a((RuntimeException) null, "Loading finished before preparation is complete.");
            }
        }
    }

    public final long k(long j) {
        pj6[] pj6Arr = this.L0;
        if (pj6Arr.length > 0) {
            boolean F = pj6Arr[0].F(j, false);
            int i = 1;
            while (true) {
                pj6[] pj6Arr2 = this.L0;
                if (i >= pj6Arr2.length) {
                    break;
                }
                pj6Arr2[i].F(j, F);
                i++;
            }
            if (F) {
                ((SparseArray) this.z0.b).clear();
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0121, code lost:
        if (r2[r7] != 1) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0263  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.q88 r27, long r28) {
        /*
            r26 = this;
            r10 = r26
            r11 = 1
            r0 = r27
            r10.H0 = r0
            f84 r0 = r10.b
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.c
            r1.add(r10)
            java.lang.Object r0 = r0.C0
            r12 = r0
            vi6 r12 = (defpackage.vi6) r12
            r12.getClass()
            boolean r0 = r10.D0
            r13 = 0
            if (r0 == 0) goto L_0x008d
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r12.k
            r0.<init>(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r13
        L_0x002b:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x008b
            java.lang.Object r4 = r1.get(r3)
            xn4 r4 = (defpackage.xn4) r4
            java.lang.String r5 = r4.c
            int r3 = r3 + r11
            r6 = r3
        L_0x003b:
            int r7 = r0.size()
            if (r6 >= r7) goto L_0x0087
            java.lang.Object r7 = r0.get(r6)
            xn4 r7 = (defpackage.xn4) r7
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
            defpackage.oyb.k(r14)
            if (r8 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r8 = r9
        L_0x0068:
            int r9 = defpackage.oze.a
            vn4[] r4 = r4.a
            int r9 = r4.length
            vn4[] r7 = r7.a
            int r14 = r7.length
            int r9 = r9 + r14
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r4, r9)
            int r4 = r4.length
            int r14 = r7.length
            java.lang.System.arraycopy(r7, r13, r9, r4, r14)
            vn4[] r9 = (defpackage.vn4[]) r9
            xn4 r4 = new xn4
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
            r10.I0 = r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            xh6 r9 = r10.a
            boolean r7 = r10.B0
            java.util.List r6 = r12.f
            if (r1 == 0) goto L_0x02b6
            int r1 = r0.size()
            int[] r2 = new int[r1]
            r3 = r13
            r4 = r3
            r5 = r4
        L_0x00b6:
            int r13 = r0.size()
            if (r3 >= r13) goto L_0x00eb
            java.lang.Object r13 = r0.get(r3)
            ti6 r13 = (defpackage.ti6) r13
            xu5 r13 = r13.b
            int r11 = r13.u
            if (r11 > 0) goto L_0x00e3
            java.lang.String r11 = r13.j
            r13 = 2
            java.lang.String r17 = defpackage.oze.v(r13, r11)
            if (r17 == 0) goto L_0x00d4
            r11 = 2
            r13 = 1
            goto L_0x00e5
        L_0x00d4:
            r13 = 1
            java.lang.String r11 = defpackage.oze.v(r13, r11)
            if (r11 == 0) goto L_0x00df
            r2[r3] = r13
            int r5 = r5 + r13
            goto L_0x00e8
        L_0x00df:
            r11 = -1
            r2[r3] = r11
            goto L_0x00e8
        L_0x00e3:
            r13 = 1
            r11 = 2
        L_0x00e5:
            r2[r3] = r11
            int r4 = r4 + r13
        L_0x00e8:
            int r3 = r3 + r13
            r11 = r13
            goto L_0x00b6
        L_0x00eb:
            if (r4 <= 0) goto L_0x00f1
            r11 = r4
            r1 = 1
        L_0x00ef:
            r3 = 0
            goto L_0x00fb
        L_0x00f1:
            if (r5 >= r1) goto L_0x00f8
            int r1 = r1 - r5
            r11 = r1
            r1 = 0
            r3 = 1
            goto L_0x00fb
        L_0x00f8:
            r11 = r1
            r1 = 0
            goto L_0x00ef
        L_0x00fb:
            android.net.Uri[] r4 = new android.net.Uri[r11]
            xu5[] r13 = new defpackage.xu5[r11]
            int[] r5 = new int[r11]
            r17 = r7
            r19 = r8
            r7 = 0
            r18 = 0
        L_0x0108:
            int r8 = r0.size()
            if (r7 >= r8) goto L_0x0140
            if (r1 == 0) goto L_0x011a
            r8 = r2[r7]
            r20 = r9
            r9 = 2
            if (r8 != r9) goto L_0x0118
            goto L_0x011c
        L_0x0118:
            r9 = 1
            goto L_0x0124
        L_0x011a:
            r20 = r9
        L_0x011c:
            if (r3 == 0) goto L_0x0126
            r8 = r2[r7]
            r9 = 1
            if (r8 == r9) goto L_0x0124
            goto L_0x0127
        L_0x0124:
            r8 = r9
            goto L_0x013c
        L_0x0126:
            r9 = 1
        L_0x0127:
            java.lang.Object r8 = r0.get(r7)
            ti6 r8 = (defpackage.ti6) r8
            android.net.Uri r9 = r8.a
            r4[r18] = r9
            xu5 r8 = r8.b
            r13[r18] = r8
            r8 = 1
            int r9 = r18 + 1
            r5[r18] = r7
            r18 = r9
        L_0x013c:
            int r7 = r7 + r8
            r9 = r20
            goto L_0x0108
        L_0x0140:
            r20 = r9
            r7 = 0
            r8 = 1
            r0 = r13[r7]
            java.lang.String r0 = r0.j
            r2 = 2
            int r9 = defpackage.oze.u(r2, r0)
            int r7 = defpackage.oze.u(r8, r0)
            if (r7 == r8) goto L_0x015b
            if (r7 != 0) goto L_0x0164
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0164
        L_0x015b:
            if (r9 > r8) goto L_0x0164
            int r0 = r7 + r9
            if (r0 <= 0) goto L_0x0164
            r18 = 1
            goto L_0x0166
        L_0x0164:
            r18 = 0
        L_0x0166:
            if (r1 != 0) goto L_0x016c
            if (r7 <= 0) goto L_0x016c
            r2 = 1
            goto L_0x016d
        L_0x016c:
            r2 = 0
        L_0x016d:
            java.lang.String r8 = "main"
            xu5 r3 = r12.h
            java.util.List r1 = r12.i
            r0 = r26
            r21 = r1
            r1 = r8
            r22 = r3
            r3 = r4
            r4 = r13
            r10 = r5
            r5 = r22
            r22 = r6
            r6 = r21
            r21 = r7
            r7 = r14
            r24 = r8
            r23 = r14
            r14 = r19
            r19 = r20
            r20 = r9
            r8 = r28
            pj6 r0 = r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.add(r0)
            r14.add(r10)
            if (r17 == 0) goto L_0x02bf
            if (r18 == 0) goto L_0x02bf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            xu5 r2 = r12.h
            if (r20 <= 0) goto L_0x0263
            xu5[] r3 = new defpackage.xu5[r11]
            r4 = 0
        L_0x01ac:
            if (r4 >= r11) goto L_0x020a
            r5 = r13[r4]
            java.lang.String r6 = r5.j
            r7 = 2
            java.lang.String r6 = defpackage.oze.v(r7, r6)
            java.lang.String r8 = defpackage.c49.c(r6)
            uu5 r9 = new uu5
            r9.<init>()
            java.lang.String r10 = r5.a
            r9.a = r10
            java.lang.String r10 = r5.b
            r9.b = r10
            java.util.List r10 = r5.c
            ws6 r10 = defpackage.ws6.j(r10)
            r9.c = r10
            java.lang.String r10 = r5.m
            java.lang.String r10 = defpackage.c49.l(r10)
            r9.l = r10
            java.lang.String r8 = defpackage.c49.l(r8)
            r9.m = r8
            r9.i = r6
            a39 r6 = r5.k
            r9.j = r6
            int r6 = r5.g
            r9.g = r6
            int r6 = r5.h
            r9.h = r6
            int r6 = r5.t
            r9.s = r6
            int r6 = r5.u
            r9.t = r6
            float r6 = r5.v
            r9.u = r6
            int r6 = r5.e
            r9.e = r6
            int r5 = r5.f
            r9.f = r5
            xu5 r5 = new xu5
            r5.<init>(r9)
            r3[r4] = r5
            r5 = 1
            int r4 = r4 + r5
            goto L_0x01ac
        L_0x020a:
            uoe r4 = new uoe
            r5 = r24
            r4.<init>(r5, r3)
            r1.add(r4)
            if (r21 <= 0) goto L_0x0233
            if (r2 != 0) goto L_0x021e
            boolean r3 = r22.isEmpty()
            if (r3 == 0) goto L_0x0233
        L_0x021e:
            uoe r3 = new uoe
            r4 = 0
            r5 = r13[r4]
            xu5 r2 = e(r5, r2, r4)
            xu5[] r2 = new defpackage.xu5[]{r2}
            java.lang.String r4 = "main:audio"
            r3.<init>(r4, r2)
            r1.add(r3)
        L_0x0233:
            java.util.List r2 = r12.i
            if (r2 == 0) goto L_0x0261
            r3 = 0
        L_0x0238:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0261
            java.lang.String r4 = "main:cc:"
            java.lang.String r4 = wn6.h(r3, r4)
            uoe r5 = new uoe
            java.lang.Object r6 = r2.get(r3)
            xu5 r6 = (defpackage.xu5) r6
            r9 = r19
            a84 r9 = (defpackage.a84) r9
            xu5 r6 = r9.c(r6)
            xu5[] r6 = new defpackage.xu5[]{r6}
            r5.<init>(r4, r6)
            r1.add(r5)
            r4 = 1
            int r3 = r3 + r4
            goto L_0x0238
        L_0x0261:
            r4 = 1
            goto L_0x027d
        L_0x0263:
            r5 = r24
            r4 = 1
            xu5[] r3 = new defpackage.xu5[r11]
            r6 = 0
        L_0x0269:
            if (r6 >= r11) goto L_0x0275
            r7 = r13[r6]
            xu5 r7 = e(r7, r2, r4)
            r3[r6] = r7
            int r6 = r6 + r4
            goto L_0x0269
        L_0x0275:
            uoe r2 = new uoe
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x027d:
            uoe r2 = new uoe
            uu5 r3 = new uu5
            r3.<init>()
            java.lang.String r4 = "ID3"
            r3.a = r4
            java.lang.String r4 = "application/id3"
            java.lang.String r4 = defpackage.c49.l(r4)
            r3.m = r4
            xu5 r4 = new xu5
            r4.<init>(r3)
            xu5[] r3 = new defpackage.xu5[]{r4}
            java.lang.String r4 = "main:id3"
            r2.<init>(r4, r3)
            r1.add(r2)
            r3 = 0
            uoe[] r4 = new defpackage.uoe[r3]
            java.lang.Object[] r3 = r1.toArray(r4)
            uoe[] r3 = (defpackage.uoe[]) r3
            int r1 = r1.indexOf(r2)
            int[] r1 = new int[]{r1}
            r0.C(r3, r1)
            goto L_0x02bf
        L_0x02b6:
            r22 = r6
            r17 = r7
            r19 = r9
            r23 = r14
            r14 = r8
        L_0x02bf:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r22.size()
            r10.<init>(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r22.size()
            r11.<init>(r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r22.size()
            r13.<init>(r0)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r9 = 0
        L_0x02e0:
            int r0 = r22.size()
            if (r9 >= r0) goto L_0x03b1
            r7 = r22
            java.lang.Object r0 = r7.get(r9)
            ri6 r0 = (defpackage.ri6) r0
            java.lang.String r0 = r0.c
            boolean r1 = r8.add(r0)
            if (r1 != 0) goto L_0x02ff
            r18 = r7
            r20 = r8
            r21 = r9
        L_0x02fc:
            r0 = 1
            goto L_0x03a9
        L_0x02ff:
            r10.clear()
            r11.clear()
            r13.clear()
            r1 = 0
            r16 = 1
        L_0x030b:
            int r2 = r7.size()
            if (r1 >= r2) goto L_0x034a
            java.lang.Object r2 = r7.get(r1)
            ri6 r2 = (defpackage.ri6) r2
            java.lang.String r2 = r2.c
            boolean r2 = defpackage.oze.a(r0, r2)
            if (r2 == 0) goto L_0x0347
            java.lang.Object r2 = r7.get(r1)
            ri6 r2 = (defpackage.ri6) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r13.add(r3)
            android.net.Uri r3 = r2.a
            r10.add(r3)
            xu5 r2 = r2.b
            r11.add(r2)
            java.lang.String r2 = r2.j
            r3 = 1
            int r2 = defpackage.oze.u(r3, r2)
            if (r2 != r3) goto L_0x0341
            r2 = r3
            goto L_0x0342
        L_0x0341:
            r2 = 0
        L_0x0342:
            r2 = r16 & r2
            r16 = r2
            goto L_0x0348
        L_0x0347:
            r3 = 1
        L_0x0348:
            int r1 = r1 + r3
            goto L_0x030b
        L_0x034a:
            java.lang.String r1 = "audio:"
            java.lang.String r6 = rf0.h(r1, r0)
            r0 = 0
            android.net.Uri[] r1 = new android.net.Uri[r0]
            int r2 = defpackage.oze.a
            java.lang.Object[] r1 = r10.toArray(r1)
            r3 = r1
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            xu5[] r1 = new defpackage.xu5[r0]
            java.lang.Object[] r0 = r11.toArray(r1)
            r4 = r0
            xu5[] r4 = (defpackage.xu5[]) r4
            java.util.List r18 = java.util.Collections.emptyList()
            r2 = 1
            r5 = 0
            r0 = r26
            r1 = r6
            r25 = r6
            r6 = r18
            r18 = r7
            r7 = r23
            r20 = r8
            r21 = r9
            r8 = r28
            pj6 r0 = r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = defpackage.xie.H(r13)
            r14.add(r1)
            r15.add(r0)
            if (r17 == 0) goto L_0x02fc
            if (r16 == 0) goto L_0x02fc
            r1 = 0
            xu5[] r2 = new defpackage.xu5[r1]
            java.lang.Object[] r2 = r11.toArray(r2)
            xu5[] r2 = (defpackage.xu5[]) r2
            uoe r3 = new uoe
            r4 = r25
            r3.<init>(r4, r2)
            uoe[] r2 = new defpackage.uoe[]{r3}
            int[] r3 = new int[r1]
            r0.C(r2, r3)
            goto L_0x02fc
        L_0x03a9:
            int r9 = r21 + 1
            r22 = r18
            r8 = r20
            goto L_0x02e0
        L_0x03b1:
            int r0 = r15.size()
            r10 = r26
            r10.M0 = r0
            r11 = 0
        L_0x03ba:
            java.util.List r0 = r12.g
            int r1 = r0.size()
            if (r11 >= r1) goto L_0x0423
            java.lang.Object r0 = r0.get(r11)
            ri6 r0 = (defpackage.ri6) r0
            java.lang.String r1 = "subtitle:"
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = me4.m(r11, r1, r2)
            java.lang.String r2 = r0.c
            r1.append(r2)
            java.lang.String r13 = r1.toString()
            android.net.Uri r1 = r0.a
            android.net.Uri[] r3 = new android.net.Uri[]{r1}
            xu5 r8 = r0.b
            xu5[] r4 = new defpackage.xu5[]{r8}
            java.util.List r6 = java.util.Collections.emptyList()
            r2 = 3
            r5 = 0
            r0 = r26
            r1 = r13
            r7 = r23
            r16 = r12
            r12 = r8
            r8 = r28
            pj6 r0 = r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = new int[]{r11}
            r14.add(r1)
            r15.add(r0)
            uoe r1 = new uoe
            r9 = r19
            a84 r9 = (defpackage.a84) r9
            xu5 r2 = r9.c(r12)
            xu5[] r2 = new defpackage.xu5[]{r2}
            r1.<init>(r13, r2)
            uoe[] r1 = new defpackage.uoe[]{r1}
            r7 = 0
            int[] r2 = new int[r7]
            r0.C(r1, r2)
            r0 = 1
            int r11 = r11 + r0
            r12 = r16
            goto L_0x03ba
        L_0x0423:
            r7 = 0
            pj6[] r0 = new defpackage.pj6[r7]
            java.lang.Object[] r0 = r15.toArray(r0)
            pj6[] r0 = (defpackage.pj6[]) r0
            r10.K0 = r0
            int[][] r0 = new int[r7][]
            java.lang.Object[] r0 = r14.toArray(r0)
            int[][] r0 = (int[][]) r0
            pj6[] r0 = r10.K0
            int r0 = r0.length
            r10.I0 = r0
            r0 = r7
        L_0x043c:
            int r1 = r10.M0
            if (r0 >= r1) goto L_0x044b
            pj6[] r1 = r10.K0
            r1 = r1[r0]
            uh6 r1 = r1.o
            r2 = 1
            r1.m = r2
            int r0 = r0 + r2
            goto L_0x043c
        L_0x044b:
            pj6[] r0 = r10.K0
            int r1 = r0.length
            r13 = r7
        L_0x044f:
            if (r13 >= r1) goto L_0x046b
            r2 = r0[r13]
            boolean r3 = r2.S0
            if (r3 != 0) goto L_0x0468
            pj7 r3 = new pj7
            r3.<init>()
            long r4 = r2.e1
            r3.a = r4
            qj7 r4 = new qj7
            r4.<init>(r3)
            r2.m(r4)
        L_0x0468:
            r2 = 1
            int r13 = r13 + r2
            goto L_0x044f
        L_0x046b:
            pj6[] r0 = r10.K0
            r10.L0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci6.l(q88, long):void");
    }

    public final boolean m(qj7 qj7) {
        if (this.J0 != null) {
            return this.N0.m(qj7);
        }
        for (pj6 pj6 : this.K0) {
            if (!pj6.S0) {
                pj7 pj7 = new pj7();
                pj7.a = pj6.e1;
                pj6.m(new qj7(pj7));
            }
        }
        return false;
    }

    public final long o() {
        return -9223372036854775807L;
    }

    public final woe p() {
        woe woe = this.J0;
        woe.getClass();
        return woe;
    }

    public final long r() {
        return this.N0.r();
    }

    public final void s(long j, boolean z) {
        for (pj6 pj6 : this.L0) {
            if (pj6.R0 && !pj6.y()) {
                int length = pj6.K0.length;
                for (int i = 0; i < length; i++) {
                    pj6.K0[i].g(j, z, pj6.c1[i]);
                }
            }
        }
    }

    public final void u(long j) {
        this.N0.u(j);
    }
}
