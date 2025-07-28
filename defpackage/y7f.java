package defpackage;

/* renamed from: y7f  reason: default package */
public final class y7f implements hhc {
    public final x7f a;

    public y7f(x7f x7f) {
        this.a = x7f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7f) && hhd.f(this.a, ((y7f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoQualityUpdateNotification(videoQuality=" + this.a + ")";
    }
}
