package defpackage;

/* renamed from: q91  reason: default package */
public final class q91 extends r91 {
    public final hze a;

    public q91(hze hze) {
        this.a = hze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q91) && hhd.f(this.a, ((q91) obj).a);
    }

    public final int hashCode() {
        hze hze = this.a;
        if (hze == null) {
            return 0;
        }
        return hze.hashCode();
    }

    public final String toString() {
        return "VideoState(participant=" + this.a + ")";
    }
}
