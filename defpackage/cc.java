package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cc  reason: default package */
public final class cc extends taf {
    public static final /* synthetic */ k77[] x0;
    public final e3 X = hwf.t();
    public final hcd Y;
    public final grd Z;
    public final long b;
    public final qb c;
    public final t97 o;
    public final bc w0;

    static {
        k77 hc9 = new hc9(cc.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        x0 = new k77[]{hc9};
    }

    public cc(long j, qb qbVar, t97 t97, t97 t972) {
        this.b = j;
        this.c = qbVar;
        this.o = t97;
        hcd b2 = icd.b(0, 0, 0, 7);
        this.Y = b2;
        grd a = hrd.a((Object) null);
        this.Z = a;
        this.w0 = new bc(new v11(qbVar.j, b2, new c3(this, (Continuation) null, 1), 4), 0, this);
        if (qbVar.g.compareAndSet(false, true)) {
            xs7.E(qbVar.f, (hu3) null, (ru3) null, new pb(qbVar, (Continuation) null), 3);
        }
        ez3.N(new ck5(qbVar.l, new wb(this, (Continuation) null), 5), this.a);
        ez3.N(new ck5(ez3.z(ez3.x(a, 200)), new yb(this, t972, (Continuation) null), 5), this.a);
    }

    public final boolean q() {
        CharSequence charSequence = (CharSequence) this.Z.getValue();
        return !(charSequence == null || charSequence.length() == 0);
    }
}
