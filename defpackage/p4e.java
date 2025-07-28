package defpackage;

import android.view.Surface;

/* renamed from: p4e  reason: default package */
public final class p4e {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;

    public p4e(Surface surface, int i, int i2, int i3) {
        oyb.c("orientationDegrees must be 0, 90, 180, or 270", i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270);
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4e)) {
            return false;
        }
        p4e p4e = (p4e) obj;
        return this.b == p4e.b && this.c == p4e.c && this.d == p4e.d && this.a.equals(p4e.a);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
