package defpackage;

/* renamed from: yn6  reason: default package */
public final class yn6 {
    public final do6 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public yn6(do6 do6, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = do6;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn6)) {
            return false;
        }
        yn6 yn6 = (yn6) obj;
        return hhd.f(this.a, yn6.a) && this.b == yn6.b && this.c == yn6.c && this.d == yn6.d && this.e == yn6.e && this.f == yn6.f && this.g == yn6.g && this.h == yn6.h && this.i == yn6.i;
    }

    public final int hashCode() {
        return Integer.hashCode(-16745729) + c3d.d(this.i, c3d.d(this.h, c3d.d(this.g, c3d.d(-15987442, c3d.d(this.f, c3d.d(this.e, c3d.d(this.d, c3d.d(this.c, c3d.d(-1, c3d.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconColors(local=");
        sb.append(this.a);
        sb.append(", contrast=");
        sb.append(this.b);
        sb.append(", contrastStatic=-1, negative=");
        sb.append(this.c);
        sb.append(", neutralThemed=");
        sb.append(this.d);
        sb.append(", positive=");
        sb.append(this.e);
        sb.append(", primary=");
        sb.append(this.f);
        sb.append(", primaryStatic=-15987442, quaternary=");
        sb.append(this.g);
        sb.append(", secondary=");
        sb.append(this.h);
        sb.append(", tertiary=");
        return wn6.j(sb, this.i, ", themed=-16745729)");
    }
}
