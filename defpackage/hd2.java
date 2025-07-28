package defpackage;

/* renamed from: hd2  reason: default package */
public final class hd2 extends qd2 {
    public final String b;

    public hd2(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd2) && hhd.f(this.b, ((hd2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("CopyLink(link="), this.b, ")");
    }
}
