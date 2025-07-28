package defpackage;

/* renamed from: gme  reason: default package */
public final class gme {
    public final mge a;
    public final mge b;

    public gme(jge jge, hge hge) {
        this.a = jge;
        this.b = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gme)) {
            return false;
        }
        gme gme = (gme) obj;
        return hhd.f(this.a, gme.a) && hhd.f(this.b, gme.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TooltipState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
