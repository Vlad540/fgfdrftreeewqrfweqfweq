package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ii2  reason: default package */
public final class ii2 extends l5e implements i26 {
    public ki2 X;
    public pk Y;
    public int Z;
    public final /* synthetic */ ki2 w0;
    public final /* synthetic */ String x0;
    public final /* synthetic */ long y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ii2(ki2 ki2, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.w0 = ki2;
        this.x0 = str;
        this.y0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ii2(this.w0, this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        ki2 ki2;
        pk pkVar;
        pu3 pu3 = pu3.a;
        int i = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ki2 = this.w0;
            pk pkVar2 = ki2.b;
            this.X = ki2;
            this.Y = pkVar2;
            this.Z = 1;
            Object D = ez3.D(ki2.a, this);
            if (D == pu3) {
                return pu3;
            }
            pkVar = pkVar2;
            obj = D;
        } else if (i == 1) {
            pkVar = this.Y;
            ki2 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        gy9 gy9 = (gy9) pkVar;
        ki2.i = gy9.v(gy9, new b99(this.x0, ((j2b) gy9.z()).a.n(), longValue, this.y0));
        return jue.a;
    }
}
