package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: qk3  reason: default package */
public final class qk3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wk3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qk3(wk3 wk3, Continuation continuation) {
        super(2, continuation);
        this.Y = wk3;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((qk3) n((ana) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qk3 qk3 = new qk3(this.Y, continuation);
        qk3.X = obj;
        return qk3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (((ana) this.X) instanceof ana) {
            this.Y.b();
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
