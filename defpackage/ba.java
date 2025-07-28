package defpackage;

/* renamed from: ba  reason: default package */
public final class ba implements zw8 {
    public final ryb a;
    public final String b;
    public final long c;

    public ba(long j, ryb ryb, String str) {
        this.a = ryb;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return hhd.f(this.a, baVar.a) && hhd.f(this.b, baVar.b) && this.c == baVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + me4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddReactionEffect(reaction=");
        sb.append(this.a);
        sb.append(", effectUrl=");
        sb.append(this.b);
        sb.append(", msgId=");
        return wn6.k(sb, this.c, ")");
    }
}
