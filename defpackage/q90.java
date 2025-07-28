package defpackage;

import android.graphics.Matrix;

/* renamed from: q90  reason: default package */
public final class q90 implements pq6 {
    public final s9e a;
    public final long b;
    public final int c;
    public final Matrix d;

    public q90(s9e s9e, long j, int i, Matrix matrix) {
        if (s9e != null) {
            this.a = s9e;
            this.b = j;
            this.c = i;
            if (matrix != null) {
                this.d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    public final void c(m25 m25) {
        m25.d(this.c);
    }

    public final s9e e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q90)) {
            return false;
        }
        q90 q90 = (q90) obj;
        return this.a.equals(q90.a) && this.b == q90.b && this.c == q90.c && this.d.equals(q90.d);
    }

    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.b;
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
