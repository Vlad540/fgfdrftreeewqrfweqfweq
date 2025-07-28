package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: flb  reason: default package */
public final class flb extends ViewGroup implements mhe {
    public final int A0;
    public final int B0;
    public final TextView a;
    public final dw9 b;
    public final OneMeDraweeView c;
    public final t97 o = ez3.O(3, new u5b(3, this));
    public final t97 w0;
    public final Paint x0;
    public final t97 y0;
    public final t97 z0;

    /* JADX WARNING: type inference failed for: r3v1, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public flb(Context context) {
        super(context);
        TextView textView = new TextView(context);
        nte.s.b(textView, yq4.b);
        s59 s59 = km4.y0;
        textView.setTextColor(s59.r(textView).getText().f);
        textView.setSingleLine();
        textView.setFallbackLineSpacing(false);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setFocusable(0);
        this.a = textView;
        dw9 dw9 = new dw9(context);
        nte.l.b(dw9, yq4.b);
        dw9.setTextColor(s59.r(dw9).getText().g);
        dw9.setSingleLine();
        dw9.setFallbackLineSpacing(false);
        dw9.setEllipsize(truncateAt);
        dw9.setFocusable(0);
        fja.d(dw9);
        dw9.setVisibility(8);
        this.b = dw9;
        ? oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 4.0f));
        oneMeDraweeView.setVisibility(8);
        this.c = oneMeDraweeView;
        this.w0 = ez3.O(3, new t2a(context, 16));
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        s59.r(this);
        paint.setColor(-16745729);
        this.x0 = paint;
        this.y0 = ez3.O(3, new t2a(context, 17));
        this.z0 = ez3.O(3, new t2a(context, 18));
        this.A0 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        float f = (float) 4;
        this.B0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        float f2 = (float) 6;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(f * dh4.c().getDisplayMetrics().density));
        addView(textView);
        addView(dw9);
        addView(oneMeDraweeView);
        onThemeChanged(s59.r(this));
    }

    private final void setCounter(int i) {
        t97 t97 = this.w0;
        t3a t3a = (t3a) t97.getValue();
        t3a.setVisibility(0);
        t3a.g(i, false);
        ek8.d(this, (View) t97.getValue(), (Integer) null);
        requestLayout();
        invalidate();
    }

    public final void a(String str, Integer num) {
        on4 on4 = this.c;
        on4.setVisibility((str != null && !h0e.c0(str)) || num != null ? 0 : 8);
        on4.o(str != null ? tr6.b(str) : null, (tr6) null);
        if ((str == null || h0e.c0(str)) && num != null) {
            Context context = on4.getContext();
            int intValue = num.intValue();
            s59 s59 = km4.y0;
            on4.getHierarchy().i(js.q(intValue, s59.r(on4).getIcon().h, context), 1);
            int X = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
            on4.setPadding(X, X, X, X);
            on4.setBackgroundColor(s59.r(on4).b().a.g);
            return;
        }
        on4.getHierarchy().i((Drawable) null, 1);
        on4.setPadding(0, 0, 0, 0);
    }

    public final void dispatchDraw(Canvas canvas) {
        float f;
        float strokeWidth;
        float measuredWidth;
        float strokeWidth2;
        float f2;
        boolean w = xy6.w(this);
        t97 t97 = this.y0;
        Paint paint = this.x0;
        if (w) {
            if (ek8.L(t97)) {
                f2 = (float) 2;
                measuredWidth = (float) me4.p(f2, dh4.c().getDisplayMetrics().density, (getMeasuredWidth() - getPaddingEnd()) - ek8.D(t97));
                strokeWidth2 = paint.getStrokeWidth();
            } else {
                measuredWidth = (float) (getMeasuredWidth() - getPaddingEnd());
                strokeWidth2 = paint.getStrokeWidth();
                f2 = (float) 2;
            }
            f = measuredWidth - (strokeWidth2 / f2);
        } else {
            if (ek8.L(t97)) {
                int D = ek8.D(t97) + getPaddingStart();
                float f3 = (float) 2;
                strokeWidth = (paint.getStrokeWidth() / f3) + ((float) me4.c(f3, dh4.c().getDisplayMetrics().density, D));
            } else {
                strokeWidth = (paint.getStrokeWidth() / ((float) 2)) + ((float) getPaddingStart());
            }
            f = strokeWidth;
        }
        canvas.drawLine(f, (float) getPaddingTop(), f, (float) (getMeasuredHeight() - getPaddingBottom()), paint);
        super.dispatchDraw(canvas);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        t97 t97 = this.w0;
        if (!t97.a() || view != t97.getValue() || this.c.getVisibility() == 0) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    public final TextView getTitleView() {
        return this.a;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        t97 t97 = this.y0;
        if (ek8.L(t97)) {
            ImageView imageView = (ImageView) t97.getValue();
            n1g.C(imageView, paddingStart, (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2), imageView.getMeasuredWidth() + paddingStart, (imageView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            paddingStart = rf0.b((float) 2, dh4.c().getDisplayMetrics().density, imageView.getMeasuredWidth(), paddingStart);
        }
        int X = a24.X(this.x0.getStrokeWidth());
        int i5 = this.A0;
        int i6 = X + i5 + paddingStart;
        ? r5 = this.c;
        if (r5.getVisibility() == 0) {
            n1g.C(r5, i6, (getMeasuredHeight() / 2) - (r5.getMeasuredHeight() / 2), r5.getMeasuredWidth() + i6, (r5.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            i6 += r5.getMeasuredWidth() + i5;
            t97 t972 = this.w0;
            if (t972.a()) {
                t3a t3a = (t3a) t972.getValue();
                float f = (float) 2;
                n1g.C(t3a, me4.p(f, dh4.c().getDisplayMetrics().density, r5.getLeft()), me4.c(f, dh4.c().getDisplayMetrics().density, r5.getBottom()) - t3a.getMeasuredHeight(), t3a.getMeasuredWidth() + me4.p(f, dh4.c().getDisplayMetrics().density, r5.getLeft()), me4.c(f, dh4.c().getDisplayMetrics().density, r5.getBottom()));
            }
        }
        dw9 dw9 = this.b;
        int visibility = dw9.getVisibility();
        TextView textView = this.a;
        if (visibility == 0) {
            float f2 = (float) 4;
            n1g.D(textView, i6, me4.c(f2, dh4.c().getDisplayMetrics().density, getPaddingTop()), 0, 12);
            int p = me4.p(f2, dh4.c().getDisplayMetrics().density, getMeasuredHeight() - getPaddingBottom());
            n1g.C(dw9, i6, p - dw9.getMeasuredHeight(), dw9.getMeasuredWidth() + i6, p);
        } else {
            n1g.C(textView, i6, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), textView.getMeasuredWidth() + i6, (textView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
        t97 t973 = this.z0;
        if (ek8.L(t973)) {
            ImageView imageView2 = (ImageView) t973.getValue();
            int p2 = me4.p((float) 36, dh4.c().getDisplayMetrics().density, getMeasuredWidth() - getPaddingEnd());
            n1g.C(imageView2, p2, (getMeasuredHeight() / 2) - (imageView2.getMeasuredHeight() / 2), imageView2.getMeasuredWidth() + p2, (imageView2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
    }

    /* JADX WARNING: type inference failed for: r10v7, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void onMeasure(int i, int i2) {
        Paint paint = this.x0;
        paint.setStrokeWidth(dh4.c().getDisplayMetrics().density * 2.0f);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int X = a24.X(paint.getStrokeWidth()) + getPaddingStart();
        int i3 = this.A0;
        int paddingEnd = getPaddingEnd() + X + i3;
        t97 t97 = this.y0;
        if (ek8.L(t97)) {
            int X2 = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
            ((ImageView) t97.getValue()).measure(View.MeasureSpec.makeMeasureSpec(X2, 1073741824), View.MeasureSpec.makeMeasureSpec(X2, 1073741824));
            paddingEnd = rf0.b((float) 2, dh4.c().getDisplayMetrics().density, ((ImageView) t97.getValue()).getMeasuredWidth(), paddingEnd);
        }
        ? r10 = this.c;
        if (r10.getVisibility() == 0) {
            int X3 = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
            r10.measure(View.MeasureSpec.makeMeasureSpec(X3, 1073741824), View.MeasureSpec.makeMeasureSpec(X3, 1073741824));
            paddingEnd += r10.getMeasuredWidth() + i3;
            t97 t972 = this.w0;
            if (t972.a()) {
                ((t3a) t972.getValue()).measure(0, 0);
            }
        }
        t97 t973 = this.z0;
        if (ek8.L(t973)) {
            int X4 = a24.X(((float) 36) * dh4.c().getDisplayMetrics().density);
            ((ImageView) t973.getValue()).measure(View.MeasureSpec.makeMeasureSpec(X4, 1073741824), View.MeasureSpec.makeMeasureSpec(X4, 1073741824));
            paddingEnd = rf0.b((float) 6, dh4.c().getDisplayMetrics().density, ((ImageView) t973.getValue()).getMeasuredWidth(), paddingEnd);
        }
        int i4 = size - paddingEnd;
        if (i4 < 0) {
            i4 = 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        TextView textView = this.a;
        textView.measure(makeMeasureSpec, 0);
        int measuredHeight = textView.getMeasuredHeight() + getPaddingTop() + getPaddingBottom();
        int i5 = this.B0;
        int i6 = (i5 * 2) + measuredHeight;
        dw9 dw9 = this.b;
        if (dw9.getVisibility() == 0) {
            dw9.measure(makeMeasureSpec, 0);
            i6 += dw9.getMeasuredHeight() + i5;
        }
        if (r10.getVisibility() == 0) {
            setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + (a24.X(((float) 2) * dh4.c().getDisplayMetrics().density) * 2) + r10.getMeasuredHeight());
        } else {
            setMeasuredDimension(size, i6);
        }
    }

    public final void onThemeChanged(pda pda) {
        this.a.setTextColor(pda.getText().f);
        this.b.setTextColor(pda.getText().g);
        this.x0.setColor(-16745729);
        t97 t97 = this.w0;
        if (t97.a()) {
            ((t3a) t97.getValue()).f(pda);
        }
        t97 t972 = this.y0;
        if (t972.a()) {
            ((ImageView) t972.getValue()).setImageTintList(ColorStateList.valueOf(-16745729));
        }
        t97 t973 = this.z0;
        if (t973.a()) {
            ((ImageView) t973.getValue()).setImageTintList(ColorStateList.valueOf(pda.getIcon().h));
        }
        on4 on4 = this.c;
        boolean z = on4.getHierarchy().e.a(1) != null;
        s59 s59 = km4.y0;
        if (z) {
            on4.setBackgroundColor(s59.r(this).b().a.g);
        }
        t97 t974 = this.o;
        if (t974.a() && ((LayerDrawable) t974.getValue()).getNumberOfLayers() > 1) {
            LayerDrawable layerDrawable = (LayerDrawable) t974.getValue();
            nd0 b2 = s59.r(this).b();
            Drawable drawable = layerDrawable.getDrawable(0);
            js.D(drawable, b2.d);
            layerDrawable.setDrawable(0, drawable);
            LayerDrawable layerDrawable2 = (LayerDrawable) t974.getValue();
            yn6 icon = s59.r(this).getIcon();
            Drawable drawable2 = layerDrawable2.getDrawable(1);
            js.D(drawable2, icon.b);
            layerDrawable2.setDrawable(1, drawable2);
        }
    }

    public final void setBody(CharSequence charSequence) {
        dw9 dw9 = this.b;
        if (charSequence == null || h0e.c0(charSequence)) {
            dw9.setVisibility(8);
            return;
        }
        dw9.setVisibility(0);
        dw9.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setDrawOverlay(boolean z) {
        OneMeDraweeView oneMeDraweeView = this.c;
        if (z) {
            oneMeDraweeView.getHierarchy().k((Drawable) this.o.getValue());
        } else {
            oneMeDraweeView.getHierarchy().k((Drawable) null);
        }
    }

    public final void setEndIconClickListener(View.OnClickListener onClickListener) {
        t97 t97 = this.z0;
        if (t97.a()) {
            a24.a0((ImageView) t97.getValue(), onClickListener);
        }
    }

    public final void setEndIconDrawable(Drawable drawable) {
        t97 t97 = this.z0;
        if (drawable != null) {
            ImageView imageView = (ImageView) t97.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            ek8.d(this, (View) t97.getValue(), -1);
        } else if (t97.a()) {
            ImageView imageView2 = (ImageView) t97.getValue();
            imageView2.setImageDrawable((Drawable) null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void setImageClickListener(View.OnClickListener onClickListener) {
        a24.a0(this.c, onClickListener);
    }

    public final void setStartIconClickListener(View.OnClickListener onClickListener) {
        t97 t97 = this.y0;
        if (t97.a()) {
            a24.a0((ImageView) t97.getValue(), onClickListener);
        }
    }

    public final void setStartIconDrawable(Drawable drawable) {
        t97 t97 = this.y0;
        if (drawable != null) {
            ImageView imageView = (ImageView) t97.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            ek8.d(this, (View) t97.getValue(), -1);
        } else if (t97.a()) {
            ImageView imageView2 = (ImageView) t97.getValue();
            imageView2.setImageDrawable((Drawable) null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setCounter(Integer num) {
        if (num == null) {
            t97 t97 = this.w0;
            if (t97.a()) {
                ((t3a) t97.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        setCounter(num.intValue());
    }
}
