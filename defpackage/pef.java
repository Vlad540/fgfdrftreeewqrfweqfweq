package defpackage;

import java.util.List;

/* renamed from: pef  reason: default package */
public final class pef {
    public final String a;
    public final long b;
    public final long c;
    public final Thread d;
    public final List e;

    public pef(String str, long j, long j2, Thread thread, List list) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = thread;
        this.e = list;
    }

    public static pef a(pef pef, long j, Thread thread, int i) {
        if ((i & 4) != 0) {
            j = pef.c;
        }
        return new pef(pef.a, pef.b, j, thread, pef.e);
    }

    public final long b(long j) {
        long j2 = this.b;
        long j3 = this.c;
        if (zp4.d(j3, j2)) {
            j3 = j;
        }
        return zp4.g(j, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pef)) {
            return false;
        }
        pef pef = (pef) obj;
        return hhd.f(this.a, pef.a) && zp4.d(this.b, pef.b) && zp4.d(this.c, pef.c) && hhd.f(this.d, pef.d) && hhd.f(this.e, pef.e);
    }

    public final int hashCode() {
        int i = zp4.o;
        int m = sxe.m(sxe.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Thread thread = this.d;
        return this.e.hashCode() + ((m + (thread == null ? 0 : thread.hashCode())) * 31);
    }

    public final String toString() {
        String j = zp4.j(this.b);
        String j2 = zp4.j(this.c);
        StringBuilder sb = new StringBuilder("WatchdogTask(submitThread=");
        sb.append(this.a);
        sb.append(", submitTime=");
        sb.append(j);
        sb.append(", startTime=");
        sb.append(j2);
        sb.append(", runningThread=");
        sb.append(this.d);
        sb.append(", stacktrace=");
        return hr1.i(sb, this.e, ")");
    }
}
