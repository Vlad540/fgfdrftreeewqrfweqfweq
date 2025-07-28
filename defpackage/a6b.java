package defpackage;

/* renamed from: a6b  reason: default package */
public final class a6b extends g6b {
    public final mge b;

    public a6b(jge jge) {
        this.b = jge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6b) && hhd.f(this.b, ((a6b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ExternalShareLink(text="), this.b, ")");
    }
}
