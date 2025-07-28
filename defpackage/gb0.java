package defpackage;

/* renamed from: gb0  reason: default package */
public final class gb0 {
    public final String a;
    public final long b;
    public final int c;

    public gb0(long j, String str, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static jn a() {
        jn jnVar = new jn(0, 2);
        jnVar.o = 0L;
        return jnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gb0)) {
            return false;
        }
        gb0 gb0 = (gb0) obj;
        String str = this.a;
        if (str != null ? str.equals(gb0.a) : gb0.a == null) {
            if (this.b == gb0.b) {
                int i = gb0.c;
                int i2 = this.c;
                if (i2 == 0) {
                    if (i == 0) {
                        return true;
                    }
                } else if (hr1.c(i2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i3 = this.c;
        if (i3 != 0) {
            i = hr1.t(i3);
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
