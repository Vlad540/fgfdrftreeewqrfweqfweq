package defpackage;

import android.os.Handler;

/* renamed from: tuf  reason: default package */
public abstract class tuf extends v83 {
    public final zh0 k;

    public tuf(zh0 zh0) {
        this.k = zh0;
    }

    public abstract void A(vje vje);

    public void B() {
        y((Object) null, this.k);
    }

    public final vje h() {
        return this.k.h();
    }

    public final l68 i() {
        return this.k.i();
    }

    public final boolean j() {
        return this.k.j();
    }

    public final void m(cqe cqe) {
        this.j = cqe;
        this.i = oze.o((Handler.Callback) null);
        B();
    }

    public void t(l68 l68) {
        this.k.t(l68);
    }

    public final se8 u(Object obj, se8 se8) {
        Void voidR = (Void) obj;
        return z(se8);
    }

    public final long v(long j, Object obj) {
        Void voidR = (Void) obj;
        return j;
    }

    public final int w(int i, Object obj) {
        Void voidR = (Void) obj;
        return i;
    }

    public final void x(Object obj, zh0 zh0, vje vje) {
        Void voidR = (Void) obj;
        A(vje);
    }

    public se8 z(se8 se8) {
        return se8;
    }
}
