package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: nv1  reason: default package */
public final class nv1 extends w9b implements mhe {
    public final OneMeButton J0;
    public final AppCompatTextView K0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nv1(android.content.Context r11) {
        /*
            r10 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r11)
            r10.<init>(r0)
            one.me.sdk.uikit.common.button.OneMeButton r1 = new one.me.sdk.uikit.common.button.OneMeButton
            r2 = 0
            r1.<init>(r11, r2)
            v0a r3 = defpackage.v0a.c
            r1.setSize(r3)
            u0a r3 = defpackage.u0a.a
            r1.setMode(r3)
            s0a r3 = defpackage.s0a.c
            r1.setAppearance(r3)
            r3 = 17
            r1.setGravity(r3)
            int r3 = defpackage.i8a.i
            r1.setText((int) r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r6 = 8
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = a24.X(r6)
            r3.bottomMargin = r6
            r6 = 12
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = a24.X(r7)
            r3.topMargin = r7
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = a24.X(r7)
            r3.leftMargin = r7
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = a24.X(r7)
            r3.rightMargin = r7
            r1.setLayoutParams(r3)
            r10.J0 = r1
            androidx.appcompat.widget.AppCompatTextView r3 = new androidx.appcompat.widget.AppCompatTextView
            r3.<init>(r11, r2)
            int r7 = defpackage.e8a.a
            android.graphics.drawable.Drawable r11 = gq3.b(r11, r7)
            java.util.ArrayList r7 = defpackage.tge.a
            r3.setCompoundDrawablesRelativeWithIntrinsicBounds(r11, r2, r2, r2)
            s59 r11 = km4.y0
            pda r7 = r11.r(r0)
            yn6 r7 = r7.getIcon()
            int r7 = r7.c
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r3.setCompoundDrawableTintList(r7)
            r7 = 20
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r7
            int r8 = a24.X(r8)
            r3.setCompoundDrawablePadding(r8)
            nge r8 = defpackage.nte.d
            r8.b(r3, defpackage.yq4.b)
            pda r11 = r11.r(r0)
            cfe r11 = r11.getText()
            int r11 = r11.b
            r3.setTextColor(r11)
            android.content.res.Resources r11 = defpackage.dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r7
            int r11 = a24.X(r11)
            r8 = 10
            float r8 = (float) r8
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = a24.X(r8)
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r6 = r6 * r9
            int r6 = a24.X(r6)
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r7 = r7 * r9
            int r7 = a24.X(r7)
            r3.setPaddingRelative(r11, r7, r6, r8)
            r10.K0 = r3
            r10 = 1
            r0.setOrientation(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r4, r5)
            r0.setLayoutParams(r10)
            r0.setBackground(r2)
            r0.addView(r3)
            r0.addView(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv1.<init>(android.content.Context):void");
    }

    public final void A(pg7 pg7) {
        this.K0.setText(((mv1) pg7).a.a(this.a.getContext()));
    }

    public final void onThemeChanged(pda pda) {
        AppCompatTextView appCompatTextView = this.K0;
        s59 s59 = km4.y0;
        View view = this.a;
        appCompatTextView.setTextColor(s59.r(view).getText().b);
        yn6 icon = s59.r(view).getIcon();
        ArrayList arrayList = tge.a;
        appCompatTextView.setCompoundDrawableTintList(ColorStateList.valueOf(icon.c));
    }
}
