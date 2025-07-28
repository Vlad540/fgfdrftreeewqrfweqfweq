package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: h0a  reason: default package */
public final class h0a {
    public final ContextScope a;
    public final f03 b;
    public final xzc c;
    public final q0a d;
    public final so1 e;
    public final t97 f = ez3.O(3, yr3.y0);

    public h0a(w4 w4Var) {
        this.a = n1g.a(((pae) w4Var.c(pae.class)).c());
        this.b = (f03) w4Var.c(f03.class);
        this.c = (xzc) w4Var.c(xzc.class);
        this.d = (q0a) w4Var.c(q0a.class);
        this.e = (so1) w4Var.c(so1.class);
    }

    public final boolean a() {
        if (((int) this.c.o(uqc.b, (long) 0)) != 1) {
            return false;
        }
        String string = this.b.g.getString("version.force.update.received", BuildConfig.FLAVOR);
        this.d.getClass();
        return hhd.f(string, "25.7.2");
    }

    public final void b() {
        ((ep1) this.e).v();
        xs7.E(this.a, (hu3) null, (ru3) null, new g0a(this, (Continuation) null), 3);
    }
}
