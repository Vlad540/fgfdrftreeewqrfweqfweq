package defpackage;

/* renamed from: ib  reason: default package */
public final class ib implements kb {
    public final boolean a;

    public ib(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib) && this.a == ((ib) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("DisableScreenRecord(isRemoved="), this.a, ")");
    }
}
