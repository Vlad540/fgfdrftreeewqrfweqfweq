package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: p14  reason: default package */
public final class p14 {
    public static final /* synthetic */ int g = 0;
    public final o14 a;
    public final Runnable b;
    public final u16 c;
    public final qmc d;
    public final ajb e = new ajb();
    public c97 f;

    static {
        int i = zp4.o;
        mt0.P(100, eq4.c);
    }

    public p14(o14 o14, tg0 tg0, u16 u16) {
        qmc a2 = cnc.a();
        this.a = o14;
        this.b = tg0;
        this.c = u16;
        this.d = a2;
        a();
    }

    public final void a() {
        o14 o14 = this.a;
        if (o14 instanceof o14) {
            nu9 n = this.e.t(zp4.e(o14.a), TimeUnit.MILLISECONDS).n(this.d);
            c97 c97 = new c97(new lhd(12, (Object) this), new mod(12, this), z3d.i);
            n.a(c97);
            this.f = c97;
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
