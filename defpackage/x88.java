package defpackage;

/* renamed from: x88  reason: default package */
public final class x88 {
    public final se8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public x88(se8 se8, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = true;
        oyb.d(!z8 || z6);
        oyb.d(!z7 || z6);
        if (z5 && (z6 || z7 || z8)) {
            z9 = false;
        }
        oyb.d(z9);
        this.a = se8;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
    }

    public final x88 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new x88(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final x88 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new x88(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x88.class != obj.getClass()) {
            return false;
        }
        x88 x88 = (x88) obj;
        return this.b == x88.b && this.c == x88.c && this.d == x88.d && this.e == x88.e && this.f == x88.f && this.g == x88.g && this.h == x88.h && this.i == x88.i && oze.a(this.a, x88.a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
