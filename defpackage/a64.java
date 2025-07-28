package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;

/* renamed from: a64  reason: default package */
public final class a64 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public /* synthetic */ a64(long j, Object obj, Object obj2, Object obj3, long j2, Object obj4, int i) {
        this.a = i;
        this.b = j;
        this.e = obj;
        this.f = obj2;
        this.c = j2;
        this.d = obj3;
        this.g = obj4;
    }

    public a64 a(long j, jac jac) {
        long j2;
        long j3 = j;
        vy3 c2 = ((jac) this.e).c();
        vy3 c3 = jac.c();
        if (c2 == null) {
            return new a64(j, jac, (gj0) this.f, (pt0) this.d, this.c, c2, 0);
        } else if (!c2.A()) {
            return new a64(j, jac, (gj0) this.f, (pt0) this.d, this.c, c3, 0);
        } else {
            long D = c2.D(j3);
            if (D == 0) {
                return new a64(j, jac, (gj0) this.f, (pt0) this.d, this.c, c3, 0);
            }
            long C = c2.C();
            long b2 = c2.b(C);
            long j4 = D + C;
            long j5 = j4 - 1;
            long j6 = c2.j(j5, j3) + c2.b(j5);
            long C2 = c3.C();
            vy3 vy3 = c2;
            long b3 = c3.b(C2);
            int i = (j6 > b3 ? 1 : (j6 == b3 ? 0 : -1));
            long j7 = C;
            long j8 = this.c;
            if (i != 0) {
                if (i < 0) {
                    throw new BehindLiveWindowException();
                } else if (b3 < b2) {
                    j2 = j8 - (c3.v(b2, j3) - j7);
                    return new a64(j, jac, (gj0) this.f, (pt0) this.d, j2, c3, 0);
                } else {
                    j4 = vy3.v(b3, j3);
                }
            }
            j2 = (j4 - C2) + j8;
            return new a64(j, jac, (gj0) this.f, (pt0) this.d, j2, c3, 0);
        }
    }

    public a64 b(long j, kac kac) {
        long j2;
        long j3 = j;
        wy3 c2 = ((kac) this.e).c();
        wy3 c3 = kac.c();
        if (c2 == null) {
            return new a64(j, kac, (hj0) this.f, (ay2) this.d, this.c, c2, 1);
        } else if (!c2.A()) {
            return new a64(j, kac, (hj0) this.f, (ay2) this.d, this.c, c3, 1);
        } else {
            long D = c2.D(j3);
            if (D == 0) {
                return new a64(j, kac, (hj0) this.f, (ay2) this.d, this.c, c3, 1);
            }
            oyb.l(c3);
            long C = c2.C();
            long b2 = c2.b(C);
            long j4 = D + C;
            long j5 = j4 - 1;
            long j6 = c2.j(j5, j3) + c2.b(j5);
            long C2 = c3.C();
            wy3 wy3 = c2;
            long b3 = c3.b(C2);
            int i = (j6 > b3 ? 1 : (j6 == b3 ? 0 : -1));
            long j7 = C;
            long j8 = this.c;
            if (i != 0) {
                if (i < 0) {
                    throw new androidx.media3.exoplayer.source.BehindLiveWindowException();
                } else if (b3 < b2) {
                    j2 = j8 - (c3.v(b2, j3) - j7);
                    return new a64(j, kac, (hj0) this.f, (ay2) this.d, j2, c3, 1);
                } else {
                    j4 = wy3.v(b3, j3);
                }
            }
            j2 = (j4 - C2) + j8;
            return new a64(j, kac, (hj0) this.f, (ay2) this.d, j2, c3, 1);
        }
    }

    public long c(long j) {
        wy3 wy3 = (wy3) this.g;
        oyb.l(wy3);
        return wy3.l(this.b, j) + this.c;
    }

    public final long d(long j) {
        switch (this.a) {
            case 0:
                vy3 vy3 = (vy3) this.g;
                long j2 = this.b;
                return (vy3.E(j2, j) + (vy3.l(j2, j) + this.c)) - 1;
            default:
                long c2 = c(j);
                wy3 wy3 = (wy3) this.g;
                oyb.l(wy3);
                return (wy3.E(this.b, j) + c2) - 1;
        }
    }

    public long e() {
        wy3 wy3 = (wy3) this.g;
        oyb.l(wy3);
        return wy3.D(this.b);
    }

    public final long f(long j) {
        switch (this.a) {
            case 0:
                return ((vy3) this.g).j(j - this.c, this.b) + g(j);
            default:
                long g2 = g(j);
                wy3 wy3 = (wy3) this.g;
                oyb.l(wy3);
                return wy3.j(j - this.c, this.b) + g2;
        }
    }

    public final long g(long j) {
        switch (this.a) {
            case 0:
                return ((vy3) this.g).b(j - this.c);
            default:
                wy3 wy3 = (wy3) this.g;
                oyb.l(wy3);
                return wy3.b(j - this.c);
        }
    }

    public boolean h(long j, long j2) {
        wy3 wy3 = (wy3) this.g;
        oyb.l(wy3);
        return wy3.A() || j2 == -9223372036854775807L || f(j) <= j2;
    }
}
