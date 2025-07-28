package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

public final class b extends b7c {
    public final TextView J0;
    public final MaterialCalendarGridView K0;

    public b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(lob.month_title);
        this.J0 = textView;
        WeakHashMap weakHashMap = eaf.a;
        new p9f(wpb.tag_accessibility_heading, Boolean.class, 0, 28, 2).g(textView, Boolean.TRUE);
        this.K0 = (MaterialCalendarGridView) linearLayout.findViewById(lob.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
