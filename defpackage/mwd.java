package defpackage;

/* renamed from: mwd  reason: default package */
public final class mwd {
    public final long a;
    public final String b;

    public mwd(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwd)) {
            return false;
        }
        mwd mwd = (mwd) obj;
        return this.a == mwd.a && hhd.f(this.b, mwd.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryState(marker=");
        sb.append(this.a);
        sb.append(", query=");
        return wn6.l(sb, this.b, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwd(String str, int i) {
        this(0, (i & 2) != 0 ? null : str);
    }
}
