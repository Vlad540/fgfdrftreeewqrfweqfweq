package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: wl8  reason: default package */
public final class wl8 extends FrameLayout implements i23 {
    public final CollapsibleActionView a;

    public wl8(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
