package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: w82  reason: default package */
public final class w82 extends l5e implements i26 {
    public b92 X;
    public int Y;
    public final /* synthetic */ b92 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ i22 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w82(b92 b92, long j, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.Z = b92;
        this.w0 = j;
        this.x0 = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w82(this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        b92 b92;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            b92 b922 = this.Z;
            if (b922.I0.get()) {
                ConcurrentHashMap concurrentHashMap = b922.J0;
                long j = this.w0;
                concurrentHashMap.put(new Long(j), new v82((Object) b922, j, (Object) this.x0, 0));
                return jue;
            }
            udc e = b922.e();
            this.X = b922;
            this.Y = 1;
            obj = e.d(this);
            if (obj == pu3) {
                return pu3;
            }
            b92 = b922;
        } else if (i == 1) {
            b92 = this.X;
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.X = null;
        this.Y = 2;
        return b92.j(b92, (List) obj, false, this) == pu3 ? pu3 : jue;
    }
}
