package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: psf  reason: default package */
public final class psf extends mt0 {
    public final WindowInsetsController j;
    public final mod k;
    public Window l;

    public psf(WindowInsetsController windowInsetsController, mod mod) {
        this.j = windowInsetsController;
        this.k = mod;
    }

    public final void G(boolean z) {
        Window window = this.l;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.j.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.j.setSystemBarsAppearance(0, 16);
    }

    public final void H(boolean z) {
        Window window = this.l;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.j.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.j.setSystemBarsAppearance(0, 8);
    }

    public final void J() {
        this.j.setSystemBarsBehavior(2);
    }

    public final void K(int i) {
        if ((i & 8) != 0) {
            ((lhd) this.k.b).B();
        }
        hia.w(this.j, i & -9);
    }

    public final void r(int i) {
        hia.C(this.j, i & -9);
    }

    public final boolean t() {
        this.j.setSystemBarsAppearance(0, 0);
        return (this.j.getSystemBarsAppearance() & 8) != 0;
    }
}
