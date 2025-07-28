package defpackage;

/* renamed from: hra  reason: default package */
public final class hra {
    public final boolean a;

    public hra(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hra) && this.a == ((hra) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("OnlineStatus(isOnline="), this.a, ")");
    }
}
