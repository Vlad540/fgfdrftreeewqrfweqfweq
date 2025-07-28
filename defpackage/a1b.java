package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* renamed from: a1b  reason: default package */
public final class a1b extends FrameLayout {
    public final boolean a;
    public Integer b;
    public AppCompatTextView c;
    public ImageView o;

    public a1b(Context context, boolean z) {
        super(context);
        this.a = z;
        setMinimumHeight(a24.X(((float) 48) * dh4.c().getDisplayMetrics().density));
        urd.B(new pf0(3, (Continuation) null, 12), this);
    }

    /* access modifiers changed from: private */
    public final pda getCurrentTheme() {
        return this.a ? qda.a : km4.y0.r(this);
    }

    public final void b(Integer num, Integer num2) {
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(intValue);
            imageView.setImageTintList(ColorStateList.valueOf(getCurrentTheme().i(num2 != null ? num2.intValue() : j9a.G)));
            urd.B(new wua(this, (Continuation) null, 3, false), imageView);
            this.o = imageView;
            float f = (float) 24;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
            layoutParams.gravity = 8388627;
            layoutParams.setMarginStart(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
            addView(this.o, layoutParams);
        }
    }

    public final void c(a1b a1b, mge mge, Integer num, boolean z, boolean z2) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(a1b.getContext(), (AttributeSet) null);
        nte.k.b(appCompatTextView, yq4.b);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setText(mge.a(appCompatTextView.getContext()));
        int intValue = num != null ? num.intValue() : j9a.G;
        this.b = Integer.valueOf(intValue);
        appCompatTextView.setTextColor(getCurrentTheme().i(intValue));
        urd.B(new wua(this, (Continuation) null, 4, false), appCompatTextView);
        this.c = appCompatTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart((z || z2) ? a24.X(((float) 48) * dh4.c().getDisplayMetrics().density) : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
        layoutParams.setMarginEnd(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
        float f = (float) 4;
        layoutParams.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        layoutParams.bottomMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
        a1b.addView(this.c, layoutParams);
    }
}
