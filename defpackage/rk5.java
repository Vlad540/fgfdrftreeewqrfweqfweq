package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rk5  reason: default package */
public final class rk5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ pj5 w0;
    public final /* synthetic */ d5b x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rk5(long j, pj5 pj5, d5b d5b, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.w0 = pj5;
        this.x0 = d5b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rk5 rk5 = new rk5(this.Z, this.w0, this.x0, continuation);
        rk5.Y = obj;
        return rk5;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [k7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [l7c, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            long e = zp4.e(this.Z);
            hu3 coroutineContext = ou3.getCoroutineContext();
            qk5 qk5 = new qk5(new Object(), e, this.x0, new Object(), ou3, coroutineContext);
            this.X = 1;
            if (this.w0.c(qk5, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
