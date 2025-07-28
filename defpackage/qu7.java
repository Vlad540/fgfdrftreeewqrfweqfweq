package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: qu7  reason: default package */
public final class qu7 extends LinearLayout implements xhe {
    public final AppCompatTextView a;
    public boolean b;
    public ObjectAnimator c;

    public qu7(Context context) {
        super(context, (AttributeSet) null, 0);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(nmb.markdown_dot_size);
        int i = nmb.markdown_button_size;
        setOrientation(0);
        setGravity(17);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null, 0);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setTextAlignment(6);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setLineHeight(a24.X(((float) 14) * dh4.c().getDisplayMetrics().density));
        appCompatTextView.setGravity(17);
        appCompatTextView.setPaddingRelative(a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingEnd(), appCompatTextView.getPaddingBottom());
        this.a = appCompatTextView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        layoutParams.setMarginEnd(a24.X(((float) 26) * dh4.c().getDisplayMetrics().density));
        addView(appCompatTextView, layoutParams);
        View view = new View(context, (AttributeSet) null, 0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        js.D(shapeDrawable, -1);
        view.setBackground(shapeDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        layoutParams2.gravity = 17;
        layoutParams2.setMarginEnd((getContext().getResources().getDimensionPixelSize(i) - dimensionPixelSize) / 2);
        addView(view, layoutParams2);
        if (isInEditMode()) {
            appCompatTextView.setText(p0e.O(20, "s"));
            appCompatTextView.setTextColor(-1);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, cwb.MarkdownItemView);
        if (obtainStyledAttributes.hasValue(cwb.MarkdownItemView_miv_title)) {
            setTitle(obtainStyledAttributes.getResourceId(cwb.MarkdownItemView_miv_title, 0));
        }
        a(obtainStyledAttributes.getBoolean(cwb.MarkdownItemView_miv_highlight_title, false), false);
        obtainStyledAttributes.recycle();
        c();
    }

    public final void a(boolean z, boolean z2) {
        this.b = z;
        Float valueOf = Float.valueOf(0.6f);
        Float valueOf2 = Float.valueOf(1.0f);
        of ofVar = new of(valueOf, valueOf2);
        if (!this.b) {
            ofVar = new of(valueOf2, valueOf);
        }
        float alpha = getAlpha();
        Number number = ofVar.b;
        if (alpha != number.floatValue()) {
            if (isInEditMode() || !z2 || (!bm3.j(this).h())) {
                setAlpha(number.floatValue());
                invalidate();
                return;
            }
            tg j = bm3.j(this);
            ObjectAnimator objectAnimator = this.c;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                ObjectAnimator objectAnimator2 = this.c;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                this.c = null;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, LinearLayout.ALPHA, new float[]{ofVar.a.floatValue(), number.floatValue()});
            this.c = ofFloat;
            ofFloat.setDuration(j.a.b());
            boolean z3 = this.b;
            lg lgVar = j.a;
            ofFloat.setInterpolator(z3 ? lgVar.d() : lgVar.n());
            ofFloat.addListener(new lf(this, 3, ofVar));
            ofFloat.start();
        }
    }

    public final void c() {
        wce wce;
        if (!isInEditMode()) {
            if (isInEditMode()) {
                wce = db4.e0;
            } else {
                Context context = getContext();
                r7e r7e = wce.a0;
                wce = fja.E(context);
            }
            this.a.setTextColor(wce.l);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void setTitle(int i) {
        this.a.setText(i);
    }
}
