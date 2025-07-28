package defpackage;

/* renamed from: za  reason: default package */
public final class za implements kb {
    public final boolean a;

    public za(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za) && this.a == ((za) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("DisableAllCamerasOnce(isSuccess="), this.a, ")");
    }
}
