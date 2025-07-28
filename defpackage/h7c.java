package defpackage;

/* renamed from: h7c  reason: default package */
public final class h7c implements gu3 {
    public final qc9 a;

    public h7c(qc9 qc9) {
        this.a = qc9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7c) && hhd.f(this.a, ((h7c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.a + ")";
    }
}
