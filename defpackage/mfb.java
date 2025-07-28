package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: mfb  reason: default package */
public final class mfb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mfb(fgb fgb, Continuation continuation) {
        super(2, continuation);
        this.Y = fgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((nab) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mfb mfb = new mfb(this.Y, continuation);
        mfb.X = obj;
        return mfb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        nab nab = (nab) this.X;
        boolean z = nab instanceof kab;
        fgb fgb = this.Y;
        if (z) {
            kab kab = (kab) nab;
            Long l = kab.a;
            long g = fgb.T0.g();
            if (l != null && l.longValue() == g) {
                xs7.E(fgb.a, fgb.u().b(), (ru3) null, new tfb(fgb, (Continuation) null), 2);
                taf.o(fgb.E0, new bfb(kab.b, Integer.valueOf(phc.J)));
            }
        } else if (nab instanceof lab) {
            Long l2 = ((lab) nab).a;
            long g2 = fgb.T0.g();
            if (l2 != null && l2.longValue() == g2) {
                taf.o(fgb.E0, new bfb(new hge(l8a.Y), Integer.valueOf(l9a.l)));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
