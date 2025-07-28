package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: q59  reason: default package */
public final class q59 extends l5e implements i26 {
    public zc4 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ long[] w0;
    public final /* synthetic */ r59 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q59(r59 r59, Continuation continuation, long[] jArr) {
        super(2, continuation);
        this.w0 = jArr;
        this.x0 = r59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q59 q59 = new q59(this.x0, continuation, this.w0);
        q59.Z = obj;
        return q59;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        yc4 yc4;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Z;
            long[] jArr = this.w0;
            if (jArr.length != 0) {
                r59 r59 = this.x0;
                if (r59.i() && n1g.A(ou32)) {
                    yc4 d = xs7.d(ou32, (ju3) null, new p59(r59, (Continuation) null, jArr), 3);
                    ArrayList X2 = cs.X(new yc4[]{d, null});
                    this.Z = ou32;
                    this.X = d;
                    this.Y = 1;
                    if (lp.c(X2, this) == pu3) {
                        return pu3;
                    }
                    ou3 = ou32;
                    yc4 = d;
                }
            }
            return null;
        } else if (i == 1) {
            yc4 = this.X;
            ou3 = (ou3) this.Z;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n1g.k(ou3);
        wj3 wj3 = (wj3) yc4.m();
        if (wj3 == null) {
            return null;
        }
        return new wia(wj3, (Object) null);
    }
}
