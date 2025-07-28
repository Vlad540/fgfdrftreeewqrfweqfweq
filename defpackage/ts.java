package defpackage;

/* renamed from: ts  reason: default package */
public final class ts {
    public final w2d a;
    public final fz0 b;

    public ts(w2d w2d, fz0 fz0) {
        this.a = w2d;
        this.b = fz0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts)) {
            return false;
        }
        ts tsVar = (ts) obj;
        return hhd.f(this.a, tsVar.a) && hhd.f(this.b, tsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StartAsrRecord(sessionRoomId=" + this.a + ", callAsrInfo=" + this.b + ")";
    }
}
