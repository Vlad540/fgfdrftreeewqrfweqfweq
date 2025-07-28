package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: vb3  reason: default package */
public final class vb3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPinCodeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vb3(Continuation continuation, ConfirmPinCodeScreen confirmPinCodeScreen) {
        super(2, continuation);
        this.Y = confirmPinCodeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vb3 vb3 = new vb3(continuation, this.Y);
        vb3.X = obj;
        return vb3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        hba hba = new hba((Widget) this.Y);
        hba.i(p0e.I((String) this.X));
        hba.j();
        return jue.a;
    }
}
