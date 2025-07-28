package defpackage;

/* renamed from: gk6  reason: default package */
public final class gk6 implements ik6 {
    public final String a;

    public gk6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk6) && hhd.f(this.a, ((gk6) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("CustomMode(host="), this.a, ")");
    }
}
