package one.me.settings.privacy.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/ChangeDisabledDialog;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChangeDisabledDialog extends BottomSheetWidget {
    public static final /* synthetic */ int C0 = 0;

    public ChangeDisabledDialog() {
        super((Bundle) null, 1, (x54) null);
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return new yy1(this, frameLayout.getContext());
    }
}
