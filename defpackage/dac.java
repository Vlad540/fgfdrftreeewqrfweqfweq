package defpackage;

import java.util.Objects;

/* renamed from: dac  reason: default package */
public final class dac implements ahc {
    public final long a;
    public final long b;

    public dac(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dac.class != obj.getClass()) {
            return false;
        }
        dac dac = (dac) obj;
        return this.a == dac.a && this.b == dac.b;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportPerfStatCommand{framesReceived=");
        sb.append(this.a);
        sb.append(", framesDecoded=");
        return m4b.i(sb, this.b, '}');
    }
}
