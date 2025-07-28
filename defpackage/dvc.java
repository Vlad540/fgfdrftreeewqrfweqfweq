package defpackage;

/* renamed from: dvc  reason: default package */
public final class dvc {
    public final boolean a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvc) && this.a == ((dvc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("Close(isAnimated="), this.a, ")");
    }
}
