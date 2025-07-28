package defpackage;

/* renamed from: ah6  reason: default package */
public final class ah6 extends dh6 {
    public final boolean a;

    public ah6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah6) && this.a == ((ah6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("Missing(isMissing="), this.a, ")");
    }
}
