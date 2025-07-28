package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: kq7  reason: default package */
public final class kq7 extends taf {
    public static final /* synthetic */ k77[] z0;
    public final LinkedBlockingQueue X = new LinkedBlockingQueue(1);
    public final grd Y;
    public final LinkedBlockingQueue Z;
    public final i6a b;
    public final pae c;
    public final r7e o = new r7e(new up7(this, 0));
    public final grd w0;
    public final e3 x0;
    public i47 y0;

    static {
        hc9 hc9 = new hc9(kq7.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        z0 = new k77[]{hc9};
    }

    public kq7(i6a i6a, pae pae) {
        this.b = i6a;
        this.c = pae;
        hw4 hw4 = hw4.a;
        this.Y = hrd.a(hw4);
        this.Z = new LinkedBlockingQueue(1);
        this.w0 = hrd.a(hw4);
        this.x0 = hwf.t();
        h37 a = lp.a();
        a.H();
        this.y0 = a;
        taf.n(this, ((n3a) pae).b(), (ru3) null, new zp7(this, (Continuation) null), 2);
        q();
    }

    public final void q() {
        if (this.y0.isCompleted()) {
            g37 g37 = (g37) this.x0.T0(this, z0[0]);
            n3a n3a = this.c;
            ContextScope contextScope = this.a;
            this.y0 = (g37 == null || !g37.isActive()) ? xs7.E(contextScope, n3a.b(), (ru3) null, new eq7(this, (Continuation) null), 2) : xs7.E(contextScope, n3a.b(), (ru3) null, new dq7(this, (Continuation) null), 2);
        }
    }
}
