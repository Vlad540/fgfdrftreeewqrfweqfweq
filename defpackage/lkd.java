package defpackage;

/* renamed from: lkd  reason: default package */
public final class lkd implements nkd {
    public final so7 a;

    public lkd(so7 so7) {
        this.a = so7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkd) && hhd.f(this.a, ((lkd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
