package defpackage;

/* renamed from: d0f  reason: default package */
public final class d0f {
    public final String a;
    public final int b;
    public final int c;
    public final float d;
    public final boolean e;
    public final int f;

    public d0f(String str, int i, int i2, float f2, boolean z, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = f2;
        this.e = z;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0f)) {
            return false;
        }
        d0f d0f = (d0f) obj;
        return hhd.f(this.a, d0f.a) && this.b == d0f.b && this.c == d0f.c && Float.compare(this.d, d0f.d) == 0 && this.e == d0f.e && this.f == d0f.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + th2.f(th2.e(c3d.d(this.c, c3d.d(this.b, this.a.hashCode() * 31, 31), 31), this.d, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pattern(image=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", opacity=");
        sb.append(this.d);
        sb.append(", isOverlay=");
        sb.append(this.e);
        sb.append(", color=");
        return wn6.j(sb, this.f, ")");
    }
}
