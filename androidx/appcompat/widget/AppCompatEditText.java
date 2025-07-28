package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.a;

public class AppCompatEditText extends EditText implements sx9, qt4 {
    public final b9 a;
    public final jo b;
    public final uge c;
    public final afc o;
    public hn w0;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ylb.editTextStyle);
    }

    private hn getSuperCaller() {
        if (this.w0 == null) {
            this.w0 = new hn(this);
        }
        return this.w0;
    }

    public final boolean a() {
        return ((kv4) ((vt4) this.o.b).a.b).Y;
    }

    public final xp3 b(xp3 xp3) {
        return this.c.a(this, xp3);
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

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        jo.h(this, onCreateInputConnection, editorInfo);
        x87.r0(onCreateInputConnection, editorInfo, this);
        if (!(onCreateInputConnection == null || Build.VERSION.SDK_INT > 30 || (d = eaf.d(this)) == null)) {
            editorInfo.contentMimeTypes = d;
            onCreateInputConnection = new gx6(onCreateInputConnection, new hy5(6, this));
        }
        return ((vt4) this.o.b).a(onCreateInputConnection, editorInfo);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && eaf.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = pn.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        nfc nfc;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || eaf.d(this) == null || (i != 16908322 && i != 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                nfc = new nfc(primaryClip, 1);
            } else {
                vp3 vp3 = new vp3();
                vp3.b = primaryClip;
                vp3.c = 1;
                nfc = vp3;
            }
            nfc.setFlags(i == 16908322 ? 0 : 1);
            eaf.g(this, nfc.build());
        }
        return true;
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

    public void setEmojiCompatEnabled(boolean z) {
        this.o.H(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.o.v(keyListener));
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

    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [uge, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        eke.a(context);
        vhe.a(getContext(), this);
        b9 b9Var = new b9((View) this);
        this.a = b9Var;
        b9Var.F(attributeSet, i);
        jo joVar = new jo(this);
        this.b = joVar;
        joVar.f(attributeSet, i);
        joVar.b();
        this.c = new Object();
        afc afc = new afc(this);
        this.o = afc;
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

    public Editable getText() {
        return super.getText();
    }
}
