package one.me.sdk.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
public abstract class BottomSheetWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ k77[] B0;
    public final cs3 A0;
    public final boolean w0;
    public sm4 x0;
    public View y0;
    public final jr z0;

    static {
        k77 hc9 = new hc9(BottomSheetWidget.class, "wasKeyboardOpened", "getWasKeyboardOpened()Z");
        m7c.a.getClass();
        B0 = new k77[]{hc9};
    }

    public BottomSheetWidget() {
        this((Bundle) null, 1, (x54) null);
    }

    public final void onContextAvailable(Context context) {
        BottomSheetWidget.super.onContextAvailable(context);
        getRouter().a(this.A0);
    }

    public final void onContextUnavailable() {
        BottomSheetWidget.super.onContextUnavailable();
        getRouter().K(this.A0);
    }

    public void onDestroyView(View view) {
        this.x0 = null;
        super.onDestroyView(view);
    }

    public final void v0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        int X = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        float f = (float) 12;
        frameLayout.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), X, a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(((float) 15) * dh4.c().getDisplayMetrics().density));
        frameLayout.addView(w0(layoutInflater, frameLayout), new ViewGroup.LayoutParams(-1, -2));
        sm4 sm4 = new sm4(frameLayout.getContext());
        sm4.setTranslationY((float) me4.c((float) 6, dh4.c().getDisplayMetrics().density, -X));
        this.x0 = sm4;
        frameLayout.addView(sm4);
    }

    public abstract View w0(LayoutInflater layoutInflater, FrameLayout frameLayout);

    public boolean x0() {
        return this.w0;
    }

    public final void y0(rr3 rr3) {
        while (rr3.getParentController() != null) {
            rr3 = rr3.getParentController();
        }
        sgc sgc = null;
        ygc ygc = rr3 instanceof ygc ? (ygc) rr3 : null;
        if (ygc != null) {
            sgc = ygc.C();
        }
        if (sgc != null) {
            sgc.a(new hq0(sgc, this));
        }
    }

    public BottomSheetWidget(Bundle bundle) {
        super(bundle);
        this.w0 = true;
        this.z0 = new jr(Boolean.class, Boolean.FALSE, "was_keyboard_opened");
        this.A0 = new cs3(getInstanceId(), new gq0(this, 0), new gq0(this, 1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomSheetWidget(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }
}
