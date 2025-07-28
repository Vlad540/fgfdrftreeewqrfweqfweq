package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mld  reason: default package */
public final class mld extends lhd {
    public View c;
    public WindowInsetsController o;

    public final void B() {
        View view = this.c;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.o;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? hia.m(view) : null;
        }
        if (windowInsetsController != null) {
            hia.w(windowInsetsController, hia.b());
        }
        mld.super.B();
    }

    public final void t() {
        WindowInsetsController windowInsetsController = this.o;
        View view = this.c;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? hia.m(view) : null;
        }
        if (windowInsetsController != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            lld lld = new lld(atomicBoolean);
            hia.x(windowInsetsController, lld);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            hia.D(windowInsetsController, lld);
            hia.C(windowInsetsController, hia.b());
            return;
        }
        mld.super.t();
    }
}
