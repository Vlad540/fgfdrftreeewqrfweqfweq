package defpackage;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hz2  reason: default package */
public final class hz2 extends f6c {
    public final wce X;
    public final zg4 Y = zg4.b();
    public final List Z;
    public final Context o;

    public hz2(Context context, ArrayList arrayList) {
        this.o = context;
        this.Z = arrayList;
        r7e r7e = wce.a0;
        this.X = fja.E(context);
    }

    public final int j() {
        return this.Z.size();
    }

    public final void r(b7c b7c, int i) {
        gz2 gz2 = (gz2) b7c;
        cv0 cv0 = (cv0) this.Z.get(i);
        fz2 fz2 = new fz2(this, i, cv0, 0);
        boolean z = cv0.d;
        AppCompatCheckBox appCompatCheckBox = gz2.J0;
        appCompatCheckBox.setChecked(z);
        gz2.K0.setText(cv0.a);
        gz2.L0.setText(cv0.c);
        gz2.a.setOnClickListener(new ub((Object) gz2, 16, (Object) fz2));
        appCompatCheckBox.setOnClickListener(fz2);
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        Context context = this.o;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new n6c(-1, -2));
        wce wce = this.X;
        RippleDrawable C = swb.C(0, wce.i);
        linearLayout.setWeightSum(1.0f);
        linearLayout.setBackground(C);
        xy6.c(linearLayout);
        zg4 zg4 = this.Y;
        at7.g(linearLayout, zg4.m);
        at7.f(linearLayout, zg4.r);
        at7.e(linearLayout, zg4.j);
        at7.h(linearLayout, zg4.j);
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, (AttributeSet) null);
        nge nge = nte.k;
        nge.b(appCompatCheckBox, yq4.b);
        int i2 = wce.k;
        appCompatCheckBox.setHighlightColor(i2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        xy6.c(appCompatCheckBox);
        at7.f(appCompatCheckBox, zg4.d);
        linearLayout.addView(appCompatCheckBox, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setTextColor(wce.F);
        nge.b(appCompatTextView, yq4.b);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setLines(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 8388627;
        xy6.c(appCompatTextView);
        appCompatTextView.setTextAlignment(5);
        linearLayout.addView(appCompatTextView, layoutParams2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView2.setTextColor(i2);
        nge.b(appCompatTextView2, yq4.b);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setLines(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388627;
        xy6.c(appCompatCheckBox);
        appCompatTextView.setTextAlignment(5);
        linearLayout.addView(appCompatTextView2, layoutParams3);
        return new gz2(linearLayout, appCompatCheckBox, appCompatTextView, appCompatTextView2);
    }
}
