package defpackage;

import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: d12  reason: default package */
public final class d12 extends ConstraintLayout implements mhe {
    public final AppCompatTextView K0;
    public final AppCompatTextView L0;
    public final AppCompatImageView M0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.constraintlayout.widget.ConstraintLayout} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d12(android.content.Context r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 4
            r17.<init>(r18)
            androidx.appcompat.widget.AppCompatTextView r3 = new androidx.appcompat.widget.AppCompatTextView
            r4 = 0
            r3.<init>(r1, r4)
            int r5 = defpackage.j8a.u
            r3.setId(r5)
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r6 = 0
            r7 = -2
            r5.<init>(r6, r7)
            r3.setLayoutParams(r5)
            r5 = 2
            r3.setTextAlignment(r5)
            r8 = 1
            r3.setSingleLine(r8)
            android.text.TextUtils$TruncateAt r9 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r9)
            int r10 = defpackage.l8a.C
            java.lang.CharSequence r10 = r1.getText(r10)
            r3.setText(r10)
            s59 r10 = km4.y0
            pda r11 = r10.r(r3)
            cfe r11 = r11.getText()
            int r11 = r11.f
            r3.setTextColor(r11)
            nge r11 = defpackage.jp2.a
            nge r11 = defpackage.nte.f
            r11.b(r3, defpackage.yq4.b)
            r0.K0 = r3
            androidx.appcompat.widget.AppCompatTextView r11 = new androidx.appcompat.widget.AppCompatTextView
            r11.<init>(r1, r4)
            int r12 = defpackage.j8a.v
            r11.setId(r12)
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r12.<init>(r6, r7)
            r11.setLayoutParams(r12)
            r11.setTextAlignment(r5)
            r11.setSingleLine(r8)
            r11.setEllipsize(r9)
            r10.r(r11)
            r9 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
            r11.setTextColor(r9)
            nge r12 = defpackage.nte.g
            r12.b(r11, defpackage.yq4.b)
            r0.L0 = r11
            androidx.appcompat.widget.AppCompatImageView r12 = new androidx.appcompat.widget.AppCompatImageView
            r12.<init>(r1, r4)
            int r1 = defpackage.j8a.w
            r12.setId(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r4 = 24
            float r4 = (float) r4
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r4
            int r13 = a24.X(r13)
            android.content.res.Resources r14 = defpackage.dh4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r4 = r4 * r14
            int r4 = a24.X(r4)
            r1.<init>(r13, r4)
            r12.setLayoutParams(r1)
            int r1 = defpackage.phc.j0
            r12.setImageResource(r1)
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            double r13 = (double) r1
            r15 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r13 = r13 * r15
            int r1 = a24.W(r13)
            float r4 = (float) r5
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = a24.X(r5)
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            double r13 = (double) r13
            double r13 = r13 * r15
            int r13 = a24.W(r13)
            android.content.res.Resources r14 = defpackage.dh4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r4 = r4 * r14
            int r4 = a24.X(r4)
            r12.setPadding(r1, r5, r13, r4)
            r10.r(r12)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r9)
            r12.setImageTintList(r1)
            r0.M0 = r12
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r1.<init>(r4, r7)
            r0.setLayoutParams(r1)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r1
            int r4 = a24.X(r4)
            r5 = 8
            float r5 = (float) r5
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r5
            int r7 = a24.X(r7)
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r1 = r1 * r9
            int r1 = a24.X(r1)
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r5 = r5 * r9
            int r5 = a24.X(r5)
            r0.setPadding(r4, r7, r1, r5)
            r0.addView(r3)
            r0.addView(r11)
            r0.addView(r12)
            bf3 r1 = a06.p(r17)
            int r4 = r3.getId()
            r5 = 6
            r1.d(r4, r5, r6, r5)
            r7 = 3
            r1.d(r4, r7, r6, r7)
            int r9 = r11.getId()
            r1.d(r4, r2, r9, r7)
            hw9 r9 = new hw9
            r9.<init>(r1, r2, r4, r2)
            float r8 = (float) r8
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r8
            int r13 = a24.X(r13)
            r9.e(r13)
            int r9 = r12.getId()
            r13 = 7
            r1.d(r4, r13, r9, r5)
            hw9 r9 = new hw9
            r9.<init>(r1, r13, r4, r2)
            r4 = 16
            float r4 = (float) r4
            android.content.res.Resources r14 = defpackage.dh4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r14 = r14 * r4
            int r14 = a24.X(r14)
            r9.e(r14)
            int r9 = r11.getId()
            r1.d(r9, r5, r6, r5)
            int r3 = r3.getId()
            r1.d(r9, r7, r3, r2)
            hw9 r3 = new hw9
            r3.<init>(r1, r7, r9, r2)
            android.content.res.Resources r11 = defpackage.dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            hr1.q(r8, r11, r3)
            r1.d(r9, r2, r6, r2)
            int r3 = r12.getId()
            r1.d(r9, r13, r3, r5)
            hw9 r3 = new hw9
            r3.<init>(r1, r13, r9, r2)
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = a24.X(r4)
            r3.e(r4)
            int r3 = r12.getId()
            r1.d(r3, r7, r6, r7)
            r1.d(r3, r2, r6, r2)
            r1.d(r3, r13, r6, r13)
            r1.a(r0)
            pda r1 = r10.r(r0)
            r0.onThemeChanged(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d12.<init>(android.content.Context):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d12, android.view.View] */
    public final void onThemeChanged(pda pda) {
        s59 s59 = km4.y0;
        this.K0.setTextColor(s59.r(this).getText().f);
        s59.r(this);
        this.L0.setTextColor(-16745729);
        pda.getIcon();
        this.M0.setImageTintList(ColorStateList.valueOf(-16745729));
    }

    public final void setLink(CharSequence charSequence) {
        this.L0.setText(charSequence);
    }

    public final void setOnShareLinkClickListener(u16 u16) {
        a24.a0(this.M0, new ub((Object) this, u16, 8));
    }
}
