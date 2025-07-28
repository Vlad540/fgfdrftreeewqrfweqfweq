package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: anf  reason: default package */
public final class anf extends taf {
    public static final /* synthetic */ k77[] D0;
    public final l05 A0;
    public final e3 B0;
    public final e3 C0;
    public final String X = anf.class.getName();
    public final t97 Y;
    public final t97 Z;
    public final long b;
    public final long c;
    public final wjf o;
    public final t97 w0;
    public final grd x0;
    public final t0c y0;
    public final l05 z0;

    static {
        Class<anf> cls = anf.class;
        D0 = new k77[]{new hc9(cls, "toggleBiometryJob", "getToggleBiometryJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "loadWebAppSectionsJob", "getLoadWebAppSectionsJob()Lkotlinx/coroutines/Job;")};
    }

    public anf(long j, long j2) {
        StringBuilder k = hr1.k(j, "webapp_biom_s_key_", "_");
        k.append(j2);
        wjf wjf = new wjf(k.toString(), true);
        uif uif = uif.a;
        r7e d = uif.getAccessor().d(xff.class);
        r7e d2 = uif.getAccessor().d(b96.class);
        r7e d3 = uif.getAccessor().d(pae.class);
        this.b = j;
        this.c = j2;
        this.o = wjf;
        this.Y = d;
        this.Z = d2;
        this.w0 = d3;
        grd a = hrd.a(new wmf("", hw4.a));
        this.x0 = a;
        this.y0 = new t0c(a);
        this.z0 = new l05(0);
        this.A0 = new l05(0);
        this.B0 = hwf.t();
        this.C0 = hwf.t();
        q();
    }

    public final void q() {
        qod D = xs7.D(this.a, ((pae) this.w0.getValue()).b(), ru3.b, new xmf(this, (Continuation) null));
        this.C0.o1(this, D0[1], D);
    }
}
