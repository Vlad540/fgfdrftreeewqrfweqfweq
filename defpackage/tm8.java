package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: tm8  reason: default package */
public final class tm8 implements s88, q88 {
    public final HashMap X = new HashMap();
    public q88 Y;
    public woe Z;
    public final s88[] a;
    public final IdentityHashMap b;
    public final s59 c;
    public final ArrayList o = new ArrayList();
    public s88[] w0;
    public y83 x0;

    public tm8(s59 s59, long[] jArr, s88... s88Arr) {
        this.c = s59;
        this.a = s88Arr;
        s59.getClass();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        this.x0 = new y83(e8c, e8c);
        this.b = new IdentityHashMap();
        this.w0 = new s88[0];
        for (int i = 0; i < s88Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new dje(s88Arr[i], j);
            }
        }
    }

    public final boolean b() {
        return this.x0.b();
    }

    public final void c(s88 s88) {
        ArrayList arrayList = this.o;
        arrayList.remove(s88);
        if (arrayList.isEmpty()) {
            s88[] s88Arr = this.a;
            int i = 0;
            for (s88 p : s88Arr) {
                i += p.p().a;
            }
            uoe[] uoeArr = new uoe[i];
            int i2 = 0;
            for (int i3 = 0; i3 < s88Arr.length; i3++) {
                woe p2 = s88Arr[i3].p();
                int i4 = p2.a;
                int i5 = 0;
                while (i5 < i4) {
                    uoe a2 = p2.a(i5);
                    xu5[] xu5Arr = new xu5[a2.a];
                    for (int i6 = 0; i6 < a2.a; i6++) {
                        xu5 xu5 = a2.d[i6];
                        uu5 a3 = xu5.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = xu5.a;
                        if (str == null) {
                            str = BuildConfig.FLAVOR;
                        }
                        sb.append(str);
                        a3.a = sb.toString();
                        xu5Arr[i6] = a3.a();
                    }
                    uoe uoe = new uoe(i3 + ":" + a2.b, xu5Arr);
                    this.X.put(uoe, a2);
                    uoeArr[i2] = uoe;
                    i5++;
                    i2++;
                }
            }
            this.Z = new woe(uoeArr);
            q88 q88 = this.Y;
            q88.getClass();
            q88.c(this);
        }
    }

    public final long f() {
        return this.x0.f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g(defpackage.g55[] r23, boolean[] r24, defpackage.yjc[] r25, boolean[] r26, long r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r5 = 0
            r6 = r5
        L_0x000e:
            int r7 = r1.length
            java.util.IdentityHashMap r8 = r0.b
            if (r6 >= r7) goto L_0x004b
            r7 = r2[r6]
            if (r7 != 0) goto L_0x0019
            r9 = 0
            goto L_0x0020
        L_0x0019:
            java.lang.Object r7 = r8.get(r7)
            r9 = r7
            java.lang.Integer r9 = (java.lang.Integer) r9
        L_0x0020:
            r7 = -1
            if (r9 != 0) goto L_0x0025
            r8 = r7
            goto L_0x0029
        L_0x0025:
            int r8 = r9.intValue()
        L_0x0029:
            r3[r6] = r8
            r8 = r1[r6]
            if (r8 == 0) goto L_0x0046
            uoe r7 = r8.a()
            java.lang.String r7 = r7.b
            java.lang.String r8 = ":"
            int r8 = r7.indexOf(r8)
            java.lang.String r7 = r7.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            r4[r6] = r7
            goto L_0x0048
        L_0x0046:
            r4[r6] = r7
        L_0x0048:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x004b:
            r8.clear()
            int r6 = r1.length
            yjc[] r7 = new defpackage.yjc[r6]
            int r10 = r1.length
            yjc[] r10 = new defpackage.yjc[r10]
            int r11 = r1.length
            g55[] r15 = new defpackage.g55[r11]
            java.util.ArrayList r14 = new java.util.ArrayList
            s88[] r13 = r0.a
            int r11 = r13.length
            r14.<init>(r11)
            r18 = r27
            r12 = r5
        L_0x0062:
            int r11 = r13.length
            if (r12 >= r11) goto L_0x0106
            r11 = r5
        L_0x0066:
            int r5 = r1.length
            if (r11 >= r5) goto L_0x00a0
            r5 = r3[r11]
            if (r5 != r12) goto L_0x0070
            r5 = r2[r11]
            goto L_0x0071
        L_0x0070:
            r5 = 0
        L_0x0071:
            r10[r11] = r5
            r5 = r4[r11]
            if (r5 != r12) goto L_0x0096
            r5 = r1[r11]
            r5.getClass()
            uoe r9 = r5.a()
            r16 = r14
            java.util.HashMap r14 = r0.X
            java.lang.Object r9 = r14.get(r9)
            uoe r9 = (defpackage.uoe) r9
            r9.getClass()
            pm8 r14 = new pm8
            r14.<init>(r5, r9)
            r15[r11] = r14
            r5 = 0
            goto L_0x009b
        L_0x0096:
            r16 = r14
            r5 = 0
            r15[r11] = r5
        L_0x009b:
            int r11 = r11 + 1
            r14 = r16
            goto L_0x0066
        L_0x00a0:
            r16 = r14
            r5 = 0
            r11 = r13[r12]
            r9 = r12
            r12 = r15
            r20 = r13
            r13 = r24
            r5 = r16
            r14 = r10
            r21 = r15
            r15 = r26
            r16 = r18
            long r11 = r11.g(r12, r13, r14, r15, r16)
            if (r9 != 0) goto L_0x00bd
            r18 = r11
            goto L_0x00c1
        L_0x00bd:
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 != 0) goto L_0x00fe
        L_0x00c1:
            r11 = 0
            r12 = 0
        L_0x00c3:
            int r13 = r1.length
            if (r11 >= r13) goto L_0x00ed
            r13 = r4[r11]
            r14 = 1
            if (r13 != r9) goto L_0x00dd
            r12 = r10[r11]
            r12.getClass()
            r13 = r10[r11]
            r7[r11] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r8.put(r12, r13)
            r12 = r14
            goto L_0x00ea
        L_0x00dd:
            r13 = r3[r11]
            if (r13 != r9) goto L_0x00ea
            r13 = r10[r11]
            if (r13 != 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r14 = 0
        L_0x00e7:
            defpackage.oyb.k(r14)
        L_0x00ea:
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00ed:
            if (r12 == 0) goto L_0x00f4
            r11 = r20[r9]
            r5.add(r11)
        L_0x00f4:
            int r12 = r9 + 1
            r14 = r5
            r13 = r20
            r15 = r21
            r5 = 0
            goto L_0x0062
        L_0x00fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Children enabled at different positions."
            r0.<init>(r1)
            throw r0
        L_0x0106:
            r1 = r5
            r5 = r14
            java.lang.System.arraycopy(r7, r1, r2, r1, r6)
            s88[] r1 = new defpackage.s88[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            s88[] r1 = (defpackage.s88[]) r1
            r0.w0 = r1
            be8 r1 = new be8
            r2 = 9
            r1.<init>(r2)
            java.util.AbstractList r1 = defpackage.jjd.S(r1, r5)
            s59 r2 = r0.c
            r2.getClass()
            y83 r2 = new y83
            r2.<init>(r5, r1)
            r0.x0 = r2
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm8.g(g55[], boolean[], yjc[], boolean[], long):long");
    }

    public final long h(long j, xtc xtc) {
        s88[] s88Arr = this.w0;
        return (s88Arr.length > 0 ? s88Arr[0] : this.a[0]).h(j, xtc);
    }

    public final void i() {
        for (s88 i : this.a) {
            i.i();
        }
    }

    public final void j(kyc kyc) {
        s88 s88 = (s88) kyc;
        q88 q88 = this.Y;
        q88.getClass();
        q88.j(this);
    }

    public final long k(long j) {
        long k = this.w0[0].k(j);
        int i = 1;
        while (true) {
            s88[] s88Arr = this.w0;
            if (i >= s88Arr.length) {
                return k;
            }
            if (s88Arr[i].k(k) == k) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final void l(q88 q88, long j) {
        this.Y = q88;
        ArrayList arrayList = this.o;
        s88[] s88Arr = this.a;
        Collections.addAll(arrayList, s88Arr);
        for (s88 l : s88Arr) {
            l.l(this, j);
        }
    }

    public final boolean m(qj7 qj7) {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.x0.m(qj7);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s88) arrayList.get(i)).m(qj7);
        }
        return false;
    }

    public final long o() {
        long j = -9223372036854775807L;
        for (s88 s88 : this.w0) {
            long o2 = s88.o();
            if (o2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    s88[] s88Arr = this.w0;
                    int length = s88Arr.length;
                    int i = 0;
                    while (i < length) {
                        s88 s882 = s88Arr[i];
                        if (s882 == s88) {
                            break;
                        } else if (s882.k(o2) == o2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = o2;
                } else if (o2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || s88.k(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final woe p() {
        woe woe = this.Z;
        woe.getClass();
        return woe;
    }

    public final long r() {
        return this.x0.r();
    }

    public final void s(long j, boolean z) {
        for (s88 s : this.w0) {
            s.s(j, z);
        }
    }

    public final void u(long j) {
        this.x0.u(j);
    }
}
