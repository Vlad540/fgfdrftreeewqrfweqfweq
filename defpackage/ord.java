package defpackage;

/* renamed from: ord  reason: default package */
public final class ord {
    public final nrd a;
    public final prd b;
    public final qrd c;

    public ord(nrd nrd, prd prd, qrd qrd) {
        this.a = nrd;
        this.b = prd;
        this.c = qrd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ord)) {
            return false;
        }
        ord ord = (ord) obj;
        return hhd.f(this.a, ord.a) && hhd.f(this.b, ord.b) && hhd.f(this.c, ord.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StatesColors(background=" + this.a + ", icon=" + this.b + ", text=" + this.c + ")";
    }
}
