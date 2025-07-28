package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: sr5  reason: default package */
public final class sr5 extends ViewGroup implements mhe {
    public final qcc a;
    public final hbc b;
    public final TextView c;
    public final TextView o;
    public final SimpleDraweeView w0;

    public sr5(Context context) {
        super(context);
        qcc qcc = new qcc();
        this.a = qcc;
        float f = (float) 28;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.b = X <= 0 ? null : new hbc(0.0f, X, X, 12);
        TextView textView = new TextView(context);
        textView.setId(xob.oneme_folder_widget_title);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        nge.d(nte.p, textView);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(xob.oneme_folder_widget_description);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        nge.d(nte.r, textView2);
        this.o = textView2;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(xob.oneme_folder_widget_icon);
        ywa a2 = a06.a.get();
        a2.g = qcc;
        a2.k = true;
        simpleDraweeView.setController(a2.a());
        this.w0 = simpleDraweeView;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        setPadding(X2, X2, X2, X2);
        addView(simpleDraweeView, new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 20.0f));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(km4.y0.r(this));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = (float) 12;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        TextView textView = this.c;
        n1g.D(textView, a24.X(dh4.c().getDisplayMetrics().density * f), X, 0, 12);
        n1g.D(this.o, a24.X(dh4.c().getDisplayMetrics().density * f), rf0.b((float) 4, dh4.c().getDisplayMetrics().density, textView.getMeasuredHeight(), X), 0, 12);
        SimpleDraweeView simpleDraweeView = this.w0;
        simpleDraweeView.layout(a24.X(dh4.c().getDisplayMetrics().density * f), me4.p(f, dh4.c().getDisplayMetrics().density, getMeasuredHeight() - simpleDraweeView.getMeasuredHeight()), simpleDraweeView.getMeasuredWidth() + a24.X(dh4.c().getDisplayMetrics().density * f), me4.p(f, dh4.c().getDisplayMetrics().density, getMeasuredHeight()));
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = (float) 12;
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size - (a24.X(dh4.c().getDisplayMetrics().density * f) * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(size - (a24.X(f * dh4.c().getDisplayMetrics().density) * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        float f2 = (float) 28;
        this.w0.measure(View.MeasureSpec.makeMeasureSpec(a24.X(dh4.c().getDisplayMetrics().density * f2), 1073741824), View.MeasureSpec.makeMeasureSpec(a24.X(f2 * dh4.c().getDisplayMetrics().density), 1073741824));
        setMeasuredDimension(size, size2);
    }

    public final void onThemeChanged(pda pda) {
        TextView textView = this.c;
        pda.getText();
        textView.setTextColor(-1);
        this.o.setTextColor(r1g.G(-1, 0.7f));
    }
}
