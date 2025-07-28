package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* renamed from: uxa  reason: default package */
public final class uxa {
    public static final se8 u = new se8(new Object());
    public final vje a;
    public final se8 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final woe h;
    public final ope i;
    public final List j;
    public final se8 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final wxa o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public uxa(vje vje, se8 se8, long j2, long j3, int i2, ExoPlaybackException exoPlaybackException, boolean z, woe woe, ope ope, List list, se8 se82, boolean z2, int i3, int i4, wxa wxa, long j4, long j5, long j6, long j7, boolean z3) {
        this.a = vje;
        this.b = se8;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = woe;
        this.i = ope;
        this.j = list;
        this.k = se82;
        this.l = z2;
        this.m = i3;
        this.n = i4;
        this.o = wxa;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.t = j7;
        this.p = z3;
    }

    public static uxa i(ope ope) {
        oje oje = vje.a;
        se8 se8 = u;
        return new uxa(oje, se8, -9223372036854775807L, 0, 1, (ExoPlaybackException) null, false, woe.d, ope, e8c.X, se8, false, 1, 0, wxa.d, 0, 0, 0, 0, false);
    }

    public final uxa a() {
        return new uxa(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, j(), SystemClock.elapsedRealtime(), this.p);
    }

    public final uxa b(se8 se8) {
        vje vje = this.a;
        return new uxa(vje, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, se8, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final uxa c(se8 se8, long j2, long j3, long j4, long j5, woe woe, ope ope, List list) {
        long j6 = j2;
        woe woe2 = woe;
        ope ope2 = ope;
        List list2 = list;
        vje vje = this.a;
        return new uxa(vje, se8, j3, j4, this.e, this.f, this.g, woe2, ope2, list2, this.k, this.l, this.m, this.n, this.o, this.q, j5, j6, SystemClock.elapsedRealtime(), this.p);
    }

    public final uxa d(int i2, int i3, boolean z) {
        boolean z2 = z;
        vje vje = this.a;
        return new uxa(vje, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z2, i2, i3, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final uxa e(ExoPlaybackException exoPlaybackException) {
        vje vje = this.a;
        return new uxa(vje, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final uxa f(wxa wxa) {
        vje vje = this.a;
        return new uxa(vje, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, wxa, this.q, this.r, this.s, this.t, this.p);
    }

    public final uxa g(int i2) {
        vje vje = this.a;
        return new uxa(vje, this.b, this.c, this.d, i2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final uxa h(vje vje) {
        return new uxa(vje, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long j() {
        long j2;
        long j3;
        if (!k()) {
            return this.s;
        }
        do {
            j2 = this.t;
            j3 = this.s;
        } while (j2 != this.t);
        return oze.S(oze.h0(j3) + ((long) (((float) (SystemClock.elapsedRealtime() - j2)) * this.o.a)));
    }

    public final boolean k() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
