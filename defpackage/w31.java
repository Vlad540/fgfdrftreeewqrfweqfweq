package defpackage;

/* renamed from: w31  reason: default package */
public final class w31 implements d41 {
    public final qd7 a;

    public w31(qd7 qd7) {
        this.a = qd7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w31) && hhd.f(this.a, ((w31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LinkInfo(info=" + this.a + ")";
    }
}
