package defpackage;

import java.util.Objects;

/* renamed from: bac  reason: default package */
public final class bac implements ahc {
    public final long a;
    public final long b;

    public bac(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bac.class != obj.getClass()) {
            return false;
        }
        bac bac = (bac) obj;
        return this.a == bac.a && this.b == bac.b;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportNetworkStat{timestamp=");
        sb.append(this.a);
        sb.append(", sendBitrate=");
        return m4b.i(sb, this.b, '}');
    }
}
