package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: jr5  reason: default package */
public final class jr5 extends chd {
    /* JADX WARNING: type inference failed for: r2v0, types: [jr5, b7c] */
    public final void A(pg7 pg7) {
        xye xye = (xye) pg7;
        wye wye = wye.a;
        wye wye2 = xye.b;
        View view = this.a;
        if (wye2 == wye) {
            ((TextView) view).setEnabled(false);
        }
        mge mge = xye.c;
        mge.getClass();
        ((TextView) view).setText(mge.b(view.getContext().getResources()));
    }
}
