package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: nsf  reason: default package */
public final class nsf {
    public static final nsf b;
    public final lsf a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = ksf.q;
        } else {
            b = lsf.b;
        }
    }

    public nsf(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new ksf(this, windowInsets);
        } else {
            this.a = new isf(this, windowInsets);
        }
    }

    public static nsf f(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        nsf nsf = new nsf(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = eaf.a;
            nsf a2 = u9f.a(view);
            lsf lsf = nsf.a;
            lsf.q(a2);
            lsf.d(view.getRootView());
        }
        return nsf;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final WindowInsets e() {
        lsf lsf = this.a;
        if (lsf instanceof fsf) {
            return ((fsf) lsf).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsf)) {
            return false;
        }
        return Objects.equals(this.a, ((nsf) obj).a);
    }

    public final int hashCode() {
        lsf lsf = this.a;
        if (lsf == null) {
            return 0;
        }
        return lsf.hashCode();
    }

    public nsf() {
        this.a = new lsf(this);
    }
}
