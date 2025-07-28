package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;

/* renamed from: eyc  reason: default package */
public final class eyc implements ojc {
    public final ojc a;
    public final int b;
    public long c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ fyc f;

    public eyc(fyc fyc, ojc ojc, int i) {
        this.f = fyc;
        this.a = ojc;
        this.b = i;
    }

    public final Surface a() {
        return this.a.a();
    }

    public final int c() {
        return this.a.c();
    }

    public final n24 d() {
        return this.a.d();
    }

    public final void e() {
        fyc fyc = this.f;
        fyc.l.decrementAndGet();
        if (fyc.b ? this.e : fyc.n == fyc.a.size() - 1) {
            this.a.e();
        } else if (fyc.l.get() == 0) {
            fyc.g.d(new pzb(10, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r7 = this;
            ojc r0 = r7.a
            n24 r0 = r0.d()
            defpackage.oyb.l(r0)
            long r1 = r7.c
            long r3 = r0.Z
            long r1 = r1 + r3
            fyc r3 = r7.f
            boolean r4 = r3.b
            r5 = 4
            r6 = 1
            if (r4 == 0) goto L_0x0048
            long r3 = r3.x
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0020
            boolean r1 = r7.d
            if (r1 == 0) goto L_0x0048
        L_0x0020:
            fyc r1 = r7.f
            boolean r1 = r1.y
            r2 = 0
            if (r1 == 0) goto L_0x0047
            boolean r1 = r7.d
            if (r1 != 0) goto L_0x0047
            java.nio.ByteBuffer r1 = r0.X
            r1.getClass()
            r1.limit(r2)
            r0.b = r5
            ojc r0 = r7.a
            boolean r0 = r0.f()
            defpackage.oyb.k(r0)
            r7.d = r6
            fyc r7 = r7.f
            java.util.concurrent.atomic.AtomicInteger r7 = r7.l
            r7.decrementAndGet()
        L_0x0047:
            return r2
        L_0x0048:
            boolean r1 = r0.f(r5)
            if (r1 == 0) goto L_0x00a0
            fyc r1 = r7.f
            java.util.concurrent.atomic.AtomicInteger r1 = r1.l
            r1.decrementAndGet()
            fyc r1 = r7.f
            int r2 = r1.n
            ws6 r1 = r1.a
            int r1 = r1.size()
            int r1 = r1 - r6
            if (r2 < r1) goto L_0x0068
            fyc r1 = r7.f
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x00a0
        L_0x0068:
            int r1 = r7.b
            if (r1 != r6) goto L_0x0080
            fyc r1 = r7.f
            boolean r2 = r1.b
            if (r2 != 0) goto L_0x0080
            boolean r1 = r1.q
            if (r1 == 0) goto L_0x0080
            ojc r0 = r7.a
            boolean r0 = r0.f()
            defpackage.oyb.k(r0)
            goto L_0x0087
        L_0x0080:
            r0.v()
            r1 = 0
            r0.Z = r1
        L_0x0087:
            fyc r0 = r7.f
            java.util.concurrent.atomic.AtomicInteger r0 = r0.l
            int r0 = r0.get()
            if (r0 != 0) goto L_0x009f
            fyc r0 = r7.f
            h8e r0 = r0.g
            pzb r1 = new pzb
            r2 = 10
            r1.<init>(r2, r7)
            r0.d(r1)
        L_0x009f:
            return r6
        L_0x00a0:
            ojc r7 = r7.a
            boolean r7 = r7.f()
            defpackage.oyb.k(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyc.f():boolean");
    }

    public final int g(Bitmap bitmap, dke dke) {
        if (this.f.b) {
            long j = -9223372036854775807L;
            while (true) {
                if (!dke.hasNext()) {
                    break;
                }
                long next = dke.next();
                if (this.c + next <= this.f.x) {
                    j = next;
                } else if (!this.f.y) {
                    return 2;
                } else {
                    if (j != -9223372036854775807L) {
                        dke n14 = new n14(dke.a(), j);
                        this.e = true;
                        dke = n14;
                    } else if (this.e) {
                        return 2;
                    } else {
                        this.e = true;
                        e();
                        return 3;
                    }
                }
            }
        }
        return this.a.g(bitmap, dke.a());
    }

    public final boolean h(long j) {
        long j2 = this.c + j;
        fyc fyc = this.f;
        if (!fyc.b || j2 < fyc.x) {
            return this.a.h(j);
        }
        if (!this.f.y || this.e) {
            return false;
        }
        this.e = true;
        e();
        return false;
    }
}
