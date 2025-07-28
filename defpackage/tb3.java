package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: tb3  reason: default package */
public final class tb3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPinCodeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tb3(Continuation continuation, ConfirmPinCodeScreen confirmPinCodeScreen) {
        super(2, continuation);
        this.Y = confirmPinCodeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tb3 tb3 = new tb3(continuation, this.Y);
        tb3.X = obj;
        return tb3;
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [hc3, android.view.ViewGroup] */
    public final Object o(Object obj) {
        wx3.H(obj);
        int ordinal = ((wb3) this.X).ordinal();
        ConfirmPinCodeScreen confirmPinCodeScreen = this.Y;
        if (ordinal == 0) {
            ConfirmPinCodeScreen.l0(confirmPinCodeScreen).setErrorText((CharSequence) null);
            ? r5 = ConfirmPinCodeScreen.l0(confirmPinCodeScreen).N0;
            int childCount = r5.getChildCount();
            for (int i = 0; i < childCount; i++) {
                hx6 H0 = r5.H0(i);
                if (H0 != null) {
                    ((jkd) H0).L0.setText((CharSequence) null);
                }
            }
            r5.K0();
            ConfirmPinCodeScreen.l0(confirmPinCodeScreen).setState(ec3.NORMAL);
        } else if (ordinal == 1) {
            ConfirmPinCodeScreen.l0(confirmPinCodeScreen).setErrorText((CharSequence) null);
            ConfirmPinCodeScreen.l0(confirmPinCodeScreen).setState(ec3.SUCCESS);
        } else if (ordinal == 2) {
            ConfirmPinCodeScreen.l0(confirmPinCodeScreen).setErrorText(d8.u(confirmPinCodeScreen.getContext(), oub.oneme_settings_privacy_onboarding_error_pin_code_equals));
            ConfirmPinCodeScreen.l0(confirmPinCodeScreen).setState(ec3.ERROR);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
