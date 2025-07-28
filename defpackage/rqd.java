package defpackage;

/* renamed from: rqd  reason: default package */
public final class rqd {
    public final long a;
    public final int b;
    public final ln7 c;
    public final boolean d;

    public rqd(int i, long j, ln7 ln7, boolean z) {
        this.a = j;
        this.b = i;
        this.c = ln7;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqd)) {
            return false;
        }
        rqd rqd = (rqd) obj;
        return this.a == rqd.a && this.b == rqd.b && hhd.f(this.c, rqd.c) && this.d == rqd.d;
    }

    public final int hashCode() {
        int h = us8.h(this.b, Long.hashCode(this.a) * 31, 31);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + h) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatEntity(id=");
        sb.append(this.a);
        sb.append(", status=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "SENDING" : "WAITING");
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", isCritical=");
        return hr1.j(sb, this.d, ")");
    }
}
