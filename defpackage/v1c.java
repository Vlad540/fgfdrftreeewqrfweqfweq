package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: v1c  reason: default package */
public final class v1c extends LinearLayout implements mhe {
    public final mz9 a;
    public final TextView b;

    public v1c(Context context) {
        super(context, (AttributeSet) null);
        mz9 mz9 = new mz9(context);
        mz9.setId(View.generateViewId());
        float f = (float) 64;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
        mz9.setLayoutParams(layoutParams);
        mz9.setAvatarShape(dz9.a);
        this.a = mz9;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        setHorizontalGravity(17);
        textView.setLayoutParams(layoutParams2);
        float f2 = (float) 82;
        textView.setMaxWidth(a24.X(dh4.c().getDisplayMetrics().density * f2));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        nge.d(nte.s, textView);
        textView.setTextColor(km4.y0.r(textView).getText().e);
        this.b = textView;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(a24.X(f2 * dh4.c().getDisplayMetrics().density), -2));
        addView(mz9);
        addView(textView);
    }

    public final mz9 getAvatar() {
        return this.a;
    }

    public final TextView getName() {
        return this.b;
    }

    public final void onMeasure(int i, int i2) {
        if (tge.c(this.b)) {
            setVerified(true);
        }
        super.onMeasure(i, i2);
    }

    public final void onThemeChanged(pda pda) {
        this.b.setTextColor(pda.getText().e);
    }

    public final void setAbbreviation(ub0 ub0) {
        this.a.g(ub0, true);
    }

    public final void setAvatar(String str) {
        this.a.setAvatarUrl(str);
    }

    public final void setAvatarShape(gz9 gz9) {
        this.a.setAvatarShape(gz9);
    }

    public final void setName(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setOnline(boolean z) {
        this.a.setOnlineBadgeVisibility(z);
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
                b1f = new b1f(getContext(), C, new u1c(0));
                tge.d(textView, b1f);
            }
        }
        b1f = null;
        tge.d(textView, b1f);
    }
}
