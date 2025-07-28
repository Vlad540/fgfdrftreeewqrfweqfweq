package defpackage;

/* renamed from: nnf  reason: default package */
public final class nnf {
    public static final mnf Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ nnf(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        bm3.I(i, 3, lnf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnf)) {
            return false;
        }
        nnf nnf = (nnf) obj;
        return hhd.f(this.a, nnf.a) && hhd.f(this.b, nnf.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageClearRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        return wn6.l(sb, this.b, ")");
    }
}
