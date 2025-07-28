package defpackage;

/* renamed from: us  reason: default package */
public final class us {
    public final w2d a;

    public us(w2d w2d) {
        this.a = w2d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us) && hhd.f(this.a, ((us) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StopAsrRecord(sessionRoomId=" + this.a + ")";
    }
}
