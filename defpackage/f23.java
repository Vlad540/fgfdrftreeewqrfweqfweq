package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: f23  reason: default package */
public final class f23 implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ int a;
    public final /* synthetic */ h23 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ f23(h23 h23, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = h23;
        this.c = drawable;
        this.o = runnable;
        this.X = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                f23.super.scheduleDrawable(this.c, this.o, this.X);
                return;
            default:
                f23.super.scheduleDrawable(this.c, this.o, this.X);
                return;
        }
    }
}
