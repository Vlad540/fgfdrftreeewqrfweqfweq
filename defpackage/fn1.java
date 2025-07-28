package defpackage;

/* renamed from: fn1  reason: default package */
public final class fn1 {
    public final j51 a;

    public fn1(j51 j51) {
        this.a = j51;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fn1) && hhd.f(this.a, ((fn1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Feedback(feedback=" + this.a + ")";
    }
}
