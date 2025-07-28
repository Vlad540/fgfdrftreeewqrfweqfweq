package defpackage;

/* renamed from: sa9  reason: default package */
public final class sa9 extends vx3 {
    public final long g;

    public sa9(long j) {
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa9) && this.g == ((sa9) obj).g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("AudioRecord(recordAudioId="), this.g, ")");
    }
}
