package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: qdd  reason: default package */
public final /* synthetic */ class qdd implements TextView.OnEditorActionListener {
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        textView.clearFocus();
        return false;
    }
}
