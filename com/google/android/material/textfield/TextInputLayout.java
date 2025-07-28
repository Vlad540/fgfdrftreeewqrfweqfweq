package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import me.leolin.shortcutbadger.BuildConfig;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int R1 = kvb.Widget_Design_TextInputLayout;
    public static final int[][] S1 = {new int[]{16842919}, new int[0]};
    public int A0 = -1;
    public int A1;
    public final xv6 B0 = new xv6(this);
    public int B1;
    public boolean C0;
    public ColorStateList C1;
    public int D0;
    public int D1;
    public boolean E0;
    public int E1;
    public sfe F0 = new kce(9);
    public int F1;
    public AppCompatTextView G0;
    public int G1;
    public int H0;
    public int H1;
    public int I0;
    public int I1;
    public CharSequence J0;
    public boolean J1;
    public boolean K0;
    public final j23 K1;
    public AppCompatTextView L0;
    public boolean L1;
    public ColorStateList M0;
    public boolean M1;
    public int N0;
    public ValueAnimator N1;
    public p75 O0;
    public boolean O1;
    public p75 P0;
    public boolean P1;
    public ColorStateList Q0;
    public boolean Q1;
    public ColorStateList R0;
    public ColorStateList S0;
    public ColorStateList T0;
    public boolean U0;
    public CharSequence V0;
    public boolean W0;
    public lw7 X0;
    public lw7 Y0;
    public StateListDrawable Z0;
    public final FrameLayout a;
    public boolean a1;
    public final hpd b;
    public lw7 b1;
    public final gy4 c;
    public lw7 c1;
    public ead d1;
    public boolean e1;
    public final int f1;
    public int g1;
    public int h1;
    public int i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;
    public final Rect n1 = new Rect();
    public EditText o;
    public final Rect o1 = new Rect();
    public final RectF p1 = new RectF();
    public Typeface q1;
    public ColorDrawable r1;
    public int s1;
    public final LinkedHashSet t1 = new LinkedHashSet();
    public ColorDrawable u1;
    public int v1;
    public CharSequence w0;
    public Drawable w1;
    public int x0 = -1;
    public ColorStateList x1;
    public int y0 = -1;
    public ColorStateList y1;
    public int z0 = -1;
    public int z1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            int r8 = defpackage.wlb.textInputStyle
            int r9 = R1
            r1 = r17
            android.content.Context r1 = defpackage.tw7.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.x0 = r10
            r0.y0 = r10
            r0.z0 = r10
            r0.A0 = r10
            xv6 r1 = new xv6
            r1.<init>(r0)
            r0.B0 = r1
            kce r1 = new kce
            r2 = 9
            r1.<init>(r2)
            r0.F0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.n1 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.o1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.p1 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.t1 = r1
            j23 r1 = new j23
            r1.<init>(r0)
            r0.K1 = r1
            r11 = 0
            r0.Q1 = r11
            android.content.Context r12 = r16.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.a = r14
            r14.setAddStatesFromChildren(r13)
            android.view.animation.LinearInterpolator r2 = defpackage.og.a
            r1.W = r2
            r1.i(r11)
            r1.V = r2
            r1.i(r11)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.l(r2)
            int[] r15 = defpackage.xvb.TextInputLayout
            int r1 = defpackage.xvb.TextInputLayout_counterTextAppearance
            int r2 = defpackage.xvb.TextInputLayout_counterOverflowTextAppearance
            int r3 = defpackage.xvb.TextInputLayout_errorTextAppearance
            int r4 = defpackage.xvb.TextInputLayout_helperTextTextAppearance
            int r5 = defpackage.xvb.TextInputLayout_hintTextAppearance
            int[] r6 = new int[]{r1, r2, r3, r4, r5}
            defpackage.she.a(r12, r7, r8, r9)
            r1 = r12
            r2 = r18
            r3 = r15
            r4 = r8
            r5 = r9
            defpackage.she.b(r1, r2, r3, r4, r5, r6)
            ydc r1 = new ydc
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r7, r15, r8, r9)
            r1.<init>(r12, r2)
            hpd r3 = new hpd
            r3.<init>(r0, r1)
            r0.b = r3
            int r4 = defpackage.xvb.TextInputLayout_hintEnabled
            boolean r4 = r2.getBoolean(r4, r13)
            r0.U0 = r4
            int r4 = defpackage.xvb.TextInputLayout_android_hint
            java.lang.CharSequence r4 = r2.getText(r4)
            r0.setHint((java.lang.CharSequence) r4)
            int r4 = defpackage.xvb.TextInputLayout_hintAnimationEnabled
            boolean r4 = r2.getBoolean(r4, r13)
            r0.M1 = r4
            int r4 = defpackage.xvb.TextInputLayout_expandedHintEnabled
            boolean r4 = r2.getBoolean(r4, r13)
            r0.L1 = r4
            int r4 = defpackage.xvb.TextInputLayout_android_minEms
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x00d9
            int r4 = defpackage.xvb.TextInputLayout_android_minEms
            int r4 = r2.getInt(r4, r10)
            r0.setMinEms(r4)
            goto L_0x00ea
        L_0x00d9:
            int r4 = defpackage.xvb.TextInputLayout_android_minWidth
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x00ea
            int r4 = defpackage.xvb.TextInputLayout_android_minWidth
            int r4 = r2.getDimensionPixelSize(r4, r10)
            r0.setMinWidth(r4)
        L_0x00ea:
            int r4 = defpackage.xvb.TextInputLayout_android_maxEms
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x00fc
            int r4 = defpackage.xvb.TextInputLayout_android_maxEms
            int r4 = r2.getInt(r4, r10)
            r0.setMaxEms(r4)
            goto L_0x010d
        L_0x00fc:
            int r4 = defpackage.xvb.TextInputLayout_android_maxWidth
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x010d
            int r4 = defpackage.xvb.TextInputLayout_android_maxWidth
            int r4 = r2.getDimensionPixelSize(r4, r10)
            r0.setMaxWidth(r4)
        L_0x010d:
            buf r4 = defpackage.ead.b(r12, r7, r8, r9)
            ead r4 = r4.c()
            r0.d1 = r4
            android.content.res.Resources r4 = r12.getResources()
            int r5 = defpackage.vmb.mtrl_textinput_box_label_cutout_padding
            int r4 = r4.getDimensionPixelOffset(r5)
            r0.f1 = r4
            int r4 = defpackage.xvb.TextInputLayout_boxCollapsedPaddingTop
            int r4 = r2.getDimensionPixelOffset(r4, r11)
            r0.h1 = r4
            int r4 = defpackage.xvb.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r5 = r12.getResources()
            int r6 = defpackage.vmb.mtrl_textinput_box_stroke_width_default
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r2.getDimensionPixelSize(r4, r5)
            r0.j1 = r4
            int r4 = defpackage.xvb.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r5 = r12.getResources()
            int r6 = defpackage.vmb.mtrl_textinput_box_stroke_width_focused
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r2.getDimensionPixelSize(r4, r5)
            r0.k1 = r4
            int r4 = r0.j1
            r0.i1 = r4
            int r4 = defpackage.xvb.TextInputLayout_boxCornerRadiusTopStart
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r2.getDimension(r4, r5)
            int r6 = defpackage.xvb.TextInputLayout_boxCornerRadiusTopEnd
            float r6 = r2.getDimension(r6, r5)
            int r7 = defpackage.xvb.TextInputLayout_boxCornerRadiusBottomEnd
            float r7 = r2.getDimension(r7, r5)
            int r8 = defpackage.xvb.TextInputLayout_boxCornerRadiusBottomStart
            float r5 = r2.getDimension(r8, r5)
            ead r8 = r0.d1
            buf r8 = r8.e()
            r9 = 0
            int r15 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r15 < 0) goto L_0x017f
            a0 r15 = new a0
            r15.<init>(r4)
            r8.e = r15
        L_0x017f:
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x018a
            a0 r4 = new a0
            r4.<init>(r6)
            r8.f = r4
        L_0x018a:
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x0195
            a0 r4 = new a0
            r4.<init>(r7)
            r8.g = r4
        L_0x0195:
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x01a0
            a0 r4 = new a0
            r4.<init>(r5)
            r8.h = r4
        L_0x01a0:
            ead r4 = r8.c()
            r0.d1 = r4
            int r4 = defpackage.xvb.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r4 = defpackage.wx3.h(r12, r1, r4)
            if (r4 == 0) goto L_0x0206
            int r5 = r4.getDefaultColor()
            r0.D1 = r5
            r0.m1 = r5
            boolean r5 = r4.isStateful()
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r5 == 0) goto L_0x01e7
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.E1 = r5
            r5 = 16842908(0x101009c, float:2.3693995E-38)
            r7 = 16842910(0x101009e, float:2.3694E-38)
            int[] r5 = new int[]{r5, r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.F1 = r5
            int[] r5 = new int[]{r6, r7}
            int r4 = r4.getColorForState(r5, r10)
            r0.G1 = r4
            goto L_0x0210
        L_0x01e7:
            int r4 = r0.D1
            r0.F1 = r4
            int r4 = defpackage.hmb.mtrl_filled_background_color
            android.content.res.ColorStateList r4 = defpackage.d8.r(r12, r4)
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.E1 = r5
            int[] r5 = new int[]{r6}
            int r4 = r4.getColorForState(r5, r10)
            r0.G1 = r4
            goto L_0x0210
        L_0x0206:
            r0.m1 = r11
            r0.D1 = r11
            r0.E1 = r11
            r0.F1 = r11
            r0.G1 = r11
        L_0x0210:
            int r4 = defpackage.xvb.TextInputLayout_android_textColorHint
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0222
            int r4 = defpackage.xvb.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r4 = r1.w(r4)
            r0.y1 = r4
            r0.x1 = r4
        L_0x0222:
            int r4 = defpackage.xvb.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r4 = defpackage.wx3.h(r12, r1, r4)
            int r5 = defpackage.xvb.TextInputLayout_boxStrokeColor
            int r5 = r2.getColor(r5, r11)
            r0.B1 = r5
            int r5 = defpackage.hmb.mtrl_textinput_default_box_stroke_color
            int r5 = defpackage.hq3.a(r12, r5)
            r0.z1 = r5
            int r5 = defpackage.hmb.mtrl_textinput_disabled_color
            int r5 = defpackage.hq3.a(r12, r5)
            r0.H1 = r5
            int r5 = defpackage.hmb.mtrl_textinput_hovered_box_stroke_color
            int r5 = defpackage.hq3.a(r12, r5)
            r0.A1 = r5
            if (r4 == 0) goto L_0x024d
            r0.setBoxStrokeColorStateList(r4)
        L_0x024d:
            int r4 = defpackage.xvb.TextInputLayout_boxStrokeErrorColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x025e
            int r4 = defpackage.xvb.TextInputLayout_boxStrokeErrorColor
            android.content.res.ColorStateList r4 = defpackage.wx3.h(r12, r1, r4)
            r0.setBoxStrokeErrorColor(r4)
        L_0x025e:
            int r4 = defpackage.xvb.TextInputLayout_hintTextAppearance
            int r4 = r2.getResourceId(r4, r10)
            if (r4 == r10) goto L_0x026f
            int r4 = defpackage.xvb.TextInputLayout_hintTextAppearance
            int r4 = r2.getResourceId(r4, r11)
            r0.setHintTextAppearance(r4)
        L_0x026f:
            int r4 = defpackage.xvb.TextInputLayout_cursorColor
            android.content.res.ColorStateList r4 = r1.w(r4)
            r0.S0 = r4
            int r4 = defpackage.xvb.TextInputLayout_cursorErrorColor
            android.content.res.ColorStateList r4 = r1.w(r4)
            r0.T0 = r4
            int r4 = defpackage.xvb.TextInputLayout_errorTextAppearance
            int r4 = r2.getResourceId(r4, r11)
            int r5 = defpackage.xvb.TextInputLayout_errorContentDescription
            java.lang.CharSequence r5 = r2.getText(r5)
            int r6 = defpackage.xvb.TextInputLayout_errorAccessibilityLiveRegion
            int r6 = r2.getInt(r6, r13)
            int r7 = defpackage.xvb.TextInputLayout_errorEnabled
            boolean r7 = r2.getBoolean(r7, r11)
            int r8 = defpackage.xvb.TextInputLayout_helperTextTextAppearance
            int r8 = r2.getResourceId(r8, r11)
            int r9 = defpackage.xvb.TextInputLayout_helperTextEnabled
            boolean r9 = r2.getBoolean(r9, r11)
            int r12 = defpackage.xvb.TextInputLayout_helperText
            java.lang.CharSequence r12 = r2.getText(r12)
            int r15 = defpackage.xvb.TextInputLayout_placeholderTextAppearance
            int r15 = r2.getResourceId(r15, r11)
            int r13 = defpackage.xvb.TextInputLayout_placeholderText
            java.lang.CharSequence r13 = r2.getText(r13)
            int r10 = defpackage.xvb.TextInputLayout_counterEnabled
            boolean r10 = r2.getBoolean(r10, r11)
            int r11 = defpackage.xvb.TextInputLayout_counterMaxLength
            r18 = r12
            r12 = -1
            int r11 = r2.getInt(r11, r12)
            r0.setCounterMaxLength(r11)
            int r11 = defpackage.xvb.TextInputLayout_counterTextAppearance
            r12 = 0
            int r11 = r2.getResourceId(r11, r12)
            r0.I0 = r11
            int r11 = defpackage.xvb.TextInputLayout_counterOverflowTextAppearance
            int r11 = r2.getResourceId(r11, r12)
            r0.H0 = r11
            int r11 = defpackage.xvb.TextInputLayout_boxBackgroundMode
            int r11 = r2.getInt(r11, r12)
            r0.setBoxBackgroundMode(r11)
            r0.setErrorContentDescription(r5)
            r0.setErrorAccessibilityLiveRegion(r6)
            int r5 = r0.H0
            r0.setCounterOverflowTextAppearance(r5)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorTextAppearance(r4)
            int r4 = r0.I0
            r0.setCounterTextAppearance(r4)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r15)
            int r4 = defpackage.xvb.TextInputLayout_errorTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x030e
            int r4 = defpackage.xvb.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r4 = r1.w(r4)
            r0.setErrorTextColor(r4)
        L_0x030e:
            int r4 = defpackage.xvb.TextInputLayout_helperTextTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x031f
            int r4 = defpackage.xvb.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r4 = r1.w(r4)
            r0.setHelperTextColor(r4)
        L_0x031f:
            int r4 = defpackage.xvb.TextInputLayout_hintTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0330
            int r4 = defpackage.xvb.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r4 = r1.w(r4)
            r0.setHintTextColor(r4)
        L_0x0330:
            int r4 = defpackage.xvb.TextInputLayout_counterTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0341
            int r4 = defpackage.xvb.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r4 = r1.w(r4)
            r0.setCounterTextColor(r4)
        L_0x0341:
            int r4 = defpackage.xvb.TextInputLayout_counterOverflowTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0352
            int r4 = defpackage.xvb.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r4 = r1.w(r4)
            r0.setCounterOverflowTextColor(r4)
        L_0x0352:
            int r4 = defpackage.xvb.TextInputLayout_placeholderTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0363
            int r4 = defpackage.xvb.TextInputLayout_placeholderTextColor
            android.content.res.ColorStateList r4 = r1.w(r4)
            r0.setPlaceholderTextColor(r4)
        L_0x0363:
            gy4 r4 = new gy4
            r4.<init>(r0, r1)
            r0.c = r4
            int r5 = defpackage.xvb.TextInputLayout_android_enabled
            r6 = 1
            boolean r2 = r2.getBoolean(r5, r6)
            r1.E()
            java.util.WeakHashMap r1 = defpackage.eaf.a
            r1 = 2
            r0.setImportantForAccessibility(r1)
            defpackage.w9f.m(r0, r6)
            r14.addView(r3)
            r14.addView(r4)
            r0.addView(r14)
            r0.setEnabled(r2)
            r0.setHelperTextEnabled(r9)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r10)
            r1 = r18
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.o;
        if (!(editText instanceof AutoCompleteTextView) || bm3.t(editText)) {
            return this.X0;
        }
        int r = vx3.r(this.o, wlb.colorControlHighlight);
        int i = this.g1;
        int[][] iArr = S1;
        if (i == 2) {
            Context context = getContext();
            lw7 lw7 = this.X0;
            int q = vx3.q(wlb.colorSurface, context, "TextInputLayout");
            lw7 lw72 = new lw7(lw7.a.a);
            int C = vx3.C(r, 0.1f, q);
            lw72.l(new ColorStateList(iArr, new int[]{C, 0}));
            lw72.setTint(q);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{C, q});
            lw7 lw73 = new lw7(lw7.a.a);
            lw73.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, lw72, lw73), lw7});
        } else if (i != 1) {
            return null;
        } else {
            lw7 lw74 = this.X0;
            int i2 = this.m1;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{vx3.C(r, 0.1f, i2), i2}), lw74, lw74);
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.Z0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.Z0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.Z0.addState(new int[0], f(false));
        }
        return this.Z0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.Y0 == null) {
            this.Y0 = f(true);
        }
        return this.Y0;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.o == null) {
            if (getEndIconMode() != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.o = editText;
            int i = this.x0;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.z0);
            }
            int i2 = this.y0;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.A0);
            }
            this.a1 = false;
            i();
            setTextInputAccessibilityDelegate(new rfe(this));
            Typeface typeface = this.o.getTypeface();
            j23 j23 = this.K1;
            boolean m = j23.m(typeface);
            boolean o2 = j23.o(typeface);
            if (m || o2) {
                j23.i(false);
            }
            float textSize = this.o.getTextSize();
            if (j23.l != textSize) {
                j23.l = textSize;
                j23.i(false);
            }
            float letterSpacing = this.o.getLetterSpacing();
            if (j23.g0 != letterSpacing) {
                j23.g0 = letterSpacing;
                j23.i(false);
            }
            int gravity = this.o.getGravity();
            j23.l((gravity & -113) | 48);
            if (j23.j != gravity) {
                j23.j = gravity;
                j23.i(false);
            }
            WeakHashMap weakHashMap = eaf.a;
            this.I1 = editText.getMinimumHeight();
            this.o.addTextChangedListener(new qfe(this, editText));
            if (this.x1 == null) {
                this.x1 = this.o.getHintTextColors();
            }
            if (this.U0) {
                if (TextUtils.isEmpty(this.V0)) {
                    CharSequence hint = this.o.getHint();
                    this.w0 = hint;
                    setHint(hint);
                    this.o.setHint((CharSequence) null);
                }
                this.W0 = true;
            }
            p();
            if (this.G0 != null) {
                n(this.o.getText());
            }
            r();
            this.B0.b();
            this.b.bringToFront();
            gy4 gy4 = this.c;
            gy4.bringToFront();
            Iterator it = this.t1.iterator();
            while (it.hasNext()) {
                ((fy4) it.next()).a(this);
            }
            gy4.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.V0)) {
            this.V0 = charSequence;
            j23 j23 = this.K1;
            if (charSequence == null || !TextUtils.equals(j23.G, charSequence)) {
                j23.G = charSequence;
                j23.H = null;
                Bitmap bitmap = j23.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    j23.K = null;
                }
                j23.i(false);
            }
            if (!this.J1) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.K0 != z) {
            if (z) {
                AppCompatTextView appCompatTextView = this.L0;
                if (appCompatTextView != null) {
                    this.a.addView(appCompatTextView);
                    this.L0.setVisibility(0);
                }
            } else {
                AppCompatTextView appCompatTextView2 = this.L0;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setVisibility(8);
                }
                this.L0 = null;
            }
            this.K0 = z;
        }
    }

    public final void a(float f) {
        j23 j23 = this.K1;
        if (j23.b != f) {
            if (this.N1 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.N1 = valueAnimator;
                valueAnimator.setInterpolator(ct0.I(getContext(), wlb.motionEasingEmphasizedInterpolator, og.b));
                this.N1.setDuration((long) ct0.H(wlb.motionDurationMedium4, 167, getContext()));
                this.N1.addUpdateListener(new ti0(8, this));
            }
            this.N1.setFloatValues(new float[]{j23.b, f});
            this.N1.start();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        int i;
        int i2;
        lw7 lw7 = this.X0;
        if (lw7 != null) {
            ead ead = lw7.a.a;
            ead ead2 = this.d1;
            if (ead != ead2) {
                lw7.setShapeAppearanceModel(ead2);
            }
            if (this.g1 == 2 && (i = this.i1) > -1 && (i2 = this.l1) != 0) {
                lw7 lw72 = this.X0;
                lw72.a.k = (float) i;
                lw72.invalidateSelf();
                lw72.n(ColorStateList.valueOf(i2));
            }
            int i3 = this.m1;
            if (this.g1 == 1) {
                i3 = j33.f(this.m1, vx3.p(wlb.colorSurface, 0, getContext()));
            }
            this.m1 = i3;
            this.X0.l(ColorStateList.valueOf(i3));
            lw7 lw73 = this.b1;
            if (!(lw73 == null || this.c1 == null)) {
                if (this.i1 > -1 && this.l1 != 0) {
                    lw73.l(this.o.isFocused() ? ColorStateList.valueOf(this.z1) : ColorStateList.valueOf(this.l1));
                    this.c1.l(ColorStateList.valueOf(this.l1));
                }
                invalidate();
            }
            s();
        }
    }

    public final int c() {
        float e;
        if (!this.U0) {
            return 0;
        }
        int i = this.g1;
        j23 j23 = this.K1;
        if (i == 0) {
            e = j23.e();
        } else if (i != 2) {
            return 0;
        } else {
            e = j23.e() / 2.0f;
        }
        return (int) e;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [cre, fdf, p75] */
    public final p75 d() {
        ? fdf = new fdf();
        fdf.c = (long) ct0.H(wlb.motionDurationShort2, 87, getContext());
        fdf.o = ct0.I(getContext(), wlb.motionEasingLinearInterpolator, og.a);
        return fdf;
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.o;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.w0 != null) {
            boolean z = this.W0;
            this.W0 = false;
            CharSequence hint = editText.getHint();
            this.o.setHint(this.w0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.o.setHint(hint);
                this.W0 = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            FrameLayout frameLayout = this.a;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
                View childAt = frameLayout.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.o) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.P1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.P1 = false;
    }

    public final void draw(Canvas canvas) {
        lw7 lw7;
        super.draw(canvas);
        boolean z = this.U0;
        j23 j23 = this.K1;
        if (z) {
            j23.d(canvas);
        }
        if (this.c1 != null && (lw7 = this.b1) != null) {
            lw7.draw(canvas);
            if (this.o.isFocused()) {
                Rect bounds = this.c1.getBounds();
                Rect bounds2 = this.b1.getBounds();
                float f = j23.b;
                int centerX = bounds2.centerX();
                bounds.left = og.c(centerX, f, bounds2.left);
                bounds.right = og.c(centerX, f, bounds2.right);
                this.c1.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.O1
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.O1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            j23 r3 = r4.K1
            if (r3 == 0) goto L_0x002f
            r3.R = r1
            android.content.res.ColorStateList r1 = r3.o
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r3.n
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            r3.i(r2)
            r1 = r0
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            android.widget.EditText r3 = r4.o
            if (r3 == 0) goto L_0x0047
            java.util.WeakHashMap r3 = defpackage.eaf.a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L_0x0043
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r0 = r2
        L_0x0044:
            r4.u(r0, r2)
        L_0x0047:
            r4.r()
            r4.x()
            if (r1 == 0) goto L_0x0052
            r4.invalidate()
        L_0x0052:
            r4.O1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.U0 && !TextUtils.isEmpty(this.V0) && (this.X0 instanceof ux3);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [udd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [udd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [udd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [udd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [ead, java.lang.Object] */
    public final lw7 f(boolean z) {
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(vmb.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.o;
        float popupElevation = editText instanceof qv7 ? ((qv7) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(vmb.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(vmb.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        ? obj4 = new Object();
        qr4 qr4 = new qr4(0);
        qr4 qr42 = new qr4(0);
        qr4 qr43 = new qr4(0);
        qr4 qr44 = new qr4(0);
        a0 a0Var = new a0(f);
        a0 a0Var2 = new a0(f);
        a0 a0Var3 = new a0(dimensionPixelOffset);
        a0 a0Var4 = new a0(dimensionPixelOffset);
        ? obj5 = new Object();
        obj5.a = obj;
        obj5.b = obj2;
        obj5.c = obj3;
        obj5.d = obj4;
        obj5.e = a0Var;
        obj5.f = a0Var2;
        obj5.g = a0Var4;
        obj5.h = a0Var3;
        obj5.i = qr4;
        obj5.j = qr42;
        obj5.k = qr43;
        obj5.l = qr44;
        EditText editText2 = this.o;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof qv7 ? ((qv7) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = lw7.M0;
            dropDownBackgroundTintList = ColorStateList.valueOf(vx3.q(wlb.colorSurface, context, lw7.class.getSimpleName()));
        }
        lw7 lw7 = new lw7();
        lw7.j(context);
        lw7.l(dropDownBackgroundTintList);
        lw7.k(popupElevation);
        lw7.setShapeAppearanceModel(obj5);
        kw7 kw7 = lw7.a;
        if (kw7.h == null) {
            kw7.h = new Rect();
        }
        lw7.a.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        lw7.invalidateSelf();
        return lw7;
    }

    public final int g(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.o.getCompoundPaddingLeft() : this.c.c() : this.b.a()) + i;
    }

    public int getBaseline() {
        EditText editText = this.o;
        if (editText == null) {
            return super.getBaseline();
        }
        int baseline = editText.getBaseline();
        return c() + getPaddingTop() + baseline;
    }

    public lw7 getBoxBackground() {
        int i = this.g1;
        if (i == 1 || i == 2) {
            return this.X0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.m1;
    }

    public int getBoxBackgroundMode() {
        return this.g1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.h1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean z = gwf.z(this);
        RectF rectF = this.p1;
        return z ? this.d1.h.a(rectF) : this.d1.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean z = gwf.z(this);
        RectF rectF = this.p1;
        return z ? this.d1.g.a(rectF) : this.d1.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean z = gwf.z(this);
        RectF rectF = this.p1;
        return z ? this.d1.e.a(rectF) : this.d1.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean z = gwf.z(this);
        RectF rectF = this.p1;
        return z ? this.d1.f.a(rectF) : this.d1.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.B1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.C1;
    }

    public int getBoxStrokeWidth() {
        return this.j1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.k1;
    }

    public int getCounterMaxLength() {
        return this.D0;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (!this.C0 || !this.E0 || (appCompatTextView = this.G0) == null) {
            return null;
        }
        return appCompatTextView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.R0;
    }

    public ColorStateList getCounterTextColor() {
        return this.Q0;
    }

    public ColorStateList getCursorColor() {
        return this.S0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.T0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.x1;
    }

    public EditText getEditText() {
        return this.o;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.y0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.y0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.E0;
    }

    public int getEndIconMode() {
        return this.c.A0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.F0;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.y0;
    }

    public CharSequence getError() {
        xv6 xv6 = this.B0;
        if (xv6.q) {
            return xv6.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.B0.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.B0.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.B0.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        xv6 xv6 = this.B0;
        if (xv6.x) {
            return xv6.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.B0.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.U0) {
            return this.V0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.K1.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        j23 j23 = this.K1;
        return j23.f(j23.o);
    }

    public ColorStateList getHintTextColor() {
        return this.y1;
    }

    public sfe getLengthCounter() {
        return this.F0;
    }

    public int getMaxEms() {
        return this.y0;
    }

    public int getMaxWidth() {
        return this.A0;
    }

    public int getMinEms() {
        return this.x0;
    }

    public int getMinWidth() {
        return this.z0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.y0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.y0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.K0) {
            return this.J0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.N0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.M0;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public ead getShapeAppearanceModel() {
        return this.d1;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.o.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.o.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.y0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.z0;
    }

    public CharSequence getSuffixText() {
        return this.c.H0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.I0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.I0;
    }

    public Typeface getTypeface() {
        return this.q1;
    }

    public final int h(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.o.getCompoundPaddingRight() : this.b.a() : this.c.c());
    }

    public final void i() {
        int i = this.g1;
        if (i == 0) {
            this.X0 = null;
            this.b1 = null;
            this.c1 = null;
        } else if (i == 1) {
            this.X0 = new lw7(this.d1);
            this.b1 = new lw7();
            this.c1 = new lw7();
        } else if (i == 2) {
            if (!this.U0 || (this.X0 instanceof ux3)) {
                this.X0 = new lw7(this.d1);
            } else {
                ead ead = this.d1;
                int i2 = ux3.O0;
                if (ead == null) {
                    ead = new ead();
                }
                this.X0 = new ux3(new tx3(ead, new RectF()));
            }
            this.b1 = null;
            this.c1 = null;
        } else {
            throw new IllegalArgumentException(wn6.j(new StringBuilder(), this.g1, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        s();
        x();
        if (this.g1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.h1 = getResources().getDimensionPixelSize(vmb.material_font_2_0_box_collapsed_padding_top);
            } else if (wx3.u(getContext())) {
                this.h1 = getResources().getDimensionPixelSize(vmb.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.o != null && this.g1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.o;
                WeakHashMap weakHashMap = eaf.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(vmb.material_filled_edittext_font_2_0_padding_top), this.o.getPaddingEnd(), getResources().getDimensionPixelSize(vmb.material_filled_edittext_font_2_0_padding_bottom));
            } else if (wx3.u(getContext())) {
                EditText editText2 = this.o;
                WeakHashMap weakHashMap2 = eaf.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(vmb.material_filled_edittext_font_1_3_padding_top), this.o.getPaddingEnd(), getResources().getDimensionPixelSize(vmb.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.g1 != 0) {
            t();
        }
        EditText editText3 = this.o;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.g1;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.EditText r0 = r12.o
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.o
            int r1 = r1.getGravity()
            j23 r2 = r12.K1
            java.lang.CharSequence r3 = r2.G
            boolean r3 = r2.b(r3)
            r2.I = r3
            r4 = 5
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 17
            android.graphics.Rect r9 = r2.h
            if (r1 == r8) goto L_0x004f
            r10 = r1 & 7
            if (r10 != r7) goto L_0x002f
            goto L_0x004f
        L_0x002f:
            r10 = r1 & r6
            if (r10 == r6) goto L_0x0044
            r10 = r1 & 5
            if (r10 != r4) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.j0
            goto L_0x0054
        L_0x0040:
            int r3 = r9.left
        L_0x0042:
            float r3 = (float) r3
            goto L_0x0055
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            int r3 = r9.left
            goto L_0x0042
        L_0x0049:
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.j0
            goto L_0x0054
        L_0x004f:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.j0
            float r10 = r10 / r5
        L_0x0054:
            float r3 = r3 - r10
        L_0x0055:
            int r10 = r9.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.p1
            r10.left = r3
            int r11 = r9.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r8) goto L_0x008d
            r8 = r1 & 7
            if (r8 != r7) goto L_0x006c
            goto L_0x008d
        L_0x006c:
            r0 = r1 & r6
            if (r0 == r6) goto L_0x0081
            r0 = r1 & 5
            if (r0 != r4) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            boolean r0 = r2.I
            if (r0 == 0) goto L_0x007d
            int r0 = r9.right
        L_0x007b:
            float r0 = (float) r0
            goto L_0x0093
        L_0x007d:
            float r0 = r2.j0
            float r0 = r0 + r3
            goto L_0x0093
        L_0x0081:
            boolean r0 = r2.I
            if (r0 == 0) goto L_0x008a
            float r0 = r2.j0
            float r3 = r3 + r0
            r0 = r3
            goto L_0x0093
        L_0x008a:
            int r0 = r9.right
            goto L_0x007b
        L_0x008d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.j0
            float r1 = r1 / r5
            float r0 = r0 + r1
        L_0x0093:
            int r1 = r9.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r9.top
            float r0 = (float) r0
            float r1 = r2.e()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            goto L_0x00f0
        L_0x00b8:
            float r0 = r10.left
            int r1 = r12.f1
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r5
            float r1 = r1 - r2
            int r2 = r12.i1
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            lw7 r12 = r12.X0
            ux3 r12 = (defpackage.ux3) r12
            r12.getClass()
            float r0 = r10.left
            float r1 = r10.top
            float r2 = r10.right
            float r3 = r10.bottom
            r12.r(r0, r1, r2, r3)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(kvb.TextAppearance_AppCompat_Caption);
        textView.setTextColor(hq3.a(getContext(), hmb.design_error));
    }

    public final boolean m() {
        xv6 xv6 = this.B0;
        return xv6.o == 1 && xv6.r != null && !TextUtils.isEmpty(xv6.p);
    }

    public final void n(Editable editable) {
        this.F0.getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.E0;
        int i = this.D0;
        String str = null;
        if (i == -1) {
            this.G0.setText(String.valueOf(length));
            this.G0.setContentDescription((CharSequence) null);
            this.E0 = false;
        } else {
            this.E0 = length > i;
            Context context = getContext();
            this.G0.setContentDescription(context.getString(this.E0 ? wsb.character_counter_overflowed_content_description : wsb.character_counter_content_description, new Object[]{Integer.valueOf(length), Integer.valueOf(this.D0)}));
            if (z != this.E0) {
                o();
            }
            ok0 c2 = ok0.c();
            AppCompatTextView appCompatTextView = this.G0;
            String string = getContext().getString(wsb.character_counter_pattern, new Object[]{Integer.valueOf(length), Integer.valueOf(this.D0)});
            if (string == null) {
                c2.getClass();
            } else {
                str = c2.d(string, c2.c).toString();
            }
            appCompatTextView.setText(str);
        }
        if (this.o != null && z != this.E0) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.G0;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.E0 ? this.H0 : this.I0);
            if (!this.E0 && (colorStateList2 = this.Q0) != null) {
                this.G0.setTextColor(colorStateList2);
            }
            if (this.E0 && (colorStateList = this.R0) != null) {
                this.G0.setTextColor(colorStateList);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.K1.h(configuration);
    }

    public final void onGlobalLayout() {
        int max;
        gy4 gy4 = this.c;
        gy4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.Q1 = false;
        if (this.o != null && this.o.getMeasuredHeight() < (max = Math.max(gy4.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.o.setMinimumHeight(max);
            z = true;
        }
        boolean q = q();
        if (z || q) {
            this.o.post(new pfe(0, this));
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.o;
        if (editText != null) {
            ThreadLocal threadLocal = ue4.a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.n1;
            rect.set(0, 0, width, height);
            ue4.b(this, editText, rect);
            lw7 lw7 = this.b1;
            if (lw7 != null) {
                int i5 = rect.bottom;
                lw7.setBounds(rect.left, i5 - this.j1, rect.right, i5);
            }
            lw7 lw72 = this.c1;
            if (lw72 != null) {
                int i6 = rect.bottom;
                lw72.setBounds(rect.left, i6 - this.k1, rect.right, i6);
            }
            if (this.U0) {
                float textSize = this.o.getTextSize();
                j23 j23 = this.K1;
                if (j23.l != textSize) {
                    j23.l = textSize;
                    j23.i(false);
                }
                int gravity = this.o.getGravity();
                j23.l((gravity & -113) | 48);
                if (j23.j != gravity) {
                    j23.j = gravity;
                    j23.i(false);
                }
                if (this.o != null) {
                    boolean z2 = gwf.z(this);
                    int i7 = rect.bottom;
                    Rect rect2 = this.o1;
                    rect2.bottom = i7;
                    int i8 = this.g1;
                    if (i8 == 1) {
                        rect2.left = g(rect.left, z2);
                        rect2.top = rect.top + this.h1;
                        rect2.right = h(rect.right, z2);
                    } else if (i8 != 2) {
                        rect2.left = g(rect.left, z2);
                        rect2.top = getPaddingTop();
                        rect2.right = h(rect.right, z2);
                    } else {
                        rect2.left = this.o.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - c();
                        rect2.right = rect.right - this.o.getPaddingRight();
                    }
                    int i9 = rect2.left;
                    int i10 = rect2.top;
                    int i11 = rect2.right;
                    int i12 = rect2.bottom;
                    Rect rect3 = j23.h;
                    if (!(rect3.left == i9 && rect3.top == i10 && rect3.right == i11 && rect3.bottom == i12)) {
                        rect3.set(i9, i10, i11, i12);
                        j23.S = true;
                    }
                    if (this.o != null) {
                        TextPaint textPaint = j23.U;
                        textPaint.setTextSize(j23.l);
                        textPaint.setTypeface(j23.z);
                        textPaint.setLetterSpacing(j23.g0);
                        float f = -textPaint.ascent();
                        rect2.left = this.o.getCompoundPaddingLeft() + rect.left;
                        rect2.top = (this.g1 != 1 || this.o.getMinLines() > 1) ? rect.top + this.o.getCompoundPaddingTop() : (int) (((float) rect.centerY()) - (f / 2.0f));
                        rect2.right = rect.right - this.o.getCompoundPaddingRight();
                        int compoundPaddingBottom = (this.g1 != 1 || this.o.getMinLines() > 1) ? rect.bottom - this.o.getCompoundPaddingBottom() : (int) (((float) rect2.top) + f);
                        rect2.bottom = compoundPaddingBottom;
                        int i13 = rect2.left;
                        int i14 = rect2.top;
                        int i15 = rect2.right;
                        Rect rect4 = j23.g;
                        if (!(rect4.left == i13 && rect4.top == i14 && rect4.right == i15 && rect4.bottom == compoundPaddingBottom)) {
                            rect4.set(i13, i14, i15, compoundPaddingBottom);
                            j23.S = true;
                        }
                        j23.i(false);
                        if (e() && !this.J1) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.Q1;
        gy4 gy4 = this.c;
        if (!z) {
            gy4.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.Q1 = true;
        }
        if (!(this.L0 == null || (editText = this.o) == null)) {
            this.L0.setGravity(editText.getGravity());
            this.L0.setPadding(this.o.getCompoundPaddingLeft(), this.o.getCompoundPaddingTop(), this.o.getCompoundPaddingRight(), this.o.getCompoundPaddingBottom());
        }
        gy4.m();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof tfe)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        tfe tfe = (tfe) parcelable;
        super.onRestoreInstanceState(tfe.a);
        setError(tfe.c);
        if (tfe.o) {
            post(new lde(2, (Object) this));
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [ead, java.lang.Object] */
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.e1) {
            du3 du3 = this.d1.e;
            RectF rectF = this.p1;
            float a2 = du3.a(rectF);
            float a3 = this.d1.f.a(rectF);
            float a4 = this.d1.h.a(rectF);
            float a5 = this.d1.g.a(rectF);
            ead ead = this.d1;
            udd udd = ead.a;
            udd udd2 = ead.b;
            udd udd3 = ead.d;
            udd udd4 = ead.c;
            qr4 qr4 = new qr4(0);
            qr4 qr42 = new qr4(0);
            qr4 qr43 = new qr4(0);
            qr4 qr44 = new qr4(0);
            buf.d(udd2);
            buf.d(udd);
            buf.d(udd4);
            buf.d(udd3);
            a0 a0Var = new a0(a3);
            a0 a0Var2 = new a0(a2);
            a0 a0Var3 = new a0(a5);
            a0 a0Var4 = new a0(a4);
            ? obj = new Object();
            obj.a = udd2;
            obj.b = udd;
            obj.c = udd3;
            obj.d = udd4;
            obj.e = a0Var;
            obj.f = a0Var2;
            obj.g = a0Var4;
            obj.h = a0Var3;
            obj.i = qr4;
            obj.j = qr42;
            obj.k = qr43;
            obj.l = qr44;
            this.e1 = z;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [tfe, android.os.Parcelable, z] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        if (m()) {
            zVar.c = getError();
        }
        gy4 gy4 = this.c;
        zVar.o = gy4.A0 != 0 && gy4.y0.o;
        return zVar;
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.S0;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue D = bm3.D(context, wlb.colorControlActivated);
            if (D != null) {
                int i = D.resourceId;
                if (i != 0) {
                    colorStateList2 = d8.r(context, i);
                } else {
                    int i2 = D.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.o;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = this.o.getTextCursorDrawable().mutate();
            if ((m() || (this.G0 != null && this.E0)) && (colorStateList = this.T0) != null) {
                colorStateList2 = colorStateList;
            }
            um4.h(mutate, colorStateList2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.o
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L_0x0020
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x005f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x005f
        L_0x0020:
            hpd r0 = r10.b
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L_0x005f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.o
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.r1
            if (r6 == 0) goto L_0x003b
            int r6 = r10.s1
            if (r6 == r0) goto L_0x0047
        L_0x003b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.r1 = r6
            r10.s1 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0047:
            android.widget.EditText r0 = r10.o
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.r1
            if (r6 == r7) goto L_0x0078
            android.widget.EditText r6 = r10.o
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x0076
        L_0x005f:
            android.graphics.drawable.ColorDrawable r0 = r10.r1
            if (r0 == 0) goto L_0x0078
            android.widget.EditText r0 = r10.o
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.o
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.r1 = r2
        L_0x0076:
            r0 = r5
            goto L_0x0079
        L_0x0078:
            r0 = r1
        L_0x0079:
            gy4 r6 = r10.c
            boolean r7 = r6.e()
            if (r7 != 0) goto L_0x008f
            int r7 = r6.A0
            if (r7 == 0) goto L_0x008b
            boolean r7 = r6.d()
            if (r7 != 0) goto L_0x008f
        L_0x008b:
            java.lang.CharSequence r7 = r6.H0
            if (r7 == 0) goto L_0x0110
        L_0x008f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x0110
            androidx.appcompat.widget.AppCompatTextView r7 = r6.I0
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.o
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto L_0x00ab
            com.google.android.material.internal.CheckableImageButton r2 = r6.c
            goto L_0x00b7
        L_0x00ab:
            int r8 = r6.A0
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r6.d()
            if (r8 == 0) goto L_0x00b7
            com.google.android.material.internal.CheckableImageButton r2 = r6.y0
        L_0x00b7:
            if (r2 == 0) goto L_0x00ca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r7 = r2 + r6
        L_0x00ca:
            android.widget.EditText r2 = r10.o
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r6 = r10.u1
            if (r6 == 0) goto L_0x00eb
            int r8 = r10.v1
            if (r8 == r7) goto L_0x00eb
            r10.v1 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.o
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r10 = r10.u1
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r10, r2)
            goto L_0x010e
        L_0x00eb:
            if (r6 != 0) goto L_0x00f9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.u1 = r6
            r10.v1 = r7
            r6.setBounds(r1, r1, r7, r5)
        L_0x00f9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.u1
            if (r3 == r6) goto L_0x010d
            r10.w1 = r3
            android.widget.EditText r10 = r10.o
            r0 = r2[r1]
            r1 = r2[r5]
            r2 = r2[r4]
            r10.setCompoundDrawablesRelative(r0, r1, r6, r2)
            goto L_0x010e
        L_0x010d:
            r5 = r0
        L_0x010e:
            r0 = r5
            goto L_0x0132
        L_0x0110:
            android.graphics.drawable.ColorDrawable r6 = r10.u1
            if (r6 == 0) goto L_0x0132
            android.widget.EditText r6 = r10.o
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.u1
            if (r3 != r7) goto L_0x012e
            android.widget.EditText r0 = r10.o
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.w1
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x012f
        L_0x012e:
            r5 = r0
        L_0x012f:
            r10.u1 = r2
            goto L_0x010e
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.o;
        if (editText != null && this.g1 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = bn4.a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(gn.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.E0 || (appCompatTextView = this.G0) == null) {
                mutate.clearColorFilter();
                this.o.refreshDrawableState();
            } else {
                mutate.setColorFilter(gn.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void s() {
        EditText editText = this.o;
        if (editText != null && this.X0 != null) {
            if ((this.a1 || editText.getBackground() == null) && this.g1 != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.o;
                WeakHashMap weakHashMap = eaf.a;
                editText2.setBackground(editTextBoxBackground);
                this.a1 = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.m1 != i) {
            this.m1 = i;
            this.D1 = i;
            this.F1 = i;
            this.G1 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(hq3.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.D1 = defaultColor;
        this.m1 = defaultColor;
        this.E1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.F1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.G1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.g1) {
            this.g1 = i;
            if (this.o != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.h1 = i;
    }

    public void setBoxCornerFamily(int i) {
        buf e = this.d1.e();
        du3 du3 = this.d1.e;
        udd t = ez3.t(i);
        e.a = t;
        buf.d(t);
        e.e = du3;
        du3 du32 = this.d1.f;
        udd t2 = ez3.t(i);
        e.b = t2;
        buf.d(t2);
        e.f = du32;
        du3 du33 = this.d1.h;
        udd t3 = ez3.t(i);
        e.d = t3;
        buf.d(t3);
        e.h = du33;
        du3 du34 = this.d1.g;
        udd t4 = ez3.t(i);
        e.c = t4;
        buf.d(t4);
        e.g = du34;
        this.d1 = e.c();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.B1 != i) {
            this.B1 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.z1 = colorStateList.getDefaultColor();
            this.H1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.A1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.B1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.B1 != colorStateList.getDefaultColor()) {
            this.B1 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.C1 != colorStateList) {
            this.C1 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.j1 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.k1 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.C0 != z) {
            Editable editable = null;
            xv6 xv6 = this.B0;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
                this.G0 = appCompatTextView;
                appCompatTextView.setId(lob.textinput_counter);
                Typeface typeface = this.q1;
                if (typeface != null) {
                    this.G0.setTypeface(typeface);
                }
                this.G0.setMaxLines(1);
                xv6.a(this.G0, 2);
                ((ViewGroup.MarginLayoutParams) this.G0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(vmb.mtrl_textinput_counter_margin_start));
                o();
                if (this.G0 != null) {
                    EditText editText = this.o;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                xv6.g(this.G0, 2);
                this.G0 = null;
            }
            this.C0 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.D0 != i) {
            if (i > 0) {
                this.D0 = i;
            } else {
                this.D0 = -1;
            }
            if (this.C0 && this.G0 != null) {
                EditText editText = this.o;
                n(editText == null ? null : editText.getText());
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.H0 != i) {
            this.H0 = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.R0 != colorStateList) {
            this.R0 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.I0 != i) {
            this.I0 = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.Q0 != colorStateList) {
            this.Q0 = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.S0 != colorStateList) {
            this.S0 = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.T0 != colorStateList) {
            this.T0 = colorStateList;
            if (m() || (this.G0 != null && this.E0)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.x1 = colorStateList;
        this.y1 = colorStateList;
        if (this.o != null) {
            u(false, false);
        }
    }

    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.y0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.y0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        gy4 gy4 = this.c;
        CharSequence text = i != 0 ? gy4.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = gy4.y0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        gy4 gy4 = this.c;
        Drawable n = i != 0 ? am7.n(gy4.getContext(), i) : null;
        CheckableImageButton checkableImageButton = gy4.y0;
        checkableImageButton.setImageDrawable(n);
        if (n != null) {
            ColorStateList colorStateList = gy4.C0;
            PorterDuff.Mode mode = gy4.D0;
            TextInputLayout textInputLayout = gy4.a;
            n06.b(textInputLayout, checkableImageButton, colorStateList, mode);
            n06.B(textInputLayout, checkableImageButton, gy4.C0);
        }
    }

    public void setEndIconMinSize(int i) {
        gy4 gy4 = this.c;
        if (i < 0) {
            gy4.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i != gy4.E0) {
            gy4.E0 = i;
            CheckableImageButton checkableImageButton = gy4.y0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = gy4.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        gy4 gy4 = this.c;
        View.OnLongClickListener onLongClickListener = gy4.G0;
        CheckableImageButton checkableImageButton = gy4.y0;
        checkableImageButton.setOnClickListener(onClickListener);
        n06.C(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        gy4 gy4 = this.c;
        gy4.G0 = onLongClickListener;
        CheckableImageButton checkableImageButton = gy4.y0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        n06.C(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        gy4 gy4 = this.c;
        gy4.F0 = scaleType;
        gy4.y0.setScaleType(scaleType);
        gy4.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        gy4 gy4 = this.c;
        if (gy4.C0 != colorStateList) {
            gy4.C0 = colorStateList;
            n06.b(gy4.a, gy4.y0, colorStateList, gy4.D0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        gy4 gy4 = this.c;
        if (gy4.D0 != mode) {
            gy4.D0 = mode;
            n06.b(gy4.a, gy4.y0, gy4.C0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) {
        xv6 xv6 = this.B0;
        if (!xv6.q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            xv6.c();
            xv6.p = charSequence;
            xv6.r.setText(charSequence);
            int i = xv6.n;
            if (i != 1) {
                xv6.o = 1;
            }
            xv6.i(i, xv6.o, xv6.h(xv6.r, charSequence));
            return;
        }
        xv6.f();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        xv6 xv6 = this.B0;
        xv6.t = i;
        AppCompatTextView appCompatTextView = xv6.r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = eaf.a;
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        xv6 xv6 = this.B0;
        xv6.s = charSequence;
        AppCompatTextView appCompatTextView = xv6.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        xv6 xv6 = this.B0;
        if (xv6.q != z) {
            xv6.c();
            TextInputLayout textInputLayout = xv6.h;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(xv6.g, (AttributeSet) null);
                xv6.r = appCompatTextView;
                appCompatTextView.setId(lob.textinput_error);
                xv6.r.setTextAlignment(5);
                Typeface typeface = xv6.B;
                if (typeface != null) {
                    xv6.r.setTypeface(typeface);
                }
                int i = xv6.u;
                xv6.u = i;
                AppCompatTextView appCompatTextView2 = xv6.r;
                if (appCompatTextView2 != null) {
                    textInputLayout.l(appCompatTextView2, i);
                }
                ColorStateList colorStateList = xv6.v;
                xv6.v = colorStateList;
                AppCompatTextView appCompatTextView3 = xv6.r;
                if (!(appCompatTextView3 == null || colorStateList == null)) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = xv6.s;
                xv6.s = charSequence;
                AppCompatTextView appCompatTextView4 = xv6.r;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                int i2 = xv6.t;
                xv6.t = i2;
                AppCompatTextView appCompatTextView5 = xv6.r;
                if (appCompatTextView5 != null) {
                    WeakHashMap weakHashMap = eaf.a;
                    appCompatTextView5.setAccessibilityLiveRegion(i2);
                }
                xv6.r.setVisibility(4);
                xv6.a(xv6.r, 0);
            } else {
                xv6.f();
                xv6.g(xv6.r, 0);
                xv6.r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            xv6.q = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        gy4 gy4 = this.c;
        gy4.i(i != 0 ? am7.n(gy4.getContext(), i) : null);
        n06.B(gy4.a, gy4.c, gy4.o);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        gy4 gy4 = this.c;
        CheckableImageButton checkableImageButton = gy4.c;
        View.OnLongClickListener onLongClickListener = gy4.x0;
        checkableImageButton.setOnClickListener(onClickListener);
        n06.C(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        gy4 gy4 = this.c;
        gy4.x0 = onLongClickListener;
        CheckableImageButton checkableImageButton = gy4.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        n06.C(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        gy4 gy4 = this.c;
        if (gy4.o != colorStateList) {
            gy4.o = colorStateList;
            n06.b(gy4.a, gy4.c, colorStateList, gy4.w0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        gy4 gy4 = this.c;
        if (gy4.w0 != mode) {
            gy4.w0 = mode;
            n06.b(gy4.a, gy4.c, gy4.o, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        xv6 xv6 = this.B0;
        xv6.u = i;
        AppCompatTextView appCompatTextView = xv6.r;
        if (appCompatTextView != null) {
            xv6.h.l(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        xv6 xv6 = this.B0;
        xv6.v = colorStateList;
        AppCompatTextView appCompatTextView = xv6.r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.L1 != z) {
            this.L1 = z;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        xv6 xv6 = this.B0;
        if (!isEmpty) {
            if (!xv6.x) {
                setHelperTextEnabled(true);
            }
            xv6.c();
            xv6.w = charSequence;
            xv6.y.setText(charSequence);
            int i = xv6.n;
            if (i != 2) {
                xv6.o = 2;
            }
            xv6.i(i, xv6.o, xv6.h(xv6.y, charSequence));
        } else if (xv6.x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        xv6 xv6 = this.B0;
        xv6.A = colorStateList;
        AppCompatTextView appCompatTextView = xv6.y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        xv6 xv6 = this.B0;
        if (xv6.x != z) {
            xv6.c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(xv6.g, (AttributeSet) null);
                xv6.y = appCompatTextView;
                appCompatTextView.setId(lob.textinput_helper_text);
                xv6.y.setTextAlignment(5);
                Typeface typeface = xv6.B;
                if (typeface != null) {
                    xv6.y.setTypeface(typeface);
                }
                xv6.y.setVisibility(4);
                AppCompatTextView appCompatTextView2 = xv6.y;
                WeakHashMap weakHashMap = eaf.a;
                appCompatTextView2.setAccessibilityLiveRegion(1);
                int i = xv6.z;
                xv6.z = i;
                AppCompatTextView appCompatTextView3 = xv6.y;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTextAppearance(i);
                }
                ColorStateList colorStateList = xv6.A;
                xv6.A = colorStateList;
                AppCompatTextView appCompatTextView4 = xv6.y;
                if (!(appCompatTextView4 == null || colorStateList == null)) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                xv6.a(xv6.y, 1);
                xv6.y.setAccessibilityDelegate(new wv6(0, xv6));
            } else {
                xv6.c();
                int i2 = xv6.n;
                if (i2 == 2) {
                    xv6.o = 0;
                }
                xv6.i(i2, xv6.o, xv6.h(xv6.y, BuildConfig.FLAVOR));
                xv6.g(xv6.y, 1);
                xv6.y = null;
                TextInputLayout textInputLayout = xv6.h;
                textInputLayout.r();
                textInputLayout.x();
            }
            xv6.x = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        xv6 xv6 = this.B0;
        xv6.z = i;
        AppCompatTextView appCompatTextView = xv6.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.U0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.M1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.U0) {
            this.U0 = z;
            if (!z) {
                this.W0 = false;
                if (!TextUtils.isEmpty(this.V0) && TextUtils.isEmpty(this.o.getHint())) {
                    this.o.setHint(this.V0);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.o.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.V0)) {
                        setHint(hint);
                    }
                    this.o.setHint((CharSequence) null);
                }
                this.W0 = true;
            }
            if (this.o != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        j23 j23 = this.K1;
        j23.k(i);
        this.y1 = j23.o;
        if (this.o != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.y1 != colorStateList) {
            if (this.x1 == null) {
                j23 j23 = this.K1;
                if (j23.o != colorStateList) {
                    j23.o = colorStateList;
                    j23.i(false);
                }
            }
            this.y1 = colorStateList;
            if (this.o != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(sfe sfe) {
        this.F0 = sfe;
    }

    public void setMaxEms(int i) {
        this.y0 = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.A0 = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.x0 = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.z0 = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        gy4 gy4 = this.c;
        gy4.y0.setContentDescription(i != 0 ? gy4.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        gy4 gy4 = this.c;
        gy4.y0.setImageDrawable(i != 0 ? am7.n(gy4.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        gy4 gy4 = this.c;
        if (z && gy4.A0 != 1) {
            gy4.g(1);
        } else if (!z) {
            gy4.g(0);
        } else {
            gy4.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        gy4 gy4 = this.c;
        gy4.C0 = colorStateList;
        n06.b(gy4.a, gy4.y0, colorStateList, gy4.D0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        gy4 gy4 = this.c;
        gy4.D0 = mode;
        n06.b(gy4.a, gy4.y0, gy4.C0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.L0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
            this.L0 = appCompatTextView;
            appCompatTextView.setId(lob.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.L0;
            WeakHashMap weakHashMap = eaf.a;
            appCompatTextView2.setImportantForAccessibility(2);
            p75 d = d();
            this.O0 = d;
            d.b = 67;
            this.P0 = d();
            setPlaceholderTextAppearance(this.N0);
            setPlaceholderTextColor(this.M0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.K0) {
                setPlaceholderTextEnabled(true);
            }
            this.J0 = charSequence;
        }
        EditText editText = this.o;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.N0 = i;
        AppCompatTextView appCompatTextView = this.L0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            AppCompatTextView appCompatTextView = this.L0;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        hpd hpd = this.b;
        hpd.getClass();
        hpd.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        hpd.b.setText(charSequence);
        hpd.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(ead ead) {
        lw7 lw7 = this.X0;
        if (lw7 != null && lw7.a.a != ead) {
            this.d1 = ead;
            b();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.b.o.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.o;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? am7.n(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        hpd hpd = this.b;
        if (i < 0) {
            hpd.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i != hpd.y0) {
            hpd.y0 = i;
            CheckableImageButton checkableImageButton = hpd.o;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        hpd hpd = this.b;
        View.OnLongClickListener onLongClickListener = hpd.A0;
        CheckableImageButton checkableImageButton = hpd.o;
        checkableImageButton.setOnClickListener(onClickListener);
        n06.C(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        hpd hpd = this.b;
        hpd.A0 = onLongClickListener;
        CheckableImageButton checkableImageButton = hpd.o;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        n06.C(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        hpd hpd = this.b;
        hpd.z0 = scaleType;
        hpd.o.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        hpd hpd = this.b;
        if (hpd.w0 != colorStateList) {
            hpd.w0 = colorStateList;
            n06.b(hpd.a, hpd.o, colorStateList, hpd.x0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        hpd hpd = this.b;
        if (hpd.x0 != mode) {
            hpd.x0 = mode;
            n06.b(hpd.a, hpd.o, hpd.w0, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        gy4 gy4 = this.c;
        gy4.getClass();
        gy4.H0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        gy4.I0.setText(charSequence);
        gy4.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.I0.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.I0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(rfe rfe) {
        EditText editText = this.o;
        if (editText != null) {
            eaf.j(editText, rfe);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.q1) {
            this.q1 = typeface;
            j23 j23 = this.K1;
            boolean m = j23.m(typeface);
            boolean o2 = j23.o(typeface);
            if (m || o2) {
                j23.i(false);
            }
            xv6 xv6 = this.B0;
            if (typeface != xv6.B) {
                xv6.B = typeface;
                AppCompatTextView appCompatTextView = xv6.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = xv6.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.G0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.g1 != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.o;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.o;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.x1;
        j23 j23 = this.K1;
        if (colorStateList2 != null) {
            j23.j(colorStateList2);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.x1;
            j23.j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.H1) : this.H1));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.B0.r;
            j23.j(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.E0 && (appCompatTextView = this.G0) != null) {
            j23.j(appCompatTextView.getTextColors());
        } else if (!(!z4 || (colorStateList = this.y1) == null || j23.o == colorStateList)) {
            j23.o = colorStateList;
            j23.i(false);
        }
        gy4 gy4 = this.c;
        hpd hpd = this.b;
        if (z3 || !this.L1 || (isEnabled() && z4)) {
            if (z2 || this.J1) {
                ValueAnimator valueAnimator = this.N1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.N1.cancel();
                }
                if (!z || !this.M1) {
                    j23.p(1.0f);
                } else {
                    a(1.0f);
                }
                this.J1 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.o;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                v(editable);
                hpd.B0 = false;
                hpd.e();
                gy4.J0 = false;
                gy4.n();
            }
        } else if (z2 || !this.J1) {
            ValueAnimator valueAnimator2 = this.N1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.N1.cancel();
            }
            if (!z || !this.M1) {
                j23.p(0.0f);
            } else {
                a(0.0f);
            }
            if (e() && (!((ux3) this.X0).N0.v.isEmpty()) && e()) {
                ((ux3) this.X0).r(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.J1 = true;
            AppCompatTextView appCompatTextView3 = this.L0;
            if (appCompatTextView3 != null && this.K0) {
                appCompatTextView3.setText((CharSequence) null);
                ire.a(this.a, this.P0);
                this.L0.setVisibility(4);
            }
            hpd.B0 = true;
            hpd.e();
            gy4.J0 = true;
            gy4.n();
        }
    }

    public final void v(Editable editable) {
        this.F0.getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.J1) {
            AppCompatTextView appCompatTextView = this.L0;
            if (appCompatTextView != null && this.K0) {
                appCompatTextView.setText((CharSequence) null);
                ire.a(frameLayout, this.P0);
                this.L0.setVisibility(4);
            }
        } else if (this.L0 != null && this.K0 && !TextUtils.isEmpty(this.J0)) {
            this.L0.setText(this.J0);
            ire.a(frameLayout, this.O0);
            this.L0.setVisibility(0);
            this.L0.bringToFront();
            announceForAccessibility(this.J0);
        }
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.C1.getDefaultColor();
        int colorForState = this.C1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.C1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.l1 = colorForState2;
        } else if (z2) {
            this.l1 = colorForState;
        } else {
            this.l1 = defaultColor;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r7.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r7 = this;
            lw7 r0 = r7.X0
            if (r0 == 0) goto L_0x0128
            int r0 = r7.g1
            if (r0 != 0) goto L_0x000a
            goto L_0x0128
        L_0x000a:
            boolean r0 = r7.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r7.o
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r7.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r7.o
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            boolean r3 = r7.isEnabled()
            if (r3 != 0) goto L_0x003c
            int r3 = r7.H1
            r7.l1 = r3
            goto L_0x007a
        L_0x003c:
            boolean r3 = r7.m()
            if (r3 == 0) goto L_0x0051
            android.content.res.ColorStateList r3 = r7.C1
            if (r3 == 0) goto L_0x004a
            r7.w(r0, r1)
            goto L_0x007a
        L_0x004a:
            int r3 = r7.getErrorCurrentTextColors()
            r7.l1 = r3
            goto L_0x007a
        L_0x0051:
            boolean r3 = r7.E0
            if (r3 == 0) goto L_0x0068
            androidx.appcompat.widget.AppCompatTextView r3 = r7.G0
            if (r3 == 0) goto L_0x0068
            android.content.res.ColorStateList r4 = r7.C1
            if (r4 == 0) goto L_0x0061
            r7.w(r0, r1)
            goto L_0x007a
        L_0x0061:
            int r3 = r3.getCurrentTextColor()
            r7.l1 = r3
            goto L_0x007a
        L_0x0068:
            if (r0 == 0) goto L_0x006f
            int r3 = r7.B1
            r7.l1 = r3
            goto L_0x007a
        L_0x006f:
            if (r1 == 0) goto L_0x0076
            int r3 = r7.A1
            r7.l1 = r3
            goto L_0x007a
        L_0x0076:
            int r3 = r7.z1
            r7.l1 = r3
        L_0x007a:
            r7.p()
            gy4 r3 = r7.c
            r3.l()
            com.google.android.material.internal.CheckableImageButton r4 = r3.c
            android.content.res.ColorStateList r5 = r3.o
            com.google.android.material.textfield.TextInputLayout r6 = r3.a
            defpackage.n06.B(r6, r4, r5)
            android.content.res.ColorStateList r4 = r3.C0
            com.google.android.material.internal.CheckableImageButton r5 = r3.y0
            defpackage.n06.B(r6, r5, r4)
            hy4 r4 = r3.b()
            boolean r4 = r4 instanceof defpackage.kp4
            if (r4 == 0) goto L_0x00c0
            boolean r4 = r6.m()
            if (r4 == 0) goto L_0x00b9
            android.graphics.drawable.Drawable r4 = r5.getDrawable()
            if (r4 == 0) goto L_0x00b9
            android.graphics.drawable.Drawable r3 = r5.getDrawable()
            android.graphics.drawable.Drawable r3 = r3.mutate()
            int r4 = r6.getErrorCurrentTextColors()
            defpackage.um4.g(r3, r4)
            r5.setImageDrawable(r3)
            goto L_0x00c0
        L_0x00b9:
            android.content.res.ColorStateList r4 = r3.C0
            android.graphics.PorterDuff$Mode r3 = r3.D0
            defpackage.n06.b(r6, r5, r4, r3)
        L_0x00c0:
            hpd r3 = r7.b
            com.google.android.material.internal.CheckableImageButton r4 = r3.o
            android.content.res.ColorStateList r5 = r3.w0
            com.google.android.material.textfield.TextInputLayout r3 = r3.a
            defpackage.n06.B(r3, r4, r5)
            int r3 = r7.g1
            r4 = 2
            if (r3 != r4) goto L_0x0102
            int r3 = r7.i1
            if (r0 == 0) goto L_0x00df
            boolean r4 = r7.isEnabled()
            if (r4 == 0) goto L_0x00df
            int r4 = r7.k1
            r7.i1 = r4
            goto L_0x00e3
        L_0x00df:
            int r4 = r7.j1
            r7.i1 = r4
        L_0x00e3:
            int r4 = r7.i1
            if (r4 == r3) goto L_0x0102
            boolean r3 = r7.e()
            if (r3 == 0) goto L_0x0102
            boolean r3 = r7.J1
            if (r3 != 0) goto L_0x0102
            boolean r3 = r7.e()
            if (r3 == 0) goto L_0x00ff
            lw7 r3 = r7.X0
            ux3 r3 = (defpackage.ux3) r3
            r4 = 0
            r3.r(r4, r4, r4, r4)
        L_0x00ff:
            r7.j()
        L_0x0102:
            int r3 = r7.g1
            if (r3 != r2) goto L_0x0125
            boolean r2 = r7.isEnabled()
            if (r2 != 0) goto L_0x0111
            int r0 = r7.E1
            r7.m1 = r0
            goto L_0x0125
        L_0x0111:
            if (r1 == 0) goto L_0x011a
            if (r0 != 0) goto L_0x011a
            int r0 = r7.G1
            r7.m1 = r0
            goto L_0x0125
        L_0x011a:
            if (r0 == 0) goto L_0x0121
            int r0 = r7.F1
            r7.m1 = r0
            goto L_0x0125
        L_0x0121:
            int r0 = r7.D1
            r7.m1 = r0
        L_0x0125:
            r7.b()
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.x():void");
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.y0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.y0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.y0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        gy4 gy4 = this.c;
        CheckableImageButton checkableImageButton = gy4.y0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = gy4.C0;
            PorterDuff.Mode mode = gy4.D0;
            TextInputLayout textInputLayout = gy4.a;
            n06.b(textInputLayout, checkableImageButton, colorStateList, mode);
            n06.B(textInputLayout, checkableImageButton, gy4.C0);
        }
    }
}
