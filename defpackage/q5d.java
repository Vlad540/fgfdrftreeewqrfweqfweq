package defpackage;

/* renamed from: q5d  reason: default package */
public final class q5d implements r5d {
    public final t3d a;

    public q5d(t3d t3d) {
        this.a = t3d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5d) && hhd.f(this.a, ((q5d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionsInfo(event=" + this.a + ")";
    }
}
