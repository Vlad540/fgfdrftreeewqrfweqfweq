package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.BitSet;

/* renamed from: c8a  reason: default package */
public final class c8a extends ViewGroup implements mhe {
    public final BitSet a;
    public final BitSet b;
    public final int c = 1;
    public final int o = 2;
    public final TextView w0;
    public final TextView x0;
    public final ImageView y0;

    public c8a(Context context) {
        super(context, (AttributeSet) null);
        BitSet bitSet = new BitSet(4);
        this.a = bitSet;
        BitSet bitSet2 = new BitSet(3);
        this.b = bitSet2;
        TextView textView = new TextView(context);
        textView.setText(d8.u(textView.getContext(), rhc.t0));
        nte.n.b(textView, yq4.b);
        s59 s59 = km4.y0;
        s59.r(textView);
        textView.setTextColor(-16745729);
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.w0 = textView;
        TextView textView2 = new TextView(context);
        nte.l.b(textView2, yq4.b);
        textView2.setTextColor(s59.r(textView2).getText().e);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        fja.d(textView2);
        this.x0 = textView2;
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(gq3.b(imageView.getContext(), phc.w));
        imageView.setImageTintList(ColorStateList.valueOf(s59.r(imageView).getIcon().i));
        int X = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        float f = (float) 12;
        int X2 = a24.X(dh4.c().getDisplayMetrics().density * f);
        int X3 = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        int X4 = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        imageView.setPadding(X, X4, X2, X4);
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(X2 + X3 + X, (X4 * 2) + X3));
        this.y0 = imageView;
        addView(textView);
        addView(textView2);
        addView(imageView);
        float f2 = (float) 5;
        setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        bitSet.set(0, bitSet.size(), true);
        bitSet2.set(0, true);
        bitSet2.set(2, false);
        bitSet2.set(1, false);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        TextView textView = this.w0;
        xy6.z(paddingStart, getPaddingTop(), textView.getMeasuredWidth() + paddingStart, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        if (this.b.get(this.c)) {
            int c2 = me4.c((float) 2, dh4.c().getDisplayMetrics().density, textView.getBottom());
            TextView textView2 = this.x0;
            int measuredHeight = textView2.getMeasuredHeight() + c2;
            xy6.z(paddingStart, c2, textView2.getMeasuredWidth() + paddingStart, measuredHeight, textView2, this);
        }
        int measuredWidth = getMeasuredWidth();
        ImageView imageView = this.y0;
        int measuredHeight2 = (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2);
        xy6.z(measuredWidth - imageView.getMeasuredWidth(), measuredHeight2, measuredWidth, imageView.getMeasuredHeight() + measuredHeight2, imageView, this);
    }

    public final void onMeasure(int i, int i2) {
        TextView textView = this.w0;
        BitSet bitSet = this.b;
        int i3 = 8;
        textView.setVisibility(bitSet.get(0) ? 0 : 8);
        TextView textView2 = this.x0;
        int i4 = this.c;
        textView2.setVisibility(bitSet.get(i4) ? 0 : 8);
        ImageView imageView = this.y0;
        int i5 = this.o;
        if (bitSet.get(i5)) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        int size = View.MeasureSpec.getSize(i);
        int X = a24.X(((float) 52) * dh4.c().getDisplayMetrics().density);
        int p = me4.p((float) 12, dh4.c().getDisplayMetrics().density, me4.p((float) 16, dh4.c().getDisplayMetrics().density, (size - getPaddingStart()) - getPaddingEnd()));
        if (bitSet.get(i5)) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().height, 1073741824));
        }
        if (bitSet.get(0)) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(p, Integer.MIN_VALUE), 0);
        }
        if (bitSet.get(i4)) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(p, Integer.MIN_VALUE), 0);
        }
        BitSet bitSet2 = this.a;
        bitSet2.set(0, bitSet2.size(), false);
        setMeasuredDimension(size, X);
    }

    public final void onThemeChanged(pda pda) {
        TextView textView = this.w0;
        pda.getText();
        textView.setTextColor(-16745729);
        this.x0.setTextColor(pda.getText().e);
        this.y0.setImageTintList(ColorStateList.valueOf(pda.getIcon().i));
        BitSet bitSet = this.a;
        bitSet.set(0, bitSet.size(), true);
        invalidate();
    }

    public final void setCloseBtnClickListener(View.OnClickListener onClickListener) {
        a24.a0(this.y0, onClickListener);
    }

    public final void setCloseButtonVisibility(boolean z) {
        BitSet bitSet = this.a;
        int i = this.o;
        bitSet.set(i, true);
        this.b.set(i, z);
        requestLayout();
    }

    public final void setOnPinnedMsgClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.x0.setText(charSequence);
        BitSet bitSet = this.a;
        int i = this.c;
        boolean z = true;
        bitSet.set(i, true);
        BitSet bitSet2 = this.b;
        if (charSequence.length() <= 0) {
            z = false;
        }
        bitSet2.set(i, z);
        requestLayout();
    }
}
