package defpackage;

/* renamed from: xc1  reason: default package */
public final class xc1 extends zc1 {
    public final String a;

    public xc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc1) && hhd.f(this.a, ((xc1) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("Name(name="), this.a, ")");
    }
}
