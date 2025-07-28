package one.me.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/SettingsAvatarBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "a6d", "settings-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SettingsAvatarBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] G0;
    public final jr C0;
    public final jr D0;
    public final jr E0 = new jr(ArrayList.class, new ArrayList(), "buttons");
    public final jr F0 = new jr(Boolean.class, Boolean.FALSE, "callback_sent");

    static {
        Class<SettingsAvatarBottomSheet> cls = SettingsAvatarBottomSheet.class;
        G0 = new k77[]{new khb(cls, "title", "getTitle()Lone/me/sdk/uikit/common/TextSource;", 0), m4b.g(m7c.a, cls, "description", "getDescription()Lone/me/sdk/uikit/common/TextSource;", 0), new khb(cls, "buttons", "getButtons()Ljava/util/ArrayList;", 0), new khb(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), new hc9(cls, "isCallbackSent", "isCallbackSent()Z")};
    }

    public SettingsAvatarBottomSheet(Bundle bundle, x54 x54) {
        super(bundle);
        Class<mge> cls = mge.class;
        this.C0 = new jr(cls, "title");
        this.D0 = new jr(cls, (Object) null, "description");
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        k77[] k77Arr = G0;
        k77 k77 = k77Arr[0];
        CharSequence a = ((mge) this.C0.a(this)).a(getContext());
        if (a != null) {
            k77 k772 = k77Arr[1];
            mge mge = (mge) this.D0.a(this);
            CharSequence a2 = mge != null ? mge.a(layoutInflater.getContext()) : null;
            k77 k773 = k77Arr[2];
            return new b6d(this, a, a2, (ArrayList) this.E0.a(this), layoutInflater.getContext());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public SettingsAvatarBottomSheet() {
        super((Bundle) null);
        Class<mge> cls = mge.class;
        this.C0 = new jr(cls, "title");
        this.D0 = new jr(cls, (Object) null, "description");
    }
}
