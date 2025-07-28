package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: fz4  reason: default package */
public final class fz4 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ EnterPinCodeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fz4(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.Y = enterPinCodeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fz4 fz4 = new fz4(continuation, this.Y);
        fz4.X = obj;
        return fz4;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        jue jue = (jue) this.X;
        ex9 onBackPressedDispatcher = this.Y.getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.d();
        }
        return jue.a;
    }
}
