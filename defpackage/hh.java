package defpackage;

/* renamed from: hh  reason: default package */
public final class hh extends mh {
    public final int a;

    public hh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh) && this.a == ((hh) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("Color(value="), this.a, ")");
    }
}
