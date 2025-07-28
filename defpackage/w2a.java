package defpackage;

import android.text.Editable;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.chip.Chip;
import java.util.Map;

/* renamed from: w2a  reason: default package */
public final class w2a extends TextKeyListener {
    public final /* synthetic */ x2a a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w2a(x2a x2a) {
        super(TextKeyListener.Capitalize.NONE, false);
        this.a = x2a;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (i == 67) {
            x2a x2a = this.a;
            if (x2a.getEditText().getText().length() == 0 && (!x2a.H0.isEmpty())) {
                Map.Entry entry = (Map.Entry) o23.d0(x2a.H0.entrySet());
                if (((Chip) entry.getValue()).isChecked()) {
                    v2a callback = x2a.getCallback();
                    if (callback != null) {
                        callback.q(((Number) entry.getKey()).longValue());
                    }
                    x2a.c(((Number) entry.getKey()).longValue());
                } else {
                    ((Chip) entry.getValue()).setChecked(true);
                }
                return true;
            }
        }
        return super.onKeyDown(view, editable, i, keyEvent);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return true;
    }
}
