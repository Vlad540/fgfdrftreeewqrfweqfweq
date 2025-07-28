package defpackage;

import java.util.Arrays;

/* renamed from: id7  reason: default package */
public final class id7 {
    public static boolean p = false;
    public static int q = 1000;
    public boolean a;
    public int b;
    public final v3b c;
    public int d;
    public int e;
    public as[] f;
    public boolean g;
    public boolean[] h;
    public int i;
    public int j;
    public int k;
    public final jg8 l;
    public nld[] m;
    public int n;
    public as o;

    /* JADX WARNING: type inference failed for: r1v2, types: [as, v3b] */
    public id7() {
        this.a = false;
        this.b = 0;
        this.d = 32;
        this.e = 32;
        this.f = null;
        this.g = false;
        this.h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new nld[q];
        this.n = 0;
        this.f = new as[32];
        s();
        jg8 jg8 = new jg8(3);
        jg8.c = new o0b();
        jg8.b = new o0b();
        jg8.o = new nld[32];
        this.l = jg8;
        ? asVar = new as(jg8);
        asVar.f = new nld[128];
        asVar.g = new nld[128];
        asVar.h = 0;
        asVar.i = new mn((v3b) asVar);
        this.c = asVar;
        this.o = new as(jg8);
    }

    public static int n(Object obj) {
        nld nld = ((me3) obj).i;
        if (nld != null) {
            return (int) (nld.X + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: nld} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.nld a(int r6) {
        /*
            r5 = this;
            jg8 r0 = r5.l
            java.lang.Object r0 = r0.b
            o0b r0 = (defpackage.o0b) r0
            int r1 = r0.b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.a
            r4 = r3[r1]
            r3[r1] = r2
            r0.b = r1
            r2 = r4
        L_0x0016:
            nld r2 = (defpackage.nld) r2
            if (r2 != 0) goto L_0x0022
            nld r2 = new nld
            r2.<init>(r6)
            r2.A0 = r6
            goto L_0x0027
        L_0x0022:
            r2.c()
            r2.A0 = r6
        L_0x0027:
            int r6 = r5.n
            int r0 = q
            if (r6 < r0) goto L_0x003b
            int r0 = r0 * 2
            q = r0
            nld[] r6 = r5.m
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            nld[] r6 = (defpackage.nld[]) r6
            r5.m = r6
        L_0x003b:
            nld[] r6 = r5.m
            int r0 = r5.n
            int r1 = r0 + 1
            r5.n = r1
            r6[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id7.a(int):nld");
    }

    public final void b(nld nld, nld nld2, int i2, float f2, nld nld3, nld nld4, int i3, int i4) {
        as l2 = l();
        if (nld2 == nld3) {
            l2.d.j(nld, 1.0f);
            l2.d.j(nld4, 1.0f);
            l2.d.j(nld2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.j(nld, 1.0f);
            l2.d.j(nld2, -1.0f);
            l2.d.j(nld3, -1.0f);
            l2.d.j(nld4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                l2.b = (float) ((-i2) + i3);
            }
        } else if (f2 <= 0.0f) {
            l2.d.j(nld, -1.0f);
            l2.d.j(nld2, 1.0f);
            l2.b = (float) i2;
        } else if (f2 >= 1.0f) {
            l2.d.j(nld4, -1.0f);
            l2.d.j(nld3, 1.0f);
            l2.b = (float) (-i3);
        } else {
            float f3 = 1.0f - f2;
            l2.d.j(nld, f3 * 1.0f);
            l2.d.j(nld2, f3 * -1.0f);
            l2.d.j(nld3, -1.0f * f2);
            l2.d.j(nld4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                l2.b = (((float) i3) * f2) + (((float) (-i2)) * f3);
            }
        }
        if (i4 != 8) {
            l2.a(this, i4);
        }
        c(l2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        if (r4.z0 <= 1) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c6, code lost:
        if (r4.z0 <= 1) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00db, code lost:
        if (r4.z0 <= 1) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e8, code lost:
        if (r4.z0 <= 1) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.as r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.o()
        L_0x0016:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x01a6
            as[] r2 = r0.f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x007d
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x006d
            or r6 = r1.d
            int r6 = r6.f()
            r7 = 0
        L_0x002b:
            java.util.ArrayList r8 = r1.c
            if (r7 >= r6) goto L_0x0044
            or r9 = r1.d
            nld r9 = r9.g(r7)
            int r10 = r9.c
            if (r10 != r5) goto L_0x003e
            boolean r10 = r9.Y
            if (r10 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r8.add(r9)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006b
            r7 = 0
        L_0x004b:
            if (r7 >= r6) goto L_0x0067
            java.lang.Object r9 = r8.get(r7)
            nld r9 = (defpackage.nld) r9
            boolean r10 = r9.Y
            if (r10 == 0) goto L_0x005b
            r1.h(r0, r9, r3)
            goto L_0x0064
        L_0x005b:
            as[] r10 = r0.f
            int r9 = r9.c
            r9 = r10[r9]
            r1.i(r0, r9, r3)
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0067:
            r8.clear()
            goto L_0x0022
        L_0x006b:
            r2 = r3
            goto L_0x0022
        L_0x006d:
            nld r2 = r1.a
            if (r2 == 0) goto L_0x007d
            or r2 = r1.d
            int r2 = r2.f()
            if (r2 != 0) goto L_0x007d
            r1.e = r3
            r0.a = r3
        L_0x007d:
            boolean r2 = r17.e()
            if (r2 == 0) goto L_0x0084
            return
        L_0x0084:
            float r2 = r1.b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0095
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.b = r2
            or r2 = r1.d
            r2.i()
        L_0x0095:
            or r2 = r1.d
            int r2 = r2.f()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        L_0x00a3:
            if (r8 >= r2) goto L_0x00f7
            or r15 = r1.d
            float r15 = r15.h(r8)
            or r4 = r1.d
            nld r4 = r4.g(r8)
            int r5 = r4.A0
            if (r5 != r3) goto L_0x00d1
            if (r9 != 0) goto L_0x00c0
            int r5 = r4.z0
            if (r5 > r3) goto L_0x00bc
            goto L_0x00cf
        L_0x00bc:
            r12 = 0
        L_0x00bd:
            r9 = r4
            r11 = r15
            goto L_0x00f3
        L_0x00c0:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c9
            int r5 = r4.z0
            if (r5 > r3) goto L_0x00bc
            goto L_0x00cf
        L_0x00c9:
            if (r12 != 0) goto L_0x00f3
            int r5 = r4.z0
            if (r5 > r3) goto L_0x00f3
        L_0x00cf:
            r12 = r3
            goto L_0x00bd
        L_0x00d1:
            if (r9 != 0) goto L_0x00f3
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f3
            if (r10 != 0) goto L_0x00e2
            int r5 = r4.z0
            if (r5 > r3) goto L_0x00de
            goto L_0x00f1
        L_0x00de:
            r14 = 0
        L_0x00df:
            r10 = r4
            r13 = r15
            goto L_0x00f3
        L_0x00e2:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00eb
            int r5 = r4.z0
            if (r5 > r3) goto L_0x00de
            goto L_0x00f1
        L_0x00eb:
            if (r14 != 0) goto L_0x00f3
            int r5 = r4.z0
            if (r5 > r3) goto L_0x00f3
        L_0x00f1:
            r14 = r3
            goto L_0x00df
        L_0x00f3:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a3
        L_0x00f7:
            if (r9 == 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r9 = r10
        L_0x00fb:
            if (r9 != 0) goto L_0x00ff
            r2 = r3
            goto L_0x0103
        L_0x00ff:
            r1.g(r9)
            r2 = 0
        L_0x0103:
            or r4 = r1.d
            int r4 = r4.f()
            if (r4 != 0) goto L_0x010d
            r1.e = r3
        L_0x010d:
            if (r2 == 0) goto L_0x0195
            int r2 = r0.i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0119
            r16.o()
        L_0x0119:
            r2 = 3
            nld r2 = r0.a(r2)
            int r4 = r0.b
            int r4 = r4 + r3
            r0.b = r4
            int r5 = r0.i
            int r5 = r5 + r3
            r0.i = r5
            r2.b = r4
            jg8 r5 = r0.l
            java.lang.Object r8 = r5.o
            nld[] r8 = (defpackage.nld[]) r8
            r8[r4] = r2
            r1.a = r2
            int r4 = r0.j
            r16.h(r17)
            int r8 = r0.j
            int r4 = r4 + r3
            if (r8 != r4) goto L_0x0195
            as r4 = r0.o
            r4.getClass()
            r4.a = r7
            or r8 = r4.d
            r8.b()
            r8 = 0
        L_0x014b:
            or r9 = r1.d
            int r9 = r9.f()
            if (r8 >= r9) goto L_0x0167
            or r9 = r1.d
            nld r9 = r9.g(r8)
            or r10 = r1.d
            float r10 = r10.h(r8)
            or r11 = r4.d
            r11.a(r9, r10, r3)
            int r8 = r8 + 1
            goto L_0x014b
        L_0x0167:
            as r4 = r0.o
            r0.r(r4)
            int r4 = r2.c
            r8 = -1
            if (r4 != r8) goto L_0x0193
            nld r4 = r1.a
            if (r4 != r2) goto L_0x017e
            nld r2 = r1.f(r7, r2)
            if (r2 == 0) goto L_0x017e
            r1.g(r2)
        L_0x017e:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x0187
            nld r2 = r1.a
            r2.e(r0, r1)
        L_0x0187:
            java.lang.Object r2 = r5.c
            o0b r2 = (defpackage.o0b) r2
            r2.a(r1)
            int r2 = r0.j
            int r2 = r2 - r3
            r0.j = r2
        L_0x0193:
            r4 = r3
            goto L_0x0196
        L_0x0195:
            r4 = 0
        L_0x0196:
            nld r2 = r1.a
            if (r2 == 0) goto L_0x01a5
            int r2 = r2.A0
            if (r2 == r3) goto L_0x01a7
            float r2 = r1.b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01a5
            goto L_0x01a7
        L_0x01a5:
            return
        L_0x01a6:
            r4 = 0
        L_0x01a7:
            if (r4 != 0) goto L_0x01ac
            r16.h(r17)
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id7.c(as):void");
    }

    public final void d(nld nld, int i2) {
        int i3 = nld.c;
        if (i3 == -1) {
            nld.d(this, (float) i2);
            for (int i4 = 0; i4 < this.b + 1; i4++) {
                nld nld2 = ((nld[]) this.l.o)[i4];
            }
        } else if (i3 != -1) {
            as asVar = this.f[i3];
            if (asVar.e) {
                asVar.b = (float) i2;
            } else if (asVar.d.f() == 0) {
                asVar.e = true;
                asVar.b = (float) i2;
            } else {
                as l2 = l();
                if (i2 < 0) {
                    l2.b = (float) (i2 * -1);
                    l2.d.j(nld, 1.0f);
                } else {
                    l2.b = (float) i2;
                    l2.d.j(nld, -1.0f);
                }
                c(l2);
            }
        } else {
            as l3 = l();
            l3.a = nld;
            float f2 = (float) i2;
            nld.X = f2;
            l3.b = f2;
            l3.e = true;
            c(l3);
        }
    }

    public final void e(nld nld, nld nld2, int i2, int i3) {
        if (i3 == 8 && nld2.Y && nld.c == -1) {
            nld.d(this, nld2.X + ((float) i2));
            return;
        }
        as l2 = l();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            l2.b = (float) i2;
        }
        if (!z) {
            l2.d.j(nld, -1.0f);
            l2.d.j(nld2, 1.0f);
        } else {
            l2.d.j(nld, 1.0f);
            l2.d.j(nld2, -1.0f);
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    public final void f(nld nld, nld nld2, int i2, int i3) {
        as l2 = l();
        nld m2 = m();
        m2.o = 0;
        l2.b(nld, nld2, m2, i2);
        if (i3 != 8) {
            l2.d.j(j(i3), (float) ((int) (l2.d.e(m2) * -1.0f)));
        }
        c(l2);
    }

    public final void g(nld nld, nld nld2, int i2, int i3) {
        as l2 = l();
        nld m2 = m();
        m2.o = 0;
        l2.c(nld, nld2, m2, i2);
        if (i3 != 8) {
            l2.d.j(j(i3), (float) ((int) (l2.d.e(m2) * -1.0f)));
        }
        c(l2);
    }

    public final void h(as asVar) {
        int i2;
        if (asVar.e) {
            asVar.a.d(this, asVar.b);
        } else {
            as[] asVarArr = this.f;
            int i3 = this.j;
            asVarArr[i3] = asVar;
            nld nld = asVar.a;
            nld.c = i3;
            this.j = i3 + 1;
            nld.e(this, asVar);
        }
        if (this.a) {
            int i4 = 0;
            while (i4 < this.j) {
                if (this.f[i4] == null) {
                    System.out.println("WTF");
                }
                as asVar2 = this.f[i4];
                if (asVar2 != null && asVar2.e) {
                    asVar2.a.d(this, asVar2.b);
                    ((o0b) this.l.c).a(asVar2);
                    this.f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.j;
                        if (i5 >= i2) {
                            break;
                        }
                        as[] asVarArr2 = this.f;
                        int i7 = i5 - 1;
                        as asVar3 = asVarArr2[i5];
                        asVarArr2[i7] = asVar3;
                        nld nld2 = asVar3.a;
                        if (nld2.c == i5) {
                            nld2.c = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f[i6] = null;
                    }
                    this.j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i2 = 0; i2 < this.j; i2++) {
            as asVar = this.f[i2];
            asVar.a.X = asVar.b;
        }
    }

    public final nld j(int i2) {
        if (this.i + 1 >= this.e) {
            o();
        }
        nld a2 = a(4);
        int i3 = this.b + 1;
        this.b = i3;
        this.i++;
        a2.b = i3;
        a2.o = i2;
        ((nld[]) this.l.o)[i3] = a2;
        v3b v3b = this.c;
        v3b.i.b = a2;
        float[] fArr = a2.w0;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.o] = 1.0f;
        v3b.j(a2);
        return a2;
    }

    public final nld k(Object obj) {
        nld nld = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof me3) {
            me3 me3 = (me3) obj;
            nld = me3.i;
            if (nld == null) {
                me3.k();
                nld = me3.i;
            }
            int i2 = nld.b;
            jg8 jg8 = this.l;
            if (i2 == -1 || i2 > this.b || ((nld[]) jg8.o)[i2] == null) {
                if (i2 != -1) {
                    nld.c();
                }
                int i3 = this.b + 1;
                this.b = i3;
                this.i++;
                nld.b = i3;
                nld.A0 = 1;
                ((nld[]) jg8.o)[i3] = nld;
            }
        }
        return nld;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: as} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.as l() {
        /*
            r5 = this;
            jg8 r5 = r5.l
            java.lang.Object r0 = r5.c
            o0b r0 = (defpackage.o0b) r0
            int r1 = r0.b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.a
            r4 = r3[r1]
            r3[r1] = r2
            r0.b = r1
            goto L_0x0017
        L_0x0016:
            r4 = r2
        L_0x0017:
            as r4 = (defpackage.as) r4
            if (r4 != 0) goto L_0x0021
            as r4 = new as
            r4.<init>(r5)
            goto L_0x002e
        L_0x0021:
            r4.a = r2
            or r5 = r4.d
            r5.b()
            r5 = 0
            r4.b = r5
            r5 = 0
            r4.e = r5
        L_0x002e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id7.l():as");
    }

    public final nld m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        nld a2 = a(3);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        a2.b = i2;
        ((nld[]) this.l.o)[i2] = a2;
        return a2;
    }

    public final void o() {
        int i2 = this.d * 2;
        this.d = i2;
        this.f = (as[]) Arrays.copyOf(this.f, i2);
        jg8 jg8 = this.l;
        jg8.o = (nld[]) Arrays.copyOf((nld[]) jg8.o, this.d);
        int i3 = this.d;
        this.h = new boolean[i3];
        this.e = i3;
        this.k = i3;
    }

    public final void p() {
        v3b v3b = this.c;
        if (v3b.e()) {
            i();
        } else if (this.g) {
            for (int i2 = 0; i2 < this.j; i2++) {
                if (!this.f[i2].e) {
                    q(v3b);
                    return;
                }
            }
            i();
        } else {
            q(v3b);
        }
    }

    public final void q(as asVar) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.j) {
                break;
            }
            as asVar2 = this.f[i2];
            int i3 = 1;
            if (asVar2.a.A0 != 1) {
                float f2 = 0.0f;
                if (asVar2.b < 0.0f) {
                    boolean z = false;
                    int i4 = 0;
                    while (!z) {
                        i4 += i3;
                        float f3 = Float.MAX_VALUE;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < this.j) {
                            as asVar3 = this.f[i7];
                            if (asVar3.a.A0 != i3 && !asVar3.e && asVar3.b < f2) {
                                int f4 = asVar3.d.f();
                                int i9 = 0;
                                while (i9 < f4) {
                                    nld g2 = asVar3.d.g(i9);
                                    float e2 = asVar3.d.e(g2);
                                    if (e2 > f2) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f5 = g2.Z[i10] / e2;
                                            if ((f5 < f3 && i10 == i8) || i10 > i8) {
                                                i8 = i10;
                                                i6 = g2.b;
                                                i5 = i7;
                                                f3 = f5;
                                            }
                                        }
                                    }
                                    i9++;
                                    f2 = 0.0f;
                                }
                            }
                            i7++;
                            f2 = 0.0f;
                            i3 = 1;
                        }
                        if (i5 != -1) {
                            as asVar4 = this.f[i5];
                            asVar4.a.c = -1;
                            asVar4.g(((nld[]) this.l.o)[i6]);
                            nld nld = asVar4.a;
                            nld.c = i5;
                            nld.e(this, asVar4);
                        } else {
                            z = true;
                        }
                        if (i4 > this.i / 2) {
                            z = true;
                        }
                        f2 = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        r(asVar);
        i();
    }

    public final void r(as asVar) {
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 < this.i * 2) {
                nld nld = asVar.a;
                if (nld != null) {
                    this.h[nld.b] = true;
                }
                nld d2 = asVar.d(this.h);
                if (d2 != null) {
                    boolean[] zArr = this.h;
                    int i4 = d2.b;
                    if (!zArr[i4]) {
                        zArr[i4] = true;
                    } else {
                        return;
                    }
                }
                if (d2 != null) {
                    float f2 = Float.MAX_VALUE;
                    int i5 = -1;
                    for (int i6 = 0; i6 < this.j; i6++) {
                        as asVar2 = this.f[i6];
                        if (asVar2.a.A0 != 1 && !asVar2.e && asVar2.d.c(d2)) {
                            float e2 = asVar2.d.e(d2);
                            if (e2 < 0.0f) {
                                float f3 = (-asVar2.b) / e2;
                                if (f3 < f2) {
                                    i5 = i6;
                                    f2 = f3;
                                }
                            }
                        }
                    }
                    if (i5 > -1) {
                        as asVar3 = this.f[i5];
                        asVar3.a.c = -1;
                        asVar3.g(d2);
                        nld nld2 = asVar3.a;
                        nld2.c = i5;
                        nld2.e(this, asVar3);
                    }
                } else {
                    z = true;
                }
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i2 = 0; i2 < this.j; i2++) {
            as asVar = this.f[i2];
            if (asVar != null) {
                ((o0b) this.l.c).a(asVar);
            }
            this.f[i2] = null;
        }
    }

    public final void t() {
        jg8 jg8;
        int i2 = 0;
        while (true) {
            jg8 = this.l;
            nld[] nldArr = (nld[]) jg8.o;
            if (i2 >= nldArr.length) {
                break;
            }
            nld nld = nldArr[i2];
            if (nld != null) {
                nld.c();
            }
            i2++;
        }
        o0b o0b = (o0b) jg8.b;
        nld[] nldArr2 = this.m;
        int i3 = this.n;
        o0b.getClass();
        if (i3 > nldArr2.length) {
            i3 = nldArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            nld nld2 = nldArr2[i4];
            int i5 = o0b.b;
            Object[] objArr = o0b.a;
            if (i5 < objArr.length) {
                objArr[i5] = nld2;
                o0b.b = i5 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((nld[]) jg8.o, (Object) null);
        this.b = 0;
        v3b v3b = this.c;
        v3b.h = 0;
        v3b.b = 0.0f;
        this.i = 1;
        for (int i6 = 0; i6 < this.j; i6++) {
            as asVar = this.f[i6];
        }
        s();
        this.j = 0;
        this.o = new as(jg8);
    }
}
