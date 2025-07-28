package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* renamed from: t03  reason: default package */
public final class t03 extends tuf {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final tje r;
    public r03 s;
    public ClippingMediaSource$IllegalClippingException t;
    public long u;
    public long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t03(zh0 zh0, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(zh0);
        zh0.getClass();
        oyb.d(j >= 0);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = new ArrayList();
        this.r = new tje();
    }

    public final void A(vje vje) {
        if (this.t == null) {
            C(vje);
        }
    }

    public final void C(vje vje) {
        long j;
        long j2;
        long j3;
        tje tje = this.r;
        vje.o(0, tje);
        long j4 = tje.p;
        r03 r03 = this.s;
        ArrayList arrayList = this.q;
        long j5 = this.m;
        long j6 = Long.MIN_VALUE;
        if (r03 == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            long j7 = this.l;
            if (z) {
                long j8 = tje.l;
                j7 += j8;
                j3 = j8 + j5;
            } else {
                j3 = j5;
            }
            this.u = j4 + j7;
            if (j5 != Long.MIN_VALUE) {
                j6 = j4 + j3;
            }
            this.v = j6;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                p03 p03 = (p03) arrayList.get(i);
                long j9 = this.u;
                long j10 = this.v;
                p03.X = j9;
                p03.Y = j10;
            }
            j2 = j7;
            j = j3;
        } else {
            long j11 = this.u - j4;
            if (j5 != Long.MIN_VALUE) {
                j6 = this.v - j4;
            }
            j = j6;
            j2 = j11;
        }
        try {
            r03 r032 = new r03(vje, j2, j);
            this.s = r032;
            n(r032);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((p03) arrayList.get(i2)).Z = this.t;
            }
        }
    }

    public final boolean a(l68 l68) {
        zh0 zh0 = this.k;
        return zh0.i().e.equals(l68.e) && zh0.a(l68);
    }

    public final s88 c(se8 se8, l34 l34, long j) {
        p03 p03 = new p03(this.k.c(se8, l34, j), this.n, this.u, this.v);
        this.q.add(p03);
        return p03;
    }

    public final void k() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.t;
        if (clippingMediaSource$IllegalClippingException == null) {
            super.k();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    public final void o(s88 s88) {
        ArrayList arrayList = this.q;
        oyb.k(arrayList.remove(s88));
        this.k.o(((p03) s88).a);
        if (arrayList.isEmpty() && !this.o) {
            r03 r03 = this.s;
            r03.getClass();
            C(r03.e);
        }
    }

    public final void q() {
        super.q();
        this.t = null;
        this.s = null;
    }
}
