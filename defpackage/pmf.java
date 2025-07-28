package defpackage;

/* renamed from: pmf  reason: default package */
public final class pmf {
    public final String a;
    public final boolean b;
    public final lmf c;

    public pmf(String str, boolean z, lmf lmf) {
        this.a = str;
        this.b = z;
        this.c = lmf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmf)) {
            return false;
        }
        pmf pmf = (pmf) obj;
        return hhd.f(this.a, pmf.a) && this.b == pmf.b && hhd.f(this.c, pmf.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + th2.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WebAppRootViewState(title=" + this.a + ", isVerified=" + this.b + ", loadingState=" + this.c + ")";
    }
}
