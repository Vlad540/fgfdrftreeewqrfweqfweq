package defpackage;

/* renamed from: szb  reason: default package */
public final class szb {
    public final long a;
    public final String b;
    public final ryb c;

    public szb(long j, ryb ryb, String str) {
        this.a = j;
        this.b = str;
        this.c = ryb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szb)) {
            return false;
        }
        szb szb = (szb) obj;
        return this.a == szb.a && hhd.f(this.b, szb.b) && hhd.f(this.c, szb.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + me4.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "PlayingState(msgId=" + this.a + ", url=" + this.b + ", reaction=" + this.c + ")";
    }
}
