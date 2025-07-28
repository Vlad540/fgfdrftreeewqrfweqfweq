package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: rdd  reason: default package */
public final class rdd extends w9b {
    public n06 J0;
    public final TextView K0;
    public final AppCompatEditText L0;
    public final AppCompatTextView M0;
    public final OneMeButton N0;
    public final ImageView O0;
    public final ImageView P0;
    public final LinearLayout Q0;
    public final TextView R0;
    public final TextView S0;

    /* JADX WARNING: type inference failed for: r12v11, types: [java.lang.Object, android.widget.TextView$OnEditorActionListener] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rdd(android.content.Context r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            r0.<init>(r2)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r1)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = -1
            r4.<init>(r5, r6)
            r3.setLayoutParams(r4)
            r4 = 16
            r3.setGravity(r4)
            nge r7 = defpackage.nte.k
            r7.b(r3, defpackage.yq4.b)
            r0.K0 = r3
            androidx.appcompat.widget.AppCompatEditText r8 = new androidx.appcompat.widget.AppCompatEditText
            r9 = 0
            r8.<init>(r1, r9)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r5, r5)
            r11 = 1065353216(0x3f800000, float:1.0)
            r10.weight = r11
            r12 = 0
            float r13 = (float) r12
            android.content.res.Resources r14 = defpackage.dh4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r14 = r14 * r13
            int r14 = a24.X(r14)
            r15 = 12
            float r15 = (float) r15
            android.content.res.Resources r16 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r16.getDisplayMetrics()
            float r12 = r12.density
            float r12 = r12 * r15
            int r12 = a24.X(r12)
            int r6 = r8.getPaddingTop()
            int r4 = r8.getPaddingBottom()
            r8.setPaddingRelative(r14, r6, r12, r4)
            r8.setLayoutParams(r10)
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r8.setEllipsize(r4)
            r6 = 524288(0x80000, float:7.34684E-40)
            r8.setInputType(r6)
            r7.b(r8, defpackage.yq4.b)
            r8.setBackground(r9)
            r6 = 1
            r8.setSingleLine(r6)
            s59 r10 = km4.y0
            pda r12 = r10.r(r8)
            cfe r12 = r12.getText()
            int r12 = r12.h
            r8.setHintTextColor(r12)
            android.content.res.Resources r12 = r8.getResources()
            int r14 = defpackage.i8a.C0
            java.lang.CharSequence r12 = r12.getText(r14)
            r8.setHint(r12)
            pdd r12 = new pdd
            r12.<init>(r0, r8)
            r8.setOnFocusChangeListener(r12)
            qdd r12 = new qdd
            r12.<init>()
            r8.setOnEditorActionListener(r12)
            r0.L0 = r8
            androidx.appcompat.widget.AppCompatTextView r12 = new androidx.appcompat.widget.AppCompatTextView
            r12.<init>(r1, r9)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r5, r5)
            r14.weight = r11
            android.content.res.Resources r11 = defpackage.dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r13 = r13 * r11
            int r11 = a24.X(r13)
            r13 = 10
            float r13 = (float) r13
            android.content.res.Resources r17 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r17.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r13
            int r5 = a24.X(r5)
            android.content.res.Resources r17 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r17.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r15
            int r6 = a24.X(r6)
            android.content.res.Resources r17 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r17.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r13
            int r9 = a24.X(r9)
            r12.setPaddingRelative(r11, r5, r6, r9)
            r12.setLayoutParams(r14)
            r12.setEllipsize(r4)
            r4 = 16
            r12.setGravity(r4)
            r7.b(r12, defpackage.yq4.b)
            r4 = 0
            r12.setBackground(r4)
            r5 = 1
            r12.setSingleLine(r5)
            r0.M0 = r12
            one.me.sdk.uikit.common.button.OneMeButton r5 = new one.me.sdk.uikit.common.button.OneMeButton
            r5.<init>(r1, r4)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r15
            int r4 = a24.X(r4)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r15
            int r6 = a24.X(r6)
            int r7 = r5.getPaddingTop()
            int r9 = r5.getPaddingBottom()
            r5.setPaddingRelative(r4, r7, r6, r9)
            v0a r4 = defpackage.v0a.b
            r5.setSize(r4)
            u0a r4 = defpackage.u0a.b
            r5.setMode(r4)
            s0a r4 = defpackage.s0a.a
            r5.setAppearance(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r7 = -1
            r4.<init>(r7, r6)
            r5.setLayoutParams(r4)
            r0.N0 = r5
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r1)
            int r6 = defpackage.f8a.w0
            r4.setId(r6)
            r7 = 8
            r4.setVisibility(r7)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r11 = 24
            float r11 = (float) r11
            android.content.res.Resources r14 = defpackage.dh4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r14 = r14 * r11
            int r14 = a24.X(r14)
            android.content.res.Resources r17 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r17.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r11
            int r7 = a24.X(r7)
            r9.<init>(r14, r7)
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r15
            int r7 = a24.X(r7)
            int r14 = r9.topMargin
            r17 = r5
            int r5 = r9.getMarginEnd()
            r18 = r2
            int r2 = r9.bottomMargin
            r9.setMarginStart(r7)
            r9.topMargin = r14
            r9.setMarginEnd(r5)
            r9.bottomMargin = r2
            r4.setLayoutParams(r9)
            wfc r2 = new wfc
            r5 = 5
            r2.<init>(r5, r0)
            a24.a0(r4, r2)
            int r2 = defpackage.phc.o0
            pda r5 = r10.r(r4)
            yn6 r5 = r5.getIcon()
            android.content.Context r7 = r4.getContext()
            android.graphics.drawable.Drawable r2 = gq3.b(r7, r2)
            int r5 = r5.i
            js.D(r2, r5)
            r4.setImageDrawable(r2)
            r0.O0 = r4
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r1)
            r2.setId(r6)
            r5 = 8
            r2.setVisibility(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r11
            int r6 = a24.X(r6)
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r11
            int r7 = a24.X(r7)
            r5.<init>(r6, r7)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r15
            int r6 = a24.X(r6)
            int r7 = r5.topMargin
            int r9 = r5.getMarginEnd()
            int r14 = r5.bottomMargin
            r5.setMarginStart(r6)
            r5.topMargin = r7
            r5.setMarginEnd(r9)
            r5.bottomMargin = r14
            r2.setLayoutParams(r5)
            int r5 = defpackage.phc.t0
            pda r6 = r10.r(r2)
            yn6 r6 = r6.getIcon()
            android.content.Context r7 = r2.getContext()
            android.graphics.drawable.Drawable r5 = gq3.b(r7, r5)
            int r6 = r6.f
            js.D(r5, r6)
            r2.setImageDrawable(r5)
            r0.P0 = r2
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r1)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r9 = -1
            r6.<init>(r9, r7)
            r5.setLayoutParams(r6)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r15
            int r6 = a24.X(r6)
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r15
            int r7 = a24.X(r7)
            int r9 = r5.getPaddingTop()
            int r14 = r5.getPaddingBottom()
            r5.setPaddingRelative(r6, r9, r7, r14)
            r6 = 16
            r5.setGravity(r6)
            r6 = 0
            r5.setOrientation(r6)
            r6 = 1
            r5.setClipToOutline(r6)
            eu3 r6 = new eu3
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r15
            int r7 = a24.X(r7)
            float r7 = (float) r7
            r6.<init>(r7)
            r5.setOutlineProvider(r6)
            pda r6 = r10.r(r5)
            nd0 r6 = r6.b()
            int r6 = r6.h
            r5.setBackgroundColor(r6)
            r5.addView(r3)
            r5.addView(r8)
            r5.addView(r12)
            r5.addView(r2)
            r5.addView(r4)
            r0.Q0 = r5
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            pda r3 = r10.r(r2)
            cfe r3 = r3.getText()
            int r3 = r3.b
            r2.setTextColor(r3)
            nge r3 = defpackage.nte.o
            r3.b(r2, defpackage.yq4.b)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r11 = r11 * r4
            int r4 = a24.X(r11)
            int r6 = r2.getPaddingTop()
            int r7 = r2.getPaddingEnd()
            int r8 = r2.getPaddingBottom()
            r2.setPaddingRelative(r4, r6, r7, r8)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r4.<init>(r6, r6)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r13
            int r6 = a24.X(r6)
            r4.topMargin = r6
            r2.setLayoutParams(r4)
            r0.R0 = r2
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r1)
            r3.b(r4, defpackage.yq4.b)
            android.content.res.Resources r1 = r4.getResources()
            int r3 = defpackage.i8a.B0
            java.lang.CharSequence r1 = r1.getText(r3)
            r4.setText(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r1.<init>(r3, r3)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r13
            int r3 = a24.X(r3)
            r1.topMargin = r3
            r4.setLayoutParams(r1)
            r0.S0 = r4
            r1 = r18
            r3 = 1
            r1.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r7 = -1
            r3.<init>(r7, r6)
            r1.setLayoutParams(r3)
            r3 = 16
            r1.setGravity(r3)
            r1.addView(r5)
            r3 = r17
            r1.addView(r3)
            r1.addView(r2)
            r1.addView(r4)
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r15
            int r2 = a24.X(r2)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r13 = r13 * r3
            int r3 = a24.X(r13)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r15 = r15 * r4
            int r4 = a24.X(r15)
            int r5 = r1.getPaddingTop()
            r1.setPaddingRelative(r2, r5, r4, r3)
            wua r2 = new wua
            r3 = 15
            r4 = 0
            r2.<init>((java.lang.Object) r0, (kotlin.coroutines.Continuation) r4, (int) r3)
            urd.B(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.<init>(android.content.Context):void");
    }

    public final void A(pg7 pg7) {
        F(((odd) pg7).a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(n06 r13) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r13 instanceof defpackage.ldd
            android.widget.TextView r1 = r12.S0
            android.widget.LinearLayout r2 = r12.Q0
            android.widget.ImageView r3 = r12.P0
            android.widget.ImageView r4 = r12.O0
            android.view.View r5 = r12.a
            one.me.sdk.uikit.common.button.OneMeButton r6 = r12.N0
            r7 = 8
            r8 = 0
            if (r0 == 0) goto L_0x003a
            r6.setVisibility(r8)
            r6.setProgressEnabled(r8)
            r4.setVisibility(r7)
            r3.setVisibility(r7)
            r2.setVisibility(r7)
            r1.setVisibility(r7)
            r0 = r13
            ldd r0 = (defpackage.ldd) r0
            android.content.Context r1 = r5.getContext()
            mge r0 = r0.f
            java.lang.CharSequence r0 = r0.a(r1)
            r6.setText((java.lang.CharSequence) r0)
            goto L_0x00ea
        L_0x003a:
            boolean r0 = r13 instanceof defpackage.ndd
            android.widget.TextView r9 = r12.K0
            androidx.appcompat.widget.AppCompatTextView r10 = r12.M0
            androidx.appcompat.widget.AppCompatEditText r11 = r12.L0
            if (r0 == 0) goto L_0x006e
            r6.setVisibility(r7)
            r2.setVisibility(r8)
            r11.setVisibility(r7)
            r10.setVisibility(r8)
            r9.setVisibility(r7)
            r4.setVisibility(r7)
            r0 = r13
            ndd r0 = (defpackage.ndd) r0
            r3.setVisibility(r8)
            r1.setVisibility(r7)
            android.content.Context r1 = r5.getContext()
            mge r0 = r0.f
            java.lang.CharSequence r0 = r0.a(r1)
            r10.setText(r0)
            goto L_0x00ea
        L_0x006e:
            boolean r0 = r13 instanceof defpackage.mdd
            if (r0 == 0) goto L_0x0129
            r6.setVisibility(r7)
            r2.setVisibility(r8)
            r11.setVisibility(r8)
            r10.setVisibility(r7)
            r9.setVisibility(r8)
            boolean r0 = r11.isFocused()
            r2 = 1
            if (r0 == 0) goto L_0x009d
            android.text.Editable r0 = r11.getText()
            if (r0 == 0) goto L_0x0097
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r0 = r8
            goto L_0x0098
        L_0x0097:
            r0 = r2
        L_0x0098:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x009d
            r0 = r8
            goto L_0x009e
        L_0x009d:
            r0 = r7
        L_0x009e:
            r4.setVisibility(r0)
            r0 = r13
            mdd r0 = (defpackage.mdd) r0
            boolean r4 = r0.i
            java.lang.String r6 = r0.g
            if (r4 == 0) goto L_0x00c1
            boolean r4 = r11.isFocused()
            if (r4 != 0) goto L_0x00c1
            if (r6 == 0) goto L_0x00bb
            int r4 = r6.length()
            if (r4 != 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r4 = r8
            goto L_0x00bc
        L_0x00bb:
            r4 = r2
        L_0x00bc:
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x00c1
            r2 = r8
            goto L_0x00c2
        L_0x00c1:
            r2 = r7
        L_0x00c2:
            r3.setVisibility(r2)
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x00cb
            r2 = r8
            goto L_0x00cc
        L_0x00cb:
            r2 = r7
        L_0x00cc:
            r1.setVisibility(r2)
            java.lang.String r1 = r0.f
            r9.setText(r1)
            n06 r1 = r12.J0
            boolean r1 = r1 instanceof defpackage.mdd
            if (r1 != 0) goto L_0x00dd
            r11.setText(r6)
        L_0x00dd:
            android.content.Context r1 = r5.getContext()
            mge r0 = r0.h
            java.lang.CharSequence r0 = r0.a(r1)
            r11.setHint(r0)
        L_0x00ea:
            r12.J0 = r13
            android.widget.TextView r12 = r12.R0
            mge r0 = r13.q()
            if (r0 == 0) goto L_0x00fb
            java.lang.Integer r0 = r13.r()
            if (r0 == 0) goto L_0x00fb
            r7 = r8
        L_0x00fb:
            r12.setVisibility(r7)
            mge r0 = r13.q()
            if (r0 == 0) goto L_0x010d
            android.content.Context r1 = r12.getContext()
            java.lang.CharSequence r0 = r0.a(r1)
            goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            r12.setText(r0)
            java.lang.Integer r13 = r13.r()
            if (r13 == 0) goto L_0x0128
            int r13 = r13.intValue()
            s59 r0 = km4.y0
            pda r0 = r0.r(r12)
            int r13 = r0.i(r13)
            r12.setTextColor(r13)
        L_0x0128:
            return
        L_0x0129:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.F(n06):void");
    }
}
