package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: z13  reason: default package */
public final class z13 implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ int a;
    public final /* synthetic */ b23 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ z13(b23 b23, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = b23;
        this.c = drawable;
        this.o = runnable;
        this.X = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                z13.super.scheduleDrawable(this.c, this.o, this.X);
                return;
            default:
                z13.super.scheduleDrawable(this.c, this.o, this.X);
                return;
        }
    }
}
