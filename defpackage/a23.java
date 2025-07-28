package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: a23  reason: default package */
public final class a23 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b23 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ a23(b23 b23, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = b23;
        this.c = drawable;
        this.o = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                a23.super.unscheduleDrawable(this.c, this.o);
                return;
            default:
                a23.super.unscheduleDrawable(this.c, this.o);
                return;
        }
    }
}
