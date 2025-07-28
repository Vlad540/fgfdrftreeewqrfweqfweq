package defpackage;

/* renamed from: f9b  reason: default package */
public final class f9b implements j9b {
    public final r33 a;

    public f9b(r33 r33) {
        this.a = r33;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f9b) && hhd.f(this.a, ((f9b) obj).a);
    }

    public final int hashCode() {
        r33 r33 = this.a;
        if (r33 == null) {
            return 0;
        }
        return r33.a.hashCode();
    }

    public final String toString() {
        return "ChatNamePayload(errorText=" + this.a + ")";
    }
}
