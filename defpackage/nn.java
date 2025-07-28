package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;

/* renamed from: nn  reason: default package */
public class nn extends RadioButton implements gke, qt4 {
    public final mm a;
    public final b9 b;
    public final jo c;
    public in o;

    public nn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ylb.radioButtonStyle);
    }

    private in getEmojiTextViewHelper() {
        if (this.o == null) {
            this.o = new in(this);
        }
        return this.o;
    }

    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b9 b9Var = this.b;
        if (b9Var != null) {
            b9Var.i();
        }
        jo joVar = this.c;
        if (joVar != null) {
            joVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        b9 b9Var = this.b;
        if (b9Var != null) {
            return b9Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b9 b9Var = this.b;
        if (b9Var != null) {
            return b9Var.C();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        mm mmVar = this.a;
        if (mmVar != null) {
            return (ColorStateList) mmVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        mm mmVar = this.a;
        if (mmVar != null) {
            return (PorterDuff.Mode) mmVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b9 b9Var = this.b;
        if (b9Var != null) {
            b9Var.I();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        b9 b9Var = this.b;
        if (b9Var != null) {
            b9Var.J(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        mm mmVar = this.a;
        if (mmVar == null) {
            return;
        }
        if (mmVar.e) {
            mmVar.e = false;
            return;
        }
        mmVar.e = true;
        mmVar.a();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jo joVar = this.c;
        if (joVar != null) {
            joVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jo joVar = this.c;
        if (joVar != null) {
            joVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b9 b9Var = this.b;
        if (b9Var != null) {
            b9Var.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b9 b9Var = this.b;
        if (b9Var != null) {
            b9Var.Q(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.a = colorStateList;
            mmVar.c = true;
            mmVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.b = mode;
            mmVar.d = true;
            mmVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        jo joVar = this.c;
        joVar.i(colorStateList);
        joVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        jo joVar = this.c;
        joVar.j(mode);
        joVar.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        eke.a(context);
        vhe.a(getContext(), this);
        mm mmVar = new mm(this);
        this.a = mmVar;
        mmVar.e(attributeSet, i);
        b9 b9Var = new b9((View) this);
        this.b = b9Var;
        b9Var.F(attributeSet, i);
        jo joVar = new jo(this);
        this.c = joVar;
        joVar.f(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(am7.n(getContext(), i));
    }
}
