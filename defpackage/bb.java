package defpackage;

/* renamed from: bb  reason: default package */
public final class bb implements kb {
    public final boolean a;

    public bb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb) && this.a == ((bb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("DisableAllMicOnce(isSuccess="), this.a, ")");
    }
}
