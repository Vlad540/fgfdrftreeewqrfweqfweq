package defpackage;

/* renamed from: m3c  reason: default package */
public final class m3c implements p3c {
    public final boolean a;

    public m3c(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3c) && this.a == ((m3c) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("Pause(isForced="), this.a, ")");
    }
}
