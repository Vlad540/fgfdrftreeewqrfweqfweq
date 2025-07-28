package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: j4f  reason: default package */
public final class j4f implements ob6 {
    public final m4f a;
    public final AtomicLong b = new AtomicLong();
    public final long c;
    public final u2b d;

    public j4f(m4f m4f, u2b u2b, long j) {
        this.a = m4f;
        this.c = j;
        this.d = u2b;
    }

    public final Surface a() {
        SparseArray sparseArray = ((rc4) this.a).d.g;
        oyb.k(oze.l(sparseArray, 1));
        return ((my6) sparseArray.get(1)).a.j();
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [ms6, ts6] */
    public final void b(gs4 gs4, long j, xu5 xu5, boolean z) {
        int i;
        List list;
        long b2 = gs4.b(j);
        AtomicLong atomicLong = this.b;
        if (xu5 != null) {
            int i2 = xu5.w % 180;
            int i3 = xu5.u;
            int i4 = xu5.t;
            int i5 = i2 == 0 ? i4 : i3;
            if (i2 != 0) {
                i3 = i4;
            }
            gjd gjd = new gjd(i5, i3);
            String str = xu5.n;
            str.getClass();
            if (c49.i(str)) {
                i = 2;
            } else if (str.equals("video/raw")) {
                i = 3;
            } else if (c49.k(str)) {
                i = 1;
            } else {
                throw new IllegalArgumentException("MIME type not supported ".concat(str));
            }
            ws6 ws6 = gs4.g.b;
            u2b u2b = this.d;
            if (u2b == null) {
                list = ws6.j(ws6);
            } else {
                ? ms6 = new ms6(4);
                ms6.e(ws6);
                ms6.a(u2b);
                list = ms6.j();
            }
            z23 z23 = xu5.A;
            z23.getClass();
            ((rc4) this.a).c(i, list, new bz5(z23, gjd.a, gjd.b, xu5.x, atomicLong.get() + this.c));
        }
        atomicLong.addAndGet(b2);
    }

    public final int c() {
        v2 v2Var = ((rc4) this.a).d.k;
        if (v2Var != null) {
            return v2Var.l();
        }
        return 0;
    }

    public final void e() {
        ((rc4) this.a).f();
    }

    public final int g(Bitmap bitmap, dke dke) {
        rc4 rc4 = (rc4) this.a;
        if (!rc4.k.e()) {
            return 2;
        }
        if (z23.g(rc4.p)) {
            oyb.c("VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.", oze.a >= 34 && bitmap.hasGainmap());
        }
        bz5 bz5 = rc4.q;
        bz5.getClass();
        v2 v2Var = rc4.d.k;
        oyb.l(v2Var);
        v2Var.q(bitmap, new bz5(bz5.a, bz5.b, bz5.c, bz5.d, bz5.e), dke);
        return 1;
    }

    public final boolean h(long j) {
        return ((rc4) this.a).b();
    }
}
