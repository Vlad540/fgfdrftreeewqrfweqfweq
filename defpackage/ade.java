package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: ade  reason: default package */
public interface ade {
    void E(View view) {
        wce wce;
        if (view.isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context = view.getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context);
        }
        z(wce);
        view.addOnAttachStateChangeListener(new q40(11, (Object) this));
    }

    void z(wce wce);
}
