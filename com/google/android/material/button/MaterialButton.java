package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

public class MaterialButton extends AppCompatButton implements Checkable, pad {
    public static final int[] J0 = {16842911};
    public static final int[] K0 = {16842912};
    public static final int L0 = kvb.Widget_MaterialComponents_Button;
    public Drawable A0;
    public String B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public final zv7 o;
    public final LinkedHashSet w0 = new LinkedHashSet();
    public xv7 x0;
    public PorterDuff.Mode y0;
    public ColorStateList z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r6 = defpackage.wlb.materialButtonStyle
            int r7 = L0
            android.content.Context r10 = defpackage.tw7.a(r10, r11, r6, r7)
            r9.<init>(r10, r11, r6)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            r9.w0 = r10
            r10 = 0
            r9.G0 = r10
            r9.H0 = r10
            android.content.Context r8 = r9.getContext()
            int[] r2 = defpackage.xvb.MaterialButton
            int[] r5 = new int[r10]
            r0 = r8
            r1 = r11
            r3 = r6
            r4 = r7
            android.content.res.TypedArray r0 = defpackage.she.d(r0, r1, r2, r3, r4, r5)
            int r1 = defpackage.xvb.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r10)
            r9.F0 = r1
            int r1 = defpackage.xvb.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = defpackage.gwf.F(r1, r3)
            r9.y0 = r1
            android.content.Context r1 = r9.getContext()
            int r4 = defpackage.xvb.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = defpackage.wx3.i(r1, r0, r4)
            r9.z0 = r1
            android.content.Context r1 = r9.getContext()
            int r4 = defpackage.xvb.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = defpackage.wx3.k(r1, r0, r4)
            r9.A0 = r1
            int r1 = defpackage.xvb.MaterialButton_iconGravity
            r4 = 1
            int r1 = r0.getInteger(r1, r4)
            r9.I0 = r1
            int r1 = defpackage.xvb.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r10)
            r9.C0 = r1
            buf r11 = defpackage.ead.b(r8, r11, r6, r7)
            ead r11 = r11.c()
            zv7 r1 = new zv7
            r1.<init>(r9, r11)
            r9.o = r1
            int r11 = defpackage.xvb.MaterialButton_android_insetLeft
            int r11 = r0.getDimensionPixelOffset(r11, r10)
            r1.c = r11
            int r11 = defpackage.xvb.MaterialButton_android_insetRight
            int r11 = r0.getDimensionPixelOffset(r11, r10)
            r1.d = r11
            int r11 = defpackage.xvb.MaterialButton_android_insetTop
            int r11 = r0.getDimensionPixelOffset(r11, r10)
            r1.e = r11
            int r11 = defpackage.xvb.MaterialButton_android_insetBottom
            int r11 = r0.getDimensionPixelOffset(r11, r10)
            r1.f = r11
            int r11 = defpackage.xvb.MaterialButton_cornerRadius
            boolean r11 = r0.hasValue(r11)
            if (r11 == 0) goto L_0x00d2
            int r11 = defpackage.xvb.MaterialButton_cornerRadius
            int r11 = r0.getDimensionPixelSize(r11, r2)
            r1.g = r11
            ead r5 = r1.b
            float r11 = (float) r11
            buf r5 = r5.e()
            a0 r6 = new a0
            r6.<init>(r11)
            r5.e = r6
            a0 r6 = new a0
            r6.<init>(r11)
            r5.f = r6
            a0 r6 = new a0
            r6.<init>(r11)
            r5.g = r6
            a0 r6 = new a0
            r6.<init>(r11)
            r5.h = r6
            ead r11 = r5.c()
            r1.c(r11)
            r1.p = r4
        L_0x00d2:
            int r11 = defpackage.xvb.MaterialButton_strokeWidth
            int r11 = r0.getDimensionPixelSize(r11, r10)
            r1.h = r11
            int r11 = defpackage.xvb.MaterialButton_backgroundTintMode
            int r11 = r0.getInt(r11, r2)
            android.graphics.PorterDuff$Mode r11 = defpackage.gwf.F(r11, r3)
            r1.i = r11
            android.content.Context r11 = r9.getContext()
            int r2 = defpackage.xvb.MaterialButton_backgroundTint
            android.content.res.ColorStateList r11 = defpackage.wx3.i(r11, r0, r2)
            r1.j = r11
            android.content.Context r11 = r9.getContext()
            int r2 = defpackage.xvb.MaterialButton_strokeColor
            android.content.res.ColorStateList r11 = defpackage.wx3.i(r11, r0, r2)
            r1.k = r11
            android.content.Context r11 = r9.getContext()
            int r2 = defpackage.xvb.MaterialButton_rippleColor
            android.content.res.ColorStateList r11 = defpackage.wx3.i(r11, r0, r2)
            r1.l = r11
            int r11 = defpackage.xvb.MaterialButton_android_checkable
            boolean r11 = r0.getBoolean(r11, r10)
            r1.q = r11
            int r11 = defpackage.xvb.MaterialButton_elevation
            int r11 = r0.getDimensionPixelSize(r11, r10)
            r1.t = r11
            int r11 = defpackage.xvb.MaterialButton_toggleCheckedStateOnClick
            boolean r11 = r0.getBoolean(r11, r4)
            r1.r = r11
            java.util.WeakHashMap r11 = defpackage.eaf.a
            int r11 = r9.getPaddingStart()
            int r2 = r9.getPaddingTop()
            int r3 = r9.getPaddingEnd()
            int r5 = r9.getPaddingBottom()
            int r6 = defpackage.xvb.MaterialButton_android_background
            boolean r6 = r0.hasValue(r6)
            if (r6 == 0) goto L_0x0149
            r1.o = r4
            android.content.res.ColorStateList r6 = r1.j
            r9.setSupportBackgroundTintList(r6)
            android.graphics.PorterDuff$Mode r6 = r1.i
            r9.setSupportBackgroundTintMode(r6)
            goto L_0x014c
        L_0x0149:
            r1.e()
        L_0x014c:
            int r6 = r1.c
            int r11 = r11 + r6
            int r6 = r1.e
            int r2 = r2 + r6
            int r6 = r1.d
            int r3 = r3 + r6
            int r1 = r1.f
            int r5 = r5 + r1
            r9.setPaddingRelative(r11, r2, r3, r5)
            r0.recycle()
            int r11 = r9.F0
            r9.setCompoundDrawablePadding(r11)
            android.graphics.drawable.Drawable r11 = r9.A0
            if (r11 == 0) goto L_0x0168
            r10 = r4
        L_0x0168:
            r9.e(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil((double) f);
    }

    public final boolean b() {
        zv7 zv7 = this.o;
        return zv7 != null && zv7.q;
    }

    public final boolean c() {
        zv7 zv7 = this.o;
        return zv7 != null && !zv7.o;
    }

    public final void d() {
        int i = this.I0;
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.A0, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i == 3 || i == 4) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.A0, (Drawable) null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative((Drawable) null, this.A0, (Drawable) null, (Drawable) null);
        }
    }

    public final void e(boolean z) {
        Drawable drawable = this.A0;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A0 = mutate;
            um4.h(mutate, this.z0);
            PorterDuff.Mode mode = this.y0;
            if (mode != null) {
                um4.i(this.A0, mode);
            }
            int i = this.C0;
            if (i == 0) {
                i = this.A0.getIntrinsicWidth();
            }
            int i2 = this.C0;
            if (i2 == 0) {
                i2 = this.A0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A0;
            int i3 = this.D0;
            int i4 = this.E0;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.A0.setVisible(true, z);
        }
        if (z) {
            d();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.I0;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.A0) || (((i5 == 3 || i5 == 4) && drawable5 != this.A0) || ((i5 == 16 || i5 == 32) && drawable4 != this.A0))) {
            d();
        }
    }

    public final void f(int i, int i2) {
        if (this.A0 != null && getLayout() != null) {
            int i3 = this.I0;
            boolean z = true;
            if ((i3 == 1 || i3 == 2) || i3 == 3 || i3 == 4) {
                this.E0 = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i4 = this.I0;
                if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.D0 = 0;
                    e(false);
                    return;
                }
                int i5 = this.C0;
                if (i5 == 0) {
                    i5 = this.A0.getIntrinsicWidth();
                }
                int textLayoutWidth = i - getTextLayoutWidth();
                WeakHashMap weakHashMap = eaf.a;
                int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i5) - this.F0) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    paddingEnd /= 2;
                }
                boolean z2 = getLayoutDirection() == 1;
                if (this.I0 != 4) {
                    z = false;
                }
                if (z2 != z) {
                    paddingEnd = -paddingEnd;
                }
                if (this.D0 != paddingEnd) {
                    this.D0 = paddingEnd;
                    e(false);
                }
            } else if (i3 == 16 || i3 == 32) {
                this.D0 = 0;
                if (i3 == 16) {
                    this.E0 = 0;
                    e(false);
                    return;
                }
                int i6 = this.C0;
                if (i6 == 0) {
                    i6 = this.A0.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i6) - this.F0) - getPaddingBottom()) / 2);
                if (this.E0 != max) {
                    this.E0 = max;
                    e(false);
                }
            }
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.B0)) {
            return this.B0;
        }
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (c()) {
            return this.o.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.A0;
    }

    public int getIconGravity() {
        return this.I0;
    }

    public int getIconPadding() {
        return this.F0;
    }

    public int getIconSize() {
        return this.C0;
    }

    public ColorStateList getIconTint() {
        return this.z0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.y0;
    }

    public int getInsetBottom() {
        return this.o.f;
    }

    public int getInsetTop() {
        return this.o.e;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.o.l;
        }
        return null;
    }

    public ead getShapeAppearanceModel() {
        if (c()) {
            return this.o.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.o.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.o.h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return c() ? this.o.j : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return c() ? this.o.i : super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.G0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (c()) {
            ez3.Z(this, this.o.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (b()) {
            View.mergeDrawableStates(onCreateDrawableState, J0);
        }
        if (this.G0) {
            View.mergeDrawableStates(onCreateDrawableState, K0);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.G0);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(this.G0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof yv7)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        yv7 yv7 = (yv7) parcelable;
        super.onRestoreInstanceState(yv7.a);
        setChecked(yv7.c);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, z, yv7] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        zVar.c = this.G0;
        return zVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        if (this.o.r) {
            toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.A0 != null) {
            if (this.A0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.B0 = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (c()) {
            zv7 zv7 = this.o;
            if (zv7.b(false) != null) {
                zv7.b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!c()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            zv7 zv7 = this.o;
            zv7.o = true;
            ColorStateList colorStateList = zv7.j;
            MaterialButton materialButton = zv7.a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(zv7.i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? am7.n(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (c()) {
            this.o.q = z;
        }
    }

    public void setChecked(boolean z) {
        if (b() && isEnabled() && this.G0 != z) {
            this.G0 = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.G0;
                if (!materialButtonToggleGroup.x0) {
                    materialButtonToggleGroup.b(getId(), z2);
                }
            }
            if (!this.H0) {
                this.H0 = true;
                Iterator it = this.w0.iterator();
                if (!it.hasNext()) {
                    this.H0 = false;
                } else {
                    hr1.r(it.next());
                    throw null;
                }
            }
        }
    }

    public void setCornerRadius(int i) {
        if (c()) {
            zv7 zv7 = this.o;
            if (!zv7.p || zv7.g != i) {
                zv7.g = i;
                zv7.p = true;
                float f = (float) i;
                buf e = zv7.b.e();
                e.e = new a0(f);
                e.f = new a0(f);
                e.g = new a0(f);
                e.h = new a0(f);
                zv7.c(e.c());
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (c()) {
            this.o.b(false).k(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A0 != drawable) {
            this.A0 = drawable;
            e(true);
            f(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.I0 != i) {
            this.I0 = i;
            f(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.F0 != i) {
            this.F0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? am7.n(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.C0 != i) {
            this.C0 = i;
            e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.y0 != mode) {
            this.y0 = mode;
            e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(d8.r(getContext(), i));
    }

    public void setInsetBottom(int i) {
        zv7 zv7 = this.o;
        zv7.d(zv7.e, i);
    }

    public void setInsetTop(int i) {
        zv7 zv7 = this.o;
        zv7.d(i, zv7.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(xv7 xv7) {
        this.x0 = xv7;
    }

    public void setPressed(boolean z) {
        xv7 xv7 = this.x0;
        if (xv7 != null) {
            ((MaterialButtonToggleGroup) ((u5g) xv7).b).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            zv7 zv7 = this.o;
            if (zv7.l != colorStateList) {
                zv7.l = colorStateList;
                MaterialButton materialButton = zv7.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (c()) {
            setRippleColor(d8.r(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(ead ead) {
        if (c()) {
            this.o.c(ead);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (c()) {
            zv7 zv7 = this.o;
            zv7.n = z;
            zv7.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            zv7 zv7 = this.o;
            if (zv7.k != colorStateList) {
                zv7.k = colorStateList;
                zv7.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (c()) {
            setStrokeColor(d8.r(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (c()) {
            zv7 zv7 = this.o;
            if (zv7.h != i) {
                zv7.h = i;
                zv7.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (c()) {
            zv7 zv7 = this.o;
            if (zv7.j != colorStateList) {
                zv7.j = colorStateList;
                if (zv7.b(false) != null) {
                    um4.h(zv7.b(false), zv7.j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (c()) {
            zv7 zv7 = this.o;
            if (zv7.i != mode) {
                zv7.i = mode;
                if (zv7.b(false) != null && zv7.i != null) {
                    um4.i(zv7.b(false), zv7.i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.o.r = z;
    }

    public final void toggle() {
        setChecked(!this.G0);
    }
}
