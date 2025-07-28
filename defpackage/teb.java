package defpackage;

/* renamed from: teb  reason: default package */
public final class teb extends cfb {
    public final mge a;

    public teb(jge jge) {
        this.a = jge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof teb) && hhd.f(this.a, ((teb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ExternalShareChannelLink(text="), this.a, ")");
    }
}
