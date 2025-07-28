package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: lea  reason: default package */
public final class lea {
    public final /* synthetic */ nea a;

    public lea(nea nea) {
        this.a = nea;
    }

    public final void a() {
        nea nea = this.a;
        nea.J0 = true;
        nea.setPadding(0, nea.getPaddingTop(), a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), nea.getPaddingBottom());
        View view = nea.G0;
        if (view instanceof raa) {
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(0);
                    view.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            View view2 = nea.F0;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        nea.y0.setVisibility(8);
        t97 t97 = nea.z0;
        if (t97.a()) {
            ((ddd) t97.getValue()).setVisibility(8);
        }
        t97 t972 = nea.A0;
        if (t972.a()) {
            ((mz9) t972.getValue()).setVisibility(8);
        }
        t97 t973 = nea.B0;
        if (t973.a()) {
            ((ImageView) t973.getValue()).setVisibility(8);
        }
        OneMeButton oneMeButton = nea.E0;
        if (oneMeButton != null) {
            oneMeButton.setVisibility(8);
        }
    }
}
