package defpackage;

/* renamed from: ah7  reason: default package */
public final class ah7 {
    public final Float a;
    public final boolean b;

    public ah7(Float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah7)) {
            return false;
        }
        ah7 ah7 = (ah7) obj;
        return hhd.f(this.a, ah7.a) && this.b == ah7.b;
    }

    public final int hashCode() {
        Float f = this.a;
        return Boolean.hashCode(this.b) + ((f == null ? 0 : f.hashCode()) * 31);
    }

    public final String toString() {
        return "ListeningState(progress=" + this.a + ", isPlaying=" + this.b + ")";
    }
}
