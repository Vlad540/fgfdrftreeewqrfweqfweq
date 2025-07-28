package defpackage;

/* renamed from: h9b  reason: default package */
public final class h9b implements j9b {
    public final r33 a;

    public h9b(r33 r33) {
        this.a = r33;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9b) && hhd.f(this.a, ((h9b) obj).a);
    }

    public final int hashCode() {
        r33 r33 = this.a;
        if (r33 == null) {
            return 0;
        }
        return r33.a.hashCode();
    }

    public final String toString() {
        return "LastNamePayload(errorText=" + this.a + ")";
    }
}
