package defpackage;

/* renamed from: umf  reason: default package */
public final class umf {
    public final String a;
    public final stf b;

    public umf(String str, stf stf) {
        this.a = str;
        this.b = stf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umf)) {
            return false;
        }
        umf umf = (umf) obj;
        return hhd.f(this.a, umf.a) && hhd.f(this.b, umf.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        stf stf = this.b;
        return hashCode + (stf == null ? 0 : stf.hashCode());
    }

    public final String toString() {
        return "AuthBiometry(title=" + this.a + ", cryptoObject=" + this.b + ")";
    }
}
