package defpackage;

/* renamed from: u80  reason: default package */
public final class u80 {
    public final int a;
    public final Throwable b;

    public u80(Throwable th, int i) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80 = (u80) obj;
        if (this.a == u80.a) {
            Throwable th = u80.b;
            Throwable th2 = this.b;
            if (th2 == null) {
                if (th == null) {
                    return true;
                }
            } else if (th2.equals(th)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        return (th == null ? 0 : th.hashCode()) ^ i;
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
