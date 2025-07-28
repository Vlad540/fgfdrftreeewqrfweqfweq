package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: fzc  reason: default package */
public final class fzc implements pf4 {
    public final mge a;
    public final PmsKey b;
    public final boolean c;
    public final int d;
    public final t97 e;
    public final t97 f;
    public final long g;
    public final grd h;
    public final t0c i;

    public fzc(lge lge, PmsKey pmsKey, boolean z, int i2) {
        this.a = lge;
        this.b = pmsKey;
        this.c = z;
        this.d = i2;
        ag4 ag4 = ag4.a;
        this.e = ag4.getAccessor().d(sqc.class);
        this.f = ag4.getAccessor().d(vqc.class);
        this.g = du0.a.incrementAndGet();
        grd a2 = hrd.a(e());
        this.h = a2;
        this.i = new t0c(a2);
    }

    public final zqd c() {
        return this.i;
    }

    public final void d(z14 z14) {
        if (z14.a == this.g) {
            t97 t97 = this.e;
            boolean z = this.c;
            PmsKey pmsKey = this.b;
            boolean m = ((sqc) t97.getValue()).m(pmsKey, z);
            sqc sqc = (sqc) t97.getValue();
            sqc.getClass();
            sqc.i(pmsKey.name(), !m);
            this.h.m((Object) null, e());
        }
    }

    public final List e() {
        PmsKey pmsKey = this.b;
        boolean z = this.c;
        y14 y14 = new y14(((sqc) this.e.getValue()).m(pmsKey, z));
        lge lge = new lge(us8.k("Server: ", ((vqc) this.f.getValue()).g.getBoolean(pmsKey.name(), z)));
        return Collections.singletonList(new z14(this.g, this.a, this.d, lge, y14));
    }

    public fzc(PmsKey pmsKey) {
        this(new lge(pmsKey.name()), pmsKey, false, 0);
    }

    public fzc(String str, PmsKey pmsKey, boolean z) {
        this(new lge(str), pmsKey, z, 0);
    }
}
