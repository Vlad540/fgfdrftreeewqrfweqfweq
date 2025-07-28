package defpackage;

/* renamed from: mg3  reason: default package */
public final class mg3 implements ng3 {
    public final uj3 a;

    public mg3(uj3 uj3) {
        this.a = uj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mg3) && hhd.f(this.a, ((mg3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Info(info=" + this.a + ")";
    }
}
