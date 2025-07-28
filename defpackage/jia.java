package defpackage;

/* renamed from: jia  reason: default package */
public final class jia implements vy2 {
    public final Class a;

    public jia(Class cls) {
        this.a = cls;
    }

    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jia) {
            if (hhd.f(this.a, ((jia) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
