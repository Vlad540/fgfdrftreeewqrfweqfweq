package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mse  reason: default package */
public final class mse implements e75 {
    public ni5 A0;
    public i75 B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public rse G0;
    public int H0;
    public int I0;
    public final SparseIntArray X;
    public final cc4 Y;
    public final s1e Z;
    public final int a;
    public final int b;
    public final List c;
    public final ija o;
    public final SparseArray w0;
    public final SparseBooleanArray x0;
    public final SparseBooleanArray y0;
    public final kse z0;

    public mse(int i, int i2, s1e s1e, cke cke, cc4 cc4) {
        this.Y = cc4;
        this.a = i;
        this.b = i2;
        this.Z = s1e;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(cke);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(cke);
        }
        this.o = new ija(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.x0 = sparseBooleanArray;
        this.y0 = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.w0 = sparseArray;
        this.X = new SparseIntArray();
        this.z0 = new kse(1);
        this.B0 = i75.v;
        this.I0 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (rse) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new mtc(new v4b(this)));
        this.G0 = null;
    }

    public final void S(i75 i75) {
        if ((this.b & 1) == 0) {
            i75 = new it4(i75, this.Z);
        }
        this.B0 = i75;
    }

    public final void d(long j, long j2) {
        ni5 ni5;
        long j3;
        oyb.k(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cke cke = (cke) list.get(i);
            synchronized (cke) {
                j3 = cke.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long d = cke.d();
                z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
            }
            if (z) {
                cke.f(j2);
            }
        }
        if (!(j2 == 0 || (ni5 = this.A0) == null)) {
            ni5.e(j2);
        }
        this.o.D(0);
        this.X.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.w0;
            if (i2 < sparseArray.size()) {
                ((rse) sparseArray.valueAt(i2)).a();
                i2++;
            } else {
                this.H0 = 0;
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: rse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: ll0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: ni5} */
    /* JADX WARNING: type inference failed for: r4v19, types: [java.lang.Object, hl0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.g75 r28, le4 r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            r2 = r28
            r74 r2 = (defpackage.r74) r2
            long r14 = r2.c
            r2 = 0
            r12 = 1
            int r13 = r0.a
            r10 = 2
            if (r13 != r10) goto L_0x0014
            r17 = r12
            goto L_0x0016
        L_0x0014:
            r17 = r2
        L_0x0016:
            boolean r3 = r0.D0
            r11 = 71
            r18 = -1
            if (r3 == 0) goto L_0x019e
            int r3 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            kse r6 = r0.z0
            if (r3 == 0) goto L_0x0118
            if (r17 != 0) goto L_0x0118
            boolean r3 = r6.b
            if (r3 != 0) goto L_0x0118
            int r0 = r0.I0
            if (r0 > 0) goto L_0x003c
            r0 = r28
            r74 r0 = (defpackage.r74) r0
            r6.b(r0)
            goto L_0x0117
        L_0x003c:
            boolean r3 = r6.d
            java.lang.Object r7 = r6.i
            ija r7 = (defpackage.ija) r7
            int r8 = r6.a
            if (r3 != 0) goto L_0x009f
            r3 = r28
            r74 r3 = (defpackage.r74) r3
            long r8 = (long) r8
            long r13 = r3.c
            long r8 = java.lang.Math.min(r8, r13)
            int r8 = (int) r8
            long r9 = (long) r8
            long r13 = r13 - r9
            long r9 = r3.o
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x005f
            r1.a = r13
        L_0x005c:
            r2 = r12
            goto L_0x0117
        L_0x005f:
            r7.D(r8)
            r3.Y = r2
            byte[] r1 = r7.a
            r3.r(r1, r2, r8, r2)
            int r1 = r7.b
            int r3 = r7.c
            int r8 = r3 + -188
        L_0x006f:
            if (r8 < r1) goto L_0x0099
            byte[] r9 = r7.a
            r10 = -4
            r13 = r2
        L_0x0075:
            r14 = 4
            if (r10 > r14) goto L_0x0096
            int r14 = r10 * 188
            int r14 = r14 + r8
            if (r14 < r1) goto L_0x0092
            if (r14 >= r3) goto L_0x0092
            byte r14 = r9[r14]
            if (r14 == r11) goto L_0x0084
            goto L_0x0092
        L_0x0084:
            int r13 = r13 + r12
            r14 = 5
            if (r13 != r14) goto L_0x0093
            long r9 = defpackage.xie.E(r7, r8, r0)
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0096
            r4 = r9
            goto L_0x0099
        L_0x0092:
            r13 = r2
        L_0x0093:
            int r10 = r10 + 1
            goto L_0x0075
        L_0x0096:
            int r8 = r8 + -1
            goto L_0x006f
        L_0x0099:
            r6.f = r4
            r6.d = r12
            goto L_0x0117
        L_0x009f:
            long r9 = r6.f
            int r3 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x00ae
            r0 = r28
            r74 r0 = (defpackage.r74) r0
            r6.b(r0)
            goto L_0x0117
        L_0x00ae:
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x00f1
            long r8 = (long) r8
            r3 = r28
            r74 r3 = (defpackage.r74) r3
            long r13 = r3.c
            long r8 = java.lang.Math.min(r8, r13)
            int r8 = (int) r8
            long r9 = r3.o
            long r13 = (long) r2
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x00c8
            r1.a = r13
            goto L_0x005c
        L_0x00c8:
            r7.D(r8)
            r3.Y = r2
            byte[] r1 = r7.a
            r3.r(r1, r2, r8, r2)
            int r1 = r7.b
            int r3 = r7.c
        L_0x00d6:
            if (r1 >= r3) goto L_0x00ec
            byte[] r8 = r7.a
            byte r8 = r8[r1]
            if (r8 == r11) goto L_0x00df
            goto L_0x00e9
        L_0x00df:
            long r8 = defpackage.xie.E(r7, r1, r0)
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x00e9
            r4 = r8
            goto L_0x00ec
        L_0x00e9:
            int r1 = r1 + 1
            goto L_0x00d6
        L_0x00ec:
            r6.e = r4
            r6.c = r12
            goto L_0x0117
        L_0x00f1:
            long r0 = r6.e
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x00ff
            r0 = r28
            r74 r0 = (defpackage.r74) r0
            r6.b(r0)
            goto L_0x0117
        L_0x00ff:
            java.lang.Object r3 = r6.h
            cke r3 = (defpackage.cke) r3
            long r0 = r3.b(r0)
            long r4 = r6.f
            long r3 = r3.c(r4)
            long r3 = r3 - r0
            r6.g = r3
            r0 = r28
            r74 r0 = (defpackage.r74) r0
            r6.b(r0)
        L_0x0117:
            return r2
        L_0x0118:
            boolean r3 = r0.E0
            if (r3 != 0) goto L_0x016c
            r0.E0 = r12
            long r7 = r6.g
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x015d
            ni5 r9 = new ni5
            int r3 = r0.I0
            om3 r4 = new om3
            r4.<init>()
            jse r5 = new jse
            java.lang.Object r6 = r6.h
            cke r6 = (defpackage.cke) r6
            r5.<init>(r3, r6)
            r20 = 1
            long r20 = r7 + r20
            r16 = 940(0x3ac, float:1.317E-42)
            r22 = 0
            r24 = 188(0xbc, double:9.3E-322)
            r3 = r9
            r6 = r7
            r2 = r9
            r8 = r20
            r10 = r22
            r26 = r13
            r12 = r14
            r20 = r14
            r14 = r24
            r3.<init>((defpackage.hl0) r4, (defpackage.kl0) r5, (long) r6, (long) r8, (long) r10, (long) r12, (long) r14, (int) r16)
            r0.A0 = r2
            i75 r3 = r0.B0
            java.lang.Object r2 = r2.c
            el0 r2 = (defpackage.el0) r2
            r3.M(r2)
            goto L_0x0170
        L_0x015d:
            r26 = r13
            r20 = r14
            i75 r2 = r0.B0
            wc0 r3 = new wc0
            r3.<init>(r7)
            r2.M(r3)
            goto L_0x0170
        L_0x016c:
            r26 = r13
            r20 = r14
        L_0x0170:
            boolean r2 = r0.F0
            if (r2 == 0) goto L_0x018a
            r2 = 0
            r0.F0 = r2
            r2 = 0
            r0.d(r2, r2)
            r4 = r28
            r74 r4 = (defpackage.r74) r4
            long r4 = r4.o
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x018a
            r1.a = r2
            r2 = 1
            return r2
        L_0x018a:
            r2 = 1
            ni5 r3 = r0.A0
            if (r3 == 0) goto L_0x01a3
            java.lang.Object r4 = r3.e
            fl0 r4 = (defpackage.fl0) r4
            if (r4 == 0) goto L_0x01a3
            r0 = r28
            r74 r0 = (defpackage.r74) r0
            int r0 = r3.b(r0, r1)
            return r0
        L_0x019e:
            r2 = r12
            r26 = r13
            r20 = r14
        L_0x01a3:
            ija r1 = r0.o
            byte[] r3 = r1.a
            int r4 = r1.b
            int r4 = 9400 - r4
            r5 = 188(0xbc, float:2.63E-43)
            if (r4 >= r5) goto L_0x01be
            int r4 = r1.a()
            if (r4 <= 0) goto L_0x01bb
            int r6 = r1.b
            r7 = 0
            java.lang.System.arraycopy(r3, r6, r3, r7, r4)
        L_0x01bb:
            r1.E(r4, r3)
        L_0x01be:
            int r4 = r1.a()
            android.util.SparseArray r6 = r0.w0
            if (r4 >= r5) goto L_0x020a
            int r4 = r1.c
            int r7 = 9400 - r4
            r8 = r28
            r74 r8 = (defpackage.r74) r8
            int r7 = r8.read(r3, r4, r7)
            r8 = -1
            if (r7 != r8) goto L_0x0205
            r0 = 0
        L_0x01d6:
            int r1 = r6.size()
            if (r0 >= r1) goto L_0x0204
            java.lang.Object r1 = r6.valueAt(r0)
            rse r1 = (defpackage.rse) r1
            boolean r3 = r1 instanceof defpackage.yna
            if (r3 == 0) goto L_0x0201
            yna r1 = (defpackage.yna) r1
            int r3 = r1.c
            r4 = 3
            if (r3 != r4) goto L_0x0201
            int r3 = r1.j
            if (r3 != r8) goto L_0x0201
            if (r17 == 0) goto L_0x01f9
            ys4 r3 = r1.a
            boolean r3 = r3 instanceof defpackage.gd6
            if (r3 != 0) goto L_0x0201
        L_0x01f9:
            ija r3 = new ija
            r3.<init>()
            r1.b(r2, r3)
        L_0x0201:
            int r0 = r0 + 1
            goto L_0x01d6
        L_0x0204:
            return r8
        L_0x0205:
            int r4 = r4 + r7
            r1.F(r4)
            goto L_0x01be
        L_0x020a:
            int r3 = r1.b
            int r4 = r1.c
            byte[] r5 = r1.a
            r7 = r3
        L_0x0211:
            if (r7 >= r4) goto L_0x021c
            byte r8 = r5[r7]
            r9 = 71
            if (r8 == r9) goto L_0x021c
            int r7 = r7 + 1
            goto L_0x0211
        L_0x021c:
            r1.G(r7)
            int r5 = r7 + 188
            r8 = 0
            if (r5 <= r4) goto L_0x023c
            int r4 = r0.H0
            int r7 = r7 - r3
            int r7 = r7 + r4
            r0.H0 = r7
            r3 = r26
            r4 = 2
            if (r3 != r4) goto L_0x0233
            r9 = 376(0x178, float:5.27E-43)
            if (r7 > r9) goto L_0x0235
        L_0x0233:
            r7 = 0
            goto L_0x0242
        L_0x0235:
            java.lang.String r0 = "Cannot find sync byte. Most likely not a Transport Stream."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r8, r0)
            throw r0
        L_0x023c:
            r3 = r26
            r4 = 2
            r7 = 0
            r0.H0 = r7
        L_0x0242:
            int r9 = r1.c
            if (r5 <= r9) goto L_0x0247
            return r7
        L_0x0247:
            int r10 = r1.g()
            r11 = 8388608(0x800000, float:1.17549435E-38)
            r11 = r11 & r10
            if (r11 == 0) goto L_0x0254
            r1.G(r5)
            return r7
        L_0x0254:
            r7 = 4194304(0x400000, float:5.877472E-39)
            r7 = r7 & r10
            if (r7 == 0) goto L_0x025b
            r12 = r2
            goto L_0x025c
        L_0x025b:
            r12 = 0
        L_0x025c:
            r7 = 2096896(0x1fff00, float:2.938377E-39)
            r7 = r7 & r10
            int r7 = r7 >> 8
            r11 = r10 & 32
            if (r11 == 0) goto L_0x0268
            r11 = r2
            goto L_0x0269
        L_0x0268:
            r11 = 0
        L_0x0269:
            r13 = r10 & 16
            if (r13 == 0) goto L_0x0274
            java.lang.Object r6 = r6.get(r7)
            r8 = r6
            rse r8 = (defpackage.rse) r8
        L_0x0274:
            if (r8 != 0) goto L_0x027b
            r1.G(r5)
            r6 = 0
            return r6
        L_0x027b:
            r6 = 0
            if (r3 == r4) goto L_0x0299
            r10 = r10 & 15
            android.util.SparseIntArray r13 = r0.X
            int r14 = r10 + -1
            int r14 = r13.get(r7, r14)
            r13.put(r7, r10)
            if (r14 != r10) goto L_0x0291
            r1.G(r5)
            return r6
        L_0x0291:
            int r14 = r14 + r2
            r6 = r14 & 15
            if (r10 == r6) goto L_0x0299
            r8.a()
        L_0x0299:
            if (r11 == 0) goto L_0x02af
            int r6 = r1.u()
            int r10 = r1.u()
            r10 = r10 & 64
            if (r10 == 0) goto L_0x02a9
            r10 = r4
            goto L_0x02aa
        L_0x02a9:
            r10 = 0
        L_0x02aa:
            r12 = r12 | r10
            int r6 = r6 - r2
            r1.H(r6)
        L_0x02af:
            boolean r6 = r0.D0
            if (r3 == r4) goto L_0x02be
            if (r6 != 0) goto L_0x02be
            android.util.SparseBooleanArray r10 = r0.y0
            r11 = 0
            boolean r7 = r10.get(r7, r11)
            if (r7 != 0) goto L_0x02c7
        L_0x02be:
            r1.F(r5)
            r8.b(r12, r1)
            r1.F(r9)
        L_0x02c7:
            if (r3 == r4) goto L_0x02d5
            if (r6 != 0) goto L_0x02d5
            boolean r3 = r0.D0
            if (r3 == 0) goto L_0x02d5
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x02d5
            r0.F0 = r2
        L_0x02d5:
            r1.G(r5)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mse.g(g75, le4):int");
    }

    public final boolean n(g75 g75) {
        byte[] bArr = this.o.a;
        ((r74) g75).r(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (bArr[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            ((r74) g75).z(i);
            return true;
        }
        return false;
    }

    public final void release() {
    }
}
