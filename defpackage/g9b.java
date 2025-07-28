package defpackage;

/* renamed from: g9b  reason: default package */
public final class g9b implements j9b {
    public final r33 a;

    public g9b(r33 r33) {
        this.a = r33;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9b) && hhd.f(this.a, ((g9b) obj).a);
    }

    public final int hashCode() {
        r33 r33 = this.a;
        if (r33 == null) {
            return 0;
        }
        return r33.a.hashCode();
    }

    public final String toString() {
        return "FirstNamePayload(errorText=" + this.a + ")";
    }
}
