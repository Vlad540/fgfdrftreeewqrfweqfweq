package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: pa0  reason: default package */
public final class pa0 {
    public final eye a;
    public final Map b;

    public pa0(eye eye, HashMap hashMap) {
        this.a = eye;
        this.b = hashMap;
    }

    public final long a(t3b t3b, long j, int i) {
        long a2 = j - this.a.a();
        qa0 qa0 = (qa0) this.b.get(t3b);
        long j2 = qa0.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i2) * ((double) j2) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j2 > 1 ? j2 : 2) * ((long) i2))))), a2), qa0.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0)) {
            return false;
        }
        pa0 pa0 = (pa0) obj;
        return this.a.equals(pa0.a) && this.b.equals(pa0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
