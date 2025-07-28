package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: sm8  reason: default package */
public final class sm8 implements r88, p88 {
    public final HashMap X = new HashMap();
    public p88 Y;
    public voe Z;
    public final r88[] a;
    public final IdentityHashMap b;
    public final lu7 c;
    public final ArrayList o = new ArrayList();
    public r88[] w0;
    public wwc x0;

    public sm8(lu7 lu7, long[] jArr, r88... r88Arr) {
        this.c = lu7;
        this.a = r88Arr;
        lu7.getClass();
        this.x0 = new wwc(9, new jyc[0]);
        this.b = new IdentityHashMap();
        this.w0 = new r88[0];
        for (int i = 0; i < r88Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new qm8(r88Arr[i], j);
            }
        }
    }

    public final long D(long j, wtc wtc) {
        r88[] r88Arr = this.w0;
        return (r88Arr.length > 0 ? r88Arr[0] : this.a[0]).D(j, wtc);
    }

    public final boolean F(long j) {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.x0.F(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((r88) arrayList.get(i)).F(j);
        }
        return false;
    }

    public final void L(p88 p88, long j) {
        this.Y = p88;
        ArrayList arrayList = this.o;
        r88[] r88Arr = this.a;
        Collections.addAll(arrayList, r88Arr);
        for (r88 L : r88Arr) {
            L.L(this, j);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long M(defpackage.f55[] r25, boolean[] r26, defpackage.xjc[] r27, boolean[] r28, long r29) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r6 = 0
        L_0x000d:
            int r7 = r1.length
            java.util.HashMap r8 = r0.X
            java.util.IdentityHashMap r9 = r0.b
            r88[] r11 = r0.a
            if (r6 >= r7) goto L_0x005a
            r7 = r2[r6]
            if (r7 != 0) goto L_0x001c
            r10 = 0
            goto L_0x0023
        L_0x001c:
            java.lang.Object r7 = r9.get(r7)
            r10 = r7
            java.lang.Integer r10 = (java.lang.Integer) r10
        L_0x0023:
            r7 = -1
            if (r10 != 0) goto L_0x0028
            r9 = r7
            goto L_0x002c
        L_0x0028:
            int r9 = r10.intValue()
        L_0x002c:
            r3[r6] = r9
            r4[r6] = r7
            r9 = r1[r6]
            if (r9 == 0) goto L_0x0057
            toe r9 = r9.a()
            java.lang.Object r8 = r8.get(r9)
            toe r8 = (defpackage.toe) r8
            r8.getClass()
            r9 = 0
        L_0x0042:
            int r10 = r11.length
            if (r9 >= r10) goto L_0x0057
            r10 = r11[r9]
            voe r10 = r10.p()
            int r10 = r10.b(r8)
            if (r10 == r7) goto L_0x0054
            r4[r6] = r9
            goto L_0x0057
        L_0x0054:
            int r9 = r9 + 1
            goto L_0x0042
        L_0x0057:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x005a:
            r9.clear()
            int r6 = r1.length
            xjc[] r7 = new defpackage.xjc[r6]
            int r12 = r1.length
            xjc[] r12 = new defpackage.xjc[r12]
            int r13 = r1.length
            f55[] r15 = new defpackage.f55[r13]
            java.util.ArrayList r14 = new java.util.ArrayList
            int r13 = r11.length
            r14.<init>(r13)
            r20 = r29
            r13 = 0
        L_0x006f:
            int r5 = r11.length
            if (r13 >= r5) goto L_0x011b
            r5 = 0
        L_0x0073:
            int r10 = r1.length
            if (r5 >= r10) goto L_0x00b1
            r10 = r3[r5]
            if (r10 != r13) goto L_0x007d
            r10 = r2[r5]
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            r12[r5] = r10
            r10 = r4[r5]
            if (r10 != r13) goto L_0x00a3
            r10 = r1[r5]
            r10.getClass()
            r16 = r14
            toe r14 = r10.a()
            java.lang.Object r14 = r8.get(r14)
            toe r14 = (defpackage.toe) r14
            r14.getClass()
            r23 = r8
            om8 r8 = new om8
            r8.<init>(r10, r14)
            r15[r5] = r8
            r8 = 0
            goto L_0x00aa
        L_0x00a3:
            r23 = r8
            r16 = r14
            r8 = 0
            r15[r5] = r8
        L_0x00aa:
            int r5 = r5 + 1
            r14 = r16
            r8 = r23
            goto L_0x0073
        L_0x00b1:
            r23 = r8
            r16 = r14
            r8 = 0
            r5 = r11[r13]
            r10 = r13
            r13 = r5
            r5 = r16
            r14 = r15
            r22 = r15
            r15 = r26
            r16 = r12
            r17 = r28
            r18 = r20
            long r13 = r13.M(r14, r15, r16, r17, r18)
            if (r10 != 0) goto L_0x00d0
            r20 = r13
            goto L_0x00d4
        L_0x00d0:
            int r13 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r13 != 0) goto L_0x0113
        L_0x00d4:
            r13 = 0
            r14 = 0
        L_0x00d6:
            int r15 = r1.length
            if (r13 >= r15) goto L_0x0103
            r15 = r4[r13]
            r16 = 1
            if (r15 != r10) goto L_0x00f2
            r14 = r12[r13]
            r14.getClass()
            r15 = r12[r13]
            r7[r13] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r9.put(r14, r15)
            r14 = r16
            goto L_0x0100
        L_0x00f2:
            r15 = r3[r13]
            if (r15 != r10) goto L_0x0100
            r15 = r12[r13]
            if (r15 != 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r16 = 0
        L_0x00fd:
            swb.h(r16)
        L_0x0100:
            int r13 = r13 + 1
            goto L_0x00d6
        L_0x0103:
            if (r14 == 0) goto L_0x010a
            r13 = r11[r10]
            r5.add(r13)
        L_0x010a:
            int r13 = r10 + 1
            r14 = r5
            r15 = r22
            r8 = r23
            goto L_0x006f
        L_0x0113:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Children enabled at different positions."
            r0.<init>(r1)
            throw r0
        L_0x011b:
            r5 = r14
            r1 = 0
            java.lang.System.arraycopy(r7, r1, r2, r1, r6)
            r88[] r1 = new defpackage.r88[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            r88[] r1 = (defpackage.r88[]) r1
            r0.w0 = r1
            lu7 r2 = r0.c
            r2.getClass()
            wwc r2 = new wwc
            r3 = 9
            r2.<init>(r3, r1)
            r0.x0 = r2
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm8.M(f55[], boolean[], xjc[], boolean[], long):long");
    }

    public final boolean b() {
        return this.x0.b();
    }

    public final void c(jyc jyc) {
        r88 r88 = (r88) jyc;
        p88 p88 = this.Y;
        p88.getClass();
        p88.c(this);
    }

    public final void d(r88 r88) {
        ArrayList arrayList = this.o;
        arrayList.remove(r88);
        if (arrayList.isEmpty()) {
            r88[] r88Arr = this.a;
            int i = 0;
            for (r88 p : r88Arr) {
                i += p.p().a;
            }
            toe[] toeArr = new toe[i];
            int i2 = 0;
            for (int i3 = 0; i3 < r88Arr.length; i3++) {
                voe p2 = r88Arr[i3].p();
                int i4 = p2.a;
                int i5 = 0;
                while (i5 < i4) {
                    toe a2 = p2.a(i5);
                    String str = a2.b;
                    StringBuilder sb = new StringBuilder(me4.e(12, str));
                    sb.append(i3);
                    sb.append(":");
                    sb.append(str);
                    toe toe = new toe(sb.toString(), a2.c);
                    this.X.put(toe, a2);
                    toeArr[i2] = toe;
                    i5++;
                    i2++;
                }
            }
            this.Z = new voe(toeArr);
            p88 p88 = this.Y;
            p88.getClass();
            p88.d(this);
        }
    }

    public final long f() {
        return this.x0.f();
    }

    public final void i() {
        for (r88 i : this.a) {
            i.i();
        }
    }

    public final long k(long j) {
        long k = this.w0[0].k(j);
        int i = 1;
        while (true) {
            r88[] r88Arr = this.w0;
            if (i >= r88Arr.length) {
                return k;
            }
            if (r88Arr[i].k(k) == k) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long o() {
        long j = -9223372036854775807L;
        for (r88 r88 : this.w0) {
            long o2 = r88.o();
            if (o2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    r88[] r88Arr = this.w0;
                    int length = r88Arr.length;
                    int i = 0;
                    while (i < length) {
                        r88 r882 = r88Arr[i];
                        if (r882 == r88) {
                            break;
                        } else if (r882.k(o2) == o2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = o2;
                } else if (o2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || r88.k(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final voe p() {
        voe voe = this.Z;
        voe.getClass();
        return voe;
    }

    public final long r() {
        return this.x0.r();
    }

    public final void s(long j, boolean z) {
        for (r88 s : this.w0) {
            s.s(j, z);
        }
    }

    public final void u(long j) {
        this.x0.u(j);
    }
}
