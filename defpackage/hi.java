package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: hi  reason: default package */
public abstract class hi extends AppCompatEditText {
    public boolean x0;
    public sj[] y0;

    /* JADX WARNING: type inference failed for: r0v0, types: [hi, android.view.View, java.lang.Object] */
    public hi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new gi(0, this);
        hi.super.setLayerType(1, (Paint) null);
    }

    public final boolean getAnimojiEnabled() {
        return this.x0;
    }

    public final sj[] getCachedSpans$animoji_release() {
        return this.y0;
    }

    public final void onDetachedFromWindow() {
        hi.super.onDetachedFromWindow();
        sj[] sjVarArr = this.y0;
        if (sjVarArr != null && sjVarArr.length > 0) {
            sjVarArr[0].getClass();
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [hi, android.view.View] */
    public final void onDraw(Canvas canvas) {
        boolean z = qh.b;
        if (z) {
            qh.a.getClass();
        }
        hi.super.onDraw(canvas);
        if (z) {
            qh.a.getClass();
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        sj[] sjVarArr;
        Object[] objArr;
        if (qh.c != null && this.x0) {
            Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
            Class<sj> cls = sj.class;
            if (spannable != null) {
                sj[] sjVarArr2 = this.y0;
                if (sjVarArr2 == null || sjVarArr2.length <= 0) {
                    mt0.C(spannable, cls, 0, spannable.length());
                } else {
                    sjVarArr2[0].getClass();
                    throw null;
                }
            }
            try {
                pt4.a().h(charSequence);
            } catch (Throwable unused) {
            }
            fj fjVar = qh.c;
            if (!(charSequence == null || charSequence.length() == 0 || !(charSequence instanceof Spannable))) {
                List a = fjVar.a(charSequence);
                boolean isEmpty = a.isEmpty();
                if (a() != isEmpty) {
                    setEmojiCompatEnabled(isEmpty);
                }
                Spannable spannable2 = (Spannable) charSequence;
                ArrayList arrayList = new ArrayList();
                Iterator it = a.iterator();
                if (!it.hasNext()) {
                    a06.f(spannable2, arrayList, fjVar);
                    a06.D(charSequence);
                } else {
                    hr1.r(it.next());
                    throw null;
                }
            }
            if (charSequence != null) {
                int length = charSequence.length();
                try {
                    Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
                    if (spanned != null) {
                        objArr = spanned.getSpans(0, length, cls);
                        sjVarArr = (sj[]) objArr;
                    }
                } catch (Throwable unused2) {
                }
                objArr = null;
                sjVarArr = (sj[]) objArr;
            } else {
                sjVarArr = null;
            }
            this.y0 = sjVarArr;
            if (sjVarArr != null && sjVarArr.length > 0) {
                sjVarArr[0].getClass();
                throw null;
            }
        }
    }

    public final void setAnimojiEnabled(boolean z) {
        if (this.x0 != z) {
            Editable text = getText();
            if (text != null) {
                onTextChanged(text, 0, text.length(), text.length());
            }
            this.x0 = z;
        }
    }

    public final void setCachedSpans$animoji_release(sj[] sjVarArr) {
        this.y0 = sjVarArr;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hi, android.view.View] */
    public final void setLayerType(int i, Paint paint) {
        hi.super.setLayerType(1, paint);
    }
}
