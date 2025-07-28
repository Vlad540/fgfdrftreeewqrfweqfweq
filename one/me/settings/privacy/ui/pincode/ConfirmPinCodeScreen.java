package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/privacy/ui/pincode/ConfirmPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "hash", "(Ljava/lang/String;)V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ConfirmPinCodeScreen extends Widget {
    public static final /* synthetic */ k77[] Y;
    public final n0c X;
    public final jr a;
    public final t97 b;
    public final jj7 c;
    public final sy6 o;

    static {
        Class<ConfirmPinCodeScreen> cls = ConfirmPinCodeScreen.class;
        Y = new k77[]{new khb(cls, "hash", "getHash()Ljava/lang/String;", 0), wn6.e(m7c.a, cls, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0)};
    }

    public ConfirmPinCodeScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(String.class, "confirm_pin_code:hash");
        this.b = createViewModelLazy(zb3.class, new rh2(22, new sb3(this, 1)));
        this.c = new jj7(mnc.SETTINGS_PRIVACY_ACCEPT_PINCODE);
        this.o = sy6.d;
        this.X = viewBinding(mqb.oneme_settings_privacy_setup_pin_code_root_view);
    }

    public static final hva l0(ConfirmPinCodeScreen confirmPinCodeScreen) {
        confirmPinCodeScreen.getClass();
        return (hva) confirmPinCodeScreen.X.T0(confirmPinCodeScreen, Y[1]);
    }

    public final sy6 getInsetsConfig() {
        return this.o;
    }

    public final rnc getScreenDelegate() {
        return this.c;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout hva = new hva(viewGroup.getContext());
        hva.setId(mqb.oneme_settings_privacy_setup_pin_code_root_view);
        hva.setListener((zb3) this.b.getValue());
        hva.setTitle(oub.oneme_settings_privacy_onboarding_re_enter_pin_code);
        hva.setLocked(true);
        hva.setOnBackPress(new sb3(this, 0));
        return hva;
    }

    public final void onViewCreated(View view) {
        t97 t97 = this.b;
        ik5 ik5 = ((zb3) t97.getValue()).w0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(ik5, getViewLifecycleOwner().R(), ob7), new tb3((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((zb3) t97.getValue()).z0, getViewLifecycleOwner().R(), ob7), new l5e(2, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((zb3) t97.getValue()).y0, getViewLifecycleOwner().R(), ob7), new vb3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ConfirmPinCodeScreen(String str) {
        this(jjd.j(new wia[]{new wia("confirm_pin_code:hash", str)}));
    }
}
