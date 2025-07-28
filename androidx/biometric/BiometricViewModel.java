package androidx.biometric;

import android.os.Looper;
import me.leolin.shortcutbadger.BuildConfig;

public class BiometricViewModel extends uaf {
    public a06 b;
    public ex c;
    public stf d;
    public b2b e;
    public mn f;
    public cm0 g;
    public CharSequence h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public vb9 n;
    public vb9 o;
    public vb9 p;
    public vb9 q;
    public vb9 r;
    public vb9 s;
    public int t = 0;
    public vb9 u;
    public vb9 v;

    public static void j(vb9 vb9, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            vb9.k(obj);
        } else {
            vb9.i(obj);
        }
    }

    public final CharSequence e() {
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            return charSequence;
        }
        ex exVar = this.c;
        if (exVar == null) {
            return null;
        }
        CharSequence charSequence2 = (CharSequence) exVar.Y;
        return charSequence2 != null ? charSequence2 : BuildConfig.FLAVOR;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [yh7, vb9] */
    public final void f(ol0 ol0) {
        if (this.o == null) {
            this.o = new yh7();
        }
        j(this.o, ol0);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [yh7, vb9] */
    public final void g(CharSequence charSequence) {
        if (this.v == null) {
            this.v = new yh7();
        }
        j(this.v, charSequence);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [yh7, vb9] */
    public final void h(int i2) {
        if (this.u == null) {
            this.u = new yh7();
        }
        j(this.u, Integer.valueOf(i2));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [yh7, vb9] */
    public final void i(boolean z) {
        if (this.r == null) {
            this.r = new yh7();
        }
        j(this.r, Boolean.valueOf(z));
    }
}
