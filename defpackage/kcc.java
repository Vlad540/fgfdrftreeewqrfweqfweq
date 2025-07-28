package defpackage;

import java.io.Serializable;

/* renamed from: kcc  reason: default package */
public final class kcc implements Serializable {
    public final Throwable a;

    public kcc(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kcc) {
            if (hhd.f(this.a, ((kcc) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
