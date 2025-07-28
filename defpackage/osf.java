package defpackage;

import android.view.View;
import android.view.Window;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: osf  reason: default package */
public final class osf extends mt0 {
    public final Window j;
    public final mod k;

    public osf(Window window, mod mod) {
        this.j = window;
        this.k = mod;
    }

    public final void G(boolean z) {
        if (z) {
            Window window = this.j;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            T(16);
            return;
        }
        U(16);
    }

    public final void H(boolean z) {
        if (z) {
            Window window = this.j;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            T(8192);
            return;
        }
        U(8192);
    }

    public final void J() {
        U(2048);
        T(4096);
    }

    public final void K(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    U(4);
                    this.j.clearFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                } else if (i2 == 2) {
                    U(2);
                } else if (i2 == 8) {
                    ((lhd) this.k.b).B();
                }
            }
        }
    }

    public final void T(int i) {
        View decorView = this.j.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void U(int i) {
        View decorView = this.j.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public final void r(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    T(4);
                } else if (i2 == 2) {
                    T(2);
                } else if (i2 == 8) {
                    ((lhd) this.k.b).t();
                }
            }
        }
    }

    public final boolean t() {
        return (this.j.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
