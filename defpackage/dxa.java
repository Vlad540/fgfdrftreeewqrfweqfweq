package defpackage;

/* renamed from: dxa  reason: default package */
public final class dxa implements fxa {
    public final String a;
    public final long b;
    public final int c;

    public dxa(long j, String str, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxa)) {
            return false;
        }
        dxa dxa = (dxa) obj;
        return hhd.f(this.a, dxa.a) && this.b == dxa.b && this.c == dxa.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + sxe.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroAvatar(url=");
        sb.append(this.a);
        sb.append(", photoId=");
        sb.append(this.b);
        sb.append(", categoryId=");
        return wn6.j(sb, this.c, ")");
    }
}
