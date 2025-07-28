package defpackage;

/* renamed from: jkb  reason: default package */
public final class jkb implements lkb {
    public final long a;

    public jkb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jkb) && this.a == ((jkb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ModeRecordingVideo(startTimeMs="), this.a, ")");
    }
}
