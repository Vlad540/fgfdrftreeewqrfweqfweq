package defpackage;

/* renamed from: l1f  reason: default package */
public final class l1f extends lrf {
    public se4 k;
    public lj0 l;

    public final void a(pe4 pe4) {
        int i;
        float f;
        float f2;
        float f3;
        if (hr1.t(this.j) != 3) {
            ch4 ch4 = this.e;
            if (ch4.c && !ch4.j && this.d == 3) {
                ff3 ff3 = this.b;
                int i2 = ff3.s;
                if (i2 == 2) {
                    ff3 ff32 = ff3.T;
                    if (ff32 != null) {
                        ch4 ch42 = ff32.e.e;
                        if (ch42.j) {
                            ch4.d((int) ((((float) ch42.g) * ff3.z) + 0.5f));
                        }
                    }
                } else if (i2 == 3) {
                    ch4 ch43 = ff3.d.e;
                    if (ch43.j) {
                        int i3 = ff3.X;
                        if (i3 == -1) {
                            f = (float) ch43.g;
                            f2 = ff3.W;
                        } else if (i3 == 0) {
                            f3 = ((float) ch43.g) * ff3.W;
                            i = (int) (f3 + 0.5f);
                            ch4.d(i);
                        } else if (i3 != 1) {
                            i = 0;
                            ch4.d(i);
                        } else {
                            f = (float) ch43.g;
                            f2 = ff3.W;
                        }
                        f3 = f / f2;
                        i = (int) (f3 + 0.5f);
                        ch4.d(i);
                    }
                }
            }
            se4 se4 = this.h;
            if (se4.c) {
                se4 se42 = this.i;
                if (se42.c) {
                    if (!se4.j || !se42.j || !ch4.j) {
                        if (!ch4.j && this.d == 3) {
                            ff3 ff33 = this.b;
                            if (ff33.r == 0 && !ff33.y()) {
                                int i4 = ((se4) se4.l.get(0)).g + se4.f;
                                int i5 = ((se4) se42.l.get(0)).g + se42.f;
                                se4.d(i4);
                                se42.d(i5);
                                ch4.d(i5 - i4);
                                return;
                            }
                        }
                        if (!ch4.j && this.d == 3 && this.a == 1 && se4.l.size() > 0 && se42.l.size() > 0) {
                            int i6 = (((se4) se42.l.get(0)).g + se42.f) - (((se4) se4.l.get(0)).g + se4.f);
                            int i7 = ch4.m;
                            if (i6 < i7) {
                                ch4.d(i6);
                            } else {
                                ch4.d(i7);
                            }
                        }
                        if (ch4.j && se4.l.size() > 0 && se42.l.size() > 0) {
                            se4 se43 = (se4) se4.l.get(0);
                            se4 se44 = (se4) se42.l.get(0);
                            int i8 = se43.g;
                            int i9 = se4.f + i8;
                            int i10 = se44.g;
                            int i11 = se42.f + i10;
                            float f4 = this.b.e0;
                            if (se43 == se44) {
                                f4 = 0.5f;
                            } else {
                                i8 = i9;
                                i10 = i11;
                            }
                            se4.d((int) ((((float) ((i10 - i8) - ch4.g)) * f4) + ((float) i8) + 0.5f));
                            se42.d(se4.g + ch4.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ff3 ff34 = this.b;
        l(ff34.J, ff34.L, 1);
    }

    /* JADX WARNING: type inference failed for: r0v114, types: [lj0, ch4] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r0 = r14.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r14 = this;
            ff3 r0 = r14.b
            boolean r1 = r0.a
            ch4 r2 = r14.e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.k()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.j
            se4 r1 = r14.i
            se4 r3 = r14.h
            r4 = 3
            r5 = 1
            r6 = 4
            if (r0 != 0) goto L_0x0084
            ff3 r0 = r14.b
            int[] r7 = r0.p0
            r7 = r7[r5]
            r14.d = r7
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x002d
            lj0 r0 = new lj0
            r0.<init>(r14)
            r14.l = r0
        L_0x002d:
            int r0 = r14.d
            if (r0 == r4) goto L_0x00b2
            if (r0 != r6) goto L_0x0078
            ff3 r7 = r14.b
            ff3 r7 = r7.T
            if (r7 == 0) goto L_0x0078
            int[] r8 = r7.p0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x0078
            int r0 = r7.k()
            ff3 r4 = r14.b
            me3 r4 = r4.J
            int r4 = r4.e()
            int r0 = r0 - r4
            ff3 r4 = r14.b
            me3 r4 = r4.L
            int r4 = r4.e()
            int r0 = r0 - r4
            l1f r4 = r7.e
            se4 r4 = r4.h
            ff3 r5 = r14.b
            me3 r5 = r5.J
            int r5 = r5.e()
            defpackage.lrf.b(r3, r4, r5)
            l1f r3 = r7.e
            se4 r3 = r3.i
            ff3 r14 = r14.b
            me3 r14 = r14.L
            int r14 = r14.e()
            int r14 = -r14
            defpackage.lrf.b(r1, r3, r14)
            r2.d(r0)
            return
        L_0x0078:
            if (r0 != r5) goto L_0x00b2
            ff3 r0 = r14.b
            int r0 = r0.k()
            r2.d(r0)
            goto L_0x00b2
        L_0x0084:
            int r0 = r14.d
            if (r0 != r6) goto L_0x00b2
            ff3 r0 = r14.b
            ff3 r7 = r0.T
            if (r7 == 0) goto L_0x00b2
            int[] r8 = r7.p0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x00b2
            l1f r2 = r7.e
            se4 r2 = r2.h
            me3 r0 = r0.J
            int r0 = r0.e()
            defpackage.lrf.b(r3, r2, r0)
            l1f r0 = r7.e
            se4 r0 = r0.i
            ff3 r14 = r14.b
            me3 r14 = r14.L
            int r14 = r14.e()
            int r14 = -r14
            defpackage.lrf.b(r1, r0, r14)
            return
        L_0x00b2:
            boolean r0 = r2.j
            se4 r7 = r14.k
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x01d6
            ff3 r10 = r14.b
            boolean r11 = r10.a
            if (r11 == 0) goto L_0x01d6
            me3[] r0 = r10.Q
            r11 = r0[r9]
            me3 r12 = r11.f
            if (r12 == 0) goto L_0x0132
            r13 = r0[r4]
            me3 r13 = r13.f
            if (r13 == 0) goto L_0x0132
            boolean r0 = r10.y()
            if (r0 == 0) goto L_0x00ee
            ff3 r0 = r14.b
            me3[] r0 = r0.Q
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f = r0
            ff3 r0 = r14.b
            me3[] r0 = r0.Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f = r0
            goto L_0x0125
        L_0x00ee:
            ff3 r0 = r14.b
            me3[] r0 = r0.Q
            r0 = r0[r9]
            se4 r0 = defpackage.lrf.h(r0)
            if (r0 == 0) goto L_0x0107
            ff3 r2 = r14.b
            me3[] r2 = r2.Q
            r2 = r2[r9]
            int r2 = r2.e()
            defpackage.lrf.b(r3, r0, r2)
        L_0x0107:
            ff3 r0 = r14.b
            me3[] r0 = r0.Q
            r0 = r0[r4]
            se4 r0 = defpackage.lrf.h(r0)
            if (r0 == 0) goto L_0x0121
            ff3 r2 = r14.b
            me3[] r2 = r2.Q
            r2 = r2[r4]
            int r2 = r2.e()
            int r2 = -r2
            defpackage.lrf.b(r1, r0, r2)
        L_0x0121:
            r3.b = r5
            r1.b = r5
        L_0x0125:
            ff3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.lrf.b(r7, r3, r14)
            goto L_0x036c
        L_0x0132:
            if (r12 == 0) goto L_0x0159
            se4 r0 = defpackage.lrf.h(r11)
            if (r0 == 0) goto L_0x036c
            ff3 r4 = r14.b
            me3[] r4 = r4.Q
            r4 = r4[r9]
            int r4 = r4.e()
            defpackage.lrf.b(r3, r0, r4)
            int r0 = r2.g
            defpackage.lrf.b(r1, r3, r0)
            ff3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.lrf.b(r7, r3, r14)
            goto L_0x036c
        L_0x0159:
            r5 = r0[r4]
            me3 r9 = r5.f
            if (r9 == 0) goto L_0x0186
            se4 r0 = defpackage.lrf.h(r5)
            if (r0 == 0) goto L_0x0179
            ff3 r5 = r14.b
            me3[] r5 = r5.Q
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            defpackage.lrf.b(r1, r0, r4)
            int r0 = r2.g
            int r0 = -r0
            defpackage.lrf.b(r3, r1, r0)
        L_0x0179:
            ff3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.lrf.b(r7, r3, r14)
            goto L_0x036c
        L_0x0186:
            r0 = r0[r6]
            me3 r4 = r0.f
            if (r4 == 0) goto L_0x01a4
            se4 r0 = defpackage.lrf.h(r0)
            if (r0 == 0) goto L_0x036c
            defpackage.lrf.b(r7, r0, r8)
            ff3 r14 = r14.b
            int r14 = r14.a0
            int r14 = -r14
            defpackage.lrf.b(r3, r7, r14)
            int r14 = r2.g
            defpackage.lrf.b(r1, r3, r14)
            goto L_0x036c
        L_0x01a4:
            boolean r0 = r10 instanceof defpackage.qf6
            if (r0 != 0) goto L_0x036c
            ff3 r0 = r10.T
            if (r0 == 0) goto L_0x036c
            r0 = 7
            me3 r0 = r10.i(r0)
            me3 r0 = r0.f
            if (r0 != 0) goto L_0x036c
            ff3 r0 = r14.b
            ff3 r4 = r0.T
            l1f r4 = r4.e
            se4 r4 = r4.h
            int r0 = r0.s()
            defpackage.lrf.b(r3, r4, r0)
            int r0 = r2.g
            defpackage.lrf.b(r1, r3, r0)
            ff3 r14 = r14.b
            boolean r0 = r14.E
            if (r0 == 0) goto L_0x036c
            int r14 = r14.a0
            defpackage.lrf.b(r7, r3, r14)
            goto L_0x036c
        L_0x01d6:
            if (r0 != 0) goto L_0x022d
            int r0 = r14.d
            if (r0 != r4) goto L_0x022d
            ff3 r0 = r14.b
            int r10 = r0.s
            if (r10 == r9) goto L_0x020d
            if (r10 == r4) goto L_0x01e5
            goto L_0x0230
        L_0x01e5:
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x0230
            ff3 r0 = r14.b
            int r10 = r0.r
            if (r10 != r4) goto L_0x01f2
            goto L_0x0230
        L_0x01f2:
            ak6 r0 = r0.d
            ch4 r0 = r0.e
            java.util.ArrayList r10 = r2.l
            r10.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r5
            java.util.ArrayList r0 = r2.k
            r0.add(r3)
            java.util.ArrayList r0 = r2.k
            r0.add(r1)
            goto L_0x0230
        L_0x020d:
            ff3 r0 = r0.T
            if (r0 != 0) goto L_0x0212
            goto L_0x0230
        L_0x0212:
            l1f r0 = r0.e
            ch4 r0 = r0.e
            java.util.ArrayList r10 = r2.l
            r10.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r5
            java.util.ArrayList r0 = r2.k
            r0.add(r3)
            java.util.ArrayList r0 = r2.k
            r0.add(r1)
            goto L_0x0230
        L_0x022d:
            r2.b(r14)
        L_0x0230:
            ff3 r0 = r14.b
            me3[] r10 = r0.Q
            r11 = r10[r9]
            me3 r12 = r11.f
            if (r12 == 0) goto L_0x028d
            r13 = r10[r4]
            me3 r13 = r13.f
            if (r13 == 0) goto L_0x028d
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0260
            ff3 r0 = r14.b
            me3[] r0 = r0.Q
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f = r0
            ff3 r0 = r14.b
            me3[] r0 = r0.Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f = r0
            goto L_0x0280
        L_0x0260:
            ff3 r0 = r14.b
            me3[] r0 = r0.Q
            r0 = r0[r9]
            se4 r0 = defpackage.lrf.h(r0)
            ff3 r1 = r14.b
            me3[] r1 = r1.Q
            r1 = r1[r4]
            se4 r1 = defpackage.lrf.h(r1)
            if (r0 == 0) goto L_0x0279
            r0.b(r14)
        L_0x0279:
            if (r1 == 0) goto L_0x027e
            r1.b(r14)
        L_0x027e:
            r14.j = r6
        L_0x0280:
            ff3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0362
            lj0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
            goto L_0x0362
        L_0x028d:
            r13 = 0
            if (r12 == 0) goto L_0x02d9
            se4 r0 = defpackage.lrf.h(r11)
            if (r0 == 0) goto L_0x0362
            ff3 r6 = r14.b
            me3[] r6 = r6.Q
            r6 = r6[r9]
            int r6 = r6.e()
            defpackage.lrf.b(r3, r0, r6)
            r14.c(r1, r3, r5, r2)
            ff3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x02b1
            lj0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
        L_0x02b1:
            int r0 = r14.d
            if (r0 != r4) goto L_0x0362
            ff3 r0 = r14.b
            float r1 = r0.W
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0362
            ak6 r0 = r0.d
            int r1 = r0.d
            if (r1 != r4) goto L_0x0362
            ch4 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            java.util.ArrayList r0 = r2.l
            ff3 r1 = r14.b
            ak6 r1 = r1.d
            ch4 r1 = r1.e
            r0.add(r1)
            r2.a = r14
            goto L_0x0362
        L_0x02d9:
            r9 = r10[r4]
            me3 r11 = r9.f
            r12 = -1
            if (r11 == 0) goto L_0x0303
            se4 r0 = defpackage.lrf.h(r9)
            if (r0 == 0) goto L_0x0362
            ff3 r6 = r14.b
            me3[] r6 = r6.Q
            r4 = r6[r4]
            int r4 = r4.e()
            int r4 = -r4
            defpackage.lrf.b(r1, r0, r4)
            r14.c(r3, r1, r12, r2)
            ff3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0362
            lj0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
            goto L_0x0362
        L_0x0303:
            r6 = r10[r6]
            me3 r9 = r6.f
            if (r9 == 0) goto L_0x031b
            se4 r0 = defpackage.lrf.h(r6)
            if (r0 == 0) goto L_0x0362
            defpackage.lrf.b(r7, r0, r8)
            lj0 r0 = r14.l
            r14.c(r3, r7, r12, r0)
            r14.c(r1, r3, r5, r2)
            goto L_0x0362
        L_0x031b:
            boolean r6 = r0 instanceof defpackage.qf6
            if (r6 != 0) goto L_0x0362
            ff3 r6 = r0.T
            if (r6 == 0) goto L_0x0362
            l1f r6 = r6.e
            se4 r6 = r6.h
            int r0 = r0.s()
            defpackage.lrf.b(r3, r6, r0)
            r14.c(r1, r3, r5, r2)
            ff3 r0 = r14.b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x033c
            lj0 r0 = r14.l
            r14.c(r7, r3, r5, r0)
        L_0x033c:
            int r0 = r14.d
            if (r0 != r4) goto L_0x0362
            ff3 r0 = r14.b
            float r1 = r0.W
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0362
            ak6 r0 = r0.d
            int r1 = r0.d
            if (r1 != r4) goto L_0x0362
            ch4 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            java.util.ArrayList r0 = r2.l
            ff3 r1 = r14.b
            ak6 r1 = r1.d
            ch4 r1 = r1.e
            r0.add(r1)
            r2.a = r14
        L_0x0362:
            java.util.ArrayList r14 = r2.l
            int r14 = r14.size()
            if (r14 != 0) goto L_0x036c
            r2.c = r5
        L_0x036c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1f.d():void");
    }

    public final void e() {
        se4 se4 = this.h;
        if (se4.j) {
            this.b.Z = se4.g;
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        se4 se4 = this.h;
        se4.c();
        se4.j = false;
        se4 se42 = this.i;
        se42.c();
        se42.j = false;
        se4 se43 = this.k;
        se43.c();
        se43.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
