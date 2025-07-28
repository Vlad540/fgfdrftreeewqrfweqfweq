package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: nc2  reason: default package */
public final class nc2 extends ConstraintLayout implements mhe {
    public final TextView K0;
    public final TextView L0;
    public final TextView M0;
    public final mz9 N0;
    public final LinearLayout O0;

    /* JADX WARNING: type inference failed for: r12v0, types: [android.view.View, nc2, android.view.ViewGroup] */
    public nc2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        re3 re3 = new re3(-1, -2);
        float f = (float) 4;
        re3.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        textView.setLayoutParams(re3);
        nte.i.b(textView, yq4.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.K0 = textView;
        TextView textView2 = new TextView(context);
        re3 re32 = new re3(-1, -2);
        re32.bottomMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
        textView2.setLayoutParams(re32);
        nge nge = nte.m;
        nge.b(textView2, yq4.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.L0 = textView2;
        TextView textView3 = new TextView(context);
        textView3.setLayoutParams(new re3(-1, -2));
        nge.b(textView3, yq4.b);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        s59 s59 = km4.y0;
        int i = s59.r(textView3).c().a.f;
        textView3.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1)));
        this.M0 = textView3;
        mz9 mz9 = new mz9(context);
        mz9.setId(j8a.i0);
        float f2 = (float) 48;
        mz9.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
        mz9.setAvatarShape(fz9.a);
        this.N0 = mz9;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(j8a.h0);
        linearLayout.setLayoutParams(new re3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        this.O0 = linearLayout;
        setLayoutParams(new re3(-1, -2));
        int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        setPadding(X, X, X, X);
        int i2 = s59.r(this).c().a.f;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, new ColorDrawable(-1)));
        addView(mz9);
        addView(linearLayout);
        onThemeChanged(s59.r(this));
    }

    public final void onThemeChanged(pda pda) {
        this.K0.setTextColor(pda.getText().e);
        this.L0.setTextColor(pda.getText().f);
        this.M0.setTextColor(-16745729);
        this.N0.onThemeChanged(pda);
    }

    public final void setLink(CharSequence charSequence) {
        this.M0.setText(charSequence);
    }

    public final void setLinkOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.M0.setOnLongClickListener(onLongClickListener);
    }

    public final void setLinkPhoto(String str) {
        ub0 ub0 = new ub0(this.K0.getText(), 9223372036854775806L);
        mz9 mz9 = this.N0;
        mz9.g(ub0, false);
        mz9.setAvatarUrl(str);
        bf3 p = a06.p(this);
        og0 og0 = new og0(mz9.getId(), 4, p);
        og0.D(0);
        og0.G(0);
        og0.e(0);
        og0 og02 = new og0(this.O0.getId(), 4, p);
        og02.G(0);
        og02.e(0);
        og02.p(0);
        og02.C(mz9.getId()).e(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
        p.a(this);
    }

    public final void setOnLinkClickListener(View.OnClickListener onClickListener) {
        a24.a0(this.M0, onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.L0;
        int i = 0;
        if (!(true ^ (charSequence == null || charSequence.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.K0.setText(charSequence);
    }
}
