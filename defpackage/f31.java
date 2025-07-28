package defpackage;

import java.util.Objects;

/* renamed from: f31  reason: default package */
public final class f31 {
    public final xm1 a;
    public final o3f b;

    public f31(xm1 xm1, o3f o3f) {
        this.a = xm1;
        this.b = o3f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f31.class != obj.getClass()) {
            return false;
        }
        f31 f31 = (f31) obj;
        return this.a.equals(f31.a) && this.b.equals(f31.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "DisplayLayoutItem{videoTrackParticipantKey=" + this.a + ", layout=" + this.b + '}';
    }
}
