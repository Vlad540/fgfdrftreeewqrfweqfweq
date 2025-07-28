package defpackage;

/* renamed from: p57  reason: default package */
public final class p57 {
    public final String a;
    public final int b;

    public p57(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p57)) {
            return false;
        }
        p57 p57 = (p57) obj;
        return hhd.f(this.a, p57.a) && this.b == p57.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JsBridgeMethodErrorReason(title=" + this.a + ", code=" + this.b + ")";
    }
}
