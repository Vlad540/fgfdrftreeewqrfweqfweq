package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: p9c  reason: default package */
public final class p9c extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pc7 Z;
    public final /* synthetic */ ob7 w0;
    public final /* synthetic */ i26 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p9c(pc7 pc7, ob7 ob7, i26 i26, Continuation continuation) {
        super(2, continuation);
        this.Z = pc7;
        this.w0 = ob7;
        this.x0 = i26;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p9c) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p9c p9c = new p9c(this.Z, this.w0, this.x0, continuation);
        p9c.Y = obj;
        return p9c;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ha4 ha4 = oi4.a;
            zr7 immediate = MainDispatcherLoader.dispatcher.getImmediate();
            i26 i26 = this.x0;
            o9c o9c = new o9c(this.Z, this.w0, (ou3) this.Y, i26, (Continuation) null);
            this.X = 1;
            if (xs7.U(immediate, o9c, this) == pu3) {
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
