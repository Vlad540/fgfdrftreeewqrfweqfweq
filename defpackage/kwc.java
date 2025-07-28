package defpackage;

/* renamed from: kwc  reason: default package */
public final class kwc {
    public final jwc a;
    public final fxa b;

    public kwc(jwc jwc, fxa fxa) {
        this.a = jwc;
        this.b = fxa;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwc)) {
            return false;
        }
        kwc kwc = (kwc) obj;
        return hhd.f(this.a, kwc.a) && hhd.f(this.b, kwc.b);
    }

    public final int hashCode() {
        jwc jwc = this.a;
        return this.b.hashCode() + ((jwc == null ? 0 : jwc.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectedAvatarInfo(avatar=" + this.a + ", placeholder=" + this.b + ")";
    }
}
