package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: ew5  reason: default package */
public final class ew5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ew5(Continuation continuation, ForwardPickerScreen forwardPickerScreen) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ew5) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ew5 ew5 = new ew5(continuation, this.Y);
        ew5.X = obj;
        return ew5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ((Boolean) this.X).getClass();
        k77[] k77Arr = ForwardPickerScreen.M0;
        ForwardPickerScreen forwardPickerScreen = this.Y;
        forwardPickerScreen.y0().setStartIconDrawable(((pv5) forwardPickerScreen.u0().c).g());
        return jue.a;
    }
}
