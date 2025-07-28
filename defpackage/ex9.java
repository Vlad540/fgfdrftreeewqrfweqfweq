package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: ex9  reason: default package */
public final class ex9 {
    public final Runnable a;
    public final lr b = new lr();
    public ww9 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public ex9(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? bx9.a.a(new xw9(this, 0), new xw9(this, 1), new yw9(this, 0), new yw9(this, 1)) : zw9.a.a(new yw9(this, 2));
        }
    }

    public final void a(nc7 nc7, ww9 ww9) {
        pc7 R = nc7.R();
        if (R.d != ob7.a) {
            ww9.b.add(new cx9(this, R, ww9));
            f();
            ww9.c = new e78(0, this, ex9.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 5);
        }
    }

    public final dx9 b(ww9 ww9) {
        this.b.b(ww9);
        dx9 dx9 = new dx9(this, ww9);
        ww9.b.add(dx9);
        f();
        ww9.c = new e78(0, this, ex9.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 6);
        return dx9;
    }

    public final void c() {
        Object obj;
        ww9 ww9 = this.c;
        if (ww9 == null) {
            lr lrVar = this.b;
            ListIterator listIterator = lrVar.listIterator(lrVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((ww9) obj).a) {
                    break;
                }
            }
            ww9 = (ww9) obj;
        }
        this.c = null;
        if (ww9 != null) {
            ww9.a();
        }
    }

    public final void d() {
        Object obj;
        ww9 ww9 = this.c;
        if (ww9 == null) {
            lr lrVar = this.b;
            ListIterator listIterator = lrVar.listIterator(lrVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((ww9) obj).a) {
                    break;
                }
            }
            ww9 = (ww9) obj;
        }
        this.c = null;
        if (ww9 != null) {
            ww9.b();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            zw9 zw9 = zw9.a;
            if (z && !this.f) {
                zw9.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!z && this.f) {
                zw9.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final void f() {
        boolean z = this.g;
        lr lrVar = this.b;
        boolean z2 = false;
        if (!(lrVar instanceof Collection) || !lrVar.isEmpty()) {
            Iterator it = lrVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((ww9) it.next()).a) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            e(z2);
        }
    }
}
