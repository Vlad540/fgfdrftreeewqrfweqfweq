package defpackage;

import android.view.View;

/* renamed from: ke6  reason: default package */
public interface ke6 {
    int a();

    void d(View view) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(lp.K(view, this));
        } catch (Throwable th) {
            bool = new kcc(th);
        }
        Boolean bool2 = Boolean.FALSE;
        if (bool instanceof kcc) {
            bool = bool2;
        }
        Boolean bool3 = bool;
    }
}
