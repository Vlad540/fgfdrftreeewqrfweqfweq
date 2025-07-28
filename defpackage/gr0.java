package defpackage;

/* renamed from: gr0  reason: default package */
public final class gr0 {
    public final hr0 a;
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

    public gr0(hr0 hr0, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = hr0;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr0)) {
            return false;
        }
        gr0 gr0 = (gr0) obj;
        return hhd.f(this.a, gr0.a) && this.b == gr0.b && this.c == gr0.c && this.d == gr0.d && this.e == gr0.e && this.f == gr0.f && this.g == gr0.g && this.h == gr0.h && this.i == gr0.i && this.j == gr0.j && this.k == gr0.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + c3d.d(this.j, c3d.d(this.i, c3d.d(this.h, c3d.d(this.g, c3d.d(this.f, c3d.d(this.e, c3d.d(this.d, c3d.d(this.c, c3d.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleTextColors(reaction=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", actionFade=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(this.d);
        sb.append(", bodySecondary=");
        sb.append(this.e);
        sb.append(", time=");
        sb.append(this.f);
        sb.append(", author=");
        sb.append(this.g);
        sb.append(", replyName=");
        sb.append(this.h);
        sb.append(", replyBody=");
        sb.append(this.i);
        sb.append(", forwardLabel=");
        sb.append(this.j);
        sb.append(", forwardName=");
        return wn6.j(sb, this.k, ")");
    }
}
