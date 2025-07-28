package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class g extends e {
    public final View N0;
    public final ImageView O0;
    public final ProgressBar P0;
    public final TextView Q0;
    public final RelativeLayout R0;
    public final CheckBox S0;
    public final float T0;
    public final int U0;
    public final jsc V0 = new jsc(9, this);
    public final /* synthetic */ hb8 W0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(hb8 hb8, View view) {
        super(hb8.B0, view, (ImageButton) view.findViewById(gob.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(gob.mr_cast_volume_slider));
        this.W0 = hb8;
        this.N0 = view;
        this.O0 = (ImageView) view.findViewById(gob.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(gob.mr_cast_route_progress_bar);
        this.P0 = progressBar;
        this.Q0 = (TextView) view.findViewById(gob.mr_cast_route_name);
        this.R0 = (RelativeLayout) view.findViewById(gob.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(gob.mr_cast_checkbox);
        this.S0 = checkBox;
        jb8 jb8 = hb8.B0;
        Context context = jb8.C0;
        Drawable n = am7.n(context, znb.mr_cast_checkbox);
        if (fc8.i(context)) {
            um4.g(n, hq3.a(context, fc8.a));
        }
        checkBox.setButtonDrawable(n);
        fc8.j(jb8.C0, progressBar);
        this.T0 = fc8.d(jb8.C0);
        Resources resources = jb8.C0.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(tmb.mr_dynamic_dialog_row_height, typedValue, true);
        this.U0 = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean D(xb8 xb8) {
        if (xb8.g()) {
            return true;
        }
        x3a b = this.W0.B0.x0.b(xb8);
        if (b != null) {
            lb8 lb8 = (lb8) b.b;
            if ((lb8 != null ? lb8.b : 1) == 3) {
                return true;
            }
        }
        return false;
    }

    public final void F(boolean z, boolean z2) {
        CheckBox checkBox = this.S0;
        int i = 0;
        checkBox.setEnabled(false);
        this.N0.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.O0.setVisibility(4);
            this.P0.setVisibility(0);
        }
        if (z2) {
            if (z) {
                i = this.U0;
            }
            this.W0.C(this.R0, i);
        }
    }
}
