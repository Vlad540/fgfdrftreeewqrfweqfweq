package defpackage;

/* renamed from: i7e  reason: default package */
public final class i7e {
    public final z63 a;

    public i7e(a73 a73) {
        this.a = a73;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7e) && hhd.f(this.a, ((i7e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncFlushSignal(completableDeferred=" + this.a + ")";
    }
}
