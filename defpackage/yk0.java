package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: yk0  reason: default package */
public final class yk0 extends FrameLayout implements mhe {
    public final qcc a;
    public final hbc b;
    public final TextView c;
    public final TextView o;
    public final SimpleDraweeView w0;

    public yk0(Context context) {
        super(context);
        qcc qcc = new qcc();
        this.a = qcc;
        float f = (float) 32;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.b = X <= 0 ? null : new hbc(0.0f, X, X, 12);
        TextView textView = new TextView(context);
        textView.setId(xob.oneme_folder_widget_title);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        nge.d(nte.y, textView);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(xob.oneme_folder_widget_description);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        nge.d(nte.m, textView2);
        this.o = textView2;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(xob.oneme_folder_widget_icon);
        ywa a2 = a06.a.get();
        a2.g = qcc;
        a2.k = true;
        simpleDraweeView.setController(a2.a());
        this.w0 = simpleDraweeView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(simpleDraweeView, new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        addView(textView, new FrameLayout.LayoutParams(-2, -2));
        addView(textView2, new FrameLayout.LayoutParams(-2, -2));
        setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 20.0f));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(km4.y0.r(this));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.c;
        int measuredHeight = textView.getMeasuredHeight();
        TextView textView2 = this.o;
        int measuredHeight2 = textView2.getMeasuredHeight() + measuredHeight;
        float f = (float) 4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - ((a24.X(dh4.c().getDisplayMetrics().density * f) + measuredHeight2) / 2);
        float f2 = (float) 16;
        n1g.D(textView, a24.X(dh4.c().getDisplayMetrics().density * f2), measuredHeight3, 0, 12);
        n1g.D(textView2, a24.X(f2 * dh4.c().getDisplayMetrics().density), rf0.b(f, dh4.c().getDisplayMetrics().density, textView.getMeasuredHeight(), measuredHeight3), 0, 12);
        SimpleDraweeView simpleDraweeView = this.w0;
        float f3 = (float) 32;
        simpleDraweeView.layout(me4.p(f3, dh4.c().getDisplayMetrics().density, getMeasuredWidth()) - simpleDraweeView.getMeasuredWidth(), (getMeasuredHeight() / 2) - (simpleDraweeView.getMeasuredHeight() / 2), me4.p(f3, dh4.c().getDisplayMetrics().density, getMeasuredWidth()), (simpleDraweeView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = (float) 32;
        int p = me4.p((float) 12, dh4.c().getDisplayMetrics().density, me4.p(f, dh4.c().getDisplayMetrics().density, me4.p(f, dh4.c().getDisplayMetrics().density, me4.p((float) 16, dh4.c().getDisplayMetrics().density, size))));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(p, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(p, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.w0.measure(View.MeasureSpec.makeMeasureSpec(a24.X(dh4.c().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(a24.X(f * dh4.c().getDisplayMetrics().density), 1073741824));
        setMeasuredDimension(size, size2);
    }

    public final void onThemeChanged(pda pda) {
        TextView textView = this.c;
        pda.getText();
        textView.setTextColor(-1);
        this.o.setTextColor(r1g.G(-1, 0.7f));
    }
}
