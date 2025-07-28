package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: gy7  reason: default package */
public final class gy7 implements Comparable {
    public final String X;
    public final long Y;
    public final String a;
    public final long b;
    public final long c;
    public final TimeUnit o;

    public gy7(String str, long j, long j2, TimeUnit timeUnit, String str2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.o = timeUnit;
        this.X = str2;
        this.Y = j3;
    }

    public final int compareTo(Object obj) {
        gy7 gy7 = (gy7) obj;
        TimeUnit timeUnit = this.o;
        long nanos = timeUnit.toNanos(this.c);
        long j = gy7.c;
        TimeUnit timeUnit2 = gy7.o;
        int p = hhd.p(timeUnit.toNanos(this.b) + nanos, timeUnit2.toNanos(gy7.b) + timeUnit2.toNanos(j));
        Integer valueOf = Integer.valueOf(p);
        if (p == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.a.compareTo(gy7.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy7)) {
            return false;
        }
        gy7 gy7 = (gy7) obj;
        return hhd.f(this.a, gy7.a) && this.b == gy7.b && this.c == gy7.c && this.o == gy7.o && hhd.f(this.X, gy7.X) && this.Y == gy7.Y;
    }

    public final int hashCode() {
        return Long.hashCode(this.Y) + me4.d((this.o.hashCode() + sxe.m(sxe.m(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.X);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Measurement(taskName=");
        sb.append(this.a);
        sb.append(", dependencyDuration=");
        sb.append(this.b);
        sb.append(", executionDuration=");
        sb.append(this.c);
        sb.append(", unit=");
        sb.append(this.o);
        sb.append(", threadName=");
        sb.append(this.X);
        sb.append(", startTime=");
        return wn6.k(sb, this.Y, ")");
    }
}
