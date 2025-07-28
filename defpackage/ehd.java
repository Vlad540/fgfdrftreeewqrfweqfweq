package defpackage;

import java.util.Collections;

/* renamed from: ehd  reason: default package */
public final class ehd implements pf4 {
    public final s16 a;
    public final long b;
    public final t0c c;

    public ehd(lge lge, int i, jqc jqc) {
        this.a = jqc;
        long incrementAndGet = du0.a.incrementAndGet();
        this.b = incrementAndGet;
        this.c = new t0c(hrd.a(Collections.singletonList(new z14(incrementAndGet, lge, i, (mge) null, w14.f, 8))));
    }

    public final zqd c() {
        return this.c;
    }

    public final void d(z14 z14) {
        if (z14.a == this.b) {
            this.a.invoke();
        }
    }
}
