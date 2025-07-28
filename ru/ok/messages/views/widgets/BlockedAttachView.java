package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

public class BlockedAttachView extends LinearLayout {
    public final AppCompatTextView a;
    public final GradientDrawable b;

    public BlockedAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        zg4 b2 = zg4.b();
        setOrientation(1);
        setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(hq3.a(getContext(), xhc.d));
        setBackground(this.b);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        appCompatImageView.setImageResource(zhc.d0);
        appCompatImageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        addView(appCompatImageView, new LinearLayout.LayoutParams(-2, -2));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.a = appCompatTextView;
        appCompatTextView.setGravity(17);
        this.a.setTextSize(0, b2.H);
        this.a.setText(getResources().getText(cic.R));
        this.a.setTextColor(-1);
        this.a.setPadding(0, b2.i, 0, 0);
        addView(this.a, new LinearLayout.LayoutParams(-1, -2));
    }

    public void setCorners(float[] fArr) {
        this.b.setCornerRadii(fArr);
    }
}
