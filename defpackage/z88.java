package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z88  reason: default package */
public final class z88 {
    public final qje a = new qje();
    public final tje b = new tje();
    public final g44 c;
    public final zd6 d;
    public final r34 e;
    public long f;
    public int g;
    public boolean h;
    public u88 i;
    public u88 j;
    public u88 k;
    public int l;
    public Object m;
    public long n;
    public List o = new ArrayList();

    public z88(g44 g44, h8e h8e, r34 r34) {
        this.c = g44;
        this.d = h8e;
        this.e = r34;
    }

    public static se8 m(vje vje, Object obj, long j2, long j3, tje tje, qje qje) {
        vje vje2 = vje;
        long j4 = j2;
        tje tje2 = tje;
        Object obj2 = obj;
        qje qje2 = qje;
        vje.h(obj2, qje2);
        vje.o(qje2.c, tje2);
        int b2 = vje.b(obj);
        Object obj3 = obj2;
        while (true) {
            int i2 = qje2.g.b;
            if (i2 == 0) {
                break;
            }
            if ((i2 == 1 && qje2.h(0)) || !qje2.i(qje2.g.e)) {
                break;
            }
            long j5 = 0;
            if (qje2.c(0) != -1) {
                break;
            }
            if (qje2.d != 0) {
                int i3 = i2 - (qje2.h(i2 + -1) ? 2 : 1);
                for (int i4 = 0; i4 <= i3; i4++) {
                    j5 += qje2.g.a(i4).h;
                }
                if (qje2.d > j5) {
                    break;
                }
            }
            if (b2 > tje2.o) {
                break;
            }
            vje.g(b2, qje2, true);
            obj3 = qje2.b;
            obj3.getClass();
            b2++;
        }
        vje.h(obj3, qje2);
        int c2 = qje2.c(j4);
        if (c2 == -1) {
            return new se8(obj3, j3, qje2.b(j4));
        }
        long j6 = j3;
        return new se8(obj3, c2, qje2.f(c2), j3, -1);
    }

    public final u88 a() {
        u88 u88 = this.i;
        if (u88 == null) {
            return null;
        }
        if (u88 == this.j) {
            this.j = u88.l;
        }
        u88.g();
        int i2 = this.l - 1;
        this.l = i2;
        if (i2 == 0) {
            this.k = null;
            u88 u882 = this.i;
            this.m = u882.b;
            this.n = u882.f.a.d;
        }
        this.i = this.i.l;
        k();
        return this.i;
    }

    public final void b() {
        if (this.l != 0) {
            u88 u88 = this.i;
            oyb.l(u88);
            this.m = u88.b;
            this.n = u88.f.a.d;
            while (u88 != null) {
                u88.g();
                u88 = u88.l;
            }
            this.i = null;
            this.k = null;
            this.j = null;
            this.l = 0;
            k();
        }
    }

    public final x88 c(vje vje, u88 u88, long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long o2;
        vje vje2 = vje;
        u88 u882 = u88;
        x88 x88 = u882.f;
        int d2 = vje.d(vje2.b(x88.a.a), this.a, this.b, this.g, this.h);
        if (d2 == -1) {
            return null;
        }
        qje qje = this.a;
        boolean z = true;
        int i2 = vje2.g(d2, qje, true).c;
        Object obj = qje.b;
        obj.getClass();
        se8 se8 = x88.a;
        long j7 = se8.d;
        if (vje2.n(i2, this.b, 0).n == d2) {
            Pair k2 = vje.k(this.b, this.a, i2, -9223372036854775807L, Math.max(0, j2));
            if (k2 == null) {
                return null;
            }
            obj = k2.first;
            long longValue = ((Long) k2.second).longValue();
            u88 u883 = u882.l;
            if (u883 == null || !u883.b.equals(obj)) {
                o2 = o(obj);
                if (o2 == -1) {
                    o2 = this.f;
                    this.f = 1 + o2;
                }
            } else {
                o2 = u883.f.a.d;
            }
            j7 = o2;
            j4 = longValue;
            j3 = -9223372036854775807L;
        } else {
            j4 = 0;
            j3 = 0;
        }
        se8 m2 = m(vje, obj, j4, j7, this.b, this.a);
        if (j3 != -9223372036854775807L) {
            j6 = x88.c;
            if (j6 != -9223372036854775807L) {
                int i3 = vje2.h(se8.a, qje).g.b;
                int i4 = qje.g.e;
                if (i3 <= 0 || !qje.i(i4) || (i3 <= 1 && qje.d(i4) == Long.MIN_VALUE)) {
                    z = false;
                }
                if (m2.b() && z) {
                    j5 = j4;
                    return e(vje, m2, j6, j5);
                } else if (z) {
                    j5 = j6;
                    j6 = j3;
                    return e(vje, m2, j6, j5);
                }
            }
        }
        j5 = j4;
        j6 = j3;
        return e(vje, m2, j6, j5);
    }

