package defpackage;

/* renamed from: nof  reason: default package */
public final class nof {
    public static final mof Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ nof(int i, String str, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            return;
        }
        bm3.I(i, 15, lof.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nof)) {
            return false;
        }
        nof nof = (nof) obj;
        return hhd.f(this.a, nof.a) && hhd.f(this.b, nof.b) && hhd.f(this.c, nof.c) && hhd.f(this.d, nof.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int d2 = me4.d(me4.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageSaveKeyRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", value=");
        return wn6.l(sb, this.d, ")");
    }
}
