package defpackage;

/* renamed from: xvd  reason: default package */
public final class xvd {
    public final String a;
    public final long b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xvd(String str, int i) {
        this((i & 1) != 0 ? null : str, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvd)) {
            return false;
        }
        xvd xvd = (xvd) obj;
        return hhd.f(this.a, xvd.a) && this.b == xvd.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryState(query=");
        sb.append(this.a);
        sb.append(", marker=");
        return wn6.k(sb, this.b, ")");
    }

    public xvd(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
