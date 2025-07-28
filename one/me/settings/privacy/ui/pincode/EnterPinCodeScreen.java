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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/pincode/EnterPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "dz4", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class EnterPinCodeScreen extends Widget {
    public static final /* synthetic */ k77[] X;
    public final sy6 a = sy6.d;
    public final jj7 b = new jj7(mnc.SETTINGS_PRIVACY_INSERT_PINCODE);
    public final t97 c = createViewModelLazy(iz4.class, new rh2(27, new xd3(23)));
    public final n0c o = viewBinding(mqb.oneme_settings_privacy_enter_pin_code_root);

    static {
        k77 khb = new khb(EnterPinCodeScreen.class, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0);
        m7c.a.getClass();
        X = new k77[]{khb};
    }

    public EnterPinCodeScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final rnc getScreenDelegate() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout hva = new hva(viewGroup.getContext());
        hva.setId(mqb.oneme_settings_privacy_enter_pin_code_root);
        hva.setListener((iz4) this.c.getValue());
        hva.setTitle(oub.oneme_settings_privacy_enter_pin_code_title);
        hva.setDescription(Integer.valueOf(oub.oneme_settings_privacy_enter_pin_code_description));
        hva.setLocked(true);
        hva.setOnBackPress(new cz4(this, 0));
        hva.setForgotPinCodeClickListener(new cz4(this, 1));
        return hva;
    }

    public final void onDetach(View view) {
        bm3.r(view);
    }

    public final void onViewCreated(View view) {
        t97 t97 = this.c;
        l05 l05 = ((iz4) t97.getValue()).X;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, getViewLifecycleOwner().R(), ob7), new ez4((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((iz4) t97.getValue()).Y, getViewLifecycleOwner().R(), ob7), new fz4((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((iz4) t97.getValue()).Z, getViewLifecycleOwner().R(), ob7), new gz4((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
