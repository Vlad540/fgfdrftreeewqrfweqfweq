package androidx.mediarouter.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public final class f extends e {
    public final TextView N0;
    public final int O0;
    public final /* synthetic */ hb8 P0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(hb8 hb8, View view) {
        super(hb8.B0, view, (ImageButton) view.findViewById(gob.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(gob.mr_cast_volume_slider));
        this.P0 = hb8;
        this.N0 = (TextView) view.findViewById(gob.mr_group_volume_route_name);
        Resources resources = hb8.B0.C0.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(tmb.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.O0 = (int) typedValue.getDimension(displayMetrics);
    }
}
