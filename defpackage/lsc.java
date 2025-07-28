package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: lsc  reason: default package */
public final class lsc implements TextView.OnEditorActionListener {
    public final /* synthetic */ tsc a;

    public lsc(tsc tsc) {
        this.a = tsc;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.onSubmitQuery();
        return true;
    }
}
