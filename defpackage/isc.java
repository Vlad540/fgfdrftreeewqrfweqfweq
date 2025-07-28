package defpackage;

import android.view.View;

/* renamed from: isc  reason: default package */
public final class isc implements View.OnFocusChangeListener {
    public final /* synthetic */ tsc a;

    public isc(tsc tsc) {
        this.a = tsc;
    }

    public final void onFocusChange(View view, boolean z) {
        tsc tsc = this.a;
        View.OnFocusChangeListener onFocusChangeListener = tsc.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(tsc, z);
        }
    }
}
