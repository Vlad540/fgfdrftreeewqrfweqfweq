package defpackage;

/* renamed from: oa0  reason: default package */
public final class oa0 {
    public final long a;
    public final long b;
    public final o80 c;

    public oa0(long j, long j2, o80 o80) {
        this.a = j;
        this.b = j2;
        this.c = o80;
    }

    public static oa0 a(long j, long j2, o80 o80) {
        boolean z = false;
        e07.j("duration must be positive value.", j >= 0);
        if (j2 >= 0) {
            z = true;
        }
        e07.j("bytes must be positive value.", z);
        return new oa0(j, j2, o80);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oa0)) {
            return false;
        }
        oa0 oa0 = (oa0) obj;
        return this.a == oa0.a && this.b == oa0.b && this.c.equals(oa0.c);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}
