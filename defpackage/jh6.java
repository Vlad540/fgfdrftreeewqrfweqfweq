package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: jh6  reason: default package */
public final class jh6 {
    public static final /* synthetic */ k77[] k;
    public final pg6 a;
    public final pz3 b;
    public final pz3 c;
    public final int d;
    public final kh6 e;
    public final Integer f;
    public final boolean g;
    public final zt3 h;
    public final ew i;
    public volatile fh6 j;

    static {
        k77 hc9 = new hc9(jh6.class, "historyBounds", "getHistoryBounds()Lru/ok/tamtam/loader/HistoryBounds;");
        m7c.a.getClass();
        k = new k77[]{hc9};
    }

    public jh6(pg6 pg6, pz3 pz3, pz3 pz32, int i2, kh6 kh6, boolean z, int i3) {
        z = (i3 & 64) != 0 ? true : z;
        this.a = pg6;
        this.b = pz3;
        this.c = pz32;
        this.d = i2;
        this.e = kh6;
        this.f = null;
        this.g = z;
        zt3 zt3 = new zt3();
        this.h = zt3;
        this.i = new ew(new r7e(new gz3(19, this)), 4, this);
        zt3.add(new Object());
    }

    public final void a(int i2, rg6 rg6) {
        this.h.add(i2, rg6);
    }

    public final void b(rg6 rg6) {
        kh6 kh6 = this.e;
        if (kh6 != null) {
            kh6.c("addHistoryItem " + rg6);
        }
        h(Collections.singletonList(rg6));
        p();
        s();
        fh6 fh6 = this.j;
        if (fh6 != null) {
            fh6.k();
        }
    }

