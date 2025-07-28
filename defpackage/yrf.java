package defpackage;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: yrf  reason: default package */
public final class yrf extends zrf {
    public final WindowInsetsAnimation e;

    public yrf(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.e = windowInsetsAnimation;
    }

    public final long a() {
        return hia.d(this.e);
    }

    public final float b() {
        return hia.a(this.e);
    }

    public final int c() {
        return hia.c(this.e);
    }

    public final void d(float f) {
        hia.v(this.e, f);
    }
}
