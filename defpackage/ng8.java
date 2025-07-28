package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;

/* renamed from: ng8  reason: default package */
public final class ng8 extends LinearLayout implements mhe {
    public u16 a;
    public final View b;
    public final LinearLayout c;

    public ng8(Context context) {
        super(context, (AttributeSet) null, 0);
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, a24.X(((float) 1) * dh4.c().getDisplayMetrics().density)));
        this.b = view;
        LinearLayout linearLayout = new LinearLayout(context);
        float f = (float) 12;
        linearLayout.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), linearLayout.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), linearLayout.getPaddingBottom());
        this.c = linearLayout;
        setOrientation(1);
        addView(view);
        addView(linearLayout);
        view.setBackgroundColor(km4.y0.r(this).h().k);
    }

    public final u16 getOnClickListener() {
        return this.a;
    }

    public final void onThemeChanged(pda pda) {
        s59 s59 = km4.y0;
        km4.d(s59.n(getContext()), this);
        this.b.setBackgroundColor(s59.r(this).h().k);
    }

    public final void setOnClickListener(u16 u16) {
        this.a = u16;
    }

    public final void setSelected(dh8 dh8) {
        u1 u1Var = new u1(4, this.c);
        while (u1Var.hasNext()) {
            View view = (View) u1Var.next();
            mg8 mg8 = view instanceof mg8 ? (mg8) view : null;
            if (mg8 != null) {
                mg8.setIsSelected(hhd.f(mg8.getState(), dh8));
            }
        }
    }

    public final void setState(List<? extends dh8> list) {
        LinearLayout linearLayout = this.c;
        linearLayout.removeAllViews();
        for (dh8 dh8 : list) {
            mg8 mg8 = new mg8(getContext());
            mg8.setIsSelected(false);
            mg8.setState(dh8);
            a24.Z(mg8, 300, new xv5(this, 11, dh8));
            linearLayout.addView(mg8);
        }
    }
}
