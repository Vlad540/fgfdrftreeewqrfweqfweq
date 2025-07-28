package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: gsf  reason: default package */
public abstract class gsf extends fsf {
    public qy6 m = null;

    public gsf(nsf nsf, WindowInsets windowInsets) {
        super(nsf, windowInsets);
    }

    public nsf b() {
        return nsf.f((View) null, this.c.consumeStableInsets());
    }

    public nsf c() {
        return nsf.f((View) null, this.c.consumeSystemWindowInsets());
    }

    public final qy6 h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = qy6.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    public boolean m() {
        return this.c.isConsumed();
    }
}
