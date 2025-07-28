package defpackage;

import android.os.Build;

/* renamed from: kt4  reason: default package */
public final class kt4 extends a06 {
    public final /* synthetic */ lt4 i;

    public kt4(lt4 lt4) {
        this.i = lt4;
    }

    public final void A(Throwable th) {
        ((pt4) this.i.a).e(th);
    }

    public final void B(o39 o39) {
        lt4 lt4 = this.i;
        if (o39 == null) {
            ((pt4) lt4.a).e(new IllegalArgumentException("metadataRepo cannot be null"));
            return;
        }
        lt4.c = o39;
        o39 o392 = (o39) lt4.c;
        pt4 pt4 = (pt4) lt4.a;
        lt4.b = new te(o392, pt4.g, pt4.n, pt4.i, pt4.j, Build.VERSION.SDK_INT >= 34 ? xt4.a() : n06.p());
        ((pt4) lt4.a).f();
    }
}
