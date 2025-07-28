package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.common.drawable.SavedMessagesIconDrawable;

public class Chip extends AppCompatCheckBox implements dx2, pad, iw7 {
    public static final int P0 = kvb.Widget_MaterialComponents_Chip_Action;
    public static final Rect Q0 = new Rect();
    public static final int[] R0 = {16842913};
    public static final int[] S0 = {16842911};
    public CompoundButton.OnCheckedChangeListener A0;
    public hw7 B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public int I0;
    public CharSequence J0;
    public final cx2 K0;
    public boolean L0;
    public final Rect M0 = new Rect();
    public final RectF N0 = new RectF();
    public final bx2 O0 = new bx2(0, this);
    public ex2 w0;
    public InsetDrawable x0;
    public RippleDrawable y0;
    public View.OnClickListener z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = 0
            r9 = 1
            int r10 = defpackage.wlb.chipStyle
            int r11 = P0
            r1 = r17
            android.content.Context r1 = defpackage.tw7.a(r1, r7, r10, r11)
            r0.<init>(r1, r7, r10)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.M0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.N0 = r1
            bx2 r1 = new bx2
            r1.<init>(r8, r0)
            r0.O0 = r1
            android.content.Context r12 = r16.getContext()
            r13 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0032
            goto L_0x0080
        L_0x0032:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            r7.getAttributeValue(r1, r2)
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03b2
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03aa
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x03a4
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x039e
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r9)
            if (r2 == 0) goto L_0x0396
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r9)
            if (r2 != r9) goto L_0x0396
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r9)
            if (r2 != r9) goto L_0x0396
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r9)
            if (r2 != r9) goto L_0x0396
            java.lang.String r2 = "gravity"
            r7.getAttributeIntValue(r1, r2, r13)
        L_0x0080:
            ex2 r14 = new ex2
            r14.<init>(r12, r7, r10, r11)
            int[] r3 = defpackage.xvb.Chip
            int[] r6 = new int[r8]
            android.content.Context r1 = r14.u1
            r2 = r18
            r4 = r10
            r5 = r11
            android.content.res.TypedArray r1 = defpackage.she.d(r1, r2, r3, r4, r5, r6)
            int r2 = defpackage.xvb.Chip_shapeAppearance
            boolean r2 = r1.hasValue(r2)
            r14.V1 = r2
            int r2 = defpackage.xvb.Chip_chipSurfaceColor
            android.content.Context r3 = r14.u1
            android.content.res.ColorStateList r2 = defpackage.wx3.i(r3, r1, r2)
            android.content.res.ColorStateList r4 = r14.N0
            if (r4 == r2) goto L_0x00b0
            r14.N0 = r2
            int[] r2 = r14.getState()
            r14.onStateChange(r2)
        L_0x00b0:
            int r2 = defpackage.xvb.Chip_chipBackgroundColor
            android.content.res.ColorStateList r2 = defpackage.wx3.i(r3, r1, r2)
            android.content.res.ColorStateList r4 = r14.O0
            if (r4 == r2) goto L_0x00c3
            r14.O0 = r2
            int[] r2 = r14.getState()
            r14.onStateChange(r2)
        L_0x00c3:
            int r2 = defpackage.xvb.Chip_chipMinHeight
            r4 = 0
            float r2 = r1.getDimension(r2, r4)
            float r5 = r14.P0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00d8
            r14.P0 = r2
            r14.invalidateSelf()
            r14.y()
        L_0x00d8:
            int r2 = defpackage.xvb.Chip_chipCornerRadius
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x00e9
            int r2 = defpackage.xvb.Chip_chipCornerRadius
            float r2 = r1.getDimension(r2, r4)
            r14.E(r2)
        L_0x00e9:
            int r2 = defpackage.xvb.Chip_chipStrokeColor
            android.content.res.ColorStateList r2 = defpackage.wx3.i(r3, r1, r2)
            r14.J(r2)
            int r2 = defpackage.xvb.Chip_chipStrokeWidth
            float r2 = r1.getDimension(r2, r4)
            r14.K(r2)
            int r2 = defpackage.xvb.Chip_rippleColor
            android.content.res.ColorStateList r2 = defpackage.wx3.i(r3, r1, r2)
            r14.T(r2)
            int r2 = defpackage.xvb.Chip_android_text
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x010e
            java.lang.String r2 = ""
        L_0x010e:
            java.lang.CharSequence r5 = r14.U0
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            ife r6 = r14.A1
            if (r5 != 0) goto L_0x0122
            r14.U0 = r2
            r6.e = r9
            r14.invalidateSelf()
            r14.y()
        L_0x0122:
            int r2 = defpackage.xvb.Chip_android_textAppearance
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0136
            int r2 = r1.getResourceId(r2, r8)
            if (r2 == 0) goto L_0x0136
            afe r5 = new afe
            r5.<init>(r3, r2)
            goto L_0x0137
        L_0x0136:
            r5 = 0
        L_0x0137:
            int r2 = defpackage.xvb.Chip_android_textSize
            float r15 = r5.k
            float r2 = r1.getDimension(r2, r15)
            r5.k = r2
            r6.c(r5, r3)
            int r2 = defpackage.xvb.Chip_android_ellipsize
            int r2 = r1.getInt(r2, r8)
            if (r2 == r9) goto L_0x015d
            r5 = 2
            if (r2 == r5) goto L_0x0158
            r5 = 3
            if (r2 == r5) goto L_0x0153
            goto L_0x0161
        L_0x0153:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r14.S1 = r2
            goto L_0x0161
        L_0x0158:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            r14.S1 = r2
            goto L_0x0161
        L_0x015d:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
            r14.S1 = r2
        L_0x0161:
            int r2 = defpackage.xvb.Chip_chipIconVisible
            boolean r2 = r1.getBoolean(r2, r8)
            r14.I(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0187
            java.lang.String r5 = "chipIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x0187
            java.lang.String r5 = "chipIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 != 0) goto L_0x0187
            int r5 = defpackage.xvb.Chip_chipIconEnabled
            boolean r5 = r1.getBoolean(r5, r8)
            r14.I(r5)
        L_0x0187:
            int r5 = defpackage.xvb.Chip_chipIcon
            android.graphics.drawable.Drawable r5 = defpackage.wx3.k(r3, r1, r5)
            r14.F(r5)
            int r5 = defpackage.xvb.Chip_chipIconTint
            boolean r5 = r1.hasValue(r5)
            if (r5 == 0) goto L_0x01a1
            int r5 = defpackage.xvb.Chip_chipIconTint
            android.content.res.ColorStateList r5 = defpackage.wx3.i(r3, r1, r5)
            r14.H(r5)
        L_0x01a1:
            int r5 = defpackage.xvb.Chip_chipIconSize
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r1.getDimension(r5, r6)
            r14.G(r5)
            int r5 = defpackage.xvb.Chip_closeIconVisible
            boolean r5 = r1.getBoolean(r5, r8)
            r14.Q(r5)
            if (r7 == 0) goto L_0x01d0
            java.lang.String r5 = "closeIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x01d0
            java.lang.String r5 = "closeIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 != 0) goto L_0x01d0
            int r5 = defpackage.xvb.Chip_closeIconEnabled
            boolean r5 = r1.getBoolean(r5, r8)
            r14.Q(r5)
        L_0x01d0:
            int r5 = defpackage.xvb.Chip_closeIcon
            android.graphics.drawable.Drawable r5 = defpackage.wx3.k(r3, r1, r5)
            r14.L(r5)
            int r5 = defpackage.xvb.Chip_closeIconTint
            android.content.res.ColorStateList r5 = defpackage.wx3.i(r3, r1, r5)
            r14.P(r5)
            int r5 = defpackage.xvb.Chip_closeIconSize
            float r5 = r1.getDimension(r5, r4)
            r14.N(r5)
            int r5 = defpackage.xvb.Chip_android_checkable
            boolean r5 = r1.getBoolean(r5, r8)
            r14.A(r5)
            int r5 = defpackage.xvb.Chip_checkedIconVisible
            boolean r5 = r1.getBoolean(r5, r8)
            r14.D(r5)
            if (r7 == 0) goto L_0x0218
            java.lang.String r5 = "checkedIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x0218
            java.lang.String r5 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r5)
            if (r2 != 0) goto L_0x0218
            int r2 = defpackage.xvb.Chip_checkedIconEnabled
            boolean r2 = r1.getBoolean(r2, r8)
            r14.D(r2)
        L_0x0218:
            int r2 = defpackage.xvb.Chip_checkedIcon
            android.graphics.drawable.Drawable r2 = defpackage.wx3.k(r3, r1, r2)
            r14.B(r2)
            int r2 = defpackage.xvb.Chip_checkedIconTint
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0232
            int r2 = defpackage.xvb.Chip_checkedIconTint
            android.content.res.ColorStateList r2 = defpackage.wx3.i(r3, r1, r2)
            r14.C(r2)
        L_0x0232:
            int r2 = defpackage.xvb.Chip_showMotionSpec
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0245
            int r2 = r1.getResourceId(r2, r8)
            if (r2 == 0) goto L_0x0245
            q69 r2 = defpackage.q69.a(r3, r2)
            goto L_0x0246
        L_0x0245:
            r2 = 0
        L_0x0246:
            r14.k1 = r2
            int r2 = defpackage.xvb.Chip_hideMotionSpec
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x025b
            int r2 = r1.getResourceId(r2, r8)
            if (r2 == 0) goto L_0x025b
            q69 r15 = defpackage.q69.a(r3, r2)
            goto L_0x025c
        L_0x025b:
            r15 = 0
        L_0x025c:
            r14.l1 = r15
            int r2 = defpackage.xvb.Chip_chipStartPadding
            float r2 = r1.getDimension(r2, r4)
            float r3 = r14.m1
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0272
            r14.m1 = r2
            r14.invalidateSelf()
            r14.y()
        L_0x0272:
            int r2 = defpackage.xvb.Chip_iconStartPadding
            float r2 = r1.getDimension(r2, r4)
            r14.S(r2)
            int r2 = defpackage.xvb.Chip_iconEndPadding
            float r2 = r1.getDimension(r2, r4)
            r14.R(r2)
            int r2 = defpackage.xvb.Chip_textStartPadding
            float r2 = r1.getDimension(r2, r4)
            float r3 = r14.p1
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0298
            r14.p1 = r2
            r14.invalidateSelf()
            r14.y()
        L_0x0298:
            int r2 = defpackage.xvb.Chip_textEndPadding
            float r2 = r1.getDimension(r2, r4)
            float r3 = r14.q1
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02ac
            r14.q1 = r2
            r14.invalidateSelf()
            r14.y()
        L_0x02ac:
            int r2 = defpackage.xvb.Chip_closeIconStartPadding
            float r2 = r1.getDimension(r2, r4)
            r14.O(r2)
            int r2 = defpackage.xvb.Chip_closeIconEndPadding
            float r2 = r1.getDimension(r2, r4)
            r14.M(r2)
            int r2 = defpackage.xvb.Chip_chipEndPadding
            float r2 = r1.getDimension(r2, r4)
            float r3 = r14.t1
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r14.t1 = r2
            r14.invalidateSelf()
            r14.y()
        L_0x02d2:
            int r2 = defpackage.xvb.Chip_android_maxWidth
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r14.U1 = r2
            r1.recycle()
            int[] r15 = defpackage.xvb.Chip
            int[] r6 = new int[r8]
            defpackage.she.a(r12, r7, r10, r11)
            r1 = r12
            r2 = r18
            r3 = r15
            r4 = r10
            r5 = r11
            defpackage.she.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r7, r15, r10, r11)
            int r2 = defpackage.xvb.Chip_ensureMinTouchTargetSize
            boolean r2 = r1.getBoolean(r2, r8)
            r0.G0 = r2
            android.content.Context r2 = r16.getContext()
            r3 = 48
            float r2 = defpackage.gwf.m(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r3 = defpackage.xvb.Chip_chipMinTouchTargetSize
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.I0 = r2
            r1.recycle()
            r0.setChipDrawable(r14)
            java.util.WeakHashMap r1 = defpackage.eaf.a
            float r1 = defpackage.t9f.i(r16)
            r14.k(r1)
            int[] r15 = defpackage.xvb.Chip
            int[] r6 = new int[r8]
            defpackage.she.a(r12, r7, r10, r11)
            r1 = r12
            r2 = r18
            r3 = r15
            r4 = r10
            r5 = r11
            defpackage.she.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r7, r15, r10, r11)
            int r2 = defpackage.xvb.Chip_shapeAppearance
            boolean r2 = r1.hasValue(r2)
            r1.recycle()
            cx2 r1 = new cx2
            r1.<init>(r0, r0)
            r0.K0 = r1
            r16.g()
            if (r2 != 0) goto L_0x035a
            i32 r1 = new i32
            r1.<init>(r0, r9)
            r0.setOutlineProvider(r1)
        L_0x035a:
            boolean r1 = r0.C0
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r14.U0
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r14.S1
            r0.setEllipsize(r1)
            r16.j()
            ex2 r1 = r0.w0
            boolean r1 = r1.T1
            if (r1 != 0) goto L_0x0378
            r0.setLines(r9)
            r0.setHorizontallyScrolling(r9)
        L_0x0378:
            r0.setGravity(r13)
            r16.i()
            boolean r1 = r0.G0
            if (r1 == 0) goto L_0x0387
            int r1 = r0.I0
            r0.setMinHeight(r1)
        L_0x0387:
            int r1 = r16.getLayoutDirection()
            r0.H0 = r1
            nw2 r1 = new nw2
            r1.<init>(r9, r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x0396:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Chip does not support multi-line text"
            r0.<init>(r1)
            throw r0
        L_0x039e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r3)
            throw r0
        L_0x03a4:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r3)
            throw r0
        L_0x03aa:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Please set start drawable using R.attr#chipIcon."
            r0.<init>(r1)
            throw r0
        L_0x03b2:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Please set left drawable using R.attr#chipIcon."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.N0;
        rectF.setEmpty();
        if (e() && this.z0 != null) {
            ex2 ex2 = this.w0;
            Rect bounds = ex2.getBounds();
            rectF.setEmpty();
            if (ex2.W()) {
                float f = ex2.t1 + ex2.s1 + ex2.e1 + ex2.r1 + ex2.q1;
                if (vm4.a(ex2) == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.M0;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private afe getTextAppearance() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.A1.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.E0 != z) {
            this.E0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.D0 != z) {
            this.D0 = z;
            refreshDrawableState();
        }
    }

    public final void d(int i) {
        this.I0 = i;
        int i2 = 0;
        if (!this.G0) {
            InsetDrawable insetDrawable = this.x0;
            if (insetDrawable == null) {
                h();
            } else if (insetDrawable != null) {
                this.x0 = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                h();
            }
        } else {
            int max = Math.max(0, i - ((int) this.w0.P0));
            int max2 = Math.max(0, i - this.w0.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                int i3 = max2 > 0 ? max2 / 2 : 0;
                if (max > 0) {
                    i2 = max / 2;
                }
                int i4 = i2;
                if (this.x0 != null) {
                    Rect rect = new Rect();
                    this.x0.getPadding(rect);
                    if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                        h();
                        return;
                    }
                }
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
                this.x0 = new InsetDrawable(this.w0, i3, i4, i3, i4);
                h();
                return;
            }
            InsetDrawable insetDrawable2 = this.x0;
            if (insetDrawable2 == null) {
                h();
            } else if (insetDrawable2 != null) {
                this.x0 = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                h();
            }
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.L0 ? super.dispatchHoverEvent(motionEvent) : this.K0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.L0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        cx2 cx2 = this.K0;
        cx2.getClass();
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i3 = 0;
                                while (i < repeatCount && cx2.q(i2, (Rect) null)) {
                                    i++;
                                    i3 = 1;
                                }
                                i = i3;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = cx2.l;
                    if (i4 != Integer.MIN_VALUE) {
                        boolean s = cx2.s(i4, 16, (Bundle) null);
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = cx2.q(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = cx2.q(1, (Rect) null);
            }
        }
        if (i == 0 || cx2.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        ex2 ex2 = this.w0;
        boolean z = false;
        if (ex2 != null && ex2.x(ex2.b1)) {
            ex2 ex22 = this.w0;
            int isEnabled = isEnabled();
            if (this.F0) {
                isEnabled++;
            }
            if (this.E0) {
                isEnabled++;
            }
            if (this.D0) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.F0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.E0) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.D0) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(ex22.O1, iArr)) {
                ex22.O1 = iArr;
                if (ex22.W()) {
                    z = ex22.z(ex22.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    public final boolean e() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            Drawable drawable = ex2.b1;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof quf) {
                ((ruf) ((quf) drawable)).getClass();
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        ex2 ex2 = this.w0;
        return ex2 != null && ex2.g1;
    }

    public final void g() {
        ex2 ex2;
        if (!e() || (ex2 = this.w0) == null || !ex2.a1 || this.z0 == null) {
            eaf.j(this, (b4) null);
            this.L0 = false;
            return;
        }
        eaf.j(this, this.K0);
        this.L0 = true;
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.J0)) {
            return this.J0;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).z0.a) ? "android.widget.Button" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.x0;
        return insetDrawable == null ? this.w0 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.i1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.j1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.O0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return Math.max(0.0f, ex2.v());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.w0;
    }

    public float getChipEndPadding() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.t1;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        ex2 ex2 = this.w0;
        if (ex2 == null || (drawable = ex2.W0) == null) {
            return null;
        }
        if (!(drawable instanceof quf)) {
            return drawable;
        }
        ((ruf) ((quf) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.Y0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.X0;
        }
        return null;
    }

    public float getChipMinHeight() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.P0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.m1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.R0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.S0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        ex2 ex2 = this.w0;
        if (ex2 == null || (drawable = ex2.b1) == null) {
            return null;
        }
        if (!(drawable instanceof quf)) {
            return drawable;
        }
        ((ruf) ((quf) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.f1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.s1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.e1;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.r1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.d1;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.S1;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.L0) {
            cx2 cx2 = this.K0;
            if (cx2.l == 1 || cx2.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public q69 getHideMotionSpec() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.l1;
        }
        return null;
    }

    public float getIconEndPadding() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.o1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.n1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.T0;
        }
        return null;
    }

    public ead getShapeAppearanceModel() {
        return this.w0.a.a;
    }

    public q69 getShowMotionSpec() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.k1;
        }
        return null;
    }

    public float getTextEndPadding() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.q1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            return ex2.p1;
        }
        return 0.0f;
    }

    public final void h() {
        ColorStateList colorStateList = this.w0.T0;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.y0 = new RippleDrawable(colorStateList, getBackgroundDrawable(), (Drawable) null);
        ex2 ex2 = this.w0;
        if (ex2.P1) {
            ex2.P1 = false;
            ex2.Q1 = null;
            ex2.onStateChange(ex2.getState());
        }
        RippleDrawable rippleDrawable = this.y0;
        WeakHashMap weakHashMap = eaf.a;
        setBackground(rippleDrawable);
        i();
    }

    public final void i() {
        ex2 ex2;
        if (!TextUtils.isEmpty(getText()) && (ex2 = this.w0) != null) {
            int u = (int) (ex2.u() + ex2.t1 + ex2.q1);
            ex2 ex22 = this.w0;
            int t = (int) (ex22.t() + ex22.m1 + ex22.p1);
            if (this.x0 != null) {
                Rect rect = new Rect();
                this.x0.getPadding(rect);
                t += rect.left;
                u += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = eaf.a;
            setPaddingRelative(t, paddingTop, u, paddingBottom);
        }
    }

    public final void j() {
        TextPaint paint = getPaint();
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            paint.drawableState = ex2.getState();
        }
        afe textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.O0);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ez3.Z(this, this.w0);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, R0);
        }
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, S0);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.L0) {
            cx2 cx2 = this.K0;
            int i2 = cx2.l;
            if (i2 != Integer.MIN_VALUE) {
                cx2.j(i2);
            }
            if (z) {
                cx2.q(i, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i2 = -1;
            if (chipGroup.c) {
                int i3 = 0;
                i = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i3);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i3).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        }
                        i++;
                    }
                    i3++;
                }
            }
            i = -1;
            Object tag = getTag(lob.row_index_key);
            if (tag instanceof Integer) {
                i2 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) k4.a(isChecked(), i2, 1, i, 1).a);
        }
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) ? super.onResolvePointerIcon(motionEvent, i) : PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.H0 != i) {
            this.H0 = i;
            i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0045
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.D0
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r2)
        L_0x002a:
            r0 = r3
            goto L_0x0051
        L_0x002c:
            boolean r0 = r5.D0
            if (r0 == 0) goto L_0x0045
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.z0
            if (r0 == 0) goto L_0x003a
            r0.onClick(r5)
        L_0x003a:
            boolean r0 = r5.L0
            if (r0 == 0) goto L_0x0043
            cx2 r0 = r5.K0
            r0.x(r3, r3)
        L_0x0043:
            r0 = r3
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            r5.setCloseIconPressed(r2)
            goto L_0x0051
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r3)
            goto L_0x002a
        L_0x0050:
            r0 = r2
        L_0x0051:
            if (r0 != 0) goto L_0x0059
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L_0x005a
        L_0x0059:
            r2 = r3
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.J0 = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.y0) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.y0) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.A(z);
        }
    }

    public void setCheckableResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.A(ex2.u1.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        ex2 ex2 = this.w0;
        if (ex2 == null) {
            this.C0 = z;
        } else if (ex2.g1) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.B(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.B(am7.n(ex2.u1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.C(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.C(d8.r(ex2.u1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.D(ex2.u1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ex2 ex2 = this.w0;
        if (ex2 != null && ex2.O0 != colorStateList) {
            ex2.O0 = colorStateList;
            ex2.onStateChange(ex2.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList r;
        ex2 ex2 = this.w0;
        if (ex2 != null && ex2.O0 != (r = d8.r(ex2.u1, i))) {
            ex2.O0 = r;
            ex2.onStateChange(ex2.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.E(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.E(ex2.u1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(ex2 ex2) {
        ex2 ex22 = this.w0;
        if (ex22 != ex2) {
            if (ex22 != null) {
                ex22.R1 = new WeakReference((Object) null);
            }
            this.w0 = ex2;
            ex2.T1 = false;
            ex2.R1 = new WeakReference(this);
            d(this.I0);
        }
    }

    public void setChipEndPadding(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null && ex2.t1 != f) {
            ex2.t1 = f;
            ex2.invalidateSelf();
            ex2.y();
        }
    }

    public void setChipEndPaddingResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            float dimension = ex2.u1.getResources().getDimension(i);
            if (ex2.t1 != dimension) {
                ex2.t1 = dimension;
                ex2.invalidateSelf();
                ex2.y();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.F(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.F(am7.n(ex2.u1, i));
        }
    }

    public void setChipIconSize(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.G(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.G(ex2.u1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.H(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.H(d8.r(ex2.u1, i));
        }
    }

    public void setChipIconVisible(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.I(ex2.u1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null && ex2.P0 != f) {
            ex2.P0 = f;
            ex2.invalidateSelf();
            ex2.y();
        }
    }

    public void setChipMinHeightResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            float dimension = ex2.u1.getResources().getDimension(i);
            if (ex2.P0 != dimension) {
                ex2.P0 = dimension;
                ex2.invalidateSelf();
                ex2.y();
            }
        }
    }

    public void setChipStartPadding(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null && ex2.m1 != f) {
            ex2.m1 = f;
            ex2.invalidateSelf();
            ex2.y();
        }
    }

    public void setChipStartPaddingResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            float dimension = ex2.u1.getResources().getDimension(i);
            if (ex2.m1 != dimension) {
                ex2.m1 = dimension;
                ex2.invalidateSelf();
                ex2.y();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.J(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.J(d8.r(ex2.u1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.K(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.K(ex2.u1.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.L(drawable);
        }
        g();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ex2 ex2 = this.w0;
        if (ex2 != null && ex2.f1 != charSequence) {
            ok0 c = ok0.c();
            ex2.f1 = c.d(charSequence, c.c);
            ex2.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.M(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.M(ex2.u1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.L(am7.n(ex2.u1, i));
        }
        g();
    }

    public void setCloseIconSize(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.N(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.N(ex2.u1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.O(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.O(ex2.u1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.P(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.P(d8.r(ex2.u1, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.k(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.w0 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                ex2 ex2 = this.w0;
                if (ex2 != null) {
                    ex2.S1 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.G0 = z;
        d(this.I0);
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(q69 q69) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.l1 = q69;
        }
    }

    public void setHideMotionSpecResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.l1 = q69.a(ex2.u1, i);
        }
    }

    public void setIconEndPadding(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.R(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.R(ex2.u1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.S(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.S(ex2.u1.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(hw7 hw7) {
        this.B0 = hw7;
    }

    public void setLayoutDirection(int i) {
        if (this.w0 != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.U1 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.z0 = onClickListener;
        g();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.T(colorStateList);
        }
        if (!this.w0.P1) {
            h();
        }
    }

    public void setRippleColorResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.T(d8.r(ex2.u1, i));
            if (!this.w0.P1) {
                h();
            }
        }
    }

    public void setShapeAppearanceModel(ead ead) {
        this.w0.setShapeAppearanceModel(ead);
    }

    public void setShowMotionSpec(q69 q69) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.k1 = q69;
        }
    }

    public void setShowMotionSpecResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.k1 = q69.a(ex2.u1, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            super.setText(ex2.T1 ? null : charSequence, bufferType);
            ex2 ex22 = this.w0;
            if (ex22 != null && !TextUtils.equals(ex22.U0, charSequence)) {
                ex22.U0 = charSequence;
                ex22.A1.e = true;
                ex22.invalidateSelf();
                ex22.y();
            }
        }
    }

    public void setTextAppearance(afe afe) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.A1.c(afe, ex2.u1);
        }
        j();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null && ex2.q1 != f) {
            ex2.q1 = f;
            ex2.invalidateSelf();
            ex2.y();
        }
    }

    public void setTextEndPaddingResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            float dimension = ex2.u1.getResources().getDimension(i);
            if (ex2.q1 != dimension) {
                ex2.q1 = dimension;
                ex2.invalidateSelf();
                ex2.y();
            }
        }
    }

    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            ife ife = ex2.A1;
            afe afe = ife.g;
            if (afe != null) {
                afe.k = applyDimension;
                ife.a.setTextSize(applyDimension);
                ex2.a();
            }
        }
        j();
    }

    public void setTextStartPadding(float f) {
        ex2 ex2 = this.w0;
        if (ex2 != null && ex2.p1 != f) {
            ex2.p1 = f;
            ex2.invalidateSelf();
            ex2.y();
        }
    }

    public void setTextStartPaddingResource(int i) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            float dimension = ex2.u1.getResources().getDimension(i);
            if (ex2.p1 != dimension) {
                ex2.p1 = dimension;
                ex2.invalidateSelf();
                ex2.y();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.Q(z);
        }
        g();
    }

    public void setCheckedIconVisible(boolean z) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.D(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            ex2.I(z);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            Context context2 = ex2.u1;
            ex2.A1.c(new afe(context2, i), context2);
        }
        j();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ex2 ex2 = this.w0;
        if (ex2 != null) {
            Context context = ex2.u1;
            ex2.A1.c(new afe(context, i), context);
        }
        j();
    }
}
