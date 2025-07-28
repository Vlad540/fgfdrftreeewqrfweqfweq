package defpackage;

import java.util.Set;

/* renamed from: s78  reason: default package */
public final class s78 {
    public final long a;
    public final long b;
    public final Set c;
    public final long d;

    public s78(long j, long j2, Set set, long j3) {
        this.a = j;
        this.b = j2;
        this.c = set;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s78)) {
            return false;
        }
        s78 s78 = (s78) obj;
        return this.a == s78.a && this.b == s78.b && hhd.f(this.c, s78.c) && this.d == s78.d;
    }

    public final int hashCode() {
        int m = sxe.m(Long.hashCode(this.a) * 31, 31, this.b);
        return Long.hashCode(this.d) + ((this.c.hashCode() + m) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaMarkers(backward=");
        sb.append(this.a);
        sb.append(", forward=");
        sb.append(this.b);
        sb.append(", types=");
        sb.append(this.c);
        sb.append(", chatId=");
        return wn6.k(sb, this.d, ")");
    }
}
