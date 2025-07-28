package defpackage;

/* renamed from: lrf  reason: default package */
public abstract class lrf implements pe4 {
    public int a;
    public ff3 b;
    public hic c;
    public int d;
    public final ch4 e = new ch4(this);
    public int f = 0;
    public boolean g = false;
    public final se4 h = new se4(this);
    public final se4 i = new se4(this);
    public int j = 1;

    public lrf(ff3 ff3) {
        this.b = ff3;
    }

    public static void b(se4 se4, se4 se42, int i2) {
        se4.l.add(se42);
        se4.f = i2;
        se42.k.add(se4);
    }

    public static se4 h(me3 me3) {
        me3 me32 = me3.f;
        if (me32 == null) {
            return null;
        }
        int t = hr1.t(me32.e);
        ff3 ff3 = me32.d;
        if (t == 1) {
            return ff3.d.h;
        }
        if (t == 2) {
            return ff3.e.h;
        }
        if (t == 3) {
            return ff3.d.i;
        }
        if (t == 4) {
            return ff3.e.i;
        }
        if (t != 5) {
            return null;
        }
        return ff3.e.k;
    }

    public static se4 i(me3 me3, int i2) {
        me3 me32 = me3.f;
        if (me32 == null) {
            return null;
        }
        ff3 ff3 = me32.d;
        lrf lrf = i2 == 0 ? ff3.d : ff3.e;
        int t = hr1.t(me32.e);
        if (t == 1 || t == 2) {
            return lrf.h;
        }
        if (t == 3 || t == 4) {
            return lrf.i;
        }
        return null;
    }

    public final void c(se4 se4, se4 se42, int i2, ch4 ch4) {
        se4.l.add(se42);
        se4.l.add(this.e);
        se4.h = i2;
        se4.i = ch4;
        se42.k.add(se4);
        ch4.k.add(se4);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            ff3 ff3 = this.b;
            int i5 = ff3.v;
            i4 = Math.max(ff3.u, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            ff3 ff32 = this.b;
            int i6 = ff32.y;
            int max = Math.max(ff32.x, i2);
            if (i6 > 0) {
                max = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    public long j() {
        ch4 ch4 = this.e;
        if (ch4.j) {
            return (long) ch4.g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.a == 3) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.me3 r12, defpackage.me3 r13, int r14) {
        /*
            r11 = this;
            se4 r0 = h(r12)
            se4 r1 = h(r13)
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x00e7
            boolean r2 = r1.j
            if (r2 != 0) goto L_0x0012
            goto L_0x00e7
        L_0x0012:
            int r2 = r0.g
            int r12 = r12.e()
            int r12 = r12 + r2
            int r2 = r1.g
            int r13 = r13.e()
            int r2 = r2 - r13
            int r13 = r2 - r12
            ch4 r3 = r11.e
            boolean r4 = r3.j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b0
            int r4 = r11.d
            r6 = 3
            if (r4 != r6) goto L_0x00b0
            int r4 = r11.a
            if (r4 == 0) goto L_0x00a9
            r7 = 1
            if (r4 == r7) goto L_0x009b
            r8 = 2
            if (r4 == r8) goto L_0x0073
            if (r4 == r6) goto L_0x003d
            goto L_0x00b0
        L_0x003d:
            ff3 r4 = r11.b
            ak6 r8 = r4.d
            int r9 = r8.d
            if (r9 != r6) goto L_0x0054
            int r9 = r8.a
            if (r9 != r6) goto L_0x0054
            l1f r9 = r4.e
            int r10 = r9.d
            if (r10 != r6) goto L_0x0054
            int r9 = r9.a
            if (r9 != r6) goto L_0x0054
            goto L_0x00b0
        L_0x0054:
            if (r14 != 0) goto L_0x0058
            l1f r8 = r4.e
        L_0x0058:
            ch4 r6 = r8.e
            boolean r8 = r6.j
            if (r8 == 0) goto L_0x00b0
            float r4 = r4.W
            if (r14 != r7) goto L_0x0069
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x006f
        L_0x0069:
            int r6 = r6.g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x006f:
            r3.d(r4)
            goto L_0x00b0
        L_0x0073:
            ff3 r4 = r11.b
            ff3 r6 = r4.T
            if (r6 == 0) goto L_0x00b0
            if (r14 != 0) goto L_0x007e
            ak6 r6 = r6.d
            goto L_0x0080
        L_0x007e:
            l1f r6 = r6.e
        L_0x0080:
            ch4 r6 = r6.e
            boolean r7 = r6.j
            if (r7 == 0) goto L_0x00b0
            if (r14 != 0) goto L_0x008b
            float r4 = r4.w
            goto L_0x008d
        L_0x008b:
            float r4 = r4.z
        L_0x008d:
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r11.g(r4, r14)
            r3.d(r4)
            goto L_0x00b0
        L_0x009b:
            int r4 = r3.m
            int r4 = r11.g(r4, r14)
            int r4 = java.lang.Math.min(r4, r13)
            r3.d(r4)
            goto L_0x00b0
        L_0x00a9:
            int r4 = r11.g(r13, r14)
            r3.d(r4)
        L_0x00b0:
            boolean r4 = r3.j
            if (r4 != 0) goto L_0x00b5
            return
        L_0x00b5:
            int r4 = r3.g
            se4 r6 = r11.i
            se4 r7 = r11.h
            if (r4 != r13) goto L_0x00c4
            r7.d(r12)
            r6.d(r2)
            return
        L_0x00c4:
            ff3 r11 = r11.b
            if (r14 != 0) goto L_0x00cb
            float r11 = r11.d0
            goto L_0x00cd
        L_0x00cb:
            float r11 = r11.e0
        L_0x00cd:
            if (r0 != r1) goto L_0x00d4
            int r12 = r0.g
            int r2 = r1.g
            r11 = r5
        L_0x00d4:
            int r2 = r2 - r12
            int r2 = r2 - r4
            float r12 = (float) r12
            float r12 = r12 + r5
            float r13 = (float) r2
            float r13 = r13 * r11
            float r13 = r13 + r12
            int r11 = (int) r13
            r7.d(r11)
            int r11 = r7.g
            int r12 = r3.g
            int r11 = r11 + r12
            r6.d(r11)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrf.l(me3, me3, int):void");
    }
}
