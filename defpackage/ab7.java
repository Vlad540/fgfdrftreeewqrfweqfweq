package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ab7  reason: default package */
public final class ab7 {
    public final iv6 a;
    public final t97 b;
    public final grd c;
    public final t0c d;
    public final ContextScope e;
    public final tc9 f = uc9.a();

    public ab7(tt0 tt0, iv6 iv6, t97 t97, pae pae) {
        this.a = iv6;
        this.b = t97;
        grd a2 = hrd.a(new mte(new uq7(10)));
        this.c = a2;
        this.d = new t0c(a2);
        this.e = n1g.a(((n3a) pae).a());
        tt0.d(this);
    }

    public static final void a(ab7 ab7, long j) {
        CharSequence f2 = ((ho2) ab7.b.getValue()).f(j);
        if (f2 == null) {
            f2 = "";
        }
        ip2 ip2 = new ip2(f2, j);
        grd grd = ab7.c;
        mte mte = (mte) grd.getValue();
        uq7 uq7 = new uq7(mte.a.h());
        uq7 uq72 = mte.a;
        int h = uq72.h();
        for (int i = 0; i < h; i++) {
            uq7.f(uq72.e(i), uq72.i(i));
        }
        uq7.f(j, ip2);
        grd.m((Object) null, new mte(uq7));
    }

    public static final void b(ab7 ab7, long j) {
        grd grd = ab7.c;
        mte mte = (mte) grd.getValue();
        uq7 uq7 = new uq7(mte.a.h());
        uq7 uq72 = mte.a;
        int h = uq72.h();
        for (int i = 0; i < h; i++) {
            uq7.f(uq72.e(i), uq72.i(i));
        }
        uq7.g(j);
        grd.m((Object) null, new mte(uq7));
    }

    @a1e
    public final void onEvent(lte lte) {
        xs7.E(this.e, (hu3) null, (ru3) null, new za7(this, lte, (Continuation) null), 3);
    }
}
