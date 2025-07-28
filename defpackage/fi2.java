package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fi2  reason: default package */
public final class fi2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hi2 Y;
    public final /* synthetic */ ym8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fi2(hi2 hi2, ym8 ym8, Continuation continuation) {
        super(2, continuation);
        this.Y = hi2;
        this.Z = ym8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fi2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fi2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        boolean z = true;
        hi2 hi2 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ez3.D(((ki2) hi2.a).a, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        ym8 ym8 = this.Z;
        vo8 j = ((to8) ((t97) hi2.d).getValue()).j(longValue, ym8.a);
        if (j == null) {
            long s = ((f03) ((t97) hi2.f).getValue()).s();
            t97 t97 = (t97) hi2.d;
            j = ((to8) t97.getValue()).q(((to8) t97.getValue()).f(longValue, s, this.Z));
            t52 t52 = (t52) ((t97) hi2.e).getValue();
            if (ym8.o != s) {
                z = false;
            }
            t52.T(longValue, z, j, false, 0);
        }
        return j;
    }
}
