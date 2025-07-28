package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: wb7  reason: default package */
public final class wb7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ yb7 Y;
    public final /* synthetic */ i26 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wb7(yb7 yb7, ub7 ub7, Continuation continuation) {
        super(2, continuation);
        this.Y = yb7;
        this.Z = ub7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wb7) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wb7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            pc7 pc7 = ((ac7) this.Y).a;
            this.X = 1;
            ob7 ob7 = ob7.c;
            ha4 ha4 = oi4.a;
            if (xs7.U(MainDispatcherLoader.dispatcher.getImmediate(), new ila(pc7, ob7, this.Z, (Continuation) null), this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