    public final x88 d(vje vje, u88 u88, long j2) {
        vje vje2 = vje;
        u88 u882 = u88;
        x88 x88 = u882.f;
        long j3 = (u882.o + x88.e) - j2;
        if (x88.g) {
            return c(vje2, u882, j3);
        }
        se8 se8 = x88.a;
        Object obj = se8.a;
        qje qje = this.a;
        vje2.h(obj, qje);
        boolean b2 = se8.b();
        Object obj2 = se8.a;
        if (b2) {
            w8 w8Var = qje.g;
            int i2 = se8.b;
            int i3 = w8Var.a(i2).b;
            if (i3 != -1) {
                int a2 = qje.g.a(i2).a(se8.c);
                if (a2 < i3) {
                    return f(vje, se8.a, i2, a2, x88.c, se8.d);
                }
                long j4 = x88.c;
                if (j4 == -9223372036854775807L) {
                    Pair k2 = vje.k(this.b, qje, qje.c, -9223372036854775807L, Math.max(0, j3));
                    if (k2 != null) {
                        j4 = ((Long) k2.second).longValue();
                    }
                }
                vje2.h(obj2, qje);
                int i4 = se8.b;
                long d2 = qje.d(i4);
                return g(vje, se8.a, Math.max(d2 == Long.MIN_VALUE ? qje.d : qje.g.a(i4).h + d2, j4), x88.c, se8.d);
            }
            return null;
        }
        int i5 = se8.e;
        if (i5 != -1 && qje.h(i5)) {
            return c(vje2, u882, j3);
        }
        int f2 = qje.f(i5);
        boolean z = qje.i(i5) && qje.e(i5, f2) == 3;
        if (f2 == qje.g.a(i5).b || z) {
            vje2.h(obj2, qje);
            long d3 = qje.d(i5);
            return g(vje, se8.a, d3 == Long.MIN_VALUE ? qje.d : qje.g.a(i5).h + d3, x88.e, se8.d);
        }
        return f(vje, se8.a, se8.e, f2, x88.e, se8.d);
    }

    public final x88 e(vje vje, se8 se8, long j2, long j3) {
        se8 se82 = se8;
        vje vje2 = vje;
        vje.h(se82.a, this.a);
        if (se8.b()) {
            int i2 = se82.c;
            long j4 = se82.d;
            return f(vje, se82.a, se82.b, i2, j2, j4);
        }
        return g(vje, se82.a, j3, j2, se82.d);
    }

