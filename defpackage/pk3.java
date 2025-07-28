package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: pk3  reason: default package */
public final class pk3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wk3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pk3(wk3 wk3, Continuation continuation) {
        super(2, continuation);
        this.Y = wk3;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pk3) n((lj3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pk3 pk3 = new pk3(this.Y, continuation);
        pk3.X = obj;
        return pk3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        lj3 lj3 = (lj3) this.X;
        boolean f = hhd.f(lj3, jj3.a);
        wk3 wk3 = this.Y;
        if (f) {
            wk3.b();
        } else if (lj3 instanceof kj3) {
            wk3.b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
