package defpackage;

/* renamed from: st3  reason: default package */
public final class st3 implements tt3 {
    public final mge a;

    public st3(mge mge) {
        this.a = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof st3) && hhd.f(this.a, ((st3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("Success(message="), this.a, ")");
    }
}
