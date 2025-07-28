package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: uzb  reason: default package */
public final class uzb implements View.OnLayoutChangeListener {
    public final /* synthetic */ vzb a;
    public final /* synthetic */ View b;
    public final /* synthetic */ long c;

    public uzb(vzb vzb, View view, long j) {
        this.a = vzb;
        this.b = view;
        this.c = j;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.b;
        vzb vzb = this.a;
        Rect c2 = vzb.c(vzb, view2);
        if (c2 != null) {
            vzb.b.d(this.c, c2);
        }
    }
}
