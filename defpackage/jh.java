package defpackage;

/* renamed from: jh  reason: default package */
public final class jh extends mh {
    public final int a;

    public jh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh) && this.a == ((jh) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("IntNumber(value="), this.a, ")");
    }
}
