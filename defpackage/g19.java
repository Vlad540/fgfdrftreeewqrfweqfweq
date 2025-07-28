package defpackage;

/* renamed from: g19  reason: default package */
public final class g19 implements i19 {
    public final long a;
    public final String b;

    public g19(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g19)) {
            return false;
        }
        g19 g19 = (g19) obj;
        return this.a == g19.a && hhd.f(this.b, g19.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadCompleted(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wn6.l(sb, this.b, ")");
    }
}
