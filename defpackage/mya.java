package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

/* renamed from: mya  reason: default package */
public final class mya extends ViewGroup {
    public lya A0;
    public final int a;
    public final int b;
    public final TextView c;
    public final TextView o;
    public final mza w0;
    public final f4f x0;
    public vy5 y0;
    public boolean z0;

    /* JADX WARNING: type inference failed for: r4v1, types: [android.widget.SeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, mza, android.view.View] */
    /* JADX WARNING: type inference failed for: r6v14, types: [android.widget.FrameLayout, f4f, android.view.View, android.view.ViewGroup] */
    public mya(Context context) {
        super(context);
        float f = (float) 12;
        this.a = a24.X(dh4.c().getDisplayMetrics().density * f);
        float f2 = (float) 4;
        this.b = a24.X(dh4.c().getDisplayMetrics().density * f2);
        TextView textView = new TextView(context);
        textView.setTextColor(-855638017);
        nge nge = nte.D;
        nge.d(nge, textView);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-855638017);
        nge.d(nge, textView2);
        this.o = textView2;
        ? seekBar = new SeekBar(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(n1g.c0(-855638017, 0.8f));
        gradientDrawable.setSize(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density));
        gradientDrawable.setCornerRadius(dh4.c().getDisplayMetrics().density * 100.0f);
        seekBar.setThumb(gradientDrawable);
        float f3 = (float) 2;
        seekBar.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f3), seekBar.getPaddingTop(), a24.X(dh4.c().getDisplayMetrics().density * f3), seekBar.getPaddingBottom());
        seekBar.setProgressBackgroundTintList(ColorStateList.valueOf(1207959551));
        seekBar.setProgressTintList(ColorStateList.valueOf(qda.c.a.f));
        seekBar.setSecondaryProgressTintList(ColorStateList.valueOf(1895825407));
        this.w0 = seekBar;
        ? frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.a = imageView;
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        float f4 = (float) 20;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f4 * dh4.c().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        frameLayout.c = progressBar;
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-855638017);
        nge.d(nte.v, textView3);
        textView3.setGravity(17);
        float f5 = (float) 6;
        textView3.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f5), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f5 * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = a24.X(f2 * dh4.c().getDisplayMetrics().density);
        frameLayout.addView(textView3, layoutParams2);
        frameLayout.b = textView3;
        frameLayout.setElevation(dh4.c().getDisplayMetrics().density * 4.0f);
        float f6 = dh4.c().getDisplayMetrics().density * 14.0f;
        View view = new View(frameLayout.getContext());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(a24.X(((float) 1) * dh4.c().getDisplayMetrics().density), -855638017);
        gradientDrawable2.setCornerRadius(f6);
        view.setBackground(gradientDrawable2);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setOutlineProvider(new eu3(f6));
        this.x0 = frameLayout;
        setClipChildren(false);
        setClipToPadding(false);
        addView(textView);
        addView(textView2);
        addView(seekBar);
        addView(frameLayout);
        seekBar.setOnSeekBarChangeListener(new ib8(this, 1));
    }

    public final void a(xf2 xf2) {
        Bitmap bitmap;
        int i = 8;
        f4f f4f = this.x0;
        boolean z = xf2.c;
        boolean z2 = xf2.b;
        vy5 vy5 = xf2.a;
        if ((vy5 != null || z2) && z) {
            this.y0 = vy5;
            this.z0 = true;
            ProgressBar progressBar = f4f.c;
            if (z2) {
                i = 0;
            }
            progressBar.setVisibility(i);
            vy5 vy52 = this.y0;
            if (!(vy52 == null || (bitmap = vy52.a) == null || bitmap.isRecycled())) {
                vy5 vy53 = this.y0;
                f4f.a.setImageBitmap(vy53 != null ? vy53.a : null);
            }
            f4f.setVisibility(0);
            return;
        }
        f4f.setVisibility(8);
        this.z0 = z;
    }

    public final lya getListener() {
        return this.A0;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f4f f4f = this.x0;
        int visibility = f4f.getVisibility();
        int i5 = this.b;
        int i6 = this.a;
        if (visibility == 0) {
            n1g.D(f4f, i6, i5 - f4f.getMeasuredHeight(), i5, 4);
        }
        TextView textView = this.c;
        n1g.D(textView, i6, i5, 0, 12);
        TextView textView2 = this.o;
        n1g.D(textView2, (getMeasuredWidth() - i6) - textView2.getMeasuredWidth(), i5, 0, 12);
        int measuredHeight = textView.getMeasuredHeight();
        n1g.D(this.w0, i6, measuredHeight + i5 + i5, 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        TextView textView = this.c;
        textView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (this.a * 2), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        mza mza = this.w0;
        mza.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = mza.getMeasuredHeight() + textView.getMeasuredHeight() + (this.b * 2);
        vy5 vy5 = this.y0;
        int i3 = 0;
        int i4 = vy5 != null ? vy5.b : 0;
        if (vy5 != null) {
            i3 = vy5.c;
        }
        if (!(i4 == 0 || i3 == 0)) {
            f4f f4f = this.x0;
            if (f4f.getVisibility() == 0) {
                f4f.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setListener(lya lya) {
        this.A0 = lya;
    }
}
