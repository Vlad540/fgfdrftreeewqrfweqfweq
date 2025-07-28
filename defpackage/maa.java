package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: maa  reason: default package */
public final /* synthetic */ class maa implements TextView.OnEditorActionListener {
    public final /* synthetic */ AppCompatEditText a;

    public /* synthetic */ maa(AppCompatEditText appCompatEditText) {
        this.a = appCompatEditText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        bm3.r(this.a);
        return true;
    }
}
