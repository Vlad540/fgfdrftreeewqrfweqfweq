package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gac  reason: default package */
public final class gac extends kac implements wy3 {
    public final muc Y;

    public gac(long j, xu5 xu5, List list, muc muc, ArrayList arrayList) {
        super(xu5, list, muc, arrayList);
        this.Y = muc;
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

    public final wy3 c() {
        return this;
    }

    public final nxb d() {
        return null;
    }

    public final long j(long j, long j2) {
        return this.Y.f(j, j2);
    }

    public final long l(long j, long j2) {
        return this.Y.d(j, j2);
    }

    public final long n(long j, long j2) {
        muc muc = this.Y;
        if (muc.f != null) {
            return -9223372036854775807L;
        }
        long c = muc.c(j, j2) + muc.d(j, j2);
        return (muc.f(c, j) + muc.h(c)) - muc.i;
    }

    public final nxb p(long j) {
        return this.Y.i(j, this);
    }

    public final long v(long j, long j2) {
        return this.Y.g(j, j2);
    }
}
