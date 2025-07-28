package defpackage;

/* renamed from: h19  reason: default package */
public final class h19 implements i19 {
    public final long a;
    public final String b;

    public h19(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h19)) {
            return false;
        }
        h19 h19 = (h19) obj;
        return this.a == h19.a && hhd.f(this.b, h19.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadFailed(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wn6.l(sb, this.b, ")");
    }
}
