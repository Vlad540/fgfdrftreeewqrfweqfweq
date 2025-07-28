package defpackage;

/* renamed from: yfd  reason: default package */
public final class yfd {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public yfd(xfd xfd) {
        this.a = xfd.a;
        this.b = xfd.b;
        this.c = xfd.c;
        this.e = xfd.e;
        this.d = xfd.d;
        this.f = xfd.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yfd.class != obj.getClass()) {
            return false;
        }
        yfd yfd = (yfd) obj;
        if (this.a == yfd.a && this.b == yfd.b && this.c == yfd.c && this.d == yfd.d && this.f == yfd.f) {
            return this.e == yfd.e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a ? 1 : 0) * true) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }
}
