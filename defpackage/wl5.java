package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: wl5  reason: default package */
public final class wl5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ k26 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wl5(gj4 gj4, ox2 ox2, Continuation continuation) {
        super(2, continuation);
        this.Z = gj4;
        this.w0 = ox2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wl5) n((rj5) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wl5 wl5 = new wl5((gj4) this.Z, this.w0, continuation);
        wl5.Y = obj;
        return wl5;
    }

    public final Object o(Object obj) {
        vl5 vl5;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            pj5 pj5 = this.Z;
            vl5 vl52 = new vl5(this.w0, (rj5) this.Y);
            try {
                this.Y = vl52;
                this.X = 1;
                if (pj5.c(vl52, this) == pu3) {
                    return pu3;
                }
            } catch (AbortFlowException e) {
                e = e;
                vl5 = vl52;
                if (e.a != vl5) {
                    throw e;
                }
                return jue.a;
            }
        } else if (i == 1) {
            vl5 = (vl5) this.Y;
            try {
                wx3.H(obj);
            } catch (AbortFlowException e2) {
                e = e2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
