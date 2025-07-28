package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: rzc  reason: default package */
public final class rzc implements pf4 {
    public final PmsKey a;
    public final int b = 0;
    public final String[] c;
    public final lge d;
    public final t97 e;
    public final t97 f;
    public final long g;
    public final grd h;
    public final t0c i;

    public rzc(PmsKey pmsKey, String[] strArr) {
        this.a = pmsKey;
        this.c = strArr;
        this.d = new lge(pmsKey.name());
        ag4 ag4 = ag4.a;
        this.e = ag4.getAccessor().d(sqc.class);
        this.f = ag4.getAccessor().d(vqc.class);
        this.g = du0.a.incrementAndGet();
        grd a2 = hrd.a(e());
        this.h = a2;
        this.i = new t0c(a2);
    }

    public final void a(z14 z14, Long l) {
        if (z14.a == this.g) {
            ((sqc) this.e.getValue()).k(this.a.name(), l);
            this.h.m((Object) null, e());
        }
    }

    public final zqd c() {
        return this.i;
    }

    public final List e() {
        x14 x14 = x14.f;
        lge lge = new lge(us8.i(((vqc) this.f.getValue()).g.getLong(this.a.name(), 0), "Server="));
        return Collections.singletonList(new z14(this.g, this.d, this.b, lge, x14));
    }
}
