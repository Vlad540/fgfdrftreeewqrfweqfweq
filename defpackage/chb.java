package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: chb  reason: default package */
public final class chb extends yh0 {
    public final j68 h;
    public final c68 i;
    public final mz3 j;
    public final ss8 k;
    public final mo4 l;
    public final lk9 m;
    public final int n = 1048576;
    public boolean o = true;
    public long p = -9223372036854775807L;
    public boolean q;
    public boolean r;
    public bqe s;

    public chb(j68 j68, mz3 mz3, ss8 ss8, mo4 mo4, lk9 lk9) {
        c68 c68 = j68.b;
        c68.getClass();
        this.i = c68;
        this.h = j68;
        this.j = mz3;
        this.k = ss8;
        this.l = mo4;
        this.m = lk9;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [it4, java.lang.Object] */
    public final r88 a(re8 re8, l34 l34, long j2) {
        oz3 a = this.j.a();
        bqe bqe = this.s;
        if (bqe != null) {
            a.O(bqe);
        }
        Uri uri = this.i.a;
        swb.i(this.g);
        ? obj = new Object();
        obj.a = (s74) ((j75) this.k.b);
        eo4 eo4 = new eo4(this.d.c, 0, re8);
        af8 af8 = new af8((CopyOnWriteArrayList) this.c.d, 0, re8, 0);
        return new xgb(uri, a, obj, this.l, eo4, this.m, af8, this, l34, this.n);
    }

    public final j68 f() {
        return this.h;
    }

    public final void g() {
    }

    public final void i(bqe bqe) {
        this.s = bqe;
        mo4 mo4 = this.l;
        mo4.prepare();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        bza bza = this.g;
        swb.i(bza);
        mo4.c(myLooper, bza);
        p();
    }

    public final void k(r88 r88) {
        xgb xgb = (xgb) r88;
        if (xgb.K0) {
            for (vjc vjc : xgb.H0) {
                vjc.i();
                yn4 yn4 = vjc.h;
                if (yn4 != null) {
                    yn4.f(vjc.e);
                    vjc.h = null;
                    vjc.g = null;
                }
            }
        }
        xgb.z0.F(xgb);
        xgb.E0.removeCallbacksAndMessages((Object) null);
        xgb.F0 = null;
        xgb.a1 = true;
    }

    public final void m() {
        this.l.release();
    }

    public final void p() {
        long j2 = this.p;
        boolean z = this.q;
        boolean z2 = this.r;
        j68 j68 = this.h;
        cid cid = r1;
        cid cid2 = new cid(-9223372036854775807L, -9223372036854775807L, j2, j2, 0, 0, z, false, false, (kk9) null, j68, z2 ? j68.c : null);
        j(this.o ? new zw5(cid) : cid);
    }

    public final void q(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.p;
        }
        if (this.o || this.p != j2 || this.q != z || this.r != z2) {
            this.p = j2;
            this.q = z;
            this.r = z2;
            this.o = false;
            p();
        }
    }
}
