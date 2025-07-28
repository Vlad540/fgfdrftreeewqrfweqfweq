package defpackage;

/* renamed from: tg8  reason: default package */
public final class tg8 implements ug8 {
    public final dm7 a;
    public final float b;
    public final long c;

    public tg8(dm7 dm7, float f, long j) {
        this.a = dm7;
        this.b = f;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg8)) {
            return false;
        }
        tg8 tg8 = (tg8) obj;
        return hhd.f(this.a, tg8.a) && Float.compare(this.b, tg8.b) == 0 && this.c == tg8.c;
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
