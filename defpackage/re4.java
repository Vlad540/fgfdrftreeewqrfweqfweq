package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: re4  reason: default package */
public final class re4 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    /* JADX WARNING: type inference failed for: r10v2, types: [hic, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.se4 r7, int r8, java.util.ArrayList r9, defpackage.hic r10) {
        /*
            r6 = this;
            lrf r7 = r7.d
            hic r0 = r7.c
            if (r0 != 0) goto L_0x00e1
            java.lang.Object r0 = r6.c
            gf3 r0 = (defpackage.gf3) r0
            ak6 r1 = r0.d
            if (r7 == r1) goto L_0x00e1
            l1f r0 = r0.e
            if (r7 != r0) goto L_0x0014
            goto L_0x00e1
        L_0x0014:
            if (r10 != 0) goto L_0x002a
            hic r10 = new hic
            r10.<init>()
            r0 = 0
            r10.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.b = r0
            r10.a = r7
            r9.add(r10)
        L_0x002a:
            r7.c = r10
            java.util.ArrayList r0 = r10.b
            r0.add(r7)
            se4 r0 = r7.h
            java.util.ArrayList r1 = r0.k
            java.util.Iterator r1 = r1.iterator()
        L_0x0039:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r1.next()
            pe4 r2 = (defpackage.pe4) r2
            boolean r3 = r2 instanceof defpackage.se4
            if (r3 == 0) goto L_0x0039
            se4 r2 = (defpackage.se4) r2
            r6.a(r2, r8, r9, r10)
            goto L_0x0039
        L_0x004f:
            se4 r1 = r7.i
            java.util.ArrayList r2 = r1.k
            java.util.Iterator r2 = r2.iterator()
        L_0x0057:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006d
            java.lang.Object r3 = r2.next()
            pe4 r3 = (defpackage.pe4) r3
            boolean r4 = r3 instanceof defpackage.se4
            if (r4 == 0) goto L_0x0057
            se4 r3 = (defpackage.se4) r3
            r6.a(r3, r8, r9, r10)
            goto L_0x0057
        L_0x006d:
            r2 = 1
            if (r8 != r2) goto L_0x0095
            boolean r3 = r7 instanceof defpackage.l1f
            if (r3 == 0) goto L_0x0095
            r3 = r7
            l1f r3 = (defpackage.l1f) r3
            se4 r3 = r3.k
            java.util.ArrayList r3 = r3.k
            java.util.Iterator r3 = r3.iterator()
        L_0x007f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0095
            java.lang.Object r4 = r3.next()
            pe4 r4 = (defpackage.pe4) r4
            boolean r5 = r4 instanceof defpackage.se4
            if (r5 == 0) goto L_0x007f
            se4 r4 = (defpackage.se4) r4
            r6.a(r4, r8, r9, r10)
            goto L_0x007f
        L_0x0095:
            java.util.ArrayList r0 = r0.l
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r0.next()
            se4 r3 = (defpackage.se4) r3
            r6.a(r3, r8, r9, r10)
            goto L_0x009b
        L_0x00ab:
            java.util.ArrayList r0 = r1.l
            java.util.Iterator r0 = r0.iterator()
        L_0x00b1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c1
            java.lang.Object r1 = r0.next()
            se4 r1 = (defpackage.se4) r1
            r6.a(r1, r8, r9, r10)
            goto L_0x00b1
        L_0x00c1:
            if (r8 != r2) goto L_0x00e1
            boolean r0 = r7 instanceof defpackage.l1f
            if (r0 == 0) goto L_0x00e1
            l1f r7 = (defpackage.l1f) r7
            se4 r7 = r7.k
            java.util.ArrayList r7 = r7.l
            java.util.Iterator r7 = r7.iterator()
        L_0x00d1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r7.next()
            se4 r0 = (defpackage.se4) r0
            r6.a(r0, r8, r9, r10)
            goto L_0x00d1
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re4.a(se4, int, java.util.ArrayList, hic):void");
    }

    public void b(gf3 gf3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        gf3 gf32 = gf3;
        Iterator it = gf32.q0.iterator();
        while (it.hasNext()) {
            ff3 ff3 = (ff3) it.next();
            int[] iArr = ff3.p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (ff3.g0 == 8) {
                ff3.a = true;
            } else {
                float f2 = ff3.w;
                if (f2 < 1.0f && i7 == 3) {
                    ff3.r = 2;
                }
                float f3 = ff3.z;
                if (f3 < 1.0f && i8 == 3) {
                    ff3.s = 2;
                }
                if (ff3.W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        ff3.r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        ff3.s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (ff3.r == 0) {
                            ff3.r = 3;
                        }
                        if (ff3.s == 0) {
                            ff3.s = 3;
                        }
                    }
                }
                me3 me3 = ff3.K;
                me3 me32 = ff3.I;
                if (i7 == 3 && ff3.r == 1 && (me32.f == null || me3.f == null)) {
                    i7 = 2;
                }
                me3 me33 = ff3.L;
                me3 me34 = ff3.J;
                int i9 = (i8 == 3 && ff3.s == 1 && (me34.f == null || me33.f == null)) ? 2 : i8;
                ak6 ak6 = ff3.d;
                ak6.d = i7;
                int i10 = ff3.r;
                ak6.a = i10;
                l1f l1f = ff3.e;
                l1f.d = i9;
                int i11 = ff3.s;
                l1f.a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q = ff3.q();
                    if (i7 == 4) {
                        i4 = (gf3.q() - me32.g) - me3.g;
                        i7 = 1;
                    } else {
                        i4 = q;
                    }
                    int k = ff3.k();
                    if (i9 == 4) {
                        i5 = (gf3.k() - me34.g) - me33.g;
                        i6 = 1;
                    } else {
                        i5 = k;
                        i6 = i9;
                    }
                    f(i7, i4, i6, i5, ff3);
                    ff3.d.e.d(ff3.q());
                    ff3.e.e.d(ff3.k());
                    ff3.a = true;
                } else {
                    int[] iArr2 = gf32.p0;
                    me3[] me3Arr = ff3.Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, ff3);
                        }
                        int k2 = ff3.k();
                        f(1, (int) ((((float) k2) * ff3.W) + 0.5f), 1, k2, ff3);
                        ff3.d.e.d(ff3.q());
                        ff3.e.e.d(ff3.k());
                        ff3.a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, ff3);
                        ff3.d.e.m = ff3.q();
                    } else {
                        if (i10 == 2) {
                            int i12 = iArr2[0];
                            if (i12 == 1 || i12 == 4) {
                                f(1, (int) ((f2 * ((float) gf3.q())) + 0.5f), i9, ff3.k(), ff3);
                                ff3.d.e.d(ff3.q());
                                ff3.e.e.d(ff3.k());
                                ff3.a = true;
                            }
                        } else if (me3Arr[0].f == null || me3Arr[1].f == null) {
                            f(2, 0, i9, 0, ff3);
                            ff3.d.e.d(ff3.q());
                            ff3.e.e.d(ff3.k());
                            ff3.a = true;
                        }
                        i = 3;
                    }
                    if (i9 == i) {
                        if (i7 != 2 && i7 != 1) {
                            i2 = i;
                            i3 = 1;
                            if (i7 == i2 && i9 == i2) {
                                if (i10 != i3 || i11 == i3) {
                                    f(2, 0, 2, 0, ff3);
                                    ff3.d.e.m = ff3.q();
                                    ff3.e.e.m = ff3.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i3] == 1) {
                                    f(1, (int) ((f2 * ((float) gf3.q())) + 0.5f), 1, (int) ((f3 * ((float) gf3.k())) + 0.5f), ff3);
                                    ff3.d.e.d(ff3.q());
                                    ff3.e.e.d(ff3.k());
                                    ff3.a = true;
                                }
                            }
                        } else if (i11 == i) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, ff3);
                            }
                            int q2 = ff3.q();
                            float f4 = ff3.W;
                            if (ff3.X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q2, 1, (int) ((((float) q2) * f4) + 0.5f), ff3);
                            ff3.d.e.d(ff3.q());
                            ff3.e.e.d(ff3.k());
                            ff3.a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, ff3);
                            ff3.e.e.m = ff3.k();
                        } else if (i11 == 2) {
                            int i13 = iArr2[1];
                            if (i13 == 1 || i13 == 4) {
                                f(i7, ff3.q(), 1, (int) ((f3 * ((float) gf3.k())) + 0.5f), ff3);
                                ff3.d.e.d(ff3.q());
                                ff3.e.e.d(ff3.k());
                                ff3.a = true;
                            }
                        } else if (me3Arr[2].f == null || me3Arr[3].f == null) {
                            f(2, 0, i9, 0, ff3);
                            ff3.d.e.d(ff3.q());
                            ff3.e.e.d(ff3.k());
                            ff3.a = true;
                        }
                    }
                    i3 = 1;
                    i2 = 3;
                    if (i10 != i3) {
                    }
                    f(2, 0, 2, 0, ff3);
                    ff3.d.e.m = ff3.q();
                    ff3.e.e.m = ff3.k();
                }
            }
        }
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.e;
        arrayList.clear();
        gf3 gf3 = (gf3) this.d;
        gf3.d.f();
        gf3.e.f();
        arrayList.add(gf3.d);
        arrayList.add(gf3.e);
        Iterator it = gf3.q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ff3 ff3 = (ff3) it.next();
            if (ff3 instanceof bd6) {
                lrf lrf = new lrf(ff3);
                ff3.d.f();
                ff3.e.f();
                lrf.f = ((bd6) ff3).u0;
                arrayList.add(lrf);
            } else {
                if (ff3.x()) {
                    if (ff3.b == null) {
                        ff3.b = new ky1(ff3, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ff3.b);
                } else {
                    arrayList.add(ff3.d);
                }
                if (ff3.y()) {
                    if (ff3.c == null) {
                        ff3.c = new ky1(ff3, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ff3.c);
                } else {
                    arrayList.add(ff3.e);
                }
                if (ff3 instanceof qf6) {
                    arrayList.add(new lrf(ff3));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((lrf) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            lrf lrf2 = (lrf) it3.next();
            if (lrf2.b != gf3) {
                lrf2.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        gf3 gf32 = (gf3) this.c;
        e(gf32.d, 0, arrayList2);
        e(gf32.e, 1, arrayList2);
        this.a = false;
    }

    public int d(gf3 gf3, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f2;
        gf3 gf32 = gf3;
        int i3 = i;
        ArrayList arrayList2 = (ArrayList) this.f;
        int size = arrayList2.size();
        long j2 = 0;
        int i4 = 0;
        long j3 = 0;
        while (i4 < size) {
            lrf lrf = ((hic) arrayList2.get(i4)).a;
            if (!(lrf instanceof ky1) ? i3 != 0 ? (lrf instanceof l1f) : (lrf instanceof ak6) : ((ky1) lrf).f == i3) {
                se4 se4 = (i3 == 0 ? gf32.d : gf32.e).h;
                se4 se42 = (i3 == 0 ? gf32.d : gf32.e).i;
                boolean contains = lrf.h.l.contains(se4);
                se4 se43 = lrf.i;
                boolean contains2 = se43.l.contains(se42);
                long j4 = lrf.j();
                se4 se44 = lrf.h;
                if (!contains || !contains2) {
                    arrayList = arrayList2;
                    i2 = i4;
                    j = contains ? Math.max(hic.b(se44, (long) se44.f), ((long) se44.f) + j4) : contains2 ? Math.max(-hic.a(se43, (long) se43.f), ((long) (-se43.f)) + j4) : (lrf.j() + ((long) se44.f)) - ((long) se43.f);
                } else {
                    long b2 = hic.b(se44, j2);
                    arrayList = arrayList2;
                    long a2 = hic.a(se43, j2);
                    long j5 = b2 - j4;
                    int i5 = se43.f;
                    i2 = i4;
                    if (j5 >= ((long) (-i5))) {
                        j5 += (long) i5;
                    }
                    long j6 = (long) se44.f;
                    long j7 = ((-a2) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    ff3 ff3 = lrf.b;
                    if (i3 == 0) {
                        f2 = ff3.d0;
                    } else if (i3 == 1) {
                        f2 = ff3.e0;
                    } else {
                        ff3.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = (float) (f2 > 0.0f ? (long) ((((float) j5) / (1.0f - f2)) + (((float) j7) / f2)) : 0);
                    j = (((long) se44.f) + ((((long) ((f3 * f2) + 0.5f)) + j4) + ((long) us8.g(1.0f, f2, f3, 0.5f)))) - ((long) se43.f);
                }
            } else {
                arrayList = arrayList2;
                j = j2;
                i2 = i4;
            }
            j3 = Math.max(j3, j);
            i4 = i2 + 1;
            arrayList2 = arrayList;
            gf32 = gf3;
            j2 = 0;
        }
        return (int) j3;
    }

    public void e(lrf lrf, int i, ArrayList arrayList) {
        se4 se4;
        Iterator it = lrf.h.k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            se4 = lrf.i;
            if (!hasNext) {
                break;
            }
            pe4 pe4 = (pe4) it.next();
            if (pe4 instanceof se4) {
                a((se4) pe4, i, arrayList, (hic) null);
            } else if (pe4 instanceof lrf) {
                a(((lrf) pe4).h, i, arrayList, (hic) null);
            }
        }
        Iterator it2 = se4.k.iterator();
        while (it2.hasNext()) {
            pe4 pe42 = (pe4) it2.next();
            if (pe42 instanceof se4) {
                a((se4) pe42, i, arrayList, (hic) null);
            } else if (pe42 instanceof lrf) {
                a(((lrf) pe42).i, i, arrayList, (hic) null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((l1f) lrf).k.k.iterator();
            while (it3.hasNext()) {
                pe4 pe43 = (pe4) it3.next();
                if (pe43 instanceof se4) {
                    a((se4) pe43, i, arrayList, (hic) null);
                }
            }
        }
    }

    public void f(int i, int i2, int i3, int i4, ff3 ff3) {
        sj0 sj0 = (sj0) this.h;
        sj0.b = i;
        sj0.d = i3;
        sj0.e = i2;
        sj0.f = i4;
        ((ghb) this.g).c(ff3, sj0);
        ff3.O(sj0.g);
        ff3.L(sj0.h);
        ff3.E = sj0.c;
        ff3.I(sj0.i);
    }

    public void g() {
        lj0 lj0;
        Iterator it = ((gf3) this.c).q0.iterator();
        while (it.hasNext()) {
            ff3 ff3 = (ff3) it.next();
            if (!ff3.a) {
                int[] iArr = ff3.p0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = ff3.r;
                int i4 = ff3.s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                ch4 ch4 = ff3.d.e;
                boolean z3 = ch4.j;
                ch4 ch42 = ff3.e.e;
                boolean z4 = ch42.j;
                if (z3 && z4) {
                    f(1, ch4.g, 1, ch42.g, ff3);
                    ff3.a = true;
                } else if (z3 && z) {
                    f(1, ch4.g, 2, ch42.g, ff3);
                    if (i2 == 3) {
                        ff3.e.e.m = ff3.k();
                    } else {
                        ff3.e.e.d(ff3.k());
                        ff3.a = true;
                    }
                } else if (z4 && z2) {
                    f(2, ch4.g, 1, ch42.g, ff3);
                    if (i == 3) {
                        ff3.d.e.m = ff3.q();
                    } else {
                        ff3.d.e.d(ff3.q());
                        ff3.a = true;
                    }
                }
                if (ff3.a && (lj0 = ff3.e.l) != null) {
                    lj0.d(ff3.a0);
                }
            }
        }
    }
}
