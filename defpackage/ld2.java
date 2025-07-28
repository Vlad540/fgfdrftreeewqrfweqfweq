package defpackage;

/* renamed from: ld2  reason: default package */
public final class ld2 extends qd2 {
    public final String b;

    public ld2(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld2) && hhd.f(this.b, ((ld2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("OpenLink(attachUrl="), this.b, ")");
    }
}
