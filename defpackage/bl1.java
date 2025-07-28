package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bl1  reason: default package */
public final class bl1 extends lbe {
    public final long X;
    public final long Y;
    public final String c;
    public final long o;

    public /* synthetic */ bl1() {
        this("", 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl1)) {
            return false;
        }
        bl1 bl1 = (bl1) obj;
        return hhd.f(this.c, bl1.c) && this.o == bl1.o && this.X == bl1.X && this.Y == bl1.Y;
    }

    public final int hashCode() {
        return Long.hashCode(this.Y) + sxe.m(sxe.m(this.c.hashCode() * 31, 31, this.o), 31, this.X);
    }

    public final String toString() {
        String str = this.c;
        return wn6.k(hr1.m("Response(token=", h0e.m0(str, 0, str.length(), "*").toString(), " expiredDurationSec="), this.o, ")");
    }

    public bl1(String str, long j, long j2, long j3) {
        this.c = str;
        this.o = j;
        this.X = j2;
        this.Y = j3;
        this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - j3));
    }
}
