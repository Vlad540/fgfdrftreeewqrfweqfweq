package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: kz9  reason: default package */
public final class kz9 implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ int a;
    public final /* synthetic */ mz9 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ kz9(mz9 mz9, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = mz9;
        this.c = drawable;
        this.o = runnable;
        this.X = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                kz9.super.scheduleDrawable(this.c, this.o, this.X);
                return;
            default:
                kz9.super.scheduleDrawable(this.c, this.o, this.X);
                return;
        }
    }
}
