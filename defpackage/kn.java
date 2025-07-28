package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: kn  reason: default package */
public final class kn extends MultiAutoCompleteTextView implements qt4 {
    public static final int[] o = {16843126};
    public final b9 a;
    public final jo b;
    public final afc c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kn(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            int r0 = defpackage.ylb.autoCompleteTextViewStyle
            defpackage.eke.a(r5)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            defpackage.vhe.a(r5, r4)
            android.content.Context r5 = r4.getContext()
            int[] r1 = o
            r2 = 0
            ydc r5 = ydc.D(r5, r6, r1, r0, r2)
            java.lang.Object r1 = r5.c
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            boolean r1 = r1.hasValue(r2)
            if (r1 == 0) goto L_0x002b
            android.graphics.drawable.Drawable r1 = r5.y(r2)
            r4.setDropDownBackgroundDrawable(r1)
        L_0x002b:
            r5.E()
            b9 r5 = new b9
            r5.<init>((android.view.View) r4)
            r4.a = r5
            r5.F(r6, r0)
            jo r5 = new jo
            r5.<init>(r4)
            r4.b = r5
            r5.f(r6, r0)
            r5.b()
            afc r5 = new afc
            r5.<init>(r4)
            r4.c = r5
            r5.A(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007f
            boolean r0 = r4.isFocusable()
            boolean r1 = r4.isClickable()
            boolean r2 = r4.isLongClickable()
            int r3 = r4.getInputType()
            android.text.method.KeyListener r5 = r5.v(r6)
            if (r5 != r6) goto L_0x0070
            goto L_0x007f
        L_0x0070:
            super.setKeyListener(r5)
            r4.setRawInputType(r3)
            r4.setFocusable(r0)
            r4.setClickable(r1)
            r4.setLongClickable(r2)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn.<init>(android.content.Context, android.util.AttributeSet):void");
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

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
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
