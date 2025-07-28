package defpackage;

/* renamed from: ds7  reason: default package */
public final class ds7 {
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public ds7(String str, long j, long j2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds7)) {
            return false;
        }
        ds7 ds7 = (ds7) obj;
        return hhd.f(this.a, ds7.a) && this.b == ds7.b && this.c == ds7.c && this.d == ds7.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + sxe.m(sxe.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LooperMessage(message=");
        sb.append(this.a);
        sb.append(", startTime=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", messageQueueSize=");
        return wn6.k(sb, this.d, ")");
    }
}
