package defpackage;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: v9d  reason: default package */
public final class v9d extends LinearLayout implements mhe {
    public final mz9 a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView o;
    public final AppCompatTextView w0;
    public final LinearLayout x0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v9d(android.content.Context r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r0.<init>(r1, r2)
            mz9 r3 = new mz9
            r3.<init>(r1)
            int r4 = defpackage.yaa.k
            r3.setId(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 96
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r5
            int r6 = a24.X(r6)
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r5 = r5 * r7
            int r5 = a24.X(r5)
            r4.<init>(r6, r5)
            r5 = 1
            r4.gravity = r5
            r6 = 12
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = a24.X(r7)
            r4.bottomMargin = r7
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = a24.X(r6)
            r4.topMargin = r6
            r3.setLayoutParams(r4)
            dz9 r4 = defpackage.dz9.a
            r3.setAvatarShape(r4)
            r0.a = r3
            androidx.appcompat.widget.AppCompatTextView r4 = new androidx.appcompat.widget.AppCompatTextView
            r4.<init>(r1, r2)
            int r6 = defpackage.yaa.n
            r4.setId(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            r8 = 6
            float r8 = (float) r8
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = a24.X(r8)
            r6.bottomMargin = r8
            r4.setLayoutParams(r6)
            r6 = 20
            float r6 = (float) r6
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r6
            int r8 = a24.X(r8)
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r6
            int r9 = a24.X(r9)
            int r10 = r4.getPaddingTop()
            int r11 = r4.getPaddingBottom()
            r4.setPaddingRelative(r8, r10, r9, r11)
            r4.setGravity(r5)
            nge r8 = defpackage.nte.b
            r8.b(r4, defpackage.yq4.b)
            s59 r8 = km4.y0
            pda r9 = r8.r(r4)
            cfe r9 = r9.getText()
            int r9 = r9.e
            r4.setTextColor(r9)
            r9 = 2
            r4.setMaxLines(r9)
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r10)
            r0.b = r4
            androidx.appcompat.widget.AppCompatTextView r11 = new androidx.appcompat.widget.AppCompatTextView
            r11.<init>(r1, r2)
            int r12 = defpackage.yaa.p
            r11.setId(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r7, r7)
            r11.setLayoutParams(r12)
            r11.setGravity(r5)
            nge r12 = defpackage.nte.m
            r12.b(r11, defpackage.yq4.b)
            r8.r(r11)
            r13 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
            r11.setTextColor(r13)
            r0.c = r11
            androidx.appcompat.widget.AppCompatTextView r14 = new androidx.appcompat.widget.AppCompatTextView
            r14.<init>(r1, r2)
            int r15 = defpackage.yaa.m
            r14.setId(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r15.<init>(r7, r7)
            r9 = 4
            float r9 = (float) r9
            android.content.res.Resources r16 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r16.getDisplayMetrics()
            float r13 = r13.density
            float r13 = r13 * r9
            int r13 = a24.X(r13)
            r15.setMarginStart(r13)
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r9 = r9 * r13
            int r9 = a24.X(r9)
            r15.setMarginEnd(r9)
            r14.setLayoutParams(r15)
            java.lang.String r9 = "·"
            r14.setText(r9)
            r14.setGravity(r5)
            r12.b(r14, defpackage.yq4.b)
            pda r9 = r8.r(r14)
            cfe r9 = r9.getText()
            int r9 = r9.g
            r14.setTextColor(r9)
            r0.o = r14
            androidx.appcompat.widget.AppCompatTextView r9 = new androidx.appcompat.widget.AppCompatTextView
            r9.<init>(r1, r2)
            int r2 = defpackage.yaa.o
            r9.setId(r2)
            k23 r2 = new k23
            r2.<init>(r7, r7)
            r9.setLayoutParams(r2)
            r9.setGravity(r5)
            r12.b(r9, defpackage.yq4.b)
            r8.r(r9)
            r2 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
            r9.setTextColor(r2)
            r9.setEllipsize(r10)
            r9.setMaxLines(r5)
            r0.w0 = r9
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            int r1 = defpackage.yaa.l
            r2.setId(r1)
            k23 r1 = new k23
            r1.<init>(r7, r7)
            r2.setLayoutParams(r1)
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r6
            int r1 = a24.X(r1)
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = a24.X(r6)
            int r8 = r2.getPaddingTop()
            int r10 = r2.getPaddingBottom()
            r2.setPaddingRelative(r1, r8, r6, r10)
            r1 = 0
            r2.setOrientation(r1)
            r2.addView(r11)
            r2.addView(r14)
            r2.addView(r9)
            r0.x0 = r2
            int r6 = defpackage.yaa.j
            r0.setId(r6)
            k23 r6 = new k23
            r8 = -1
            r6.<init>(r8, r7)
            r7 = 172(0xac, float:2.41E-43)
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = a24.X(r7)
            r0.setMinimumHeight(r7)
            r7 = 2
            r6.a = r7
            r7 = -1097229926(0xffffffffbe99999a, float:-0.3)
            r6.b = r7
            r7 = 24
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = a24.X(r7)
            r6.bottomMargin = r7
            r0.setLayoutParams(r6)
            r0.setClipToPadding(r1)
            r0.setGravity(r5)
            r0.setOrientation(r5)
            r0.addView(r3)
            r0.addView(r4)
            r0.addView(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9d.<init>(android.content.Context):void");
    }

    private final void setDivider(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
    }

    private final void setNickname(String str) {
        AppCompatTextView appCompatTextView = this.w0;
        int i = 0;
        if (!(true ^ (str == null || str.length() == 0))) {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    private final void setPhoneNumber(String str) {
        AppCompatTextView appCompatTextView = this.c;
        int i = 0;
        if (!(true ^ (str == null || str.length() == 0))) {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    public final void onThemeChanged(pda pda) {
        this.b.setTextColor(pda.getText().e);
        this.c.setTextColor(-16745729);
        this.w0.setTextColor(-16745729);
        this.o.setTextColor(pda.getText().g);
    }

    public void setAlpha(float f) {
        this.x0.setAlpha(f);
        this.a.setAlpha(f);
    }

    public final void setAvatarClickedListener(s16 s16) {
        a24.a0(this.a, new q6(23, s16));
    }

    public final void setNicknameClickListener(s16 s16) {
        a24.a0(this.w0, new q6(22, s16));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if ((!(r6 == null || r6.length() == 0)) != false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTopBarContent(defpackage.u9d r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.b
            mz9 r1 = r5.a
            r1.setAvatarUrl(r0)
            ub0 r0 = new ub0
            long r2 = r6.a
            java.lang.CharSequence r4 = r6.d
            r0.<init>(r4, r2)
            r2 = 1
            r1.g(r0, r2)
            androidx.appcompat.widget.AppCompatTextView r0 = r5.b
            java.lang.String r1 = r6.c
            r0.setText(r1)
            java.lang.String r0 = r6.e
            r5.setPhoneNumber(r0)
            java.lang.String r6 = r6.f
            r5.setNickname(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0031
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = r1
            goto L_0x0032
        L_0x0031:
            r0 = r2
        L_0x0032:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0045
            if (r6 == 0) goto L_0x0040
            int r6 = r6.length()
            if (r6 != 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r6 = r1
            goto L_0x0041
        L_0x0040:
            r6 = r2
        L_0x0041:
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r2 = r1
        L_0x0046:
            r5.setDivider(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9d.setTopBarContent(u9d):void");
    }

    public final void setUserPhoneClickListener(s16 s16) {
        a24.a0(this.c, new q6(21, s16));
    }
}
