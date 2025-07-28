package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: h59  reason: default package */
public final class h59 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ ou3 Z;
    public final /* synthetic */ r59 w0;
    public long[] x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h59(Object obj, Continuation continuation, ou3 ou3, r59 r59) {
        super(2, continuation);
        this.Y = obj;
        this.Z = ou3;
        this.w0 = r59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h59(this.Y, continuation, this.Z, this.w0);
    }

    public final Object o(Object obj) {
        long[] jArr;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            n1g.k(this.Z);
            long[] t0 = o23.t0((List) this.Y);
            this.x0 = t0;
            this.X = 1;
            r59 r59 = this.w0;
            r59.getClass();
            Object f = n1g.f(new q59(r59, (Continuation) null, t0), this);
            if (f == pu3) {
                return pu3;
            }
            long[] jArr2 = t0;
            obj = f;
            jArr = jArr2;
        } else if (i == 1) {
            jArr = this.x0;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return new wia(jArr, obj);
    }
}
