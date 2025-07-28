package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: v69  reason: default package */
public final class v69 extends gt0 {
    public final long h;
    public final TimeUnit i;

    public v69(long j, TimeUnit timeUnit) {
        this.h = j;
        this.i = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v69)) {
            return false;
        }
        v69 v69 = (v69) obj;
        return this.h == v69.h && this.i == v69.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + (Long.hashCode(this.h) * 31);
    }

    public final String toString() {
        return "Value(value=" + this.h + ", timeUnit=" + this.i + ")";
    }
}
