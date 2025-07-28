package defpackage;

/* renamed from: hb4  reason: default package */
public final class hb4 extends wb4 implements Comparable {
    public final int A0;
    public final boolean B0;
    public final boolean C0;
    public final int D0;
    public final int E0;
    public final boolean F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final boolean K0;
    public final boolean L0;
    public final int X;
    public final boolean Y;
    public final String Z;
    public final nb4 w0;
    public final boolean x0;
    public final int y0;
    public final int z0;

    public hb4(int i, uoe uoe, int i2, nb4 nb4, int i3, boolean z, fb4 fb4, int i4) {
        super(i, uoe, i2);
        int i5;
        int i6;
        int i7;
        boolean z2;
        this.w0 = nb4;
        int i8 = nb4.r0 ? 24 : 16;
        int i9 = 1;
        int i10 = 0;
        this.B0 = nb4.n0 && (i4 & i8) != 0;
        this.Z = bc4.h(this.o.d);
        this.x0 = qi0.o(i3, false);
        int i11 = 0;
        while (true) {
            ws6 ws6 = nb4.n;
            i5 = Integer.MAX_VALUE;
            if (i11 >= ws6.size()) {
                i6 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            }
            i6 = bc4.e(this.o, (String) ws6.get(i11), false);
            if (i6 > 0) {
                break;
            }
            i11++;
        }
        this.z0 = i11;
        this.y0 = i6;
        this.A0 = bc4.c(this.o.f, nb4.o);
        xu5 xu5 = this.o;
        int i12 = xu5.f;
        this.C0 = i12 == 0 || (i12 & 1) != 0;
        this.F0 = (xu5.e & 1) != 0;
        int i13 = xu5.B;
        this.G0 = i13;
        this.H0 = xu5.C;
        int i14 = xu5.i;
        this.I0 = i14;
        this.Y = (i14 == -1 || i14 <= nb4.q) && (i13 == -1 || i13 <= nb4.p) && fb4.apply(xu5);
        String[] F = oze.F();
        int i15 = 0;
        while (true) {
            if (i15 >= F.length) {
                i7 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            }
            i7 = bc4.e(this.o, F[i15], false);
            if (i7 > 0) {
                break;
            }
            i15++;
        }
        this.D0 = i15;
        this.E0 = i7;
        int i16 = 0;
        while (true) {
            ws6 ws62 = nb4.r;
            if (i16 < ws62.size()) {
                String str = this.o.n;
                if (str != null && str.equals(ws62.get(i16))) {
                    i5 = i16;
                    break;
                }
                i16++;
            } else {
                break;
            }
        }
        this.J0 = i5;
        this.K0 = qi0.i(i3) == 128;
        this.L0 = qi0.j(i3) == 64;
        nb4 nb42 = this.w0;
        if (qi0.o(i3, nb42.t0) && ((z2 = this.Y) || nb42.m0)) {
            ipe ipe = nb42.s;
            int i17 = ipe.a;
            xu5 xu52 = this.o;
            if (i17 != 2 || bc4.i(nb42, i3, xu52)) {
                if (qi0.o(i3, false) && z2 && xu52.i != -1 && !nb42.z && !nb42.y && !((!nb42.v0 && z) || ipe.a == 2 || (i8 & i3) == 0)) {
                    i9 = 2;
                }
                i10 = i9;
            }
        }
        this.X = i10;
    }

    public final int a() {
        return this.X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r1 = r4.C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = r7.K0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r4.B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = r4.n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.wb4 r7) {
        /*
            r6 = this;
            hb4 r7 = (defpackage.hb4) r7
            nb4 r0 = r6.w0
            boolean r1 = r0.p0
            xu5 r2 = r7.o
            r3 = -1
            xu5 r4 = r6.o
            if (r1 != 0) goto L_0x0015
            int r1 = r4.B
            if (r1 == r3) goto L_0x0042
            int r5 = r2.B
            if (r1 != r5) goto L_0x0042
        L_0x0015:
            boolean r1 = r6.B0
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r4.n
            if (r1 == 0) goto L_0x0042
            java.lang.String r5 = r2.n
            boolean r1 = android.text.TextUtils.equals(r1, r5)
            if (r1 == 0) goto L_0x0042
        L_0x0025:
            boolean r1 = r0.o0
            if (r1 != 0) goto L_0x0031
            int r1 = r4.C
            if (r1 == r3) goto L_0x0042
            int r2 = r2.C
            if (r1 != r2) goto L_0x0042
        L_0x0031:
            boolean r0 = r0.q0
            if (r0 != 0) goto L_0x0044
            boolean r0 = r7.K0
            boolean r1 = r6.K0
            if (r1 != r0) goto L_0x0042
            boolean r6 = r6.L0
            boolean r7 = r7.L0
            if (r6 != r7) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r6 = 0
            goto L_0x0045
        L_0x0044:
            r6 = 1
        L_0x0045:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb4.b(wb4):boolean");
    }

    /* renamed from: c */
    public final int compareTo(hb4 hb4) {
        boolean z = this.x0;
        boolean z2 = this.Y;
        kga b = (!z2 || !z) ? bc4.j.b() : bc4.j;
        g63 d = g63.a.d(z, hb4.x0);
        Integer valueOf = Integer.valueOf(this.z0);
        Integer valueOf2 = Integer.valueOf(hb4.z0);
        og9.a.getClass();
        xcc xcc = xcc.a;
        g63 c = d.c(valueOf, valueOf2, xcc).a(this.y0, hb4.y0).a(this.A0, hb4.A0).d(this.F0, hb4.F0).d(this.C0, hb4.C0).c(Integer.valueOf(this.D0), Integer.valueOf(hb4.D0), xcc).a(this.E0, hb4.E0).d(z2, hb4.Y).c(Integer.valueOf(this.J0), Integer.valueOf(hb4.J0), xcc);
        boolean z3 = this.w0.y;
        int i = this.I0;
        int i2 = hb4.I0;
        if (z3) {
            c = c.c(Integer.valueOf(i), Integer.valueOf(i2), bc4.j.b());
        }
        g63 c2 = c.d(this.K0, hb4.K0).d(this.L0, hb4.L0).c(Integer.valueOf(this.G0), Integer.valueOf(hb4.G0), b).c(Integer.valueOf(this.H0), Integer.valueOf(hb4.H0), b);
        if (oze.a(this.Z, hb4.Z)) {
            c2 = c2.c(Integer.valueOf(i), Integer.valueOf(i2), b);
        }
        return c2.f();
    }
}
