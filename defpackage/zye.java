package defpackage;

import android.view.View;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: zye  reason: default package */
public final class zye extends chd implements p27 {
    public za6 J0;

    /* JADX WARNING: type inference failed for: r2v0, types: [zye, b7c] */
    public final void A(pg7 pg7) {
        xye xye = (xye) pg7;
        View view = this.a;
        yye yye = (yye) view;
        yye.setType(xye.b);
        mge mge = xye.c;
        mge.getClass();
        CharSequence b = mge.b(view.getContext().getResources());
        if (b == null) {
            b = BuildConfig.FLAVOR;
        }
        yye.setTitle(b);
    }

    public final void D() {
        this.J0 = null;
    }
}
