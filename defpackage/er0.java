package defpackage;

/* renamed from: er0  reason: default package */
public final class er0 {
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
    public final int l;
    public final int m;
    public final int n;

    public er0(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
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
        this.l = i13;
        this.m = i14;
        this.n = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0 = (er0) obj;
        er0.getClass();
        return this.a == er0.a && this.b == er0.b && this.c == er0.c && this.d == er0.d && this.e == er0.e && this.f == er0.f && this.g == er0.g && this.h == er0.h && this.i == er0.i && this.j == er0.j && this.k == er0.k && this.l == er0.l && this.m == er0.m && this.n == er0.n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + c3d.d(this.m, c3d.d(this.l, c3d.d(this.k, c3d.d(this.j, c3d.d(this.i, c3d.d(this.h, c3d.d(this.g, c3d.d(this.f, c3d.d(this.e, c3d.d(this.d, c3d.d(this.c, c3d.d(this.b, c3d.d(this.a, Integer.hashCode(-1685946) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleIconColors(alert=-1685946, readStatus=");
        sb.append(this.a);
        sb.append(", readStatusCapsule=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", actionSecondary=");
        sb.append(this.d);
        sb.append(", reply=");
        sb.append(this.e);
        sb.append(", iconItem=");
        sb.append(this.f);
        sb.append(", callNeutral=");
        sb.append(this.g);
        sb.append(", callNegative=");
        sb.append(this.h);
        sb.append(", replyForwarded=");
        sb.append(this.i);
        sb.append(", verificationAuthor=");
        sb.append(this.j);
        sb.append(", verificationBody=");
        sb.append(this.k);
        sb.append(", verificationForwardName=");
        sb.append(this.l);
        sb.append(", verificationReplyBody=");
        sb.append(this.m);
        sb.append(", verificationReplyName=");
        return wn6.j(sb, this.n, ")");
    }
}
