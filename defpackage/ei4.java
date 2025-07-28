package defpackage;

import java.util.List;

/* renamed from: ei4  reason: default package */
public final class ei4 {
    public final long a;
    public final String b;
    public final boolean c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public ei4(long j, String str, boolean z, hw4 hw4, boolean z2, boolean z3, int i) {
        z = (i & 4) != 0 ? false : z;
        hw4 = (i & 8) != 0 ? hw4.a : hw4;
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = hw4;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei4)) {
            return false;
        }
        ei4 ei4 = (ei4) obj;
        return this.a == ei4.a && hhd.f(this.b, ei4.b) && this.c == ei4.c && hhd.f(this.d, ei4.d) && this.e == ei4.e && this.f == ei4.f;
    }

    public final int hashCode() {
        int d2 = me4.d(Long.hashCode(this.a) * 31, 31, this.b);
        boolean z = true;
        boolean z2 = this.c;
        if (z2) {
            z2 = true;
        }
        int f2 = c3d.f(this.d, (d2 + (z2 ? 1 : 0)) * 31, 31);
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        int i = (f2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f;
        if (!z4) {
            z = z4;
        }
        return i + (z ? 1 : 0);
    }

    public final String toString() {
        return "SpaceConsumer(size=" + this.a + ", name=" + this.b + ", isDirectory=" + this.c + ", children=" + this.d + ", overflow=" + this.e + ", excluded=" + this.f + ')';
    }
}
