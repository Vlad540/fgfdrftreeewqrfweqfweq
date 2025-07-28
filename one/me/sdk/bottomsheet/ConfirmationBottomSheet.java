package one.me.sdk.bottomsheet;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0015\b\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lone/me/sdk/bottomsheet/ConfirmationBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "jc3", "kc3", "lc3", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ConfirmationBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] K0;
    public final jr C0;
    public final jr D0;
    public final jr E0;
    public final jr F0;
    public final jr G0;
    public final boolean H0;
    public final jr I0;
    public final rnc J0;

    static {
        Class<ConfirmationBottomSheet> cls = ConfirmationBottomSheet.class;
        K0 = new k77[]{new khb(cls, "icon", "getIcon()Ljava/lang/Integer;", 0), m4b.g(m7c.a, cls, "title", "getTitle()Lone/me/sdk/uikit/common/TextSource;", 0), new khb(cls, "description", "getDescription()Lone/me/sdk/uikit/common/TextSource;", 0), new khb(cls, "buttons", "getButtons()Ljava/util/ArrayList;", 0), new khb(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), new hc9(cls, "isCallbackSent", "isCallbackSent()Z")};
    }

    public ConfirmationBottomSheet() {
        this((Bundle) null, 1, (x54) null);
    }

    public final rnc getScreenDelegate() {
        return this.J0;
    }

    public final void t0() {
        lc3 targetController = getTargetController();
        lc3 lc3 = null;
        lc3 lc32 = targetController instanceof lc3 ? targetController : null;
        if (lc32 != null) {
            lc32.G();
        }
        k77[] k77Arr = K0;
        k77 k77 = k77Arr[5];
        if (!((Boolean) this.I0.a(this)).booleanValue()) {
            lc3 targetController2 = getTargetController();
            if (targetController2 instanceof lc3) {
                lc3 = targetController2;
            }
            if (lc3 != null) {
                k77 k772 = k77Arr[4];
                lc3.E((Bundle) this.G0.a(this));
            }
        }
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        k77[] k77Arr = K0;
        k77 k77 = k77Arr[1];
        CharSequence a = ((mge) this.D0.a(this)).a(getContext());
        if (a != null) {
            k77 k772 = k77Arr[2];
            mge mge = (mge) this.E0.a(this);
            CharSequence a2 = mge != null ? mge.a(layoutInflater.getContext()) : null;
            k77 k773 = k77Arr[3];
            return new mc3(this, a, a2, (ArrayList) this.F0.a(this), layoutInflater.getContext());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final boolean x0() {
        return this.H0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConfirmationBottomSheet(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }

    public ConfirmationBottomSheet(Bundle bundle) {
        super(bundle);
        jj7 jj7;
        mnc mnc;
        mnc mnc2 = null;
        this.C0 = new jr(Integer.class, (Object) null, "icon");
        Class<mge> cls = mge.class;
        this.D0 = new jr(cls, "title");
        this.E0 = new jr(cls, (Object) null, "description");
        this.F0 = new jr(ArrayList.class, new ArrayList(), "buttons");
        this.G0 = new jr(Bundle.class, (Object) null, ApiProtocol.PARAM_PAYLOAD);
        this.H0 = getArgs().getBoolean("memorize_keyboard", true);
        this.I0 = new jr(Boolean.class, Boolean.FALSE, "callback_sent");
        String string = getArgs().getString("stat_screen");
        if (string != null) {
            try {
                mnc = mnc.valueOf(string);
            } catch (Throwable th) {
                mnc = new kcc(th);
            }
            mnc mnc3 = !(mnc instanceof kcc) ? mnc : mnc2;
            if (mnc3 != null) {
                jj7 = new jj7(mnc3);
                this.J0 = jj7;
            }
        }
        jj7 = super.getScreenDelegate();
        this.J0 = jj7;
    }
}
