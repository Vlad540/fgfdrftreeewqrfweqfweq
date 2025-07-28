package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* renamed from: gy4  reason: default package */
public final class gy4 extends LinearLayout {
    public int A0 = 0;
    public final LinkedHashSet B0 = new LinkedHashSet();
    public ColorStateList C0;
    public PorterDuff.Mode D0;
    public int E0;
    public ImageView.ScaleType F0;
    public View.OnLongClickListener G0;
    public CharSequence H0;
    public final AppCompatTextView I0;
    public boolean J0;
    public EditText K0;
    public final AccessibilityManager L0;
    public r34 M0;
    public final ey4 N0 = new ey4(this);
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList o;
    public PorterDuff.Mode w0;
    public View.OnLongClickListener x0;
    public final CheckableImageButton y0;
    public final wx z0;

    /* JADX WARNING: type inference failed for: r11v1, types: [wx, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gy4(TextInputLayout textInputLayout, ydc ydc) {
        super(textInputLayout.getContext());
        CharSequence text;
        TextInputLayout textInputLayout2 = textInputLayout;
        ydc ydc2 = ydc;
        fy4 fy4 = new fy4(this);
        this.L0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout2;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, lob.text_input_error_icon);
        this.c = a2;
        CheckableImageButton a3 = a(frameLayout, from, lob.text_input_end_icon);
        this.y0 = a3;
        ? obj = new Object();
        obj.c = new SparseArray();
        obj.o = this;
        int i = xvb.TextInputLayout_endIconDrawable;
        TypedArray typedArray = (TypedArray) ydc2.c;
        obj.a = typedArray.getResourceId(i, 0);
        obj.b = typedArray.getResourceId(xvb.TextInputLayout_passwordToggleDrawable, 0);
        this.z0 = obj;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.I0 = appCompatTextView;
        int i2 = xvb.TextInputLayout_errorIconTint;
        TypedArray typedArray2 = (TypedArray) ydc2.c;
        if (typedArray2.hasValue(i2)) {
            this.o = wx3.h(getContext(), ydc2, xvb.TextInputLayout_errorIconTint);
        }
        if (typedArray2.hasValue(xvb.TextInputLayout_errorIconTintMode)) {
            this.w0 = gwf.F(typedArray2.getInt(xvb.TextInputLayout_errorIconTintMode, -1), (PorterDuff.Mode) null);
        }
        if (typedArray2.hasValue(xvb.TextInputLayout_errorIconDrawable)) {
            i(ydc2.y(xvb.TextInputLayout_errorIconDrawable));
        }
        a2.setContentDescription(getResources().getText(wsb.error_icon_content_description));
        WeakHashMap weakHashMap = eaf.a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray2.hasValue(xvb.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(xvb.TextInputLayout_endIconTint)) {
                this.C0 = wx3.h(getContext(), ydc2, xvb.TextInputLayout_endIconTint);
            }
            if (typedArray2.hasValue(xvb.TextInputLayout_endIconTintMode)) {
                this.D0 = gwf.F(typedArray2.getInt(xvb.TextInputLayout_endIconTintMode, -1), (PorterDuff.Mode) null);
            }
        }
        if (typedArray2.hasValue(xvb.TextInputLayout_endIconMode)) {
            g(typedArray2.getInt(xvb.TextInputLayout_endIconMode, 0));
            if (typedArray2.hasValue(xvb.TextInputLayout_endIconContentDescription) && a3.getContentDescription() != (text = typedArray2.getText(xvb.TextInputLayout_endIconContentDescription))) {
                a3.setContentDescription(text);
            }
            a3.setCheckable(typedArray2.getBoolean(xvb.TextInputLayout_endIconCheckable, true));
        } else if (typedArray2.hasValue(xvb.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(xvb.TextInputLayout_passwordToggleTint)) {
                this.C0 = wx3.h(getContext(), ydc2, xvb.TextInputLayout_passwordToggleTint);
            }
            if (typedArray2.hasValue(xvb.TextInputLayout_passwordToggleTintMode)) {
                this.D0 = gwf.F(typedArray2.getInt(xvb.TextInputLayout_passwordToggleTintMode, -1), (PorterDuff.Mode) null);
            }
            g(typedArray2.getBoolean(xvb.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(xvb.TextInputLayout_passwordToggleContentDescription);
            if (a3.getContentDescription() != text2) {
                a3.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(xvb.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(vmb.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.E0) {
                this.E0 = dimensionPixelSize;
                a3.setMinimumWidth(dimensionPixelSize);
                a3.setMinimumHeight(dimensionPixelSize);
                a2.setMinimumWidth(dimensionPixelSize);
                a2.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray2.hasValue(xvb.TextInputLayout_endIconScaleType)) {
                ImageView.ScaleType l = n06.l(typedArray2.getInt(xvb.TextInputLayout_endIconScaleType, -1));
                this.F0 = l;
                a3.setScaleType(l);
                a2.setScaleType(l);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(lob.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray2.getResourceId(xvb.TextInputLayout_suffixTextAppearance, 0));
            if (typedArray2.hasValue(xvb.TextInputLayout_suffixTextColor)) {
                appCompatTextView.setTextColor(ydc2.w(xvb.TextInputLayout_suffixTextColor));
            }
            CharSequence text3 = typedArray2.getText(xvb.TextInputLayout_suffixText);
            this.H0 = TextUtils.isEmpty(text3) ? null : text3;
            appCompatTextView.setText(text3);
            n();
            frameLayout.addView(a3);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a2);
            textInputLayout2.t1.add(fy4);
            if (textInputLayout2.o != null) {
                fy4.a(textInputLayout2);
            }
            addOnAttachStateChangeListener(new ck(5, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(wrb.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (wx3.u(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final hy4 b() {
        hy4 ix3;
        int i = this.A0;
        wx wxVar = this.z0;
        SparseArray sparseArray = (SparseArray) wxVar.c;
        hy4 hy4 = (hy4) sparseArray.get(i);
        if (hy4 == null) {
            gy4 gy4 = (gy4) wxVar.o;
            if (i == -1) {
                ix3 = new ix3(gy4, 0);
            } else if (i == 0) {
                ix3 = new ix3(gy4, 1);
            } else if (i == 1) {
                hy4 = new ska(gy4, wxVar.b);
                sparseArray.append(i, hy4);
            } else if (i == 2) {
                ix3 = new wz2(gy4);
            } else if (i == 3) {
                ix3 = new kp4(gy4);
            } else {
                throw new IllegalArgumentException(wn6.h(i, "Invalid end icon mode: "));
            }
            hy4 = ix3;
            sparseArray.append(i, hy4);
        }
        return hy4;
    }

    public final int c() {
        int i;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.y0;
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = eaf.a;
        return this.I0.getPaddingEnd() + getPaddingEnd() + i;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.y0.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        hy4 b2 = b();
        boolean k = b2.k();
        CheckableImageButton checkableImageButton = this.y0;
        boolean z4 = true;
        if (!k || (z3 = checkableImageButton.o) == b2.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b2 instanceof kp4) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            n06.B(this.a, checkableImageButton, this.C0);
        }
    }

    public final void g(int i) {
        if (this.A0 != i) {
            hy4 b2 = b();
            r34 r34 = this.M0;
            AccessibilityManager accessibilityManager = this.L0;
            if (!(r34 == null || accessibilityManager == null)) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new c4(r34));
            }
            CharSequence charSequence = null;
            this.M0 = null;
            b2.s();
            this.A0 = i;
            Iterator it = this.B0.iterator();
            if (!it.hasNext()) {
                h(i != 0);
                hy4 b3 = b();
                int i2 = this.z0.a;
                if (i2 == 0) {
                    i2 = b3.d();
                }
                Drawable n = i2 != 0 ? am7.n(getContext(), i2) : null;
                CheckableImageButton checkableImageButton = this.y0;
                checkableImageButton.setImageDrawable(n);
                TextInputLayout textInputLayout = this.a;
                if (n != null) {
                    n06.b(textInputLayout, checkableImageButton, this.C0, this.D0);
                    n06.B(textInputLayout, checkableImageButton, this.C0);
                }
                int c2 = b3.c();
                if (c2 != 0) {
                    charSequence = getResources().getText(c2);
                }
                if (checkableImageButton.getContentDescription() != charSequence) {
                    checkableImageButton.setContentDescription(charSequence);
                }
                checkableImageButton.setCheckable(b3.k());
                if (b3.i(textInputLayout.getBoxBackgroundMode())) {
                    b3.r();
                    r34 h = b3.h();
                    this.M0 = h;
                    if (!(h == null || accessibilityManager == null)) {
                        WeakHashMap weakHashMap = eaf.a;
                        if (isAttachedToWindow()) {
                            accessibilityManager.addTouchExplorationStateChangeListener(new c4(this.M0));
                        }
                    }
                    View.OnClickListener f = b3.f();
                    View.OnLongClickListener onLongClickListener = this.G0;
                    checkableImageButton.setOnClickListener(f);
                    n06.C(checkableImageButton, onLongClickListener);
                    EditText editText = this.K0;
                    if (editText != null) {
                        b3.m(editText);
                        j(b3);
                    }
                    n06.b(textInputLayout, checkableImageButton, this.C0, this.D0);
                    f(true);
                    return;
                }
                throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
            }
            hr1.r(it.next());
            throw null;
        }
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.y0.setVisibility(z ? 0 : 8);
            k();
            m();
            this.a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        n06.b(this.a, checkableImageButton, this.o, this.w0);
    }

    public final void j(hy4 hy4) {
        if (this.K0 != null) {
            if (hy4.e() != null) {
                this.K0.setOnFocusChangeListener(hy4.e());
            }
            if (hy4.g() != null) {
                this.y0.setOnFocusChangeListener(hy4.g());
            }
        }
    }

    public final void k() {
        int i = 8;
        this.b.setVisibility((this.y0.getVisibility() != 0 || e()) ? 8 : 0);
        boolean z = (this.H0 == null || this.J0) ? true : false;
        if (d() || e() || !z) {
            i = 0;
        }
        setVisibility(i);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable == null || !textInputLayout.B0.q || !textInputLayout.m()) ? 8 : 0);
        k();
        m();
        if (this.A0 == 0) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.o != null) {
            if (d() || e()) {
                i = 0;
            } else {
                EditText editText = textInputLayout.o;
                WeakHashMap weakHashMap = eaf.a;
                i = editText.getPaddingEnd();
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(vmb.material_input_text_to_prefix_suffix_padding);
            int paddingTop = textInputLayout.o.getPaddingTop();
            int paddingBottom = textInputLayout.o.getPaddingBottom();
            WeakHashMap weakHashMap2 = eaf.a;
            this.I0.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.I0;
        int visibility = appCompatTextView.getVisibility();
        boolean z = false;
        int i = (this.H0 == null || this.J0) ? 8 : 0;
        if (visibility != i) {
            hy4 b2 = b();
            if (i == 0) {
                z = true;
            }
            b2.p(z);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.a.q();
    }
}
