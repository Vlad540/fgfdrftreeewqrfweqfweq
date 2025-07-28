package defpackage;

/* renamed from: nd0  reason: default package */
public final class nd0 {
    public final md0 a;
    public final td0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public nd0(md0 md0, td0 td0, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = md0;
        this.b = td0;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd0)) {
            return false;
        }
        nd0 nd0 = (nd0) obj;
        return hhd.f(this.a, nd0.a) && hhd.f(this.b, nd0.b) && this.c == nd0.c && this.d == nd0.d && this.e == nd0.e && this.f == nd0.f && this.g == nd0.g && this.h == nd0.h && this.i == nd0.i && this.j == nd0.j && this.k == nd0.k;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + c3d.d(this.k, c3d.d(this.j, c3d.d(this.i, c3d.d(this.h, c3d.d(this.g, c3d.d(this.f, c3d.d(this.e, c3d.d(-1728053248, c3d.d(this.d, c3d.d(this.c, c3d.d(-1184014, c3d.d(-1, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundColors(accent=");
        sb.append(this.a);
        sb.append(", local=");
        sb.append(this.b);
        sb.append(", contrastFloating=-1, contrastFloatingSecondary=-1184014, neutralFloating=");
        sb.append(this.c);
        sb.append(", overlay=");
        sb.append(this.d);
        sb.append(", overlaySecondary=-1728053248, overlayStatic=");
        sb.append(this.e);
        sb.append(", surfaceCard=");
        sb.append(this.f);
        sb.append(", surfaceFloating=");
        sb.append(this.g);
        sb.append(", surfaceGround=");
        sb.append(this.h);
        sb.append(", surfacePrimary=");
        sb.append(this.i);
        sb.append(", surfaceSecondary=");
        sb.append(this.j);
        sb.append(", surfaceTertiary=");
        return wn6.j(sb, this.k, ", transparent=0)");
    }
}
