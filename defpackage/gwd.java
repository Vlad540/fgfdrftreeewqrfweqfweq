package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: gwd  reason: default package */
public final class gwd extends ViewGroup implements mhe {
    public final TextView a;
    public final TextView b;
    public final OneMeButton c;
    public final int o = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);

    public gwd(Context context) {
        super(context, (AttributeSet) null);
        TextView textView = new TextView(context);
        textView.setId(gaa.e);
        nte.j.b(textView, yq4.b);
        s59 s59 = km4.y0;
        textView.setTextColor(s59.r(textView).getText().e);
        this.a = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(gaa.d);
        nte.o.b(textView2, yq4.b);
        textView2.setTextColor(s59.r(textView2).getText().h);
        this.b = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setId(gaa.c);
        oneMeButton.setSize(v0a.a);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setAppearance(s0a.c);
        oneMeButton.setVisibility(4);
        this.c = oneMeButton;
        addView(textView);
        addView(textView2);
        addView(oneMeButton);
    }

    public final OneMeButton getHeaderButton() {
        return this.c;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        TextView textView = this.a;
        int i5 = paddingStart;
        xy6.z(i5, getPaddingTop(), textView.getMeasuredWidth() + paddingStart, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        TextView textView2 = this.b;
        xy6.z(i5, textView.getBottom(), textView2.getMeasuredWidth() + paddingStart, textView2.getMeasuredHeight() + textView.getBottom(), textView2, this);
        OneMeButton oneMeButton = this.c;
        int bottom = (textView2.getBottom() / 2) - (oneMeButton.getMeasuredHeight() / 2);
        xy6.z(getMeasuredWidth() - (oneMeButton.getMeasuredWidth() + getPaddingEnd()), bottom, getMeasuredWidth() - getPaddingEnd(), oneMeButton.getMeasuredHeight() + bottom, this.c, this);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        OneMeButton oneMeButton = this.c;
        oneMeButton.measure(makeMeasureSpec, i2);
        int measuredWidth = size - (oneMeButton.getMeasuredWidth() + this.o);
        TextView textView = this.a;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), i2);
        TextView textView2 = this.b;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), i2);
        setMeasuredDimension(size, textView2.getMeasuredHeight() + textView.getMeasuredHeight());
    }

    public final void onThemeChanged(pda pda) {
        TextView textView = this.a;
        s59 s59 = km4.y0;
        textView.setTextColor(s59.r(this).getText().e);
        this.b.setTextColor(s59.r(this).getText().h);
        this.c.e();
    }
}
