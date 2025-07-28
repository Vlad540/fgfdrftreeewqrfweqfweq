package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ycf  reason: default package */
public final class ycf implements hu1 {
    public final hu1 a;
    public final ecc b;
    public final adf c;
    public final lye o;

    public ycf(hu1 hu1, lye lye, sic sic) {
        this.a = hu1;
        this.o = lye;
        this.b = new ecc(hu1.g(), sic);
        this.c = new adf(hu1.p());
    }

    public final void c(mye mye) {
        gt0.i();
        this.o.c(mye);
    }

    public final void e(mye mye) {
        gt0.i();
        this.o.e(mye);
    }

    public final ns9 f() {
        return this.a.f();
    }

    public final ot1 g() {
        return this.b;
    }

    public final void i(mye mye) {
        gt0.i();
        this.o.i(mye);
    }

    public final void k(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    public final void l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    public final void m(mye mye) {
        gt0.i();
        this.o.m(mye);
    }

    public final boolean n() {
        return false;
    }

    public final fu1 p() {
        return this.c;
    }
}
