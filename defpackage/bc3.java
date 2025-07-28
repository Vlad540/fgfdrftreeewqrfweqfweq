package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: bc3  reason: default package */
public final class bc3 extends EditText implements mhe {
    public static final p7c b = new p7c("[0-9]*");
    public static final ac3 c = new ac3(0);
    public boolean a;

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z && this.a) {
            postInvalidateDelayed(1500);
        }
    }

    public final void onThemeChanged(pda pda) {
        setBackground(new ColorDrawable(km4.y0.r(this).b().a.h));
        Drawable textCursorDrawable = getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            pda.getText();
            gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        }
        setTextColor(pda.getText().e);
    }

    public final void setSecure(boolean z) {
        this.a = z;
        if (z) {
            setTransformationMethod(PasswordTransformationMethod.getInstance());
            setInputType(524306);
            removeTextChangedListener(PasswordTransformationMethod.getInstance());
            addTextChangedListener(PasswordTransformationMethod.getInstance());
            return;
        }
        removeTextChangedListener(PasswordTransformationMethod.getInstance());
        setTransformationMethod(SingleLineTransformationMethod.getInstance());
        setInputType(2);
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        setSecure(this.a);
        super.setText(charSequence, bufferType);
    }
}
