package defpackage;

import android.net.Uri;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: oi9  reason: default package */
public final class oi9 extends chd {
    /* JADX WARNING: type inference failed for: r5v2, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* renamed from: F */
    public final void A(mi9 mi9) {
        ? r5 = (OneMeDraweeView) this.a;
        r5.setId(Long.hashCode(mi9.a));
        ur6 d = ur6.d(Uri.parse(mi9.b));
        float f = (float) 64;
        d.d = new hbc(0.0f, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density), 12);
        tr6 a = d.a();
        int i = OneMeDraweeView.F0;
        r5.o(a, (tr6) null);
    }
}
