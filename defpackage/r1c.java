package defpackage;

/* renamed from: r1c  reason: default package */
public final class r1c extends d8 {
    public final boolean f;

    public r1c(boolean z) {
        super(16);
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1c) && this.f == ((r1c) obj).f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("Online(online="), this.f, ")");
    }
}
