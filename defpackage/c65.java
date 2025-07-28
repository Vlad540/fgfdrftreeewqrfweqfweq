package defpackage;

/* renamed from: c65  reason: default package */
public final class c65 extends sg9 {
    public final String b;

    public c65(String str) {
        super(jue.a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c65) && hhd.f(this.b, ((c65) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("ExternalCallback(params="), this.b, ")");
    }
}
