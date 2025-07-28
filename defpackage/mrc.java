package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mrc  reason: default package */
public final class mrc extends taf {
    public final or3 X = new or3(9, (Object) this);
    public final t0c Y;
    public final t0c Z;
    public final long b;
    public final s62 c;
    public final hi2 o;
    public final l05 w0;

    public mrc(jrc jrc, long j, s62 s62, hi2 hi2) {
        this.b = j;
        this.c = s62;
        this.o = hi2;
        this.Y = (t0c) hi2.i;
        t0c t0c = (t0c) hi2.j;
        this.Z = t0c;
        this.w0 = new l05(0);
        ez3.N(new ck5(new s0c(jrc.a), new krc(this, (Continuation) null), 5), this.a);
        ez3.N(new ck5(new ik5(t0c, 2), new lrc(this, (Continuation) null), 5), this.a);
    }

    public final void q() {
        this.X.f(false);
        hi2 hi2 = this.o;
        ki2 ki2 = (ki2) hi2.a;
        ki2.g = null;
        ki2.a();
        ki2.a();
        ((grd) hi2.h).setValue((Object) null);
        ((grd) hi2.g).m((Object) null, vrc.a);
    }

    public final void r(boolean z) {
        this.X.f(true);
        hi2 hi2 = this.o;
        hi2.getClass();
        wrc wrc = new wrc(z);
        grd grd = (grd) hi2.g;
        if (!hhd.f(grd.getValue(), wrc)) {
            grd.m((Object) null, wrc);
            ki2 ki2 = (ki2) hi2.a;
            xs7.E(ki2.e, (hu3) null, (ru3) null, new ji2(ki2, (Continuation) null), 3);
            ki2.g = hi2;
        }
    }
}
