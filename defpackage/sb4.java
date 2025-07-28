package defpackage;

import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: sb4  reason: default package */
public final class sb4 extends wb4 implements Comparable {
    public final int A0;
    public final boolean B0;
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final boolean w0;
    public final int x0;
    public final int y0;
    public final int z0;

    public sb4(int i, uoe uoe, int i2, nb4 nb4, int i3, String str) {
        super(i, uoe, i2);
        int i4;
        int i5 = 0;
        this.Y = qi0.o(i3, false);
        int i6 = this.o.e & (~nb4.v);
        this.Z = (i6 & 1) != 0;
        this.w0 = (i6 & 2) != 0;
        ws6 ws6 = nb4.t;
        ws6 n = ws6.isEmpty() ? ws6.n(BuildConfig.FLAVOR) : ws6;
        int i7 = 0;
        while (true) {
            if (i7 >= n.size()) {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = bc4.e(this.o, (String) n.get(i7), nb4.w);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.x0 = i7;
        this.y0 = i4;
        int c = bc4.c(this.o.f, nb4.u);
        this.z0 = c;
        this.B0 = (this.o.f & 1088) != 0;
        int e = bc4.e(this.o, str, bc4.h(str) == null);
        this.A0 = e;
        boolean z = i4 > 0 || (ws6.isEmpty() && c > 0) || this.Z || (this.w0 && e > 0);
        if (qi0.o(i3, nb4.t0) && z) {
            i5 = 1;
        }
        this.X = i5;
    }

    public final int a() {
        return this.X;
    }

    public final /* bridge */ /* synthetic */ boolean b(wb4 wb4) {
        sb4 sb4 = (sb4) wb4;
        return false;
    }

    /* renamed from: c */
    public final int compareTo(sb4 sb4) {
        g63 d = g63.a.d(this.Y, sb4.Y);
        Integer valueOf = Integer.valueOf(this.x0);
        Integer valueOf2 = Integer.valueOf(sb4.x0);
        kga kga = og9.a;
        kga.getClass();
        kga kga2 = xcc.a;
        g63 c = d.c(valueOf, valueOf2, kga2);
        int i = this.y0;
        g63 a = c.a(i, sb4.y0);
        int i2 = this.z0;
        g63 d2 = a.a(i2, sb4.z0).d(this.Z, sb4.Z);
        Boolean valueOf3 = Boolean.valueOf(this.w0);
        Boolean valueOf4 = Boolean.valueOf(sb4.w0);
        if (i != 0) {
            kga = kga2;
        }
        g63 a2 = d2.c(valueOf3, valueOf4, kga).a(this.A0, sb4.A0);
        if (i2 == 0) {
            a2 = a2.e(this.B0, sb4.B0);
        }
        return a2.f();
    }
}
