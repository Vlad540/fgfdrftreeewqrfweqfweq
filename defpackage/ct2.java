package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: ct2  reason: default package */
public final /* synthetic */ class ct2 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fu2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ct2(fu2 fu2, long j, int i) {
        this.a = i;
        this.b = fu2;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        ru3 ru3 = ru3.c;
        jue jue = jue.a;
        long j = this.c;
        fu2 fu2 = this.b;
        jba jba = (jba) obj;
        switch (this.a) {
            case 0:
                int ordinal = jba.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    xs7.D(fu2.a, fu2.Y.b().plus(sk9.a), ru3, new du2(fu2, j, (Continuation) null));
                } else if (ordinal == 3) {
                    fu2.getClass();
                    taf.o(fu2.R0, new aed(new hge(h2a.t), new ct2(fu2, j, 0)));
                }
                return jue;
            case 1:
                int ordinal2 = jba.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1) {
                    xs7.D(fu2.a, fu2.Y.b().plus(sk9.a), ru3, new du2(fu2, j, (Continuation) null));
                    y8c.a((y8c) fu2.Z.getValue(), j);
                } else if (ordinal2 != 2) {
                    if (ordinal2 == 3) {
                        fu2.getClass();
                        taf.o(fu2.R0, new aed(new hge(h2a.s), new ct2(fu2, j, 1)));
                    } else if (ordinal2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return jue;
            default:
                if (jba != jba.X) {
                    k77[] k77Arr = fu2.Z0;
                    ((luf) fu2.I0.getValue()).a(new f0d(j, false));
                }
                return jue;
        }
    }
}
