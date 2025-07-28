package defpackage;

/* renamed from: aoc  reason: default package */
public final class aoc {
    public final long a;
    public final String b;
    public final le1 c;
    public final long d;
    public final int e;

    public aoc(long j, String str, le1 le1, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = le1;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoc)) {
            return false;
        }
        aoc aoc = (aoc) obj;
        return this.a == aoc.a && hhd.f(this.b, aoc.b) && hhd.f(this.c, aoc.c) && this.d == aoc.d && this.e == aoc.e;
    }

    public final int hashCode() {
        return hr1.t(this.e) + sxe.m((this.c.hashCode() + me4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenRecordBroadcastData(id=");
        sb.append(this.a);
        sb.append(", streamId=");
        sb.append(this.b);
        sb.append(", initiatorId=");
        sb.append(this.c);
        sb.append(", startTimeMs=");
        sb.append(this.d);
        sb.append(", recordType=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "RECORD" : "STREAM" : "NOTHING");
        sb.append(")");
        return sb.toString();
    }
}
