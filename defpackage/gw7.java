package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: gw7  reason: default package */
public final class gw7 extends AppCompatCheckBox {
    public static final int Q0 = kvb.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] R0 = {wlb.state_indeterminate};
    public static final int[] S0;
    public static final int[][] T0;
    public static final int U0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean A0;
    public boolean B0;
    public CharSequence C0;
    public Drawable D0;
    public Drawable E0;
    public boolean F0;
    public ColorStateList G0;
    public ColorStateList H0;
    public PorterDuff.Mode I0;
    public int J0;
    public int[] K0;
    public boolean L0;
    public CharSequence M0;
    public CompoundButton.OnCheckedChangeListener N0;
    public final sf O0;
    public final mi0 P0;
    public final LinkedHashSet w0 = new LinkedHashSet();
    public final LinkedHashSet x0 = new LinkedHashSet();
    public ColorStateList y0;
    public boolean z0;

    static {
        int i = wlb.state_error;
        S0 = new int[]{i};
        T0 = new int[][]{new int[]{16842910, i}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gw7(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            int r6 = defpackage.wlb.checkboxStyle
            int r7 = Q0
            android.content.Context r12 = defpackage.tw7.a(r12, r13, r6, r7)
            r11.<init>(r12, r13, r6)
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r11.w0 = r12
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r11.x0 = r12
            android.content.Context r12 = r11.getContext()
            int r0 = defpackage.bob.mtrl_checkbox_button_checked_unchecked
            sf r1 = new sf
            r1.<init>(r12)
            android.content.res.Resources r2 = r12.getResources()
            android.content.res.Resources$Theme r12 = r12.getTheme()
            java.lang.ThreadLocal r3 = defpackage.ubc.a
            android.graphics.drawable.Drawable r12 = defpackage.obc.a(r2, r0, r12)
            r1.a = r12
            pf r0 = r1.Y
            r12.setCallback(r0)
            rf r12 = new rf
            android.graphics.drawable.Drawable r0 = r1.a
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            r12.<init>((android.graphics.drawable.Drawable.ConstantState) r0)
            r11.O0 = r1
            mi0 r12 = new mi0
            r0 = 2
            r12.<init>(r11, r0)
            r11.P0 = r12
            android.content.Context r12 = r11.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.m93.a(r11)
            r11.D0 = r0
            android.content.res.ColorStateList r0 = r11.getSuperButtonTintList()
            r11.G0 = r0
            r8 = 0
            r11.setSupportButtonTintList(r8)
            int[] r9 = defpackage.xvb.MaterialCheckBox
            r10 = 0
            int[] r5 = new int[r10]
            defpackage.she.a(r12, r13, r6, r7)
            r0 = r12
            r1 = r13
            r2 = r9
            r3 = r6
            r4 = r7
            defpackage.she.b(r0, r1, r2, r3, r4, r5)
            ydc r0 = new ydc
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r9, r6, r7)
            r0.<init>(r12, r13)
            int r1 = defpackage.xvb.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r1 = r0.y(r1)
            r11.E0 = r1
            android.graphics.drawable.Drawable r1 = r11.D0
            r2 = 1
            if (r1 == 0) goto L_0x00bb
            int r1 = defpackage.wlb.isMaterial3Theme
            boolean r1 = bm3.E(r1, r12, r10)
            if (r1 == 0) goto L_0x00bb
            int r1 = defpackage.xvb.MaterialCheckBox_android_button
            int r1 = r13.getResourceId(r1, r10)
            int r3 = defpackage.xvb.MaterialCheckBox_buttonCompat
            int r3 = r13.getResourceId(r3, r10)
            int r4 = U0
            if (r1 != r4) goto L_0x00bb
            if (r3 != 0) goto L_0x00bb
            super.setButtonDrawable((android.graphics.drawable.Drawable) r8)
            int r1 = defpackage.bob.mtrl_checkbox_button
            android.graphics.drawable.Drawable r1 = defpackage.am7.n(r12, r1)
            r11.D0 = r1
            r11.F0 = r2
            android.graphics.drawable.Drawable r1 = r11.E0
            if (r1 != 0) goto L_0x00bb
            int r1 = defpackage.bob.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r1 = defpackage.am7.n(r12, r1)
            r11.E0 = r1
        L_0x00bb:
            int r1 = defpackage.xvb.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r12 = defpackage.wx3.h(r12, r0, r1)
            r11.H0 = r12
            int r12 = defpackage.xvb.MaterialCheckBox_buttonIconTintMode
            r1 = -1
            int r12 = r13.getInt(r12, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r12 = defpackage.gwf.F(r12, r1)
            r11.I0 = r12
            int r12 = defpackage.xvb.MaterialCheckBox_useMaterialThemeColors
            boolean r12 = r13.getBoolean(r12, r10)
            r11.z0 = r12
            int r12 = defpackage.xvb.MaterialCheckBox_centerIfNoTextEnabled
            boolean r12 = r13.getBoolean(r12, r2)
            r11.A0 = r12
            int r12 = defpackage.xvb.MaterialCheckBox_errorShown
            boolean r12 = r13.getBoolean(r12, r10)
            r11.B0 = r12
            int r12 = defpackage.xvb.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r12 = r13.getText(r12)
            r11.C0 = r12
            int r12 = defpackage.xvb.MaterialCheckBox_checkedState
            boolean r12 = r13.hasValue(r12)
            if (r12 == 0) goto L_0x0103
            int r12 = defpackage.xvb.MaterialCheckBox_checkedState
            int r12 = r13.getInt(r12, r10)
            r11.setCheckedState(r12)
        L_0x0103:
            r0.E()
            r11.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw7.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i = this.J0;
        return i == 1 ? getResources().getString(wsb.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(wsb.mtrl_checkbox_state_description_unchecked) : getResources().getString(wsb.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.y0 == null) {
            int r = vx3.r(this, wlb.colorControlActivated);
            int r2 = vx3.r(this, wlb.colorError);
            int r3 = vx3.r(this, wlb.colorSurface);
            int r4 = vx3.r(this, wlb.colorOnSurface);
            this.y0 = new ColorStateList(T0, new int[]{vx3.C(r3, 1.0f, r2), vx3.C(r3, 1.0f, r), vx3.C(r3, 0.54f, r4), vx3.C(r3, 0.38f, r4), vx3.C(r3, 0.38f, r4)});
        }
        return this.y0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.G0;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        l6 l6Var;
        Drawable drawable = this.D0;
        ColorStateList colorStateList3 = this.G0;
        PorterDuff.Mode b = l93.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b != null) {
                um4.i(drawable, b);
            }
        }
        this.D0 = drawable;
        Drawable drawable2 = this.E0;
        ColorStateList colorStateList4 = this.H0;
        PorterDuff.Mode mode = this.I0;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                um4.i(drawable2, mode);
            }
        }
        this.E0 = drawable2;
        if (this.F0) {
            sf sfVar = this.O0;
            if (sfVar != null) {
                Drawable drawable3 = sfVar.a;
                mi0 mi0 = this.P0;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (mi0.a == null) {
                        mi0.a = new me(mi0);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(mi0.a);
                }
                ArrayList arrayList = sfVar.X;
                qf qfVar = sfVar.b;
                if (!(arrayList == null || mi0 == null)) {
                    arrayList.remove(mi0);
                    if (sfVar.X.size() == 0 && (l6Var = sfVar.o) != null) {
                        qfVar.b.removeListener(l6Var);
                        sfVar.o = null;
                    }
                }
                Drawable drawable4 = sfVar.a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (mi0.a == null) {
                        mi0.a = new me(mi0);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(mi0.a);
                } else if (mi0 != null) {
                    if (sfVar.X == null) {
                        sfVar.X = new ArrayList();
                    }
                    if (!sfVar.X.contains(mi0)) {
                        sfVar.X.add(mi0);
                        if (sfVar.o == null) {
                            sfVar.o = new l6(1, (Object) sfVar);
                        }
                        qfVar.b.addListener(sfVar.o);
                    }
                }
            }
            Drawable drawable5 = this.D0;
            if ((drawable5 instanceof AnimatedStateListDrawable) && sfVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(lob.checked, lob.unchecked, sfVar, false);
                ((AnimatedStateListDrawable) this.D0).addTransition(lob.indeterminate, lob.unchecked, sfVar, false);
            }
        }
        Drawable drawable6 = this.D0;
        if (!(drawable6 == null || (colorStateList2 = this.G0) == null)) {
            um4.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.E0;
        if (!(drawable7 == null || (colorStateList = this.H0) == null)) {
            um4.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.D0;
        Drawable drawable9 = this.E0;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                if (f >= ((float) drawable8.getIntrinsicWidth()) / ((float) drawable8.getIntrinsicHeight())) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (((float) intrinsicWidth2) / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * ((float) intrinsicHeight));
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.D0;
    }

    public Drawable getButtonIconDrawable() {
        return this.E0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.H0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.I0;
    }

    public ColorStateList getButtonTintList() {
        return this.G0;
    }

    public int getCheckedState() {
        return this.J0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.C0;
    }

    public final boolean isChecked() {
        return this.J0 == 1;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.z0 && this.G0 == null && this.H0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, R0);
        }
        if (this.B0) {
            View.mergeDrawableStates(onCreateDrawableState, S0);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            } else {
                i2++;
            }
        }
        this.K0 = copyOf;
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable a;
        if (!this.A0 || !TextUtils.isEmpty(getText()) || (a = m93.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * (gwf.z(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a.getBounds();
            um4.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.B0) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.C0);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fw7)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fw7 fw7 = (fw7) parcelable;
        super.onRestoreInstanceState(fw7.getSuperState());
        setCheckedState(fw7.a);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, fw7] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = getCheckedState();
        return baseSavedState;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(am7.n(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.E0 = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(am7.n(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            b();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.I0 != mode) {
            this.I0 = mode;
            b();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            b();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.A0 = z;
    }

    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.J0 != i) {
            this.J0 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.M0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.L0) {
                this.L0 = true;
                LinkedHashSet linkedHashSet = this.x0;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        hr1.r(it.next());
                        throw null;
                    }
                }
                if (!(this.J0 == 2 || (onCheckedChangeListener = this.N0) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.L0 = false;
            }
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.C0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.B0 != z) {
            this.B0 = z;
            refreshDrawableState();
            Iterator it = this.w0.iterator();
            if (it.hasNext()) {
                hr1.r(it.next());
                throw null;
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.N0 = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.M0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.z0 = z;
        if (z) {
            l93.c(this, getMaterialThemeColorsTintList());
        } else {
            l93.c(this, (ColorStateList) null);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setButtonDrawable(Drawable drawable) {
        this.D0 = drawable;
        this.F0 = false;
        b();
    }
}
