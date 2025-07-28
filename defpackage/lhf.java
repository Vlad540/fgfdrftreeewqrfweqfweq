package defpackage;

/* renamed from: lhf  reason: default package */
public final class lhf {
    public static final khf Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ lhf(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        bm3.I(i, 3, jhf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhf)) {
            return false;
        }
        lhf lhf = (lhf) obj;
        return hhd.f(this.a, lhf.a) && hhd.f(this.b, lhf.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryGetInfoRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        return wn6.l(sb, this.b, ")");
    }
}
