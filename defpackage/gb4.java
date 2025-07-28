package defpackage;

/* renamed from: gb4  reason: default package */
public final class gb4 extends vb4 implements Comparable {
    public final int A0;
    public final boolean B0;
    public final int C0;
    public final int D0;
    public final boolean E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final boolean J0;
    public final boolean K0;
    public final int X;
    public final boolean Y;
    public final String Z = ac4.f(this.o.c);
    public final mb4 w0;
    public final boolean x0;
    public final int y0;
    public final int z0;

    public gb4(int i, toe toe, int i2, mb4 mb4, int i3, boolean z) {
        super(i, toe, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.w0 = mb4;
        int i7 = 0;
        this.x0 = ac4.d(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= mb4.C0.size()) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            i5 = ac4.c(this.o, (String) mb4.C0.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.z0 = i8;
        this.y0 = i5;
        this.A0 = ac4.a(this.o.X, mb4.D0);
        vu5 vu5 = this.o;
        int i9 = vu5.X;
        this.B0 = i9 == 0 || (i9 & 1) != 0;
        this.E0 = (vu5.o & 1) != 0;
        int i10 = vu5.N0;
        this.F0 = i10;
        this.G0 = vu5.O0;
        int i11 = vu5.w0;
        this.H0 = i11;
        this.Y = (i11 == -1 || i11 <= mb4.F0) && (i10 == -1 || i10 <= mb4.E0);
        String[] y = mze.y();
        int i12 = 0;
        while (true) {
            if (i12 >= y.length) {
                i6 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            }
            i6 = ac4.c(this.o, y[i12], false);
            if (i6 > 0) {
                break;
            }
            i12++;
        }
        this.C0 = i12;
        this.D0 = i6;
        int i13 = 0;
        while (true) {
            ws6 ws6 = mb4.G0;
            if (i13 < ws6.size()) {
                String str = this.o.A0;
                if (str != null && str.equals(ws6.get(i13))) {
                    i4 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        this.I0 = i4;
        this.J0 = pi0.h(i3) == 128;
        this.K0 = pi0.i(i3) == 64;
        mb4 mb42 = this.w0;
        if (ac4.d(i3, mb42.Y0) && ((z2 = this.Y) || mb42.T0)) {
            i7 = (!ac4.d(i3, false) || !z2 || this.o.w0 == -1 || mb42.L0 || mb42.K0 || (!mb42.a1 && z)) ? 1 : 2;
        }
        this.X = i7;
    }

    public final int a() {
        return this.X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r1 = r4.O0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = r7.J0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r4.N0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = r4.A0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.vb4 r7) {
        /*
            r6 = this;
            gb4 r7 = (defpackage.gb4) r7
            mb4 r0 = r6.w0
            boolean r1 = r0.W0
            vu5 r2 = r7.o
            r3 = -1
            vu5 r4 = r6.o
            if (r1 != 0) goto L_0x0015
            int r1 = r4.N0
            if (r1 == r3) goto L_0x0042
            int r5 = r2.N0
            if (r1 != r5) goto L_0x0042
        L_0x0015:
            boolean r1 = r0.U0
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r4.A0
            if (r1 == 0) goto L_0x0042
            java.lang.String r5 = r2.A0
            boolean r1 = android.text.TextUtils.equals(r1, r5)
            if (r1 == 0) goto L_0x0042
        L_0x0025:
            boolean r1 = r0.V0
            if (r1 != 0) goto L_0x0031
            int r1 = r4.O0
            if (r1 == r3) goto L_0x0042
            int r2 = r2.O0
            if (r1 != r2) goto L_0x0042
        L_0x0031:
            boolean r0 = r0.X0
            if (r0 != 0) goto L_0x0044
            boolean r0 = r7.J0
            boolean r1 = r6.J0
            if (r1 != r0) goto L_0x0042
            boolean r6 = r6.K0
            boolean r7 = r7.K0
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb4.b(vb4):boolean");
    }

    /* renamed from: c */
    public final int compareTo(gb4 gb4) {
        boolean z = this.x0;
        boolean z2 = this.Y;
        kga b = (!z2 || !z) ? ac4.f.b() : ac4.f;
        g63 d = g63.a.d(z, gb4.x0);
        Integer valueOf = Integer.valueOf(this.z0);
        Integer valueOf2 = Integer.valueOf(gb4.z0);
        og9.a.getClass();
        xcc xcc = xcc.a;
        g63 c = d.c(valueOf, valueOf2, xcc).a(this.y0, gb4.y0).a(this.A0, gb4.A0).d(this.E0, gb4.E0).d(this.B0, gb4.B0).c(Integer.valueOf(this.C0), Integer.valueOf(gb4.C0), xcc).a(this.D0, gb4.D0).d(z2, gb4.Y).c(Integer.valueOf(this.I0), Integer.valueOf(gb4.I0), xcc);
        int i = this.H0;
        Integer valueOf3 = Integer.valueOf(i);
        int i2 = gb4.H0;
        g63 c2 = c.c(valueOf3, Integer.valueOf(i2), this.w0.K0 ? ac4.f.b() : ac4.g).d(this.J0, gb4.J0).d(this.K0, gb4.K0).c(Integer.valueOf(this.F0), Integer.valueOf(gb4.F0), b).c(Integer.valueOf(this.G0), Integer.valueOf(gb4.G0), b);
        Integer valueOf4 = Integer.valueOf(i);
        Integer valueOf5 = Integer.valueOf(i2);
        if (!mze.a(this.Z, gb4.Z)) {
            b = ac4.g;
        }
        return c2.c(valueOf4, valueOf5, b).f();
    }
}
