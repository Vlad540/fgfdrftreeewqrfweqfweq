package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: ebf  reason: default package */
public final class ebf implements View.OnAttachStateChangeListener, TextWatcher {
    public final WeakReference a;

    public ebf(TextView textView) {
        this.a = new WeakReference(textView);
        if (textView.isAttachedToWindow()) {
            a(textView);
        }
    }

    public static void a(TextView textView) {
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), dbf.class) : null;
        if (spans == null) {
            spans = new dbf[0];
        }
        for (Object obj : spans) {
            bi5 bi5 = (bi5) ((dbf) obj);
            Drawable drawable = bi5.getDrawable();
            WeakHashMap weakHashMap = bi5.Y;
            if (weakHashMap.put(textView, jue.a) == null || drawable.getCallback() == null) {
                drawable.setCallback(new zh5(bi5, weakHashMap));
                drawable.invalidateSelf();
                Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                if (animatable != null) {
                    animatable.start();
                }
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        TextView textView = (TextView) this.a.get();
        if (textView != null) {
            a(textView);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onViewAttachedToWindow(View view) {
        a((TextView) view);
    }

    public final void onViewDetachedFromWindow(View view) {
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        Object[] objArr = null;
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, textView.getText().length(), dbf.class);
        }
        if (objArr == null) {
            objArr = new dbf[0];
        }
        for (Object obj : objArr) {
            ((bi5) ((dbf) obj)).c(textView);
        }
    }
}
