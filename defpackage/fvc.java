package defpackage;

/* renamed from: fvc  reason: default package */
public final class fvc implements ivc {
    public final int a;

    public fvc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvc) && this.a == ((fvc) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("AlbumHeightChanged(height="), this.a, ")");
    }
}
