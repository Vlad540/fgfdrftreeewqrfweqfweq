package defpackage;

/* renamed from: rt3  reason: default package */
public final class rt3 implements tt3 {
    public final mge a;

    public rt3(mge mge) {
        this.a = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt3) && hhd.f(this.a, ((rt3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("Failed(message="), this.a, ")");
    }
}
