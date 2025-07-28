package defpackage;

/* renamed from: pif  reason: default package */
public final class pif {
    public static final oif Companion = new Object();
    public final String a;
    public final boolean b;

    public /* synthetic */ pif(String str, int i, boolean z) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = z;
            return;
        }
        bm3.I(i, 3, nif.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pif)) {
            return false;
        }
        pif pif = (pif) obj;
        return hhd.f(this.a, pif.a) && this.b == pif.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppBiometryUnavailableResponse(requestId=" + this.a + ", available=" + this.b + ")";
    }

    public pif(String str) {
        this.a = str;
        this.b = false;
    }
}
