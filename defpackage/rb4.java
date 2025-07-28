package defpackage;

import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: rb4  reason: default package */
public final class rb4 extends vb4 implements Comparable {
    public final int A0;
    public final boolean B0;
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final boolean w0;
    public final int x0;
    public final int y0;
    public final int z0;

    public rb4(int i, toe toe, int i2, mb4 mb4, int i3, String str) {
        super(i, toe, i2);
        int i4;
        int i5 = 0;
        this.Y = ac4.d(i3, false);
        int i6 = this.o.o & (~mb4.O0);
        this.Z = (i6 & 1) != 0;
        this.w0 = (i6 & 2) != 0;
        ws6 ws6 = mb4.H0;
        ws6 n = ws6.isEmpty() ? ws6.n(BuildConfig.FLAVOR) : ws6;
        int i7 = 0;
        while (true) {
            if (i7 >= n.size()) {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = ac4.c(this.o, (String) n.get(i7), mb4.J0);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.x0 = i7;
        this.y0 = i4;
        int a = ac4.a(this.o.X, mb4.I0);
        this.z0 = a;
        this.B0 = (this.o.X & 1088) != 0;
        int c = ac4.c(this.o, str, ac4.f(str) == null);
        this.A0 = c;
        boolean z = i4 > 0 || (ws6.isEmpty() && a > 0) || this.Z || (this.w0 && c > 0);
        if (ac4.d(i3, mb4.Y0) && z) {
            i5 = 1;
        }
        this.X = i5;
    }

    public final int a() {
        return this.X;
    }

    public final /* bridge */ /* synthetic */ boolean b(vb4 vb4) {
        rb4 rb4 = (rb4) vb4;
        return false;
    }

    /* renamed from: c */
    public final int compareTo(rb4 rb4) {
        g63 d = g63.a.d(this.Y, rb4.Y);
        Integer valueOf = Integer.valueOf(this.x0);
        Integer valueOf2 = Integer.valueOf(rb4.x0);
        kga kga = og9.a;
        kga.getClass();
        kga kga2 = xcc.a;
        g63 c = d.c(valueOf, valueOf2, kga2);
        int i = this.y0;
        g63 a = c.a(i, rb4.y0);
        int i2 = this.z0;
        g63 d2 = a.a(i2, rb4.z0).d(this.Z, rb4.Z);
        Boolean valueOf3 = Boolean.valueOf(this.w0);
        Boolean valueOf4 = Boolean.valueOf(rb4.w0);
        if (i != 0) {
            kga = kga2;
        }
        g63 a2 = d2.c(valueOf3, valueOf4, kga).a(this.A0, rb4.A0);
        if (i2 == 0) {
            a2 = a2.e(this.B0, rb4.B0);
        }
        return a2.f();
    }
}
