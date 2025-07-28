package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: g23  reason: default package */
public final class g23 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h23 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ g23(h23 h23, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = h23;
        this.c = drawable;
        this.o = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                g23.super.unscheduleDrawable(this.c, this.o);
                return;
            default:
                g23.super.unscheduleDrawable(this.c, this.o);
                return;
        }
    }
}
