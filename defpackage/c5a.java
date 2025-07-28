package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: c5a  reason: default package */
public final class c5a {
    public final v72 a;
    public final pae b;
    public final tr2 c;
    public final tt0 d;
    public final grd e;
    public final t0c f;
    public final ContextScope g;
    public volatile qod h;

    public c5a(v72 v72, pae pae, tr2 tr2, tt0 tt0) {
        this.a = v72;
        this.b = pae;
        this.c = tr2;
        this.d = tt0;
        grd a2 = hrd.a(new bs5(iw4.a));
        this.e = a2;
        this.f = new t0c(a2);
        ContextScope a3 = n1g.a(((n3a) pae).a());
        this.g = a3;
        ez3.N(new ck5(ez3.z(new u09(((b92) v72).g(), 6)), new y4a(this, (Continuation) null), 5), a3);
    }
}
