package defpackage;

import java.util.List;

/* renamed from: qma  reason: default package */
public final class qma {
    public final List a;
    public final long b;

    public qma(long j, List list) {
        this.a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qma)) {
            return false;
        }
        qma qma = (qma) obj;
        return hhd.f(this.a, qma.a) && this.b == qma.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PerfSpansPreparedForEvent(spans=" + this.a + ", totalDuration=" + this.b + ")";
    }
}
