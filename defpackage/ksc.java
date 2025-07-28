package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: ksc  reason: default package */
public final class ksc implements View.OnKeyListener {
    public final /* synthetic */ tsc a;

    public ksc(tsc tsc) {
        this.a = tsc;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        tsc tsc = this.a;
        if (tsc.mSearchable == null) {
            return false;
        }
        if (tsc.mSearchSrcTextView.isPopupShowing() && tsc.mSearchSrcTextView.getListSelection() != -1) {
            return tsc.onSuggestionsKey(view, i, keyEvent);
        }
        if (TextUtils.getTrimmedLength(tsc.mSearchSrcTextView.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        tsc.launchQuerySearch(0, (String) null, tsc.mSearchSrcTextView.getText().toString());
        return true;
    }
}
