package defpackage;

/* renamed from: kh  reason: default package */
public final class kh extends mh {
    public final String a;

    public kh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh) && hhd.f(this.a, ((kh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("Path(value="), this.a, ")");
    }
}
