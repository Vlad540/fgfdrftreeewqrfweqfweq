package defpackage;

/* renamed from: rfa  reason: default package */
public final class rfa extends sg9 {
    public final long b;
    public final boolean c;

    public rfa(long j, boolean z) {
        super(jue.a);
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfa)) {
            return false;
        }
        rfa rfa = (rfa) obj;
        return this.b == rfa.b && this.c == rfa.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenOneToOneCall(opponentId=");
        sb.append(this.b);
        sb.append(", isVideo=");
        return hr1.j(sb, this.c, ")");
    }
}
