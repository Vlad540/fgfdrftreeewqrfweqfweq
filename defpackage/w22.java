package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: w22  reason: default package */
public final class w22 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ y22 Z;
    public final /* synthetic */ i22 w0;
    public final /* synthetic */ List x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w22(Object obj, Continuation continuation, y22 y22, i22 i22, List list) {
        super(2, continuation);
        this.Y = obj;
        this.Z = y22;
        this.w0 = i22;
        this.x0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w22(this.Y, continuation, this.Z, this.w0, this.x0);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            long longValue = ((Number) this.Y).longValue();
            y22 y22 = this.Z;
            long j = y22.b;
            i22 i22 = this.w0;
            long j2 = i22.b.a;
            int d = i22.d(longValue);
            this.X = 1;
            ((gy9) ((pk) ((de4) y22.Y.getValue()).a.getValue())).J(j, j2, this.x0, true, d);
            if (jue2 == jue) {
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
