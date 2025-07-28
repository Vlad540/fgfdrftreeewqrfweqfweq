package defpackage;

/* renamed from: k62  reason: default package */
public final class k62 {
    public final String a;
    public final long b;
    public final long c;

    public k62(long j, String str, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k62.class != obj.getClass()) {
            return false;
        }
        k62 k62 = (k62) obj;
        if (this.b != k62.b || this.c != k62.c) {
            return false;
        }
        String str = k62.a;
        String str2 = this.a;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        long j2 = this.c;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMessage{text='");
        sb.append(h2g.s(this.a));
        sb.append("', time=");
        sb.append(this.b);
        sb.append(", id=");
        return m4b.i(sb, this.c, '}');
    }
}
