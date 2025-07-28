package defpackage;

/* renamed from: t90  reason: default package */
public final class t90 {
    public final String a;
    public final long b;
    public final long c;

    public t90(long j, String str, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t90)) {
            return false;
        }
        t90 t90 = (t90) obj;
        return this.a.equals(t90.a) && this.b == t90.b && this.c == t90.c;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return wn6.k(sb, this.c, "}");
    }
}
