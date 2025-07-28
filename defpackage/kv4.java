package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: kv4  reason: default package */
public final class kv4 implements TextWatcher {
    public int X = 0;
    public boolean Y;
    public final EditText a;
    public final boolean b;
    public iv4 c;
    public int o = Integer.MAX_VALUE;

    public kv4(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
        this.Y = true;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            pt4.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (!editText.isInEditMode() && this.Y) {
            if ((this.b || pt4.p != null) && i2 <= i3 && (charSequence instanceof Spannable)) {
                int b2 = pt4.a().b();
                if (b2 != 0) {
                    if (b2 == 1) {
                        int i4 = i;
                        pt4.a().g(i4, i + i3, (Spannable) charSequence, this.o, this.X);
                        return;
                    } else if (b2 != 3) {
                        return;
                    }
                }
                pt4 a2 = pt4.a();
                if (this.c == null) {
                    this.c = new iv4(editText);
                }
                a2.i(this.c);
            }
        }
    }
}
