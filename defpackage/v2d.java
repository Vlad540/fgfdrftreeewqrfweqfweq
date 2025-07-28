package defpackage;

/* renamed from: v2d  reason: default package */
public final class v2d implements w2d {
    public final int a;

    public v2d(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2d) && this.a == ((v2d) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("Room(id="), this.a, ")");
    }
}
