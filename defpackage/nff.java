package defpackage;

/* renamed from: nff  reason: default package */
public final class nff {
    public static final mff Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ nff(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        bm3.I(i, 7, lff.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nff)) {
            return false;
        }
        nff nff = (nff) obj;
        return hhd.f(this.a, nff.a) && hhd.f(this.b, nff.b) && hhd.f(this.c, nff.c);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int d = me4.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return d + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryAccessRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", reason=");
        return wn6.l(sb, this.c, ")");
    }
}
