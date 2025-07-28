package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: gz4  reason: default package */
public final class gz4 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ EnterPinCodeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gz4(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.Y = enterPinCodeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gz4 gz4 = new gz4(continuation, this.Y);
        gz4.X = obj;
        return gz4;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        jue jue = (jue) this.X;
        k77[] k77Arr = BottomSheetWidget.B0;
        ForgotPinCodeDialog forgotPinCodeDialog = new ForgotPinCodeDialog();
        rr3 rr3 = this.Y;
        forgotPinCodeDialog.setTargetController(rr3);
        rr3 rr32 = rr3;
        while (rr32.getParentController() != null) {
            rr32 = rr32.getParentController();
        }
        sgc sgc = null;
        ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
        if (ygc != null) {
            sgc = ygc.S();
        }
        sgc sgc2 = sgc;
        forgotPinCodeDialog.y0(rr3);
        if (sgc2 != null) {
            vgc vgc = new vgc(forgotPinCodeDialog, (String) null, (wr3) null, (wr3) null, false, -1);
            rf0.k(false, vgc, true, "forgot-pin");
            sgc2.G(vgc);
        }
        return jue.a;
    }
}
