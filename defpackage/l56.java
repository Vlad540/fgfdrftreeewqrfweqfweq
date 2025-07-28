package defpackage;

import android.view.View;
import android.view.ViewStub;
import one.me.sdk.gallery.view.NumericCheckButton;

/* renamed from: l56  reason: default package */
public final /* synthetic */ class l56 implements ViewStub.OnInflateListener {
    public final /* synthetic */ m56 a;

    public /* synthetic */ l56(m56 m56) {
        this.a = m56;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [one.me.sdk.gallery.view.NumericCheckButton, android.view.View] */
    public final void onInflate(ViewStub viewStub, View view) {
        View findViewById = view.findViewById(s9a.b);
        ? r1 = (NumericCheckButton) view.findViewById(s9a.a);
        m56 m56 = this.a;
        m56.K0 = r1;
        int X = a24.X(((float) 10) * m56.a.getContext().getResources().getDisplayMetrics().density);
        if (findViewById != null) {
            findViewById.post(new a93(r1, X, X, X, X, findViewById, 1));
        }
    }
}
