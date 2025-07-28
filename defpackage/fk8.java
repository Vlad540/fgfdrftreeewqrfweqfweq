package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: fk8  reason: default package */
public final class fk8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pk8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fk8(pk8 pk8, Continuation continuation) {
        super(2, continuation);
        this.Y = pk8;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((fk8) n((wh8) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fk8 fk8 = new fk8(this.Y, continuation);
        fk8.X = obj;
        return fk8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (hhd.f((wh8) this.X, wh8.a)) {
            pk8 pk8 = this.Y;
            if (pk8.g.compareAndSet(false, true)) {
                xs7.E(pk8.f, (hu3) null, (ru3) null, new ok8(pk8, (Continuation) null), 3);
            }
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
