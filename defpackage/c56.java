package defpackage;

/* renamed from: c56  reason: default package */
public final class c56 implements e56 {
    public final int a;

    public c56(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c56) && this.a == ((c56) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("UpdateCameraLayoutParams(size="), this.a, ")");
    }
}
