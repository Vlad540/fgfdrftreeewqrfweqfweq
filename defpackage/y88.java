package defpackage;

import android.os.Handler;
import android.util.Pair;

/* renamed from: y88  reason: default package */
public final class y88 {
    public final pje a = new pje();
    public final sje b = new sje();
    public final f44 c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public t88 h;
    public t88 i;
    public t88 j;
    public int k;
    public Object l;
    public long m;

    public y88(f44 f44, Handler handler) {
        this.c = f44;
        this.d = handler;
    }

    public static re8 l(uje uje, Object obj, long j2, long j3, sje sje, pje pje) {
        uje.h(obj, pje);
        uje.o(pje.c, sje);
        int b2 = uje.b(obj);
        Object obj2 = obj;
        while (pje.o == 0) {
            v8 v8Var = pje.Z;
            if (v8Var.a <= 0 || !pje.g(v8Var.o) || pje.c(0) != -1) {
                break;
            }
            int i2 = b2 + 1;
            if (b2 >= sje.E0) {
                break;
            }
            uje.g(i2, pje, true);
            obj2 = pje.b;
            obj2.getClass();
            b2 = i2;
        }
        uje.h(obj2, pje);
        int c2 = pje.c(j2);
        return c2 == -1 ? new re8(obj2, j3, pje.b(j2)) : new v88(obj2, c2, pje.e(c2), j3, -1);
    }

