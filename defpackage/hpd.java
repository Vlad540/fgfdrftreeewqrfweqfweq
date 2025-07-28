package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* renamed from: hpd  reason: default package */
public final class hpd extends LinearLayout {
    public View.OnLongClickListener A0;
    public boolean B0;
    public final TextInputLayout a;
    public final AppCompatTextView b;
    public CharSequence c;
    public final CheckableImageButton o;
    public ColorStateList w0;
    public PorterDuff.Mode x0;
    public int y0;
    public ImageView.ScaleType z0;

    public hpd(TextInputLayout textInputLayout, ydc ydc) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(wrb.design_text_input_start_icon, this, false);
        this.o = checkableImageButton;
        CharSequence charSequence = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView;
        if (wx3.u(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.A0;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        n06.C(checkableImageButton, onLongClickListener);
        this.A0 = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        n06.C(checkableImageButton, (View.OnLongClickListener) null);
        int i = xvb.TextInputLayout_startIconTint;
        TypedArray typedArray = (TypedArray) ydc.c;
        if (typedArray.hasValue(i)) {
            this.w0 = wx3.h(getContext(), ydc, xvb.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(xvb.TextInputLayout_startIconTintMode)) {
            this.x0 = gwf.F(typedArray.getInt(xvb.TextInputLayout_startIconTintMode, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(xvb.TextInputLayout_startIconDrawable)) {
            b(ydc.y(xvb.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(xvb.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (text = typedArray.getText(xvb.TextInputLayout_startIconContentDescription))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(xvb.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(xvb.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(vmb.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.y0) {
                this.y0 = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(xvb.TextInputLayout_startIconScaleType)) {
                ImageView.ScaleType l = n06.l(typedArray.getInt(xvb.TextInputLayout_startIconScaleType, -1));
                this.z0 = l;
                checkableImageButton.setScaleType(l);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(lob.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = eaf.a;
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray.getResourceId(xvb.TextInputLayout_prefixTextAppearance, 0));
            if (typedArray.hasValue(xvb.TextInputLayout_prefixTextColor)) {
                appCompatTextView.setTextColor(ydc.w(xvb.TextInputLayout_prefixTextColor));
            }
            CharSequence text2 = typedArray.getText(xvb.TextInputLayout_prefixText);
            this.c = !TextUtils.isEmpty(text2) ? text2 : charSequence;
            appCompatTextView.setText(text2);
            e();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.o;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = eaf.a;
        return this.b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.o;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.w0;
            PorterDuff.Mode mode = this.x0;
            TextInputLayout textInputLayout = this.a;
            n06.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            n06.B(textInputLayout, checkableImageButton, this.w0);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.A0;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        n06.C(checkableImageButton, onLongClickListener);
        this.A0 = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        n06.C(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription((CharSequence) null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.o;
        int i = 0;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            d();
            e();
        }
    }

    public final void d() {
        int i;
        EditText editText = this.a.o;
        if (editText != null) {
            if (this.o.getVisibility() == 0) {
                i = 0;
            } else {
                WeakHashMap weakHashMap = eaf.a;
                i = editText.getPaddingStart();
            }
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(vmb.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap weakHashMap2 = eaf.a;
            this.b.setPaddingRelative(i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void e() {
        int i = 8;
        int i2 = (this.c == null || this.B0) ? 8 : 0;
        if (this.o.getVisibility() == 0 || i2 == 0) {
            i = 0;
        }
        setVisibility(i);
        this.b.setVisibility(i2);
        this.a.q();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
