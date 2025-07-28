package defpackage;

/* renamed from: i9b  reason: default package */
public final class i9b implements j9b {
    public final n06 a;

    public i9b(n06 n06) {
        this.a = n06;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9b) && hhd.f(this.a, ((i9b) obj).a);
    }

    public final int hashCode() {
        n06 n06 = this.a;
        if (n06 == null) {
            return 0;
        }
        return n06.hashCode();
    }

    public final String toString() {
        return "ShortLinkPayload(state=" + this.a + ")";
    }
}
