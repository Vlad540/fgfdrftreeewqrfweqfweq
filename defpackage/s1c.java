package defpackage;

/* renamed from: s1c  reason: default package */
public final class s1c extends d8 {
    public final boolean f;

    public s1c(boolean z) {
        super(16);
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1c) && this.f == ((s1c) obj).f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("Verified(verified="), this.f, ")");
    }
}
