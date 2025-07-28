package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: yw6  reason: default package */
public final class yw6 extends FrameLayout implements iu0 {
    public final float a = (dh4.c().getDisplayMetrics().density * 16.0f);
    public final float b = (dh4.c().getDisplayMetrics().density * 6.0f);
    public long c;
    public vw6 o;
    public final ku0 w0;
    public xw6 x0;
    public final n14 y0;

    public yw6(Context context) {
        super(context, (AttributeSet) null);
        ku0 ku0 = new ku0(getContext());
        this.w0 = ku0;
        this.y0 = new n14(300);
        ku0.setClickListener(this);
        ku0.setId(a7a.L);
        addView(ku0, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void setClickListener(xw6 xw6) {
        this.x0 = xw6;
    }
}
