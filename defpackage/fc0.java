package defpackage;

/* renamed from: fc0  reason: default package */
public final class fc0 {
    public final String a;
    public final String b;
    public final d10 c;
    public final int d;

    public fc0(String str, String str2, d10 d10, int i) {
        this.a = str;
        this.b = str2;
        this.c = d10;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc0)) {
            return false;
        }
        fc0 fc0 = (fc0) obj;
        return hhd.f(this.a, fc0.a) && hhd.f(this.b, fc0.b) && hhd.f(this.c, fc0.c) && this.d == fc0.d;
    }

    public final int hashCode() {
        int d2 = me4.d(this.a.hashCode() * 31, 31, this.b);
        return hr1.t(this.d) + ((this.c.hashCode() + d2) * 31);
    }

    public final String toString() {
        return "PhotoAvatar(localCroppedUri=" + this.a + ", originalUri=" + this.b + ", relativeCrop=" + this.c + ", source=" + hr1.v(this.d) + ")";
    }
}
