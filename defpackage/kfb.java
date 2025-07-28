package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: kfb  reason: default package */
public final /* synthetic */ class kfb implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fgb b;

    public /* synthetic */ kfb(fgb fgb, int i) {
        this.a = i;
        this.b = fgb;
    }

    public final Object invoke(Object obj) {
        jba jba = (jba) obj;
        switch (this.a) {
            case 0:
                int ordinal = jba.ordinal();
                fgb fgb = this.b;
                if (ordinal == 0 || ordinal == 1) {
                    xs7.D(fgb.a, fgb.u().b().plus(sk9.a), ru3.c, new dgb(fgb, (Continuation) null));
                    fgb.s();
                } else {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            fgb.A();
                        } else if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    fgb.W0 = false;
                }
                return jue.a;
            case 1:
                int ordinal2 = jba.ordinal();
                fgb fgb2 = this.b;
                if (ordinal2 == 0 || ordinal2 == 1) {
                    xs7.D(fgb2.a, fgb2.u().b().plus(sk9.a), ru3.c, new dgb(fgb2, (Continuation) null));
                } else {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            fgb2.getClass();
                            taf.o(fgb2.E0, new web(new hge(l8a.F2), new kfb(fgb2, 1)));
                        } else if (ordinal2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    fgb2.W0 = false;
                }
                return jue.a;
            default:
                if (jba == jba.X) {
                    fgb fgb3 = this.b;
                    xs7.E(fgb3.a, fgb3.u().b(), (ru3) null, new egb(fgb3, (Continuation) null), 2);
                }
                return jue.a;
        }
    }
}
