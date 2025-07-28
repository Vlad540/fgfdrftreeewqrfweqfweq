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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/pincode/SetupPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SetupPinCodeScreen extends Widget {
    public static final /* synthetic */ int o = 0;
    public final t97 a = createViewModelLazy(y9d.class, new wq9(28, new vfc(21)));
    public final jj7 b = new jj7(mnc.SETTINGS_PRIVACY_NEW_PINCODE);
    public final sy6 c = sy6.d;

    public SetupPinCodeScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public final sy6 getInsetsConfig() {
        return this.c;
    }

    public final rnc getScreenDelegate() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout hva = new hva(viewGroup.getContext());
        hva.setId(mqb.oneme_settings_privacy_setup_pin_code_root_view);
        hva.setListener((y9d) this.a.getValue());
        hva.setTitle(oub.oneme_settings_privacy_onboarding_come_up_pin_code);
        hva.setLocked(false);
        hva.setOnBackPress(new nya(hva, 16, this));
        return hva;
    }

    public final void onViewCreated(View view) {
        ez3.N(new ck5(wx3.e(new ik5(((y9d) this.a.getValue()).X, 2), getViewLifecycleOwner().R(), ob7.o), new l5e(2, (Continuation) null), 5), getViewLifecycleScope());
    }
}
