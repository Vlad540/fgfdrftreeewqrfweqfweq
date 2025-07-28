package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fac  reason: default package */
public final class fac extends jac implements vy3 {
    public final luc Y;

    public fac(long j, vu5 vu5, List list, luc luc, ArrayList arrayList) {
        super(vu5, list, luc, arrayList);
        this.Y = luc;
    }

    public final boolean A() {
        return this.Y.j();
    }

    public final long C() {
        return this.Y.d;
    }

    public final long D(long j) {
        return this.Y.e(j);
    }

    public final long E(long j, long j2) {
        return this.Y.c(j, j2);
    }

    public final String a() {
        return null;
    }

    public final long b(long j) {
        return this.Y.h(j);
    }

    public final vy3 c() {
        return this;
    }

    public final mxb d() {
        return null;
    }

    public final long j(long j, long j2) {
        return this.Y.f(j, j2);
    }

    public final long l(long j, long j2) {
        return this.Y.d(j, j2);
    }

    public final long n(long j, long j2) {
        luc luc = this.Y;
        if (luc.f != null) {
            return -9223372036854775807L;
        }
        long c = luc.c(j, j2) + luc.d(j, j2);
        return (luc.f(c, j) + luc.h(c)) - luc.i;
    }

    public final mxb p(long j) {
        return this.Y.i(j, this);
    }

    public final long v(long j, long j2) {
        return this.Y.g(j, j2);
    }
}
