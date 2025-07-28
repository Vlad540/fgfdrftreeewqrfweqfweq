package defpackage;

/* renamed from: p5d  reason: default package */
public final class p5d implements r5d {
    public final r3d a;

    public p5d(r3d r3d) {
        this.a = r3d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p5d) && hhd.f(this.a, ((p5d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionsClose(event=" + this.a + ")";
    }
}
