package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

public class VideoFramePreview extends RoundedRectFrameLayout implements xhe {
    public final AppCompatImageView w0;
    public final AppCompatTextView x0;
    public final ProgressBar y0;
    public final View z0 = new View(getContext());

    public VideoFramePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zg4 b = zg4.b();
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        this.w0 = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.w0, new FrameLayout.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        this.y0 = progressBar;
        progressBar.setIndeterminate(true);
        int i = b.n;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(this.y0, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        this.x0 = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        this.x0.setTextSize(b.F);
        this.x0.setGravity(17);
        AppCompatTextView appCompatTextView2 = this.x0;
        int i2 = b.f;
        int i3 = b.b;
        appCompatTextView2.setPadding(i2, i3, i2, i3);
        float f = (float) b.s;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#333344"));
        shapeDrawable.setAlpha(96);
        this.x0.setBackground(shapeDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = b.d;
        addView(this.x0, layoutParams2);
        this.z0.setBackground(swb.L((Integer) null, Integer.valueOf(hq3.a(getContext(), xhc.g)), Integer.valueOf(b.a), b.g));
        addView(this.z0, new FrameLayout.LayoutParams(-1, -1));
        setCornerRadius((float) b.h);
        c();
    }

    public final void a(boolean z) {
        if (z) {
            this.y0.setVisibility(0);
        } else {
            this.y0.setVisibility(8);
        }
    }

    public final void c() {
        Context context = getContext();
        r7e r7e = wce.a0;
        js.E(this.y0, fja.E(context).k);
    }

    public void setPreviewEnabled(boolean z) {
        View view = this.z0;
        AppCompatImageView appCompatImageView = this.w0;
        if (z) {
            appCompatImageView.setVisibility(0);
            Context context = getContext();
            r7e r7e = wce.a0;
            setBackgroundColor(fja.E(context).w);
            view.setVisibility(0);
            return;
        }
        appCompatImageView.setVisibility(8);
        setBackground((Drawable) null);
        view.setVisibility(8);
    }
}
