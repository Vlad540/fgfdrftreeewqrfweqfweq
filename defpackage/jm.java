package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.a;

/* renamed from: jm  reason: default package */
public class jm extends AutoCompleteTextView implements qt4 {
    public static final int[] o = {16843126};
    public final b9 a;
    public final jo b;
    public final afc c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        eke.a(context);
        vhe.a(getContext(), this);
        ydc D = ydc.D(getContext(), attributeSet, o, i, 0);
        if (((TypedArray) D.c).hasValue(0)) {
            setDropDownBackgroundDrawable(D.y(0));
        }
        D.E();
        b9 b9Var = new b9((View) this);
        this.a = b9Var;
        b9Var.F(attributeSet, i);
        jo joVar = new jo(this);
        this.b = joVar;
        joVar.f(attributeSet, i);
        joVar.b();
        afc afc = new afc(this);
        this.c = afc;
        afc.A(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener v = afc.v(keyListener);
            if (v != keyListener) {
                super.setKeyListener(v);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public final boolean a() {
        return ((kv4) ((vt4) this.c.b).a.b).Y;
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

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        x87.r0(onCreateInputConnection, editorInfo, this);
        return ((vt4) this.c.b).a(onCreateInputConnection, editorInfo);
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(am7.n(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.H(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.v(keyListener));
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

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jo joVar = this.b;
        if (joVar != null) {
            joVar.g(context, i);
        }
    }
}
