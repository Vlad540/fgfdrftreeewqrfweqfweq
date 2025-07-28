package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lse  reason: default package */
public final class lse implements d75 {
    public final int a;
    public final List b;
    public final yze c;
    public final SparseIntArray d;
    public final cc4 e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final kse i;
    public mi5 j;
    public h75 k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public qse p;
    public int q;
    public int r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lse() {
        /*
            r4 = this;
            r0 = 0
            bke r1 = new bke
            r2 = 0
            r1.<init>(r2)
            cc4 r2 = new cc4
            po5 r3 = defpackage.ws6.b
            e8c r3 = defpackage.e8c.X
            r2.<init>(r3, r0, r0)
            r0 = 1
            r4.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lse.<init>():void");
    }

    public final void d(long j2, long j3) {
        mi5 mi5;
        long j4;
        swb.h(this.a != 2);
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            bke bke = (bke) list.get(i2);
            synchronized (bke) {
                j4 = bke.b;
            }
            boolean z = j4 == -9223372036854775807L;
            if (!z) {
                long c2 = bke.c();
                z = (c2 == -9223372036854775807L || c2 == 0 || c2 == j3) ? false : true;
            }
            if (z) {
                bke.d(j3);
            }
        }
        if (!(j3 == 0 || (mi5 = this.j) == null)) {
            mi5.e(j3);
        }
        this.c.E(0);
        this.d.clear();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i3 < sparseArray.size()) {
                ((qse) sparseArray.valueAt(i3)).a();
                i3++;
            } else {
                this.q = 0;
                return;
            }
        }
    }

    public final void g(h75 h75) {
        this.k = h75;
    }

    public final boolean h(f75 f75) {
        byte[] bArr = this.c.a;
        q74 q74 = (q74) f75;
        q74.r(bArr, 0, 940, false);
        int i2 = 0;
        while (i2 < 188) {
            int i3 = 0;
            while (i3 < 5) {
                if (bArr[(i3 * 188) + i2] != 71) {
                    i2++;
                } else {
                    i3++;
                }
            }
            q74.z(i2);
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: ll0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: mi5} */
    /* JADX WARNING: type inference failed for: r6v4, types: [wx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v15, types: [gl0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.f75 r32, le4 r33) {
        /*
            r31 = this;
            r0 = r31
            r1 = r33
            r2 = r32
            q74 r2 = (defpackage.q74) r2
            long r14 = r2.c
            boolean r2 = r0.m
            r12 = 71
            r13 = 0
            r10 = 1
            r17 = -1
            int r11 = r0.a
            r8 = 2
            if (r2 == 0) goto L_0x01e3
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            kse r5 = r0.i
            r6 = 0
            if (r2 == 0) goto L_0x0136
            if (r11 == r8) goto L_0x0136
            boolean r2 = r5.b
            if (r2 != 0) goto L_0x0136
            int r0 = r0.r
            if (r0 > 0) goto L_0x0032
            r0 = r32
            q74 r0 = (defpackage.q74) r0
            r5.a(r0)
            goto L_0x0135
        L_0x0032:
            boolean r2 = r5.d
            java.lang.Object r8 = r5.i
            yze r8 = (defpackage.yze) r8
            int r9 = r5.a
            if (r2 != 0) goto L_0x009f
            r2 = r32
            q74 r2 = (defpackage.q74) r2
            long r6 = (long) r9
            long r14 = r2.c
            long r6 = java.lang.Math.min(r6, r14)
            int r6 = (int) r6
            long r3 = (long) r6
            long r14 = r14 - r3
            long r3 = r2.o
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0055
            r1.a = r14
        L_0x0052:
            r13 = r10
            goto L_0x0135
        L_0x0055:
            r8.E(r6)
            r2.Y = r13
            byte[] r1 = r8.a
            r2.r(r1, r13, r6, r13)
            int r1 = r8.b
            int r2 = r8.c
            int r3 = r2 + -188
        L_0x0065:
            if (r3 < r1) goto L_0x0094
            byte[] r4 = r8.a
            r6 = -4
            r7 = r13
        L_0x006b:
            r9 = 4
            if (r6 > r9) goto L_0x0091
            int r9 = r6 * 188
            int r9 = r9 + r3
            if (r9 < r1) goto L_0x008d
            if (r9 >= r2) goto L_0x008d
            byte r9 = r4[r9]
            if (r9 == r12) goto L_0x007a
            goto L_0x008d
        L_0x007a:
            int r7 = r7 + r10
            r9 = 5
            if (r7 != r9) goto L_0x008e
            long r6 = defpackage.urd.H(r8, r3, r0)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0091
            r3 = r6
            goto L_0x0099
        L_0x008d:
            r7 = r13
        L_0x008e:
            int r6 = r6 + 1
            goto L_0x006b
        L_0x0091:
            int r3 = r3 + -1
            goto L_0x0065
        L_0x0094:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0099:
            r5.f = r3
            r5.d = r10
            goto L_0x0135
        L_0x009f:
            long r2 = r5.f
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x00b3
            r0 = r32
            q74 r0 = (defpackage.q74) r0
            r5.a(r0)
            goto L_0x0135
        L_0x00b3:
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x00ff
            long r2 = (long) r9
            r4 = r32
            q74 r4 = (defpackage.q74) r4
            long r6 = r4.c
            long r2 = java.lang.Math.min(r2, r6)
            int r2 = (int) r2
            long r6 = r4.o
            long r14 = (long) r13
            int r3 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x00cd
            r1.a = r14
            goto L_0x0052
        L_0x00cd:
            r8.E(r2)
            r4.Y = r13
            byte[] r1 = r8.a
            r4.r(r1, r13, r2, r13)
            int r1 = r8.b
            int r2 = r8.c
        L_0x00db:
            if (r1 >= r2) goto L_0x00f5
            byte[] r3 = r8.a
            byte r3 = r3[r1]
            if (r3 == r12) goto L_0x00e4
            goto L_0x00f2
        L_0x00e4:
            long r3 = defpackage.urd.H(r8, r1, r0)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x00f2
            goto L_0x00fa
        L_0x00f2:
            int r1 = r1 + 1
            goto L_0x00db
        L_0x00f5:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00fa:
            r5.e = r3
            r5.c = r10
            goto L_0x0135
        L_0x00ff:
            long r0 = r5.e
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0112
            r0 = r32
            q74 r0 = (defpackage.q74) r0
            r5.a(r0)
            goto L_0x0135
        L_0x0112:
            java.lang.Object r2 = r5.h
            bke r2 = (defpackage.bke) r2
            long r0 = r2.b(r0)
            long r3 = r5.f
            long r2 = r2.b(r3)
            long r2 = r2 - r0
            r5.g = r2
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x012e
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.g = r0
        L_0x012e:
            r0 = r32
            q74 r0 = (defpackage.q74) r0
            r5.a(r0)
        L_0x0135:
            return r13
        L_0x0136:
            boolean r2 = r0.n
            if (r2 != 0) goto L_0x01ae
            r0.n = r10
            long r2 = r5.g
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x019b
            mi5 r9 = new mi5
            int r4 = r0.r
            zl3 r16 = new zl3
            r16.<init>()
            wx r6 = new wx
            java.lang.Object r5 = r5.h
            bke r5 = (defpackage.bke) r5
            r6.<init>()
            r6.a = r4
            r6.c = r5
            r4 = 112800(0x1b8a0, float:1.58066E-40)
            r6.b = r4
            yze r4 = new yze
            r5 = 3
            r7 = 0
            r4.<init>((int) r5, (boolean) r7)
            r6.o = r4
            r4 = 1
            long r21 = r2 + r4
            r23 = 940(0x3ac, float:1.317E-42)
            r24 = 0
            r26 = 188(0xbc, double:9.3E-322)
            r4 = r2
            r3 = r9
            r28 = r4
            r4 = r16
            r5 = r6
            r6 = r28
            r2 = r9
            r8 = r21
            r30 = r11
            r10 = r24
            r12 = r14
            r20 = r14
            r14 = r26
            r16 = r23
            r3.<init>((defpackage.gl0) r4, (defpackage.jl0) r5, (long) r6, (long) r8, (long) r10, (long) r12, (long) r14, (int) r16)
            r0.j = r2
            h75 r3 = r0.k
            java.lang.Object r2 = r2.c
            dl0 r2 = (defpackage.dl0) r2
            r3.K(r2)
            goto L_0x01b2
        L_0x019b:
            r28 = r2
            r30 = r11
            r20 = r14
            h75 r2 = r0.k
            si5 r3 = new si5
            r4 = r28
            r3.<init>(r4)
            r2.K(r3)
            goto L_0x01b2
        L_0x01ae:
            r30 = r11
            r20 = r14
        L_0x01b2:
            boolean r2 = r0.o
            if (r2 == 0) goto L_0x01ce
            r2 = 0
            r0.o = r2
            r3 = 0
            r0.d(r3, r3)
            r5 = r32
            q74 r5 = (defpackage.q74) r5
            long r5 = r5.o
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x01cc
            r1.a = r3
            r3 = 1
            return r3
        L_0x01cc:
            r3 = 1
            goto L_0x01d0
        L_0x01ce:
            r2 = 0
            goto L_0x01cc
        L_0x01d0:
            mi5 r4 = r0.j
            if (r4 == 0) goto L_0x01e9
            java.lang.Object r5 = r4.e
            fl0 r5 = (defpackage.fl0) r5
            if (r5 == 0) goto L_0x01e9
            r0 = r32
            q74 r0 = (defpackage.q74) r0
            int r0 = r4.a(r0, r1)
            return r0
        L_0x01e3:
            r3 = r10
            r30 = r11
            r2 = r13
            r20 = r14
        L_0x01e9:
            yze r1 = r0.c
            byte[] r4 = r1.a
            int r5 = r1.b
            int r5 = 9400 - r5
            r6 = 188(0xbc, float:2.63E-43)
            if (r5 >= r6) goto L_0x0203
            int r5 = r1.c()
            if (r5 <= 0) goto L_0x0200
            int r7 = r1.b
            java.lang.System.arraycopy(r4, r7, r4, r2, r5)
        L_0x0200:
            r1.F(r5, r4)
        L_0x0203:
            int r5 = r1.c()
            if (r5 >= r6) goto L_0x021e
            int r5 = r1.c
            int r7 = 9400 - r5
            r8 = r32
            q74 r8 = (defpackage.q74) r8
            int r7 = r8.read(r4, r5, r7)
            r8 = -1
            if (r7 != r8) goto L_0x0219
            return r8
        L_0x0219:
            int r5 = r5 + r7
            r1.G(r5)
            goto L_0x0203
        L_0x021e:
            int r4 = r1.b
            int r5 = r1.c
            byte[] r6 = r1.a
            r7 = r4
        L_0x0225:
            if (r7 >= r5) goto L_0x0230
            byte r8 = r6[r7]
            r9 = 71
            if (r8 == r9) goto L_0x0230
            int r7 = r7 + 1
            goto L_0x0225
        L_0x0230:
            r1.H(r7)
            int r6 = r7 + 188
            r8 = 0
            if (r6 <= r5) goto L_0x024f
            int r5 = r0.q
            int r7 = r7 - r4
            int r7 = r7 + r5
            r0.q = r7
            r4 = r30
            r5 = 2
            if (r4 != r5) goto L_0x0253
            r5 = 376(0x178, float:5.27E-43)
            if (r7 > r5) goto L_0x0248
            goto L_0x0253
        L_0x0248:
            java.lang.String r0 = "Cannot find sync byte. Most likely not a Transport Stream."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r8, r0)
            throw r0
        L_0x024f:
            r4 = r30
            r0.q = r2
        L_0x0253:
            int r5 = r1.c
            if (r6 <= r5) goto L_0x0258
            return r2
        L_0x0258:
            int r7 = r1.h()
            r9 = 8388608(0x800000, float:1.17549435E-38)
            r9 = r9 & r7
            if (r9 == 0) goto L_0x0265
            r1.H(r6)
            return r2
        L_0x0265:
            r9 = 4194304(0x400000, float:5.877472E-39)
            r9 = r9 & r7
            if (r9 == 0) goto L_0x026c
            r13 = r3
            goto L_0x026d
        L_0x026c:
            r13 = r2
        L_0x026d:
            r9 = 2096896(0x1fff00, float:2.938377E-39)
            r9 = r9 & r7
            int r9 = r9 >> 8
            r10 = r7 & 32
            if (r10 == 0) goto L_0x0279
            r10 = r3
            goto L_0x027a
        L_0x0279:
            r10 = r2
        L_0x027a:
            r11 = r7 & 16
            if (r11 == 0) goto L_0x0286
            android.util.SparseArray r8 = r0.f
            java.lang.Object r8 = r8.get(r9)
            qse r8 = (defpackage.qse) r8
        L_0x0286:
            if (r8 != 0) goto L_0x028c
            r1.H(r6)
            return r2
        L_0x028c:
            r11 = 2
            if (r4 == r11) goto L_0x02aa
            r7 = r7 & 15
            android.util.SparseIntArray r11 = r0.d
            int r12 = r7 + -1
            int r12 = r11.get(r9, r12)
            r11.put(r9, r7)
            if (r12 != r7) goto L_0x02a2
            r1.H(r6)
            return r2
        L_0x02a2:
            int r12 = r12 + r3
            r11 = r12 & 15
            if (r7 == r11) goto L_0x02aa
            r8.a()
        L_0x02aa:
            if (r10 == 0) goto L_0x02c0
            int r7 = r1.v()
            int r10 = r1.v()
            r10 = r10 & 64
            if (r10 == 0) goto L_0x02ba
            r10 = 2
            goto L_0x02bb
        L_0x02ba:
            r10 = r2
        L_0x02bb:
            r13 = r13 | r10
            int r7 = r7 - r3
            r1.I(r7)
        L_0x02c0:
            boolean r7 = r0.m
            r10 = 2
            if (r4 == r10) goto L_0x02d2
            if (r7 != 0) goto L_0x02d2
            android.util.SparseBooleanArray r10 = r0.h
            boolean r9 = r10.get(r9, r2)
            if (r9 != 0) goto L_0x02d0
            goto L_0x02d2
        L_0x02d0:
            r5 = 2
            goto L_0x02dc
        L_0x02d2:
            r1.G(r6)
            r8.c(r13, r1)
            r1.G(r5)
            goto L_0x02d0
        L_0x02dc:
            if (r4 == r5) goto L_0x02ea
            if (r7 != 0) goto L_0x02ea
            boolean r4 = r0.m
            if (r4 == 0) goto L_0x02ea
            int r4 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x02ea
            r0.o = r3
        L_0x02ea:
            r1.H(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lse.i(f75, le4):int");
    }

    public final void release() {
    }

    public lse(int i2, bke bke, cc4 cc4) {
        this.e = cc4;
        this.a = i2;
        if (i2 == 1 || i2 == 2) {
            this.b = Collections.singletonList(bke);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(bke);
        }
        this.c = new yze(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.i = new kse(0);
        this.k = h75.u;
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (qse) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new ltc(new d4b(this)));
        this.p = null;
    }
}
