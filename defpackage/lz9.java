package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: lz9  reason: default package */
public final class lz9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz9 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ lz9(mz9 mz9, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = mz9;
        this.c = drawable;
        this.o = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                lz9.super.unscheduleDrawable(this.c, this.o);
                return;
            default:
                lz9.super.unscheduleDrawable(this.c, this.o);
                return;
        }
    }
}
