package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: e40  reason: default package */
public final class e40 implements bh7 {
    public static final /* synthetic */ k77[] h;
    public final t97 a;
    public final ContextScope b;
    public final e3 c = hwf.t();
    public final wwc d = new wwc(2, this);
    public volatile Long e;
    public final grd f;
    public final ck5 g;

    static {
        k77 hc9 = new hc9(e40.class, "updatePlayer", "getUpdatePlayer()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        h = new k77[]{hc9};
    }

    public e40(t97 t97, t97 t972) {
        this.a = t972;
        this.b = n1g.a(((pae) t97.getValue()).c().getImmediate().plus(lp.a()));
        grd a2 = hrd.a(new ah7((Float) null, false));
        this.f = a2;
        this.g = new ck5(a2, new c40(t972, this, (Continuation) null));
    }

    public static final void a(e40 e40) {
        qod E = xs7.E(e40.b, (hu3) null, ru3.b, new d40(e40, (Continuation) null), 1);
        e40.c.o1(e40, h[0], E);
    }

    public final va9 b() {
        return (va9) this.a.getValue();
    }
}
