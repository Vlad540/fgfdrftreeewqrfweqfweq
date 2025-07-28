package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* renamed from: ic1  reason: default package */
public final class ic1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallMoreBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ic1(Continuation continuation, CallMoreBottomSheet callMoreBottomSheet) {
        super(2, continuation);
        this.Y = callMoreBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ic1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ic1 ic1 = new ic1(continuation, this.Y);
        ic1.X = obj;
        return ic1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (hhd.f((sg9) this.X, eh1.C)) {
            this.Y.r0(true);
        }
        return jue.a;
    }
}
