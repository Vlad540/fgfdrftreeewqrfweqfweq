package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ru.ok.messages.settings.FrgBaseSettings;

/* renamed from: bge  reason: default package */
public final class bge extends g4d {
    public final TextView T0;

    public bge(ViewGroup viewGroup, LayoutInflater layoutInflater, FrgBaseSettings frgBaseSettings) {
        super(viewGroup, frgBaseSettings);
        TextView textView = (TextView) layoutInflater.inflate(zrb.row_setting_text, viewGroup, false);
        this.T0 = textView;
        Context context = textView.getContext();
        r7e r7e = wce.a0;
        textView.setTextColor(fja.E(context).F);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(yqb.row_setting__fl_value);
        frameLayout.addView(textView);
        frameLayout.setVisibility(0);
    }

    public final void A(e4d e4d, boolean z) {
        super.A(e4d, z);
        Object obj = e4d.X;
        TextView textView = this.T0;
        if (obj != null) {
            textView.setVisibility(0);
            textView.setText((String) obj);
            return;
        }
        textView.setVisibility(8);
    }
}
