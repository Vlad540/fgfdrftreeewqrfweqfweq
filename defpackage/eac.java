package defpackage;

import java.util.Objects;

/* renamed from: eac  reason: default package */
public final class eac implements khc {
    public final Integer a;

    public eac(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eac.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((eac) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "ReportPerfStatResponse{estimatedPerformanceIndex=" + this.a + '}';
    }
}
