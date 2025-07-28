package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: hab  reason: default package */
public final class hab extends taf {
    public static final /* synthetic */ k77[] E0;
    public final l05 A0 = new l05(0);
    public final l05 B0 = new l05(0);
    public final e3 C0 = hwf.t();
    public final AtomicReference D0 = new AtomicReference();
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final bs4 b;
    public final t97 c;
    public final t97 o;
    public final grd w0;
    public final t0c x0;
    public final grd y0;
    public final t0c z0;

    static {
        k77 hc9 = new hc9(hab.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        E0 = new k77[]{hc9};
    }

    public hab(long j, d8b d8b) {
        bs4 bs4;
        z7b z7b = z7b.a;
        this.c = z7b.getAccessor().d(xzc.class);
        this.o = z7b.d();
        r7e r7e = new r7e(new k6b(9));
        this.X = z7b.getAccessor().d(qna.class);
        this.Y = z7b.getAccessor().d(mg5.class);
        this.Z = z7b.getAccessor().d(Application.class);
        z7b.c();
        grd a = hrd.a(hw4.a);
        this.w0 = a;
        this.x0 = new t0c(a);
        grd a2 = hrd.a((Object) null);
        this.y0 = a2;
        this.z0 = new t0c(a2);
        int ordinal = d8b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            bs4 = new n72(j, this.a);
        } else if (ordinal == 2) {
            bs4 = new hj3(j, this.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.b = bs4;
        ez3.N(ez3.J(new ck5(new ik5(bs4.f, 2), new x9b(this, (Continuation) null), 5), q().a()), this.a);
        ez3.N(ez3.J(new ck5(bs4.d, new y9b(this, (Continuation) null), 5), q().c()), this.a);
        ez3.N(ez3.J(new ck5(bs4.e, new z9b(this, (Continuation) null), 5), q().c()), this.a);
        ez3.N(new ck5(new s0c(((p8b) r7e.getValue()).a), new gab(this, (Continuation) null), 5), this.a);
    }

    public final void p() {
        this.b.b();
    }

    public final pae q() {
        return (pae) this.o.getValue();
    }

    public final void r() {
        if (!((qna) this.X.getValue()).b(qna.l)) {
            taf.o(this.A0, t8b.b);
            return;
        }
        xs7.E(this.a, q().b(), (ru3) null, new eab(this, (Continuation) null), 2);
    }

    public final void s() {
        this.D0.set((Object) null);
        taf.o(this.A0, new e9b(new hge(i8a.j), Integer.valueOf(phc.J)));
    }

    public final void t() {
        this.D0.set((Object) null);
        taf.o(this.A0, new e9b(new hge(i8a.p), Integer.valueOf(phc.J)));
    }

    public final void u() {
        qod E = xs7.E(this.a, (hu3) null, (ru3) null, new fab(this, (Continuation) null), 3);
        this.C0.o1(this, E0[0], E);
    }
}
