package defpackage;

/* renamed from: aze  reason: default package */
public final class aze implements pg7 {
    public final mge a;
    public final ub0 b;
    public final String c;
    public final le1 o;

    public aze(lge lge, ub0 ub0, String str, le1 le1) {
        this.a = lge;
        this.b = ub0;
        this.c = str;
        this.o = le1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aze)) {
            return false;
        }
        aze aze = (aze) obj;
        return hhd.f(this.a, aze.a) && hhd.f(this.b, aze.b) && hhd.f(this.c, aze.c) && hhd.f(this.o, aze.o);
    }

    public final long getItemId() {
        return this.o.a;
    }

    public final int hashCode() {
        return this.o.hashCode() + me4.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final int l() {
        return o1a.K0;
    }

    public final String toString() {
        return "UserInWaitingData(name=" + this.a + ", avatarAbbreviationModel=" + this.b + ", url=" + this.c + ", participantId=" + this.o + ")";
    }
}
