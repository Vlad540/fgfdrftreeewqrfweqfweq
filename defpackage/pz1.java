package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: pz1  reason: default package */
public final class pz1 extends taf {
    public static final /* synthetic */ k77[] y0;
    public final grd X;
    public final t0c Y;
    public final l05 Z;
    public final dz1 b;
    public final grd c;
    public final t0c o;
    public final l05 w0;
    public final e3 x0;

    static {
        k77 hc9 = new hc9(pz1.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        y0 = new k77[]{hc9};
    }

    public pz1(long j, d8b d8b, c8b c8b) {
        dz1 dz1;
        int ordinal = d8b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            dz1 = new o42(j, this.a, c8b);
        } else if (ordinal == 2) {
            dz1 = new yh3(j, this.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.b = dz1;
        t97 d = z7b.a.d();
        grd a = hrd.a(hw4.a);
        this.c = a;
        this.o = new t0c(a);
        grd a2 = hrd.a((Object) null);
        this.X = a2;
        this.Y = new t0c(a2);
        this.Z = new l05(0);
        this.w0 = new l05(0);
        this.x0 = hwf.t();
        ez3.N(ez3.J(new ck5(new ik5(dz1.f(), 2), new kz1(this, (Continuation) null), 5), ((pae) d.getValue()).a()), this.a);
        ez3.N(ez3.J(new ck5(dz1.e, new lz1(this, (Continuation) null), 5), ((pae) d.getValue()).a()), this.a);
        ez3.N(ez3.J(new ck5(dz1.f, new mz1(this, (Continuation) null), 5), ((pae) d.getValue()).c()), this.a);
    }

    public final void p() {
        this.b.b();
    }
}