    public final void c(Set set) {
        if (!set.isEmpty()) {
            kh6 kh6 = this.e;
            if (kh6 != null) {
                int size = set.size();
                kh6.c("deleteHistoryItem: " + size);
            }
            zt3 zt3 = this.h;
            ArrayList arrayList = new ArrayList();
            Iterator it = zt3.iterator();
            while (true) {
                wt3 wt3 = (wt3) it;
                if (!wt3.hasNext()) {
                    break;
                }
                Object next = wt3.next();
                if (set.contains(Long.valueOf(((rg6) next).getId()))) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty() && !this.h.isEmpty()) {
                this.h.removeAll(arrayList);
                m(this.h);
                q();
                zt3 zt32 = this.h;
                if (!(zt32 instanceof Collection) || !zt32.isEmpty()) {
                    Iterator it2 = zt32.iterator();
                    while (true) {
                        wt3 wt32 = (wt3) it2;
                        if (wt32.hasNext()) {
                            if (!(((rg6) wt32.next()) instanceof qg6)) {
                                p();
                                s();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                fh6 fh6 = this.j;
                if (fh6 != null) {
                    fh6.k();
                }
            }
        }
    }

    public final og6 d() {
        return (og6) this.i.T0(this, k[0]);
    }

    public final ArrayList e() {
        return new ArrayList(this.h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00a7 A[LOOP:2: B:39:0x00a7->B:96:0x00a7, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0173 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List f(long r17) {
        /*
            r16 = this;
            java.util.ArrayList r0 = r16.e()
            og6 r1 = r16.d()
            java.util.List r1 = r1.i()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0013
            return r0
        L_0x0013:
            boolean r1 = r0.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0038
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0022
            goto L_0x0037
        L_0x0022:
            java.util.Iterator r1 = r0.iterator()
        L_0x0026:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r1.next()
            rg6 r3 = (defpackage.rg6) r3
            boolean r3 = r3 instanceof defpackage.qg6
            if (r3 == 0) goto L_0x0026
            goto L_0x0038
        L_0x0037:
            return r0
        L_0x0038:
            int r1 = r0.size()
            r3 = 0
            if (r1 != r2) goto L_0x0051
            java.lang.Object r1 = r0.get(r3)
            boolean r1 = r1 instanceof defpackage.qg6
            if (r1 == 0) goto L_0x0051
            qg6 r0 = new qg6
            r0.<init>()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L_0x0051:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x005a
            hw4 r0 = hw4.a
            return r0
        L_0x005a:
            og6 r1 = r16.d()
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x006d
            ete.e(r0)
            r1 = r16
            r1.m(r0)
            return r0
        L_0x006d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.size()
            r5 = -1
            r6 = r3
            r7 = r5
        L_0x0079:
            if (r6 >= r4) goto L_0x00a3
            java.lang.Object r8 = r0.get(r6)
            rg6 r8 = (defpackage.rg6) r8
            boolean r8 = r8 instanceof defpackage.qg6
            if (r8 != 0) goto L_0x008c
            int r8 = r0.size()
            int r8 = r8 - r2
            if (r6 != r8) goto L_0x00a0
        L_0x008c:
            if (r7 != r5) goto L_0x0092
            r7 = r3
            if (r6 != 0) goto L_0x0092
            goto L_0x00a0
        L_0x0092:
            int r8 = r6 + 1
            java.util.List r7 = r0.subList(r7, r8)
            java.util.List r7 = o23.s0(r7)
            r1.add(r7)
            r7 = r6
        L_0x00a0:
            int r6 = r6 + 1
            goto L_0x0079
        L_0x00a3:
            java.util.Iterator r0 = r1.iterator()
        L_0x00a7:
            boolean r1 = r0.hasNext()
            r3 = 0
            if (r1 == 0) goto L_0x0174
            java.lang.Object r1 = r0.next()
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r4.iterator()
        L_0x00be:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00d4
            java.lang.Object r7 = r6.next()
            r8 = r7
            rg6 r8 = (defpackage.rg6) r8
            boolean r8 = r8 instanceof defpackage.qg6
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x00be
            r5.add(r7)
            goto L_0x00be
        L_0x00d4:
            java.lang.Object r6 = o23.X(r4)
            boolean r6 = r6 instanceof defpackage.qg6
            r7 = -1
            if (r6 != 0) goto L_0x00e2
            r9 = -9223372036854775808
        L_0x00e0:
            r12 = r9
            goto L_0x0121
        L_0x00e2:
            java.util.Iterator r6 = r5.iterator()
            boolean r9 = r6.hasNext()
            if (r9 != 0) goto L_0x00ee
            r9 = r3
            goto L_0x0117
        L_0x00ee:
            java.lang.Object r9 = r6.next()
            boolean r10 = r6.hasNext()
            if (r10 != 0) goto L_0x00f9
            goto L_0x0117
        L_0x00f9:
            r10 = r9
            rg6 r10 = (defpackage.rg6) r10
            long r10 = r10.k()
        L_0x0100:
            java.lang.Object r12 = r6.next()
            r13 = r12
            rg6 r13 = (defpackage.rg6) r13
            long r13 = r13.k()
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0111
            r9 = r12
            r10 = r13
        L_0x0111:
            boolean r12 = r6.hasNext()
            if (r12 != 0) goto L_0x0100
        L_0x0117:
            rg6 r9 = (defpackage.rg6) r9
            if (r9 == 0) goto L_0x0120
            long r9 = r9.k()
            goto L_0x00e0
        L_0x0120:
            r12 = r7
        L_0x0121:
            java.lang.Object r4 = o23.f0(r4)
            boolean r4 = r4 instanceof defpackage.qg6
            if (r4 != 0) goto L_0x012f
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x016b
        L_0x012f:
            java.util.Iterator r14 = r5.iterator()
            boolean r4 = r14.hasNext()
            if (r4 != 0) goto L_0x013a
            goto L_0x0163
        L_0x013a:
            java.lang.Object r3 = r14.next()
            boolean r4 = r14.hasNext()
            if (r4 != 0) goto L_0x0145
            goto L_0x0163
        L_0x0145:
            r4 = r3
            rg6 r4 = (defpackage.rg6) r4
            long r4 = r4.k()
        L_0x014c:
            java.lang.Object r6 = r14.next()
            r9 = r6
            rg6 r9 = (defpackage.rg6) r9
            long r9 = r9.k()
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x015d
            r3 = r6
            r4 = r9
        L_0x015d:
            boolean r6 = r14.hasNext()
            if (r6 != 0) goto L_0x014c
        L_0x0163:
            rg6 r3 = (defpackage.rg6) r3
            if (r3 == 0) goto L_0x016b
            long r7 = r3.k()
        L_0x016b:
            int r3 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r3 > 0) goto L_0x00a7
            int r3 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x00a7
            r3 = r1
        L_0x0174:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0181
            qg6 r0 = new qg6
            r0.<init>()
            java.util.List r3 = java.util.Collections.singletonList(r0)
        L_0x0181:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh6.f(long):java.util.List");
    }

    public final void g(long j2, List list, boolean z, boolean z2) {
        List list2;
        List i2 = d().i();
        sg5 L = myc.L(new ij4(new es(2, list), 0, new t13(22)), new gh6(0, i2));
        Comparator c2 = d().c();
        ArrayList arrayList = new ArrayList();
        myc.T(L, arrayList);
        t23.J(arrayList, c2);
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            list2 = hw4.a;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                list2 = Collections.singletonList(next);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                list2 = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            rg6 rg6 = (rg6) list2.get(i3);
            arrayList4.add(rg6);
            if (i3 == list2.size() - 1 || !hhd.f(swb.m(rg6.k(), i2), swb.m(((rg6) list2.get(i3 + 1)).k(), i2))) {
                arrayList3.add(arrayList4);
                arrayList4 = new ArrayList();
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((List) next2).size() > 0) {
                arrayList5.add(next2);
            }
        }
        ArrayList arrayList6 = new ArrayList(arrayList5);
        if (!arrayList6.isEmpty()) {
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                List list3 = (List) it3.next();
                list3.add(0, new Object());
                list3.add(list3.size(), new Object());
            }
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                List list4 = (List) it4.next();
                h(list4);
                o(mt0.l(list4), mt0.v(list4));
            }
            List list5 = (List) o23.V(arrayList6);
            long j3 = -1;
            if (z && (!this.h.isEmpty())) {
                rg6 v = mt0.v(list5);
                long k2 = v != null ? v.k() : -1;
                if (k2 >= 0) {
                    yx2 m = swb.m(k2, i2);
                    yx2 m2 = swb.m(j2, i2);
                    if (m != null && m.equals(m2)) {
                        n(j2, k2);
                    }
                }
            }
            List list6 = (List) o23.e0(arrayList6);
            if (z2 && (!this.h.isEmpty())) {
                rg6 l = mt0.l(list6);
                if (l != null) {
                    j3 = l.k();
                }
                if (j3 >= 0) {
                    yx2 m3 = swb.m(j3, i2);
                    yx2 m4 = swb.m(j2, i2);
                    if (m3 != null && m3.equals(m4)) {
                        n(j3, j2);
                    }
                }
            }
            m(this.h);
            p();
            s();
            if (!d().a()) {
                zt3 zt3 = this.h;
                o(mt0.l(zt3), mt0.v(zt3));
            }
            fh6 fh6 = this.j;
            if (fh6 != null) {
                fh6.k();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [rg6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v7, types: [rg6, java.lang.Object] */
    public final void h(List list) {
        int indexOf;
        int indexOf2;
        int i2 = 0;
        boolean z = (list.isEmpty() ^ true) && (o23.V(list) instanceof qg6);
        boolean z2 = (list.isEmpty() ^ true) && (o23.e0(list) instanceof qg6);
        List<rg6> U = myc.U(myc.M(myc.L(new es(2, list), new t13(21)), new gw2(18, this)));
        if (!U.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h.addAll(U);
            } else {
                Comparator e2 = d().e();
                if (this.g) {
                    int A = p23.A(this.h);
                    zcc it = new nv7(U).iterator();
                    while (true) {
                        zcc zcc = it;
                        if (!zcc.b.hasPrevious()) {
                            break;
                        }
                        rg6 rg6 = (rg6) zcc.b.previous();
                        while (A > 0 && ((this.h.b[A] instanceof qg6) || e2.compare(Long.valueOf(((rg6) this.h.b[A]).k()), Long.valueOf(rg6.k())) > 0)) {
                            A--;
                        }
                        int i3 = A + 1;
                        if (this.h.b.length > i3 && (this.h.b[i3] instanceof qg6)) {
                            A = i3;
                        }
                        a(A + 1, rg6);
                    }
                } else {
                    for (rg6 rg62 : U) {
                        while (i2 < this.h.b.length && ((this.h.b[i2] instanceof qg6) || e2.compare(Long.valueOf(((rg6) this.h.b[i2]).k()), Long.valueOf(rg62.k())) <= 0)) {
                            i2++;
                        }
                        a(i2, rg62);
                    }
                }
            }
            if (z && (indexOf2 = this.h.indexOf(o23.V(U))) > 0) {
                int i4 = indexOf2 - 1;
                if (!(this.h.b[i4] instanceof qg6)) {
                    a(i4, new Object());
                }
            }
            if (z2 && (indexOf = this.h.indexOf(o23.e0(U))) > 0) {
                if (!(indexOf == p23.A(this.h) ? o23.e0(this.h) instanceof qg6 : this.h.b[indexOf + 1] instanceof qg6)) {
                    a(indexOf + 1, new Object());
                }
            }
        }
    }

    public final boolean i(List list, long j2, boolean z) {
        int i2;
        int i3;
        int i4 = this.d;
        if (z) {
            if (list.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it = list.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    rg6 rg6 = (rg6) it.next();
                    if (!(rg6 instanceof qg6) && d().e().compare(Long.valueOf(rg6.k()), Long.valueOf(j2)) <= 0 && (i3 = i3 + 1) < 0) {
                        p23.F();
                        throw null;
                    }
                }
            }
            if (i3 < i4) {
                return true;
            }
        } else {
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it2 = list.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    rg6 rg62 = (rg6) it2.next();
                    if (!(rg62 instanceof qg6) && d().e().compare(Long.valueOf(rg62.k()), Long.valueOf(j2)) >= 0 && (i2 = i2 + 1) < 0) {
                        p23.F();
                        throw null;
                    }
                }
            }
            if (i2 < i4) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: rg6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.pz3 r28, long r29, boolean r31, boolean r32, boolean r33) {
        /*
            r27 = this;
            r6 = r27
            r0 = r29
            if (r31 != 0) goto L_0x0009
            if (r32 != 0) goto L_0x0009
            return
        L_0x0009:
            java.util.List r2 = r6.f(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r2.iterator()
        L_0x0016:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x002b
            java.lang.Object r5 = r4.next()
            r7 = r5
            rg6 r7 = (defpackage.rg6) r7
            boolean r7 = r7 instanceof defpackage.qg6
            if (r7 != 0) goto L_0x0016
            r3.add(r5)
            goto L_0x0016
        L_0x002b:
            boolean r3 = r3.isEmpty()
            r7 = -1
            r5 = 0
            r9 = 1
            if (r3 == 0) goto L_0x0042
            int r2 = r6.d
            r10 = r0
            r3 = r2
            r18 = r7
            r15 = 0
            r22 = 0
            r0 = r3
            r1 = r10
            goto L_0x00ca
        L_0x0042:
            java.lang.Object r3 = o23.V(r2)
            boolean r3 = r3 instanceof defpackage.qg6
            r10 = 0
            if (r3 == 0) goto L_0x0079
            if (r31 == 0) goto L_0x0079
            if (r33 == 0) goto L_0x0056
            boolean r3 = r6.i(r2, r0, r9)
            if (r3 == 0) goto L_0x0079
        L_0x0056:
            int r3 = r6.d
            java.lang.Object r12 = r2.get(r9)
            rg6 r12 = (defpackage.rg6) r12
            long r12 = r12.k()
            java.lang.Object r14 = r2.get(r9)
            rg6 r14 = (defpackage.rg6) r14
            og6 r15 = r27.d()
            yx2 r15 = r15.f(r12)
            if (r15 == 0) goto L_0x0077
            long r15 = r15.b()
            goto L_0x007d
        L_0x0077:
            r15 = r7
            goto L_0x007d
        L_0x0079:
            r3 = r5
            r15 = r7
            r12 = r10
            r14 = 0
        L_0x007d:
            java.lang.Object r4 = o23.e0(r2)
            boolean r4 = r4 instanceof defpackage.qg6
            if (r4 == 0) goto L_0x00c3
            if (r32 == 0) goto L_0x00c3
            if (r33 == 0) goto L_0x008f
            boolean r0 = r6.i(r2, r0, r5)
            if (r0 == 0) goto L_0x00c3
        L_0x008f:
            int r0 = r6.d
            int r1 = r2.size()
            int r1 = r1 + -2
            java.lang.Object r1 = r2.get(r1)
            rg6 r1 = (defpackage.rg6) r1
            long r10 = r1.k()
            int r1 = r2.size()
            int r1 = r1 + -2
            java.lang.Object r1 = r2.get(r1)
            r4 = r1
            rg6 r4 = (defpackage.rg6) r4
            og6 r1 = r27.d()
            yx2 r1 = r1.d(r10)
            if (r1 == 0) goto L_0x00bc
            long r7 = r1.a()
        L_0x00bc:
            r22 = r4
            r1 = r12
            r18 = r15
        L_0x00c1:
            r15 = r14
            goto L_0x00ca
        L_0x00c3:
            r0 = r5
            r1 = r12
            r18 = r15
            r22 = 0
            goto L_0x00c1
        L_0x00ca:
            if (r3 != 0) goto L_0x00cf
            if (r0 != 0) goto L_0x00cf
            return
        L_0x00cf:
            kh6 r4 = r6.e
            if (r4 == 0) goto L_0x0124
            java.lang.Class r12 = r28.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r13 = defpackage.kh6.b(r1)
            java.lang.String r14 = defpackage.kh6.b(r10)
            java.lang.String r5 = defpackage.kh6.b(r18)
            java.lang.String r9 = defpackage.kh6.b(r7)
            r29 = r7
            java.lang.String r7 = "dataSourceRequest: "
            java.lang.String r8 = ", bTime: "
            r31 = r15
            java.lang.String r15 = ", fTime: "
            java.lang.StringBuilder r7 = defpackage.c3d.j(r7, r12, r8, r13, r15)
            r7.append(r14)
            java.lang.String r8 = ", bCount: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ", fCount: "
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = ", bLimit: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = ", fLimit: "
            r7.append(r5)
            r7.append(r9)
            java.lang.String r5 = r7.toString()
            r4.c(r5)
            goto L_0x0128
        L_0x0124:
            r29 = r7
            r31 = r15
        L_0x0128:
            java.lang.Integer r4 = r6.f
            if (r4 == 0) goto L_0x0142
            zt3 r4 = r6.h
            java.lang.Object[] r4 = r4.b
            int r4 = r4.length
            r5 = 1
            if (r4 > r5) goto L_0x0143
            java.lang.Integer r0 = r6.f
            int r0 = r0.intValue()
            java.lang.Integer r3 = r6.f
            int r3 = r3.intValue()
            r7 = r3
            goto L_0x0145
        L_0x0142:
            r5 = 1
        L_0x0143:
            r7 = r0
            r0 = r3
        L_0x0145:
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0170
            r12 = r28
            r13 = r1
            r15 = r31
            r16 = r0
            r17 = r7
            r20 = r29
            java.util.List r3 = r12.h(r13, r15, r16, r17, r18, r20)
            r27.q()
            if (r7 <= 0) goto L_0x015f
            r4 = r5
            goto L_0x0160
        L_0x015f:
            r4 = 0
        L_0x0160:
            if (r0 <= 0) goto L_0x0163
            goto L_0x0164
        L_0x0163:
            r5 = 0
        L_0x0164:
            r28 = r1
            r30 = r3
            r31 = r4
            r32 = r5
            r27.g(r28, r30, r31, r32)
            return
        L_0x0170:
            if (r0 <= 0) goto L_0x018b
            r17 = 0
            r20 = -1
            r12 = r28
            r13 = r1
            r15 = r31
            r16 = r0
            java.util.List r3 = r12.h(r13, r15, r16, r17, r18, r20)
            r27.q()
            r4 = 0
            r5 = 1
            r0 = r27
            r0.g(r1, r3, r4, r5)
        L_0x018b:
            if (r7 <= 0) goto L_0x01af
            r21 = 0
            r23 = -1
            r17 = r28
            r18 = r10
            r20 = r22
            r22 = r7
            r25 = r29
            java.util.List r0 = r17.h(r18, r20, r21, r22, r23, r25)
            r27.q()
            r1 = 1
            r2 = 0
            r28 = r10
            r30 = r0
            r31 = r1
            r32 = r2
            r27.g(r28, r30, r31, r32)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh6.j(pz3, long, boolean, boolean, boolean):void");
    }

    public final void k(pz3 pz3, long j2, boolean z, boolean z2) {
        j(pz3, j2, z, z2, true);
        if (this.h.isEmpty() || (this.h.b.length == 1 && (o23.X(this.h) instanceof qg6))) {
            this.h.clear();
            fh6 fh6 = this.j;
            if (fh6 != null) {
                fh6.k();
            }
        }
    }

    public final void l(long j2) {
        int A;
        int i2 = 0;
        kh6 kh6 = this.e;
        if (kh6 != null) {
            kh6.c("loadEmptyChunksData: " + kh6.b(j2));
        }
        List h2 = this.b.h(j2, (rg6) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Long.MIN_VALUE, Long.MAX_VALUE);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : h2) {
            if (hashSet.add(Long.valueOf(((rg6) next).getId()))) {
                arrayList.add(next);
            }
        }
        h(o23.m0(arrayList, gp0.d(hh6.a, ih6.a)));
        ArrayList arrayList2 = new ArrayList();
        int A2 = p23.A(this.h);
        if (A2 >= 0) {
            int i3 = 0;
            while (true) {
                rg6 rg6 = (rg6) this.h.b[i2];
                if (!(rg6 instanceof qg6)) {
                    if (i3 != i2) {
                        this.h.set(i3, rg6);
                    }
                    i3++;
                }
                if (i2 == A2) {
                    break;
                }
                i2++;
            }
            i2 = i3;
        }
        if (i2 < this.h.b.length && i2 <= (A = p23.A(this.h))) {
            while (true) {
                arrayList2.add(this.h.remove(A));
                if (A == i2) {
                    break;
                }
                A--;
            }
        }
        arrayList2.isEmpty();
        fh6 fh6 = this.j;
        if (fh6 != null) {
            fh6.k();
        }
    }

    public final void m(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (size > 0 && (list.get(size) instanceof qg6) && (list.get(size - 1) instanceof qg6)) {
                rg6 rg6 = (rg6) this.h.remove(size);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: rg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: rg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: rg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: rg6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(long r7, long r9) {
        /*
            r6 = this;
            zt3 r0 = r6.h
            int r1 = r0.size()
            java.util.ListIterator r1 = r0.listIterator(r1)
        L_0x000a:
            boolean r2 = r1.hasPrevious()
            r3 = 0
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r1.previous()
            r4 = r2
            rg6 r4 = (defpackage.rg6) r4
            boolean r5 = r4 instanceof defpackage.qg6
            if (r5 != 0) goto L_0x000a
            long r4 = r4.k()
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x000a
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            rg6 r2 = (defpackage.rg6) r2
            java.util.Iterator r7 = r0.iterator()
        L_0x002c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0046
            java.lang.Object r8 = r7.next()
            r0 = r8
            rg6 r0 = (defpackage.rg6) r0
            boolean r1 = r0 instanceof defpackage.qg6
            if (r1 != 0) goto L_0x002c
            long r0 = r0.k()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x002c
            r3 = r8
        L_0x0046:
            rg6 r3 = (defpackage.rg6) r3
            r6.o(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh6.n(long, long):void");
    }

    public final void o(rg6 rg6, rg6 rg62) {
        int i2;
        if (rg6 != null && rg62 != null) {
            Iterator it = this.h.iterator();
            int i3 = 0;
            while (true) {
                wt3 wt3 = (wt3) it;
                i2 = -1;
                if (!wt3.hasNext()) {
                    i3 = -1;
                    break;
                }
                rg6 rg63 = (rg6) wt3.next();
                if (!(rg63 instanceof qg6) && rg63.getId() == rg6.getId()) {
                    break;
                }
                i3++;
            }
            zt3 zt3 = this.h;
            ListIterator listIterator = zt3.listIterator(zt3.b.length);
            while (true) {
                wt3 wt32 = (wt3) listIterator;
                if (!wt32.hasPrevious()) {
                    break;
                }
                rg6 rg64 = (rg6) wt32.previous();
                if (!(rg64 instanceof qg6) && rg64.getId() == rg62.getId()) {
                    i2 = wt32.b;
                    break;
                }
            }
            if (i3 >= 0 && i2 >= 0 && i3 <= i2) {
                while (true) {
                    if (this.h.b[i2] instanceof qg6) {
                        rg6 rg65 = (rg6) this.h.remove(i2);
                    }
                    if (i2 != i3) {
                        i2--;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [rg6, java.lang.Object] */
    public final void p() {
        boolean z;
        long g2 = d().g();
        d().getClass();
        int i2 = (g2 > -1 ? 1 : (g2 == -1 ? 0 : -1));
        zt3 zt3 = this.h;
        if (i2 != 0 && (!(zt3 instanceof Collection) || !zt3.isEmpty())) {
            Iterator it = zt3.iterator();
            while (true) {
                wt3 wt3 = (wt3) it;
                if (!wt3.hasNext()) {
                    break;
                }
                rg6 rg6 = (rg6) wt3.next();
                if (!(rg6 instanceof qg6) && rg6.getId() == g2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        rg6 rg62 = (rg6) o23.V(zt3);
        kh6 kh6 = this.e;
        if (kh6 != null) {
            kh6.c("UpdateFirstGap: firstItemId=" + g2 + ", isLastGap=" + (rg62 instanceof qg6) + ", hasFirstBound=" + z);
        }
        if (z && (rg62 instanceof qg6)) {
            rg6 rg63 = (rg6) zt3.remove(0);
        } else if (!z && !(rg62 instanceof qg6)) {
            a(0, new Object());
        }
    }

    public final void q() {
        og6 d2 = d();
        og6 k2 = this.a.k();
        this.i.o1(this, k[0], k2);
        zt3 zt3 = this.h;
        if (!(zt3 instanceof Collection) || !zt3.isEmpty()) {
            Iterator it = zt3.iterator();
            while (true) {
                wt3 wt3 = (wt3) it;
                if (wt3.hasNext()) {
                    if (!(((rg6) wt3.next()) instanceof qg6)) {
                        p();
                        s();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        kh6 kh6 = this.e;
        if (kh6 != null && !gt0.s(d2, d())) {
            pa2.z(kh6, d());
        }
    }

    public final void r(rg6 rg6) {
        int A = p23.A(this.h);
        while (true) {
            if (-1 >= A) {
                A = -1;
                break;
            } else if (((rg6) this.h.b[A]).getId() == rg6.getId()) {
                break;
            } else {
                A--;
            }
        }
        fh6 fh6 = this.j;
        if (A >= 0) {
            rg6 rg62 = (rg6) this.h.set(A, rg6);
            rg6 rg63 = (rg6) o23.Y(A - 1, this.h);
            boolean z = true;
            rg6 rg64 = (rg6) o23.Y(A + 1, this.h);
            if ((rg63 == null || d().c().compare(rg63, rg6) <= 0) && (rg64 == null || d().c().compare(rg6, rg64) >= 0)) {
                z = false;
            }
            if (z) {
                this.h.c(d().c());
            }
            if ((z || fh6 == null) && fh6 != null) {
                fh6.k();
                return;
            }
            return;
        }
        kh6 kh6 = this.e;
        if (kh6 != null) {
            kh6.c("WARN: updateHistoryItem: could not find history item by id!");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rg6, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s() {
        /*
            r8 = this;
            og6 r0 = r8.d()
            long r0 = r0.h()
            og6 r2 = r8.d()
            r2.getClass()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0043
            zt3 r2 = r8.h
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0022
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0022
            goto L_0x0043
        L_0x0022:
            java.util.Iterator r2 = r2.iterator()
        L_0x0026:
            r3 = r2
            wt3 r3 = (defpackage.wt3) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0043
            java.lang.Object r3 = r3.next()
            rg6 r3 = (defpackage.rg6) r3
            boolean r4 = r3 instanceof defpackage.qg6
            if (r4 != 0) goto L_0x0026
            long r3 = r3.getId()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0026
            r2 = 1
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            zt3 r3 = r8.h
            java.lang.Object r3 = o23.e0(r3)
            rg6 r3 = (defpackage.rg6) r3
            kh6 r4 = r8.e
            if (r4 == 0) goto L_0x0073
            boolean r5 = r3 instanceof defpackage.qg6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "UpdateLastGap: lastItemId="
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = ", isLastGap="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", hasLastBound="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            r4.c(r0)
        L_0x0073:
            if (r2 == 0) goto L_0x007f
            boolean r0 = r3 instanceof defpackage.qg6
            if (r0 == 0) goto L_0x007f
            zt3 r8 = r8.h
            r8.remove((java.lang.Object) r3)
            return
        L_0x007f:
            if (r2 != 0) goto L_0x0092
            boolean r0 = r3 instanceof defpackage.qg6
            if (r0 != 0) goto L_0x0092
            zt3 r0 = r8.h
            java.lang.Object[] r0 = r0.b
            int r0 = r0.length
            qg6 r1 = new qg6
            r1.<init>()
            r8.a(r0, r1)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh6.s():void");
    }
}
