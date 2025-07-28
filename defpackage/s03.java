package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* renamed from: s03  reason: default package */
public final class s03 extends u83 {
    public final yh0 k;
    public final long l = 0;
    public final long m;
    public final boolean n;
    public final ArrayList o;
    public final sje p;
    public q03 q;
    public ClippingMediaSource$IllegalClippingException r;
    public long s;
    public long t;

    public s03(chb chb, long j) {
        this.k = chb;
        this.m = j;
        this.n = true;
        this.o = new ArrayList();
        this.p = new sje();
    }

    public final r88 a(re8 re8, l34 l34, long j) {
        o03 o03 = new o03(this.k.a(re8, l34, j), this.n, this.s, this.t);
        this.o.add(o03);
        return o03;
    }

    public final j68 f() {
        return this.k.f();
    }

    public final void g() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.r;
        if (clippingMediaSource$IllegalClippingException == null) {
            super.g();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    public final void i(bqe bqe) {
        this.j = bqe;
        this.i = mze.m((Handler.Callback) null);
        r((Integer) null, this.k);
    }

    public final void k(r88 r88) {
        ArrayList arrayList = this.o;
        swb.h(arrayList.remove(r88));
        this.k.k(((o03) r88).a);
        if (arrayList.isEmpty()) {
            q03 q03 = this.q;
            q03.getClass();
            s(q03.b);
        }
    }

    public final void m() {
        super.m();
        this.r = null;
        this.q = null;
    }

    public final void q(Integer num, yh0 yh0, uje uje) {
        Void voidR = (Void) num;
        if (this.r == null) {
            s(uje);
        }
    }

    public final void s(uje uje) {
        long j;
        sje sje = this.p;
        uje.o(0, sje);
        long j2 = sje.F0;
        q03 q03 = this.q;
        ArrayList arrayList = this.o;
        long j3 = this.m;
        long j4 = Long.MIN_VALUE;
        if (q03 == null || arrayList.isEmpty()) {
            j = this.l;
            this.s = j2 + j;
            if (j3 != Long.MIN_VALUE) {
                j4 = j2 + j3;
            }
            this.t = j4;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                o03 o03 = (o03) arrayList.get(i);
                long j5 = this.s;
                long j6 = this.t;
                o03.X = j5;
                o03.Y = j6;
            }
        } else {
            j = this.s - j2;
            if (j3 != Long.MIN_VALUE) {
                j4 = this.t - j2;
            }
            j3 = j4;
        }
        try {
            q03 q032 = new q03(uje, j, j3);
            this.q = q032;
            j(q032);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.r = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((o03) arrayList.get(i2)).Z = this.r;
            }
        }
    }
}
