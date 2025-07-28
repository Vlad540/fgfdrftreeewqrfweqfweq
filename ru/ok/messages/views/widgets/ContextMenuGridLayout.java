package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ContextMenuGridLayout extends dc6 {
    public final zg4 T0 = zg4.b();

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, ru.ok.messages.views.widgets.ContextMenuGridLayout] */
    public ContextMenuGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.view.View, android.view.ViewGroup, ru.ok.messages.views.widgets.ContextMenuGridLayout] */
    public void setupText(String str) {
        View inflate = View.inflate(getContext(), zrb.row_context_menu_action, (ViewGroup) null);
        ((ImageView) inflate.findViewById(yqb.row_options_action__iv_icon)).setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(yqb.row_options_action__tv_title);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setGravity(8388611);
        ac6 ac6 = new ac6();
        cc6 cc6 = ac6.a;
        ac6.a = new cc6(cc6.a, cc6.b, dc6.d(7, false), cc6.d);
        cc6 cc62 = ac6.b;
        ac6.b = new cc6(cc62.a, cc62.b, dc6.d(7, true), cc62.d);
        ac6.width = -1;
        ac6.height = -1;
        addView(inflate, ac6);
        Context context = getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        int i = this.T0.q;
        int i2 = E.M;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            ImageView imageView = (ImageView) childAt.findViewById(yqb.row_options_action__iv_icon);
            imageView.setColorFilter(E.w);
            imageView.setBackground(swb.c(E.I, E.i, 0, i));
            ((TextView) childAt.findViewById(yqb.row_options_action__tv_title)).setTextColor(i2);
        }
    }
}