    public final x88 f(vje vje, Object obj, int i2, int i3, long j2, long j3) {
        int i4 = i2;
        int i5 = i3;
        se8 se8 = new se8(obj, i2, i3, j3, -1);
        qje qje = this.a;
        long a2 = vje.h(obj, qje).a(i4, i5);
        long j4 = i5 == qje.f(i4) ? qje.g.c : 0;
        return new x88(se8, (a2 == -9223372036854775807L || j4 < a2) ? j4 : Math.max(0, a2 - 1), j2, -9223372036854775807L, a2, qje.i(i4), false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00be A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.x88 g(defpackage.vje r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            qje r5 = r0.a
            r1.h(r2, r5)
            int r6 = r5.b(r3)
            r7 = 0
            r8 = 1
            r9 = -1
            if (r6 == r9) goto L_0x001e
            boolean r10 = r5.h(r6)
            if (r10 == 0) goto L_0x001e
            r10 = r8
            goto L_0x001f
        L_0x001e:
            r10 = r7
        L_0x001f:
            if (r6 != r9) goto L_0x0031
            w8 r11 = r5.g
            int r12 = r11.b
            if (r12 <= 0) goto L_0x0063
            int r11 = r11.e
            boolean r11 = r5.i(r11)
            if (r11 == 0) goto L_0x0063
            r11 = r8
            goto L_0x0064
        L_0x0031:
            boolean r11 = r5.i(r6)
            if (r11 == 0) goto L_0x0063
            long r11 = r5.d(r6)
            long r13 = r5.d
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            w8 r11 = r5.g
            u8 r11 = r11.a(r6)
            int r12 = r11.b
            if (r12 != r9) goto L_0x004d
        L_0x004b:
            r11 = r8
            goto L_0x005d
        L_0x004d:
            r13 = r7
        L_0x004e:
            if (r13 >= r12) goto L_0x005c
            int[] r14 = r11.f
            r14 = r14[r13]
            if (r14 == 0) goto L_0x004b
            if (r14 != r8) goto L_0x0059
            goto L_0x004b
        L_0x0059:
            int r13 = r13 + 1
            goto L_0x004e
        L_0x005c:
            r11 = r7
        L_0x005d:
            r11 = r11 ^ r8
            if (r11 == 0) goto L_0x0063
            r11 = r8
            r6 = r9
            goto L_0x0064
        L_0x0063:
            r11 = r7
        L_0x0064:
            se8 r13 = new se8
            r14 = r33
            r13.<init>(r2, r14, r6)
            boolean r2 = r13.b()
            if (r2 != 0) goto L_0x0075
            if (r6 != r9) goto L_0x0075
            r2 = r8
            goto L_0x0076
        L_0x0075:
            r2 = r7
        L_0x0076:
            boolean r24 = r0.j(r1, r13)
            boolean r25 = r0.i(r1, r13, r2)
            if (r6 == r9) goto L_0x008b
            boolean r0 = r5.i(r6)
            if (r0 == 0) goto L_0x008b
            if (r10 != 0) goto L_0x008b
            r22 = r8
            goto L_0x008d
        L_0x008b:
            r22 = r7
        L_0x008d:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == r9) goto L_0x009d
            if (r10 != 0) goto L_0x009d
            long r9 = r5.d(r6)
        L_0x009a:
            r18 = r9
            goto L_0x00a4
        L_0x009d:
            if (r11 == 0) goto L_0x00a2
            long r9 = r5.d
            goto L_0x009a
        L_0x00a2:
            r18 = r0
        L_0x00a4:
            int r6 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x00b2
            r9 = -9223372036854775808
            int r6 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x00af
            goto L_0x00b2
        L_0x00af:
            r20 = r18
            goto L_0x00b6
        L_0x00b2:
            long r5 = r5.d
            r20 = r5
        L_0x00b6:
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00ce
            int r0 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x00ce
            if (r25 != 0) goto L_0x00c2
            if (r11 != 0) goto L_0x00c3
        L_0x00c2:
            r7 = r8
        L_0x00c3:
            long r0 = (long) r7
            long r0 = r20 - r0
            r3 = 0
            long r0 = java.lang.Math.max(r3, r0)
            r14 = r0
            goto L_0x00cf
        L_0x00ce:
            r14 = r3
        L_0x00cf:
            x88 r0 = new x88
            r12 = r0
            r16 = r31
            r23 = r2
            r12.<init>(r13, r14, r16, r18, r20, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z88.g(vje, java.lang.Object, long, long, long):x88");
    }

    public final x88 h(vje vje, x88 x88) {
        vje vje2 = vje;
        x88 x882 = x88;
        se8 se8 = x882.a;
        boolean b2 = se8.b();
        int i2 = se8.e;
        boolean z = !b2 && i2 == -1;
        boolean j2 = j(vje2, se8);
        boolean i3 = i(vje2, se8, z);
        Object obj = x882.a.a;
        qje qje = this.a;
        vje2.h(obj, qje);
        long d2 = (se8.b() || i2 == -1) ? -9223372036854775807L : qje.d(i2);
        boolean b3 = se8.b();
        int i4 = se8.b;
        return new x88(se8, x882.b, x882.c, d2, b3 ? qje.a(i4, se8.c) : (d2 == -9223372036854775807L || d2 == Long.MIN_VALUE) ? qje.d : d2, se8.b() ? qje.i(i4) : i2 != -1 && qje.i(i2), z, j2, i3);
    }

    public final boolean i(vje vje, se8 se8, boolean z) {
        int b2 = vje.b(se8.a);
        if (vje.n(vje.g(b2, this.a, false).c, this.b, 0).i) {
            return false;
        }
        return vje.d(b2, this.a, this.b, this.g, this.h) == -1 && z;
    }

    public final boolean j(vje vje, se8 se8) {
        if (!(!se8.b() && se8.e == -1)) {
            return false;
        }
        Object obj = se8.a;
        return vje.n(vje.h(obj, this.a).c, this.b, 0).o == vje.b(obj);
    }

    public final void k() {
        ts6 i2 = ws6.i();
        for (u88 u88 = this.i; u88 != null; u88 = u88.l) {
            i2.a(u88.f.a);
        }
        u88 u882 = this.j;
        ((h8e) this.d).d(new px4((Object) this, (Object) i2, (Object) u882 == null ? null : u882.f.a, 12));
    }

    public final boolean l(u88 u88) {
        oyb.l(u88);
        boolean z = false;
        if (u88.equals(this.k)) {
            return false;
        }
        this.k = u88;
        while (true) {
            u88 = u88.l;
            if (u88 == null) {
                break;
            }
            if (u88 == this.j) {
                this.j = this.i;
                z = true;
            }
            u88.g();
            this.l--;
        }
        u88 u882 = this.k;
        u882.getClass();
        if (u882.l != null) {
            u882.b();
            u882.l = null;
            u882.c();
        }
        k();
        return z;
    }

    public final se8 n(vje vje, Object obj, long j2) {
        long j3;
        int b2;
        vje vje2 = vje;
        Object obj2 = obj;
        qje qje = this.a;
        int i2 = vje2.h(obj2, qje).c;
        Object obj3 = this.m;
        if (obj3 == null || (b2 = vje2.b(obj3)) == -1 || vje2.g(b2, qje, false).c != i2) {
            u88 u88 = this.i;
            while (true) {
                if (u88 == null) {
                    u88 u882 = this.i;
                    while (true) {
                        if (u882 != null) {
                            int b3 = vje2.b(u882.b);
                            if (b3 != -1 && vje2.g(b3, qje, false).c == i2) {
                                j3 = u882.f.a.d;
                                break;
                            }
                            u882 = u882.l;
                        } else {
                            j3 = o(obj2);
                            if (j3 == -1) {
                                j3 = this.f;
                                this.f = 1 + j3;
                                if (this.i == null) {
                                    this.m = obj2;
                                    this.n = j3;
                                }
                            }
                        }
                    }
                } else if (u88.b.equals(obj2)) {
                    j3 = u88.f.a.d;
                    break;
                } else {
                    u88 = u88.l;
                }
            }
        } else {
            j3 = this.n;
        }
        vje2.h(obj2, qje);
        int i3 = qje.c;
        tje tje = this.b;
        vje2.o(i3, tje);
        boolean z = false;
        for (int b4 = vje.b(obj); b4 >= tje.n; b4--) {
            boolean z2 = true;
            vje2.g(b4, qje, true);
            if (qje.g.b <= 0) {
                z2 = false;
            }
            z |= z2;
            if (qje.c(qje.d) != -1) {
                obj2 = qje.b;
                obj2.getClass();
            }
            if (z && (!z2 || qje.d != 0)) {
                break;
            }
        }
        return m(vje, obj2, j2, j3, this.b, this.a);
    }

    public final long o(Object obj) {
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            u88 u88 = (u88) this.o.get(i2);
            if (u88.b.equals(obj)) {
                return u88.f.a.d;
            }
        }
        return -1;
    }

    public final boolean p(vje vje) {
        u88 u88;
        u88 u882 = this.i;
        if (u882 == null) {
            return true;
        }
        int b2 = vje.b(u882.b);
        while (true) {
            vje vje2 = vje;
            b2 = vje2.d(b2, this.a, this.b, this.g, this.h);
            while (true) {
                u882.getClass();
                u88 = u882.l;
                if (u88 != null && !u882.f.g) {
                    u882 = u88;
                }
            }
            if (b2 == -1 || u88 == null || vje.b(u88.b) != b2) {
                boolean l2 = l(u882);
                u882.f = h(vje, u882.f);
            } else {
                u882 = u88;
            }
        }
        boolean l22 = l(u882);
        u882.f = h(vje, u882.f);
        return !l22;
    }

    public final boolean q(vje vje, long j2, long j3) {
        x88 x88;
        u88 u88 = this.i;
        u88 u882 = null;
        while (u88 != null) {
            x88 x882 = u88.f;
            if (u882 == null) {
                x88 = h(vje, x882);
            } else {
                x88 d2 = d(vje, u882, j2);
                if (d2 == null) {
                    return !l(u882);
                }
                if (x882.b != d2.b || !x882.a.equals(d2.a)) {
                    return !l(u882);
                }
                x88 = d2;
            }
            u88.f = x88.a(x882.c);
            long j4 = x882.e;
            if (j4 != -9223372036854775807L) {
                long j5 = x88.e;
                if (j4 != j5) {
                    u88.i();
                    return !l(u88) && !(u88 == this.j && !u88.f.f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : u88.o + j5) ? 1 : (j3 == ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : u88.o + j5) ? 0 : -1)) >= 0));
                }
            }
            u882 = u88;
            u88 = u88.l;
        }
        return true;
    }
}
