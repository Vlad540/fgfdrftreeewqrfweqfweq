package defpackage;

/* renamed from: od2  reason: default package */
public final class od2 extends qd2 {
    public final String b;

    public od2(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od2) && hhd.f(this.b, ((od2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("ShareLink(link="), this.b, ")");
    }
}
