package defpackage;

/* renamed from: c6b  reason: default package */
public final class c6b extends g6b {
    public final mge b;

    public c6b(jge jge) {
        this.b = jge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6b) && hhd.f(this.b, ((c6b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ShareLinkToChat(text="), this.b, ")");
    }
}
