package defpackage;

import android.view.View;

/* renamed from: yqd  reason: default package */
public final class yqd {
    public final f6c a;
    public int b = -1;
    public int c = 0;
    public final View.OnAttachStateChangeListener d;

    public yqd(f6c f6c, e7c e7c) {
        this.a = f6c;
        this.d = e7c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqd)) {
            return false;
        }
        yqd yqd = (yqd) obj;
        return hhd.f(this.a, yqd.a) && this.b == yqd.b && this.c == yqd.c && hhd.f(this.d, yqd.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + c3d.d(this.c, c3d.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        return "State(adapter=" + this.a + ", firstVisible=" + i + ", offset=" + i2 + ", listener=" + this.d + ")";
    }
}
