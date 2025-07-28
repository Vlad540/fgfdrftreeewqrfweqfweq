package defpackage;

import android.os.Looper;

/* renamed from: dhb  reason: default package */
public final class dhb extends zh0 {
    public final nz3 h;
    public final ss8 i;
    public final no4 j;
    public final mk9 k;
    public final int l;
    public boolean m = true;
    public long n = -9223372036854775807L;
    public boolean o;
    public boolean p;
    public cqe q;
    public l68 r;

    public dhb(l68 l68, nz3 nz3, ss8 ss8, no4 no4, mk9 mk9, int i2) {
        this.r = l68;
        this.h = nz3;
        this.i = ss8;
        this.j = no4;
        this.k = mk9;
        this.l = i2;
    }

    public final boolean a(l68 l68) {
        a68 a68 = i().b;
        a68.getClass();
        a68 a682 = l68.b;
        return a682 != null && a682.a.equals(a68.a) && a682.i == a68.i && oze.a(a682.f, a68.f);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ul7, java.lang.Object] */
    public final s88 c(se8 se8, l34 l34, long j2) {
        qz3 a = this.h.a();
        cqe cqe = this.q;
        if (cqe != null) {
            a.H(cqe);
        }
        a68 a68 = i().b;
        a68.getClass();
        oyb.l(this.g);
        ? obj = new Object();
        obj.a = (k75) this.i.b;
        fo4 fo4 = new fo4(this.d.c, 0, se8);
        jn b = b(se8);
        long S = oze.S(a68.i);
        return new ygb(a68.a, a, obj, this.j, fo4, this.k, b, this, l34, a68.f, this.l, S);
    }

    public final synchronized l68 i() {
        return this.r;
    }

    public final void k() {
    }

    public final void m(cqe cqe) {
        this.q = cqe;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        cza cza = this.g;
        oyb.l(cza);
        no4 no4 = this.j;
        no4.c(myLooper, cza);
        no4.prepare();
        u();
    }

    public final void o(s88 s88) {
        ygb ygb = (ygb) s88;
        if (ygb.L0) {
            for (wjc wjc : ygb.I0) {
                wjc.h();
                zn4 zn4 = wjc.h;
                if (zn4 != null) {
                    zn4.f(wjc.e);
                    wjc.h = null;
                    wjc.g = null;
                }
            }
        }
        ygb.A0.E(ygb);
        ygb.F0.removeCallbacksAndMessages((Object) null);
        ygb.G0 = null;
        ygb.c1 = true;
    }

    public final void q() {
        this.j.release();
    }

    public final synchronized void t(l68 l68) {
        this.r = l68;
    }

    public final void u() {
        long j2 = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        l68 i2 = i();
        did did = r1;
        did did2 = new did(-9223372036854775807L, -9223372036854775807L, j2, j2, 0, 0, z, false, false, (lk9) null, i2, z2 ? i2.c : null);
        n(this.m ? new ax5(did) : did);
    }

    public final void v(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.n;
        }
        if (this.m || this.n != j2 || this.o != z || this.p != z2) {
            this.n = j2;
            this.o = z;
            this.p = z2;
            this.m = false;
            u();
        }
    }
}
