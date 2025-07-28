package defpackage;

/* renamed from: qme  reason: default package */
public final class qme {
    public final pme a;
    public final tme b;
    public final rme c;
    public final sme d;

    public qme(pme pme, tme tme, rme rme, sme sme) {
        this.a = pme;
        this.b = tme;
        this.c = rme;
        this.d = sme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qme)) {
            return false;
        }
        qme qme = (qme) obj;
        return hhd.f(this.a, qme.a) && hhd.f(this.b, qme.b) && hhd.f(this.c, qme.c) && hhd.f(this.d, qme.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TopbarColors(background=" + this.a + ", text=" + this.b + ", icon=" + this.c + ", stroke=" + this.d + ")";
    }
}
