package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: hy1  reason: default package */
public final class hy1 extends ViewGroup implements mhe {
    public final mz9 a;
    public final TextView b;
    public final ImageView c;

    public hy1(Context context) {
        super(context);
        mz9 mz9 = new mz9(context);
        this.a = mz9;
        TextView textView = new TextView(context);
        nte.k.b(textView, yq4.b);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.b = textView;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        addView(mz9);
        addView(textView);
        addView(imageView);
        mz9.setAvatarShape(dz9.a);
        float f = (float) 12;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(km4.y0.r(this));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int measuredHeight = getMeasuredHeight();
        mz9 mz9 = this.a;
        n1g.D(mz9, paddingLeft, (measuredHeight - mz9.getMeasuredHeight()) / 2, 0, 12);
        TextView textView = this.b;
        n1g.D(textView, me4.c((float) 12, dh4.c().getDisplayMetrics().density, mz9.getRight()), (getMeasuredHeight() - textView.getMeasuredHeight()) / 2, 0, 12);
        ImageView imageView = this.c;
        n1g.D(imageView, (getMeasuredWidth() - getPaddingRight()) - imageView.getMeasuredWidth(), (getMeasuredHeight() - imageView.getMeasuredHeight()) / 2, 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        TextView textView = this.b;
        if (tge.c(textView)) {
            setVerified(true);
        }
        float f = (float) 40;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(a24.X(dh4.c().getDisplayMetrics().density * f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(a24.X(f * dh4.c().getDisplayMetrics().density), 1073741824);
        mz9 mz9 = this.a;
        mz9.measure(makeMeasureSpec, makeMeasureSpec2);
        int mode = View.MeasureSpec.getMode(i);
        int size = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : Integer.MAX_VALUE;
        ImageView imageView = this.c;
        float f2 = (float) 20;
        imageView.measure(View.MeasureSpec.makeMeasureSpec(a24.X(dh4.c().getDisplayMetrics().density * f2), 1073741824), View.MeasureSpec.makeMeasureSpec(a24.X(f2 * dh4.c().getDisplayMetrics().density), 1073741824));
        int paddingLeft = (size - getPaddingLeft()) - mz9.getMeasuredWidth();
        float f3 = (float) 12;
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((me4.p(f3, dh4.c().getDisplayMetrics().density, me4.p(f3, dh4.c().getDisplayMetrics().density, paddingLeft)) - imageView.getMeasuredWidth()) - getPaddingRight(), Integer.MIN_VALUE);
        float f4 = (float) 56;
        textView.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(a24.X(dh4.c().getDisplayMetrics().density * f4), Integer.MIN_VALUE));
        setMeasuredDimension(size, a24.X(f4 * dh4.c().getDisplayMetrics().density));
    }

    public final void onThemeChanged(pda pda) {
        this.b.setTextColor(pda.getText().e);
        this.c.setImageTintList(ColorStateList.valueOf(pda.getIcon().h));
    }

    public final void setOnTrailClick(View.OnClickListener onClickListener) {
        a24.a0(this.c, new ub((Object) onClickListener, 6, (Object) this));
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTrail(int i) {
        this.c.setImageResource(i);
    }

    public final void setVerified(boolean z) {
        b1f b1f;
        TextView textView = this.b;
        int C = xy6.C(tge.e(textView));
        int i = 0;
        if (z) {
            b1f a2 = tge.a(textView);
            if ((a2 != null ? a2.a : 0) == C) {
                return;
            }
        }
        if (z) {
            b1f a3 = tge.a(textView);
            if (a3 != null) {
                i = a3.a;
            }
            if (i != C) {
                b1f = new b1f(getContext(), C, new hd1(3));
                tge.d(textView, b1f);
            }
        }
        b1f = null;
        tge.d(textView, b1f);
    }
}
