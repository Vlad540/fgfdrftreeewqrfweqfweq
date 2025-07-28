package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: lwd  reason: default package */
public final class lwd {
    public final t97 a;
    public final t97 b;
    public final ContextScope c;
    public final grd d;
    public final t0c e;
    public final AtomicReference f = new AtomicReference(0L);
    public qod g;

    public lwd(t97 t97, t97 t972, zsd zsd, pae pae) {
        this.a = t97;
        this.b = t972;
        ContextScope a2 = n1g.a(((n3a) pae).b());
        this.c = a2;
        grd a3 = hrd.a(hw4.a);
        this.d = a3;
        this.e = new t0c(a3);
        ez3.N(new ck5(new w09(am7.c(zsd.l), this, 10), new hwd(this, (Continuation) null), 5), a2);
    }
}
