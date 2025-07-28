package defpackage;

/* renamed from: web  reason: default package */
public final class web extends cfb {
    public final mge a;
    public final u16 b;

    public web(mge mge, u16 u16) {
        this.a = mge;
        this.b = u16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof web)) {
            return false;
        }
        web web = (web) obj;
        return hhd.f(this.a, web.a) && hhd.f(this.b, web.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAbortionSnackbar(titleRes=" + this.a + ", abortAction=" + this.b + ")";
    }
}
