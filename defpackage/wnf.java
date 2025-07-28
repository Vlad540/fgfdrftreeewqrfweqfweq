package defpackage;

/* renamed from: wnf  reason: default package */
public final class wnf {
    public static final vnf Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ wnf(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        bm3.I(i, 7, unf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnf)) {
            return false;
        }
        wnf wnf = (wnf) obj;
        return hhd.f(this.a, wnf.a) && hhd.f(this.b, wnf.b) && hhd.f(this.c, wnf.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + me4.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageGetKeyRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", key=");
        return wn6.l(sb, this.c, ")");
    }
}
