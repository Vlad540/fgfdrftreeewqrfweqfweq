package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.List;

/* renamed from: txa  reason: default package */
public final class txa {
    public static final re8 t = new re8(new Object());
    public final uje a;
    public final re8 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final voe h;
    public final ope i;
    public final List j;
    public final re8 k;
    public final boolean l;
    public final int m;
    public final vxa n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public txa(uje uje, re8 re8, long j2, long j3, int i2, ExoPlaybackException exoPlaybackException, boolean z, voe voe, ope ope, List list, re8 re82, boolean z2, int i3, vxa vxa, long j4, long j5, long j6, boolean z3, boolean z4) {
        this.a = uje;
        this.b = re8;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = voe;
        this.i = ope;
        this.j = list;
        this.k = re82;
        this.l = z2;
        this.m = i3;
        this.n = vxa;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.o = z3;
        this.p = z4;
    }

    public static txa h(ope ope) {
        nje nje = uje.a;
        re8 re8 = t;
        return new txa(nje, re8, -9223372036854775807L, 0, 1, (ExoPlaybackException) null, false, voe.o, ope, e8c.X, re8, false, 0, vxa.o, 0, 0, 0, false, false);
    }

    public final txa a(re8 re8) {
        uje uje = this.a;
        return new txa(uje, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, re8, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final txa b(re8 re8, long j2, long j3, long j4, long j5, voe voe, ope ope, List list) {
        long j6 = j2;
        voe voe2 = voe;
        ope ope2 = ope;
        List list2 = list;
        uje uje = this.a;
        return new txa(uje, re8, j3, j4, this.e, this.f, this.g, voe2, ope2, list2, this.k, this.l, this.m, this.n, this.q, j5, j6, this.o, this.p);
    }

    public final txa c(boolean z) {
        uje uje = this.a;
        return new txa(uje, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, z, this.p);
    }

    public final txa d(int i2, boolean z) {
        boolean z2 = z;
        uje uje = this.a;
        return new txa(uje, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z2, i2, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final txa e(ExoPlaybackException exoPlaybackException) {
        uje uje = this.a;
        return new txa(uje, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final txa f(int i2) {
        uje uje = this.a;
        return new txa(uje, this.b, this.c, this.d, i2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final txa g(uje uje) {
        return new txa(uje, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
}
