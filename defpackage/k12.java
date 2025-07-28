package defpackage;

/* renamed from: k12  reason: default package */
public final class k12 extends l12 {
    public final Throwable a;

    public k12(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k12) {
            if (hhd.f(this.a, ((k12) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
