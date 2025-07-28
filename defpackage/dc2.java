package defpackage;

/* renamed from: dc2  reason: default package */
public final class dc2 implements ic2 {
    public final long a;
    public final String b;

    public dc2(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc2)) {
            return false;
        }
        dc2 dc2 = (dc2) obj;
        return this.a == dc2.a && hhd.f(this.b, dc2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadComplete(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wn6.l(sb, this.b, ")");
    }
}
