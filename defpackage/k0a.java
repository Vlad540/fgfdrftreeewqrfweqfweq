package defpackage;

/* renamed from: k0a  reason: default package */
public final class k0a implements l0a {
    public final int a;

    public k0a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0a) && this.a == ((k0a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("Resource(iconRes="), this.a, ")");
    }
}
