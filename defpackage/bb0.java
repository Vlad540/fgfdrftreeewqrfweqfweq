package defpackage;

import android.view.Surface;

/* renamed from: bb0  reason: default package */
public final class bb0 {
    public final int a;
    public final Surface b;

    public bb0(int i, Surface surface) {
        this.a = i;
        if (surface != null) {
            this.b = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bb0)) {
            return false;
        }
        bb0 bb0 = (bb0) obj;
        return this.a == bb0.a && this.b.equals(bb0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.a + ", surface=" + this.b + "}";
    }
}
