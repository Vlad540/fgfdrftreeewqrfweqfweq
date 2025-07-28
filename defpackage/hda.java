package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;

/* renamed from: hda  reason: default package */
public final class hda extends TabLayout implements mhe {
    public final ida q1 = ((ida) jda.a.getValue());
    public final t97 r1 = ez3.O(3, new qk8(16, this));

    public hda(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setSelectedTabIndicator((Drawable) getIndicatorDrawable());
        km4.y0.r(this);
        super.setSelectedTabIndicatorColor(-16745729);
        super.setTabIndicatorFullWidth(false);
        setBackgroundColor(0);
        setTabRippleColor((ColorStateList) null);
        setClipToPadding(false);
        float f = (float) 4;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), getPaddingBottom());
        ct0.J(m7c.a(TabLayout.class), this, "requestedTabMinWidth", 0);
    }

    private final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.r1.getValue();
    }

    public final void onThemeChanged(pda pda) {
        pda.h();
        super.setSelectedTabIndicatorColor(-16745729);
        km4.d(km4.y0.n(getContext()), this);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.height = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
        }
        super.setLayoutParams(layoutParams);
    }
}
