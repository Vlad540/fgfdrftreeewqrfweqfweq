package defpackage;

/* renamed from: cb  reason: default package */
public final class cb implements kb {
    public final boolean a;

    public cb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb) && this.a == ((cb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("DisableAllRaiseHandsOnce(isSuccess="), this.a, ")");
    }
}
