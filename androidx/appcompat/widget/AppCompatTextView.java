package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements qt4 {
    public final b9 a;
    public final jo b;
    public in c;
    public boolean o;
    public lo w0;
    public Future x0;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private in getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new in(this);
        }
        return this.c;
    }

    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b9 b9Var = this.a;
        if (b9Var != null) {
            b9Var.i();
        }
        jo joVar = this.b;
        if (joVar != null) {
            joVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [lo, ko] */
    public ko getSuperCaller() {
        if (this.w0 == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.w0 = new mo(this);
            } else {
                this.w0 = new lo(this);
            }
        }
        return this.w0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        b9 b9Var = this.a;
        if (b9Var != null) {
            return b9Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b9 b9Var = this.a;
        if (b9Var != null) {
            return b9Var.C();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    public CharSequence getText() {
        i();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public s1b getTextMetricsParamsCompat() {
        return new s1b(rge.c(this));
    }

    public final void i() {
        Future future = this.x0;
        if (future != null) {
            try {
                this.x0 = null;
                hr1.r(future.get());
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        jo.h(this, onCreateInputConnection, editorInfo);
        x87.r0(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jo joVar = this.b;
        if (joVar != null) {
            joVar.getClass();
        }
    }

    public void onMeasure(int i, int i2) {
        i();
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b9 b9Var = this.a;
        if (b9Var != null) {
            b9Var.I();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        b9 b9Var = this.a;
        if (b9Var != null) {
            b9Var.J(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jo joVar = this.b;
        if (joVar != null) {
            joVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jo joVar = this.b;
        if (joVar != null) {
            joVar.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        jo joVar = this.b;
        if (joVar != null) {
            joVar.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        jo joVar = this.b;
        if (joVar != null) {
            joVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().C1(i);
    }

    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().q1(i);
    }

    public void setLineHeight(int i) {
        a.a(this, i);
    }

    public void setPrecomputedText(t1b t1b) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b9 b9Var = this.a;
        if (b9Var != null) {
            b9Var.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b9 b9Var = this.a;
        if (b9Var != null) {
            b9Var.Q(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        jo joVar = this.b;
        joVar.i(colorStateList);
        joVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        jo joVar = this.b;
        joVar.j(mode);
        joVar.b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jo joVar = this.b;
        if (joVar != null) {
            joVar.g(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<t1b> future) {
        this.x0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(s1b s1b) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = s1b.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (!(textDirectionHeuristic2 == textDirectionHeuristic3 || textDirectionHeuristic2 == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(s1b.a);
        qge.e(this, s1b.c);
        qge.h(this, s1b.d);
    }

    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (!this.o) {
            if (typeface == null || i <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                kk9 kk9 = gte.a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.o = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.o = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        eke.a(context);
        this.o = false;
        this.w0 = null;
        vhe.a(getContext(), this);
        b9 b9Var = new b9((View) this);
        this.a = b9Var;
        b9Var.F(attributeSet, i);
        jo joVar = new jo(this);
        this.b = joVar;
        joVar.f(attributeSet, i);
        joVar.b();
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().G1(i, f);
        } else if (i2 >= 34) {
            sge.a(this, i, f);
        } else {
            a.a(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable n = i != 0 ? am7.n(context, i) : null;
        Drawable n2 = i2 != 0 ? am7.n(context, i2) : null;
        Drawable n3 = i3 != 0 ? am7.n(context, i3) : null;
        if (i4 != 0) {
            drawable = am7.n(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(n, n2, n3, drawable);
        jo joVar = this.b;
        if (joVar != null) {
            joVar.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable n = i != 0 ? am7.n(context, i) : null;
        Drawable n2 = i2 != 0 ? am7.n(context, i2) : null;
        Drawable n3 = i3 != 0 ? am7.n(context, i3) : null;
        if (i4 != 0) {
            drawable = am7.n(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(n, n2, n3, drawable);
        jo joVar = this.b;
        if (joVar != null) {
            joVar.b();
        }
    }
}
