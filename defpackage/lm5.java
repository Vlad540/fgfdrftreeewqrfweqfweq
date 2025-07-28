package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: lm5  reason: default package */
public final class lm5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ lc9 w0;
    public final /* synthetic */ Object x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lm5(pj5 pj5, grd grd, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Z = pj5;
        this.w0 = grd;
        this.x0 = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lm5) n((tcd) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lm5 lm5 = new lm5(this.Z, (grd) this.w0, this.x0, continuation);
        lm5.Y = obj;
        return lm5;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            int ordinal = ((tcd) this.Y).ordinal();
            lc9 lc9 = this.w0;
            if (ordinal == 0) {
                this.X = 1;
                if (this.Z.c(lc9, this) == pu3) {
                    return pu3;
                }
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    Symbol symbol = icd.a;
                    Object obj2 = this.x0;
                    if (obj2 == symbol) {
                        lc9.f();
                    } else {
                        lc9.g(obj2);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
