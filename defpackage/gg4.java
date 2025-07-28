package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: gg4  reason: default package */
public final class gg4 extends ih0 {
    public static final /* synthetic */ int w0 = 0;
    public s16 a = new xd3(15);
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final gr7 o;

    public gg4(Context context) {
        super(context, (AttributeSet) null, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        float f = (float) 8;
        appCompatTextView.setPadding(0, a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(dh4.c().getDisplayMetrics().density * f));
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTextAlignment(4);
        appCompatTextView.setTextColor(getTitleColor());
        nte.i.b(appCompatTextView, yq4.b);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setTextAlignment(4);
        appCompatTextView2.setTextColor(getSubtitleColor());
        nte.m.b(appCompatTextView2, yq4.b);
        this.c = appCompatTextView2;
        gr7 gr7 = new gr7(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        gr7.setPadding(0, a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density));
        gr7.setLayoutParams(layoutParams2);
        gr7.setTextAlignment(4);
        a24.a0(gr7, new d5(25, (Object) this));
        this.o = gr7;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(gr7);
        onThemeChanged(km4.y0.n(context).g());
    }

    private final int getSubtitleColor() {
        return km4.y0.r(this).getText().f;
    }

    private final int getTitleColor() {
        return km4.y0.r(this).getText().e;
    }

    public final void onThemeChanged(pda pda) {
        super.onThemeChanged(pda);
        this.b.setTextColor(getTitleColor());
        this.c.setTextColor(getSubtitleColor());
    }
}
