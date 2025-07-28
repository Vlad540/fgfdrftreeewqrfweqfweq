package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: aje  reason: default package */
public final class aje extends b7c implements ade {
    public final AppCompatTextView J0;

    public aje(View view) {
        super(view);
        wce wce;
        this.J0 = (AppCompatTextView) view;
        if (view.isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context = view.getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context);
        }
        z(wce);
    }

    public final void z(wce wce) {
        this.J0.setTextColor(wce.F);
    }
}
