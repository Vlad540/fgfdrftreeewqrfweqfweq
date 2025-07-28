package defpackage;

/* renamed from: r0e  reason: default package */
public final class r0e {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public r0e(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = i9;
        this.i = i10;
        this.j = i11;
        this.k = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0e)) {
            return false;
        }
        r0e r0e = (r0e) obj;
        r0e.getClass();
        return this.a == r0e.a && this.b == r0e.b && this.c == r0e.c && this.d == r0e.d && this.e == r0e.e && this.f == r0e.f && this.g == r0e.g && this.h == r0e.h && this.i == r0e.i && this.j == r0e.j && this.k == r0e.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + c3d.d(this.j, c3d.d(this.i, c3d.d(this.h, c3d.d(this.g, c3d.d(this.f, c3d.d(this.e, c3d.d(-16745729, c3d.d(this.d, c3d.d(this.c, c3d.d(this.b, c3d.d(this.a, Integer.hashCode(1308622847) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrokeColors(contrastSecondaryStatic=1308622847, contrastStatic=");
        sb.append(this.a);
        sb.append(", negative=");
        sb.append(this.b);
        sb.append(", positive=");
        sb.append(this.c);
        sb.append(", secondary=");
        sb.append(this.d);
        sb.append(", themed=-16745729, transparent=");
        sb.append(this.e);
        sb.append(", localCarverTabBar=");
        sb.append(this.f);
        sb.append(", localTabBarPrimary=");
        sb.append(this.g);
        sb.append(", localTopBarPrimary=");
        sb.append(this.h);
        sb.append(", separatorContrast=");
        sb.append(this.i);
        sb.append(", separatorPrimary=");
        sb.append(this.j);
        sb.append(", separatorSecondary=");
        return wn6.j(sb, this.k, ")");
    }
}
