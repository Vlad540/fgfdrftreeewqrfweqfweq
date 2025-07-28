package defpackage;

/* renamed from: q80  reason: default package */
public final class q80 {
    public final int a;
    public final long b;

    public q80(int i, long j) {
        if (i != 0) {
            this.a = i;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q80)) {
            return false;
        }
        q80 q80 = (q80) obj;
        return hr1.c(this.a, q80.a) && this.b == q80.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((hr1.t(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return wn6.k(sb, this.b, "}");
    }
}
