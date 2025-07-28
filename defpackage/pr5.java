package defpackage;

/* renamed from: pr5  reason: default package */
public final class pr5 implements qr5 {
    public final String a;

    public pr5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr5) && hhd.f(this.a, ((pr5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("OpenUrl(url="), this.a, ")");
    }
}
