package defpackage;

/* renamed from: ch6  reason: default package */
public final class ch6 extends dh6 {
    public final String a;

    public ch6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch6) && hhd.f(this.a, ((ch6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("Time(time="), this.a, ")");
    }
}
