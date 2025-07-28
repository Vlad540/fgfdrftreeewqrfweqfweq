package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: in  reason: default package */
public final class in {
    public final TextView a;
    public final nfc b;

    public in(TextView textView) {
        this.a = textView;
        this.b = new nfc(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((e07) this.b.b).t(inputFilterArr);
    }

    public final boolean b() {
        return ((e07) this.b.b).z();
    }

    /* JADX INFO: finally extract failed */
    public final void c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, nwb.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(nwb.AppCompatTextView_emojiCompatEnabled)) {
                z = obtainStyledAttributes.getBoolean(nwb.AppCompatTextView_emojiCompatEnabled, true);
            }
            obtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void d(boolean z) {
        ((e07) this.b.b).L(z);
    }

    public final void e(boolean z) {
        ((e07) this.b.b).M(z);
    }
}
