package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: bt7  reason: default package */
public final class bt7 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ez2 Z;
    public final /* synthetic */ int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bt7(ez2 ez2, int i, Continuation continuation) {
        super(2, continuation);
        this.Z = ez2;
        this.w0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bt7 bt7 = new bt7(this.Z, this.w0, continuation);
        bt7.Y = obj;
        return bt7;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        ez2 ez2 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            this.Y = ou32;
            this.X = 1;
            bv6 bv6 = (bv6) ((nfc) ez2.c).b;
            Object U = xs7.U(bv6.c.b(), new pu6(bv6, (Continuation) null), this);
            if (U == pu3) {
                return pu3;
            }
            ou3 = ou32;
            obj = U;
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ncc ncc = (ncc) obj;
        udd.q("ez2", "onStateChanged: allMediaCountResult is " + ncc);
        if (ncc instanceof jcc) {
            udd.S("ez2", "onStateChanged: error", ((jcc) ncc).a);
        } else if (ncc instanceof lcc) {
            if (this.w0 != ((Number) ((lcc) ncc).a).intValue() && n1g.A(ou3)) {
                ((s16) ez2.o).invoke();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