    public final t88 a() {
        t88 t88 = this.h;
        if (t88 == null) {
            return null;
        }
        if (t88 == this.i) {
            this.i = t88.l;
        }
        t88.f();
        int i2 = this.k - 1;
        this.k = i2;
        if (i2 == 0) {
            this.j = null;
            t88 t882 = this.h;
            this.l = t882.b;
            this.m = t882.f.a.d;
        }
        this.h = this.h.l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.k != 0) {
            t88 t88 = this.h;
            swb.i(t88);
            this.l = t88.b;
            this.m = t88.f.a.d;
            while (t88 != null) {
                t88.f();
                t88 = t88.l;
            }
            this.h = null;
            this.j = null;
            this.i = null;
            this.k = 0;
            j();
        }
    }

    public final w88 c(uje uje, t88 t88, long j2) {
        long j3;
        long j4;
        long j5;
        re8 re8;
        long j6;
        long j7;
        long j8;
        long j9;
        uje uje2 = uje;
        t88 t882 = t88;
        w88 w88 = t882.f;
        long j10 = (t882.o + w88.e) - j2;
        pje pje = this.a;
        boolean z = w88.g;
        boolean z2 = true;
        long j11 = w88.c;
        re8 re82 = w88.a;
        if (z) {
            re8 re83 = re82;
            long j12 = j11;
            int d2 = uje.d(uje2.b(re82.a), this.a, this.b, this.f, this.g);
            if (d2 == -1) {
                return null;
            }
            int i2 = uje2.g(d2, pje, true).c;
            Object obj = pje.b;
            obj.getClass();
            if (uje2.n(i2, this.b, 0).D0 == d2) {
                Pair k2 = uje.k(this.b, this.a, i2, -9223372036854775807L, Math.max(0, j10));
                if (k2 == null) {
                    return null;
                }
                obj = k2.first;
                long longValue = ((Long) k2.second).longValue();
                t88 t883 = t882.l;
                if (t883 == null || !t883.b.equals(obj)) {
                    j9 = this.e;
                    this.e = 1 + j9;
                } else {
                    j9 = t883.f.a.d;
                }
                j5 = longValue;
                re8 = re83;
                j6 = j9;
                j4 = -9223372036854775807L;
            } else {
                re8 = re83;
                j5 = 0;
                j4 = 0;
                j6 = re8.d;
            }
            re8 l2 = l(uje, obj, j5, j6, this.b, this.a);
            if (!(j4 == -9223372036854775807L || j12 == -9223372036854775807L)) {
                if (uje2.h(re8.a, pje).Z.a <= 0 || !pje.g(pje.Z.o)) {
                    z2 = false;
                }
                if (l2.a() && z2) {
                    j7 = j5;
                    j8 = j12;
                    return d(uje, l2, j8, j7);
                } else if (z2) {
                    j8 = j4;
                    j7 = j12;
                    return d(uje, l2, j8, j7);
                }
            }
            j7 = j5;
            j8 = j4;
            return d(uje, l2, j8, j7);
        }
        re8 re84 = re82;
        long j13 = j11;
        uje2.h(re84.a, pje);
        boolean a2 = re84.a();
        Object obj2 = re84.a;
        if (a2) {
            v8 v8Var = pje.Z;
            int i3 = re84.b;
            int i4 = v8Var.a(i3).b;
            if (i4 == -1) {
                return null;
            }
            int a3 = pje.Z.a(i3).a(re84.c);
            if (a3 < i4) {
                return e(uje, re84.a, i3, a3, w88.c, re84.d);
            }
            if (j13 == -9223372036854775807L) {
                Pair k3 = uje.k(this.b, pje, pje.c, -9223372036854775807L, Math.max(0, j10));
                if (k3 == null) {
                    return null;
                }
                j3 = ((Long) k3.second).longValue();
            } else {
                j3 = j13;
            }
            uje2.h(obj2, pje);
            v8 v8Var2 = pje.Z;
            int i5 = re84.b;
            long j14 = v8Var2.a(i5).a;
            return f(uje, re84.a, Math.max(j14 == Long.MIN_VALUE ? pje.o : pje.Z.a(i5).Y + j14, j3), w88.c, re84.d);
        }
        int i6 = re84.e;
        int e2 = pje.e(i6);
        if (!pje.g(i6) || pje.d(i6, e2) != 3) {
            z2 = false;
        }
        if (e2 == pje.Z.a(i6).b || z2) {
            uje2.h(obj2, pje);
            long j15 = pje.Z.a(i6).a;
            return f(uje, re84.a, j15 == Long.MIN_VALUE ? pje.o : j15 + pje.Z.a(i6).Y, w88.e, re84.d);
        }
        return e(uje, re84.a, re84.e, e2, w88.e, re84.d);
    }

    public final w88 d(uje uje, re8 re8, long j2, long j3) {
        re8 re82 = re8;
        uje uje2 = uje;
        uje.h(re82.a, this.a);
        if (re8.a()) {
            int i2 = re82.c;
            long j4 = re82.d;
            return e(uje, re82.a, re82.b, i2, j2, j4);
        }
        return f(uje, re82.a, j3, j2, re82.d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: v88} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: re8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.w88 e(defpackage.uje r18, java.lang.Object r19, int r20, int r21, long r22, long r24) {
        /*
            r17 = this;
            r7 = r20
            r8 = r21
            re8 r9 = new re8
            r6 = -1
            r0 = r9
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r24
            r0.<init>(r1, r2, r3, r4, r6)
            r0 = r17
            pje r0 = r0.a
            r1 = r18
            r2 = r19
            pje r1 = r1.h(r2, r0)
            long r10 = r1.a(r7, r8)
            int r1 = r0.e(r7)
            r2 = 0
            if (r8 != r1) goto L_0x0030
            v8 r1 = r0.Z
            long r4 = r1.b
            goto L_0x0031
        L_0x0030:
            r4 = r2
        L_0x0031:
            boolean r12 = r0.g(r7)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x004c
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x004c
            r0 = 1
            long r0 = r10 - r0
            long r0 = java.lang.Math.max(r2, r0)
            r2 = r0
            goto L_0x004d
        L_0x004c:
            r2 = r4
        L_0x004d:
            w88 r14 = new w88
            r13 = 0
            r15 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = 0
            r0 = r14
            r1 = r9
            r4 = r22
            r8 = r10
            r10 = r12
            r11 = r16
            r12 = r13
            r13 = r15
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y88.e(uje, java.lang.Object, int, int, long, long):w88");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.w88 f(defpackage.uje r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            pje r5 = r0.a
            r1.h(r2, r5)
            int r6 = r5.b(r3)
            r7 = 1
            r8 = 0
            r9 = -1
            if (r6 != r9) goto L_0x0026
            v8 r10 = r5.Z
            int r11 = r10.a
            if (r11 <= 0) goto L_0x005c
            int r10 = r10.o
            boolean r10 = r5.g(r10)
            if (r10 == 0) goto L_0x005c
            r10 = r7
            goto L_0x005d
        L_0x0026:
            boolean r10 = r5.g(r6)
            if (r10 == 0) goto L_0x005c
            v8 r10 = r5.Z
            t8 r10 = r10.a(r6)
            long r10 = r10.a
            long r12 = r5.o
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x005c
            v8 r10 = r5.Z
            t8 r10 = r10.a(r6)
            int r11 = r10.b
            if (r11 != r9) goto L_0x0046
        L_0x0044:
            r10 = r7
            goto L_0x0056
        L_0x0046:
            r12 = r8
        L_0x0047:
            if (r12 >= r11) goto L_0x0055
            int[] r13 = r10.o
            r13 = r13[r12]
            if (r13 == 0) goto L_0x0044
            if (r13 != r7) goto L_0x0052
            goto L_0x0044
        L_0x0052:
            int r12 = r12 + 1
            goto L_0x0047
        L_0x0055:
            r10 = r8
        L_0x0056:
            r10 = r10 ^ r7
            if (r10 == 0) goto L_0x005c
            r10 = r7
            r6 = r9
            goto L_0x005d
        L_0x005c:
            r10 = r8
        L_0x005d:
            re8 r12 = new re8
            r13 = r32
            r12.<init>(r2, r13, r6)
            boolean r2 = r12.a()
            if (r2 != 0) goto L_0x006e
            if (r6 != r9) goto L_0x006e
            r2 = r7
            goto L_0x006f
        L_0x006e:
            r2 = r8
        L_0x006f:
            boolean r23 = r0.i(r1, r12)
            boolean r24 = r0.h(r1, r12, r2)
            if (r6 == r9) goto L_0x0082
            boolean r0 = r5.g(r6)
            if (r0 == 0) goto L_0x0082
            r21 = r7
            goto L_0x0084
        L_0x0082:
            r21 = r8
        L_0x0084:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == r9) goto L_0x0096
            v8 r7 = r5.Z
            t8 r6 = r7.a(r6)
            long r6 = r6.a
        L_0x0093:
            r17 = r6
            goto L_0x009d
        L_0x0096:
            if (r10 == 0) goto L_0x009b
            long r6 = r5.o
            goto L_0x0093
        L_0x009b:
            r17 = r0
        L_0x009d:
            int r6 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x00ab
            r6 = -9223372036854775808
            int r6 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            r19 = r17
            goto L_0x00af
        L_0x00ab:
            long r5 = r5.o
            r19 = r5
        L_0x00af:
            int r0 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x00c3
            r0 = 1
            long r0 = r19 - r0
            r3 = 0
            long r0 = java.lang.Math.max(r3, r0)
            r13 = r0
            goto L_0x00c4
        L_0x00c3:
            r13 = r3
        L_0x00c4:
            w88 r0 = new w88
            r11 = r0
            r15 = r30
            r22 = r2
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y88.f(uje, java.lang.Object, long, long, long):w88");
    }

    public final w88 g(uje uje, w88 w88) {
        uje uje2 = uje;
        w88 w882 = w88;
        re8 re8 = w882.a;
        boolean a2 = re8.a();
        int i2 = re8.e;
        boolean z = !a2 && i2 == -1;
        boolean i3 = i(uje2, re8);
        boolean h2 = h(uje2, re8, z);
        Object obj = w882.a.a;
        pje pje = this.a;
        uje2.h(obj, pje);
        long j2 = (re8.a() || i2 == -1) ? -9223372036854775807L : pje.Z.a(i2).a;
        boolean a3 = re8.a();
        int i4 = re8.b;
        return new w88(re8, w882.b, w882.c, j2, a3 ? pje.a(i4, re8.c) : (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? pje.o : j2, re8.a() ? pje.g(i4) : i2 != -1 && pje.g(i2), z, i3, h2);
    }

    public final boolean h(uje uje, re8 re8, boolean z) {
        int b2 = uje.b(re8.a);
        if (uje.n(uje.g(b2, this.a, false).c, this.b, 0).x0) {
            return false;
        }
        return uje.d(b2, this.a, this.b, this.f, this.g) == -1 && z;
    }

    public final boolean i(uje uje, re8 re8) {
        if (!(!re8.a() && re8.e == -1)) {
            return false;
        }
        Object obj = re8.a;
        return uje.n(uje.h(obj, this.a).c, this.b, 0).E0 == uje.b(obj);
    }

    public final void j() {
        ts6 i2 = ws6.i();
        for (t88 t88 = this.h; t88 != null; t88 = t88.l) {
            i2.a(t88.f.a);
        }
        t88 t882 = this.i;
        this.d.post(new px4((Object) this, (Object) i2, (Object) t882 == null ? null : t882.f.a, 11));
    }

    public final boolean k(t88 t88) {
        boolean z = false;
        swb.h(t88 != null);
        if (t88.equals(this.j)) {
            return false;
        }
        this.j = t88;
        while (true) {
            t88 = t88.l;
            if (t88 == null) {
                break;
            }
            if (t88 == this.i) {
                this.i = this.h;
                z = true;
            }
            t88.f();
            this.k--;
        }
        t88 t882 = this.j;
        if (t882.l != null) {
            t882.b();
            t882.l = null;
            t882.c();
        }
        j();
        return z;
    }

    public final re8 m(uje uje, Object obj, long j2) {
        long j3;
        int b2;
        uje uje2 = uje;
        Object obj2 = obj;
        pje pje = this.a;
        int i2 = uje2.h(obj2, pje).c;
        Object obj3 = this.l;
        if (obj3 == null || (b2 = uje2.b(obj3)) == -1 || uje2.g(b2, pje, false).c != i2) {
            t88 t88 = this.h;
            while (true) {
                if (t88 == null) {
                    t88 t882 = this.h;
                    while (true) {
                        if (t882 != null) {
                            int b3 = uje2.b(t882.b);
                            if (b3 != -1 && uje2.g(b3, pje, false).c == i2) {
                                j3 = t882.f.a.d;
                                break;
                            }
                            t882 = t882.l;
                        } else {
                            j3 = this.e;
                            this.e = 1 + j3;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j3;
                            }
                        }
                    }
                } else if (t88.b.equals(obj2)) {
                    j3 = t88.f.a.d;
                    break;
                } else {
                    t88 = t88.l;
                }
            }
        } else {
            j3 = this.m;
        }
        uje2.h(obj2, pje);
        int i3 = pje.c;
        sje sje = this.b;
        uje2.o(i3, sje);
        boolean z = false;
        for (int b4 = uje.b(obj); b4 >= sje.D0; b4--) {
            boolean z2 = true;
            uje2.g(b4, pje, true);
            if (pje.Z.a <= 0) {
                z2 = false;
            }
            z |= z2;
            if (pje.c(pje.o) != -1) {
                obj2 = pje.b;
                obj2.getClass();
            }
            if (z && (!z2 || pje.o != 0)) {
                break;
            }
        }
        return l(uje, obj2, j2, j3, this.b, this.a);
    }

    public final boolean n(uje uje) {
        t88 t88;
        t88 t882 = this.h;
        if (t882 == null) {
            return true;
        }
        int b2 = uje.b(t882.b);
        while (true) {
            uje uje2 = uje;
            b2 = uje2.d(b2, this.a, this.b, this.f, this.g);
            while (true) {
                t88 = t882.l;
                if (t88 != null && !t882.f.g) {
                    t882 = t88;
                }
            }
            if (b2 == -1 || t88 == null || uje.b(t88.b) != b2) {
                boolean k2 = k(t882);
                t882.f = g(uje, t882.f);
            } else {
                t882 = t88;
            }
        }
        boolean k22 = k(t882);
        t882.f = g(uje, t882.f);
        return !k22;
    }

    public final boolean o(uje uje, long j2, long j3) {
        w88 w88;
        t88 t88 = this.h;
        t88 t882 = null;
        while (t88 != null) {
            w88 w882 = t88.f;
            if (t882 == null) {
                w88 = g(uje, w882);
            } else {
                w88 c2 = c(uje, t882, j2);
                if (c2 == null) {
                    return !k(t882);
                }
                if (w882.b != c2.b || !w882.a.equals(c2.a)) {
                    return !k(t882);
                }
                w88 = c2;
            }
            t88.f = w88.a(w882.c);
            long j4 = w882.e;
            if (j4 != -9223372036854775807L) {
                long j5 = w88.e;
                if (j4 != j5) {
                    t88.h();
                    return !k(t88) && !(t88 == this.i && !t88.f.f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : t88.o + j5) ? 1 : (j3 == ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : t88.o + j5) ? 0 : -1)) >= 0));
                }
            }
            t882 = t88;
            t88 = t88.l;
        }
        return true;
    }
}
