package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: eq  reason: default package */
public final class eq extends ConstraintLayout implements mhe {
    public final AppCompatTextView K0;
    public final AppCompatImageView L0;

    public eq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(jy9.c);
        appCompatTextView.setGravity(8388611);
        nge.d(nte.i, appCompatTextView);
        s59 s59 = km4.y0;
        appCompatTextView.setTextColor(s59.r(appCompatTextView).getText().e);
        this.K0 = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(jy9.b);
        float f = (float) 24;
        appCompatImageView.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        s59.r(appCompatImageView);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-16745729));
        appCompatImageView.setImageResource(phc.m);
        this.L0 = appCompatImageView;
        setId(jy9.a);
        setLayoutParams(new ViewGroup.LayoutParams(-1, a24.X(((float) 48) * dh4.c().getDisplayMetrics().density)));
        setBackgroundColor(s59.r(this).b().f);
        addView(appCompatTextView);
        addView(appCompatImageView);
        bf3 p = a06.p(this);
        int id = appCompatImageView.getId();
        p.d(id, 3, 0, 3);
        p.d(id, 4, 0, 4);
        p.d(id, 6, 0, 6);
        hw9 hw9 = new hw9(p, 6, id, 4);
        float f2 = (float) 12;
        hw9.e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        int id2 = appCompatTextView.getId();
        p.d(id2, 3, 0, 3);
        p.d(id2, 4, 0, 4);
        p.d(id2, 6, appCompatImageView.getId(), 7);
        new hw9(p, 6, id2, 4).e(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        p.a(this);
    }

    public final void onThemeChanged(pda pda) {
        setBackgroundColor(pda.b().f);
        this.L0.setImageTintList(ColorStateList.valueOf(-16745729));
        this.K0.setTextColor(pda.getText().e);
    }

    public void setSelected(boolean z) {
        this.L0.setVisibility(z ^ true ? 4 : 0);
    }

    public final void setTitle(CharSequence charSequence) {
        this.K0.setText(charSequence);
    }
}
