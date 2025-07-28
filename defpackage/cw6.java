package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: cw6  reason: default package */
public final class cw6 extends ViewGroup implements lya {
    public final t97 A0;
    public final t97 B0;
    public final ImageView C0;
    public final t97 D0;
    public final t97 E0;
    public final hcd F0;
    public final s0c G0;
    public final int a = a24.X(((float) 9) * dh4.c().getDisplayMetrics().density);
    public final int b = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
    public final int c = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
    public final int o = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
    public final int w0;
    public final int x0;
    public final TextView y0;
    public final TextView z0;

    public cw6(Context context) {
        super(context);
        float f = (float) 8;
        this.w0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.x0 = a24.X(((float) 1) * dh4.c().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        textView.setId(a2a.a);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams);
        nge.d(nte.p, textView);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-855638017);
        this.y0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(a2a.b);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams2);
        nge.d(nte.D, textView2);
        textView2.setTextColor(-855638017);
        this.z0 = textView2;
        this.A0 = ez3.O(3, new aw6(context, this, 0));
        this.B0 = ez3.O(3, new aw6(context, this, 1));
        ImageView imageView = new ImageView(context);
        Drawable b2 = gq3.b(imageView.getContext(), l9a.i);
        js.D(b2, -855638017);
        imageView.setImageDrawable(b2);
        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(qda.f.a.f), (Drawable) null, (Drawable) null));
        int X = a24.X(f * dh4.c().getDisplayMetrics().density);
        imageView.setPadding(X, X, X, X);
        a24.Z(imageView, 300, new bw6(this, 0));
        this.C0 = imageView;
        this.D0 = ez3.O(3, new cc3(context, 11));
        this.E0 = ez3.O(3, new cc3(context, 12));
        hcd b3 = icd.b(0, Integer.MAX_VALUE, 0, 5);
        this.F0 = b3;
        this.G0 = new s0c(b3);
        addView(textView);
        addView(textView2);
        addView(imageView);
    }

    public final void a(yf2 yf2) {
        t97 t97 = this.A0;
        ek8.e((View) t97.getValue(), this);
        ((View) t97.getValue()).setVisibility(0);
        t97 t972 = this.B0;
        ek8.e((View) t972.getValue(), this);
        ((View) t972.getValue()).setVisibility(0);
        ((mya) t97.getValue()).a(yf2.d);
    }

    public final void b(boolean z) {
        Drawable drawable;
        t97 t97 = this.B0;
        if (t97.a()) {
            ImageView imageView = (ImageView) t97.getValue();
            if (z) {
                drawable = gq3.b(imageView.getContext(), phc.a2);
                js.D(drawable, -855638017);
            } else {
                drawable = gq3.b(imageView.getContext(), phc.b2);
                js.D(drawable, -855638017);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public final void c(long j, long j2, long j3) {
        mya mya = (mya) this.A0.getValue();
        mya.o.setText(d8.a(j3));
        mya.c.setText(d8.a(j));
        mza mza = mya.w0;
        mza.setMax((int) j3);
        mza.setSecondaryProgress((int) j2);
        mza.setProgress((int) j);
    }

    public final dcd getEvents() {
        return this.G0;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        t97 t97 = this.D0;
        boolean L = ek8.L(t97);
        int i5 = this.w0;
        if (L) {
            n1g.D((View) t97.getValue(), 0, paddingTop, 0, 12);
            int measuredHeight = ((TextView) t97.getValue()).getMeasuredHeight() + i5 + paddingTop;
            t97 t972 = this.E0;
            n1g.D((View) t972.getValue(), 0, ((TextView) t97.getValue()).getBottom() + i5, 0, 12);
            paddingTop = ((View) t972.getValue()).getMeasuredHeight() + measuredHeight;
        }
        t97 t973 = this.A0;
        if (ek8.L(t973) && ((mya) t973.getValue()).getParent() != null) {
            if (!ek8.L(t97)) {
                i5 = 0;
            }
            int i6 = paddingTop + i5;
            n1g.D((View) t973.getValue(), 0, i6, 0, 12);
            paddingTop = i6 + ((mya) t973.getValue()).getMeasuredHeight();
        }
        TextView textView = this.y0;
        int measuredWidth = (getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int i7 = paddingTop + this.a;
        n1g.D(textView, measuredWidth, i7, 0, 12);
        TextView textView2 = this.z0;
        n1g.D(textView2, (getMeasuredWidth() / 2) - (textView2.getMeasuredWidth() / 2), textView.getMeasuredHeight() + this.b + i7, 0, 12);
        t97 t974 = this.B0;
        boolean L2 = ek8.L(t974);
        ImageView imageView = this.C0;
        int i8 = this.c;
        if (L2) {
            n1g.D((View) t974.getValue(), i8, ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        }
        if (imageView.getVisibility() == 0) {
            n1g.D(imageView, (getMeasuredWidth() - i8) - imageView.getMeasuredWidth(), ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        t97 t97 = this.D0;
        boolean L = ek8.L(t97);
        int i5 = this.w0;
        if (L) {
            ((TextView) t97.getValue()).measure(makeMeasureSpec, makeMeasureSpec2);
            t97 t972 = this.E0;
            ((View) t972.getValue()).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.x0, 1073741824));
            i3 = ((View) t972.getValue()).getMeasuredHeight() + ((TextView) t97.getValue()).getMeasuredHeight() + i5;
        } else {
            i3 = 0;
        }
        t97 t973 = this.A0;
        if (ek8.L(t973) && ((mya) t973.getValue()).getParent() != null) {
            ((mya) t973.getValue()).measure(i, i2);
            int measuredHeight = ((mya) t973.getValue()).getMeasuredHeight();
            if (!ek8.L(t97)) {
                i5 = 0;
            }
            i3 += measuredHeight + i5;
        }
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.o, 1073741824);
        t97 t974 = this.B0;
        boolean L2 = ek8.L(t974);
        int i6 = this.c;
        if (L2) {
            ((ImageView) t974.getValue()).measure(makeMeasureSpec3, makeMeasureSpec3);
            i4 = size - (((ImageView) t974.getValue()).getMeasuredWidth() + i6);
        } else {
            i4 = size;
        }
        ImageView imageView = this.C0;
        if (imageView.getVisibility() == 0) {
            imageView.measure(makeMeasureSpec3, makeMeasureSpec3);
            i4 -= imageView.getMeasuredWidth() + i6;
        }
        TextView textView = this.y0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), makeMeasureSpec2);
        TextView textView2 = this.z0;
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + textView2.getMeasuredHeight() + this.b + textView.getMeasuredHeight() + this.a + i3);
    }
}
