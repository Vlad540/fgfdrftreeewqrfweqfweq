package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;

/* renamed from: o87  reason: default package */
public final class o87 extends TabLayout implements mhe {
    public final t97 q1 = ez3.O(3, new fs5(29));

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.material.tabs.TabLayout, android.view.View, java.lang.Object, android.view.ViewGroup, o87] */
    public o87(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSelectedTabIndicator(getIndicatorDrawable());
        s59 s59 = km4.y0;
        setSelectedTabIndicatorColor(s59.r(this).b().a.g);
        setTabIndicatorFullWidth(false);
        afa.a(this, new vp6(4, this, this));
        setTabIndicatorAnimationMode(1);
        setTabTextColors(TabLayout.f(s59.r(this).getText().e, s59.r(this).getText().f));
        setBackgroundColor(0);
        setTabRippleColor((ColorStateList) null);
        setClipToPadding(false);
        int X = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
        Class<TabLayout> cls = TabLayout.class;
        ct0.J(m7c.a(cls), this, "tabPaddingStart", Integer.valueOf(X));
        ct0.J(m7c.a(cls), this, "tabPaddingEnd", Integer.valueOf(X));
    }

    /* access modifiers changed from: private */
    public final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.q1.getValue();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.material.tabs.TabLayout, android.view.View, android.view.ViewGroup, o87] */
    public final void onThemeChanged(pda pda) {
        setSelectedTabIndicatorColor(pda.b().a.g);
        s59 s59 = km4.y0;
        setTabTextColors(TabLayout.f(s59.r(this).getText().e, s59.r(this).getText().f));
        km4.d(s59.n(getContext()), this);
    }
}
