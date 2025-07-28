package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: jqd  reason: default package */
public final class jqd extends LinearLayout implements mhe {
    public static final /* synthetic */ k77[] y0;
    public final StateListDrawable a;
    public final t97 b = ez3.O(3, new u5b(24, this));
    public final r7e c;
    public final yj o;
    public ValueAnimator w0;
    public int x0;

    static {
        k77 hc9 = new hc9(jqd.class, "expandableState", "getExpandableState()Lone/me/sdk/uikit/common/chat/StartMiniAppActionView$ExpandableState;");
        m7c.a.getClass();
        y0 = new k77[]{hc9};
    }

    public jqd(Context context) {
        super(context, (AttributeSet) null);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dh4.c().getDisplayMetrics().density * 20.0f);
        stateListDrawable.addState(new int[]{16842910}, gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(dh4.c().getDisplayMetrics().density * 20.0f);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
        this.a = stateListDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(qhc.S);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        appCompatImageView.setImageDrawable(getLeftOuterDrawable());
        this.c = new r7e(new shd(context, 7));
        this.o = new yj(this);
        setMinimumWidth(a24.X(((float) 44) * dh4.c().getDisplayMetrics().density));
        setOrientation(0);
        addView(appCompatImageView);
        onThemeChanged(km4.y0.r(this));
        setBackground(stateListDrawable);
        float f = (float) 10;
        float f2 = (float) 6;
        setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
    }

    public static final void a(jqd jqd) {
        r7e r7e = jqd.c;
        if (r7e.a()) {
            TextView textView = (TextView) r7e.getValue();
            jqd.x0 = textView.getMeasuredWidth();
            ValueAnimator valueAnimator = jqd.w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator b2 = b(jqd, textView, true);
            jqd.w0 = b2;
            b2.start();
        }
    }

    public static final ValueAnimator b(jqd jqd, TextView textView, boolean z) {
        int i = 0;
        int i2 = z ? jqd.x0 : 0;
        if (z) {
            jqd.getClass();
        } else {
            i = jqd.x0;
        }
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i2, i}).setDuration(150);
        duration.addUpdateListener(new c00(19, textView));
        duration.addListener(new iqd(z, textView, 1));
        duration.addListener(new iqd(z, textView, 0));
        return duration;
    }

    private final Drawable getLeftOuterDrawable() {
        return (Drawable) this.b.getValue();
    }

    public final hqd getExpandableState() {
        k77 k77 = y0[0];
        return (hqd) this.o.b;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a24.X(((float) 36) * dh4.c().getDisplayMetrics().density), 1073741824));
    }

    public final void onThemeChanged(pda pda) {
        Drawable leftOuterDrawable = getLeftOuterDrawable();
        pda.getIcon();
        js.D(leftOuterDrawable, -1);
        StateListDrawable stateListDrawable = this.a;
        pda.b().a.getClass();
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{16842910}))).setColor(-16745729);
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{-16842910}))).setColor(pda.c().a.r);
    }

    public final void setExpandableState(hqd hqd) {
        this.o.o1(this, y0[0], hqd);
    }

    public final void setText(CharSequence charSequence) {
        r7e r7e = this.c;
        if (charSequence != null && charSequence.length() != 0) {
            ek8.d(this, (View) r7e.getValue(), -1);
            ((TextView) r7e.getValue()).setText(charSequence);
            ((View) r7e.getValue()).setVisibility(0);
        } else if (r7e.a()) {
            TextView textView = (TextView) r7e.getValue();
            a(this);
        }
    }
}
