package defpackage;

/* renamed from: uv3  reason: default package */
public final class uv3 implements vv3 {
    public final long a;
    public final long b;

    public uv3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv3)) {
            return false;
        }
        uv3 uv3 = (uv3) obj;
        return this.a == uv3.a && this.b == uv3.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(requestId=");
        sb.append(this.a);
        sb.append(", chatId=");
        return wn6.k(sb, this.b, ")");
    }
}
