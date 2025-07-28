package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: x69  reason: default package */
public final class x69 extends z69 {
    public final long a;
    public final TimeUnit b;

    public x69(long j, TimeUnit timeUnit) {
        this.a = j;
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x69)) {
            return false;
        }
        x69 x69 = (x69) obj;
        return this.a == x69.a && this.b == x69.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Defined(position=" + this.a + ", timeUnit=" + this.b + ")";
    }
}
