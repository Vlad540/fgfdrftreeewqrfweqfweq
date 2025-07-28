package defpackage;

/* renamed from: jif  reason: default package */
public final class jif {
    public static final iif Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ jif(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        bm3.I(i, 3, hif.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jif)) {
            return false;
        }
        jif jif = (jif) obj;
        return hhd.f(this.a, jif.a) && hhd.f(this.b, jif.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryOpenSettingsRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        return wn6.l(sb, this.b, ")");
    }
}
