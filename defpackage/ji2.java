package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ji2  reason: default package */
public final class ji2 extends l5e implements i26 {
    public pk X;
    public int Y;
    public final /* synthetic */ ki2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ji2(ki2 ki2, Continuation continuation) {
        super(2, continuation);
        this.Z = ki2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ji2(this.Z, continuation);
    }

    public final Object o(Object obj) {
        pk pkVar;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ki2 ki2 = this.Z;
            pk pkVar2 = ki2.b;
            this.X = pkVar2;
            this.Y = 1;
            obj = ez3.D(ki2.a, this);
            if (obj == pu3) {
                return pu3;
            }
            pkVar = pkVar2;
        } else if (i == 1) {
            pkVar = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        gy9 gy9 = (gy9) pkVar;
        gy9.getClass();
        gy9.v(gy9, new cp0(((j2b) gy9.z()).a.n(), longValue, 1));
        return jue.a;
    }
}
