package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: qsf  reason: default package */
public final class qsf {
    public final mt0 a;

    public qsf(WindowInsetsController windowInsetsController) {
        this.a = new psf(windowInsetsController, new mod(windowInsetsController));
    }

    public final void a(boolean z) {
        this.a.G(z);
    }

    public final void b(boolean z) {
        this.a.H(z);
    }

    public qsf(Window window, View view) {
        mod mod = new mod(view);
        if (Build.VERSION.SDK_INT >= 30) {
            psf psf = new psf(window.getInsetsController(), mod);
            psf.l = window;
            this.a = psf;
            return;
        }
        this.a = new osf(window, mod);
    }
}
