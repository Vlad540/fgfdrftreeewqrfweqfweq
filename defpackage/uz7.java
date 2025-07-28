package defpackage;

/* renamed from: uz7  reason: default package */
public final class uz7 implements wz7 {
    public final dm7 a;
    public final float b;
    public final long c;

    public uz7(dm7 dm7, float f, long j) {
        this.a = dm7;
        this.b = f;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz7)) {
            return false;
        }
        uz7 uz7 = (uz7) obj;
        return hhd.f(this.a, uz7.a) && Float.compare(this.b, uz7.b) == 0 && this.c == uz7.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + th2.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendLocation(locationData=");
        sb.append(this.a);
        sb.append(", zoom=");
        sb.append(this.b);
        sb.append(", livePeriod=");
        return wn6.k(sb, this.c, ")");
    }
}
